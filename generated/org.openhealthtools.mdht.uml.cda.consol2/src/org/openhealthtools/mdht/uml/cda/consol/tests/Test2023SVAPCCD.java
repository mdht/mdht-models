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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.util.CDADiagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

public class Test2023SVAPCCD {
	public static void main(String[] args) {
		// System.out.println("=========================");
		// // testDS("EDM_AIS_Test_0_CCDA_CCD_3MB_FixedSchemaErrors");
		// // validateDS("EDM_AIS_Test_0_CCDA_CCD_3MB_FixedSchemaErrors");
		// validateDS("CDA_sample_calling_ext_URL");
		// System.out.println("=========================");
		//
		// validateDS("CDA_sample_calling_ext_URL_2");
		// System.out.println("=========================");

		validateDS("2023SVAPCCD");
		// testUSRealmAddressAndPatientName();
		System.out.println("=========================");
	}

	public static void validateDS(String fileName) {
		StringBuffer sb = new StringBuffer();
		String path = "samples/";
		ConsolPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();
		try {
			ClinicalDocument cd = CDAUtil.load((new FileInputStream(path + fileName + ".xml")), result);
			for (Diagnostic dq : result.getErrorDiagnostics()) {
				CDADiagnostic cdaDiagnosticq = new CDADiagnostic(dq);
				sb.append(
					"ERROR|" + cdaDiagnosticq.getMessage() + "|" + cdaDiagnosticq.getPath() + "|" +
							cdaDiagnosticq.getCode() + "|" + cdaDiagnosticq.getSource());
				sb.append("\n");
			}

			for (Section section : cd.getAllSections()) {
				System.out.println(section.getClass().getCanonicalName());

				for (Entry entry : section.getEntries()) {
					System.out.println(entry.getClass().getCanonicalName());

					if (entry.getOrganizer() != null) {
						System.out.println(entry.getOrganizer().getClass().getCanonicalName());
					}

					if (entry.getObservation() != null) {
						System.out.println(entry.getObservation().getClass().getCanonicalName());
					}

					// System.out.println(entry.getObservation());
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sb);
	}
}
