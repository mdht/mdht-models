/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.Condition;
import org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.operations.ConditionOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends ActImpl implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APITestPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryRelationshipRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionEntryRelationshipRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionSubjectOfTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionSubjectOfTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionContainsProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionContainsProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionContainsAlertObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionContainsAlertObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionEffectiveTimeLowHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionHasProviderTreatmentTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionHasProviderTreatmentTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionCodeNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEpisodeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionEpisodeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionTreatingProvider(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionTreatingProvider(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation getEpisodeObservation() {
		return ConditionOperations.getEpisodeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionEntry> getConditionEntries() {
		return ConditionOperations.getConditionEntries(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedEntity getTreatingProvider() {
		return ConditionOperations.getTreatingProvider(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition init() {
		CDAUtil.init(this);
		return this;
	}
} // ConditionImpl
