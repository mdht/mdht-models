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
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class TestGeneralHeaderSample {
	public static void main(String[] args) throws Exception {

		ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();

		Section s = ConsolFactory.eINSTANCE.createAdvanceDirectivesSection().init();

		cd.addSection(s);

		CDAUtil.save(cd, new FileOutputStream("V1.xml"));

		cd = CDAFactory.eINSTANCE.createClinicalDocument();

		s = ConsolFactory.eINSTANCE.createAdvanceDirectivesSection2().init();

		cd.addSection(s);

		CDAUtil.save(cd, new FileOutputStream("V2.xml"));

		cd = CDAUtil.load(new FileInputStream("V1.xml"));

		for (Section section : cd.getAllSections()) {
			System.out.println(section.getClass().getName());
		}

		cd = CDAUtil.load(new FileInputStream("V2.xml"));

		for (Section section : cd.getAllSections()) {
			System.out.println(section.getClass().getName());
		}

		// // must load Consol package to validate those templates
		// ConsolPackage.eINSTANCE.eClass();
		//
		// // create a validation result object to collect diagnostics produced during validation
		// ValidationResult result = new ValidationResult();
		// CDAUtil.load(new FileInputStream("samples/GeneralHeader_sample.xml"), result);
		//
		// System.out.println("\n***** Sample validation results *****");
		// for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
		// System.out.println("ERROR: " + diagnostic.getMessage());
		// }
		// for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
		// System.out.println("WARNING: " + diagnostic.getMessage());
		// }
		// for (Diagnostic diagnostic : result.getInfoDiagnostics()) {
		// System.out.println("INFO: " + diagnostic.getMessage());
		// }
		//
		// System.out.println();
		// System.out.println("Number of Schema Validation Diagnostics: " + result.getSchemaValidationDiagnostics().size());
		// System.out.println("Number of EMF Resource Diagnostics: " + result.getEMFResourceDiagnostics().size());
		// System.out.println("Number of EMF Validation Diagnostics: " + result.getEMFValidationDiagnostics().size());
		// System.out.println("Number of Total Diagnostics: " + result.getAllDiagnostics().size());
		//
		// if (!result.hasErrors()) {
		// System.out.println("Document is valid");
		// } else {
		// System.out.println("Document is invalid");
		// }
	}
}
