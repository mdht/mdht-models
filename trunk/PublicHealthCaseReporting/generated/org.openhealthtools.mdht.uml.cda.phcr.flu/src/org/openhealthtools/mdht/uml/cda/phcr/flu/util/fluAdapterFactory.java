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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage
 * @generated
 */
public class fluAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static fluPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fluAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = fluPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected fluSwitch<Adapter> modelSwitch =
		new fluSwitch<Adapter>() {
			@Override
			public Adapter caseInfluenzaCaseReport(InfluenzaCaseReport object) {
				return createInfluenzaCaseReportAdapter();
			}
			@Override
			public Adapter caseInfluenzaImmunizationSection(InfluenzaImmunizationSection object) {
				return createInfluenzaImmunizationSectionAdapter();
			}
			@Override
			public Adapter caseInfluenzaImmunizationActivity(InfluenzaImmunizationActivity object) {
				return createInfluenzaImmunizationActivityAdapter();
			}
			@Override
			public Adapter caseInfluenzaPHCRClinicalInformationSection(InfluenzaPHCRClinicalInformationSection object) {
				return createInfluenzaPHCRClinicalInformationSectionAdapter();
			}
			@Override
			public Adapter caseInfluenzaCaseObservation(InfluenzaCaseObservation object) {
				return createInfluenzaCaseObservationAdapter();
			}
			@Override
			public Adapter caseInfluenzaSignsAndSymptomsObservation(InfluenzaSignsAndSymptomsObservation object) {
				return createInfluenzaSignsAndSymptomsObservationAdapter();
			}
			@Override
			public Adapter caseInfluenzaPHCRTreatmentInformationSection(InfluenzaPHCRTreatmentInformationSection object) {
				return createInfluenzaPHCRTreatmentInformationSectionAdapter();
			}
			@Override
			public Adapter caseInfluenzaTherapeuticRegimenAct(InfluenzaTherapeuticRegimenAct object) {
				return createInfluenzaTherapeuticRegimenActAdapter();
			}
			@Override
			public Adapter caseInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTreatmentGivenSubstanceAdministration object) {
				return createInfluenzaTreatmentGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTreatmentNotGivenSubstanceAdministration object) {
				return createInfluenzaTreatmentNotGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection object) {
				return createInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAdapter();
			}
			@Override
			public Adapter caseInfluenzaResultObservation(InfluenzaResultObservation object) {
				return createInfluenzaResultObservationAdapter();
			}
			@Override
			public Adapter caseInfluenzaImagingObservation(InfluenzaImagingObservation object) {
				return createInfluenzaImagingObservationAdapter();
			}
			@Override
			public Adapter caseInfluenzaPHCRSocialHistorySection(InfluenzaPHCRSocialHistorySection object) {
				return createInfluenzaPHCRSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseInfluenzaEmploymentStatusObservation(InfluenzaEmploymentStatusObservation object) {
				return createInfluenzaEmploymentStatusObservationAdapter();
			}
			@Override
			public Adapter caseInfluenzaPossibleExposureLocationAct(InfluenzaPossibleExposureLocationAct object) {
				return createInfluenzaPossibleExposureLocationActAdapter();
			}
			@Override
			public Adapter caseInfluenzaImmunizationProduct(InfluenzaImmunizationProduct object) {
				return createInfluenzaImmunizationProductAdapter();
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
			public Adapter casePublicHealthCaseReport(PublicHealthCaseReport object) {
				return createPublicHealthCaseReportAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseImmunizationsSection(ImmunizationsSection object) {
				return createImmunizationsSectionAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseMedicationActivity(MedicationActivity object) {
				return createMedicationActivityAdapter();
			}
			@Override
			public Adapter casePhcrClinicalInformationSection(PhcrClinicalInformationSection object) {
				return createPhcrClinicalInformationSectionAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseProblemObservation(ProblemObservation object) {
				return createProblemObservationAdapter();
			}
			@Override
			public Adapter caseCaseObservation(CaseObservation object) {
				return createCaseObservationAdapter();
			}
			@Override
			public Adapter caseSignsAndSymptomsObservation(SignsAndSymptomsObservation object) {
				return createSignsAndSymptomsObservationAdapter();
			}
			@Override
			public Adapter casePhcrTreatmentInformationSection(PhcrTreatmentInformationSection object) {
				return createPhcrTreatmentInformationSectionAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter caseTherapeuticRegimenAct(TherapeuticRegimenAct object) {
				return createTherapeuticRegimenActAdapter();
			}
			@Override
			public Adapter caseTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration object) {
				return createTreatmentGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration object) {
				return createTreatmentNotGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseResultsSection(ResultsSection object) {
				return createResultsSectionAdapter();
			}
			@Override
			public Adapter casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object) {
				return createPhcrRelevantDxTestsSectionAdapter();
			}
			@Override
			public Adapter caseResultObservation(ResultObservation object) {
				return createResultObservationAdapter();
			}
			@Override
			public Adapter casePhcr_ResultObservation(org.openhealthtools.mdht.uml.cda.phcr.ResultObservation object) {
				return createPhcr_ResultObservationAdapter();
			}
			@Override
			public Adapter caseImagingObservation(ImagingObservation object) {
				return createImagingObservationAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection(SocialHistorySection object) {
				return createSocialHistorySectionAdapter();
			}
			@Override
			public Adapter casePhcrSocialHistorySection(PhcrSocialHistorySection object) {
				return createPhcrSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseManufacturedProduct(ManufacturedProduct object) {
				return createManufacturedProductAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport <em>Influenza Case Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport
	 * @generated
	 */
	public Adapter createInfluenzaCaseReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection <em>Influenza Immunization Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection
	 * @generated
	 */
	public Adapter createInfluenzaImmunizationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationActivity <em>Influenza Immunization Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationActivity
	 * @generated
	 */
	public Adapter createInfluenzaImmunizationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection <em>Influenza PHCR Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection
	 * @generated
	 */
	public Adapter createInfluenzaPHCRClinicalInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation <em>Influenza Case Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation
	 * @generated
	 */
	public Adapter createInfluenzaCaseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation <em>Influenza Signs And Symptoms Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation
	 * @generated
	 */
	public Adapter createInfluenzaSignsAndSymptomsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection <em>Influenza PHCR Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection
	 * @generated
	 */
	public Adapter createInfluenzaPHCRTreatmentInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct <em>Influenza Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct
	 * @generated
	 */
	public Adapter createInfluenzaTherapeuticRegimenActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration <em>Influenza Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createInfluenzaTreatmentGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration <em>Influenza Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createInfluenzaTreatmentNotGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection <em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection
	 * @generated
	 */
	public Adapter createInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation <em>Influenza Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation
	 * @generated
	 */
	public Adapter createInfluenzaResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation <em>Influenza Imaging Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation
	 * @generated
	 */
	public Adapter createInfluenzaImagingObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection <em>Influenza PHCR Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection
	 * @generated
	 */
	public Adapter createInfluenzaPHCRSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation <em>Influenza Employment Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation
	 * @generated
	 */
	public Adapter createInfluenzaEmploymentStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct <em>Influenza Possible Exposure Location Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct
	 * @generated
	 */
	public Adapter createInfluenzaPossibleExposureLocationActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationProduct <em>Influenza Immunization Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationProduct
	 * @generated
	 */
	public Adapter createInfluenzaImmunizationProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport <em>Public Health Case Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport
	 * @generated
	 */
	public Adapter createPublicHealthCaseReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity
	 * @generated
	 */
	public Adapter createMedicationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection <em>Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection
	 * @generated
	 */
	public Adapter createPhcrClinicalInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation
	 * @generated
	 */
	public Adapter createProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation <em>Case Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.CaseObservation
	 * @generated
	 */
	public Adapter createCaseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation
	 * @generated
	 */
	public Adapter createSignsAndSymptomsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection <em>Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection
	 * @generated
	 */
	public Adapter createPhcrTreatmentInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct
	 * @generated
	 */
	public Adapter createTherapeuticRegimenActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createTreatmentGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createTreatmentNotGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultsSection
	 * @generated
	 */
	public Adapter createResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection <em>Relevant Dx Tests Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection
	 * @generated
	 */
	public Adapter createPhcrRelevantDxTestsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultObservation
	 * @generated
	 */
	public Adapter createResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.ResultObservation
	 * @generated
	 */
	public Adapter createPhcr_ResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation <em>Imaging Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation
	 * @generated
	 */
	public Adapter createImagingObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection
	 * @generated
	 */
	public Adapter createPhcrSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct <em>Manufactured Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct
	 * @generated
	 */
	public Adapter createManufacturedProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //fluAdapterFactory
