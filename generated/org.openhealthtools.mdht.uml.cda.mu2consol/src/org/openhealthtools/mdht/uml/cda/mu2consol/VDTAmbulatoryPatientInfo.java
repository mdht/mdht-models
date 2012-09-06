/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>VDT Ambulatory Patient Info</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getVDTAmbulatoryPatientInfo()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VDTAmbulatoryPatientInfoMedicationList VDTAmbulatoryPatientInfoMedicationAllergy VDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry VDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry VDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry VDTAmbulatoryPatientInfoReasonForHospitalization VDTAmbulatoryPatientInfoSocialHistorySection VDTAmbulatoryPatientInfoProblemSection VDTAmbulatoryPatientInfoResultsSection VDTAmbulatoryPatientInfoPlanOfCareSection VDTAmbulatoryPatientInfoProceduresSection VDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection VDTAmbulatoryPatientInfoSocialHistorySectionTemplateId VDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation VDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId VDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication VDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare VDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId VDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId VDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis' constraints.validation.query='VDTAmbulatoryPatientInfoSocialHistorySectionTemplateId VDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation VDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId VDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication VDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare VDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId VDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId VDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis'"
 * @generated
 */
public interface VDTAmbulatoryPatientInfo extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::MedicationsSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or  \r\n self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)) or \r\n self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoMedicationList(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::AllergiesSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AllergiesSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoMedicationAllergy(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::AllergiesSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AllergiesSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::EncountersSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or  \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection))) or
	 * (self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection)) or
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection))) xor
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection))) or\r\n(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or \r\n self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor \r\n self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoReasonForHospitalization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoSocialHistorySection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoProblemSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoResultsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoPlanOfCareSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProceduresSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoProceduresSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSocialHistorySection()->excluding(null)->reject(
	 * getSocialHistorySection().templateId->exists(id : datatypes::II | id.root
	 * = '2.16.840.1.113883.10.20.22.2.17'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSocialHistorySection()->excluding(null)->reject(getSocialHistorySection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.17\'))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSocialHistorySection()->excluding(null)->reject(
	 * getSocialHistorySection().entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::SmokingStatusObservation)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSocialHistorySection()->excluding(null)->reject(getSocialHistorySection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SmokingStatusObservation)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getHospitalAdmissionMedicationsSectionEntriesOptional()->excluding(null
	 * )->reject(getHospitalAdmissionMedicationsSectionEntriesOptional().
	 * templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.44'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalAdmissionMedicationsSectionEntriesOptional()->excluding(null)->reject(getHospitalAdmissionMedicationsSectionEntriesOptional().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.44\'))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getHospitalAdmissionMedicationsSectionEntriesOptional()->excluding(null
	 * )->reject(getHospitalAdmissionMedicationsSectionEntriesOptional().entry->
	 * exists(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::AdmissionMedication)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalAdmissionMedicationsSectionEntriesOptional()->excluding(null)->reject(getHospitalAdmissionMedicationsSectionEntriesOptional().entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection(
	 * ).getActs()->exists(a : cda::Act |
	 * a.oclIsKindOf(consol::PlanOfCareActivityAct)) or
	 * getPlanOfCareSection().getObservations()->exists(o : cda::Observation |
	 * o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or
	 * getPlanOfCareSection().getEncounters()->exists(e : cda::Encounter |
	 * e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or getPlanOfCareSection().getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or getPlanOfCareSection().getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection(
	 * ).templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.10'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.10\'))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(
	 * getHospitalAdmissionDiagnosisSection().templateId->exists(id :
	 * datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.43'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(getHospitalAdmissionDiagnosisSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.43\'))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(
	 * getHospitalAdmissionDiagnosisSection().entry->one(entry : cda::Entry |
	 * not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(getHospitalAdmissionDiagnosisSection().entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)'"
	 * @generated
	 */
	SocialHistorySection getSocialHistorySection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProblemSection))-
	 * >asSequence()->any(true).oclAsType(consol::ProblemSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)'"
	 * @generated
	 */
	ProblemSection getProblemSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::MedicationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::MedicationsSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)'"
	 * @generated
	 */
	MedicationsSection getMedicationsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(mu2consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional
	 * ))->asSequence()->any(true).oclAsType(mu2consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)'"
	 * @generated
	 */
	HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeMedicationsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)'"
	 * @generated
	 */
	HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection)
	 * )->asSequence()->any(true).oclAsType(consol::AllergiesSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)'"
	 * @generated
	 */
	AllergiesSection getAllergiesSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional)'"
	 * @generated
	 */
	AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ResultsSection))-
	 * >asSequence()->any(true).oclAsType(consol::ResultsSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->any(true).oclAsType(consol::ResultsSection)'"
	 * @generated
	 */
	ResultsSection getResultsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSection
	 * ))->asSequence()->any(true).oclAsType(consol::VitalSignsSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)'"
	 * @generated
	 */
	VitalSignsSection getVitalSignsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)'"
	 * @generated
	 */
	VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)'"
	 * @generated
	 */
	PlanOfCareSection getPlanOfCareSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProceduresSection
	 * ))->asSequence()->any(true).oclAsType(consol::ProceduresSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->any(true).oclAsType(consol::ProceduresSection)'"
	 * @generated
	 */
	ProceduresSection getProceduresSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)'"
	 * @generated
	 */
	HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::EncountersSection
	 * ))->asSequence()->any(true).oclAsType(consol::EncountersSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->any(true).oclAsType(consol::EncountersSection)'"
	 * @generated
	 */
	EncountersSection getEncountersSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::EncountersSectionEntriesOptional
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::EncountersSectionEntriesOptional) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::EncountersSectionEntriesOptional)'"
	 * @generated
	 */
	EncountersSectionEntriesOptional getEncountersSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::HospitalAdmissionDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::HospitalAdmissionDiagnosisSection)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionDiagnosisSection)'"
	 * @generated
	 */
	HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection
	 * ))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)'"
	 * @generated
	 */
	ReasonForVisitSection getReasonForVisitSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection
	 * ))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)'"
	 * @generated
	 */
	ChiefComplaintSection getChiefComplaintSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)'"
	 * @generated
	 */
	ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VDTAmbulatoryPatientInfo init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public VDTAmbulatoryPatientInfo init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // VDTAmbulatoryPatientInfo
