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
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicalEquipmentOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical Equipment Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentOrganizerImpl extends OrganizerImpl implements MedicalEquipmentOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalEquipmentOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICAL_EQUIPMENT_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalEquipmentOrganizerProcedureActivityProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerProcedureActivityProcedure(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities() {
		return MedicalEquipmentOrganizerOperations.getNonMedicinalSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureActivityProcedure> getProcedureActivityProcedures() {
		return MedicalEquipmentOrganizerOperations.getProcedureActivityProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalEquipmentOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalEquipmentOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicalEquipmentOrganizerImpl
