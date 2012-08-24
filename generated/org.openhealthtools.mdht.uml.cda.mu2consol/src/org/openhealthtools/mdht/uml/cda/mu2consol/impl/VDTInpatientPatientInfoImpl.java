/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTInpatientPatientInfoOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDT Inpatient Patient Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VDTInpatientPatientInfoImpl extends GeneralHeaderConstraintsImpl implements VDTInpatientPatientInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDTInpatientPatientInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoResponsibleParty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoMedicationList(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoMedicationList(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfoProceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return VDTInpatientPatientInfoOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return VDTInpatientPatientInfoOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return VDTInpatientPatientInfoOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional() {
		return VDTInpatientPatientInfoOperations.getHospitalAdmissionMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection() {
		return VDTInpatientPatientInfoOperations.getHospitalDischargeMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection getAllergiesSection() {
		return VDTInpatientPatientInfoOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional() {
		return VDTInpatientPatientInfoOperations.getAllergiesSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return VDTInpatientPatientInfoOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return VDTInpatientPatientInfoOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional() {
		return VDTInpatientPatientInfoOperations.getVitalSignsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return VDTInpatientPatientInfoOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return VDTInpatientPatientInfoOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VDTInpatientPatientInfo init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public VDTInpatientPatientInfo init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //VDTInpatientPatientInfoImpl
