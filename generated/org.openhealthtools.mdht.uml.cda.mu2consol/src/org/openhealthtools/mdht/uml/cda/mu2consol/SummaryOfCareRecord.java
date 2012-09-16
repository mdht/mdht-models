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
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Summary Of Care Record</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getSummaryOfCareRecord()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SummaryOfCareRecordMu2EncounterDiagnosesRequirements SummaryOfCareRecordCarePlanning SummaryOfCareRecordPlanOfCareSection SummaryOfCareRecordProblemSection SummaryOfCareRecordAllergiesSection SummaryOfCareRecordImmunizationsSection SummaryOfCareRecordMedicationsSection SummaryOfCareRecordHospitalDischargeMedicationsSection SummaryOfCareRecordSocialHistorySection SummaryOfCareRecordResultsSection SummaryOfCareRecordVitalSignsSection SummaryOfCareRecordProceduresSection SummaryOfCareRecordFunctionalStatusSection SummaryOfCareRecordSocialHistorySectionTemplateId SummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation SummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordPlanOfCareSectionTemplateId SummaryOfCareRecordAssessmentAndPlanSectionTemplateId SummaryOfCareRecordAssessmentSectionTemplateId SummaryOfCareRecordmu2consolAssessmentSectionProblemObservation SummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis SummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis SummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus SummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus SummaryOfCareRecordFunctionalStatusSectionTemplateId SummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation' constraints.validation.query='SummaryOfCareRecordSocialHistorySectionTemplateId SummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation SummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId SummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication SummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordPlanOfCareSectionTemplateId SummaryOfCareRecordAssessmentAndPlanSectionTemplateId SummaryOfCareRecordAssessmentSectionTemplateId SummaryOfCareRecordmu2consolAssessmentSectionProblemObservation SummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis SummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis SummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation SummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis SummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId SummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis SummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus SummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus SummaryOfCareRecordFunctionalStatusSectionTemplateId SummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation'"
 * @generated
 */
