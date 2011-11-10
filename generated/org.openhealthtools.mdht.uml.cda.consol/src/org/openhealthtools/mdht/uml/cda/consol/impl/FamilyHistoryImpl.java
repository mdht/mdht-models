/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryOperations;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryImpl extends OrganizerImpl implements FamilyHistory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FAMILY_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryRelatedSubjectCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryRelatedSubjectCodeValueSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasFamilyHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasFamilyHistoryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasSubject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasSubjectPatientRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasSubjectPatientRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryRelationshipValueCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryRelationshipValueCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasRelatedSubjectCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasRelatedSubjectCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasRelatedSubjectSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasRelatedSubjectSubject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryRelatedSubjectBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryRelatedSubjectBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasParticipantParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasParticipantRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasParticipantRoleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasParticipantRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasParticipantRolePlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryHasFamilyName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryHasFamilyName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryFamilyMemberCondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryFamilyMemberCondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryProblemStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryFamilyHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOperations.validateFamilyHistoryFamilyHistoryObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemStatusObservation> getProblemStatusObservations() {
		return FamilyHistoryOperations.getProblemStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyHistoryObservation> getFamilyHistoryObservations() {
		return FamilyHistoryOperations.getFamilyHistoryObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistory init() {
		CDAUtil.init(this);
		return this;
	}
} // FamilyHistoryImpl
