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

import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionMedicationsSectionEntriesOptionalOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Admission Medications Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionMedicationsSectionEntriesOptionalImpl extends SectionImpl implements
		HospitalAdmissionMedicationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionMedicationsSectionEntriesOptionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdmissionMedication> getAdmissionMedications() {
		return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.getAdmissionMedications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional init() {
    	CDAUtil.init(this);
    	return this;
	}
} // HospitalAdmissionMedicationsSectionEntriesOptionalImpl
