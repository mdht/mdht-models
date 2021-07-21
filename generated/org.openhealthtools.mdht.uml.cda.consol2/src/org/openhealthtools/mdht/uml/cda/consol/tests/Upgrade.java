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

import static org.eclipse.mdht.uml.cda.util.CDAUtil.CDA_ANNOTATION_SOURCE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;

/**
 * @author seanmuir
 *
 */
public class Upgrade {

	@Test
	public void test() throws Exception {
		HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
		CDAUtil.saveSnippet(hospitalAdmissionDiagnosisSection, System.out);
		EAnnotation annotation = ConsolPackage.eINSTANCE.getAdmissionDiagnosisSection2().getEAnnotation(
			CDA_ANNOTATION_SOURCE);
		CDAUtil.init(hospitalAdmissionDiagnosisSection, annotation.getDetails().map());
		CDAUtil.saveSnippet(hospitalAdmissionDiagnosisSection, System.out);
	}

	@Test
	public void test2() throws FileNotFoundException, Exception {
		ValidationResult result = new ValidationResult();
		ClinicalDocument clinicalDocument = CDAUtil.load(new FileInputStream("SampleCDADocument.xml"), result);

		TreeIterator<EObject> all = clinicalDocument.eAllContents();

		while (all.hasNext()) {
			EObject element = all.next();
			System.out.println(element.eClass().getName());
			// Based on the current eclass of the element - determine what if any update is needed
			EAnnotation annotation = ConsolPackage.eINSTANCE.getAdmissionDiagnosisSection2().getEAnnotation(
				CDA_ANNOTATION_SOURCE);
			CDAUtil.init(element, annotation.getDetails().map());

		}

		CDAUtil.save(clinicalDocument, System.out);

	}
}
