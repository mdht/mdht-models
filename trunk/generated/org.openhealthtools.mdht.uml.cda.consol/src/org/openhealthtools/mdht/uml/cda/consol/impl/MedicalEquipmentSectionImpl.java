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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicalEquipmentSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical Equipment Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentSectionImpl extends SectionImpl implements MedicalEquipmentSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalEquipmentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSectionNonMedicinalSupplyActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionNonMedicinalSupplyActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities() {
		return MedicalEquipmentSectionOperations.getNonMedicinalSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //MedicalEquipmentSectionImpl
