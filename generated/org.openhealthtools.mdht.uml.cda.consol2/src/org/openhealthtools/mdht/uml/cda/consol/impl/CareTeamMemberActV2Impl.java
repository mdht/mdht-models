/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberActV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Member Act V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamMemberActV2Impl extends ActImpl implements CareTeamMemberActV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamMemberActV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActV2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActV2Operations.validateCareTeamMemberActV2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeamMemberScheduleObservationV2> getCareTeamMemberScheduleObservationV2s() {
		return CareTeamMemberActV2Operations.getCareTeamMemberScheduleObservationV2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteActivity> getNoteActivities() {
		return CareTeamMemberActV2Operations.getNoteActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamMemberActV2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CareTeamMemberActV2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CareTeamMemberActV2Impl
