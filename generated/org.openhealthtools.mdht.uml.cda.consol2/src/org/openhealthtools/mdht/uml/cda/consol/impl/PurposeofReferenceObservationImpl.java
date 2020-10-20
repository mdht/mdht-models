/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PurposeofReferenceObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purposeof Reference Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PurposeofReferenceObservationImpl extends ObservationImpl implements PurposeofReferenceObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeofReferenceObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeofReferenceObservationCodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationCodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeofReferenceObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeofReferenceObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeofReferenceObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeofReferenceObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeofReferenceObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeofReferenceObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeofReferenceObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PurposeofReferenceObservationImpl
