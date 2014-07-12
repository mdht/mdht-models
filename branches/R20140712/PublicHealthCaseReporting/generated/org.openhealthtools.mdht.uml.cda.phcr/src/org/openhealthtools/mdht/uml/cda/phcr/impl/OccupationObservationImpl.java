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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.operations.OccupationObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupation Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OccupationObservationImpl extends ObservationImpl implements OccupationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.OCCUPATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccupationObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OccupationObservationOperations.validateOccupationObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccupationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
	
} //OccupationObservationImpl
