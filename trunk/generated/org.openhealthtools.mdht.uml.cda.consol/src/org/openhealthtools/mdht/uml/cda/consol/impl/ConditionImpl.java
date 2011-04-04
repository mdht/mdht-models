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
import org.openhealthtools.mdht.uml.cda.consol.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConditionOperations;
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
		return ConsolPackage.Literals.CONDITION;
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
	public boolean validateConditionEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEffectiveTimeHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionEffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEffectiveTimeHighProhibited(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionEffectiveTimeHighProhibited(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionHasTreatingProvider(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionHasTreatingProvider(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionHasProviderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.validateConditionHasProviderId(this, diagnostics, context);
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
	public Condition init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ConditionImpl
