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
import org.openhealthtools.mdht.uml.cda.phcr.operations.EstimatedDateOfDeliveryObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estimated Date Of Delivery Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EstimatedDateOfDeliveryObservationImpl extends ObservationImpl implements EstimatedDateOfDeliveryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstimatedDateOfDeliveryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatedDateOfDeliveryObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //EstimatedDateOfDeliveryObservationImpl
