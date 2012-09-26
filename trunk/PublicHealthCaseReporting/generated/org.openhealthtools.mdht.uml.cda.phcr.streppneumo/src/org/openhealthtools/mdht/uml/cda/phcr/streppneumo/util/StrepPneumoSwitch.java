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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
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

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage
 * @generated
 */
public class StrepPneumoSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StrepPneumoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoSwitch() {
		if (modelPackage == null) {
			modelPackage = StrepPneumoPackage.eINSTANCE;
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
			case StrepPneumoPackage.STREP_PNEUMO_CASE_REPORT: {
				StrepPneumoCaseReport strepPneumoCaseReport = (StrepPneumoCaseReport)theEObject;
				T result = caseStrepPneumoCaseReport(strepPneumoCaseReport);
				if (result == null) result = casePublicHealthCaseReport(strepPneumoCaseReport);
				if (result == null) result = caseClinicalDocument(strepPneumoCaseReport);
				if (result == null) result = caseAct(strepPneumoCaseReport);
				if (result == null) result = caseInfrastructureRoot(strepPneumoCaseReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION: {
				StrepPneumoPHCRClinicalInformationSection strepPneumoPHCRClinicalInformationSection = (StrepPneumoPHCRClinicalInformationSection)theEObject;
				T result = caseStrepPneumoPHCRClinicalInformationSection(strepPneumoPHCRClinicalInformationSection);
				if (result == null) result = casePhcrClinicalInformationSection(strepPneumoPHCRClinicalInformationSection);
				if (result == null) result = caseSection(strepPneumoPHCRClinicalInformationSection);
				if (result == null) result = caseAct(strepPneumoPHCRClinicalInformationSection);
				if (result == null) result = caseInfrastructureRoot(strepPneumoPHCRClinicalInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_CASE_OBSERVATION: {
				StrepPneumoCaseObservation strepPneumoCaseObservation = (StrepPneumoCaseObservation)theEObject;
				T result = caseStrepPneumoCaseObservation(strepPneumoCaseObservation);
				if (result == null) result = caseCaseObservation(strepPneumoCaseObservation);
				if (result == null) result = caseProblemObservation(strepPneumoCaseObservation);
				if (result == null) result = caseObservation(strepPneumoCaseObservation);
				if (result == null) result = caseClinicalStatement(strepPneumoCaseObservation);
				if (result == null) result = caseAct(strepPneumoCaseObservation);
				if (result == null) result = caseInfrastructureRoot(strepPneumoCaseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION: {
				StrepPneumoSignsAndSymptomsObservation strepPneumoSignsAndSymptomsObservation = (StrepPneumoSignsAndSymptomsObservation)theEObject;
				T result = caseStrepPneumoSignsAndSymptomsObservation(strepPneumoSignsAndSymptomsObservation);
				if (result == null) result = caseSignsAndSymptomsObservation(strepPneumoSignsAndSymptomsObservation);
				if (result == null) result = caseObservation(strepPneumoSignsAndSymptomsObservation);
				if (result == null) result = caseClinicalStatement(strepPneumoSignsAndSymptomsObservation);
				if (result == null) result = caseAct(strepPneumoSignsAndSymptomsObservation);
				if (result == null) result = caseInfrastructureRoot(strepPneumoSignsAndSymptomsObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION: {
				StrepPneumoPHCRTreatmentInformationSection strepPneumoPHCRTreatmentInformationSection = (StrepPneumoPHCRTreatmentInformationSection)theEObject;
				T result = caseStrepPneumoPHCRTreatmentInformationSection(strepPneumoPHCRTreatmentInformationSection);
				if (result == null) result = casePhcrTreatmentInformationSection(strepPneumoPHCRTreatmentInformationSection);
				if (result == null) result = caseSection(strepPneumoPHCRTreatmentInformationSection);
				if (result == null) result = caseAct(strepPneumoPHCRTreatmentInformationSection);
				if (result == null) result = caseInfrastructureRoot(strepPneumoPHCRTreatmentInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT: {
				StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct = (StrepPneumoTherapeuticRegimenAct)theEObject;
				T result = caseStrepPneumoTherapeuticRegimenAct(strepPneumoTherapeuticRegimenAct);
				if (result == null) result = caseTherapeuticRegimenAct(strepPneumoTherapeuticRegimenAct);
				if (result == null) result = caseCDA_Act(strepPneumoTherapeuticRegimenAct);
				if (result == null) result = caseClinicalStatement(strepPneumoTherapeuticRegimenAct);
				if (result == null) result = caseAct(strepPneumoTherapeuticRegimenAct);
				if (result == null) result = caseInfrastructureRoot(strepPneumoTherapeuticRegimenAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				StrepPneumoTreatmentGivenSubstanceAdministration strepPneumoTreatmentGivenSubstanceAdministration = (StrepPneumoTreatmentGivenSubstanceAdministration)theEObject;
				T result = caseStrepPneumoTreatmentGivenSubstanceAdministration(strepPneumoTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentGivenSubstanceAdministration(strepPneumoTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(strepPneumoTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(strepPneumoTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseAct(strepPneumoTreatmentGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(strepPneumoTreatmentGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: {
				StrepPneumoTreatmentNotGivenSubstanceAdministration strepPneumoTreatmentNotGivenSubstanceAdministration = (StrepPneumoTreatmentNotGivenSubstanceAdministration)theEObject;
				T result = caseStrepPneumoTreatmentNotGivenSubstanceAdministration(strepPneumoTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseTreatmentNotGivenSubstanceAdministration(strepPneumoTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(strepPneumoTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseClinicalStatement(strepPneumoTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseAct(strepPneumoTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(strepPneumoTreatmentNotGivenSubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION: {
				StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection = (StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)theEObject;
				T result = caseStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = casePhcrRelevantDxTestsSection(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseResultsSection(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseSection(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseAct(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = caseInfrastructureRoot(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_RESULT_OBSERVATION: {
				StrepPneumoResultObservation strepPneumoResultObservation = (StrepPneumoResultObservation)theEObject;
				T result = caseStrepPneumoResultObservation(strepPneumoResultObservation);
				if (result == null) result = casePhcr_ResultObservation(strepPneumoResultObservation);
				if (result == null) result = caseResultObservation(strepPneumoResultObservation);
				if (result == null) result = caseObservation(strepPneumoResultObservation);
				if (result == null) result = caseClinicalStatement(strepPneumoResultObservation);
				if (result == null) result = caseAct(strepPneumoResultObservation);
				if (result == null) result = caseInfrastructureRoot(strepPneumoResultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_RESULT_ORGANIZER: {
				StrepPneumoResultOrganizer strepPneumoResultOrganizer = (StrepPneumoResultOrganizer)theEObject;
				T result = caseStrepPneumoResultOrganizer(strepPneumoResultOrganizer);
				if (result == null) result = casePhcr_ResultOrganizer(strepPneumoResultOrganizer);
				if (result == null) result = caseResultOrganizer(strepPneumoResultOrganizer);
				if (result == null) result = caseOrganizer(strepPneumoResultOrganizer);
				if (result == null) result = caseClinicalStatement(strepPneumoResultOrganizer);
				if (result == null) result = caseAct(strepPneumoResultOrganizer);
				if (result == null) result = caseInfrastructureRoot(strepPneumoResultOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_SOCIAL_HISTORY_SECTION: {
				StrepPneumoSocialHistorySection strepPneumoSocialHistorySection = (StrepPneumoSocialHistorySection)theEObject;
				T result = caseStrepPneumoSocialHistorySection(strepPneumoSocialHistorySection);
				if (result == null) result = casePhcrSocialHistorySection(strepPneumoSocialHistorySection);
				if (result == null) result = caseSocialHistorySection(strepPneumoSocialHistorySection);
				if (result == null) result = caseSection(strepPneumoSocialHistorySection);
				if (result == null) result = caseAct(strepPneumoSocialHistorySection);
				if (result == null) result = caseInfrastructureRoot(strepPneumoSocialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT: {
				StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct = (StrepPneumoPossibleExposureLocationAct)theEObject;
				T result = caseStrepPneumoPossibleExposureLocationAct(strepPneumoPossibleExposureLocationAct);
				if (result == null) result = caseCDA_Act(strepPneumoPossibleExposureLocationAct);
				if (result == null) result = caseClinicalStatement(strepPneumoPossibleExposureLocationAct);
				if (result == null) result = caseAct(strepPneumoPossibleExposureLocationAct);
				if (result == null) result = caseInfrastructureRoot(strepPneumoPossibleExposureLocationAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_SECTION: {
				StrepPneumoImmunizationSection strepPneumoImmunizationSection = (StrepPneumoImmunizationSection)theEObject;
				T result = caseStrepPneumoImmunizationSection(strepPneumoImmunizationSection);
				if (result == null) result = caseImmunizationsSection(strepPneumoImmunizationSection);
				if (result == null) result = caseSection(strepPneumoImmunizationSection);
				if (result == null) result = caseAct(strepPneumoImmunizationSection);
				if (result == null) result = caseInfrastructureRoot(strepPneumoImmunizationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_ACTIVITY: {
				StrepPneumoImmunizationActivity strepPneumoImmunizationActivity = (StrepPneumoImmunizationActivity)theEObject;
				T result = caseStrepPneumoImmunizationActivity(strepPneumoImmunizationActivity);
				if (result == null) result = caseMedicationActivity(strepPneumoImmunizationActivity);
				if (result == null) result = caseSubstanceAdministration(strepPneumoImmunizationActivity);
				if (result == null) result = caseClinicalStatement(strepPneumoImmunizationActivity);
				if (result == null) result = caseAct(strepPneumoImmunizationActivity);
				if (result == null) result = caseInfrastructureRoot(strepPneumoImmunizationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_PRODUCT: {
				StrepPneumoImmunizationProduct strepPneumoImmunizationProduct = (StrepPneumoImmunizationProduct)theEObject;
				T result = caseStrepPneumoImmunizationProduct(strepPneumoImmunizationProduct);
				if (result == null) result = caseProduct(strepPneumoImmunizationProduct);
				if (result == null) result = caseParticipation(strepPneumoImmunizationProduct);
				if (result == null) result = caseInfrastructureRoot(strepPneumoImmunizationProduct);
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
	public T caseStrepPneumoCaseReport(StrepPneumoCaseReport object) {
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
	public T caseStrepPneumoPHCRClinicalInformationSection(StrepPneumoPHCRClinicalInformationSection object) {
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
	public T caseStrepPneumoCaseObservation(StrepPneumoCaseObservation object) {
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
	public T caseStrepPneumoSignsAndSymptomsObservation(StrepPneumoSignsAndSymptomsObservation object) {
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
	public T caseStrepPneumoPHCRTreatmentInformationSection(StrepPneumoPHCRTreatmentInformationSection object) {
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
	public T caseStrepPneumoTherapeuticRegimenAct(StrepPneumoTherapeuticRegimenAct object) {
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
	public T caseStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTreatmentGivenSubstanceAdministration object) {
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
	public T caseStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTreatmentNotGivenSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection object) {
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
	public T caseStrepPneumoResultObservation(StrepPneumoResultObservation object) {
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
	public T caseStrepPneumoResultOrganizer(StrepPneumoResultOrganizer object) {
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
	public T caseStrepPneumoSocialHistorySection(StrepPneumoSocialHistorySection object) {
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
	public T caseStrepPneumoPossibleExposureLocationAct(StrepPneumoPossibleExposureLocationAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrepPneumoImmunizationSection(StrepPneumoImmunizationSection object) {
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
	public T caseStrepPneumoImmunizationActivity(StrepPneumoImmunizationActivity object) {
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
	public T caseStrepPneumoImmunizationProduct(StrepPneumoImmunizationProduct object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
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

} //StrepPneumoSwitch
