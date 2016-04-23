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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.QuantityMeasurementObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Measurement Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuantityMeasurementObservationImpl extends ObservationImpl implements QuantityMeasurementObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityMeasurementObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.QUANTITY_MEASUREMENT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationCodeCodeSystemDIR(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCodeCodeSystemDIR(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationCodeCodeSystemDICOM(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCodeCodeSystemDICOM(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityMeasurementObservationSOPInstanceObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationSOPInstanceObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SOPInstanceObservation> getSOPInstanceObservations() {
		return QuantityMeasurementObservationOperations.getSOPInstanceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityMeasurementObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuantityMeasurementObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuantityMeasurementObservationImpl
