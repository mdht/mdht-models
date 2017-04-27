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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.util.BasicValidationHandler;
import org.eclipse.mdht.uml.cda.util.CDAUtil;

public class Main {
	public static void main(String[] args) throws Exception {
		// ContinuityOfCareDocument doc = CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();
		//
		// Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
		// AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		// informant.setAssignedEntity(assignedEntity);
		// doc.getInformants().add(informant);
		//
		// PurposeSection purposeSection = CCDFactory.eINSTANCE.createPurposeSection().init();
		// doc.addSection(purposeSection);
		// PurposeActivity purposeActivity = CCDFactory.eINSTANCE.createPurposeActivity().init();
		// purposeSection.addAct(purposeActivity);
		// SubstanceAdministration purposeReason = CDAFactory.eINSTANCE.createSubstanceAdministration();
		// purposeActivity.addSubstanceAdministration(purposeReason);
		// // should produce validation error for incorrect reason type
		// // Organizer purposeReason = CDAFactory.eINSTANCE.createOrganizer();
		// // purposeActivity.addOrganizer(purposeReason);
		// purposeActivity.getEntryRelationships().get(0).setTypeCode(x_ActRelationshipEntryRelationship.RSON);
		//
		// ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();
		// ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();
		// ProblemStatusObservation problemStatus = CCDFactory.eINSTANCE.createProblemStatusObservation().init();
		// ProblemHealthStatusObservation problemHealthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();
		// EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();
		//
		// ProblemSection problemSection = CCDFactory.eINSTANCE.createProblemSection().init();
		// doc.addSection(problemSection);
		// problemSection.addAct(problemAct);
		// problemAct.addObservation(problemObservation);
		//
		// problemSection.addObservation(problemStatus);
		// problemSection.addObservation(problemHealthStatus);
		// problemSection.addObservation(episodeObservation);
		//
		// ResultsSection resultsSection = CCDFactory.eINSTANCE.createResultsSection().init();
		// doc.addSection(resultsSection);
		// ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer().init();
		// resultsSection.addOrganizer(resultOrganizer);
		// ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation().init();
		// resultOrganizer.addObservation(resultObservation);
		//
		// System.out.println("***** Generate CCD *****");
		// CDAUtil.save(doc, System.out);
		//
		// System.out.println("\n\n***** Validate generated CCD *****");
		// validate(doc);
		//
		// System.out.println("\n***** Validate sample CCD *****");
		// ValidationResult result = new ValidationResult();
		// CDAUtil.load(new FileInputStream("samples/SampleCCDDocument.xml"), result);
		// for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
		// System.out.println("ERROR: " + diagnostic.getMessage());
		// }
		// for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
		// System.out.println("WARNING: " + diagnostic.getMessage());
		// }
	}

	private static void validate(ClinicalDocument clinicalDocument) throws Exception {
		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}

			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println("WARNING: " + diagnostic.getMessage());
			}
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
