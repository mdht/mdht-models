/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain.test;

import org.openhealthtools.mdht.uml.cda.toc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCFactory;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

public class TestDischargeSummary extends TestToCDocument {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		DischargeSummary dischargeSummaryImpl = ToCFactory.eINSTANCE.createDischargeSummary().init();
		IDischargeSummary dischargeSummary = IDomainFactory.eINSTANCE.createDischargeSummary();
		dischargeSummary.setCDAType(dischargeSummaryImpl);

		createHeader(dischargeSummary);

		createActiveProblems(dischargeSummary.withActiveProblems());
		createAllergies(dischargeSummary.withAllergies());
		createDischargeDiagnosis(dischargeSummary.withDischargeDiagnosis());
		createDischargeMeds(dischargeSummary.withDischargeMeds());
		createHospitalCourse(dischargeSummary.withHospitalCourse());
		createPlanOfCare(dischargeSummary.withPlanOfCare());

		System.out.println();
		save(dischargeSummary.getCDAType());

		System.out.println();
		System.out.println();
		validate(dischargeSummary.getCDAType());

	}

	public static void createHeader(IDischargeSummary doc) {
		doc.withId().setRoot("2.16.840.1.113883.3.72");

		II typeId = doc.withTypeId();
		typeId.setRoot("2.16.840.1.113883.1.3");
		typeId.setExtension("POCD_HD000040");

		doc.withEffectiveTime().setValue("20110804103022-0500");

		doc.withLanguageCode().setCode("en-US");

		doc.withTitle().addText("ToC RI Discharge Summary");

		CE confCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confCode);

		CE code = DatatypesFactory.eINSTANCE.createCE(
			"18842-5", "2.16.840.1.113883.6.1", "LOINC", "DISCHARGE SUMMARIZATION NOTE");
		doc.setCode(code);

		addPatient(doc.addRecordTarget());
		addOriginalAuthor(doc.addAuthor());
		addDocumentCustodian(doc.withCustodian());
	}

}
