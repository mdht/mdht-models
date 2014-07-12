/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;

import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedImmunizationActivityOperations;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Immunization Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedImmunizationActivityImpl extends SubstanceAdministrationImpl implements PlannedImmunizationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedImmunizationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityMoodCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityRepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityRepeatNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityRouteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityRouteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityRouteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityApproachSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityApproachSiteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityApproachSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityDoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityDoseQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityPatientPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityPatientPriorityPreference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityAuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityProviderPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityProviderPriorityPreference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedImmunizationActivityIVLPQUnit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityIVLPQUnit(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientPriorityPreference> getPatientPriorityPreferences() {
		return PlannedImmunizationActivityOperations.getPatientPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProviderPriorityPreference> getProviderPriorityPreferences() {
		return PlannedImmunizationActivityOperations.getProviderPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedImmunizationActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedImmunizationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedImmunizationActivityImpl
