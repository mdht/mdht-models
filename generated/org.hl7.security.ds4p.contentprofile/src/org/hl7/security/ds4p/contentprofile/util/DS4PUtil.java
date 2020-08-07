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

import java.io.InputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResourceSet;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.internal.resource.CDAResource;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil.ValidationStatistics;

/**
 * @author seanmuir
 *
 */
@SuppressWarnings("restriction")
public class DS4PUtil {

	private static final String CONTENTPROFILE = "CONTENTPROFILE";

	public static void validateAsDS4P(InputStream is, final ValidationHandler handler) throws Exception {

		ValidationHandler filterHandler = new ValidationHandler() {

			@Override
			public void handleError(Diagnostic diagnostic) {
				if (diagnostic.getMessage() != null && diagnostic.getMessage().startsWith(CONTENTPROFILE)) {
					handler.handleError(diagnostic);
				}
			}

			@Override
			public void handleWarning(Diagnostic diagnostic) {
				if (diagnostic.getMessage() != null && diagnostic.getMessage().startsWith(CONTENTPROFILE)) {
					handler.handleWarning(diagnostic);
				}
			}

			@Override
			public void handleInfo(Diagnostic diagnostic) {
				if (diagnostic.getMessage() != null && diagnostic.getMessage().startsWith(CONTENTPROFILE)) {
					handler.handleInfo(diagnostic);
				}
			}

			@Override
			public boolean isCaptureValidationStatistics() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public ValidationStatistics getValidationStatistics() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setValidationStatistics(ValidationStatistics validationStatistics) {
				// TODO Auto-generated method stub

			}

		};

		DS4PUtil.load(is, filterHandler);
	}

	private static int uriCounter = 0;

	private static URI generateURI() {
		URI uri = URI.createURI("http:///dprovresource" + uriCounter + ".xml");
		uriCounter++;
		return uri;
	}

	private static ClinicalDocument load(InputStream in, final ValidationHandler handler) throws Exception {
		return CDAUtil.load(createResourceSet(), generateURI(), in, handler);
	}

	private static FleXMLResourceSet createResourceSet() {
		FleXMLResourceSet result = FleXMLResourceSet.Factory.INSTANCE.createResourceSet().setDefaultResourceFactory(
			CDAResource.Factory.INSTANCE);
		result.getXSITypeProviderRegistry().registerXSITypeProvider(CDAPackage.eINSTANCE, new SecurityXSIProvider());
		return result;
	}

}
