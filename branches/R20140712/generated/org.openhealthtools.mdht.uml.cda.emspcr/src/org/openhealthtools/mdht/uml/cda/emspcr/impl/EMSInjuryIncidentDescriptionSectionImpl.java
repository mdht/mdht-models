/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus;
import org.openhealthtools.mdht.uml.cda.emspcr.DisasterType;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSInjuryIncidentDescriptionSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Injury Incident Description Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSInjuryIncidentDescriptionSectionImpl extends SectionImpl implements EMSInjuryIncidentDescriptionSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSInjuryIncidentDescriptionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionHeightOfFall(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionHeightOfFall(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSInjuryIncidentDescriptionSectionDisasterType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionDisasterType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryCauseCategory getInjuryCauseCategory() {
		return EMSInjuryIncidentDescriptionSectionOperations.getInjuryCauseCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryMechanism getInjuryMechanism() {
		return EMSInjuryIncidentDescriptionSectionOperations.getInjuryMechanism(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraumaCenterCriteria getTraumaCenterCriteria() {
		return EMSInjuryIncidentDescriptionSectionOperations.getTraumaCenterCriteria(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryRiskFactor getInjuryRiskFactor() {
		return EMSInjuryIncidentDescriptionSectionOperations.getInjuryRiskFactor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleImpactArea getVehicleImpactArea() {
		return EMSInjuryIncidentDescriptionSectionOperations.getVehicleImpactArea(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLocationInVehicle getPatientLocationInVehicle() {
		return EMSInjuryIncidentDescriptionSectionOperations.getPatientLocationInVehicle(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleOccupantSafetyEquipment getVehicleOccupantSafetyEquipment() {
		return EMSInjuryIncidentDescriptionSectionOperations.getVehicleOccupantSafetyEquipment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirbagDeploymentStatus getAirbagDeploymentStatus() {
		return EMSInjuryIncidentDescriptionSectionOperations.getAirbagDeploymentStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeightOfFall getHeightOfFall() {
		return EMSInjuryIncidentDescriptionSectionOperations.getHeightOfFall(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisasterType getDisasterType() {
		return EMSInjuryIncidentDescriptionSectionOperations.getDisasterType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSInjuryIncidentDescriptionSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSInjuryIncidentDescriptionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSInjuryIncidentDescriptionSectionImpl
