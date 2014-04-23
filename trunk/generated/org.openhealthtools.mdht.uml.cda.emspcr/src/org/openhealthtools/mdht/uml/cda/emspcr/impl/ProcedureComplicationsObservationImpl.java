/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureComplicationsObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Complications Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureComplicationsObservationImpl extends ObservationImpl implements ProcedureComplicationsObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureComplicationsObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURE_COMPLICATIONS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureComplicationsObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureComplicationsObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureComplicationsObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureComplicationsObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureComplicationsObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureComplicationsObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureComplicationsObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureComplicationsObservationImpl
