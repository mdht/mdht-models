/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Member Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamMemberActImpl extends ActImpl implements CareTeamMemberAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamMemberActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActCareTeamMemberScheduleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActCareTeamMemberScheduleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActNoteActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActNoteActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActParticipant2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActParticipant2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamMemberActIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamMemberActOperations.validateCareTeamMemberActIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeamMemberScheduleObservation> getCareTeamMemberScheduleObservations() {
		return CareTeamMemberActOperations.getCareTeamMemberScheduleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteActivity> getNoteActivities() {
		return CareTeamMemberActOperations.getNoteActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamMemberAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamMemberAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CareTeamMemberActImpl
