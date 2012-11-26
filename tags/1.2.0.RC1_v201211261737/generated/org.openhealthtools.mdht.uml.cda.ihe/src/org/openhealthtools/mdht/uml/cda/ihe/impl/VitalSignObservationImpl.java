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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ResultObservationImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Sign Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignObservationImpl extends ResultObservationImpl implements VitalSignObservation {
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
		return IHEPackage.Literals.VITAL_SIGN_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSimpleObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SimpleObservationOperations.validateSimpleObservationTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSimpleObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SimpleObservationOperations.validateSimpleObservationId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSimpleObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SimpleObservationOperations.validateSimpleObservationStatusCode(this, diagnostics, context);
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
	public boolean validateVitalSignObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservationOperations.validateVitalSignObservationCode(this, diagnostics, context);
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
	@Override
	public VitalSignObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VitalSignObservationImpl
