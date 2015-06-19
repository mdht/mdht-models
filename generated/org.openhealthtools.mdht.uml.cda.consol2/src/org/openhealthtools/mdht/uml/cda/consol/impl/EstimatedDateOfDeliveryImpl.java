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
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery;
import org.openhealthtools.mdht.uml.cda.consol.operations.EstimatedDateOfDeliveryOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estimated Date Of Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EstimatedDateOfDeliveryImpl extends ObservationImpl implements EstimatedDateOfDelivery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstimatedDateOfDeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEstimatedDateOfDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEstimatedDateOfDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEstimatedDateOfDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEstimatedDateOfDeliveryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstimatedDateOfDeliveryStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEstimatedDateOfDeliveryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEstimatedDateOfDeliveryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EstimatedDateOfDelivery init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EstimatedDateOfDelivery init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EstimatedDateOfDeliveryImpl
