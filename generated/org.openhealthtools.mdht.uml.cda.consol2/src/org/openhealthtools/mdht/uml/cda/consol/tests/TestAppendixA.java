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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.util.CDADiagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.eclipse.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;

public class TestAppendixA {
	public static void main(String[] args) {
		System.out.println("=========================");
		// testDS("EDM_AIS_Test_0_CCDA_CCD_3MB_FixedSchemaErrors");
		// validateDS("EDM_AIS_Test_0_CCDA_CCD_3MB_FixedSchemaErrors");
		validateDS("CareTeamProvenanceAndNoteActivity");
		// testUSRealmAddressAndPatientName();
		System.out.println("=========================");
	}

	public static void testDS(String fileName) {
		new StringBuffer();
		String path = "samples/";
		ConsolPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();
		try {
			ClinicalDocument clinicalDocument = CDAUtil.load((new FileInputStream(path + fileName + ".xml")), result);
			System.out.println(clinicalDocument);
			System.out.println(clinicalDocument.getAllSections().size());
			for (Object j : clinicalDocument.getAllSections()) {
				System.out.println(j);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void validateDS(String fileName) {
		StringBuffer sb = new StringBuffer();
		String path = "samples/";
		ConsolPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();
		try {
			CDAUtil.load((new FileInputStream(path + fileName + ".xml")), result);
			for (Diagnostic dq : result.getErrorDiagnostics()) {
				CDADiagnostic cdaDiagnosticq = new CDADiagnostic(dq);
				sb.append(
					"ERROR|" + cdaDiagnosticq.getMessage() + "|" + cdaDiagnosticq.getPath() + "|" +
							cdaDiagnosticq.getCode() + "|" + cdaDiagnosticq.getSource());
				sb.append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sb);
	}

	/**
	 * For AD data types, 2 Address data types are being created. One with NullFlavor and the other with content.
	 * The error messages can be viewed by modifying the AD data.
	 */
	public static void testUSRealmAddressAndPatientName() {
		ContinuityOfCareDocument document = ConsolFactory.eINSTANCE.createContinuityOfCareDocument().init();
		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		document.addPatientRole(patientRole);

		AD addr = DatatypesFactory.eINSTANCE.createAD();
		addr.addStreetAddressLine("123 Mockingbird Lane");
		addr.addCity("Springfield");
		// addr.addState("IL");
		addr.addCountry("US");
		addr.addPostalCode("12345");
		addr.getUses().add(PostalAddressUse.H);
		patientRole.getAddrs().add(addr);

		Patient patient = CDAFactory.eINSTANCE.createPatient();
		patientRole.setPatient(patient);
		PN name = DatatypesFactory.eINSTANCE.createPN();
		// name.addGiven("John");
		name.addFamily("Doe");
		patient.getNames().add(name);

		// -- For NullFlavor types
		AD addr1 = DatatypesFactory.eINSTANCE.createAD();
		addr1.setNullFlavor(NullFlavor.NI);

		AssignedAuthor assgndAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		Author author = CDAFactory.eINSTANCE.createAuthor();
		author.setAssignedAuthor(assgndAuthor);
		assgndAuthor.getAddrs().add(addr1);
		document.getAuthors().add(author);

		ValidationResult result = new ValidationResult();
		CDAUtil.validate(document, result);

		System.out.println(result.getAllDiagnostics().size());

		for (Diagnostic diagnostic : result.getAllDiagnostics()) {
			CDADiagnostic cdaDiagnostic = new CDADiagnostic(diagnostic);
			EObject target = cdaDiagnostic.getTarget();
			if (target instanceof AD || target instanceof PN) {
				System.out.println(cdaDiagnostic.getMessage());
				System.out.println("target: " + target);
				System.out.println("");
			}
		}
	}
}
