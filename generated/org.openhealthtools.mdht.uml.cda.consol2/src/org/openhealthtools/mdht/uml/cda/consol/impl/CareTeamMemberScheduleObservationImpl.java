/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberScheduleObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Member Schedule Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamMemberScheduleObservationImpl extends ObservationImpl
		implements CareTeamMemberScheduleObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamMemberScheduleObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationEDTELValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationEDTELValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationEDReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationEDReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamMemberScheduleObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamMemberScheduleObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CareTeamMemberScheduleObservationImpl
