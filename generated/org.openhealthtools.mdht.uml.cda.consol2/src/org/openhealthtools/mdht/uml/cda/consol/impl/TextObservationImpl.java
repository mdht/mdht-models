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
import org.openhealthtools.mdht.uml.cda.consol.TextObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.TextObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextObservationImpl extends ObservationImpl implements TextObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.TEXT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationSOPInstanceObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationSOPInstanceObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextObservationQuantityMeasurementObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextObservationOperations.validateTextObservationQuantityMeasurementObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SOPInstanceObservation> getSOPInstanceObservations() {
		return TextObservationOperations.getSOPInstanceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityMeasurementObservation> getQuantityMeasurementObservations() {
		return TextObservationOperations.getQuantityMeasurementObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TextObservationImpl
