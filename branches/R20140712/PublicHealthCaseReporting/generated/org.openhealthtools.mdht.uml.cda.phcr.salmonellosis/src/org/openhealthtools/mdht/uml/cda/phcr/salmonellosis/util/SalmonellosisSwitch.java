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
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util;

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
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisSignsAndSymptomsObservation;
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
 * @see org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage
 * @generated
 */
public class SalmonellosisSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SalmonellosisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalmonellosisSwitch() {
		if (modelPackage == null) {
			modelPackage = SalmonellosisPackage.eINSTANCE;
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
			case SalmonellosisPackage.SALMONELLOSIS_CASE_REPORT: {
				SalmonellosisCaseReport salmonellosisCaseReport = (SalmonellosisCaseReport)theEObject;
				T result = caseSalmonellosisCaseReport(salmonellosisCaseReport);
				if (result == null) result = casePublicHealthCaseReport(salmonellosisCaseReport);
				if (result == null) result = caseClinicalDocument(salmonellosisCaseReport);
				if (result == null) result = caseAct(salmonellosisCaseReport);
				if (result == null) result = caseInfrastructureRoot(salmonellosisCaseReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION: {
				SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection = (SalmonellosisPHCRSocialHistorySection)theEObject;
				T result = caseSalmonellosisPHCRSocialHistorySection(salmonellosisPHCRSocialHistorySection);
				if (result == null) result = casePhcrSocialHistorySection(salmonellosisPHCRSocialHistorySection);
				if (result == null) result = caseSocialHistorySection(salmonellosisPHCRSocialHistorySection);
				if (result == null) result = caseSection(salmonellosisPHCRSocialHistorySection);
				if (result == null) result = caseAct(salmonellosisPHCRSocialHistorySection);
				if (result == null) result = caseInfrastructureRoot(salmonellosisPHCRSocialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT: {
				SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct = (SalmonellosisPossibleExposureLocationAndTypeAct)theEObject;
				T result = caseSalmonellosisPossibleExposureLocationAndTypeAct(salmonellosisPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseCDA_Act(salmonellosisPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseClinicalStatement(salmonellosisPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseAct(salmonellosisPossibleExposureLocationAndTypeAct);
				if (result == null) result = caseInfrastructureRoot(salmonellosisPossibleExposureLocationAndTypeAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.HIV_STATUS_OBSERVATION: {
				HIVStatusObservation hivStatusObservation = (HIVStatusObservation)theEObject;
				T result = caseHIVStatusObservation(hivStatusObservation);
				if (result == null) result = caseObservation(hivStatusObservation);
				if (result == null) result = caseClinicalStatement(hivStatusObservation);
				if (result == null) result = caseAct(hivStatusObservation);
				if (result == null) result = caseInfrastructureRoot(hivStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION: {
				SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection = (SalmonellosisPHCRRelevantDxTestsSection)theEObject;
				T result = caseSalmonellosisPHCRRelevantDxTestsSection(salmonellosisPHCRRelevantDxTestsSection);
				if (result == null) result = casePhcrRelevantDxTestsSection(salmonellosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseResultsSection(salmonellosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseSection(salmonellosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseAct(salmonellosisPHCRRelevantDxTestsSection);
				if (result == null) result = caseInfrastructureRoot(salmonellosisPHCRRelevantDxTestsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_RESULT_ORGANIZER: {
				SalmonellosisResultOrganizer salmonellosisResultOrganizer = (SalmonellosisResultOrganizer)theEObject;
				T result = caseSalmonellosisResultOrganizer(salmonellosisResultOrganizer);
				if (result == null) result = casePhcr_ResultOrganizer(salmonellosisResultOrganizer);
				if (result == null) result = caseResultOrganizer(salmonellosisResultOrganizer);
				if (result == null) result = caseOrganizer(salmonellosisResultOrganizer);
				if (result == null) result = caseClinicalStatement(salmonellosisResultOrganizer);
				if (result == null) result = caseAct(salmonellosisResultOrganizer);
				if (result == null) result = caseInfrastructureRoot(salmonellosisResultOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_RESULT_OBSERVATION: {
				SalmonellosisResultObservation salmonellosisResultObservation = (SalmonellosisResultObservation)theEObject;
				T result = caseSalmonellosisResultObservation(salmonellosisResultObservation);
				if (result == null) result = casePhcr_ResultObservation(salmonellosisResultObservation);
				if (result == null) result = caseResultObservation(salmonellosisResultObservation);
				if (result == null) result = caseObservation(salmonellosisResultObservation);
				if (result == null) result = caseClinicalStatement(salmonellosisResultObservation);
				if (result == null) result = caseAct(salmonellosisResultObservation);
				if (result == null) result = caseInfrastructureRoot(salmonellosisResultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION: {
				SalmonellosisPHCRClinicalInformationSection salmonellosisPHCRClinicalInformationSection = (SalmonellosisPHCRClinicalInformationSection)theEObject;
				T result = caseSalmonellosisPHCRClinicalInformationSection(salmonellosisPHCRClinicalInformationSection);
				if (result == null) result = casePhcrClinicalInformationSection(salmonellosisPHCRClinicalInformationSection);
				if (result == null) result = caseSection(salmonellosisPHCRClinicalInformationSection);
				if (result == null) result = caseAct(salmonellosisPHCRClinicalInformationSection);
				if (result == null) result = caseInfrastructureRoot(salmonellosisPHCRClinicalInformationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_CASE_OBSERVATION: {
				SalmonellosisCaseObservation salmonellosisCaseObservation = (SalmonellosisCaseObservation)theEObject;
				T result = caseSalmonellosisCaseObservation(salmonellosisCaseObservation);
				if (result == null) result = caseCaseObservation(salmonellosisCaseObservation);
				if (result == null) result = caseProblemObservation(salmonellosisCaseObservation);
				if (result == null) result = caseObservation(salmonellosisCaseObservation);
				if (result == null) result = caseClinicalStatement(salmonellosisCaseObservation);
				if (result == null) result = caseAct(salmonellosisCaseObservation);
				if (result == null) result = caseInfrastructureRoot(salmonellosisCaseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SalmonellosisPackage.SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION: {
				SalmonellosisSignsAndSymptomsObservation salmonellosisSignsAndSymptomsObservation = (SalmonellosisSignsAndSymptomsObservation)theEObject;
				T result = caseSalmonellosisSignsAndSymptomsObservation(salmonellosisSignsAndSymptomsObservation);
				if (result == null) result = caseSignsAndSymptomsObservation(salmonellosisSignsAndSymptomsObservation);
				if (result == null) result = caseObservation(salmonellosisSignsAndSymptomsObservation);
				if (result == null) result = caseClinicalStatement(salmonellosisSignsAndSymptomsObservation);
				if (result == null) result = caseAct(salmonellosisSignsAndSymptomsObservation);
				if (result == null) result = caseInfrastructureRoot(salmonellosisSignsAndSymptomsObservation);
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
	public T caseSalmonellosisCaseReport(SalmonellosisCaseReport object) {
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
	public T caseSalmonellosisPHCRSocialHistorySection(SalmonellosisPHCRSocialHistorySection object) {
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
	public T caseSalmonellosisPHCRRelevantDxTestsSection(SalmonellosisPHCRRelevantDxTestsSection object) {
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
	public T caseSalmonellosisResultOrganizer(SalmonellosisResultOrganizer object) {
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
	public T caseSalmonellosisResultObservation(SalmonellosisResultObservation object) {
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
	public T caseSalmonellosisPHCRClinicalInformationSection(SalmonellosisPHCRClinicalInformationSection object) {
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
	public T caseSalmonellosisCaseObservation(SalmonellosisCaseObservation object) {
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
	public T caseSalmonellosisSignsAndSymptomsObservation(SalmonellosisSignsAndSymptomsObservation object) {
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
	public T caseSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPossibleExposureLocationAndTypeAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIV Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIV Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIVStatusObservation(HIVStatusObservation object) {
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

} //SalmonellosisSwitch
