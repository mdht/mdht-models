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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryIncidentDescriptionSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injury Incident Description Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InjuryIncidentDescriptionSectionImpl extends SectionImpl implements InjuryIncidentDescriptionSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected InjuryIncidentDescriptionSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionInjuryCauseCategory(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionInjuryCauseCategory(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionInjuryMechanism(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionInjuryMechanism(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionInjuryRiskFactor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionInjuryRiskFactor(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionVehicleImpactArea(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionVehicleImpactArea(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionHeightOfFall(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionHeightOfFall(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInjuryIncidentDescriptionSectionDisasterType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionDisasterType(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InjuryCauseCategory getInjuryCauseCategory() {
		return InjuryIncidentDescriptionSectionOperations.getInjuryCauseCategory(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InjuryMechanism getInjuryMechanism() {
		return InjuryIncidentDescriptionSectionOperations.getInjuryMechanism(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public TraumaCenterCriteria getTraumaCenterCriteria() {
		return InjuryIncidentDescriptionSectionOperations.getTraumaCenterCriteria(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InjuryRiskFactor getInjuryRiskFactor() {
		return InjuryIncidentDescriptionSectionOperations.getInjuryRiskFactor(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public VehicleImpactArea getVehicleImpactArea() {
		return InjuryIncidentDescriptionSectionOperations.getVehicleImpactArea(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PatientLocationInVehicle getPatientLocationInVehicle() {
		return InjuryIncidentDescriptionSectionOperations.getPatientLocationInVehicle(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public VehicleOccupantSafetyEquipment getVehicleOccupantSafetyEquipment() {
		return InjuryIncidentDescriptionSectionOperations.getVehicleOccupantSafetyEquipment(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AirbagDeploymentStatus getAirbagDeploymentStatus() {
		return InjuryIncidentDescriptionSectionOperations.getAirbagDeploymentStatus(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HeightOfFall getHeightOfFall() {
		return InjuryIncidentDescriptionSectionOperations.getHeightOfFall(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DisasterType getDisasterType() {
		return InjuryIncidentDescriptionSectionOperations.getDisasterType(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InjuryIncidentDescriptionSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryIncidentDescriptionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InjuryIncidentDescriptionSectionImpl
