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
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Sign Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VitalSignObservationImpl extends ObservationImpl implements VitalSignObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.VITAL_SIGN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VitalSignObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // VitalSignObservationImpl
