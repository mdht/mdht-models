/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4;

import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Observation V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResultObservationV4Impl extends ResultObservation2Impl implements ResultObservationV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultObservationV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RESULT_OBSERVATION_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservationV4Specimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservationV4Operations.validateResultObservationV4Specimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservationV4Operations.validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservationV4Operations.validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservationV4Operations.validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservationV4SpecimenSpecimenRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservationV4Operations.validateResultObservationV4SpecimenSpecimenRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservationV4Operations.validateResultObservation2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultObservationV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultObservationV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ResultObservationV4Impl
