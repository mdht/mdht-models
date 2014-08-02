/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.sdtm.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage
 * @generated
 */
public class SdtmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdtmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdtmSwitch() {
		if (modelPackage == null) {
			modelPackage = SdtmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SdtmPackage.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS: {
				SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials = (SubjectDataHumanClinicalTrials)theEObject;
				T result = caseSubjectDataHumanClinicalTrials(subjectDataHumanClinicalTrials);
				if (result == null) result = caseClinicalDocument(subjectDataHumanClinicalTrials);
				if (result == null) result = caseAct(subjectDataHumanClinicalTrials);
				if (result == null) result = caseInfrastructureRoot(subjectDataHumanClinicalTrials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION: {
				HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection = (HumanClinicalSubjectDataDocumentSection)theEObject;
				T result = caseHumanClinicalSubjectDataDocumentSection(humanClinicalSubjectDataDocumentSection);
				if (result == null) result = caseSection(humanClinicalSubjectDataDocumentSection);
				if (result == null) result = caseAct(humanClinicalSubjectDataDocumentSection);
				if (result == null) result = caseInfrastructureRoot(humanClinicalSubjectDataDocumentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS: {
				HumanClinicalSubjectDemographics humanClinicalSubjectDemographics = (HumanClinicalSubjectDemographics)theEObject;
				T result = caseHumanClinicalSubjectDemographics(humanClinicalSubjectDemographics);
				if (result == null) result = caseCDA_Act(humanClinicalSubjectDemographics);
				if (result == null) result = caseClinicalStatement(humanClinicalSubjectDemographics);
				if (result == null) result = caseAct(humanClinicalSubjectDemographics);
				if (result == null) result = caseInfrastructureRoot(humanClinicalSubjectDemographics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.DATA_COLLECTION: {
				DataCollection dataCollection = (DataCollection)theEObject;
				T result = caseDataCollection(dataCollection);
				if (result == null) result = caseCDA_Act(dataCollection);
				if (result == null) result = caseClinicalStatement(dataCollection);
				if (result == null) result = caseAct(dataCollection);
				if (result == null) result = caseInfrastructureRoot(dataCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.EVENT_STUDY_DAY: {
				EventStudyDay eventStudyDay = (EventStudyDay)theEObject;
				T result = caseEventStudyDay(eventStudyDay);
				if (result == null) result = caseObservation(eventStudyDay);
				if (result == null) result = caseClinicalStatement(eventStudyDay);
				if (result == null) result = caseAct(eventStudyDay);
				if (result == null) result = caseInfrastructureRoot(eventStudyDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_ARM: {
				StudyArm studyArm = (StudyArm)theEObject;
				T result = caseStudyArm(studyArm);
				if (result == null) result = caseCDA_Act(studyArm);
				if (result == null) result = caseClinicalStatement(studyArm);
				if (result == null) result = caseAct(studyArm);
				if (result == null) result = caseInfrastructureRoot(studyArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseObservation(comment);
				if (result == null) result = caseClinicalStatement(comment);
				if (result == null) result = caseAct(comment);
				if (result == null) result = caseInfrastructureRoot(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.DOMAIN_ASSIGNMENT: {
				DomainAssignment domainAssignment = (DomainAssignment)theEObject;
				T result = caseDomainAssignment(domainAssignment);
				if (result == null) result = caseObservation(domainAssignment);
				if (result == null) result = caseClinicalStatement(domainAssignment);
				if (result == null) result = caseAct(domainAssignment);
				if (result == null) result = caseInfrastructureRoot(domainAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.RELATED_RECORD: {
				RelatedRecord relatedRecord = (RelatedRecord)theEObject;
				T result = caseRelatedRecord(relatedRecord);
				if (result == null) result = caseCDA_Act(relatedRecord);
				if (result == null) result = caseClinicalStatement(relatedRecord);
				if (result == null) result = caseAct(relatedRecord);
				if (result == null) result = caseInfrastructureRoot(relatedRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SUPPLEMENTAL_VALUE: {
				SupplementalValue supplementalValue = (SupplementalValue)theEObject;
				T result = caseSupplementalValue(supplementalValue);
				if (result == null) result = caseObservation(supplementalValue);
				if (result == null) result = caseClinicalStatement(supplementalValue);
				if (result == null) result = caseAct(supplementalValue);
				if (result == null) result = caseInfrastructureRoot(supplementalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.REFERENCE_PERIOD: {
				ReferencePeriod referencePeriod = (ReferencePeriod)theEObject;
				T result = caseReferencePeriod(referencePeriod);
				if (result == null) result = caseCDA_Act(referencePeriod);
				if (result == null) result = caseClinicalStatement(referencePeriod);
				if (result == null) result = caseAct(referencePeriod);
				if (result == null) result = caseInfrastructureRoot(referencePeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.FINDING_ABOUT: {
				FindingAbout findingAbout = (FindingAbout)theEObject;
				T result = caseFindingAbout(findingAbout);
				if (result == null) result = caseObservation(findingAbout);
				if (result == null) result = caseClinicalStatement(findingAbout);
				if (result == null) result = caseAct(findingAbout);
				if (result == null) result = caseInfrastructureRoot(findingAbout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.GROUP_IDENTIFIER: {
				GroupIdentifier groupIdentifier = (GroupIdentifier)theEObject;
				T result = caseGroupIdentifier(groupIdentifier);
				if (result == null) result = caseCDA_Act(groupIdentifier);
				if (result == null) result = caseClinicalStatement(groupIdentifier);
				if (result == null) result = caseAct(groupIdentifier);
				if (result == null) result = caseInfrastructureRoot(groupIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.NON_PERFORMANCE_REASON: {
				NonPerformanceReason nonPerformanceReason = (NonPerformanceReason)theEObject;
				T result = caseNonPerformanceReason(nonPerformanceReason);
				if (result == null) result = caseObservation(nonPerformanceReason);
				if (result == null) result = caseClinicalStatement(nonPerformanceReason);
				if (result == null) result = caseAct(nonPerformanceReason);
				if (result == null) result = caseInfrastructureRoot(nonPerformanceReason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseObservation(category);
				if (result == null) result = caseClinicalStatement(category);
				if (result == null) result = caseAct(category);
				if (result == null) result = caseInfrastructureRoot(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SUB_CATEGORY: {
				SubCategory subCategory = (SubCategory)theEObject;
				T result = caseSubCategory(subCategory);
				if (result == null) result = caseObservation(subCategory);
				if (result == null) result = caseClinicalStatement(subCategory);
				if (result == null) result = caseAct(subCategory);
				if (result == null) result = caseInfrastructureRoot(subCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.VISIT: {
				Visit visit = (Visit)theEObject;
				T result = caseVisit(visit);
				if (result == null) result = caseEncounter(visit);
				if (result == null) result = caseClinicalStatement(visit);
				if (result == null) result = caseAct(visit);
				if (result == null) result = caseInfrastructureRoot(visit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.VITAL_SIGN: {
				VitalSign vitalSign = (VitalSign)theEObject;
				T result = caseVitalSign(vitalSign);
				if (result == null) result = caseObservation(vitalSign);
				if (result == null) result = caseClinicalStatement(vitalSign);
				if (result == null) result = caseAct(vitalSign);
				if (result == null) result = caseInfrastructureRoot(vitalSign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.TIMING_REFERENCE: {
				TimingReference timingReference = (TimingReference)theEObject;
				T result = caseTimingReference(timingReference);
				if (result == null) result = caseCDA_Act(timingReference);
				if (result == null) result = caseClinicalStatement(timingReference);
				if (result == null) result = caseAct(timingReference);
				if (result == null) result = caseInfrastructureRoot(timingReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.PLANNED_STUDY_DAY: {
				PlannedStudyDay plannedStudyDay = (PlannedStudyDay)theEObject;
				T result = casePlannedStudyDay(plannedStudyDay);
				if (result == null) result = caseObservation(plannedStudyDay);
				if (result == null) result = caseClinicalStatement(plannedStudyDay);
				if (result == null) result = caseAct(plannedStudyDay);
				if (result == null) result = caseInfrastructureRoot(plannedStudyDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_DAY_PERIOD: {
				StudyDayPeriod studyDayPeriod = (StudyDayPeriod)theEObject;
				T result = caseStudyDayPeriod(studyDayPeriod);
				if (result == null) result = caseObservation(studyDayPeriod);
				if (result == null) result = caseClinicalStatement(studyDayPeriod);
				if (result == null) result = caseAct(studyDayPeriod);
				if (result == null) result = caseInfrastructureRoot(studyDayPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.EXCLUSION_REASON: {
				ExclusionReason exclusionReason = (ExclusionReason)theEObject;
				T result = caseExclusionReason(exclusionReason);
				if (result == null) result = caseObservation(exclusionReason);
				if (result == null) result = caseClinicalStatement(exclusionReason);
				if (result == null) result = caseAct(exclusionReason);
				if (result == null) result = caseInfrastructureRoot(exclusionReason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.POSITIONOF_SUBJECT: {
				PositionofSubject positionofSubject = (PositionofSubject)theEObject;
				T result = casePositionofSubject(positionofSubject);
				if (result == null) result = caseObservation(positionofSubject);
				if (result == null) result = caseClinicalStatement(positionofSubject);
				if (result == null) result = caseAct(positionofSubject);
				if (result == null) result = caseInfrastructureRoot(positionofSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.ECG_TEST_RESULT: {
				ECGTestResult ecgTestResult = (ECGTestResult)theEObject;
				T result = caseECGTestResult(ecgTestResult);
				if (result == null) result = caseObservation(ecgTestResult);
				if (result == null) result = caseClinicalStatement(ecgTestResult);
				if (result == null) result = caseAct(ecgTestResult);
				if (result == null) result = caseInfrastructureRoot(ecgTestResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.PHYSICAL_EXAMINATION_FINDING: {
				PhysicalExaminationFinding physicalExaminationFinding = (PhysicalExaminationFinding)theEObject;
				T result = casePhysicalExaminationFinding(physicalExaminationFinding);
				if (result == null) result = caseObservation(physicalExaminationFinding);
				if (result == null) result = caseClinicalStatement(physicalExaminationFinding);
				if (result == null) result = caseAct(physicalExaminationFinding);
				if (result == null) result = caseInfrastructureRoot(physicalExaminationFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.BODY_SYSTEMOR_ORGAN_CLASS: {
				BodySystemorOrganClass bodySystemorOrganClass = (BodySystemorOrganClass)theEObject;
				T result = caseBodySystemorOrganClass(bodySystemorOrganClass);
				if (result == null) result = caseObservation(bodySystemorOrganClass);
				if (result == null) result = caseClinicalStatement(bodySystemorOrganClass);
				if (result == null) result = caseAct(bodySystemorOrganClass);
				if (result == null) result = caseInfrastructureRoot(bodySystemorOrganClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.MICROBIOLOGY_SPECIMEN_FINDING: {
				MicrobiologySpecimenFinding microbiologySpecimenFinding = (MicrobiologySpecimenFinding)theEObject;
				T result = caseMicrobiologySpecimenFinding(microbiologySpecimenFinding);
				if (result == null) result = caseObservation(microbiologySpecimenFinding);
				if (result == null) result = caseClinicalStatement(microbiologySpecimenFinding);
				if (result == null) result = caseAct(microbiologySpecimenFinding);
				if (result == null) result = caseInfrastructureRoot(microbiologySpecimenFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SPECIMEN_INFORMATION: {
				SpecimenInformation specimenInformation = (SpecimenInformation)theEObject;
				T result = caseSpecimenInformation(specimenInformation);
				if (result == null) result = caseProcedure(specimenInformation);
				if (result == null) result = caseClinicalStatement(specimenInformation);
				if (result == null) result = caseAct(specimenInformation);
				if (result == null) result = caseInfrastructureRoot(specimenInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.RESULT_CATEGORY: {
				ResultCategory resultCategory = (ResultCategory)theEObject;
				T result = caseResultCategory(resultCategory);
				if (result == null) result = caseObservation(resultCategory);
				if (result == null) result = caseClinicalStatement(resultCategory);
				if (result == null) result = caseAct(resultCategory);
				if (result == null) result = caseInfrastructureRoot(resultCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.MICROBIOLOGY_SUSCEPTIBILITY: {
				MicrobiologySusceptibility microbiologySusceptibility = (MicrobiologySusceptibility)theEObject;
				T result = caseMicrobiologySusceptibility(microbiologySusceptibility);
				if (result == null) result = caseObservation(microbiologySusceptibility);
				if (result == null) result = caseClinicalStatement(microbiologySusceptibility);
				if (result == null) result = caseAct(microbiologySusceptibility);
				if (result == null) result = caseInfrastructureRoot(microbiologySusceptibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.PHARMACOKINETIC_CONCENTRATION_FINDING: {
				PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding = (PharmacokineticConcentrationFinding)theEObject;
				T result = casePharmacokineticConcentrationFinding(pharmacokineticConcentrationFinding);
				if (result == null) result = caseObservation(pharmacokineticConcentrationFinding);
				if (result == null) result = caseClinicalStatement(pharmacokineticConcentrationFinding);
				if (result == null) result = caseAct(pharmacokineticConcentrationFinding);
				if (result == null) result = caseInfrastructureRoot(pharmacokineticConcentrationFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.FASTING_STATUS: {
				FastingStatus fastingStatus = (FastingStatus)theEObject;
				T result = caseFastingStatus(fastingStatus);
				if (result == null) result = caseObservation(fastingStatus);
				if (result == null) result = caseClinicalStatement(fastingStatus);
				if (result == null) result = caseAct(fastingStatus);
				if (result == null) result = caseInfrastructureRoot(fastingStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.ASSAY_QUANTITATION: {
				AssayQuantitation assayQuantitation = (AssayQuantitation)theEObject;
				T result = caseAssayQuantitation(assayQuantitation);
				if (result == null) result = caseObservation(assayQuantitation);
				if (result == null) result = caseClinicalStatement(assayQuantitation);
				if (result == null) result = caseAct(assayQuantitation);
				if (result == null) result = caseInfrastructureRoot(assayQuantitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.DRUG_ACCOUNTABILITY: {
				DrugAccountability drugAccountability = (DrugAccountability)theEObject;
				T result = caseDrugAccountability(drugAccountability);
				if (result == null) result = caseObservation(drugAccountability);
				if (result == null) result = caseClinicalStatement(drugAccountability);
				if (result == null) result = caseAct(drugAccountability);
				if (result == null) result = caseInfrastructureRoot(drugAccountability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.HUMAN_CLINICAL_LABORATORY_TEST_RESULT: {
				HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult = (HumanClinicalLaboratoryTestResult)theEObject;
				T result = caseHumanClinicalLaboratoryTestResult(humanClinicalLaboratoryTestResult);
				if (result == null) result = caseObservation(humanClinicalLaboratoryTestResult);
				if (result == null) result = caseClinicalStatement(humanClinicalLaboratoryTestResult);
				if (result == null) result = caseAct(humanClinicalLaboratoryTestResult);
				if (result == null) result = caseInfrastructureRoot(humanClinicalLaboratoryTestResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.TOXICITY: {
				Toxicity toxicity = (Toxicity)theEObject;
				T result = caseToxicity(toxicity);
				if (result == null) result = caseObservation(toxicity);
				if (result == null) result = caseClinicalStatement(toxicity);
				if (result == null) result = caseAct(toxicity);
				if (result == null) result = caseInfrastructureRoot(toxicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.QUESTIONNAIRE_FINDING: {
				QuestionnaireFinding questionnaireFinding = (QuestionnaireFinding)theEObject;
				T result = caseQuestionnaireFinding(questionnaireFinding);
				if (result == null) result = caseObservation(questionnaireFinding);
				if (result == null) result = caseClinicalStatement(questionnaireFinding);
				if (result == null) result = caseAct(questionnaireFinding);
				if (result == null) result = caseInfrastructureRoot(questionnaireFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.PHARMACOKINETIC_PARAMETER_FINDING: {
				PharmacokineticParameterFinding pharmacokineticParameterFinding = (PharmacokineticParameterFinding)theEObject;
				T result = casePharmacokineticParameterFinding(pharmacokineticParameterFinding);
				if (result == null) result = caseObservation(pharmacokineticParameterFinding);
				if (result == null) result = caseClinicalStatement(pharmacokineticParameterFinding);
				if (result == null) result = caseAct(pharmacokineticParameterFinding);
				if (result == null) result = caseInfrastructureRoot(pharmacokineticParameterFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SUBJECT_ELEMENT: {
				SubjectElement subjectElement = (SubjectElement)theEObject;
				T result = caseSubjectElement(subjectElement);
				if (result == null) result = caseCDA_Act(subjectElement);
				if (result == null) result = caseClinicalStatement(subjectElement);
				if (result == null) result = caseAct(subjectElement);
				if (result == null) result = caseInfrastructureRoot(subjectElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_EPOCH: {
				StudyEpoch studyEpoch = (StudyEpoch)theEObject;
				T result = caseStudyEpoch(studyEpoch);
				if (result == null) result = caseCDA_Act(studyEpoch);
				if (result == null) result = caseClinicalStatement(studyEpoch);
				if (result == null) result = caseAct(studyEpoch);
				if (result == null) result = caseInfrastructureRoot(studyEpoch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.HUMAN_CLINICAL_DISPOSITION: {
				HumanClinicalDisposition humanClinicalDisposition = (HumanClinicalDisposition)theEObject;
				T result = caseHumanClinicalDisposition(humanClinicalDisposition);
				if (result == null) result = caseCDA_Act(humanClinicalDisposition);
				if (result == null) result = caseClinicalStatement(humanClinicalDisposition);
				if (result == null) result = caseAct(humanClinicalDisposition);
				if (result == null) result = caseInfrastructureRoot(humanClinicalDisposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.MEDICAL_HISTORY_ITEM: {
				MedicalHistoryItem medicalHistoryItem = (MedicalHistoryItem)theEObject;
				T result = caseMedicalHistoryItem(medicalHistoryItem);
				if (result == null) result = caseObservation(medicalHistoryItem);
				if (result == null) result = caseClinicalStatement(medicalHistoryItem);
				if (result == null) result = caseAct(medicalHistoryItem);
				if (result == null) result = caseInfrastructureRoot(medicalHistoryItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.PRE_SPECIFIED_EVENT: {
				PreSpecifiedEvent preSpecifiedEvent = (PreSpecifiedEvent)theEObject;
				T result = casePreSpecifiedEvent(preSpecifiedEvent);
				if (result == null) result = caseObservation(preSpecifiedEvent);
				if (result == null) result = caseClinicalStatement(preSpecifiedEvent);
				if (result == null) result = caseAct(preSpecifiedEvent);
				if (result == null) result = caseInfrastructureRoot(preSpecifiedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.START_RELATIVETO_REFERENCE_PERIOD: {
				StartRelativetoReferencePeriod startRelativetoReferencePeriod = (StartRelativetoReferencePeriod)theEObject;
				T result = caseStartRelativetoReferencePeriod(startRelativetoReferencePeriod);
				if (result == null) result = caseObservation(startRelativetoReferencePeriod);
				if (result == null) result = caseClinicalStatement(startRelativetoReferencePeriod);
				if (result == null) result = caseAct(startRelativetoReferencePeriod);
				if (result == null) result = caseInfrastructureRoot(startRelativetoReferencePeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STOP_RELATIVETO_REFERENCE_PERIOD: {
				StopRelativetoReferencePeriod stopRelativetoReferencePeriod = (StopRelativetoReferencePeriod)theEObject;
				T result = caseStopRelativetoReferencePeriod(stopRelativetoReferencePeriod);
				if (result == null) result = caseObservation(stopRelativetoReferencePeriod);
				if (result == null) result = caseClinicalStatement(stopRelativetoReferencePeriod);
				if (result == null) result = caseAct(stopRelativetoReferencePeriod);
				if (result == null) result = caseInfrastructureRoot(stopRelativetoReferencePeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.PROTOCOL_DEVIATION: {
				ProtocolDeviation protocolDeviation = (ProtocolDeviation)theEObject;
				T result = caseProtocolDeviation(protocolDeviation);
				if (result == null) result = caseObservation(protocolDeviation);
				if (result == null) result = caseClinicalStatement(protocolDeviation);
				if (result == null) result = caseAct(protocolDeviation);
				if (result == null) result = caseInfrastructureRoot(protocolDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.CLINICAL_EVENT: {
				ClinicalEvent clinicalEvent = (ClinicalEvent)theEObject;
				T result = caseClinicalEvent(clinicalEvent);
				if (result == null) result = caseObservation(clinicalEvent);
				if (result == null) result = caseClinicalStatement(clinicalEvent);
				if (result == null) result = caseAct(clinicalEvent);
				if (result == null) result = caseInfrastructureRoot(clinicalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.EVENTOR_FINDING_SEVERITY: {
				EventorFindingSeverity eventorFindingSeverity = (EventorFindingSeverity)theEObject;
				T result = caseEventorFindingSeverity(eventorFindingSeverity);
				if (result == null) result = caseObservation(eventorFindingSeverity);
				if (result == null) result = caseClinicalStatement(eventorFindingSeverity);
				if (result == null) result = caseAct(eventorFindingSeverity);
				if (result == null) result = caseInfrastructureRoot(eventorFindingSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SUBJECT_CHARACTERISTIC: {
				SubjectCharacteristic subjectCharacteristic = (SubjectCharacteristic)theEObject;
				T result = caseSubjectCharacteristic(subjectCharacteristic);
				if (result == null) result = caseObservation(subjectCharacteristic);
				if (result == null) result = caseClinicalStatement(subjectCharacteristic);
				if (result == null) result = caseAct(subjectCharacteristic);
				if (result == null) result = caseInfrastructureRoot(subjectCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_SUBJECT_EVENT: {
				StudySubjectEvent studySubjectEvent = (StudySubjectEvent)theEObject;
				T result = caseStudySubjectEvent(studySubjectEvent);
				if (result == null) result = caseObservation(studySubjectEvent);
				if (result == null) result = caseClinicalStatement(studySubjectEvent);
				if (result == null) result = caseAct(studySubjectEvent);
				if (result == null) result = caseInfrastructureRoot(studySubjectEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SERIOUS_EVENT: {
				SeriousEvent seriousEvent = (SeriousEvent)theEObject;
				T result = caseSeriousEvent(seriousEvent);
				if (result == null) result = caseObservation(seriousEvent);
				if (result == null) result = caseClinicalStatement(seriousEvent);
				if (result == null) result = caseAct(seriousEvent);
				if (result == null) result = caseInfrastructureRoot(seriousEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_TREATMENT_ACTION_TAKEN: {
				StudyTreatmentActionTaken studyTreatmentActionTaken = (StudyTreatmentActionTaken)theEObject;
				T result = caseStudyTreatmentActionTaken(studyTreatmentActionTaken);
				if (result == null) result = caseObservation(studyTreatmentActionTaken);
				if (result == null) result = caseClinicalStatement(studyTreatmentActionTaken);
				if (result == null) result = caseAct(studyTreatmentActionTaken);
				if (result == null) result = caseInfrastructureRoot(studyTreatmentActionTaken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.OTHER_TREATMENT_ACTION_TAKEN: {
				OtherTreatmentActionTaken otherTreatmentActionTaken = (OtherTreatmentActionTaken)theEObject;
				T result = caseOtherTreatmentActionTaken(otherTreatmentActionTaken);
				if (result == null) result = caseObservation(otherTreatmentActionTaken);
				if (result == null) result = caseClinicalStatement(otherTreatmentActionTaken);
				if (result == null) result = caseAct(otherTreatmentActionTaken);
				if (result == null) result = caseInfrastructureRoot(otherTreatmentActionTaken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_TREATMENT_CAUSALITY: {
				StudyTreatmentCausality studyTreatmentCausality = (StudyTreatmentCausality)theEObject;
				T result = caseStudyTreatmentCausality(studyTreatmentCausality);
				if (result == null) result = caseObservation(studyTreatmentCausality);
				if (result == null) result = caseClinicalStatement(studyTreatmentCausality);
				if (result == null) result = caseAct(studyTreatmentCausality);
				if (result == null) result = caseInfrastructureRoot(studyTreatmentCausality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.NON_STUDY_TREATMENT_RELATIONSHIP: {
				NonStudyTreatmentRelationship nonStudyTreatmentRelationship = (NonStudyTreatmentRelationship)theEObject;
				T result = caseNonStudyTreatmentRelationship(nonStudyTreatmentRelationship);
				if (result == null) result = caseObservation(nonStudyTreatmentRelationship);
				if (result == null) result = caseClinicalStatement(nonStudyTreatmentRelationship);
				if (result == null) result = caseAct(nonStudyTreatmentRelationship);
				if (result == null) result = caseInfrastructureRoot(nonStudyTreatmentRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.EVENT_PATTERN: {
				EventPattern eventPattern = (EventPattern)theEObject;
				T result = caseEventPattern(eventPattern);
				if (result == null) result = caseObservation(eventPattern);
				if (result == null) result = caseClinicalStatement(eventPattern);
				if (result == null) result = caseAct(eventPattern);
				if (result == null) result = caseInfrastructureRoot(eventPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.EVENT_OUTCOME: {
				EventOutcome eventOutcome = (EventOutcome)theEObject;
				T result = caseEventOutcome(eventOutcome);
				if (result == null) result = caseObservation(eventOutcome);
				if (result == null) result = caseClinicalStatement(eventOutcome);
				if (result == null) result = caseAct(eventOutcome);
				if (result == null) result = caseInfrastructureRoot(eventOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.CONCOMITANT_TREATMENT: {
				ConcomitantTreatment concomitantTreatment = (ConcomitantTreatment)theEObject;
				T result = caseConcomitantTreatment(concomitantTreatment);
				if (result == null) result = caseObservation(concomitantTreatment);
				if (result == null) result = caseClinicalStatement(concomitantTreatment);
				if (result == null) result = caseAct(concomitantTreatment);
				if (result == null) result = caseInfrastructureRoot(concomitantTreatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.EVENT_DURATION: {
				EventDuration eventDuration = (EventDuration)theEObject;
				T result = caseEventDuration(eventDuration);
				if (result == null) result = caseObservation(eventDuration);
				if (result == null) result = caseClinicalStatement(eventDuration);
				if (result == null) result = caseAct(eventDuration);
				if (result == null) result = caseInfrastructureRoot(eventDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_SUBJECT_FINDING: {
				StudySubjectFinding studySubjectFinding = (StudySubjectFinding)theEObject;
				T result = caseStudySubjectFinding(studySubjectFinding);
				if (result == null) result = caseObservation(studySubjectFinding);
				if (result == null) result = caseClinicalStatement(studySubjectFinding);
				if (result == null) result = caseAct(studySubjectFinding);
				if (result == null) result = caseInfrastructureRoot(studySubjectFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.DEATH_RELATIONSHIP: {
				DeathRelationship deathRelationship = (DeathRelationship)theEObject;
				T result = caseDeathRelationship(deathRelationship);
				if (result == null) result = caseObservation(deathRelationship);
				if (result == null) result = caseClinicalStatement(deathRelationship);
				if (result == null) result = caseAct(deathRelationship);
				if (result == null) result = caseInfrastructureRoot(deathRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_SUBJECT_INTERVENTION: {
				StudySubjectIntervention studySubjectIntervention = (StudySubjectIntervention)theEObject;
				T result = caseStudySubjectIntervention(studySubjectIntervention);
				if (result == null) result = caseSubstanceAdministration(studySubjectIntervention);
				if (result == null) result = caseClinicalStatement(studySubjectIntervention);
				if (result == null) result = caseAct(studySubjectIntervention);
				if (result == null) result = caseInfrastructureRoot(studySubjectIntervention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.INDICATION: {
				Indication indication = (Indication)theEObject;
				T result = caseIndication(indication);
				if (result == null) result = caseObservation(indication);
				if (result == null) result = caseClinicalStatement(indication);
				if (result == null) result = caseAct(indication);
				if (result == null) result = caseInfrastructureRoot(indication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.INTENDED_REGIMEN: {
				IntendedRegimen intendedRegimen = (IntendedRegimen)theEObject;
				T result = caseIntendedRegimen(intendedRegimen);
				if (result == null) result = caseObservation(intendedRegimen);
				if (result == null) result = caseClinicalStatement(intendedRegimen);
				if (result == null) result = caseAct(intendedRegimen);
				if (result == null) result = caseInfrastructureRoot(intendedRegimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.DOSE_ADJUSTMENT_REASON: {
				DoseAdjustmentReason doseAdjustmentReason = (DoseAdjustmentReason)theEObject;
				T result = caseDoseAdjustmentReason(doseAdjustmentReason);
				if (result == null) result = caseObservation(doseAdjustmentReason);
				if (result == null) result = caseClinicalStatement(doseAdjustmentReason);
				if (result == null) result = caseAct(doseAdjustmentReason);
				if (result == null) result = caseInfrastructureRoot(doseAdjustmentReason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.ADVERSE_EVENT: {
				AdverseEvent adverseEvent = (AdverseEvent)theEObject;
				T result = caseAdverseEvent(adverseEvent);
				if (result == null) result = caseObservation(adverseEvent);
				if (result == null) result = caseClinicalStatement(adverseEvent);
				if (result == null) result = caseAct(adverseEvent);
				if (result == null) result = caseInfrastructureRoot(adverseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET: {
				InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet = (InclusionorExclusionCriteriaNotMet)theEObject;
				T result = caseInclusionorExclusionCriteriaNotMet(inclusionorExclusionCriteriaNotMet);
				if (result == null) result = caseObservation(inclusionorExclusionCriteriaNotMet);
				if (result == null) result = caseClinicalStatement(inclusionorExclusionCriteriaNotMet);
				if (result == null) result = caseAct(inclusionorExclusionCriteriaNotMet);
				if (result == null) result = caseInfrastructureRoot(inclusionorExclusionCriteriaNotMet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.CONCOMITANT_MEDICATION: {
				ConcomitantMedication concomitantMedication = (ConcomitantMedication)theEObject;
				T result = caseConcomitantMedication(concomitantMedication);
				if (result == null) result = caseSubstanceAdministration(concomitantMedication);
				if (result == null) result = caseClinicalStatement(concomitantMedication);
				if (result == null) result = caseAct(concomitantMedication);
				if (result == null) result = caseInfrastructureRoot(concomitantMedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.CONSUMABLE_MATERIAL: {
				ConsumableMaterial consumableMaterial = (ConsumableMaterial)theEObject;
				T result = caseConsumableMaterial(consumableMaterial);
				if (result == null) result = caseConsumable(consumableMaterial);
				if (result == null) result = caseParticipation(consumableMaterial);
				if (result == null) result = caseInfrastructureRoot(consumableMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.HUMAN_CLINICAL_EXPOSURE: {
				HumanClinicalExposure humanClinicalExposure = (HumanClinicalExposure)theEObject;
				T result = caseHumanClinicalExposure(humanClinicalExposure);
				if (result == null) result = caseSubstanceAdministration(humanClinicalExposure);
				if (result == null) result = caseClinicalStatement(humanClinicalExposure);
				if (result == null) result = caseAct(humanClinicalExposure);
				if (result == null) result = caseInfrastructureRoot(humanClinicalExposure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SUBSTANCE_USE: {
				SubstanceUse substanceUse = (SubstanceUse)theEObject;
				T result = caseSubstanceUse(substanceUse);
				if (result == null) result = caseSubstanceAdministration(substanceUse);
				if (result == null) result = caseClinicalStatement(substanceUse);
				if (result == null) result = caseAct(substanceUse);
				if (result == null) result = caseInfrastructureRoot(substanceUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.NONHUMAN_LABORATORY_TEST_RESULT: {
				NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult = (NonhumanLaboratoryTestResult)theEObject;
				T result = caseNonhumanLaboratoryTestResult(nonhumanLaboratoryTestResult);
				if (result == null) result = caseObservation(nonhumanLaboratoryTestResult);
				if (result == null) result = caseClinicalStatement(nonhumanLaboratoryTestResult);
				if (result == null) result = caseAct(nonhumanLaboratoryTestResult);
				if (result == null) result = caseInfrastructureRoot(nonhumanLaboratoryTestResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_TEST_ORGANIZATION: {
				StudyTestOrganization studyTestOrganization = (StudyTestOrganization)theEObject;
				T result = caseStudyTestOrganization(studyTestOrganization);
				if (result == null) result = caseParticipant2(studyTestOrganization);
				if (result == null) result = caseParticipation(studyTestOrganization);
				if (result == null) result = caseInfrastructureRoot(studyTestOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.STUDY_FINDING_EVALUATOR: {
				StudyFindingEvaluator studyFindingEvaluator = (StudyFindingEvaluator)theEObject;
				T result = caseStudyFindingEvaluator(studyFindingEvaluator);
				if (result == null) result = caseParticipant2(studyFindingEvaluator);
				if (result == null) result = caseParticipation(studyFindingEvaluator);
				if (result == null) result = caseInfrastructureRoot(studyFindingEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SUBJECT_DATA_NON_CLINICAL_TRIALS: {
				SubjectDataNonClinicalTrials subjectDataNonClinicalTrials = (SubjectDataNonClinicalTrials)theEObject;
				T result = caseSubjectDataNonClinicalTrials(subjectDataNonClinicalTrials);
				if (result == null) result = caseClinicalDocument(subjectDataNonClinicalTrials);
				if (result == null) result = caseAct(subjectDataNonClinicalTrials);
				if (result == null) result = caseInfrastructureRoot(subjectDataNonClinicalTrials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION: {
				NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection = (NonhumanSubjectDataDocumentSection)theEObject;
				T result = caseNonhumanSubjectDataDocumentSection(nonhumanSubjectDataDocumentSection);
				if (result == null) result = caseSection(nonhumanSubjectDataDocumentSection);
				if (result == null) result = caseAct(nonhumanSubjectDataDocumentSection);
				if (result == null) result = caseInfrastructureRoot(nonhumanSubjectDataDocumentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.NONHUMAN_SUBJECT_DEMOGRAPHICS: {
				NonhumanSubjectDemographics nonhumanSubjectDemographics = (NonhumanSubjectDemographics)theEObject;
				T result = caseNonhumanSubjectDemographics(nonhumanSubjectDemographics);
				if (result == null) result = caseCDA_Act(nonhumanSubjectDemographics);
				if (result == null) result = caseClinicalStatement(nonhumanSubjectDemographics);
				if (result == null) result = caseAct(nonhumanSubjectDemographics);
				if (result == null) result = caseInfrastructureRoot(nonhumanSubjectDemographics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.NONHUMAN_DISPOSITION: {
				NonhumanDisposition nonhumanDisposition = (NonhumanDisposition)theEObject;
				T result = caseNonhumanDisposition(nonhumanDisposition);
				if (result == null) result = caseCDA_Act(nonhumanDisposition);
				if (result == null) result = caseClinicalStatement(nonhumanDisposition);
				if (result == null) result = caseAct(nonhumanDisposition);
				if (result == null) result = caseInfrastructureRoot(nonhumanDisposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.NONHUMAN_EXPOSURE: {
				NonhumanExposure nonhumanExposure = (NonhumanExposure)theEObject;
				T result = caseNonhumanExposure(nonhumanExposure);
				if (result == null) result = caseSubstanceAdministration(nonhumanExposure);
				if (result == null) result = caseClinicalStatement(nonhumanExposure);
				if (result == null) result = caseAct(nonhumanExposure);
				if (result == null) result = caseInfrastructureRoot(nonhumanExposure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.BODY_WEIGHT: {
				BodyWeight bodyWeight = (BodyWeight)theEObject;
				T result = caseBodyWeight(bodyWeight);
				if (result == null) result = caseObservation(bodyWeight);
				if (result == null) result = caseClinicalStatement(bodyWeight);
				if (result == null) result = caseAct(bodyWeight);
				if (result == null) result = caseInfrastructureRoot(bodyWeight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.BODY_WEIGHT_GAIN: {
				BodyWeightGain bodyWeightGain = (BodyWeightGain)theEObject;
				T result = caseBodyWeightGain(bodyWeightGain);
				if (result == null) result = caseObservation(bodyWeightGain);
				if (result == null) result = caseClinicalStatement(bodyWeightGain);
				if (result == null) result = caseAct(bodyWeightGain);
				if (result == null) result = caseInfrastructureRoot(bodyWeightGain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.CLINICAL_OBSERVATION: {
				ClinicalObservation clinicalObservation = (ClinicalObservation)theEObject;
				T result = caseClinicalObservation(clinicalObservation);
				if (result == null) result = caseObservation(clinicalObservation);
				if (result == null) result = caseClinicalStatement(clinicalObservation);
				if (result == null) result = caseAct(clinicalObservation);
				if (result == null) result = caseInfrastructureRoot(clinicalObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.DEATH_DIAGNOSIS: {
				DeathDiagnosis deathDiagnosis = (DeathDiagnosis)theEObject;
				T result = caseDeathDiagnosis(deathDiagnosis);
				if (result == null) result = caseObservation(deathDiagnosis);
				if (result == null) result = caseClinicalStatement(deathDiagnosis);
				if (result == null) result = caseAct(deathDiagnosis);
				if (result == null) result = caseInfrastructureRoot(deathDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.FOODAND_WATER_CONSUMPTION: {
				FoodandWaterConsumption foodandWaterConsumption = (FoodandWaterConsumption)theEObject;
				T result = caseFoodandWaterConsumption(foodandWaterConsumption);
				if (result == null) result = caseObservation(foodandWaterConsumption);
				if (result == null) result = caseClinicalStatement(foodandWaterConsumption);
				if (result == null) result = caseAct(foodandWaterConsumption);
				if (result == null) result = caseInfrastructureRoot(foodandWaterConsumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.MACROSCOPIC_FINDING: {
				MacroscopicFinding macroscopicFinding = (MacroscopicFinding)theEObject;
				T result = caseMacroscopicFinding(macroscopicFinding);
				if (result == null) result = caseObservation(macroscopicFinding);
				if (result == null) result = caseClinicalStatement(macroscopicFinding);
				if (result == null) result = caseAct(macroscopicFinding);
				if (result == null) result = caseInfrastructureRoot(macroscopicFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.MICROSCOPIC_FINDING: {
				MicroscopicFinding microscopicFinding = (MicroscopicFinding)theEObject;
				T result = caseMicroscopicFinding(microscopicFinding);
				if (result == null) result = caseObservation(microscopicFinding);
				if (result == null) result = caseClinicalStatement(microscopicFinding);
				if (result == null) result = caseAct(microscopicFinding);
				if (result == null) result = caseInfrastructureRoot(microscopicFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.ORGAN_MEASUREMENT: {
				OrganMeasurement organMeasurement = (OrganMeasurement)theEObject;
				T result = caseOrganMeasurement(organMeasurement);
				if (result == null) result = caseObservation(organMeasurement);
				if (result == null) result = caseClinicalStatement(organMeasurement);
				if (result == null) result = caseAct(organMeasurement);
				if (result == null) result = caseInfrastructureRoot(organMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.PALPABLE_MASS: {
				PalpableMass palpableMass = (PalpableMass)theEObject;
				T result = casePalpableMass(palpableMass);
				if (result == null) result = caseObservation(palpableMass);
				if (result == null) result = caseClinicalStatement(palpableMass);
				if (result == null) result = caseAct(palpableMass);
				if (result == null) result = caseInfrastructureRoot(palpableMass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.TUMOR_FINDING: {
				TumorFinding tumorFinding = (TumorFinding)theEObject;
				T result = caseTumorFinding(tumorFinding);
				if (result == null) result = caseObservation(tumorFinding);
				if (result == null) result = caseClinicalStatement(tumorFinding);
				if (result == null) result = caseAct(tumorFinding);
				if (result == null) result = caseInfrastructureRoot(tumorFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.SUBJECT_POOL: {
				SubjectPool subjectPool = (SubjectPool)theEObject;
				T result = caseSubjectPool(subjectPool);
				if (result == null) result = caseCDA_Act(subjectPool);
				if (result == null) result = caseClinicalStatement(subjectPool);
				if (result == null) result = caseAct(subjectPool);
				if (result == null) result = caseInfrastructureRoot(subjectPool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.MASS_IDENTIFICATION: {
				MassIdentification massIdentification = (MassIdentification)theEObject;
				T result = caseMassIdentification(massIdentification);
				if (result == null) result = caseParticipant2(massIdentification);
				if (result == null) result = caseParticipation(massIdentification);
				if (result == null) result = caseInfrastructureRoot(massIdentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdtmPackage.REFERENCE_RANGE: {
				ReferenceRange referenceRange = (ReferenceRange)theEObject;
				T result = caseReferenceRange(referenceRange);
				if (result == null) result = caseObservationRange(referenceRange);
				if (result == null) result = caseAct(referenceRange);
				if (result == null) result = caseInfrastructureRoot(referenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Data Human Clinical Trials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Data Human Clinical Trials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectDataHumanClinicalTrials(SubjectDataHumanClinicalTrials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Clinical Subject Data Document Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Clinical Subject Data Document Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanClinicalSubjectDataDocumentSection(HumanClinicalSubjectDataDocumentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Clinical Subject Demographics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Clinical Subject Demographics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanClinicalSubjectDemographics(HumanClinicalSubjectDemographics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCollection(DataCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Study Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Study Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventStudyDay(EventStudyDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyArm(StudyArm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAssignment(DomainAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedRecord(RelatedRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplemental Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplemental Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplementalValue(SupplementalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencePeriod(ReferencePeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding About</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding About</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindingAbout(FindingAbout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupIdentifier(GroupIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Performance Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Performance Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonPerformanceReason(NonPerformanceReason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubCategory(SubCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisit(Visit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSign(VitalSign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingReference(TimingReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Study Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Study Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedStudyDay(PlannedStudyDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Day Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Day Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyDayPeriod(StudyDayPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionReason(ExclusionReason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positionof Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positionof Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionofSubject(PositionofSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECG Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECG Test Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECGTestResult(ECGTestResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Examination Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Examination Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExaminationFinding(PhysicalExaminationFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Systemor Organ Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Systemor Organ Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodySystemorOrganClass(BodySystemorOrganClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microbiology Specimen Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microbiology Specimen Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrobiologySpecimenFinding(MicrobiologySpecimenFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenInformation(SpecimenInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultCategory(ResultCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microbiology Susceptibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microbiology Susceptibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrobiologySusceptibility(MicrobiologySusceptibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pharmacokinetic Concentration Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pharmacokinetic Concentration Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePharmacokineticConcentrationFinding(PharmacokineticConcentrationFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fasting Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fasting Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFastingStatus(FastingStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assay Quantitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assay Quantitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssayQuantitation(AssayQuantitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Accountability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Accountability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrugAccountability(DrugAccountability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Clinical Laboratory Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Clinical Laboratory Test Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanClinicalLaboratoryTestResult(HumanClinicalLaboratoryTestResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toxicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toxicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToxicity(Toxicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireFinding(QuestionnaireFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pharmacokinetic Parameter Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pharmacokinetic Parameter Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePharmacokineticParameterFinding(PharmacokineticParameterFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectElement(SubjectElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Epoch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Epoch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyEpoch(StudyEpoch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Clinical Disposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Clinical Disposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanClinicalDisposition(HumanClinicalDisposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical History Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical History Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalHistoryItem(MedicalHistoryItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Specified Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Specified Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreSpecifiedEvent(PreSpecifiedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Relativeto Reference Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Relativeto Reference Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartRelativetoReferencePeriod(StartRelativetoReferencePeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Relativeto Reference Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Relativeto Reference Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopRelativetoReferencePeriod(StopRelativetoReferencePeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolDeviation(ProtocolDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalEvent(ClinicalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eventor Finding Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eventor Finding Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventorFindingSeverity(EventorFindingSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectCharacteristic(SubjectCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Subject Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Subject Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudySubjectEvent(StudySubjectEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serious Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serious Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriousEvent(SeriousEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Treatment Action Taken</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Treatment Action Taken</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyTreatmentActionTaken(StudyTreatmentActionTaken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Treatment Action Taken</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Treatment Action Taken</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherTreatmentActionTaken(OtherTreatmentActionTaken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Treatment Causality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Treatment Causality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyTreatmentCausality(StudyTreatmentCausality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Study Treatment Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Study Treatment Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonStudyTreatmentRelationship(NonStudyTreatmentRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventPattern(EventPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventOutcome(EventOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concomitant Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concomitant Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcomitantTreatment(ConcomitantTreatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDuration(EventDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Subject Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Subject Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudySubjectFinding(StudySubjectFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Death Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Death Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeathRelationship(DeathRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Subject Intervention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Subject Intervention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudySubjectIntervention(StudySubjectIntervention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndication(Indication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intended Regimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intended Regimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntendedRegimen(IntendedRegimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dose Adjustment Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dose Adjustment Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoseAdjustmentReason(DoseAdjustmentReason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEvent(AdverseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusionor Exclusion Criteria Not Met</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusionor Exclusion Criteria Not Met</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusionorExclusionCriteriaNotMet(InclusionorExclusionCriteriaNotMet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concomitant Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concomitant Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcomitantMedication(ConcomitantMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumable Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumable Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumableMaterial(ConsumableMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Clinical Exposure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Clinical Exposure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanClinicalExposure(HumanClinicalExposure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceUse(SubstanceUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonhuman Laboratory Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonhuman Laboratory Test Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonhumanLaboratoryTestResult(NonhumanLaboratoryTestResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Test Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Test Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyTestOrganization(StudyTestOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Finding Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Finding Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyFindingEvaluator(StudyFindingEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Data Non Clinical Trials</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Data Non Clinical Trials</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectDataNonClinicalTrials(SubjectDataNonClinicalTrials object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonhuman Subject Data Document Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonhuman Subject Data Document Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonhumanSubjectDataDocumentSection(NonhumanSubjectDataDocumentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonhuman Subject Demographics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonhuman Subject Demographics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonhumanSubjectDemographics(NonhumanSubjectDemographics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonhuman Disposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonhuman Disposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonhumanDisposition(NonhumanDisposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonhuman Exposure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonhuman Exposure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonhumanExposure(NonhumanExposure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyWeight(BodyWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Weight Gain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Weight Gain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyWeightGain(BodyWeightGain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalObservation(ClinicalObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Death Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Death Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeathDiagnosis(DeathDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foodand Water Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foodand Water Consumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFoodandWaterConsumption(FoodandWaterConsumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macroscopic Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macroscopic Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroscopicFinding(MacroscopicFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microscopic Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microscopic Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroscopicFinding(MicroscopicFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organ Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organ Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganMeasurement(OrganMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Palpable Mass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Palpable Mass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePalpableMass(PalpableMass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tumor Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tumor Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTumorFinding(TumorFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectPool(SubjectPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassIdentification(MassIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceRange(ReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAdministration(SubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumable(Consumable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant2(Participant2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationRange(ObservationRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SdtmSwitch