public interface SummaryOfCareRecord extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::AssessmentSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalDischargeDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::PostoperativeDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::PostprocedureDiagnosisSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::EncountersSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::ProblemSection)) )
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeDiagnosisSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostoperativeDiagnosisSection)) or  \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PostprocedureDiagnosisSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ProblemSection)) )'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::InterventionsSection)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::InterventionsSection)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordCarePlanning(
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
	boolean validateSummaryOfCareRecordPlanOfCareSection(
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
	boolean validateSummaryOfCareRecordProblemSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordAllergiesSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ImmunizationsSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordImmunizationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordHospitalDischargeMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::SocialHistorySection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordSocialHistorySection(
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
	boolean validateSummaryOfCareRecordResultsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSummaryOfCareRecordProceduresSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::FunctionalStatusSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::FunctionalStatusSection))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordFunctionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSummaryOfCareRecordSocialHistorySectionTemplateId(
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
	boolean validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(
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
	boolean validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getAssessmentSection()->excluding(null)->reject(getAssessmentSection(
	 * ).templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.8'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAssessmentSection()->excluding(null)->reject(getAssessmentSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.8\'))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordAssessmentSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::ProblemObservation)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
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
	boolean validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not
	 * entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getHospitalDischargeDiagnosisSection()->excluding(null)->reject(
	 * getHospitalDischargeDiagnosisSection().templateId->exists(id :
	 * datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.24'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalDischargeDiagnosisSection()->excluding(null)->reject(getHospitalDischargeDiagnosisSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.24\'))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not
	 * entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getPostoperativeDiagnosisSection()->excluding(null)->reject(
	 * getPostoperativeDiagnosisSection().templateId->exists(id : datatypes::II
	 * | id.root = '2.16.840.1.113883.10.20.22.2.35'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getPostoperativeDiagnosisSection()->excluding(null)->reject(getPostoperativeDiagnosisSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.35\'))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::ProblemObservation)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getPostprocedureDiagnosisSection()->excluding(null)->reject(
	 * getPostprocedureDiagnosisSection().templateId->exists(id : datatypes::II
	 * | id.root = '2.16.840.1.113883.10.20.22.2.36'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getPostprocedureDiagnosisSection()->excluding(null)->reject(getPostprocedureDiagnosisSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.36\'))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not
	 * entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::PreoperativeDiagnosis)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PreoperativeDiagnosis)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)) or getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation)) or  getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)) or getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation)) or  getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)) or getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation)) or getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)) or getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation)) or getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.14'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.14\'))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getFunctionalStatusSection()->excluding(null)->reject(getFunctionalStatusSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAssessmentAndPlanSection()->excluding(null)->reject(
	 * getAssessmentAndPlanSection().templateId->exists(id : datatypes::II |
	 * id.root = '2.16.840.1.113883.10.20.22.2.9'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAssessmentAndPlanSection()->excluding(null)->reject(getAssessmentAndPlanSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.9\'))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.->reject(entry->exists(entry : cda::Entry | not
	 * entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::AdmissionMedication)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
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
	boolean validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateSummaryOfCareRecordPlanOfCareSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.->reject(entry->one(entry : cda::Entry | not
	 * entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::PostprocedureDiagnosis)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PostprocedureDiagnosis)))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getPreoperativeDiagnosisSection()->excluding(null)->reject(
	 * getPreoperativeDiagnosisSection().templateId->exists(id : datatypes::II |
	 * id.root = '2.16.840.1.113883.10.20.22.2.34'))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getPreoperativeDiagnosisSection()->excluding(null)->reject(getPreoperativeDiagnosisSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.34\'))'"
	 * @generated
	 */
	boolean validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::EncountersSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::EncountersSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::EncountersSection))->asSequence()->any(true).oclAsType(mu2consol::EncountersSection)'"
	 * @generated
	 */
	EncountersSection getEncountersSection();

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
	 * section.oclIsKindOf(mu2consol::AssessmentAndPlanSection
	 * ))->asSequence()->any
	 * (true).oclAsType(mu2consol::AssessmentAndPlanSection) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentAndPlanSection)'"
	 * @generated
	 */
	AssessmentAndPlanSection getAssessmentAndPlanSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::InterventionsSection
	 * ))->asSequence()->any(true).oclAsType(consol::InterventionsSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))->asSequence()->any(true).oclAsType(consol::InterventionsSection)'"
	 * @generated
	 */
	InterventionsSection getInterventionsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AssessmentSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::AssessmentSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentSection)'"
	 * @generated
	 */
	AssessmentSection getAssessmentSection();

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
	 * section.oclIsKindOf(mu2consol::HospitalDischargeDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::HospitalDischargeDiagnosisSection)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalDischargeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalDischargeDiagnosisSection)'"
	 * @generated
	 */
	HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PostoperativeDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::PostoperativeDiagnosisSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PostoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PostoperativeDiagnosisSection)'"
	 * @generated
	 */
	PostoperativeDiagnosisSection getPostoperativeDiagnosisSection();

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
	 * section.oclIsKindOf(consol::HistoryOfPastIllnessSection
	 * ))->asSequence()->any
	 * (true).oclAsType(consol::HistoryOfPastIllnessSection) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection)'"
	 * @generated
	 */
	HistoryOfPastIllnessSection getHistoryOfPastIllnessSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PreoperativeDiagnosisSection
	 * ))->asSequence(
	 * )->any(true).oclAsType(mu2consol::PreoperativeDiagnosisSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PreoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PreoperativeDiagnosisSection)'"
	 * @generated
	 */
	PreoperativeDiagnosisSection getPreoperativeDiagnosisSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ImmunizationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)'"
	 * @generated
	 */
	ImmunizationsSection getImmunizationsSection();

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
	 * section.oclIsKindOf(mu2consol::HospitalDischargeMedicationsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::HospitalDischargeMedicationsSection)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalDischargeMedicationsSection)'"
	 * @generated
	 */
	HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::SocialHistorySection
	 * ))->asSequence()->any(true).oclAsType(consol::SocialHistorySection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)'"
	 * @generated
	 */
	SocialHistorySection getSocialHistorySection();

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
	 * section.oclIsKindOf(mu2consol::PostprocedureDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::PostprocedureDiagnosisSection) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PostprocedureDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::PostprocedureDiagnosisSection)'"
	 * @generated
	 */
	PostprocedureDiagnosisSection getPostprocedureDiagnosisSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::FunctionalStatusSection))->asSequence()->any(true).oclAsType(mu2consol::FunctionalStatusSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::FunctionalStatusSection))->asSequence()->any(true).oclAsType(mu2consol::FunctionalStatusSection)'"
	 * @generated
	 */
	FunctionalStatusSection getFunctionalStatusSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryOfCareRecord init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public SummaryOfCareRecord init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // SummaryOfCareRecord
