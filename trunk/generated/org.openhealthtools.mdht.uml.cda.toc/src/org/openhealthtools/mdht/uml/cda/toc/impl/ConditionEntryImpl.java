/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.toc.AgeObservation;
import org.openhealthtools.mdht.uml.cda.toc.Comment;
import org.openhealthtools.mdht.uml.cda.toc.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.toc.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.Severity;
import org.openhealthtools.mdht.uml.cda.toc.TOCPackage;

import org.openhealthtools.mdht.uml.cda.toc.operations.ConditionEntryOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConditionEntryImpl extends ObservationImpl implements ConditionEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOCPackage.Literals.CONDITION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCommentInversionInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCommentInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasOnsetDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasOnsetDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasUnknownResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasUnknownResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntrySeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntrySeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryProblemStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryProblemStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHealthStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHealthStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return ConditionEntryOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return ConditionEntryOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation getProblemStatusObservation() {
		return ConditionEntryOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation getHealthStatusObservation() {
		return ConditionEntryOperations.getHealthStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		return ConditionEntryOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEntry init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ConditionEntryImpl
