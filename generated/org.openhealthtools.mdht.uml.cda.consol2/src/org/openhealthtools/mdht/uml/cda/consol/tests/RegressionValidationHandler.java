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

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil.ValidationStatistics;

/**
 * @author seanmuir
 *
 */
public class RegressionValidationHandler implements ValidationHandler {

	BufferedWriter writer = null;

	static String cleanup(String message) {
		if (message != null && message.startsWith("The feature 'mixed' of")) {
			String m[] = message.split("http:");
			if (m.length > 1) {
				return "The feature 'mixed' of http:" + m[1];
			}
			return message;

		} else {
			return message;
		}

	}

	/**
	 * @param writer
	 */
	public RegressionValidationHandler(String outputFile) {
		super();
		Path path = Paths.get(outputFile);
		try {
			writer = Files.newBufferedWriter(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 *
	 *
	 * //Get the file reference
	 *
	 *
	 * //Use try-with-resource to get auto-closeable writer instance
	 * try (BufferedWriter writer = Files.newBufferedWriter(path))
	 * {
	 * writer.write("Hello World !!");
	 * }
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#handleError(org.eclipse.emf.common.util.Diagnostic)
	 */
	@Override
	public void handleError(Diagnostic diagnostic) {

		try {
			writer.write(cleanup(diagnostic.getMessage()));
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		;

		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#handleWarning(org.eclipse.emf.common.util.Diagnostic)
	 */
	@Override
	public void handleWarning(Diagnostic diagnostic) {
		try {
			writer.write(cleanup(diagnostic.getMessage()));
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#handleInfo(org.eclipse.emf.common.util.Diagnostic)
	 */
	@Override
	public void handleInfo(Diagnostic diagnostic) {
		try {
			writer.write(cleanup(diagnostic.getMessage()));
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#isCaptureValidationStatistics()
	 */
	@Override
	public boolean isCaptureValidationStatistics() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#getValidationStatistics()
	 */
	@Override
	public ValidationStatistics getValidationStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler#setValidationStatistics(org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationStatistics)
	 */
	@Override
	public void setValidationStatistics(ValidationStatistics validationStatistics) {
		// TODO Auto-generated method stub

	}

}
