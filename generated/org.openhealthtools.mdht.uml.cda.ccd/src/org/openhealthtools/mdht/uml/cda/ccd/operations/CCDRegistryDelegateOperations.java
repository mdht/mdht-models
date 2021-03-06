/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDRegistryDelegate;
import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Registry Delegate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.RegistryDelegate#getEClass(java.lang.String, java.lang.Object) <em>Get EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CCDRegistryDelegateOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDRegistryDelegateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EClass getEClass(CCDRegistryDelegate ccdRegistryDelegate, String templateId, Object context) {
		EClass result = null;
		if (context instanceof Element) {
			Element element = (Element) context;
			String localName = element.getLocalName();
			if ("2.16.840.1.113883.10.20.1.25".equals(templateId)) {
				// PlanOfCare
				if ("act".equals(localName)) {
					result = CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_ACT;
				} else if ("encounter".equals(localName)) {
					result = CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER;
				} else if ("observation".equals(localName)) {
					result = CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_OBSERVATION;
				} else if ("procedure".equals(localName)) {
					result = CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_PROCEDURE;
				} else if ("substanceAdministration".equals(localName)) {
					result = CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION;
				} else if ("supply".equals(localName)) {
					result = CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUPPLY;
				}
			} else if ("2.16.840.1.113883.10.20.1.29".equals(templateId)) {
				// ProcedureActivity
				if ("act".equals(localName)) {
					result = CCDPackage.Literals.PROCEDURE_ACTIVITY_ACT;
				} else if ("observation".equals(localName)) {
					result = CCDPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION;
				} else if ("procedure".equals(localName)) {
					result = CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE;
				}
			}
		}
		return result;
	}

} // CCDRegistryDelegateOperations
