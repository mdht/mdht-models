/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberScheduleObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Member Schedule Observation V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamMemberScheduleObservationV2Impl extends ObservationImpl
		implements CareTeamMemberScheduleObservationV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamMemberScheduleObservationV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2Text(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2Text(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2StatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2EDTELValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2EDTELValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2EDReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2EDReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2IVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberScheduleObservationV2IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamMemberScheduleObservationV2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CareTeamMemberScheduleObservationV2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CareTeamMemberScheduleObservationV2Impl
