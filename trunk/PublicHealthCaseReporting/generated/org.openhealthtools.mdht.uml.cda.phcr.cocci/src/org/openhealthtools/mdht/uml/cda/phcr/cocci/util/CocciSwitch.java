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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.*;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage
 * @generated
 */
public class CocciSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static CocciPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CocciSwitch() {
    if (modelPackage == null)
    {
      modelPackage = CocciPackage.eINSTANCE;
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
      case CocciPackage.COCCIDIOIDES_CASE_REPORT:
      {
        CoccidioidesCaseReport coccidioidesCaseReport = (CoccidioidesCaseReport)theEObject;
        T result = caseCoccidioidesCaseReport(coccidioidesCaseReport);
        if (result == null) result = casePublicHealthCaseReport(coccidioidesCaseReport);
        if (result == null) result = caseClinicalDocument(coccidioidesCaseReport);
        if (result == null) result = caseAct(coccidioidesCaseReport);
        if (result == null) result = caseInfrastructureRoot(coccidioidesCaseReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION:
      {
        CoccidioidesPHCRSocialHistorySection coccidioidesPHCRSocialHistorySection = (CoccidioidesPHCRSocialHistorySection)theEObject;
        T result = caseCoccidioidesPHCRSocialHistorySection(coccidioidesPHCRSocialHistorySection);
        if (result == null) result = casePhcrSocialHistorySection(coccidioidesPHCRSocialHistorySection);
        if (result == null) result = caseSocialHistorySection(coccidioidesPHCRSocialHistorySection);
        if (result == null) result = caseSection(coccidioidesPHCRSocialHistorySection);
        if (result == null) result = caseAct(coccidioidesPHCRSocialHistorySection);
        if (result == null) result = caseInfrastructureRoot(coccidioidesPHCRSocialHistorySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT:
      {
        CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct = (CoccidioidesPossibleExposureLocationAct)theEObject;
        T result = caseCoccidioidesPossibleExposureLocationAct(coccidioidesPossibleExposureLocationAct);
        if (result == null) result = caseCDA_Act(coccidioidesPossibleExposureLocationAct);
        if (result == null) result = caseClinicalStatement(coccidioidesPossibleExposureLocationAct);
        if (result == null) result = caseAct(coccidioidesPossibleExposureLocationAct);
        if (result == null) result = caseInfrastructureRoot(coccidioidesPossibleExposureLocationAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION:
      {
        CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection = (CoccidioidesPHCRClinicalInformationSection)theEObject;
        T result = caseCoccidioidesPHCRClinicalInformationSection(coccidioidesPHCRClinicalInformationSection);
        if (result == null) result = casePhcrClinicalInformationSection(coccidioidesPHCRClinicalInformationSection);
        if (result == null) result = caseSection(coccidioidesPHCRClinicalInformationSection);
        if (result == null) result = caseAct(coccidioidesPHCRClinicalInformationSection);
        if (result == null) result = caseInfrastructureRoot(coccidioidesPHCRClinicalInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_CASE_OBSERVATION:
      {
        CoccidioidesCaseObservation coccidioidesCaseObservation = (CoccidioidesCaseObservation)theEObject;
        T result = caseCoccidioidesCaseObservation(coccidioidesCaseObservation);
        if (result == null) result = caseCaseObservation(coccidioidesCaseObservation);
        if (result == null) result = caseProblemObservation(coccidioidesCaseObservation);
        if (result == null) result = caseObservation(coccidioidesCaseObservation);
        if (result == null) result = caseClinicalStatement(coccidioidesCaseObservation);
        if (result == null) result = caseAct(coccidioidesCaseObservation);
        if (result == null) result = caseInfrastructureRoot(coccidioidesCaseObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_SIGNS_AND_SYMPTOMS_OBSERVATION:
      {
        CoccidioidesSignsAndSymptomsObservation coccidioidesSignsAndSymptomsObservation = (CoccidioidesSignsAndSymptomsObservation)theEObject;
        T result = caseCoccidioidesSignsAndSymptomsObservation(coccidioidesSignsAndSymptomsObservation);
        if (result == null) result = caseSignsAndSymptomsObservation(coccidioidesSignsAndSymptomsObservation);
        if (result == null) result = caseObservation(coccidioidesSignsAndSymptomsObservation);
        if (result == null) result = caseClinicalStatement(coccidioidesSignsAndSymptomsObservation);
        if (result == null) result = caseAct(coccidioidesSignsAndSymptomsObservation);
        if (result == null) result = caseInfrastructureRoot(coccidioidesSignsAndSymptomsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION:
      {
        CoccidioidesImmunosuppressedMedicalConditionHistoryObservation coccidioidesImmunosuppressedMedicalConditionHistoryObservation = (CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)theEObject;
        T result = caseCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(coccidioidesImmunosuppressedMedicalConditionHistoryObservation);
        if (result == null) result = casePhcrRelevantMedicalConditionHistoryObservation(coccidioidesImmunosuppressedMedicalConditionHistoryObservation);
        if (result == null) result = caseObservation(coccidioidesImmunosuppressedMedicalConditionHistoryObservation);
        if (result == null) result = caseClinicalStatement(coccidioidesImmunosuppressedMedicalConditionHistoryObservation);
        if (result == null) result = caseAct(coccidioidesImmunosuppressedMedicalConditionHistoryObservation);
        if (result == null) result = caseInfrastructureRoot(coccidioidesImmunosuppressedMedicalConditionHistoryObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION:
      {
        CoccidioidesImmunosuppressedMedicalConditionProblemObservation coccidioidesImmunosuppressedMedicalConditionProblemObservation = (CoccidioidesImmunosuppressedMedicalConditionProblemObservation)theEObject;
        T result = caseCoccidioidesImmunosuppressedMedicalConditionProblemObservation(coccidioidesImmunosuppressedMedicalConditionProblemObservation);
        if (result == null) result = caseProblemObservation(coccidioidesImmunosuppressedMedicalConditionProblemObservation);
        if (result == null) result = caseObservation(coccidioidesImmunosuppressedMedicalConditionProblemObservation);
        if (result == null) result = caseClinicalStatement(coccidioidesImmunosuppressedMedicalConditionProblemObservation);
        if (result == null) result = caseAct(coccidioidesImmunosuppressedMedicalConditionProblemObservation);
        if (result == null) result = caseInfrastructureRoot(coccidioidesImmunosuppressedMedicalConditionProblemObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION:
      {
        CoccidioidesPHCRTreatmentInformationSection coccidioidesPHCRTreatmentInformationSection = (CoccidioidesPHCRTreatmentInformationSection)theEObject;
        T result = caseCoccidioidesPHCRTreatmentInformationSection(coccidioidesPHCRTreatmentInformationSection);
        if (result == null) result = casePhcrTreatmentInformationSection(coccidioidesPHCRTreatmentInformationSection);
        if (result == null) result = caseSection(coccidioidesPHCRTreatmentInformationSection);
        if (result == null) result = caseAct(coccidioidesPHCRTreatmentInformationSection);
        if (result == null) result = caseInfrastructureRoot(coccidioidesPHCRTreatmentInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT:
      {
        CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct = (CoccidioidesTherapeuticRegimenAct)theEObject;
        T result = caseCoccidioidesTherapeuticRegimenAct(coccidioidesTherapeuticRegimenAct);
        if (result == null) result = caseTherapeuticRegimenAct(coccidioidesTherapeuticRegimenAct);
        if (result == null) result = caseCDA_Act(coccidioidesTherapeuticRegimenAct);
        if (result == null) result = caseClinicalStatement(coccidioidesTherapeuticRegimenAct);
        if (result == null) result = caseAct(coccidioidesTherapeuticRegimenAct);
        if (result == null) result = caseInfrastructureRoot(coccidioidesTherapeuticRegimenAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        CoccidioidesTreatmentGivenSubstanceAdministration coccidioidesTreatmentGivenSubstanceAdministration = (CoccidioidesTreatmentGivenSubstanceAdministration)theEObject;
        T result = caseCoccidioidesTreatmentGivenSubstanceAdministration(coccidioidesTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentGivenSubstanceAdministration(coccidioidesTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(coccidioidesTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(coccidioidesTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseAct(coccidioidesTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(coccidioidesTreatmentGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        CoccidioidesTreatmentNotGivenSubstanceAdministration coccidioidesTreatmentNotGivenSubstanceAdministration = (CoccidioidesTreatmentNotGivenSubstanceAdministration)theEObject;
        T result = caseCoccidioidesTreatmentNotGivenSubstanceAdministration(coccidioidesTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(coccidioidesTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(coccidioidesTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(coccidioidesTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseAct(coccidioidesTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(coccidioidesTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION:
      {
        CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection = (CoccidioidesPHCRRelevantDxTestsSection)theEObject;
        T result = caseCoccidioidesPHCRRelevantDxTestsSection(coccidioidesPHCRRelevantDxTestsSection);
        if (result == null) result = casePhcrRelevantDxTestsSection(coccidioidesPHCRRelevantDxTestsSection);
        if (result == null) result = caseResultsSection(coccidioidesPHCRRelevantDxTestsSection);
        if (result == null) result = caseSection(coccidioidesPHCRRelevantDxTestsSection);
        if (result == null) result = caseAct(coccidioidesPHCRRelevantDxTestsSection);
        if (result == null) result = caseInfrastructureRoot(coccidioidesPHCRRelevantDxTestsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_RESULT_OBSERVATION:
      {
        CoccidioidesResultObservation coccidioidesResultObservation = (CoccidioidesResultObservation)theEObject;
        T result = caseCoccidioidesResultObservation(coccidioidesResultObservation);
        if (result == null) result = casePhcr_ResultObservation(coccidioidesResultObservation);
        if (result == null) result = caseResultObservation(coccidioidesResultObservation);
        if (result == null) result = caseObservation(coccidioidesResultObservation);
        if (result == null) result = caseClinicalStatement(coccidioidesResultObservation);
        if (result == null) result = caseAct(coccidioidesResultObservation);
        if (result == null) result = caseInfrastructureRoot(coccidioidesResultObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CocciPackage.COCCIDIOIDES_RESULT_ORGANIZER:
      {
        CoccidioidesResultOrganizer coccidioidesResultOrganizer = (CoccidioidesResultOrganizer)theEObject;
        T result = caseCoccidioidesResultOrganizer(coccidioidesResultOrganizer);
        if (result == null) result = casePhcr_ResultOrganizer(coccidioidesResultOrganizer);
        if (result == null) result = caseResultOrganizer(coccidioidesResultOrganizer);
        if (result == null) result = caseOrganizer(coccidioidesResultOrganizer);
        if (result == null) result = caseClinicalStatement(coccidioidesResultOrganizer);
        if (result == null) result = caseAct(coccidioidesResultOrganizer);
        if (result == null) result = caseInfrastructureRoot(coccidioidesResultOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Case Report</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Case Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesCaseReport(CoccidioidesCaseReport object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides PHCR Social History Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesPHCRSocialHistorySection(CoccidioidesPHCRSocialHistorySection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Possible Exposure Location Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Possible Exposure Location Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesPossibleExposureLocationAct(CoccidioidesPossibleExposureLocationAct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides PHCR Clinical Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesPHCRClinicalInformationSection(CoccidioidesPHCRClinicalInformationSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Case Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesCaseObservation(CoccidioidesCaseObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Signs And Symptoms Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesSignsAndSymptomsObservation(CoccidioidesSignsAndSymptomsObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Immunosuppressed Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Immunosuppressed Medical Condition History Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Immunosuppressed Medical Condition Problem Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Immunosuppressed Medical Condition Problem Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionProblemObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides PHCR Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides PHCR Treatment Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesPHCRTreatmentInformationSection(CoccidioidesPHCRTreatmentInformationSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Therapeutic Regimen Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesTherapeuticRegimenAct(CoccidioidesTherapeuticRegimenAct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides PHCR Relevant Dx Tests Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesPHCRRelevantDxTestsSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Result Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesResultObservation(CoccidioidesResultObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Result Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesResultOrganizer(CoccidioidesResultOrganizer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Treatment Given Substance Administration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTreatmentGivenSubstanceAdministration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Coccidioides Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coccidioides Treatment Not Given Substance Administration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTreatmentNotGivenSubstanceAdministration object) {
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
	public T casePhcrRelevantMedicalConditionHistoryObservation(PhcrRelevantMedicalConditionHistoryObservation object) {
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

} //CocciSwitch
