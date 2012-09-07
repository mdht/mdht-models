/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rama Ramakrishnan (Agilex) - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.util.CDADiagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// System.out.println("======testSOCR=========");
		// testSOCR("socr_sample");
		// testSOCR("socr_sample_withDSTemplateId");
		// System.out.println("=====testSOCR==========");

		// System.out.println("======testAsSOCR=========");
		// testAsSOCR("socr_sample");
//		testAsSOCR("socr_sample_withDSTemplateId");
		// System.out.println("=====testAsSOCR==========");

		// System.out.println("======validateSOCR=========");
		// validateSOCR("socr_sample");
		// System.out.println("======validateSOCR=========");

		// System.out.println("======validateDocument=========");
		// validateDocument("socr_sample", "SummaryOfCareRecord");
		// validateDocument("DischargeSummary_2014Edition_sample",
		// "SummaryOfCareRecord");
//		validateDocument("DischargeSummary_2014Edition_sample",
//				"ClinicalOfficeVisitSummary");
//		validateDocument("socr_sample_withDSTemplateId",
//		"SummaryOfCareRecord");
//		validateDocument("socr_sample_withDSTemplateId",
//		"TransitionsOfCareInpatientSummary");
//		validateDocument("socr_sample_withDSTemplateId",
//		"VDTAmbulatorySummary");
		validateDocument("socr_sample_withDSTemplateId",
		"VDTInpatientSummary");
//		validateDocument("cdabook.pdf",
//		"TransitionsOfCareAmbulatorySummary");
		// validateDocument("socr_sample","ClinicalOfficeVisitSummary");
		// validateDocument("socr_sample", "VDTInpatientPatientInfo");

		// System.out.println("======validateDocument=========");
	}

	public static void testSOCR(String fileName) {
		new StringBuffer();
		String path = "samples/";
		Mu2consolPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();
		try {
			ClinicalDocument clinicalDocument = CDAUtil.load(
					(new FileInputStream(path + fileName + ".xml")), result);
			System.out.println(clinicalDocument);
			System.out.println(clinicalDocument.getAllSections().size());
			for (Object j : clinicalDocument.getAllSections()) {
				System.out.println(j);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testAsSOCR(String fileName) {
		new StringBuffer();
		String path = "samples/";
		Mu2consolPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();
		try {
			ClinicalDocument cDoc = CDAUtil.loadAs(new FileInputStream(path
					+ fileName + ".xml"),
					Mu2consolPackage.eINSTANCE.getSummaryOfCareRecord(),
					// Mu2consolPackage.eINSTANCE.getClinicalOfficeVisitSummary(),
					result);

			System.out.println(cDoc);
			System.out.println(cDoc.getAllSections().size());
			for (Object j : cDoc.getAllSections()) {
				System.out.println(j);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Validate a document as a specific type.
	 * 
	 * @param fileName
	 * @param asDocumentType
	 */
	public static void validateDocument(String fileName, String asDocumentType) {
		StringBuffer sb = new StringBuffer();
		String path = "samples/";
		Mu2consolPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();

		EClass docType = null;

		if (asDocumentType.equalsIgnoreCase("SummaryOfCareRecord")) {
			docType = Mu2consolPackage.eINSTANCE.getSummaryOfCareRecord();
		} else if (asDocumentType
				.equalsIgnoreCase("ClinicalOfficeVisitSummary")) {
			docType = Mu2consolPackage.eINSTANCE
					.getClinicalOfficeVisitSummary();
		} else if (asDocumentType.equalsIgnoreCase("TransitionsOfCareAmbulatorySummary")) {
			docType = Mu2consolPackage.eINSTANCE.getTransitionOfCareAmbulatorySummary();
		}else if (asDocumentType.equalsIgnoreCase("TransitionsOfCareInpatientSummary")) {
			docType = Mu2consolPackage.eINSTANCE.getTransitionOfCareInpatientSummary();
		}else if (asDocumentType.equalsIgnoreCase("VDTAmbulatorySummary")) {
			docType = Mu2consolPackage.eINSTANCE.getVDTAmbulatorySummary();
		}else if (asDocumentType.equalsIgnoreCase("VDTInpatientSummary")) {
			docType = Mu2consolPackage.eINSTANCE.getVDTInpatientSummary();
		}

		try {
			CDAUtil.loadAs((new FileInputStream(path + fileName + ".xml")),
					docType, result);
			for (Diagnostic dq : result.getErrorDiagnostics()) {
				CDADiagnostic cdaDiagnosticq = new CDADiagnostic(dq);
				sb.append("ERROR|" + cdaDiagnosticq.getMessage() + "|"
						+ cdaDiagnosticq.getPath() + "|"
						+ cdaDiagnosticq.getCode() + "|"
						+ cdaDiagnosticq.getSource());
				sb.append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sb);
	}

	public static void validateSOCR(String fileName) {
		StringBuffer sb = new StringBuffer();
		String path = "samples/";
		Mu2consolPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();
		try {
			CDAUtil.load((new FileInputStream(path + fileName + ".xml")),
					result);
			for (Diagnostic dq : result.getErrorDiagnostics()) {
				CDADiagnostic cdaDiagnosticq = new CDADiagnostic(dq);
				sb.append("ERROR|" + cdaDiagnosticq.getMessage() + "|"
						+ cdaDiagnosticq.getPath() + "|"
						+ cdaDiagnosticq.getCode() + "|"
						+ cdaDiagnosticq.getSource());
				sb.append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sb);
	}

}
