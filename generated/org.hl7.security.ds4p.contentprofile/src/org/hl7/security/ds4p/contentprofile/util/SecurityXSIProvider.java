/*******************************************************************************
 * Copyright (c) 2016 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.hl7.security.ds4p.contentprofile.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.internal.resource.CDAXSITypeProvider;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * @author seanmuir
 *
 */
@SuppressWarnings("restriction")
public class SecurityXSIProvider extends CDAXSITypeProvider {
	
	private static class TemplateComparator implements  Comparator<EClass> {

		@Override
		public int compare(EClass templatedClass1, EClass templatedClass2) {
			if (templatedClass1.getEAllSuperTypes().contains(templatedClass2)) {
				return -1;
			}
			
			if (templatedClass2.getEAllSuperTypes().contains(templatedClass1)) {
				return 1;
			}
			
			
			// Check templates - if equal, check and compare versions - assume no version is earlier then version 
			String o1TemplateId = EcoreUtil.getAnnotation( templatedClass1, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_ROOT);
			
			String o2TemplateId = EcoreUtil.getAnnotation( templatedClass2, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_ROOT);
			
			if (!StringUtils.isEmpty(o1TemplateId) && o1TemplateId.equals(o2TemplateId)) {
				
				String o1TemplateVersion = EcoreUtil.getAnnotation(	templatedClass1, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_EXTENSION);
				
				String o2TemplateVersion = EcoreUtil.getAnnotation(	templatedClass1, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_EXTENSION);
				
				if (StringUtils.isEmpty(o1TemplateVersion) && !StringUtils.isEmpty(o2TemplateVersion)) {
					return 1;
				}
				
				if (!StringUtils.isEmpty(o1TemplateVersion) && StringUtils.isEmpty(o2TemplateVersion)) {
					return -1;
				}
				
				if (!StringUtils.isEmpty(o1TemplateVersion) && !StringUtils.isEmpty(o2TemplateVersion)) {
					Date d1 = null;
					Date d2 = null;
					try {
						d1 =DateFormat.getDateInstance().parse(o1TemplateVersion);
						d2 = DateFormat.getDateInstance().parse(o2TemplateVersion);
						return d1.compareTo(d2);
					} catch (ParseException e) {
						if (d1 == null) {
							return 1;
						}
						if (d2 == null) {
							return -1;
						}
					
					}
				}
						
			}
			
			
			// Lastly default to hierarchy depth - this is how currently done
			if (templatedClass1.getEAllSuperTypes().size() > templatedClass2.getEAllSuperTypes().size()) {
				return -1;
			} else if (templatedClass1.getEAllSuperTypes().size() < templatedClass2.getEAllSuperTypes().size()) {
				return 1;
			}
					
			return 0;
		}
		
	};
	
	private static final TemplateComparator templateComparator = new TemplateComparator();

	/* (non-Javadoc)
	 * @see org.eclipse.mdht.uml.cda.internal.resource.CDAXSITypeProvider#getXSIType(org.w3c.dom.Element)
	 */
	@Override
	public EClass getXSIType(Element element) {
		
 
		EClass result = null;
		NodeList nodeList = element.getChildNodes();

		EClass type = getType(element);
		
		List<EClass> possibles = new ArrayList<EClass>();

		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element e = (Element) nodeList.item(i);
				if ("templateId".equals(e.getLocalName())) {
					EClass eClass = getEClass(
						e.getAttributeNS(null, "root"), e.getAttributeNS(null, "extension"), element);
					if ((eClass != null) && !eClass.isAbstract() && conformsTo(eClass, type) ) {
						possibles.add(eClass);
					}
				}
			}
		}
		
		
	
		Collections.sort(possibles, templateComparator);
		

		for (EClass possible : possibles) {
			if (CONTENTPROFILEPackage.eINSTANCE.getNsURI().equals(possible.getEPackage().getNsURI())) {
				return possible;
			}
		}
			
 

		return result;
	 
	}


}
