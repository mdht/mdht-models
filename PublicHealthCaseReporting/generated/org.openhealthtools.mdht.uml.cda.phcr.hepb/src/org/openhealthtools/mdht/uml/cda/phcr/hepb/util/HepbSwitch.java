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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.*;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage
 * @generated
 */
public class HepbSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static HepbPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HepbSwitch() {
    if (modelPackage == null)
    {
      modelPackage = HepbPackage.eINSTANCE;
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
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
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
    switch (classifierID)
    {
      case HepbPackage.ACUTE_HEPATITIS_BCASE_REPORT:
      {
        AcuteHepatitisBCaseReport acuteHepatitisBCaseReport = (AcuteHepatitisBCaseReport)theEObject;
        T result = caseAcuteHepatitisBCaseReport(acuteHepatitisBCaseReport);
        if (result == null) result = casePublicHealthCaseReport(acuteHepatitisBCaseReport);
        if (result == null) result = caseClinicalDocument(acuteHepatitisBCaseReport);
        if (result == null) result = caseAct(acuteHepatitisBCaseReport);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBCaseReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION:
      {
        AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection = (AcuteHepatitisBSocialHistorySection)theEObject;
        T result = caseAcuteHepatitisBSocialHistorySection(acuteHepatitisBSocialHistorySection);
        if (result == null) result = casePhcrSocialHistorySection(acuteHepatitisBSocialHistorySection);
        if (result == null) result = caseSocialHistorySection(acuteHepatitisBSocialHistorySection);
        if (result == null) result = caseSection(acuteHepatitisBSocialHistorySection);
        if (result == null) result = caseAct(acuteHepatitisBSocialHistorySection);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBSocialHistorySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION:
      {
        JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation = (JobRelatedBodyFluidExposureRiskFrequencyObservation)theEObject;
        T result = caseJobRelatedBodyFluidExposureRiskFrequencyObservation(jobRelatedBodyFluidExposureRiskFrequencyObservation);
        if (result == null) result = caseObservation(jobRelatedBodyFluidExposureRiskFrequencyObservation);
        if (result == null) result = caseClinicalStatement(jobRelatedBodyFluidExposureRiskFrequencyObservation);
        if (result == null) result = caseAct(jobRelatedBodyFluidExposureRiskFrequencyObservation);
        if (result == null) result = caseInfrastructureRoot(jobRelatedBodyFluidExposureRiskFrequencyObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT:
      {
        AcuteHepatitisBPossibleExposureLocationAndTypeAct acuteHepatitisBPossibleExposureLocationAndTypeAct = (AcuteHepatitisBPossibleExposureLocationAndTypeAct)theEObject;
        T result = caseAcuteHepatitisBPossibleExposureLocationAndTypeAct(acuteHepatitisBPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseCDA_Act(acuteHepatitisBPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseAct(acuteHepatitisBPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBPossibleExposureLocationAndTypeAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION:
      {
        AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation = (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)theEObject;
        T result = caseAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseSocialHistoryObservation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseObservation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseAct(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION:
      {
        AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation = (AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)theEObject;
        T result = caseAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation);
        if (result == null) result = caseObservation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation);
        if (result == null) result = caseAct(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION:
      {
        AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection = (AcuteHepatitisBPHCRClinicalInformationSection)theEObject;
        T result = caseAcuteHepatitisBPHCRClinicalInformationSection(acuteHepatitisBPHCRClinicalInformationSection);
        if (result == null) result = casePhcrClinicalInformationSection(acuteHepatitisBPHCRClinicalInformationSection);
        if (result == null) result = caseSection(acuteHepatitisBPHCRClinicalInformationSection);
        if (result == null) result = caseAct(acuteHepatitisBPHCRClinicalInformationSection);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBPHCRClinicalInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BCASE_OBSERVATION:
      {
        AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation = (AcuteHepatitisBCaseObservation)theEObject;
        T result = caseAcuteHepatitisBCaseObservation(acuteHepatitisBCaseObservation);
        if (result == null) result = caseCaseObservation(acuteHepatitisBCaseObservation);
        if (result == null) result = caseProblemObservation(acuteHepatitisBCaseObservation);
        if (result == null) result = caseObservation(acuteHepatitisBCaseObservation);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBCaseObservation);
        if (result == null) result = caseAct(acuteHepatitisBCaseObservation);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBCaseObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION:
      {
        AcuteHepatitisBSignsAndSymptomsObservation acuteHepatitisBSignsAndSymptomsObservation = (AcuteHepatitisBSignsAndSymptomsObservation)theEObject;
        T result = caseAcuteHepatitisBSignsAndSymptomsObservation(acuteHepatitisBSignsAndSymptomsObservation);
        if (result == null) result = caseSignsAndSymptomsObservation(acuteHepatitisBSignsAndSymptomsObservation);
        if (result == null) result = caseObservation(acuteHepatitisBSignsAndSymptomsObservation);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBSignsAndSymptomsObservation);
        if (result == null) result = caseAct(acuteHepatitisBSignsAndSymptomsObservation);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBSignsAndSymptomsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE:
      {
        AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure = (AcuteHepatitisBRiskAssociatedProcedure)theEObject;
        T result = caseAcuteHepatitisBRiskAssociatedProcedure(acuteHepatitisBRiskAssociatedProcedure);
        if (result == null) result = caseProcedure(acuteHepatitisBRiskAssociatedProcedure);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBRiskAssociatedProcedure);
        if (result == null) result = caseAct(acuteHepatitisBRiskAssociatedProcedure);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBRiskAssociatedProcedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.VIRAL_HEPATITIS_HISTORY_OBSERVATION:
      {
        ViralHepatitisHistoryObservation viralHepatitisHistoryObservation = (ViralHepatitisHistoryObservation)theEObject;
        T result = caseViralHepatitisHistoryObservation(viralHepatitisHistoryObservation);
        if (result == null) result = caseProblemObservation(viralHepatitisHistoryObservation);
        if (result == null) result = caseObservation(viralHepatitisHistoryObservation);
        if (result == null) result = caseClinicalStatement(viralHepatitisHistoryObservation);
        if (result == null) result = caseAct(viralHepatitisHistoryObservation);
        if (result == null) result = caseInfrastructureRoot(viralHepatitisHistoryObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.STD_HISTORY_OBSERVATION:
      {
        STDHistoryObservation stdHistoryObservation = (STDHistoryObservation)theEObject;
        T result = caseSTDHistoryObservation(stdHistoryObservation);
        if (result == null) result = caseProblemObservation(stdHistoryObservation);
        if (result == null) result = caseObservation(stdHistoryObservation);
        if (result == null) result = caseClinicalStatement(stdHistoryObservation);
        if (result == null) result = caseAct(stdHistoryObservation);
        if (result == null) result = caseInfrastructureRoot(stdHistoryObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION:
      {
        AcuteHepatitisBImmunizationSection acuteHepatitisBImmunizationSection = (AcuteHepatitisBImmunizationSection)theEObject;
        T result = caseAcuteHepatitisBImmunizationSection(acuteHepatitisBImmunizationSection);
        if (result == null) result = caseImmunizationsSection(acuteHepatitisBImmunizationSection);
        if (result == null) result = caseSection(acuteHepatitisBImmunizationSection);
        if (result == null) result = caseAct(acuteHepatitisBImmunizationSection);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBImmunizationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY:
      {
        AcuteHepatitisBImmunizationActivity acuteHepatitisBImmunizationActivity = (AcuteHepatitisBImmunizationActivity)theEObject;
        T result = caseAcuteHepatitisBImmunizationActivity(acuteHepatitisBImmunizationActivity);
        if (result == null) result = caseMedicationActivity(acuteHepatitisBImmunizationActivity);
        if (result == null) result = caseSubstanceAdministration(acuteHepatitisBImmunizationActivity);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBImmunizationActivity);
        if (result == null) result = caseAct(acuteHepatitisBImmunizationActivity);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBImmunizationActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION:
      {
        AcuteHepatitisBPHCRTreatmentInformationSection acuteHepatitisBPHCRTreatmentInformationSection = (AcuteHepatitisBPHCRTreatmentInformationSection)theEObject;
        T result = caseAcuteHepatitisBPHCRTreatmentInformationSection(acuteHepatitisBPHCRTreatmentInformationSection);
        if (result == null) result = casePhcrTreatmentInformationSection(acuteHepatitisBPHCRTreatmentInformationSection);
        if (result == null) result = caseSection(acuteHepatitisBPHCRTreatmentInformationSection);
        if (result == null) result = caseAct(acuteHepatitisBPHCRTreatmentInformationSection);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBPHCRTreatmentInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT:
      {
        AcuteHepatitisBTherapeuticRegimenAct acuteHepatitisBTherapeuticRegimenAct = (AcuteHepatitisBTherapeuticRegimenAct)theEObject;
        T result = caseAcuteHepatitisBTherapeuticRegimenAct(acuteHepatitisBTherapeuticRegimenAct);
        if (result == null) result = caseTherapeuticRegimenAct(acuteHepatitisBTherapeuticRegimenAct);
        if (result == null) result = caseCDA_Act(acuteHepatitisBTherapeuticRegimenAct);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBTherapeuticRegimenAct);
        if (result == null) result = caseAct(acuteHepatitisBTherapeuticRegimenAct);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBTherapeuticRegimenAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION:
      {
        AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection = (AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)theEObject;
        T result = caseAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
        if (result == null) result = casePhcrRelevantDxTestsSection(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
        if (result == null) result = caseResultsSection(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
        if (result == null) result = caseSection(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
        if (result == null) result = caseAct(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BRESULT_OBSERVATION:
      {
        AcuteHepatitisBResultObservation acuteHepatitisBResultObservation = (AcuteHepatitisBResultObservation)theEObject;
        T result = caseAcuteHepatitisBResultObservation(acuteHepatitisBResultObservation);
        if (result == null) result = casePhcr_ResultObservation(acuteHepatitisBResultObservation);
        if (result == null) result = caseResultObservation(acuteHepatitisBResultObservation);
        if (result == null) result = caseObservation(acuteHepatitisBResultObservation);
        if (result == null) result = caseClinicalStatement(acuteHepatitisBResultObservation);
        if (result == null) result = caseAct(acuteHepatitisBResultObservation);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBResultObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT:
      {
        AcuteHepatitisBImmunizationProduct acuteHepatitisBImmunizationProduct = (AcuteHepatitisBImmunizationProduct)theEObject;
        T result = caseAcuteHepatitisBImmunizationProduct(acuteHepatitisBImmunizationProduct);
        if (result == null) result = caseProduct(acuteHepatitisBImmunizationProduct);
        if (result == null) result = caseManufacturedProduct(acuteHepatitisBImmunizationProduct);
        if (result == null) result = caseRole(acuteHepatitisBImmunizationProduct);
        if (result == null) result = caseInfrastructureRoot(acuteHepatitisBImmunizationProduct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BCase Report</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BCase Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBCaseReport(AcuteHepatitisBCaseReport object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BSocial History Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BSocial History Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBSocialHistorySection(AcuteHepatitisBSocialHistorySection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseJobRelatedBodyFluidExposureRiskFrequencyObservation(JobRelatedBodyFluidExposureRiskFrequencyObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBPossibleExposureLocationAndTypeAct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BImmunization Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BImmunization Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBImmunizationSection(AcuteHepatitisBImmunizationSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BImmunization Activity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BImmunization Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationActivity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBPHCRClinicalInformationSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BCase Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BCase Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBCaseObservation(AcuteHepatitisBCaseObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BSigns And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BSigns And Symptoms Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBSignsAndSymptomsObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBRiskAssociatedProcedure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Viral Hepatitis History Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viral Hepatitis History Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseViralHepatitisHistoryObservation(ViralHepatitisHistoryObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>STD History Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STD History Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSTDHistoryObservation(STDHistoryObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BPHCR Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BPHCR Treatment Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBPHCRTreatmentInformationSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BTherapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BTherapeutic Regimen Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBTherapeuticRegimenAct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BResult Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BResult Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBResultObservation(AcuteHepatitisBResultObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Acute Hepatitis BImmunization Product</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acute Hepatitis BImmunization Product</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAcuteHepatitisBImmunizationProduct(AcuteHepatitisBImmunizationProduct object) {
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

} //HepbSwitch
