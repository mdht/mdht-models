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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.*;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;
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
 * @see org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage
 * @generated
 */
public class SilicosisSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SilicosisPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisSwitch() {
    if (modelPackage == null)
    {
      modelPackage = SilicosisPackage.eINSTANCE;
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
      case SilicosisPackage.SILICOSIS_CASE_REPORT:
      {
        SilicosisCaseReport silicosisCaseReport = (SilicosisCaseReport)theEObject;
        T result = caseSilicosisCaseReport(silicosisCaseReport);
        if (result == null) result = casePublicHealthCaseReport(silicosisCaseReport);
        if (result == null) result = caseClinicalDocument(silicosisCaseReport);
        if (result == null) result = caseAct(silicosisCaseReport);
        if (result == null) result = caseInfrastructureRoot(silicosisCaseReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION:
      {
        SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection = (SilicosisPHCRSocialHistorySection)theEObject;
        T result = caseSilicosisPHCRSocialHistorySection(silicosisPHCRSocialHistorySection);
        if (result == null) result = casePhcrSocialHistorySection(silicosisPHCRSocialHistorySection);
        if (result == null) result = caseSocialHistorySection(silicosisPHCRSocialHistorySection);
        if (result == null) result = caseSection(silicosisPHCRSocialHistorySection);
        if (result == null) result = caseAct(silicosisPHCRSocialHistorySection);
        if (result == null) result = caseInfrastructureRoot(silicosisPHCRSocialHistorySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION:
      {
        SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation = (SilicosisSocioBehavioralBooleanRiskFactorObservation)theEObject;
        T result = caseSilicosisSocioBehavioralBooleanRiskFactorObservation(silicosisSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseSocialHistoryObservation(silicosisSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseObservation(silicosisSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseClinicalStatement(silicosisSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseAct(silicosisSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = caseInfrastructureRoot(silicosisSocioBehavioralBooleanRiskFactorObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT:
      {
        SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct = (SilicosisPossibleExposureLocationAndTypeAct)theEObject;
        T result = caseSilicosisPossibleExposureLocationAndTypeAct(silicosisPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseCDA_Act(silicosisPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseClinicalStatement(silicosisPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseAct(silicosisPossibleExposureLocationAndTypeAct);
        if (result == null) result = caseInfrastructureRoot(silicosisPossibleExposureLocationAndTypeAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION:
      {
        SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection = (SilicosisPHCRClinicalInformationSection)theEObject;
        T result = caseSilicosisPHCRClinicalInformationSection(silicosisPHCRClinicalInformationSection);
        if (result == null) result = casePhcrClinicalInformationSection(silicosisPHCRClinicalInformationSection);
        if (result == null) result = caseSection(silicosisPHCRClinicalInformationSection);
        if (result == null) result = caseAct(silicosisPHCRClinicalInformationSection);
        if (result == null) result = caseInfrastructureRoot(silicosisPHCRClinicalInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_CASE_OBSERVATION:
      {
        SilicosisCaseObservation silicosisCaseObservation = (SilicosisCaseObservation)theEObject;
        T result = caseSilicosisCaseObservation(silicosisCaseObservation);
        if (result == null) result = caseCaseObservation(silicosisCaseObservation);
        if (result == null) result = caseProblemObservation(silicosisCaseObservation);
        if (result == null) result = caseObservation(silicosisCaseObservation);
        if (result == null) result = caseClinicalStatement(silicosisCaseObservation);
        if (result == null) result = caseAct(silicosisCaseObservation);
        if (result == null) result = caseInfrastructureRoot(silicosisCaseObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION:
      {
        SilicosisSignsAndSymptomsObservation silicosisSignsAndSymptomsObservation = (SilicosisSignsAndSymptomsObservation)theEObject;
        T result = caseSilicosisSignsAndSymptomsObservation(silicosisSignsAndSymptomsObservation);
        if (result == null) result = caseSignsAndSymptomsObservation(silicosisSignsAndSymptomsObservation);
        if (result == null) result = caseObservation(silicosisSignsAndSymptomsObservation);
        if (result == null) result = caseClinicalStatement(silicosisSignsAndSymptomsObservation);
        if (result == null) result = caseAct(silicosisSignsAndSymptomsObservation);
        if (result == null) result = caseInfrastructureRoot(silicosisSignsAndSymptomsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION:
      {
        SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation = (SilicosisHistoryOfTuberculosisObservation)theEObject;
        T result = caseSilicosisHistoryOfTuberculosisObservation(silicosisHistoryOfTuberculosisObservation);
        if (result == null) result = caseProblemObservation(silicosisHistoryOfTuberculosisObservation);
        if (result == null) result = caseObservation(silicosisHistoryOfTuberculosisObservation);
        if (result == null) result = caseClinicalStatement(silicosisHistoryOfTuberculosisObservation);
        if (result == null) result = caseAct(silicosisHistoryOfTuberculosisObservation);
        if (result == null) result = caseInfrastructureRoot(silicosisHistoryOfTuberculosisObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION:
      {
        SilicosisPHCRRelevantDxTestsSection silicosisPHCRRelevantDxTestsSection = (SilicosisPHCRRelevantDxTestsSection)theEObject;
        T result = caseSilicosisPHCRRelevantDxTestsSection(silicosisPHCRRelevantDxTestsSection);
        if (result == null) result = casePhcrRelevantDxTestsSection(silicosisPHCRRelevantDxTestsSection);
        if (result == null) result = caseResultsSection(silicosisPHCRRelevantDxTestsSection);
        if (result == null) result = caseSection(silicosisPHCRRelevantDxTestsSection);
        if (result == null) result = caseAct(silicosisPHCRRelevantDxTestsSection);
        if (result == null) result = caseInfrastructureRoot(silicosisPHCRRelevantDxTestsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SilicosisPackage.SILICOSIS_IMAGING_OBSERVATION:
      {
        SilicosisImagingObservation silicosisImagingObservation = (SilicosisImagingObservation)theEObject;
        T result = caseSilicosisImagingObservation(silicosisImagingObservation);
        if (result == null) result = caseImagingObservation(silicosisImagingObservation);
        if (result == null) result = caseProblemObservation(silicosisImagingObservation);
        if (result == null) result = caseObservation(silicosisImagingObservation);
        if (result == null) result = caseClinicalStatement(silicosisImagingObservation);
        if (result == null) result = caseAct(silicosisImagingObservation);
        if (result == null) result = caseInfrastructureRoot(silicosisImagingObservation);
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
	public T caseSilicosisCaseReport(SilicosisCaseReport object) {
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
	public T caseSilicosisPHCRSocialHistorySection(SilicosisPHCRSocialHistorySection object) {
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
	public T caseSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisSocioBehavioralBooleanRiskFactorObservation object) {
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
	public T caseSilicosisPHCRClinicalInformationSection(SilicosisPHCRClinicalInformationSection object) {
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
	public T caseSilicosisCaseObservation(SilicosisCaseObservation object) {
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
	public T caseSilicosisSignsAndSymptomsObservation(SilicosisSignsAndSymptomsObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>History Of Tuberculosis Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>History Of Tuberculosis Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSilicosisHistoryOfTuberculosisObservation(SilicosisHistoryOfTuberculosisObservation object)
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
  public T caseSilicosisPHCRRelevantDxTestsSection(SilicosisPHCRRelevantDxTestsSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imaging Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSilicosisImagingObservation(SilicosisImagingObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Possible Exposure Location And Type Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSilicosisPossibleExposureLocationAndTypeAct(SilicosisPossibleExposureLocationAndTypeAct object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imaging Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImagingObservation(ImagingObservation object)
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

} //SilicosisSwitch
