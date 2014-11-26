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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.mu2consol.*;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public class Mu2consolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static Mu2consolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Mu2consolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Mu2consolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Mu2consolSwitch<Adapter> modelSwitch = new Mu2consolSwitch<Adapter>() {
		@Override
		public Adapter caseGeneralHeaderConstraints(
				GeneralHeaderConstraints object) {
			return createGeneralHeaderConstraintsAdapter();
		}

		@Override
		public Adapter caseSummaryOfCareRecord(SummaryOfCareRecord object) {
			return createSummaryOfCareRecordAdapter();
		}

		@Override
		public Adapter caseSocialHistorySection(SocialHistorySection object) {
			return createSocialHistorySectionAdapter();
		}

		@Override
		public Adapter caseSmokingStatusObservation(
				SmokingStatusObservation object) {
			return createSmokingStatusObservationAdapter();
		}

		@Override
		public Adapter caseResultsSection(ResultsSection object) {
			return createResultsSectionAdapter();
		}

		@Override
		public Adapter caseResultOrganizer(ResultOrganizer object) {
			return createResultOrganizerAdapter();
		}

		@Override
		public Adapter caseResultObservation(ResultObservation object) {
			return createResultObservationAdapter();
		}

		@Override
		public Adapter caseProceduresSection(ProceduresSection object) {
			return createProceduresSectionAdapter();
		}

		@Override
		public Adapter caseProcedureActivityProcedure(
				ProcedureActivityProcedure object) {
			return createProcedureActivityProcedureAdapter();
		}

		@Override
		public Adapter caseClinicalOfficeVisitSummary(
				ClinicalOfficeVisitSummary object) {
			return createClinicalOfficeVisitSummaryAdapter();
		}

		@Override
		public Adapter caseMedicationsAdministeredSection(
				MedicationsAdministeredSection object) {
			return createMedicationsAdministeredSectionAdapter();
		}

		@Override
		public Adapter caseTransitionOfCareAmbulatorySummary(
				TransitionOfCareAmbulatorySummary object) {
			return createTransitionOfCareAmbulatorySummaryAdapter();
		}

		@Override
		public Adapter caseTransitionOfCareInpatientSummary(
				TransitionOfCareInpatientSummary object) {
			return createTransitionOfCareInpatientSummaryAdapter();
		}

		@Override
		public Adapter caseViewDownloadTransmitSummary(
				ViewDownloadTransmitSummary object) {
			return createViewDownloadTransmitSummaryAdapter();
		}

		@Override
		public Adapter caseVDTInpatientSummary(VDTInpatientSummary object) {
			return createVDTInpatientSummaryAdapter();
		}

		@Override
		public Adapter caseVDTAmbulatorySummary(VDTAmbulatorySummary object) {
			return createVDTAmbulatorySummaryAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusSection(
				FunctionalStatusSection object) {
			return createFunctionalStatusSectionAdapter();
		}

		@Override
		public Adapter caseCognitiveStatusResultObservation(
				CognitiveStatusResultObservation object) {
			return createCognitiveStatusResultObservationAdapter();
		}

		@Override
		public Adapter caseCognitiveStatusResultOrganizer(
				CognitiveStatusResultOrganizer object) {
			return createCognitiveStatusResultOrganizerAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusResultObservation(
				FunctionalStatusResultObservation object) {
			return createFunctionalStatusResultObservationAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusResultOrganizer(
				FunctionalStatusResultOrganizer object) {
			return createFunctionalStatusResultOrganizerAdapter();
		}

		@Override
		public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
			return createInfrastructureRootAdapter();
		}

		@Override
		public Adapter caseAct(Act object) {
			return createActAdapter();
		}

		@Override
		public Adapter caseClinicalDocument(ClinicalDocument object) {
			return createClinicalDocumentAdapter();
		}

		@Override
		public Adapter caseConsol_GeneralHeaderConstraints(
				org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints object) {
			return createConsol_GeneralHeaderConstraintsAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseConsol_SocialHistorySection(
				org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection object) {
			return createConsol_SocialHistorySectionAdapter();
		}

		@Override
		public Adapter caseClinicalStatement(ClinicalStatement object) {
			return createClinicalStatementAdapter();
		}

		@Override
		public Adapter caseObservation(Observation object) {
			return createObservationAdapter();
		}

		@Override
		public Adapter caseTobaccoUse(TobaccoUse object) {
			return createTobaccoUseAdapter();
		}

		@Override
		public Adapter caseConsol_SmokingStatusObservation(
				org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation object) {
			return createConsol_SmokingStatusObservationAdapter();
		}

		@Override
		public Adapter caseResultsSectionEntriesOptional(
				ResultsSectionEntriesOptional object) {
			return createResultsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseConsol_ResultsSection(
				org.openhealthtools.mdht.uml.cda.consol.ResultsSection object) {
			return createConsol_ResultsSectionAdapter();
		}

		@Override
		public Adapter caseOrganizer(Organizer object) {
			return createOrganizerAdapter();
		}

		@Override
		public Adapter caseConsol_ResultOrganizer(
				org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer object) {
			return createConsol_ResultOrganizerAdapter();
		}

		@Override
		public Adapter caseConsol_ResultObservation(
				org.openhealthtools.mdht.uml.cda.consol.ResultObservation object) {
			return createConsol_ResultObservationAdapter();
		}

		@Override
		public Adapter caseProceduresSectionEntriesOptional(
				ProceduresSectionEntriesOptional object) {
			return createProceduresSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseConsol_ProceduresSection(
				org.openhealthtools.mdht.uml.cda.consol.ProceduresSection object) {
			return createConsol_ProceduresSectionAdapter();
		}

		@Override
		public Adapter caseProcedure(Procedure object) {
			return createProcedureAdapter();
		}

		@Override
		public Adapter caseConsol_ProcedureActivityProcedure(
				org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure object) {
			return createConsol_ProcedureActivityProcedureAdapter();
		}

		@Override
		public Adapter caseConsol_MedicationsAdministeredSection(
				org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection object) {
			return createConsol_MedicationsAdministeredSectionAdapter();
		}

		@Override
		public Adapter caseConsol_FunctionalStatusSection(
				org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection object) {
			return createConsol_FunctionalStatusSectionAdapter();
		}

		@Override
		public Adapter caseConsol_CognitiveStatusResultObservation(
				org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation object) {
			return createConsol_CognitiveStatusResultObservationAdapter();
		}

		@Override
		public Adapter caseConsol_CognitiveStatusResultOrganizer(
				org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer object) {
			return createConsol_CognitiveStatusResultOrganizerAdapter();
		}

		@Override
		public Adapter caseConsol_FunctionalStatusResultObservation(
				org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation object) {
			return createConsol_FunctionalStatusResultObservationAdapter();
		}

		@Override
		public Adapter caseConsol_FunctionalStatusResultOrganizer(
				org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer object) {
			return createConsol_FunctionalStatusResultOrganizerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints
	 * <em>General Header Constraints</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord
	 * <em>Summary Of Care Record</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord
	 * @generated
	 */
	public Adapter createSummaryOfCareRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary
	 * <em>Clinical Office Visit Summary</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary
	 * @generated
	 */
	public Adapter createClinicalOfficeVisitSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection
	 * <em>Medications Administered Section</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary
	 * <em>Transition Of Care Ambulatory Summary</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary
	 * @generated
	 */
	public Adapter createTransitionOfCareAmbulatorySummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary
	 * <em>Transition Of Care Inpatient Summary</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary
	 * @generated
	 */
	public Adapter createTransitionOfCareInpatientSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary
	 * <em>View Download Transmit Summary</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary
	 * @generated
	 */
	public Adapter createViewDownloadTransmitSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary
	 * <em>VDT Inpatient Summary</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary
	 * @generated
	 */
	public Adapter createVDTInpatientSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary
	 * <em>VDT Ambulatory Summary</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary
	 * @generated
	 */
	public Adapter createVDTAmbulatorySummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection
	 * <em>Functional Status Section</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation
	 * <em>Cognitive Status Result Observation</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation
	 * @generated
	 */
	public Adapter createCognitiveStatusResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer
	 * <em>Cognitive Status Result Organizer</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer
	 * @generated
	 */
	public Adapter createCognitiveStatusResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation
	 * <em>Functional Status Result Observation</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation
	 * @generated
	 */
	public Adapter createFunctionalStatusResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer
	 * <em>Functional Status Result Organizer</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer
	 * @generated
	 */
	public Adapter createFunctionalStatusResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation
	 * <em>Result Observation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation
	 * @generated
	 */
	public Adapter createResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection
	 * <em>Procedures Section</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection
	 * @generated
	 */
	public Adapter createProceduresSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure
	 * <em>Procedure Activity Procedure</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure
	 * @generated
	 */
	public Adapter createProcedureActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer
	 * <em>Result Organizer</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer
	 * @generated
	 */
	public Adapter createResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection
	 * <em>Results Section</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection
	 * @generated
	 */
	public Adapter createResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection
	 * <em>Social History Section</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation
	 * <em>Smoking Status Observation</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation
	 * @generated
	 */
	public Adapter createSmokingStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * <em>Infrastructure Root</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * <em>Clinical Document</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * <em>General Header Constraints</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createConsol_GeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection
	 * <em>Medications Administered Section</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createConsol_MedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection
	 * <em>Functional Status Section</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection
	 * @generated
	 */
	public Adapter createConsol_FunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation
	 * <em>Cognitive Status Result Observation</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation
	 * @generated
	 */
	public Adapter createConsol_CognitiveStatusResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer
	 * <em>Cognitive Status Result Organizer</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer
	 * @generated
	 */
	public Adapter createConsol_CognitiveStatusResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation
	 * <em>Functional Status Result Observation</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation
	 * @generated
	 */
	public Adapter createConsol_FunctionalStatusResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer
	 * <em>Functional Status Result Organizer</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer
	 * @generated
	 */
	public Adapter createConsol_FunctionalStatusResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation
	 * <em>Result Observation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultObservation
	 * @generated
	 */
	public Adapter createConsol_ResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional
	 * <em>Procedures Section Entries Optional</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional
	 * @generated
	 */
	public Adapter createProceduresSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection
	 * <em>Procedures Section</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSection
	 * @generated
	 */
	public Adapter createConsol_ProceduresSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure
	 * <em>Procedure Activity Procedure</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure
	 * @generated
	 */
	public Adapter createConsol_ProcedureActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer
	 * <em>Result Organizer</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer
	 * @generated
	 */
	public Adapter createConsol_ResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional
	 * <em>Results Section Entries Optional</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createResultsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection
	 * <em>Results Section</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSection
	 * @generated
	 */
	public Adapter createConsol_ResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection
	 * <em>Social History Section</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection
	 * @generated
	 */
	public Adapter createConsol_SocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * <em>Clinical Statement</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse
	 * <em>Tobacco Use</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.TobaccoUse
	 * @generated
	 */
	public Adapter createTobaccoUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation
	 * <em>Smoking Status Observation</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation
	 * @generated
	 */
	public Adapter createConsol_SmokingStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // Mu2consolAdapterFactory
