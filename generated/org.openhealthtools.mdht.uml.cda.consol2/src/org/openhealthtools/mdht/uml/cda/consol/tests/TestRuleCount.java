/*******************************************************************************
 * Copyright (c) 2020 seanmuir.
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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;

import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

/**
 * @author seanmuir
 *
 */
public class TestRuleCount {

	// @Test
	// public void test() throws FileNotFoundException, Exception {
	//
	// String path = "samples/";
	// ConsolPackage.eINSTANCE.eClass();
	// ValidationResult result = new ValidationResult();
	// // try {
	// ClinicalDocument clinicalDocument = CDAUtil.load(
	// (new FileInputStream(path + "DischargeSummary_2014Edition_sample" + ".xml")), result);
	//
	// // ClinicalDocument clinicalDocument = ConsolFactory.eINSTANCE.createContinuityOfCareDocument2().init();
	//
	// // clinicalDocument.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());
	//
	// // clinicalDocument.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());
	//
	// ValidationHandler handler = new ValidationHandler() {
	//
	// ValidationStatistics validationStatistics;
	//
	// @Override
	// public void handleError(Diagnostic diagnostic) {
	// // System.out.println(diagnostic.getMessage());
	//
	// }
	//
	// @Override
	// public void handleWarning(Diagnostic diagnostic) {
	// // System.out.println(diagnostic.getMessage());
	//
	// }
	//
	// @Override
	// public void handleInfo(Diagnostic diagnostic) {
	// // System.out.println(diagnostic.getMessage());
	// }
	//
	// @Override
	// public boolean isCaptureValidationStatistics() {
	// return true;
	// }
	//
	// @Override
	// public ValidationStatistics getValidationStatistics() {
	// return this.validationStatistics;
	// }
	//
	// @Override
	// public void setValidationStatistics(ValidationStatistics validationStatistics) {
	// this.validationStatistics = validationStatistics;
	// }
	// };
	// ;
	// CDAUtil.validate(clinicalDocument, handler);
	//
	// if (handler.getValidationStatistics() != null) {
	// System.out.println(handler.getValidationStatistics().shallCount);
	// System.out.println(handler.getValidationStatistics().shouldCount);
	// System.out.println(handler.getValidationStatistics().mayCount);
	// for (String key : handler.getValidationStatistics().counterPer.keySet()) {
	// System.out.println(key + " : " + handler.getValidationStatistics().counterPer.get(key).count);
	//
	// }
	//
	// }
	//
	// }
	//
	@Test
	public void test2() throws FileNotFoundException, Exception {

		ConsolPackage.eINSTANCE.eClass();

		Consumer<? super Path> validate = new Consumer<Path>() {

			@Override
			public void accept(Path cdaFilePath) {
				System.out.println(cdaFilePath.getFileName());
				RegressionValidationHandler handler = new RegressionValidationHandler(
					"/Users/seanmuir/mdmi-workspace20200305/regression/src/test/resource/new/" +
							cdaFilePath.getFileName().toString().replace("xml", "txt"));
				try {
					CDAUtil.load(Files.newInputStream(cdaFilePath), handler);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Files.list(Paths.get("/Users/seanmuir/mdmi-workspace20200305/regression/src/test/resource/CCDA")).forEach(
			validate);

		// String path = "samples/";
		// ConsolPackage.eINSTANCE.eClass();
		// ValidationResult result = new ValidationResult();
		// try {

		// ClinicalDocument clinicalDocument = ConsolFactory.eINSTANCE.createContinuityOfCareDocument2().init();

		// clinicalDocument.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());

		// clinicalDocument.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());

		// CDAUtil.validate(clinicalDocument, handler);

	}

}
