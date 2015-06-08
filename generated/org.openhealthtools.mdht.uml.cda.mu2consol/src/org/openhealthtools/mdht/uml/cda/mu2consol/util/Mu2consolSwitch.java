/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public class Mu2consolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static Mu2consolPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Mu2consolSwitch() {
		if (modelPackage == null) {
			modelPackage = Mu2consolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS: {
			GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints) theEObject;
			T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(generalHeaderConstraints);
			}
			if (result == null) {
				result = caseClinicalDocument(generalHeaderConstraints);
			}
			if (result == null) {
				result = caseAct(generalHeaderConstraints);
			}
			if (result == null) {
				result = caseInfrastructureRoot(generalHeaderConstraints);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.SUMMARY_OF_CARE_RECORD: {
			SummaryOfCareRecord summaryOfCareRecord = (SummaryOfCareRecord) theEObject;
			T result = caseSummaryOfCareRecord(summaryOfCareRecord);
			if (result == null) {
				result = caseGeneralHeaderConstraints(summaryOfCareRecord);
			}
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(summaryOfCareRecord);
			}
			if (result == null) {
				result = caseClinicalDocument(summaryOfCareRecord);
			}
			if (result == null) {
				result = caseAct(summaryOfCareRecord);
			}
			if (result == null) {
				result = caseInfrastructureRoot(summaryOfCareRecord);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.SOCIAL_HISTORY_SECTION: {
			SocialHistorySection socialHistorySection = (SocialHistorySection) theEObject;
			T result = caseSocialHistorySection(socialHistorySection);
			if (result == null) {
				result = caseConsol_SocialHistorySection(socialHistorySection);
			}
			if (result == null) {
				result = caseSection(socialHistorySection);
			}
			if (result == null) {
				result = caseAct(socialHistorySection);
			}
			if (result == null) {
				result = caseInfrastructureRoot(socialHistorySection);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.SMOKING_STATUS_OBSERVATION: {
			SmokingStatusObservation smokingStatusObservation = (SmokingStatusObservation) theEObject;
			T result = caseSmokingStatusObservation(smokingStatusObservation);
			if (result == null) {
				result = caseConsol_SmokingStatusObservation(smokingStatusObservation);
			}
			if (result == null) {
				result = caseObservation(smokingStatusObservation);
			}
			if (result == null) {
				result = caseClinicalStatement(smokingStatusObservation);
			}
			if (result == null) {
				result = caseAct(smokingStatusObservation);
			}
			if (result == null) {
				result = caseInfrastructureRoot(smokingStatusObservation);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.RESULTS_SECTION: {
			ResultsSection resultsSection = (ResultsSection) theEObject;
			T result = caseResultsSection(resultsSection);
			if (result == null) {
				result = caseConsol_ResultsSection(resultsSection);
			}
			if (result == null) {
				result = caseResultsSectionEntriesOptional(resultsSection);
			}
			if (result == null) {
				result = caseSection(resultsSection);
			}
			if (result == null) {
				result = caseAct(resultsSection);
			}
			if (result == null) {
				result = caseInfrastructureRoot(resultsSection);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.RESULT_ORGANIZER: {
			ResultOrganizer resultOrganizer = (ResultOrganizer) theEObject;
			T result = caseResultOrganizer(resultOrganizer);
			if (result == null) {
				result = caseConsol_ResultOrganizer(resultOrganizer);
			}
			if (result == null) {
				result = caseOrganizer(resultOrganizer);
			}
			if (result == null) {
				result = caseClinicalStatement(resultOrganizer);
			}
			if (result == null) {
				result = caseAct(resultOrganizer);
			}
			if (result == null) {
				result = caseInfrastructureRoot(resultOrganizer);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.RESULT_OBSERVATION: {
			ResultObservation resultObservation = (ResultObservation) theEObject;
			T result = caseResultObservation(resultObservation);
			if (result == null) {
				result = caseConsol_ResultObservation(resultObservation);
			}
			if (result == null) {
				result = caseObservation(resultObservation);
			}
			if (result == null) {
				result = caseClinicalStatement(resultObservation);
			}
			if (result == null) {
				result = caseAct(resultObservation);
			}
			if (result == null) {
				result = caseInfrastructureRoot(resultObservation);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.PROCEDURES_SECTION: {
			ProceduresSection proceduresSection = (ProceduresSection) theEObject;
			T result = caseProceduresSection(proceduresSection);
			if (result == null) {
				result = caseConsol_ProceduresSection(proceduresSection);
			}
			if (result == null) {
				result = caseProceduresSectionEntriesOptional(proceduresSection);
			}
			if (result == null) {
				result = caseSection(proceduresSection);
			}
			if (result == null) {
				result = caseAct(proceduresSection);
			}
			if (result == null) {
				result = caseInfrastructureRoot(proceduresSection);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
			ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure) theEObject;
			T result = caseProcedureActivityProcedure(procedureActivityProcedure);
			if (result == null) {
				result = caseConsol_ProcedureActivityProcedure(procedureActivityProcedure);
			}
			if (result == null) {
				result = caseProcedure(procedureActivityProcedure);
			}
			if (result == null) {
				result = caseClinicalStatement(procedureActivityProcedure);
			}
			if (result == null) {
				result = caseAct(procedureActivityProcedure);
			}
			if (result == null) {
				result = caseInfrastructureRoot(procedureActivityProcedure);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY: {
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary = (ClinicalOfficeVisitSummary) theEObject;
			T result = caseClinicalOfficeVisitSummary(clinicalOfficeVisitSummary);
			if (result == null) {
				result = caseGeneralHeaderConstraints(clinicalOfficeVisitSummary);
			}
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(clinicalOfficeVisitSummary);
			}
			if (result == null) {
				result = caseClinicalDocument(clinicalOfficeVisitSummary);
			}
			if (result == null) {
				result = caseAct(clinicalOfficeVisitSummary);
			}
			if (result == null) {
				result = caseInfrastructureRoot(clinicalOfficeVisitSummary);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.MEDICATIONS_ADMINISTERED_SECTION: {
			MedicationsAdministeredSection medicationsAdministeredSection = (MedicationsAdministeredSection) theEObject;
			T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
			if (result == null) {
				result = caseConsol_MedicationsAdministeredSection(medicationsAdministeredSection);
			}
			if (result == null) {
				result = caseSection(medicationsAdministeredSection);
			}
			if (result == null) {
				result = caseAct(medicationsAdministeredSection);
			}
			if (result == null) {
				result = caseInfrastructureRoot(medicationsAdministeredSection);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.TRANSITION_OF_CARE_AMBULATORY_SUMMARY: {
			TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary = (TransitionOfCareAmbulatorySummary) theEObject;
			T result = caseTransitionOfCareAmbulatorySummary(transitionOfCareAmbulatorySummary);
			if (result == null) {
				result = caseSummaryOfCareRecord(transitionOfCareAmbulatorySummary);
			}
			if (result == null) {
				result = caseGeneralHeaderConstraints(transitionOfCareAmbulatorySummary);
			}
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(transitionOfCareAmbulatorySummary);
			}
			if (result == null) {
				result = caseClinicalDocument(transitionOfCareAmbulatorySummary);
			}
			if (result == null) {
				result = caseAct(transitionOfCareAmbulatorySummary);
			}
			if (result == null) {
				result = caseInfrastructureRoot(transitionOfCareAmbulatorySummary);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.TRANSITION_OF_CARE_INPATIENT_SUMMARY: {
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary = (TransitionOfCareInpatientSummary) theEObject;
			T result = caseTransitionOfCareInpatientSummary(transitionOfCareInpatientSummary);
			if (result == null) {
				result = caseSummaryOfCareRecord(transitionOfCareInpatientSummary);
			}
			if (result == null) {
				result = caseGeneralHeaderConstraints(transitionOfCareInpatientSummary);
			}
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(transitionOfCareInpatientSummary);
			}
			if (result == null) {
				result = caseClinicalDocument(transitionOfCareInpatientSummary);
			}
			if (result == null) {
				result = caseAct(transitionOfCareInpatientSummary);
			}
			if (result == null) {
				result = caseInfrastructureRoot(transitionOfCareInpatientSummary);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.VIEW_DOWNLOAD_TRANSMIT_SUMMARY: {
			ViewDownloadTransmitSummary viewDownloadTransmitSummary = (ViewDownloadTransmitSummary) theEObject;
			T result = caseViewDownloadTransmitSummary(viewDownloadTransmitSummary);
			if (result == null) {
				result = caseGeneralHeaderConstraints(viewDownloadTransmitSummary);
			}
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(viewDownloadTransmitSummary);
			}
			if (result == null) {
				result = caseClinicalDocument(viewDownloadTransmitSummary);
			}
			if (result == null) {
				result = caseAct(viewDownloadTransmitSummary);
			}
			if (result == null) {
				result = caseInfrastructureRoot(viewDownloadTransmitSummary);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.VDT_INPATIENT_SUMMARY: {
			VDTInpatientSummary vdtInpatientSummary = (VDTInpatientSummary) theEObject;
			T result = caseVDTInpatientSummary(vdtInpatientSummary);
			if (result == null) {
				result = caseViewDownloadTransmitSummary(vdtInpatientSummary);
			}
			if (result == null) {
				result = caseGeneralHeaderConstraints(vdtInpatientSummary);
			}
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(vdtInpatientSummary);
			}
			if (result == null) {
				result = caseClinicalDocument(vdtInpatientSummary);
			}
			if (result == null) {
				result = caseAct(vdtInpatientSummary);
			}
			if (result == null) {
				result = caseInfrastructureRoot(vdtInpatientSummary);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.VDT_AMBULATORY_SUMMARY: {
			VDTAmbulatorySummary vdtAmbulatorySummary = (VDTAmbulatorySummary) theEObject;
			T result = caseVDTAmbulatorySummary(vdtAmbulatorySummary);
			if (result == null) {
				result = caseViewDownloadTransmitSummary(vdtAmbulatorySummary);
			}
			if (result == null) {
				result = caseGeneralHeaderConstraints(vdtAmbulatorySummary);
			}
			if (result == null) {
				result = caseConsol_GeneralHeaderConstraints(vdtAmbulatorySummary);
			}
			if (result == null) {
				result = caseClinicalDocument(vdtAmbulatorySummary);
			}
			if (result == null) {
				result = caseAct(vdtAmbulatorySummary);
			}
			if (result == null) {
				result = caseInfrastructureRoot(vdtAmbulatorySummary);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.FUNCTIONAL_STATUS_SECTION: {
			FunctionalStatusSection functionalStatusSection = (FunctionalStatusSection) theEObject;
			T result = caseFunctionalStatusSection(functionalStatusSection);
			if (result == null) {
				result = caseConsol_FunctionalStatusSection(functionalStatusSection);
			}
			if (result == null) {
				result = caseSection(functionalStatusSection);
			}
			if (result == null) {
				result = caseAct(functionalStatusSection);
			}
			if (result == null) {
				result = caseInfrastructureRoot(functionalStatusSection);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION: {
			CognitiveStatusResultObservation cognitiveStatusResultObservation = (CognitiveStatusResultObservation) theEObject;
			T result = caseCognitiveStatusResultObservation(cognitiveStatusResultObservation);
			if (result == null) {
				result = caseConsol_CognitiveStatusResultObservation(cognitiveStatusResultObservation);
			}
			if (result == null) {
				result = caseResultObservation(cognitiveStatusResultObservation);
			}
			if (result == null) {
				result = caseConsol_ResultObservation(cognitiveStatusResultObservation);
			}
			if (result == null) {
				result = caseObservation(cognitiveStatusResultObservation);
			}
			if (result == null) {
				result = caseClinicalStatement(cognitiveStatusResultObservation);
			}
			if (result == null) {
				result = caseAct(cognitiveStatusResultObservation);
			}
			if (result == null) {
				result = caseInfrastructureRoot(cognitiveStatusResultObservation);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER: {
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer = (CognitiveStatusResultOrganizer) theEObject;
			T result = caseCognitiveStatusResultOrganizer(cognitiveStatusResultOrganizer);
			if (result == null) {
				result = caseConsol_CognitiveStatusResultOrganizer(cognitiveStatusResultOrganizer);
			}
			if (result == null) {
				result = caseResultOrganizer(cognitiveStatusResultOrganizer);
			}
			if (result == null) {
				result = caseConsol_ResultOrganizer(cognitiveStatusResultOrganizer);
			}
			if (result == null) {
				result = caseOrganizer(cognitiveStatusResultOrganizer);
			}
			if (result == null) {
				result = caseClinicalStatement(cognitiveStatusResultOrganizer);
			}
			if (result == null) {
				result = caseAct(cognitiveStatusResultOrganizer);
			}
			if (result == null) {
				result = caseInfrastructureRoot(cognitiveStatusResultOrganizer);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION: {
			FunctionalStatusResultObservation functionalStatusResultObservation = (FunctionalStatusResultObservation) theEObject;
			T result = caseFunctionalStatusResultObservation(functionalStatusResultObservation);
			if (result == null) {
				result = caseConsol_FunctionalStatusResultObservation(functionalStatusResultObservation);
			}
			if (result == null) {
				result = caseResultObservation(functionalStatusResultObservation);
			}
			if (result == null) {
				result = caseConsol_ResultObservation(functionalStatusResultObservation);
			}
			if (result == null) {
				result = caseObservation(functionalStatusResultObservation);
			}
			if (result == null) {
				result = caseClinicalStatement(functionalStatusResultObservation);
			}
			if (result == null) {
				result = caseAct(functionalStatusResultObservation);
			}
			if (result == null) {
				result = caseInfrastructureRoot(functionalStatusResultObservation);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case Mu2consolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER: {
			FunctionalStatusResultOrganizer functionalStatusResultOrganizer = (FunctionalStatusResultOrganizer) theEObject;
			T result = caseFunctionalStatusResultOrganizer(functionalStatusResultOrganizer);
			if (result == null) {
				result = caseConsol_FunctionalStatusResultOrganizer(functionalStatusResultOrganizer);
			}
			if (result == null) {
				result = caseResultOrganizer(functionalStatusResultOrganizer);
			}
			if (result == null) {
				result = caseConsol_ResultOrganizer(functionalStatusResultOrganizer);
			}
			if (result == null) {
				result = caseOrganizer(functionalStatusResultOrganizer);
			}
			if (result == null) {
				result = caseClinicalStatement(functionalStatusResultOrganizer);
			}
			if (result == null) {
				result = caseAct(functionalStatusResultOrganizer);
			}
			if (result == null) {
				result = caseInfrastructureRoot(functionalStatusResultOrganizer);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>General Header Constraints</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Summary Of Care Record</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Summary Of Care Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummaryOfCareRecord(SummaryOfCareRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Clinical Office Visit Summary</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Clinical Office Visit Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalOfficeVisitSummary(ClinicalOfficeVisitSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Medications Administered Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsAdministeredSection(
			MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Transition Of Care Ambulatory Summary</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Transition Of Care Ambulatory Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionOfCareAmbulatorySummary(
			TransitionOfCareAmbulatorySummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Transition Of Care Inpatient Summary</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Transition Of Care Inpatient Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionOfCareInpatientSummary(
			TransitionOfCareInpatientSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>View Download Transmit Summary</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>View Download Transmit Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewDownloadTransmitSummary(ViewDownloadTransmitSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>VDT Inpatient Summary</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>VDT Inpatient Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDTInpatientSummary(VDTInpatientSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>VDT Ambulatory Summary</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>VDT Ambulatory Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDTAmbulatorySummary(VDTAmbulatorySummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Functional Status Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Functional Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusSection(FunctionalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Cognitive Status Result Observation</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Cognitive Status Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitiveStatusResultObservation(
			CognitiveStatusResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Cognitive Status Result Organizer</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Cognitive Status Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitiveStatusResultOrganizer(
			CognitiveStatusResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Functional Status Result Observation</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Functional Status Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusResultObservation(
			FunctionalStatusResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Functional Status Result Organizer</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Functional Status Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusResultOrganizer(
			FunctionalStatusResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Infrastructure Root</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Act</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Clinical Document</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>General Header Constraints</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_GeneralHeaderConstraints(
			org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Section</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Social History Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_SocialHistorySection(
			org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Clinical Statement</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Observation</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Smoking Status Observation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Smoking Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_SmokingStatusObservation(
			org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Results Section Entries Optional</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Results Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSectionEntriesOptional(
			ResultsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Results Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_ResultsSection(
			org.openhealthtools.mdht.uml.cda.consol.ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Organizer</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Result Organizer</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_ResultOrganizer(
			org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Result Observation</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_ResultObservation(
			org.openhealthtools.mdht.uml.cda.consol.ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Procedures Section Entries Optional</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Procedures Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSectionEntriesOptional(
			ProceduresSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Procedures Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Procedures Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_ProceduresSection(
			org.openhealthtools.mdht.uml.cda.consol.ProceduresSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Procedure</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Procedure Activity Procedure</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_ProcedureActivityProcedure(
			org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Medications Administered Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_MedicationsAdministeredSection(
			org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Functional Status Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Functional Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_FunctionalStatusSection(
			org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Cognitive Status Result Observation</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Cognitive Status Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_CognitiveStatusResultObservation(
			org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Cognitive Status Result Organizer</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Cognitive Status Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_CognitiveStatusResultOrganizer(
			org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Functional Status Result Observation</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Functional Status Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_FunctionalStatusResultObservation(
			org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Functional Status Result Organizer</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Functional Status Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_FunctionalStatusResultOrganizer(
			org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Result Observation</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation(ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Procedures Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Procedures Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSection(ProceduresSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Procedure Activity Procedure</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Result Organizer</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOrganizer(ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Results Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection(ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Social History Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistorySection(SocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Smoking Status Observation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Smoking Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmokingStatusObservation(SmokingStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // Mu2consolSwitch
