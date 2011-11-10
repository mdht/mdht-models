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
import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Severity;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyIntoleranceOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceImpl extends ObservationImpl implements AllergyIntolerance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_INTOLERANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceContainsPatientAwareness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceContainsPatientAwareness(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCommentInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceCommentInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCodeCodeSystemRequired(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceCodeCodeSystemRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceDisplayNameCodeName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceDisplayNameCodeName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAllergySubstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAllergySubstanceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstanceTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAllergySubstanceParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstanceParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAllergySubstancePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstancePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAllergySubstancePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstancePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerancePlayingEntityCodeReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntolerancePlayingEntityCodeReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceProblemEntryReactionObservationContainer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemEntryReactionObservationContainer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceHealthStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceHealthStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemEntryReactionObservationContainer> getProblemEntryReactionObservationContainers() {
		return AllergyIntoleranceOperations.getProblemEntryReactionObservationContainers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return AllergyIntoleranceOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation getProblemStatusObservation() {
		return AllergyIntoleranceOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		return AllergyIntoleranceOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return AllergyIntoleranceOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation getHealthStatusObservation() {
		return AllergyIntoleranceOperations.getHealthStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance init() {
		CDAUtil.init(this);
		return this;
	}
} // AllergyIntoleranceImpl
