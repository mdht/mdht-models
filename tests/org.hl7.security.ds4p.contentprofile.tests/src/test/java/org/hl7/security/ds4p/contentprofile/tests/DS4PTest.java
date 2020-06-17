/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.hl7.security.ds4p.contentprofile.tests;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

public class DS4PTest {

	@Test
	public void TestTheBuild() throws Exception {
		// must load Consol package to validate those templates
		CONTENTPROFILEFactory.eINSTANCE.eClass();

		ConsolFactory.eINSTANCE.eClass();

		CONTENTPROFILEFactory.eINSTANCE.createPrivacySegmentedDocument().init();

		// create a validation result object to collect diagnostics produced during validation
		ValidationResult result = new ValidationResult();

		// ClinicalDocument clinicalDocument2 = CDAUtil.loadAs(
		// new FileInputStream("samples/NEWcdaPrivacySegmentedDocument.xml"),
		// CONTENTPROFILEPackage.eINSTANCE.getPrivacySegmentedDocument());

		// CDAUtil.loadAs(in, docTypeEClass);
		ClinicalDocument clinicalDocument = CDAUtil.loadAs(
			new FileInputStream("samples/reference/170.315_b8_ds4p_amb_sample2_v2.xml"),
			CONTENTPROFILEPackage.eINSTANCE.getPrivacySegmentedDocument());

		;
		CDAUtil.validate(clinicalDocument, result);

		System.out.println("\n***** Sample validation results *****");
		for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
			System.out.println("ERROR: " + diagnostic.getMessage());
		}
		for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
			System.out.println("WARNING: " + diagnostic.getMessage());
		}
		for (Diagnostic diagnostic : result.getInfoDiagnostics()) {
			System.out.println("INFO: " + diagnostic.getMessage());
		}

		System.out.println();
		System.out.println(
			"Number of Schema Validation Diagnostics: " + result.getSchemaValidationDiagnostics().size());
		System.out.println("Number of EMF Resource Diagnostics: " + result.getEMFResourceDiagnostics().size());
		System.out.println("Number of EMF Validation Diagnostics: " + result.getEMFValidationDiagnostics().size());
		System.out.println("Number of Total Diagnostics: " + result.getAllDiagnostics().size());

		if (!result.hasErrors()) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}
}
