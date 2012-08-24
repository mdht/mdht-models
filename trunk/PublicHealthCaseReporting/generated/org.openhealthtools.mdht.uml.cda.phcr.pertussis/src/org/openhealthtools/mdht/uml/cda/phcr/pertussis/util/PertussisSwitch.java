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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.util;

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
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.*;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentNotGivenSubstanceAdministration;
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
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage
 * @generated
 */
public class PertussisSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PertussisPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PertussisSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PertussisPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PertussisPackage.PERTUSSIS_CASE_REPORT:
      {
        PertussisCaseReport pertussisCaseReport = (PertussisCaseReport)theEObject;
        T result = casePertussisCaseReport(pertussisCaseReport);
        if (result == null) result = casePublicHealthCaseReport(pertussisCaseReport);
        if (result == null) result = caseClinicalDocument(pertussisCaseReport);
        if (result == null) result = caseAct(pertussisCaseReport);
        if (result == null) result = caseInfrastructureRoot(pertussisCaseReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_SOCIAL_HISTORY_SECTION:
      {
        PertussisSocialHistorySection pertussisSocialHistorySection = (PertussisSocialHistorySection)theEObject;
        T result = casePertussisSocialHistorySection(pertussisSocialHistorySection);
        if (result == null) result = casePhcrSocialHistorySection(pertussisSocialHistorySection);
        if (result == null) result = caseSocialHistorySection(pertussisSocialHistorySection);
        if (result == null) result = caseSection(pertussisSocialHistorySection);
        if (result == null) result = caseAct(pertussisSocialHistorySection);
        if (result == null) result = caseInfrastructureRoot(pertussisSocialHistorySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT:
      {
        PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct = (PertussisPossibleExposureLocationAct)theEObject;
        T result = casePertussisPossibleExposureLocationAct(pertussisPossibleExposureLocationAct);
        if (result == null) result = caseCDA_Act(pertussisPossibleExposureLocationAct);
        if (result == null) result = caseClinicalStatement(pertussisPossibleExposureLocationAct);
        if (result == null) result = caseAct(pertussisPossibleExposureLocationAct);
        if (result == null) result = caseInfrastructureRoot(pertussisPossibleExposureLocationAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT:
      {
        PertussisPossibleCaseContactLocationAct pertussisPossibleCaseContactLocationAct = (PertussisPossibleCaseContactLocationAct)theEObject;
        T result = casePertussisPossibleCaseContactLocationAct(pertussisPossibleCaseContactLocationAct);
        if (result == null) result = caseCDA_Act(pertussisPossibleCaseContactLocationAct);
        if (result == null) result = caseClinicalStatement(pertussisPossibleCaseContactLocationAct);
        if (result == null) result = caseAct(pertussisPossibleCaseContactLocationAct);
        if (result == null) result = caseInfrastructureRoot(pertussisPossibleCaseContactLocationAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_CLINICAL_INFORMATION_SECTION:
      {
        PertussisClinicalInformationSection pertussisClinicalInformationSection = (PertussisClinicalInformationSection)theEObject;
        T result = casePertussisClinicalInformationSection(pertussisClinicalInformationSection);
        if (result == null) result = casePhcrClinicalInformationSection(pertussisClinicalInformationSection);
        if (result == null) result = caseSection(pertussisClinicalInformationSection);
        if (result == null) result = caseAct(pertussisClinicalInformationSection);
        if (result == null) result = caseInfrastructureRoot(pertussisClinicalInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_CASE_OBSERVATION:
      {
        PertussisCaseObservation pertussisCaseObservation = (PertussisCaseObservation)theEObject;
        T result = casePertussisCaseObservation(pertussisCaseObservation);
        if (result == null) result = caseCaseObservation(pertussisCaseObservation);
        if (result == null) result = caseProblemObservation(pertussisCaseObservation);
        if (result == null) result = caseObservation(pertussisCaseObservation);
        if (result == null) result = caseClinicalStatement(pertussisCaseObservation);
        if (result == null) result = caseAct(pertussisCaseObservation);
        if (result == null) result = caseInfrastructureRoot(pertussisCaseObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION:
      {
        PertussisSignsAndSymptomsObservation pertussisSignsAndSymptomsObservation = (PertussisSignsAndSymptomsObservation)theEObject;
        T result = casePertussisSignsAndSymptomsObservation(pertussisSignsAndSymptomsObservation);
        if (result == null) result = caseSignsAndSymptomsObservation(pertussisSignsAndSymptomsObservation);
        if (result == null) result = caseObservation(pertussisSignsAndSymptomsObservation);
        if (result == null) result = caseClinicalStatement(pertussisSignsAndSymptomsObservation);
        if (result == null) result = caseAct(pertussisSignsAndSymptomsObservation);
        if (result == null) result = caseInfrastructureRoot(pertussisSignsAndSymptomsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_TREATMENT_INFORMATION_SECTION:
      {
        PertussisTreatmentInformationSection pertussisTreatmentInformationSection = (PertussisTreatmentInformationSection)theEObject;
        T result = casePertussisTreatmentInformationSection(pertussisTreatmentInformationSection);
        if (result == null) result = casePhcrTreatmentInformationSection(pertussisTreatmentInformationSection);
        if (result == null) result = caseSection(pertussisTreatmentInformationSection);
        if (result == null) result = caseAct(pertussisTreatmentInformationSection);
        if (result == null) result = caseInfrastructureRoot(pertussisTreatmentInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT:
      {
        PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct = (PertussisTherapeuticRegimenAct)theEObject;
        T result = casePertussisTherapeuticRegimenAct(pertussisTherapeuticRegimenAct);
        if (result == null) result = caseTherapeuticRegimenAct(pertussisTherapeuticRegimenAct);
        if (result == null) result = caseCDA_Act(pertussisTherapeuticRegimenAct);
        if (result == null) result = caseClinicalStatement(pertussisTherapeuticRegimenAct);
        if (result == null) result = caseAct(pertussisTherapeuticRegimenAct);
        if (result == null) result = caseInfrastructureRoot(pertussisTherapeuticRegimenAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        PertussisTreatmentGivenSubstanceAdministration pertussisTreatmentGivenSubstanceAdministration = (PertussisTreatmentGivenSubstanceAdministration)theEObject;
        T result = casePertussisTreatmentGivenSubstanceAdministration(pertussisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentGivenSubstanceAdministration(pertussisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(pertussisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(pertussisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseAct(pertussisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(pertussisTreatmentGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        PertussisTreatmentNotGivenSubstanceAdministration pertussisTreatmentNotGivenSubstanceAdministration = (PertussisTreatmentNotGivenSubstanceAdministration)theEObject;
        T result = casePertussisTreatmentNotGivenSubstanceAdministration(pertussisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(pertussisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(pertussisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(pertussisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseAct(pertussisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(pertussisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_RELEVANT_DX_TESTS_SECTION:
      {
        PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection = (PertussisRelevantDxTestsSection)theEObject;
        T result = casePertussisRelevantDxTestsSection(pertussisRelevantDxTestsSection);
        if (result == null) result = casePhcrRelevantDxTestsSection(pertussisRelevantDxTestsSection);
        if (result == null) result = caseResultsSection(pertussisRelevantDxTestsSection);
        if (result == null) result = caseSection(pertussisRelevantDxTestsSection);
        if (result == null) result = caseAct(pertussisRelevantDxTestsSection);
        if (result == null) result = caseInfrastructureRoot(pertussisRelevantDxTestsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_RESULT_OBSERVATION:
      {
        PertussisResultObservation pertussisResultObservation = (PertussisResultObservation)theEObject;
        T result = casePertussisResultObservation(pertussisResultObservation);
        if (result == null) result = casePhcr_ResultObservation(pertussisResultObservation);
        if (result == null) result = caseResultObservation(pertussisResultObservation);
        if (result == null) result = caseObservation(pertussisResultObservation);
        if (result == null) result = caseClinicalStatement(pertussisResultObservation);
        if (result == null) result = caseAct(pertussisResultObservation);
        if (result == null) result = caseInfrastructureRoot(pertussisResultObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_RESULT_ORGANIZER:
      {
        PertussisResultOrganizer pertussisResultOrganizer = (PertussisResultOrganizer)theEObject;
        T result = casePertussisResultOrganizer(pertussisResultOrganizer);
        if (result == null) result = casePhcr_ResultOrganizer(pertussisResultOrganizer);
        if (result == null) result = caseResultOrganizer(pertussisResultOrganizer);
        if (result == null) result = caseOrganizer(pertussisResultOrganizer);
        if (result == null) result = caseClinicalStatement(pertussisResultOrganizer);
        if (result == null) result = caseAct(pertussisResultOrganizer);
        if (result == null) result = caseInfrastructureRoot(pertussisResultOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_IMMUNIZATIONS_SECTION:
      {
        PertussisImmunizationsSection pertussisImmunizationsSection = (PertussisImmunizationsSection)theEObject;
        T result = casePertussisImmunizationsSection(pertussisImmunizationsSection);
        if (result == null) result = caseImmunizationsSection(pertussisImmunizationsSection);
        if (result == null) result = caseSection(pertussisImmunizationsSection);
        if (result == null) result = caseAct(pertussisImmunizationsSection);
        if (result == null) result = caseInfrastructureRoot(pertussisImmunizationsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_IMMUNIZATION_ACTIVITY:
      {
        PertussisImmunizationActivity pertussisImmunizationActivity = (PertussisImmunizationActivity)theEObject;
        T result = casePertussisImmunizationActivity(pertussisImmunizationActivity);
        if (result == null) result = caseMedicationActivity(pertussisImmunizationActivity);
        if (result == null) result = caseSubstanceAdministration(pertussisImmunizationActivity);
        if (result == null) result = caseClinicalStatement(pertussisImmunizationActivity);
        if (result == null) result = caseAct(pertussisImmunizationActivity);
        if (result == null) result = caseInfrastructureRoot(pertussisImmunizationActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PertussisPackage.PERTUSSIS_IMMUNIZATION_PRODUCT:
      {
        PertussisImmunizationProduct pertussisImmunizationProduct = (PertussisImmunizationProduct)theEObject;
        T result = casePertussisImmunizationProduct(pertussisImmunizationProduct);
        if (result == null) result = caseProduct(pertussisImmunizationProduct);
        if (result == null) result = caseManufacturedProduct(pertussisImmunizationProduct);
        if (result == null) result = caseRole(pertussisImmunizationProduct);
        if (result == null) result = caseInfrastructureRoot(pertussisImmunizationProduct);
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
  public T casePertussisCaseReport(PertussisCaseReport object)
  {
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
  public T casePertussisSocialHistorySection(PertussisSocialHistorySection object)
  {
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
	public T casePertussisPossibleExposureLocationAct(PertussisPossibleExposureLocationAct object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Possible Case Contact Location Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Possible Case Contact Location Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePertussisPossibleCaseContactLocationAct(PertussisPossibleCaseContactLocationAct object) {
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
	public T casePertussisClinicalInformationSection(PertussisClinicalInformationSection object) {
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
	public T casePertussisTreatmentInformationSection(PertussisTreatmentInformationSection object) {
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
	public T casePertussisTherapeuticRegimenAct(PertussisTherapeuticRegimenAct object) {
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
	public T casePertussisTreatmentGivenSubstanceAdministration(PertussisTreatmentGivenSubstanceAdministration object) {
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
	public T casePertussisTreatmentNotGivenSubstanceAdministration(PertussisTreatmentNotGivenSubstanceAdministration object) {
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
	public T casePertussisImmunizationsSection(PertussisImmunizationsSection object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePertussisImmunizationActivity(PertussisImmunizationActivity object) {
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
	public T casePertussisCaseObservation(PertussisCaseObservation object) {
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
	public T casePertussisSignsAndSymptomsObservation(PertussisSignsAndSymptomsObservation object) {
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
	public T casePertussisResultObservation(PertussisResultObservation object) {
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
	public T casePertussisRelevantDxTestsSection(PertussisRelevantDxTestsSection object) {
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
	public T casePertussisResultOrganizer(PertussisResultOrganizer object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Immunization Product</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Immunization Product</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePertussisImmunizationProduct(PertussisImmunizationProduct object) {
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
  public T caseInfrastructureRoot(InfrastructureRoot object)
  {
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
  public T caseAct(Act object)
  {
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
  public T caseClinicalDocument(ClinicalDocument object)
  {
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
  public T casePublicHealthCaseReport(PublicHealthCaseReport object)
  {
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
  public T caseSection(Section object)
  {
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
  public T caseSocialHistorySection(SocialHistorySection object)
  {
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
  public T casePhcrSocialHistorySection(PhcrSocialHistorySection object)
  {
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
  public T caseClinicalStatement(ClinicalStatement object)
  {
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
  public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PertussisSwitch
