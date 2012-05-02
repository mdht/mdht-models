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
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PregnancyObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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
		return PhcrPackage.Literals.PREGNANCY_OBSERVATION;
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
	public boolean validatePregnancyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationCode(this, diagnostics, context);
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
	public boolean validatePregnancyObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationEstimatedDateOfDeliveryObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationEstimatedDateOfDeliveryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatedDateOfDeliveryObservation getEstimatedDateOfDeliveryObservation() {
		return PregnancyObservationOperations.getEstimatedDateOfDeliveryObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
	
} //PregnancyObservationImpl
