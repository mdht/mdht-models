/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamOrganizerV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Organizer V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamOrganizerV2Impl extends OrganizerImpl implements CareTeamOrganizerV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamOrganizerV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2CareTeamMember(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareTeamMember(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2CareLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2NoteActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2NoteActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2CareTeamTypeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareTeamTypeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2CareTeamMemberActV2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareTeamMemberActV2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerV2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteActivity> getNoteActivities() {
		return CareTeamOrganizerV2Operations.getNoteActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeamTypeObservation> getCareTeamTypeObservations() {
		return CareTeamOrganizerV2Operations.getCareTeamTypeObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeamMemberActV2> getCareTeamMemberActV2s() {
		return CareTeamOrganizerV2Operations.getCareTeamMemberActV2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizerV2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizerV2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CareTeamOrganizerV2Impl
