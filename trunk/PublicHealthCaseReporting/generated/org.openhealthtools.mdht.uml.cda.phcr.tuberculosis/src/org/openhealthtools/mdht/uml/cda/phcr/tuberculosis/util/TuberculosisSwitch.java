/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.*;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage
 * @generated
 */
public class TuberculosisSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TuberculosisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisSwitch() {
		if (modelPackage == null) {
			modelPackage = TuberculosisPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TuberculosisPackage.TUBERCULOSIS_CASE_REPORT: {
				TuberculosisCaseReport tuberculosisCaseReport = (TuberculosisCaseReport)theEObject;
				T result = caseTuberculosisCaseReport(tuberculosisCaseReport);
				if (result == null) result = casePublicHealthCaseReport(tuberculosisCaseReport);
				if (result == null) result = caseClinicalDocument(tuberculosisCaseReport);
				if (result == null) result = caseAct(tuberculosisCaseReport);
				if (result == null) result = caseInfrastructureRoot(tuberculosisCaseReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION: {
				TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection = (TuberculosisPHCRSocialHistorySection)theEObject;
				T result = caseTuberculosisPHCRSocialHistorySection(tuberculosisPHCRSocialHistorySection);
				if (result == null) result = casePhcrSocialHistorySection(tuberculosisPHCRSocialHistorySection);
				if (result == null) result = caseSocialHistorySection(tuberculosisPHCRSocialHistorySection);
				if (result == null) result = caseSection(tuberculosisPHCRSocialHistorySection);
				if (result == null) result = caseAct(tuberculosisPHCRSocialHistorySection);
				if (result == null) result = caseInfrastructureRoot(tuberculosisPHCRSocialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT: {
				TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct = (TuberculosisPossibleExposureLocationAct)theEObject;
				T result = caseTuberculosisPossibleExposureLocationAct(tuberculosisPossibleExposureLocationAct);
				if (result == null) result = caseCDA_Act(tuberculosisPossibleExposureLocationAct);
				if (result == null) result = caseClinicalStatement(tuberculosisPossibleExposureLocationAct);
				if (result == null) result = caseAct(tuberculosisPossibleExposureLocationAct);
				if (result == null) result = caseInfrastructureRoot(tuberculosisPossibleExposureLocationAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION: {
				TuberculosisSocioBehavioralBooleanRiskFactorObservation tuberculosisSocioBehavioralBooleanRiskFactorObservation = (TuberculosisSocioBehavioralBooleanRiskFactorObservation)theEObject;
				T result = caseTuberculosisSocioBehavioralBooleanRiskFactorObservation(tuberculosisSocioBehavioralBooleanRiskFactorObservation);
				if (result == null) result = caseSocialHistoryObservation(tuberculosisSocioBehavioralBooleanRiskFactorObservation);
				if (result == null) result = caseObservation(tuberculosisSocioBehavioralBooleanRiskFactorObservation);
				if (result == null) result = caseClinicalStatement(tuberculosisSocioBehavioralBooleanRiskFactorObservation);
				if (result == null) result = caseAct(tuberculosisSocioBehavioralBooleanRiskFactorObservation);
				if (result == null) result = caseInfrastructureRoot(tuberculosisSocioBehavioralBooleanRiskFactorObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.SMOKING_STATUS_OBSERVATION: {
				SmokingStatusObservation smokingStatusObservation = (SmokingStatusObservation)theEObject;
				T result = caseSmokingStatusObservation(smokingStatusObservation);
				if (result == null) result = caseSocialHistoryObservation(smokingStatusObservation);
				if (result == null) result = caseObservation(smokingStatusObservation);
				if (result == null) result = caseClinicalStatement(smokingStatusObservation);
				if (result == null) result = caseAct(smokingStatusObservation);
				if (result == null) result = caseInfrastructureRoot(smokingStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.HIV_STATUS_OBSERVATION: {
				HIVStatusObservation hivStatusObservation = (HIVStatusObservation)theEObject;
				T result = caseHIVStatusObservation(hivStatusObservation);
				if (result == null) result = caseObservation(hivStatusObservation);
				if (result == null) result = caseClinicalStatement(hivStatusObservation);
				if (result == null) result = caseAct(hivStatusObservation);
				if (result == null) result = caseInfrastructureRoot(hivStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION: {
				TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection = (TuberculosisPHCRClinicalInformationSection)theEObject;
				T result = caseTuberculosisPHCRClinicalInformationSection(tuberculosisPHCRClinicalInformationSection);
				if (result == null) result = casePhcrClinicalInformationSection(tuberculosisPHCRClinicalInformationSection);
				if (result == null) result = caseSection(tuberculosisPHCRClinicalInformationSection);
				if (result == null) result = caseAct(tuberculosisPHCRClinicalInformationSection);
				if (result == null) result = caseInfrastructureRoot(tuberculosisPHCRClinicalInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_CASE_OBSERVATION: {
				TuberculosisCaseObservation tuberculosisCaseObservation = (TuberculosisCaseObservation)theEObject;
				T result = caseTuberculosisCaseObservation(tuberculosisCaseObservation);
				if (result == null) result = caseCaseObservation(tuberculosisCaseObservation);
				if (result == null) result = caseProblemObservation(tuberculosisCaseObservation);
				if (result == null) result = caseObservation(tuberculosisCaseObservation);
				if (result == null) result = caseClinicalStatement(tuberculosisCaseObservation);
				if (result == null) result = caseAct(tuberculosisCaseObservation);
				if (result == null) result = caseInfrastructureRoot(tuberculosisCaseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION: {
				TuberculosisSignsAndSymptomsObservation tuberculosisSignsAndSymptomsObservation = (TuberculosisSignsAndSymptomsObservation)theEObject;
				T result = caseTuberculosisSignsAndSymptomsObservation(tuberculosisSignsAndSymptomsObservation);
				if (result == null) result = caseSignsAndSymptomsObservation(tuberculosisSignsAndSymptomsObservation);
				if (result == null) result = caseObservation(tuberculosisSignsAndSymptomsObservation);
				if (result == null) result = caseClinicalStatement(tuberculosisSignsAndSymptomsObservation);
				if (result == null) result = caseAct(tuberculosisSignsAndSymptomsObservation);
				if (result == null) result = caseInfrastructureRoot(tuberculosisSignsAndSymptomsObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION: {
				TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation = (TuberculosisSiteOfTBDiseaseObservation)theEObject;
				T result = caseTuberculosisSiteOfTBDiseaseObservation(tuberculosisSiteOfTBDiseaseObservation);
				if (result == null) result = caseObservation(tuberculosisSiteOfTBDiseaseObservation);
				if (result == null) result = caseClinicalStatement(tuberculosisSiteOfTBDiseaseObservation);
				if (result == null) result = caseAct(tuberculosisSiteOfTBDiseaseObservation);
				if (result == null) result = caseInfrastructureRoot(tuberculosisSiteOfTBDiseaseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION: {
				TuberculosisRelevantMedicalConditionHistoryObservation tuberculosisRelevantMedicalConditionHistoryObservation = (TuberculosisRelevantMedicalConditionHistoryObservation)theEObject;
				T result = caseTuberculosisRelevantMedicalConditionHistoryObservation(tuberculosisRelevantMedicalConditionHistoryObservation);
				if (result == null) result = casePhcrRelevantMedicalConditionHistoryObservation(tuberculosisRelevantMedicalConditionHistoryObservation);
				if (result == null) result = caseObservation(tuberculosisRelevantMedicalConditionHistoryObservation);
				if (result == null) result = caseClinicalStatement(tuberculosisRelevantMedicalConditionHistoryObservation);
				if (result == null) result = caseAct(tuberculosisRelevantMedicalConditionHistoryObservation);
				if (result == null) result = caseInfrastructureRoot(tuberculosisRelevantMedicalConditionHistoryObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION: {
				TuberculosisRelevantMedicalConditionProblemObservation tuberculosisRelevantMedicalConditionProblemObservation = (TuberculosisRelevantMedicalConditionProblemObservation)theEObject;
				T result = caseTuberculosisRelevantMedicalConditionProblemObservation(tuberculosisRelevantMedicalConditionProblemObservation);
				if (result == null) result = caseProblemObservation(tuberculosisRelevantMedicalConditionProblemObservation);
				if (result == null) result = caseObservation(tuberculosisRelevantMedicalConditionProblemObservation);
				if (result == null) result = caseClinicalStatement(tuberculosisRelevantMedicalConditionProblemObservation);
				if (result == null) result = caseAct(tuberculosisRelevantMedicalConditionProblemObservation);
				if (result == null) result = caseInfrastructureRoot(tuberculosisRelevantMedicalConditionProblemObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION: {
				TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection = (TuberculosisPHCRRelevantDxTestsSection)theEObject;
				T result = caseTuberculosisPHCRRelevantDxTestsSection(tuberculosisPHCRRelevantDxTestsSection);
				if (result == null) result = casePhcrRelevantDxTestsSection(tuberculosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseResultsSection(tuberculosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseSection(tuberculosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseAct(tuberculosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseInfrastructureRoot(tuberculosisPHCRRelevantDxTestsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_RESULT_ORGANIZER: {
				TuberculosisResultOrganizer tuberculosisResultOrganizer = (TuberculosisResultOrganizer)theEObject;
				T result = caseTuberculosisResultOrganizer(tuberculosisResultOrganizer);
				if (result == null) result = casePhcr_ResultOrganizer(tuberculosisResultOrganizer);
				if (result == null) result = caseResultOrganizer(tuberculosisResultOrganizer);
				if (result == null) result = caseOrganizer(tuberculosisResultOrganizer);
				if (result == null) result = caseClinicalStatement(tuberculosisResultOrganizer);
				if (result == null) result = caseAct(tuberculosisResultOrganizer);
				if (result == null) result = caseInfrastructureRoot(tuberculosisResultOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_RESULT_OBSERVATION: {
				TuberculosisResultObservation tuberculosisResultObservation = (TuberculosisResultObservation)theEObject;
				T result = caseTuberculosisResultObservation(tuberculosisResultObservation);
				if (result == null) result = casePhcr_ResultObservation(tuberculosisResultObservation);
				if (result == null) result = caseResultObservation(tuberculosisResultObservation);
				if (result == null) result = caseObservation(tuberculosisResultObservation);
				if (result == null) result = caseClinicalStatement(tuberculosisResultObservation);
				if (result == null) result = caseAct(tuberculosisResultObservation);
				if (result == null) result = caseInfrastructureRoot(tuberculosisResultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION: {
				TuberculosisPHCRTreatmentInformationSection tuberculosisPHCRTreatmentInformationSection = (TuberculosisPHCRTreatmentInformationSection)theEObject;
				T result = caseTuberculosisPHCRTreatmentInformationSection(tuberculosisPHCRTreatmentInformationSection);
				if (result == null) result = casePhcrTreatmentInformationSection(tuberculosisPHCRTreatmentInformationSection);
				if (result == null) result = caseSection(tuberculosisPHCRTreatmentInformationSection);
				if (result == null) result = caseAct(tuberculosisPHCRTreatmentInformationSection);
				if (result == null) result = caseInfrastructureRoot(tuberculosisPHCRTreatmentInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT: {
				TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct = (TuberculosisTherapeuticRegimenAct)theEObject;
				T result = caseTuberculosisTherapeuticRegimenAct(tuberculosisTherapeuticRegimenAct);
				if (result == null) result = caseTherapeuticRegimenAct(tuberculosisTherapeuticRegimenAct);
				if (result == null) result = caseCDA_Act(tuberculosisTherapeuticRegimenAct);
				if (result == null) result = caseClinicalStatement(tuberculosisTherapeuticRegimenAct);
				if (result == null) result = caseAct(tuberculosisTherapeuticRegimenAct);
				if (result == null) result = caseInfrastructureRoot(tuberculosisTherapeuticRegimenAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				TuberculosisTreatmentGivenSubstanceAdministration tuberculosisTreatmentGivenSubstanceAdministration = (TuberculosisTreatmentGivenSubstanceAdministration)theEObject;
				T result = caseTuberculosisTreatmentGivenSubstanceAdministration(tuberculosisTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentGivenSubstanceAdministration(tuberculosisTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(tuberculosisTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(tuberculosisTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseAct(tuberculosisTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(tuberculosisTreatmentGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				TuberculosisTreatmentNotGivenSubstanceAdministration tuberculosisTreatmentNotGivenSubstanceAdministration = (TuberculosisTreatmentNotGivenSubstanceAdministration)theEObject;
				T result = caseTuberculosisTreatmentNotGivenSubstanceAdministration(tuberculosisTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(tuberculosisTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(tuberculosisTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(tuberculosisTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseAct(tuberculosisTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(tuberculosisTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION: {
				TuberculosisPHCRImmunizationSection tuberculosisPHCRImmunizationSection = (TuberculosisPHCRImmunizationSection)theEObject;
				T result = caseTuberculosisPHCRImmunizationSection(tuberculosisPHCRImmunizationSection);
				if (result == null) result = caseImmunizationsSection(tuberculosisPHCRImmunizationSection);
				if (result == null) result = caseSection(tuberculosisPHCRImmunizationSection);
				if (result == null) result = caseAct(tuberculosisPHCRImmunizationSection);
				if (result == null) result = caseInfrastructureRoot(tuberculosisPHCRImmunizationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION: {
				TuberculosisImmunizationActivitySubstanceAdministration tuberculosisImmunizationActivitySubstanceAdministration = (TuberculosisImmunizationActivitySubstanceAdministration)theEObject;
				T result = caseTuberculosisImmunizationActivitySubstanceAdministration(tuberculosisImmunizationActivitySubstanceAdministration);
				if (result == null) result = caseMedicationActivity(tuberculosisImmunizationActivitySubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(tuberculosisImmunizationActivitySubstanceAdministration);
				if (result == null) result = caseClinicalStatement(tuberculosisImmunizationActivitySubstanceAdministration);
				if (result == null) result = caseAct(tuberculosisImmunizationActivitySubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(tuberculosisImmunizationActivitySubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TuberculosisPackage.TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT: {
				TuberculosisImmunizationManufacturedProduct tuberculosisImmunizationManufacturedProduct = (TuberculosisImmunizationManufacturedProduct)theEObject;
				T result = caseTuberculosisImmunizationManufacturedProduct(tuberculosisImmunizationManufacturedProduct);
				if (result == null) result = caseProduct(tuberculosisImmunizationManufacturedProduct);
				if (result == null) result = caseManufacturedProduct(tuberculosisImmunizationManufacturedProduct);
				if (result == null) result = caseRole(tuberculosisImmunizationManufacturedProduct);
				if (result == null) result = caseInfrastructureRoot(tuberculosisImmunizationManufacturedProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisCaseReport(TuberculosisCaseReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHCR Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisPHCRSocialHistorySection(TuberculosisPHCRSocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possible Exposure Location Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisPossibleExposureLocationAct(TuberculosisPossibleExposureLocationAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisSocioBehavioralBooleanRiskFactorObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smoking Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmokingStatusObservation(SmokingStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIV Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIV Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIVStatusObservation(HIVStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHCR Clinical Information Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisPHCRClinicalInformationSection(TuberculosisPHCRClinicalInformationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisCaseObservation(TuberculosisCaseObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signs And Symptoms Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisSignsAndSymptomsObservation(TuberculosisSignsAndSymptomsObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relevant Medical Condition History Observation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevant Medical Condition History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisRelevantMedicalConditionHistoryObservation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Relevant Medical Condition Problem Observation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevant Medical Condition Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTuberculosisRelevantMedicalConditionProblemObservation(TuberculosisRelevantMedicalConditionProblemObservation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisPHCRRelevantDxTestsSection(TuberculosisPHCRRelevantDxTestsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisResultOrganizer(TuberculosisResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisResultObservation(TuberculosisResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHCR Treatment Information Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisPHCRTreatmentInformationSection(TuberculosisPHCRTreatmentInformationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Therapeutic Regimen Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisTherapeuticRegimenAct(TuberculosisTherapeuticRegimenAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Given Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTreatmentGivenSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Not Given Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTreatmentNotGivenSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHCR Immunization Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHCR Immunization Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuberculosisPHCRImmunizationSection(TuberculosisPHCRImmunizationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Activity Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisImmunizationActivitySubstanceAdministration object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Manufactured Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTuberculosisImmunizationManufacturedProduct(TuberculosisImmunizationManufacturedProduct object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Of TB Disease Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTuberculosisSiteOfTBDiseaseObservation(TuberculosisSiteOfTBDiseaseObservation object)
  {
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
	 * Returns the result of interpreting the object as an instance of '<em>Public Health Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Health Case Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicHealthCaseReport(PublicHealthCaseReport object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistorySection(SocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhcrSocialHistorySection(PhcrSocialHistorySection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryObservation(SocialHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Information Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhcrClinicalInformationSection(PhcrClinicalInformationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemObservation(ProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseObservation(CaseObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signs And Symptoms Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignsAndSymptomsObservation(SignsAndSymptomsObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relevant Medical Condition History Observation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevant Medical Condition History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePhcrRelevantMedicalConditionHistoryObservation(PhcrRelevantMedicalConditionHistoryObservation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection(ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevant Dx Tests Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOrganizer(ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhcr_ResultOrganizer(org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation(ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhcr_ResultObservation(org.openhealthtools.mdht.uml.cda.phcr.ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Information Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhcrTreatmentInformationSection(PhcrTreatmentInformationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Therapeutic Regimen Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTherapeuticRegimenAct(TherapeuticRegimenAct object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Given Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Not Given Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSection(ImmunizationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationActivity(MedicationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturedProduct(ManufacturedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //TuberculosisSwitch
