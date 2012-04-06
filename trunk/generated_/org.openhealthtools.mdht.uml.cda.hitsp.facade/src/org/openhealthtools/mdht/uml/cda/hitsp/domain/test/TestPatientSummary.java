/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain.test;

import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class TestPatientSummary {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		PatientSummary patientSummaryImpl = HITSPFactory.eINSTANCE.createPatientSummary().init();
		IPatientSummary patientSummary = IDomainFactory.eINSTANCE.createPatientSummary();
		patientSummary.setCDAType(patientSummaryImpl);

		IProblemListSection problemListSection = patientSummary.withProblemListSection();
		ICondition condition = problemListSection.addCondition();
		condition.addId().setRoot(UUID.randomUUID().toString());
		condition.withEffectiveTime().setValue(new Date().toString());

		IProblemEntry problemEntry = condition.addProblemEntry();
		problemEntry.addId().setRoot(UUID.randomUUID().toString());

		problemEntry.withProblemStatus().withValue().setCode("123123-7");
		problemEntry.addComment().withAuthor();

		problemEntry.withHealthStatusObservation().withValue().setCode("435345-9");

		problemEntry.withAgeObservation();
		// problemEntry.withCauseOfDeath().withTimeOfDeath().setValue(new Date().toString());
		problemEntry.withCauseOfDeath();

		IEpisodeObservation episodeObservation = condition.withEpisodeObservation();
		episodeObservation.withCode().setCode("9999-2");
		episodeObservation.withValue().setCode("7623487");

		save(patientSummary.getCDAType());

		// test toCDAType()
		System.out.println();
		System.out.println();
		System.out.println("ProblemSection code = " + problemListSection.getCDAType().getCode());
		System.out.println("ProblemEntry classCode = " + problemEntry.getCDAType().getClassCode());
		System.out.println("ProblemEntry statusCode = " + problemEntry.getCDAType().getStatusCode().getCode());

		validate(patientSummary.getCDAType());

	}

	public static void save(ClinicalDocument clinicalDocument) throws Exception {
		CDAUtil.save(clinicalDocument, System.out);
	}

	public static void validate(ClinicalDocument clinicalDocument) throws Exception {
		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
			// @Override
			// public void handleWarning(Diagnostic diagnostic) {
			// System.out.println("WARNING: " + diagnostic.getMessage());
			// }
			// @Override
			// public void handleInfo(Diagnostic diagnostic) {
			// System.out.println("INFO: " + diagnostic.getMessage());
			// }
		});

		if (valid) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}

}
