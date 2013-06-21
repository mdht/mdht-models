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
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.util.CDADiagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;

public class TestPatientCareReport {
	public static void main(String[] args) {
		System.out.println("=========================");
		// testDS("DS.sample.l3.conformances");
		// validateDS("DischargeSummary_sample");
		// validateDS("DischargeSummary_2014Edition_sample");
		testUSRealmAddressAndPatientName();
		System.out.println("=========================");
	}

	public static void testUSRealmAddressAndPatientName() {

		PatientCareReport document = EmspcrFactory.eINSTANCE.createPatientCareReport().init();
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

		// Add a few empty sections for illustration purpose
		document.addSection(EmspcrFactory.eINSTANCE.createBillingSection().init());

		document.addSection(EmspcrFactory.eINSTANCE.createTimesSection().init());

		ValidationResult result = new ValidationResult();
		CDAUtil.validate(document, result);

		System.out.println(result.getAllDiagnostics().size());

		for (Diagnostic diagnostic : result.getAllDiagnostics()) {
			CDADiagnostic cdaDiagnostic = new CDADiagnostic(diagnostic);
			EObject target = cdaDiagnostic.getTarget();
			System.out.println(cdaDiagnostic.getMessage());
			System.out.println("target: " + target);
			System.out.println("");
		}
	}
}
