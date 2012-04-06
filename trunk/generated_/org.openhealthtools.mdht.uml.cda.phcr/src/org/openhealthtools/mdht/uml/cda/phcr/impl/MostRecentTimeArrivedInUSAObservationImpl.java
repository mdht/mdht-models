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
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.operations.MostRecentTimeArrivedInUSAObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Most Recent Time Arrived In USA Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MostRecentTimeArrivedInUSAObservationImpl extends ObservationImpl implements MostRecentTimeArrivedInUSAObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MostRecentTimeArrivedInUSAObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostRecentTimeArrivedInUSAObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostRecentTimeArrivedInUSAObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostRecentTimeArrivedInUSAObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostRecentTimeArrivedInUSAObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostRecentTimeArrivedInUSAObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostRecentTimeArrivedInUSAObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MostRecentTimeArrivedInUSAObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
	
	
} //MostRecentTimeArrivedInUSAObservationImpl
