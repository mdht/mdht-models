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
package org.openhealthtools.mdht.uml.cda.ccd;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Participant2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Awareness</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPatientAwareness()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientAwarenessTemplateId PatientAwarenessParticipantRoleId PatientAwarenessTypeCode PatientAwarenessAwarenessCode' templateId.root='2.16.840.1.113883.10.20.1.48' typeCode='SBJ'"
 * @generated
 */
public interface PatientAwareness extends Participant2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole.id->one(id : datatypes::II |
	 *   not id.root.oclIsUndefined())
	 * -- TODO compare with ClinicalDocument/recordTarget/patientRole/id
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participantRole.id->one(id : datatypes::II |\r\n  not id.root.oclIsUndefined())\r\n-- TODO compare with ClinicalDocument/recordTarget/patientRole/id'"
	 * @generated
	 */
	boolean validatePatientAwarenessParticipantRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.48')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.48\')'"
	 * @generated
	 */
	boolean validatePatientAwarenessTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::ParticipationType::SBJ
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::SBJ'"
	 * @generated
	 */
	boolean validatePatientAwarenessTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.awarenessCode.oclIsUndefined() or self.awarenessCode.isNullFlavorUndefined()) implies (not self.awarenessCode.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.awarenessCode.oclIsUndefined() or self.awarenessCode.isNullFlavorUndefined()) implies (not self.awarenessCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientAwarenessAwarenessCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAwareness init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAwareness init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PatientAwareness
