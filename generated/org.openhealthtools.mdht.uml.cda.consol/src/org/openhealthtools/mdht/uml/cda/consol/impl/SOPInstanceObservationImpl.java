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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SOPInstanceObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOP Instance Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SOPInstanceObservationImpl extends ObservationImpl implements SOPInstanceObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOPInstanceObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationEffectiveTimeHasValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeHasValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationEffectiveTimeNoLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeNoLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationEffectiveTimeNoHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeNoHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationTextMediaType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationTextMediaType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationSOPInstanceObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationSOPInstanceObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationPurposeofReferenceObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationPurposeofReferenceObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationReferencedFramesObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationReferencedFramesObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SOPInstanceObservation> getSOPInstanceObservations() {
		return SOPInstanceObservationOperations.getSOPInstanceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurposeofReferenceObservation> getPurposeofReferenceObservations() {
		return SOPInstanceObservationOperations.getPurposeofReferenceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferencedFramesObservation> getReferencedFramesObservations() {
		return SOPInstanceObservationOperations.getReferencedFramesObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOPInstanceObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public SOPInstanceObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SOPInstanceObservationImpl
