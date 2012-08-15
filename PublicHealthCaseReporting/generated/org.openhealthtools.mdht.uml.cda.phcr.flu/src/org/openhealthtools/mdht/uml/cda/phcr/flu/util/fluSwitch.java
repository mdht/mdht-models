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
package org.openhealthtools.mdht.uml.cda.phcr.flu.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.*;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage
 * @generated
 */
public class fluSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static fluPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fluSwitch() {
		if (modelPackage == null) {
			modelPackage = fluPackage.eINSTANCE;
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
			case fluPackage.INFLUENZA_CASE_REPORT: {
				InfluenzaCaseReport influenzaCaseReport = (InfluenzaCaseReport)theEObject;
				T result = caseInfluenzaCaseReport(influenzaCaseReport);
				if (result == null) result = casePublicHealthCaseReport(influenzaCaseReport);
				if (result == null) result = caseClinicalDocument(influenzaCaseReport);
				if (result == null) result = caseAct(influenzaCaseReport);
				if (result == null) result = caseInfrastructureRoot(influenzaCaseReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_IMMUNIZATION_SECTION: {
				InfluenzaImmunizationSection influenzaImmunizationSection = (InfluenzaImmunizationSection)theEObject;
				T result = caseInfluenzaImmunizationSection(influenzaImmunizationSection);
				if (result == null) result = caseImmunizationsSection(influenzaImmunizationSection);
				if (result == null) result = caseSection(influenzaImmunizationSection);
				if (result == null) result = caseAct(influenzaImmunizationSection);
				if (result == null) result = caseInfrastructureRoot(influenzaImmunizationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_IMMUNIZATION_ACTIVITY: {
				InfluenzaImmunizationActivity influenzaImmunizationActivity = (InfluenzaImmunizationActivity)theEObject;
				T result = caseInfluenzaImmunizationActivity(influenzaImmunizationActivity);
				if (result == null) result = caseMedicationActivity(influenzaImmunizationActivity);
				if (result == null) result = caseSubstanceAdministration(influenzaImmunizationActivity);
				if (result == null) result = caseClinicalStatement(influenzaImmunizationActivity);
				if (result == null) result = caseAct(influenzaImmunizationActivity);
				if (result == null) result = caseInfrastructureRoot(influenzaImmunizationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION: {
				InfluenzaPHCRClinicalInformationSection influenzaPHCRClinicalInformationSection = (InfluenzaPHCRClinicalInformationSection)theEObject;
				T result = caseInfluenzaPHCRClinicalInformationSection(influenzaPHCRClinicalInformationSection);
				if (result == null) result = casePhcrClinicalInformationSection(influenzaPHCRClinicalInformationSection);
				if (result == null) result = caseSection(influenzaPHCRClinicalInformationSection);
				if (result == null) result = caseAct(influenzaPHCRClinicalInformationSection);
				if (result == null) result = caseInfrastructureRoot(influenzaPHCRClinicalInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_CASE_OBSERVATION: {
				InfluenzaCaseObservation influenzaCaseObservation = (InfluenzaCaseObservation)theEObject;
				T result = caseInfluenzaCaseObservation(influenzaCaseObservation);
				if (result == null) result = caseCaseObservation(influenzaCaseObservation);
				if (result == null) result = caseProblemObservation(influenzaCaseObservation);
				if (result == null) result = caseObservation(influenzaCaseObservation);
				if (result == null) result = caseClinicalStatement(influenzaCaseObservation);
				if (result == null) result = caseAct(influenzaCaseObservation);
				if (result == null) result = caseInfrastructureRoot(influenzaCaseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION: {
				InfluenzaSignsAndSymptomsObservation influenzaSignsAndSymptomsObservation = (InfluenzaSignsAndSymptomsObservation)theEObject;
				T result = caseInfluenzaSignsAndSymptomsObservation(influenzaSignsAndSymptomsObservation);
				if (result == null) result = caseSignsAndSymptomsObservation(influenzaSignsAndSymptomsObservation);
				if (result == null) result = caseObservation(influenzaSignsAndSymptomsObservation);
				if (result == null) result = caseClinicalStatement(influenzaSignsAndSymptomsObservation);
				if (result == null) result = caseAct(influenzaSignsAndSymptomsObservation);
				if (result == null) result = caseInfrastructureRoot(influenzaSignsAndSymptomsObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION: {
				InfluenzaPHCRTreatmentInformationSection influenzaPHCRTreatmentInformationSection = (InfluenzaPHCRTreatmentInformationSection)theEObject;
				T result = caseInfluenzaPHCRTreatmentInformationSection(influenzaPHCRTreatmentInformationSection);
				if (result == null) result = casePhcrTreatmentInformationSection(influenzaPHCRTreatmentInformationSection);
				if (result == null) result = caseSection(influenzaPHCRTreatmentInformationSection);
				if (result == null) result = caseAct(influenzaPHCRTreatmentInformationSection);
				if (result == null) result = caseInfrastructureRoot(influenzaPHCRTreatmentInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_THERAPEUTIC_REGIMEN_ACT: {
				InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct = (InfluenzaTherapeuticRegimenAct)theEObject;
				T result = caseInfluenzaTherapeuticRegimenAct(influenzaTherapeuticRegimenAct);
				if (result == null) result = caseTherapeuticRegimenAct(influenzaTherapeuticRegimenAct);
				if (result == null) result = caseCDA_Act(influenzaTherapeuticRegimenAct);
				if (result == null) result = caseClinicalStatement(influenzaTherapeuticRegimenAct);
				if (result == null) result = caseAct(influenzaTherapeuticRegimenAct);
				if (result == null) result = caseInfrastructureRoot(influenzaTherapeuticRegimenAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				InfluenzaTreatmentGivenSubstanceAdministration influenzaTreatmentGivenSubstanceAdministration = (InfluenzaTreatmentGivenSubstanceAdministration)theEObject;
				T result = caseInfluenzaTreatmentGivenSubstanceAdministration(influenzaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentGivenSubstanceAdministration(influenzaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(influenzaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(influenzaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseAct(influenzaTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(influenzaTreatmentGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				InfluenzaTreatmentNotGivenSubstanceAdministration influenzaTreatmentNotGivenSubstanceAdministration = (InfluenzaTreatmentNotGivenSubstanceAdministration)theEObject;
				T result = caseInfluenzaTreatmentNotGivenSubstanceAdministration(influenzaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(influenzaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(influenzaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(influenzaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseAct(influenzaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(influenzaTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION: {
				InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection = (InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)theEObject;
				T result = caseInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = casePhcrRelevantDxTestsSection(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseResultsSection(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseSection(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseAct(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseInfrastructureRoot(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_RESULT_OBSERVATION: {
				InfluenzaResultObservation influenzaResultObservation = (InfluenzaResultObservation)theEObject;
				T result = caseInfluenzaResultObservation(influenzaResultObservation);
				if (result == null) result = casePhcr_ResultObservation(influenzaResultObservation);
				if (result == null) result = caseResultObservation(influenzaResultObservation);
				if (result == null) result = caseObservation(influenzaResultObservation);
				if (result == null) result = caseClinicalStatement(influenzaResultObservation);
				if (result == null) result = caseAct(influenzaResultObservation);
				if (result == null) result = caseInfrastructureRoot(influenzaResultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_IMAGING_OBSERVATION: {
				InfluenzaImagingObservation influenzaImagingObservation = (InfluenzaImagingObservation)theEObject;
				T result = caseInfluenzaImagingObservation(influenzaImagingObservation);
				if (result == null) result = caseImagingObservation(influenzaImagingObservation);
				if (result == null) result = caseProblemObservation(influenzaImagingObservation);
				if (result == null) result = caseObservation(influenzaImagingObservation);
				if (result == null) result = caseClinicalStatement(influenzaImagingObservation);
				if (result == null) result = caseAct(influenzaImagingObservation);
				if (result == null) result = caseInfrastructureRoot(influenzaImagingObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION: {
				InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection = (InfluenzaPHCRSocialHistorySection)theEObject;
				T result = caseInfluenzaPHCRSocialHistorySection(influenzaPHCRSocialHistorySection);
				if (result == null) result = casePhcrSocialHistorySection(influenzaPHCRSocialHistorySection);
				if (result == null) result = caseSocialHistorySection(influenzaPHCRSocialHistorySection);
				if (result == null) result = caseSection(influenzaPHCRSocialHistorySection);
				if (result == null) result = caseAct(influenzaPHCRSocialHistorySection);
				if (result == null) result = caseInfrastructureRoot(influenzaPHCRSocialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION: {
				InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation = (InfluenzaEmploymentStatusObservation)theEObject;
				T result = caseInfluenzaEmploymentStatusObservation(influenzaEmploymentStatusObservation);
				if (result == null) result = caseObservation(influenzaEmploymentStatusObservation);
				if (result == null) result = caseClinicalStatement(influenzaEmploymentStatusObservation);
				if (result == null) result = caseAct(influenzaEmploymentStatusObservation);
				if (result == null) result = caseInfrastructureRoot(influenzaEmploymentStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT: {
				InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct = (InfluenzaPossibleExposureLocationAct)theEObject;
				T result = caseInfluenzaPossibleExposureLocationAct(influenzaPossibleExposureLocationAct);
				if (result == null) result = caseCDA_Act(influenzaPossibleExposureLocationAct);
				if (result == null) result = caseClinicalStatement(influenzaPossibleExposureLocationAct);
				if (result == null) result = caseAct(influenzaPossibleExposureLocationAct);
				if (result == null) result = caseInfrastructureRoot(influenzaPossibleExposureLocationAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case fluPackage.INFLUENZA_IMMUNIZATION_PRODUCT: {
				InfluenzaImmunizationProduct influenzaImmunizationProduct = (InfluenzaImmunizationProduct)theEObject;
				T result = caseInfluenzaImmunizationProduct(influenzaImmunizationProduct);
				if (result == null) result = caseProduct(influenzaImmunizationProduct);
				if (result == null) result = caseManufacturedProduct(influenzaImmunizationProduct);
				if (result == null) result = caseRole(influenzaImmunizationProduct);
				if (result == null) result = caseInfrastructureRoot(influenzaImmunizationProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Case Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaCaseReport(InfluenzaCaseReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Immunization Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Immunization Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaImmunizationSection(InfluenzaImmunizationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Immunization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaImmunizationActivity(InfluenzaImmunizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza PHCR Clinical Information Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaPHCRClinicalInformationSection(InfluenzaPHCRClinicalInformationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Case Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaCaseObservation(InfluenzaCaseObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Signs And Symptoms Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaSignsAndSymptomsObservation(InfluenzaSignsAndSymptomsObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza PHCR Treatment Information Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaPHCRTreatmentInformationSection(InfluenzaPHCRTreatmentInformationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Therapeutic Regimen Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaTherapeuticRegimenAct(InfluenzaTherapeuticRegimenAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Treatment Given Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTreatmentGivenSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Treatment Not Given Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTreatmentNotGivenSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaResultObservation(InfluenzaResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Imaging Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Imaging Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaImagingObservation(InfluenzaImagingObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza PHCR Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaPHCRSocialHistorySection(InfluenzaPHCRSocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Employment Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Employment Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaEmploymentStatusObservation(InfluenzaEmploymentStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Possible Exposure Location Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaPossibleExposureLocationAct(InfluenzaPossibleExposureLocationAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influenza Immunization Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influenza Immunization Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenzaImmunizationProduct(InfluenzaImmunizationProduct object) {
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
	public T caseImagingObservation(ImagingObservation object) {
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

} //fluSwitch
