/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamOrganizerImpl extends OrganizerImpl implements CareTeamOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAM_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerCareTeamMember(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerCareTeamMember(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerCareLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerCareLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerNoteActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerNoteActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerCareTeamTypeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerCareTeamTypeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerCareTeamMemberAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerCareTeamMemberAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamOrganizerIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamOrganizerOperations.validateCareTeamOrganizerIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteActivity getNoteActivity() {
		return CareTeamOrganizerOperations.getNoteActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamTypeObservation getCareTeamTypeObservation() {
		return CareTeamOrganizerOperations.getCareTeamTypeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamMemberAct getCareTeamMemberAct() {
		return CareTeamOrganizerOperations.getCareTeamMemberAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CareTeamOrganizerImpl
