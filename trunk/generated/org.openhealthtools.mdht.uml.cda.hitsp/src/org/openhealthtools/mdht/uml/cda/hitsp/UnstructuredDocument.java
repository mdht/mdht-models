/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getUnstructuredDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='UnstructuredDocumentTemplateId UnstructuredDocumentOnePatientPerDocument' templateId.root='2.16.840.1.113883.3.88.11.62.1' constraints.validation.warning='UnstructuredDocumentNoStructuredData'"
 * @generated
 */
public interface UnstructuredDocument extends MedicalDocument, ScannedDocument {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.structuredBody.oclIsUndefined()'"
	* @generated
	*/
	boolean validateUnstructuredDocumentNoStructuredData(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(record : cda::RecordTarget | not record.patientRole.oclIsUndefined() and not record.patientRole.patient.oclIsUndefined())'"
	* @generated
	*/
	boolean validateUnstructuredDocumentOnePatientPerDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public UnstructuredDocument init();

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public UnstructuredDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // UnstructuredDocument
