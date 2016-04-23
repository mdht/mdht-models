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
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HealthStatusObservationImpl extends ObservationImpl implements HealthStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HealthStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HealthStatusObservationImpl
