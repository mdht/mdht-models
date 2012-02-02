/*******************************************************************************
 * Copyright (c) 2012 ramakrishnanr.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     ramakrishnanr - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.io.FileInputStream;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;

/**
 * @author ramakrishnanr
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("=========================");
		testDS("DS.sample.l3.conformances");
		System.out.println("=========================");
	}

	public static void testDS(String fileName) {
		StringBuffer sb = new StringBuffer();
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

}
