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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PregnancyObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregnancy Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PregnancyObservationImpl extends ObservationImpl implements PregnancyObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PregnancyObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PREGNANCY_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePregnancyObservationEstimatedDateOfDelivery(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationEstimatedDateOfDelivery(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EstimatedDateOfDelivery getEstimatedDateOfDelivery() {
		return PregnancyObservationOperations.getEstimatedDateOfDelivery(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PregnancyObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PregnancyObservationImpl
