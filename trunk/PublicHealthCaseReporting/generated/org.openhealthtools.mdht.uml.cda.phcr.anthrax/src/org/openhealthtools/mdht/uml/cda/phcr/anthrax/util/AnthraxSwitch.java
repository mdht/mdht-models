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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.util;

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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.*;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage
 * @generated
 */
public class AnthraxSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static AnthraxPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxSwitch() {
    if (modelPackage == null)
    {
      modelPackage = AnthraxPackage.eINSTANCE;
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
      case AnthraxPackage.ANTHRAX_CASE_REPORT:
      {
        AnthraxCaseReport anthraxCaseReport = (AnthraxCaseReport)theEObject;
        T result = caseAnthraxCaseReport(anthraxCaseReport);
        if (result == null) result = casePublicHealthCaseReport(anthraxCaseReport);
        if (result == null) result = caseClinicalDocument(anthraxCaseReport);
        if (result == null) result = caseAct(anthraxCaseReport);
        if (result == null) result = caseInfrastructureRoot(anthraxCaseReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION:
      {
        AnthraxPhcrSocialHistorySection anthraxPhcrSocialHistorySection = (AnthraxPhcrSocialHistorySection)theEObject;
        T result = caseAnthraxPhcrSocialHistorySection(anthraxPhcrSocialHistorySection);
        if (result == null) result = casePhcrSocialHistorySection(anthraxPhcrSocialHistorySection);
        if (result == null) result = caseSocialHistorySection(anthraxPhcrSocialHistorySection);
        if (result == null) result = caseSection(anthraxPhcrSocialHistorySection);
        if (result == null) result = caseAct(anthraxPhcrSocialHistorySection);
        if (result == null) result = caseInfrastructureRoot(anthraxPhcrSocialHistorySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT:
      {
        AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct = (AnthraxPossibleExpossureLocationAndTypeAct)theEObject;
        T result = caseAnthraxPossibleExpossureLocationAndTypeAct(anthraxPossibleExpossureLocationAndTypeAct);
        if (result == null) result = caseCDA_Act(anthraxPossibleExpossureLocationAndTypeAct);
        if (result == null) result = caseClinicalStatement(anthraxPossibleExpossureLocationAndTypeAct);
        if (result == null) result = caseAct(anthraxPossibleExpossureLocationAndTypeAct);
        if (result == null) result = caseInfrastructureRoot(anthraxPossibleExpossureLocationAndTypeAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION:
      {
        AnthraxPhcrClinicalInformationSection anthraxPhcrClinicalInformationSection = (AnthraxPhcrClinicalInformationSection)theEObject;
        T result = caseAnthraxPhcrClinicalInformationSection(anthraxPhcrClinicalInformationSection);
        if (result == null) result = casePhcrClinicalInformationSection(anthraxPhcrClinicalInformationSection);
        if (result == null) result = caseSection(anthraxPhcrClinicalInformationSection);
        if (result == null) result = caseAct(anthraxPhcrClinicalInformationSection);
        if (result == null) result = caseInfrastructureRoot(anthraxPhcrClinicalInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_CASE_OBSERVATION:
      {
        AnthraxCaseObservation anthraxCaseObservation = (AnthraxCaseObservation)theEObject;
        T result = caseAnthraxCaseObservation(anthraxCaseObservation);
        if (result == null) result = caseCaseObservation(anthraxCaseObservation);
        if (result == null) result = caseProblemObservation(anthraxCaseObservation);
        if (result == null) result = caseObservation(anthraxCaseObservation);
        if (result == null) result = caseClinicalStatement(anthraxCaseObservation);
        if (result == null) result = caseAct(anthraxCaseObservation);
        if (result == null) result = caseInfrastructureRoot(anthraxCaseObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_SIGNS_AND_SYMPTOMS_OBSERVATION:
      {
        AnthraxSignsAndSymptomsObservation anthraxSignsAndSymptomsObservation = (AnthraxSignsAndSymptomsObservation)theEObject;
        T result = caseAnthraxSignsAndSymptomsObservation(anthraxSignsAndSymptomsObservation);
        if (result == null) result = caseSignsAndSymptomsObservation(anthraxSignsAndSymptomsObservation);
        if (result == null) result = caseObservation(anthraxSignsAndSymptomsObservation);
        if (result == null) result = caseClinicalStatement(anthraxSignsAndSymptomsObservation);
        if (result == null) result = caseAct(anthraxSignsAndSymptomsObservation);
        if (result == null) result = caseInfrastructureRoot(anthraxSignsAndSymptomsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION:
      {
        AnthraxPhcrTreatmentInformationSection anthraxPhcrTreatmentInformationSection = (AnthraxPhcrTreatmentInformationSection)theEObject;
        T result = caseAnthraxPhcrTreatmentInformationSection(anthraxPhcrTreatmentInformationSection);
        if (result == null) result = casePhcrTreatmentInformationSection(anthraxPhcrTreatmentInformationSection);
        if (result == null) result = caseSection(anthraxPhcrTreatmentInformationSection);
        if (result == null) result = caseAct(anthraxPhcrTreatmentInformationSection);
        if (result == null) result = caseInfrastructureRoot(anthraxPhcrTreatmentInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_THERAPEUTIC_REGIMEN_ACT:
      {
        AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct = (AnthraxTherapeuticRegimenAct)theEObject;
        T result = caseAnthraxTherapeuticRegimenAct(anthraxTherapeuticRegimenAct);
        if (result == null) result = caseTherapeuticRegimenAct(anthraxTherapeuticRegimenAct);
        if (result == null) result = caseCDA_Act(anthraxTherapeuticRegimenAct);
        if (result == null) result = caseClinicalStatement(anthraxTherapeuticRegimenAct);
        if (result == null) result = caseAct(anthraxTherapeuticRegimenAct);
        if (result == null) result = caseInfrastructureRoot(anthraxTherapeuticRegimenAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        AnthraxTreatmentGivenSubstanceAdministration anthraxTreatmentGivenSubstanceAdministration = (AnthraxTreatmentGivenSubstanceAdministration)theEObject;
        T result = caseAnthraxTreatmentGivenSubstanceAdministration(anthraxTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentGivenSubstanceAdministration(anthraxTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(anthraxTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(anthraxTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseAct(anthraxTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(anthraxTreatmentGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        AnthraxTreatmentNotGivenSubstanceAdministration anthraxTreatmentNotGivenSubstanceAdministration = (AnthraxTreatmentNotGivenSubstanceAdministration)theEObject;
        T result = caseAnthraxTreatmentNotGivenSubstanceAdministration(anthraxTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(anthraxTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(anthraxTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(anthraxTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseAct(anthraxTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(anthraxTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION:
      {
        AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection = (AnthraxPhcrRelevantDxTestsSection)theEObject;
        T result = caseAnthraxPhcrRelevantDxTestsSection(anthraxPhcrRelevantDxTestsSection);
        if (result == null) result = casePhcrRelevantDxTestsSection(anthraxPhcrRelevantDxTestsSection);
        if (result == null) result = caseResultsSection(anthraxPhcrRelevantDxTestsSection);
        if (result == null) result = caseSection(anthraxPhcrRelevantDxTestsSection);
        if (result == null) result = caseAct(anthraxPhcrRelevantDxTestsSection);
        if (result == null) result = caseInfrastructureRoot(anthraxPhcrRelevantDxTestsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_RESULT_ORGANIZER:
      {
        AnthraxResultOrganizer anthraxResultOrganizer = (AnthraxResultOrganizer)theEObject;
        T result = caseAnthraxResultOrganizer(anthraxResultOrganizer);
        if (result == null) result = casePhcr_ResultOrganizer(anthraxResultOrganizer);
        if (result == null) result = caseResultOrganizer(anthraxResultOrganizer);
        if (result == null) result = caseOrganizer(anthraxResultOrganizer);
        if (result == null) result = caseClinicalStatement(anthraxResultOrganizer);
        if (result == null) result = caseAct(anthraxResultOrganizer);
        if (result == null) result = caseInfrastructureRoot(anthraxResultOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AnthraxPackage.ANTHRAX_RESULT_OBSERVATION:
      {
        AnthraxResultObservation anthraxResultObservation = (AnthraxResultObservation)theEObject;
        T result = caseAnthraxResultObservation(anthraxResultObservation);
        if (result == null) result = casePhcr_ResultObservation(anthraxResultObservation);
        if (result == null) result = caseResultObservation(anthraxResultObservation);
        if (result == null) result = caseObservation(anthraxResultObservation);
        if (result == null) result = caseClinicalStatement(anthraxResultObservation);
        if (result == null) result = caseAct(anthraxResultObservation);
        if (result == null) result = caseInfrastructureRoot(anthraxResultObservation);
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
	public T caseAnthraxCaseReport(AnthraxCaseReport object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Phcr Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phcr Clinical Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAnthraxPhcrClinicalInformationSection(AnthraxPhcrClinicalInformationSection object) {
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
	public T caseAnthraxCaseObservation(AnthraxCaseObservation object) {
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
	public T caseAnthraxSignsAndSymptomsObservation(AnthraxSignsAndSymptomsObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Phcr Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phcr Relevant Dx Tests Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAnthraxPhcrRelevantDxTestsSection(AnthraxPhcrRelevantDxTestsSection object) {
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
	public T caseAnthraxResultObservation(AnthraxResultObservation object) {
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
	public T caseAnthraxResultOrganizer(AnthraxResultOrganizer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Phcr Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phcr Social History Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAnthraxPhcrSocialHistorySection(AnthraxPhcrSocialHistorySection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Possible Expossure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Possible Expossure Location And Type Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPossibleExpossureLocationAndTypeAct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Phcr Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phcr Treatment Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAnthraxPhcrTreatmentInformationSection(AnthraxPhcrTreatmentInformationSection object) {
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
	public T caseAnthraxTherapeuticRegimenAct(AnthraxTherapeuticRegimenAct object) {
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
	public T caseAnthraxTreatmentGivenSubstanceAdministration(AnthraxTreatmentGivenSubstanceAdministration object) {
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
	public T caseAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTreatmentNotGivenSubstanceAdministration object) {
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

} //AnthraxSwitch
