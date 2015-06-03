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
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
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
	public boolean validateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProc(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerHasNonMedSupActXorProcActProc(
			this, diagnostics, context);
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
	public boolean validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerNonMedicinalSupplyActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentOrganizerProcedureActivityProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerProcedureActivityProcedure2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentOrganizerIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentOrganizerIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentOrganizerOperations.validateMedicalEquipmentOrganizerIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity2> getNonMedicinalSupplyActivity2s() {
		return MedicalEquipmentOrganizerOperations.getNonMedicinalSupplyActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityProcedure2> getProcedureActivityProcedure2s() {
		return MedicalEquipmentOrganizerOperations.getProcedureActivityProcedure2s(this);
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
