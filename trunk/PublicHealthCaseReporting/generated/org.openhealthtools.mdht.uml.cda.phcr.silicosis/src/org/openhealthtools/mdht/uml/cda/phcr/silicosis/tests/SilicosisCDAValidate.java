/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

public class SilicosisCDAValidate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static SilicosisFactory SILICOSIS = SilicosisFactory.eINSTANCE;

	public static void main(String[] args) throws Exception {
		
		// 1. Register static package - required for proper deserialization
		//    we must tell EMF what packages we want to use for this document
		SilicosisPackage.eINSTANCE.eClass();
		
		// 2. Load document
		String filePath = "samples";
		File fileIn = new File(filePath, "SampleCDA.xml");
		InputStream inputStream = new FileInputStream(fileIn);
		
		// 3. Create a ValidationResult to collect validation diagnostics
		ValidationResult result = new ValidationResult();
		
		// 4. Call validate-on-load version of CDAUtil.load using result
		SilicosisCaseReport document = (SilicosisCaseReport) CDAUtil.load(inputStream, result);
		inputStream.close();
		
		// 5. Output document to console
		CDAUtil.save(document, System.out);
		System.out.println();
		System.out.println();
		
		// 6. Iterate over result to see what validation errors / warnings occurred - output to console
		for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
			System.out.println("ERROR: " + diagnostic.getMessage());
		}
		for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
			System.out.println("WARNING: " + diagnostic.getMessage());
		}
		
	}
	
}




