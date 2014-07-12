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
package org.openhealthtools.mdht.uml.cda.phcr.hib.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;


import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.*;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage
 * @generated
 */
public class HibSwitch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static HibPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HibSwitch()
  {
		if (modelPackage == null) {
			modelPackage = HibPackage.eINSTANCE;
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case HibPackage.HIB_CASE_REPORT: {
				HIBCaseReport hibCaseReport = (HIBCaseReport)theEObject;
				T result = caseHIBCaseReport(hibCaseReport);
				if (result == null) result = casePublicHealthCaseReport(hibCaseReport);
				if (result == null) result = caseClinicalDocument(hibCaseReport);
				if (result == null) result = caseAct(hibCaseReport);
				if (result == null) result = caseInfrastructureRoot(hibCaseReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HibPackage.HIB_PHCR_CLINICAL_INFORMATION_SECTION: {
				HibPhcrClinicalInformationSection hibPhcrClinicalInformationSection = (HibPhcrClinicalInformationSection)theEObject;
				T result = caseHibPhcrClinicalInformationSection(hibPhcrClinicalInformationSection);
				if (result == null) result = casePhcrClinicalInformationSection(hibPhcrClinicalInformationSection);
				if (result == null) result = caseSection(hibPhcrClinicalInformationSection);
				if (result == null) result = caseAct(hibPhcrClinicalInformationSection);
				if (result == null) result = caseInfrastructureRoot(hibPhcrClinicalInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HibPackage.HIB_CASE_OBSERVATION: {
				HibCaseObservation hibCaseObservation = (HibCaseObservation)theEObject;
				T result = caseHibCaseObservation(hibCaseObservation);
				if (result == null) result = caseCaseObservation(hibCaseObservation);
				if (result == null) result = caseProblemObservation(hibCaseObservation);
				if (result == null) result = caseObservation(hibCaseObservation);
				if (result == null) result = caseClinicalStatement(hibCaseObservation);
				if (result == null) result = caseAct(hibCaseObservation);
				if (result == null) result = caseInfrastructureRoot(hibCaseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HibPackage.HIB_SIGNS_AND_SYMPTOMS: {
				HibSignsAndSymptoms hibSignsAndSymptoms = (HibSignsAndSymptoms)theEObject;
				T result = caseHibSignsAndSymptoms(hibSignsAndSymptoms);
				if (result == null) result = caseSignsAndSymptomsObservation(hibSignsAndSymptoms);
				if (result == null) result = caseObservation(hibSignsAndSymptoms);
				if (result == null) result = caseClinicalStatement(hibSignsAndSymptoms);
				if (result == null) result = caseAct(hibSignsAndSymptoms);
				if (result == null) result = caseInfrastructureRoot(hibSignsAndSymptoms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HibPackage.HIB_PHCR_RELEVANT_DX_TESTS_SECTION: {
				HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection = (HibPhcrRelevantDxTestsSection)theEObject;
				T result = caseHibPhcrRelevantDxTestsSection(hibPhcrRelevantDxTestsSection);
				if (result == null) result = casePhcrRelevantDxTestsSection(hibPhcrRelevantDxTestsSection);
				if (result == null) result = caseResultsSection(hibPhcrRelevantDxTestsSection);
				if (result == null) result = caseSection(hibPhcrRelevantDxTestsSection);
				if (result == null) result = caseAct(hibPhcrRelevantDxTestsSection);
				if (result == null) result = caseInfrastructureRoot(hibPhcrRelevantDxTestsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HibPackage.HIB_RESULT_OBSERVATION: {
				HibResultObservation hibResultObservation = (HibResultObservation)theEObject;
				T result = caseHibResultObservation(hibResultObservation);
				if (result == null) result = casePhcr_ResultObservation(hibResultObservation);
				if (result == null) result = caseResultObservation(hibResultObservation);
				if (result == null) result = caseObservation(hibResultObservation);
				if (result == null) result = caseClinicalStatement(hibResultObservation);
				if (result == null) result = caseAct(hibResultObservation);
				if (result == null) result = caseInfrastructureRoot(hibResultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HibPackage.HIB_RESULT_ORGANIZER: {
				HibResultOrganizer hibResultOrganizer = (HibResultOrganizer)theEObject;
				T result = caseHibResultOrganizer(hibResultOrganizer);
				if (result == null) result = casePhcr_ResultOrganizer(hibResultOrganizer);
				if (result == null) result = caseResultOrganizer(hibResultOrganizer);
				if (result == null) result = caseOrganizer(hibResultOrganizer);
				if (result == null) result = caseClinicalStatement(hibResultOrganizer);
				if (result == null) result = caseAct(hibResultOrganizer);
				if (result == null) result = caseInfrastructureRoot(hibResultOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>HIB Case Report</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIB Case Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHIBCaseReport(HIBCaseReport object)
  {
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
	public T caseHibPhcrClinicalInformationSection(HibPhcrClinicalInformationSection object) {
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
	public T caseHibCaseObservation(HibCaseObservation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Signs And Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signs And Symptoms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHibSignsAndSymptoms(HibSignsAndSymptoms object) {
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
	public T caseHibPhcrRelevantDxTestsSection(HibPhcrRelevantDxTestsSection object) {
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
	public T caseHibResultObservation(HibResultObservation object) {
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
	public T caseHibResultOrganizer(HibResultOrganizer object) {
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

} //HibSwitch
