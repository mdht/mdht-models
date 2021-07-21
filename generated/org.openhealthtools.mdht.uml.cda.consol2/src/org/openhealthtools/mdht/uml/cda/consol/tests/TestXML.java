/*******************************************************************************
 * Copyright (c) 2017 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.io.FileInputStream;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil.ValidationStatistics;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

/**
 * @author seanmuir
 *
 */
public class TestXML {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ConsolPackage.eINSTANCE.eClass();
		/*
		 * // * <raceCode code="2106-3" codeS ="Race and Ethnicity &#xA;                  - CDC" displayName="White"/>
		 * // *
		 * //
		 */
		// ConsolFactory.eINSTANCE.createContinuityOfCareDocument2().init();
		// ClinicalDocument cd = ConsolFactory.eINSTANCE.createContinuityOfCareDocument2().init(); // CDAFactory.eINSTANCE.createClinicalDocument();
		// cd.setCode(
		// DatatypesFactory.eINSTANCE.createCE(
		// "2106-3", "2.16.840.1.113883.6.238", "Race and Ethnicity &#xA; - CDC", "aaa"));
		//
		// RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
		// PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
		// Patient p = CDAFactory.eINSTANCE.createPatient();
		// p.setRaceCode(
		// DatatypesFactory.eINSTANCE.createCE(
		// "2106-3", "2.16.840.1.113883.6.238", "Race and Ethnicity &#xA; - CDC", "aaa"));
		// pr.setPatient(p);
		// rt.setPatientRole(pr);
		// cd.getRecordTargets().add(rt);
		//
		ValidationHandler handler = new ValidationHandler() {

			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println(diagnostic);

			}

			@Override
			public void handleWarning(Diagnostic diagnostic) {
				// TODO Auto-generated method stub

			}

			@Override
			public void handleInfo(Diagnostic diagnostic) {
				// TODO Auto-generated method stub

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
		// Race and Ethnicity & CDC
		// CDAUtil.save(cd, new FileOutputStream("aaaa3.xml"));
		ClinicalDocument cd2 = CDAUtil.load(
			new FileInputStream(
				"/Users/seanmuir/Workspaces/DS4PUpdate/TestURL/files/CDA_sample_calling_ext_URL_2.xml"));
		CDAUtil.validate(cd2, handler);

		System.out.println(StringEscapeUtils.escapeXml("Race and Ethnicity & CDC"));
		// CDAUtil.performSchemaValidation(cd2, handler);
		// CDAUtil.save(cd, System.out);
	}

}
