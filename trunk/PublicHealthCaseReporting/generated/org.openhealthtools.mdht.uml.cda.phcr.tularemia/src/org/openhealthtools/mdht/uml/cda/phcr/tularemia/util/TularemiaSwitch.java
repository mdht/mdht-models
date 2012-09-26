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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.util;

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

import org.openhealthtools.mdht.uml.cda.phcr.tularemia.*;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage
 * @generated
 */
public class TularemiaSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TularemiaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TularemiaSwitch() {
		if (modelPackage == null) {
			modelPackage = TularemiaPackage.eINSTANCE;
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
			case TularemiaPackage.TULAREMIA_CASE_REPORT: {
				TularemiaCaseReport tularemiaCaseReport = (TularemiaCaseReport)theEObject;
				T result = caseTularemiaCaseReport(tularemiaCaseReport);
				if (result == null) result = casePublicHealthCaseReport(tularemiaCaseReport);
				if (result == null) result = caseClinicalDocument(tularemiaCaseReport);
				if (result == null) result = caseAct(tularemiaCaseReport);
				if (result == null) result = caseInfrastructureRoot(tularemiaCaseReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION: {
				TularemiaPHCRSocialHistorySection tularemiaPHCRSocialHistorySection = (TularemiaPHCRSocialHistorySection)theEObject;
				T result = caseTularemiaPHCRSocialHistorySection(tularemiaPHCRSocialHistorySection);
				if (result == null) result = casePhcrSocialHistorySection(tularemiaPHCRSocialHistorySection);
				if (result == null) result = caseSocialHistorySection(tularemiaPHCRSocialHistorySection);
				if (result == null) result = caseSection(tularemiaPHCRSocialHistorySection);
				if (result == null) result = caseAct(tularemiaPHCRSocialHistorySection);
				if (result == null) result = caseInfrastructureRoot(tularemiaPHCRSocialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT: {
				TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct = (TularemiaPossibleExposureLocationAndTypeAct)theEObject;
				T result = caseTularemiaPossibleExposureLocationAndTypeAct(tularemiaPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseCDA_Act(tularemiaPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseClinicalStatement(tularemiaPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseAct(tularemiaPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseInfrastructureRoot(tularemiaPossibleExposureLocationAndTypeAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION: {
				TularemiaPHCRClinicalInformationSection tularemiaPHCRClinicalInformationSection = (TularemiaPHCRClinicalInformationSection)theEObject;
				T result = caseTularemiaPHCRClinicalInformationSection(tularemiaPHCRClinicalInformationSection);
				if (result == null) result = casePhcrClinicalInformationSection(tularemiaPHCRClinicalInformationSection);
				if (result == null) result = caseSection(tularemiaPHCRClinicalInformationSection);
				if (result == null) result = caseAct(tularemiaPHCRClinicalInformationSection);
				if (result == null) result = caseInfrastructureRoot(tularemiaPHCRClinicalInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_CASE_OBSERVATION: {
				TularemiaCaseObservation tularemiaCaseObservation = (TularemiaCaseObservation)theEObject;
				T result = caseTularemiaCaseObservation(tularemiaCaseObservation);
				if (result == null) result = caseCaseObservation(tularemiaCaseObservation);
				if (result == null) result = caseProblemObservation(tularemiaCaseObservation);
				if (result == null) result = caseObservation(tularemiaCaseObservation);
				if (result == null) result = caseClinicalStatement(tularemiaCaseObservation);
				if (result == null) result = caseAct(tularemiaCaseObservation);
				if (result == null) result = caseInfrastructureRoot(tularemiaCaseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION: {
				TularemiaSignsAndSymptomsObservation tularemiaSignsAndSymptomsObservation = (TularemiaSignsAndSymptomsObservation)theEObject;
				T result = caseTularemiaSignsAndSymptomsObservation(tularemiaSignsAndSymptomsObservation);
				if (result == null) result = caseSignsAndSymptomsObservation(tularemiaSignsAndSymptomsObservation);
				if (result == null) result = caseObservation(tularemiaSignsAndSymptomsObservation);
				if (result == null) result = caseClinicalStatement(tularemiaSignsAndSymptomsObservation);
				if (result == null) result = caseAct(tularemiaSignsAndSymptomsObservation);
				if (result == null) result = caseInfrastructureRoot(tularemiaSignsAndSymptomsObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.LOCATION_OF_LESION_OBSERVATION: {
				LocationOfLesionObservation locationOfLesionObservation = (LocationOfLesionObservation)theEObject;
				T result = caseLocationOfLesionObservation(locationOfLesionObservation);
				if (result == null) result = caseObservation(locationOfLesionObservation);
				if (result == null) result = caseClinicalStatement(locationOfLesionObservation);
				if (result == null) result = caseAct(locationOfLesionObservation);
				if (result == null) result = caseInfrastructureRoot(locationOfLesionObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION: {
				TularemiaPHCRTreatmentInformationSection tularemiaPHCRTreatmentInformationSection = (TularemiaPHCRTreatmentInformationSection)theEObject;
				T result = caseTularemiaPHCRTreatmentInformationSection(tularemiaPHCRTreatmentInformationSection);
				if (result == null) result = casePhcrTreatmentInformationSection(tularemiaPHCRTreatmentInformationSection);
				if (result == null) result = caseSection(tularemiaPHCRTreatmentInformationSection);
				if (result == null) result = caseAct(tularemiaPHCRTreatmentInformationSection);
				if (result == null) result = caseInfrastructureRoot(tularemiaPHCRTreatmentInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_THERAPEUTIC_REGIMEN_ACT: {
				TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct = (TularemiaTherapeuticRegimenAct)theEObject;
				T result = caseTularemiaTherapeuticRegimenAct(tularemiaTherapeuticRegimenAct);
				if (result == null) result = caseTherapeuticRegimenAct(tularemiaTherapeuticRegimenAct);
				if (result == null) result = caseCDA_Act(tularemiaTherapeuticRegimenAct);
				if (result == null) result = caseClinicalStatement(tularemiaTherapeuticRegimenAct);
				if (result == null) result = caseAct(tularemiaTherapeuticRegimenAct);
				if (result == null) result = caseInfrastructureRoot(tularemiaTherapeuticRegimenAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				TularemiaTreatmentGivenSubstanceAdministration tularemiaTreatmentGivenSubstanceAdministration = (TularemiaTreatmentGivenSubstanceAdministration)theEObject;
				T result = caseTularemiaTreatmentGivenSubstanceAdministration(tularemiaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentGivenSubstanceAdministration(tularemiaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(tularemiaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(tularemiaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseAct(tularemiaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(tularemiaTreatmentGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				TularemiaTreatmentNotGivenSubstanceAdministration tularemiaTreatmentNotGivenSubstanceAdministration = (TularemiaTreatmentNotGivenSubstanceAdministration)theEObject;
				T result = caseTularemiaTreatmentNotGivenSubstanceAdministration(tularemiaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(tularemiaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(tularemiaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(tularemiaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseAct(tularemiaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(tularemiaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION: {
				TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection = (TularemiaPHCRRelevantDxTestsSection)theEObject;
				T result = caseTularemiaPHCRRelevantDxTestsSection(tularemiaPHCRRelevantDxTestsSection);
				if (result == null) result = casePhcrRelevantDxTestsSection(tularemiaPHCRRelevantDxTestsSection);
				if (result == null) result = caseResultsSection(tularemiaPHCRRelevantDxTestsSection);
				if (result == null) result = caseSection(tularemiaPHCRRelevantDxTestsSection);
				if (result == null) result = caseAct(tularemiaPHCRRelevantDxTestsSection);
				if (result == null) result = caseInfrastructureRoot(tularemiaPHCRRelevantDxTestsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_RESULT_ORGANIZER: {
				TularemiaResultOrganizer tularemiaResultOrganizer = (TularemiaResultOrganizer)theEObject;
				T result = caseTularemiaResultOrganizer(tularemiaResultOrganizer);
				if (result == null) result = casePhcr_ResultOrganizer(tularemiaResultOrganizer);
				if (result == null) result = caseResultOrganizer(tularemiaResultOrganizer);
				if (result == null) result = caseOrganizer(tularemiaResultOrganizer);
				if (result == null) result = caseClinicalStatement(tularemiaResultOrganizer);
				if (result == null) result = caseAct(tularemiaResultOrganizer);
				if (result == null) result = caseInfrastructureRoot(tularemiaResultOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TularemiaPackage.TULAREMIA_RESULT_OBSERVATION: {
				TularemiaResultObservation tularemiaResultObservation = (TularemiaResultObservation)theEObject;
				T result = caseTularemiaResultObservation(tularemiaResultObservation);
				if (result == null) result = casePhcr_ResultObservation(tularemiaResultObservation);
				if (result == null) result = caseResultObservation(tularemiaResultObservation);
				if (result == null) result = caseObservation(tularemiaResultObservation);
				if (result == null) result = caseClinicalStatement(tularemiaResultObservation);
				if (result == null) result = caseAct(tularemiaResultObservation);
				if (result == null) result = caseInfrastructureRoot(tularemiaResultObservation);
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
	public T caseTularemiaCaseReport(TularemiaCaseReport object) {
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
	public T caseTularemiaPHCRSocialHistorySection(TularemiaPHCRSocialHistorySection object) {
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
	public T caseTularemiaPossibleExposureLocationAndTypeAct(TularemiaPossibleExposureLocationAndTypeAct object) {
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
	public T caseTularemiaPHCRClinicalInformationSection(TularemiaPHCRClinicalInformationSection object) {
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
	public T caseTularemiaCaseObservation(TularemiaCaseObservation object) {
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
	public T caseTularemiaSignsAndSymptomsObservation(TularemiaSignsAndSymptomsObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Of Lesion Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationOfLesionObservation(LocationOfLesionObservation object) {
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
	public T caseTularemiaPHCRTreatmentInformationSection(TularemiaPHCRTreatmentInformationSection object) {
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
	public T caseTularemiaTherapeuticRegimenAct(TularemiaTherapeuticRegimenAct object) {
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
	public T caseTularemiaTreatmentGivenSubstanceAdministration(TularemiaTreatmentGivenSubstanceAdministration object) {
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
	public T caseTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTreatmentNotGivenSubstanceAdministration object) {
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
	public T caseTularemiaPHCRRelevantDxTestsSection(TularemiaPHCRRelevantDxTestsSection object) {
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
	public T caseTularemiaResultOrganizer(TularemiaResultOrganizer object) {
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
	public T caseTularemiaResultObservation(TularemiaResultObservation object) {
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

} //TularemiaSwitch
