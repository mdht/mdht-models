/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util;

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

import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.*;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage
 * @generated
 */
public class ChlamydiatrachomatisSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ChlamydiatrachomatisPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChlamydiatrachomatisSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ChlamydiatrachomatisPackage.eINSTANCE;
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
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT:
      {
        ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport = (ChlamydiatrachomatisPublicHealthCaseReport)theEObject;
        T result = caseChlamydiatrachomatisPublicHealthCaseReport(chlamydiatrachomatisPublicHealthCaseReport);
        if (result == null) result = casePublicHealthCaseReport(chlamydiatrachomatisPublicHealthCaseReport);
        if (result == null) result = caseClinicalDocument(chlamydiatrachomatisPublicHealthCaseReport);
        if (result == null) result = caseAct(chlamydiatrachomatisPublicHealthCaseReport);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisPublicHealthCaseReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION:
      {
        ChlamydiatrachomatisPHCRClinicalInformationSection chlamydiatrachomatisPHCRClinicalInformationSection = (ChlamydiatrachomatisPHCRClinicalInformationSection)theEObject;
        T result = caseChlamydiatrachomatisPHCRClinicalInformationSection(chlamydiatrachomatisPHCRClinicalInformationSection);
        if (result == null) result = casePhcrClinicalInformationSection(chlamydiatrachomatisPHCRClinicalInformationSection);
        if (result == null) result = caseSection(chlamydiatrachomatisPHCRClinicalInformationSection);
        if (result == null) result = caseAct(chlamydiatrachomatisPHCRClinicalInformationSection);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisPHCRClinicalInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION:
      {
        ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation = (ChlamydiatrachomatisCaseObservation)theEObject;
        T result = caseChlamydiatrachomatisCaseObservation(chlamydiatrachomatisCaseObservation);
        if (result == null) result = caseCaseObservation(chlamydiatrachomatisCaseObservation);
        if (result == null) result = caseProblemObservation(chlamydiatrachomatisCaseObservation);
        if (result == null) result = caseObservation(chlamydiatrachomatisCaseObservation);
        if (result == null) result = caseClinicalStatement(chlamydiatrachomatisCaseObservation);
        if (result == null) result = caseAct(chlamydiatrachomatisCaseObservation);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisCaseObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION:
      {
        ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection = (ChlamydiatrachomatisPHCRRelevantDxTestsSection)theEObject;
        T result = caseChlamydiatrachomatisPHCRRelevantDxTestsSection(chlamydiatrachomatisPHCRRelevantDxTestsSection);
        if (result == null) result = casePhcrRelevantDxTestsSection(chlamydiatrachomatisPHCRRelevantDxTestsSection);
        if (result == null) result = caseResultsSection(chlamydiatrachomatisPHCRRelevantDxTestsSection);
        if (result == null) result = caseSection(chlamydiatrachomatisPHCRRelevantDxTestsSection);
        if (result == null) result = caseAct(chlamydiatrachomatisPHCRRelevantDxTestsSection);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisPHCRRelevantDxTestsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION:
      {
        ChlamydiatrachomatisResultObservation chlamydiatrachomatisResultObservation = (ChlamydiatrachomatisResultObservation)theEObject;
        T result = caseChlamydiatrachomatisResultObservation(chlamydiatrachomatisResultObservation);
        if (result == null) result = casePhcr_ResultObservation(chlamydiatrachomatisResultObservation);
        if (result == null) result = caseResultObservation(chlamydiatrachomatisResultObservation);
        if (result == null) result = caseObservation(chlamydiatrachomatisResultObservation);
        if (result == null) result = caseClinicalStatement(chlamydiatrachomatisResultObservation);
        if (result == null) result = caseAct(chlamydiatrachomatisResultObservation);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisResultObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER:
      {
        chlamydiatrachomatisResultOrganizer chlamydiatrachomatisResultOrganizer = (chlamydiatrachomatisResultOrganizer)theEObject;
        T result = casechlamydiatrachomatisResultOrganizer(chlamydiatrachomatisResultOrganizer);
        if (result == null) result = casePhcr_ResultOrganizer(chlamydiatrachomatisResultOrganizer);
        if (result == null) result = caseResultOrganizer(chlamydiatrachomatisResultOrganizer);
        if (result == null) result = caseOrganizer(chlamydiatrachomatisResultOrganizer);
        if (result == null) result = caseClinicalStatement(chlamydiatrachomatisResultOrganizer);
        if (result == null) result = caseAct(chlamydiatrachomatisResultOrganizer);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisResultOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION:
      {
        ChlamydiatrachomatisPHCRTreatmentInformationSection chlamydiatrachomatisPHCRTreatmentInformationSection = (ChlamydiatrachomatisPHCRTreatmentInformationSection)theEObject;
        T result = caseChlamydiatrachomatisPHCRTreatmentInformationSection(chlamydiatrachomatisPHCRTreatmentInformationSection);
        if (result == null) result = casePhcrTreatmentInformationSection(chlamydiatrachomatisPHCRTreatmentInformationSection);
        if (result == null) result = caseSection(chlamydiatrachomatisPHCRTreatmentInformationSection);
        if (result == null) result = caseAct(chlamydiatrachomatisPHCRTreatmentInformationSection);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisPHCRTreatmentInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT:
      {
        ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct = (ChlamydiatrachomatisTherapeuticRegimenAct)theEObject;
        T result = caseChlamydiatrachomatisTherapeuticRegimenAct(chlamydiatrachomatisTherapeuticRegimenAct);
        if (result == null) result = caseTherapeuticRegimenAct(chlamydiatrachomatisTherapeuticRegimenAct);
        if (result == null) result = caseCDA_Act(chlamydiatrachomatisTherapeuticRegimenAct);
        if (result == null) result = caseClinicalStatement(chlamydiatrachomatisTherapeuticRegimenAct);
        if (result == null) result = caseAct(chlamydiatrachomatisTherapeuticRegimenAct);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisTherapeuticRegimenAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        ChlamydiatrachomatisTreatmentGivenSubstanceAdministration chlamydiatrachomatisTreatmentGivenSubstanceAdministration = (ChlamydiatrachomatisTreatmentGivenSubstanceAdministration)theEObject;
        T result = caseChlamydiatrachomatisTreatmentGivenSubstanceAdministration(chlamydiatrachomatisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentGivenSubstanceAdministration(chlamydiatrachomatisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(chlamydiatrachomatisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(chlamydiatrachomatisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseAct(chlamydiatrachomatisTreatmentGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisTreatmentGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration = (ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration)theEObject;
        T result = caseChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseAct(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
  public T caseChlamydiatrachomatisPublicHealthCaseReport(ChlamydiatrachomatisPublicHealthCaseReport object)
  {
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
  public T caseChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPHCRClinicalInformationSection object)
  {
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
  public T caseChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisCaseObservation object)
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
  public T caseChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPHCRRelevantDxTestsSection object)
  {
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
  public T caseChlamydiatrachomatisResultObservation(ChlamydiatrachomatisResultObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>chlamydiatrachomatis Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>chlamydiatrachomatis Result Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casechlamydiatrachomatisResultOrganizer(chlamydiatrachomatisResultOrganizer object)
  {
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
  public T caseChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPHCRTreatmentInformationSection object)
  {
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
  public T caseChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisTherapeuticRegimenAct object)
  {
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
  public T caseChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTreatmentGivenSubstanceAdministration object)
  {
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
  public T caseChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration object)
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
  public T casePhcrClinicalInformationSection(PhcrClinicalInformationSection object)
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
  public T caseObservation(Observation object)
  {
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
  public T caseProblemObservation(ProblemObservation object)
  {
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
  public T caseCaseObservation(CaseObservation object)
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
  public T caseResultsSection(ResultsSection object)
  {
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
  public T casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object)
  {
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
  public T caseResultObservation(ResultObservation object)
  {
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
  public T casePhcr_ResultObservation(org.openhealthtools.mdht.uml.cda.phcr.ResultObservation object)
  {
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
  public T caseOrganizer(Organizer object)
  {
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
  public T caseResultOrganizer(ResultOrganizer object)
  {
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
  public T casePhcr_ResultOrganizer(org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer object)
  {
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
  public T casePhcrTreatmentInformationSection(PhcrTreatmentInformationSection object)
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
  public T caseTherapeuticRegimenAct(TherapeuticRegimenAct object)
  {
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
  public T caseSubstanceAdministration(SubstanceAdministration object)
  {
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
  public T caseTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration object)
  {
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
  public T caseTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration object)
  {
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

} //ChlamydiatrachomatisSwitch
