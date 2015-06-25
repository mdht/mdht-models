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
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedEncounter2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Encounter2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedEncounter2Impl extends PlanOfCareActivityEncounterImpl implements PlannedEncounter2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedEncounter2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_ENCOUNTER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2Performer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2Performer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2ServiceDeliveryLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2ServiceDeliveryLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedEncounter2PriorityPreference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2PriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2Indication2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2Indication2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedEncounter2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedEncounter2PerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlannedEncounter2PerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceDeliveryLocation> getServiceDeliveryLocations() {
		return PlannedEncounter2Operations.getServiceDeliveryLocations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityPreference getPriorityPreference() {
		return PlannedEncounter2Operations.getPriorityPreference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getIndication2s() {
		return PlannedEncounter2Operations.getIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityEncounterTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlanOfCareActivityEncounterTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityEncounterMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedEncounter2Operations.validatePlanOfCareActivityEncounterMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedEncounter2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedEncounter2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedEncounter2Impl
