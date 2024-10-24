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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.PatientInstructionImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Medical Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientMedicalInstructionsImpl extends PatientInstructionImpl implements PatientMedicalInstructions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientMedicalInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientMedicalInstructions init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientMedicalInstructions init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PatientMedicalInstructionsImpl
