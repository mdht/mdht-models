/*******************************************************************************
 * Copyright (c) 2018 Dan Brown.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil.ValidationStatistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;

/**
 * @author Dan Brown
 *
 */
public class RequiresParentTemplateIDTest {

	private static final boolean PRINT_TO_CONSOLE = true;

	private ClinicalDocument doc = null;

	private ValidationHandler handler;

	private List<String> errors;

	private static final String EXPECTED_ERROR_MESSAGE = "R1.1 templateId without an extension";

	@Before
	public void setUp() throws Exception {
		doc = CDAFactory.eINSTANCE.createClinicalDocument();
		errors = new ArrayList<>();

		handler = new ValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				String message = diagnostic.getMessage();
				if (PRINT_TO_CONSOLE) {
					System.out.println("Error: " + message);
				}
				errors.add(message);
			}

			@Override
			public void handleWarning(Diagnostic diagnostic) {
				if (PRINT_TO_CONSOLE) {
					System.out.println("Warning: " + diagnostic.getMessage());
				}
			}

			@Override
			public void handleInfo(Diagnostic diagnostic) {
				if (PRINT_TO_CONSOLE) {
					System.out.println("Info: " + diagnostic.getMessage());
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
	}

	@Test
	public void basicClinicalDocumentExpectPassTest() {
		printHeader("basicClinicalDocumentExpectPassTest", "", "");

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDAssessmentAndPlanSection2ExpectPassTest() {
		printHeader(
			"requiresParentTemplateIDAssessmentAndPlanSection2ExpectPassTest",
			"Has 2 IIs, root and extension and root only", "expect NO related error");

		doc.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDAssessmentAndPlanSection2ExpectFailTest() {
		printHeader(
			"requiresParentTemplateIDAssessmentAndPlanSection2ExpectFailTest",
			"Has 1 II, R2.1 root and extension only, No R1.1 root only II", "expect related error");

		AssessmentAndPlanSection2 aaps2 = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init();
		doc.addSection(aaps2);
		removetemplateIdWithoutExtensionFromSection(aaps2);
		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDAssessmentAndPlanSection2RootOnlyExpectPassTest() {
		printHeader(
			"requiresParentTemplateIDAssessmentAndPlanSection2RootOnlyExpectPassTest",
			"Has 1 II, R1.1 root only, No R2.1 root and extension II", "expect NO related error");

		AssessmentAndPlanSection2 aaps2 = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init();
		doc.addSection(aaps2);
		// remove II with extension
		Iterator<II> it = aaps2.getTemplateIds().iterator();
		while (it.hasNext()) {
			II ii = it.next();
			if (ii.getExtension() != null && !ii.getExtension().isEmpty()) {
				it.remove();
			}
		}
		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	public void r21TemplateWithoutR11VersionAndThereforeWithoutRequiresParentTemplateIdCheckedSoExpectPass() {
		printHeader(
			"r21TemplateWithoutR11VersionAndThereforeWithoutRequiresParentTemplateIdCheckedSoExpectPass", "", "");

		HealthConcernsSection hcs = ConsolFactory.eINSTANCE.createHealthConcernsSection();
		hcs.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.22.2.58", "2015-08-01"));
		doc.addSection(hcs);
		removetemplateIdWithoutExtensionFromSection(hcs);
		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	public void r11TemplateOnlyWithoutR21VersionExpectPass() {
		printHeader(
			"r11TemplateOnlyWithoutR21VersionExpectPass",
			"has r1.1 II only, to be backwards compatible this should be allowed", "expect no related error");

		InstructionsSection is = ConsolFactory.eINSTANCE.createInstructionsSection().init();
		doc.addSection(is);

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDPostprocedureDiagnosis2ExpectPassTest() {
		printHeader(
			"requiresParentTemplateIDPostprocedureDiagnosis2ExpectPassTest",
			"Has 2 IIs, root and extension and root only", "expect NO related error");

		doc = ConsolFactory.eINSTANCE.createProcedureNote2().init();
		doc.addSection(ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection2().init());
		doc.getSections().get(0).addAct(ConsolFactory.eINSTANCE.createPostprocedureDiagnosis2().init());

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDPostprocedureDiagnosis2ExpectFailTest() {
		printHeader(
			"requiresParentTemplateIDPostprocedureDiagnosis2ExpectFailTest",
			"Has 2 IIs, root and extension and root only", "expect NO related error");

		doc = ConsolFactory.eINSTANCE.createProcedureNote2().init();
		doc.addSection(ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection2().init());
		doc.getSections().get(0).addAct(ConsolFactory.eINSTANCE.createPostprocedureDiagnosis2().init());
		removetemplateIdWithoutExtensionFromAct(doc.getSections().get(0).getActs().get(0));

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDMedicationActivity2ExpectPassTest() {
		printHeader(
			"requiresParentTemplateIDMedicationActivity2ExpectPassTest", "Has 2 IIs, root and extension and root only",
			"expect NO related error");

		doc = ConsolFactory.eINSTANCE.createProcedureNote2().init();
		doc.addSection(ConsolFactory.eINSTANCE.createMedicationsAdministeredSection2().init());
		doc.getSections().get(0).addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDMedicationActivity2ExpectFailTest() {
		printHeader(
			"requiresParentTemplateIDMedicationActivity2ExpectFailTest", "Has 2 IIs, root and extension and root only",
			"expect NO related error");

		doc = ConsolFactory.eINSTANCE.createProcedureNote2().init();
		doc.addSection(ConsolFactory.eINSTANCE.createMedicationsAdministeredSection2().init());
		doc.getSections().get(0).addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
		removetemplateIdWithoutExtensionFromSubstanceAdministration(
			doc.getSections().get(0).getSubstanceAdministrations().get(0));

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(isErrorInErrors());
	}

	@Test
	public void requiresParentTemplateIDUSRH2ExpectPassTest() {
		printHeader(
			"requiresParentTemplateIDUSRH2ExpectPassTest", "USRH2: Has 2 IIs, root and extension and root only",
			"expect NO related error");

		doc = ConsolFactory.eINSTANCE.createContinuityOfCareDocument2().init();

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(!isErrorInErrors());
	}

	@Test
	@Ignore
	public void requiresParentTemplateIDUSRH2ExpectFailTest() {
		printHeader(
			"requiresParentTemplateIDUSRH2ExpectFailTest",
			"USRH2: Has 1 II, R2.1 root and extension only, No R1.1 root only II", "expect related error");

		doc = ConsolFactory.eINSTANCE.createContinuityOfCareDocument2().init();
		removetemplateIdWithoutExtensionFromDocument();

		printDocumentToConsol();

		validateAndDisplay();

		Assert.assertTrue(isErrorInErrors());
	}

	private void printHeader(String header, String explanation, String expectation) {
		if (PRINT_TO_CONSOLE) {
			System.out.println(header);
			System.out.println(explanation);
			System.out.println(expectation);
		}
	}

	private void validateAndDisplay() {
		CDAUtil.validate(doc, handler);
		if (PRINT_TO_CONSOLE) {
			System.out.println("Total *Errors count: " + errors.size());
			System.out.println();
		}
	}

	private void removetemplateIdWithoutExtension(Iterator<II> it) {
		while (it.hasNext()) {
			II ii = it.next();
			if (ii.getExtension() == null || ii.getExtension().isEmpty()) {
				it.remove();
			}
		}
	}

	private void removetemplateIdWithoutExtensionFromDocument() {
		Iterator<II> it = doc.getTemplateIds().iterator();
		removetemplateIdWithoutExtension(it);
	}

	private void removetemplateIdWithoutExtensionFromSection(Section section) {
		Iterator<II> it = section.getTemplateIds().iterator();
		removetemplateIdWithoutExtension(it);
	}

	private void removetemplateIdWithoutExtensionFromAct(Act act) {
		Iterator<II> it = act.getTemplateIds().iterator();
		removetemplateIdWithoutExtension(it);
	}

	private void removetemplateIdWithoutExtensionFromSubstanceAdministration(SubstanceAdministration sa) {
		Iterator<II> it = sa.getTemplateIds().iterator();
		removetemplateIdWithoutExtension(it);
	}

	private boolean isErrorInErrors() {
		return isErrorInErrors(EXPECTED_ERROR_MESSAGE);
	}

	private boolean isErrorInErrors(String message) {
		for (String s : errors) {
			if (s.contains(message)) {
				if (PRINT_TO_CONSOLE) {
					System.out.println("Found a match: " + s);
					System.out.println();
				}
				return true;
			}
		}
		return false;
	}

	public void printDocumentToConsol() {
		if (PRINT_TO_CONSOLE) {
			try {
				CDAUtil.save(doc, System.out);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}

}
