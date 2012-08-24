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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage
 * @generated
 */
public class HepbAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static HepbPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HepbAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = HepbPackage.eINSTANCE;
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
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
	protected HepbSwitch<Adapter> modelSwitch =
		new HepbSwitch<Adapter>()
    {
      @Override
      public Adapter caseAcuteHepatitisBCaseReport(AcuteHepatitisBCaseReport object)
      {
        return createAcuteHepatitisBCaseReportAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBSocialHistorySection(AcuteHepatitisBSocialHistorySection object)
      {
        return createAcuteHepatitisBSocialHistorySectionAdapter();
      }
      @Override
      public Adapter caseJobRelatedBodyFluidExposureRiskFrequencyObservation(JobRelatedBodyFluidExposureRiskFrequencyObservation object)
      {
        return createJobRelatedBodyFluidExposureRiskFrequencyObservationAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBPossibleExposureLocationAndTypeAct object)
      {
        return createAcuteHepatitisBPossibleExposureLocationAndTypeActAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation object)
      {
        return createAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation object)
      {
        return createAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBPHCRClinicalInformationSection object)
      {
        return createAcuteHepatitisBPHCRClinicalInformationSectionAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBCaseObservation(AcuteHepatitisBCaseObservation object)
      {
        return createAcuteHepatitisBCaseObservationAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBSignsAndSymptomsObservation object)
      {
        return createAcuteHepatitisBSignsAndSymptomsObservationAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBRiskAssociatedProcedure object)
      {
        return createAcuteHepatitisBRiskAssociatedProcedureAdapter();
      }
      @Override
      public Adapter caseViralHepatitisHistoryObservation(ViralHepatitisHistoryObservation object)
      {
        return createViralHepatitisHistoryObservationAdapter();
      }
      @Override
      public Adapter caseSTDHistoryObservation(STDHistoryObservation object)
      {
        return createSTDHistoryObservationAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBImmunizationSection(AcuteHepatitisBImmunizationSection object)
      {
        return createAcuteHepatitisBImmunizationSectionAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationActivity object)
      {
        return createAcuteHepatitisBImmunizationActivityAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBPHCRTreatmentInformationSection object)
      {
        return createAcuteHepatitisBPHCRTreatmentInformationSectionAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBTherapeuticRegimenAct object)
      {
        return createAcuteHepatitisBTherapeuticRegimenActAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection object)
      {
        return createAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBResultObservation(AcuteHepatitisBResultObservation object)
      {
        return createAcuteHepatitisBResultObservationAdapter();
      }
      @Override
      public Adapter caseAcuteHepatitisBImmunizationProduct(AcuteHepatitisBImmunizationProduct object)
      {
        return createAcuteHepatitisBImmunizationProductAdapter();
      }
      @Override
      public Adapter caseInfrastructureRoot(InfrastructureRoot object)
      {
        return createInfrastructureRootAdapter();
      }
      @Override
      public Adapter caseAct(Act object)
      {
        return createActAdapter();
      }
      @Override
      public Adapter caseClinicalDocument(ClinicalDocument object)
      {
        return createClinicalDocumentAdapter();
      }
      @Override
      public Adapter casePublicHealthCaseReport(PublicHealthCaseReport object)
      {
        return createPublicHealthCaseReportAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseSocialHistorySection(SocialHistorySection object)
      {
        return createSocialHistorySectionAdapter();
      }
      @Override
      public Adapter casePhcrSocialHistorySection(PhcrSocialHistorySection object)
      {
        return createPhcrSocialHistorySectionAdapter();
      }
      @Override
      public Adapter caseClinicalStatement(ClinicalStatement object)
      {
        return createClinicalStatementAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
      }
      @Override
      public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object)
      {
        return createCDA_ActAdapter();
      }
      @Override
      public Adapter caseSocialHistoryObservation(SocialHistoryObservation object)
      {
        return createSocialHistoryObservationAdapter();
      }
      @Override
      public Adapter casePhcrClinicalInformationSection(PhcrClinicalInformationSection object)
      {
        return createPhcrClinicalInformationSectionAdapter();
      }
      @Override
      public Adapter caseProblemObservation(ProblemObservation object)
      {
        return createProblemObservationAdapter();
      }
      @Override
      public Adapter caseCaseObservation(CaseObservation object)
      {
        return createCaseObservationAdapter();
      }
      @Override
      public Adapter caseSignsAndSymptomsObservation(SignsAndSymptomsObservation object)
      {
        return createSignsAndSymptomsObservationAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseImmunizationsSection(ImmunizationsSection object)
      {
        return createImmunizationsSectionAdapter();
      }
      @Override
      public Adapter caseSubstanceAdministration(SubstanceAdministration object)
      {
        return createSubstanceAdministrationAdapter();
      }
      @Override
      public Adapter caseMedicationActivity(MedicationActivity object)
      {
        return createMedicationActivityAdapter();
      }
      @Override
      public Adapter casePhcrTreatmentInformationSection(PhcrTreatmentInformationSection object)
      {
        return createPhcrTreatmentInformationSectionAdapter();
      }
      @Override
      public Adapter caseTherapeuticRegimenAct(TherapeuticRegimenAct object)
      {
        return createTherapeuticRegimenActAdapter();
      }
      @Override
      public Adapter caseResultsSection(ResultsSection object)
      {
        return createResultsSectionAdapter();
      }
      @Override
      public Adapter casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object)
      {
        return createPhcrRelevantDxTestsSectionAdapter();
      }
      @Override
      public Adapter caseResultObservation(ResultObservation object)
      {
        return createResultObservationAdapter();
      }
      @Override
      public Adapter casePhcr_ResultObservation(org.openhealthtools.mdht.uml.cda.phcr.ResultObservation object)
      {
        return createPhcr_ResultObservationAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseManufacturedProduct(ManufacturedProduct object)
      {
        return createManufacturedProductAdapter();
      }
      @Override
      public Adapter caseProduct(Product object)
      {
        return createProductAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport <em>Acute Hepatitis BCase Report</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport
   * @generated
   */
	public Adapter createAcuteHepatitisBCaseReportAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection <em>Acute Hepatitis BSocial History Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection
   * @generated
   */
	public Adapter createAcuteHepatitisBSocialHistorySectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation <em>Job Related Body Fluid Exposure Risk Frequency Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation
   * @generated
   */
	public Adapter createJobRelatedBodyFluidExposureRiskFrequencyObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation <em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation
   * @generated
   */
	public Adapter createAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation <em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation
   * @generated
   */
	public Adapter createAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct <em>Acute Hepatitis BPossible Exposure Location And Type Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct
   * @generated
   */
	public Adapter createAcuteHepatitisBPossibleExposureLocationAndTypeActAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection <em>Acute Hepatitis BImmunization Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection
   * @generated
   */
	public Adapter createAcuteHepatitisBImmunizationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity <em>Acute Hepatitis BImmunization Activity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity
   * @generated
   */
	public Adapter createAcuteHepatitisBImmunizationActivityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection <em>Acute Hepatitis BPHCR Clinical Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection
   * @generated
   */
	public Adapter createAcuteHepatitisBPHCRClinicalInformationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation <em>Acute Hepatitis BCase Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation
   * @generated
   */
	public Adapter createAcuteHepatitisBCaseObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation <em>Acute Hepatitis BSigns And Symptoms Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation
   * @generated
   */
	public Adapter createAcuteHepatitisBSignsAndSymptomsObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure <em>Acute Hepatitis BRisk Associated Procedure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure
   * @generated
   */
	public Adapter createAcuteHepatitisBRiskAssociatedProcedureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation <em>Viral Hepatitis History Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation
   * @generated
   */
	public Adapter createViralHepatitisHistoryObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation <em>STD History Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation
   * @generated
   */
	public Adapter createSTDHistoryObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection <em>Acute Hepatitis BPHCR Treatment Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection
   * @generated
   */
	public Adapter createAcuteHepatitisBPHCRTreatmentInformationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct <em>Acute Hepatitis BTherapeutic Regimen Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct
   * @generated
   */
	public Adapter createAcuteHepatitisBTherapeuticRegimenActAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection <em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection
   * @generated
   */
	public Adapter createAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation <em>Acute Hepatitis BResult Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation
   * @generated
   */
	public Adapter createAcuteHepatitisBResultObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationProduct <em>Acute Hepatitis BImmunization Product</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationProduct
   * @generated
   */
	public Adapter createAcuteHepatitisBImmunizationProductAdapter() {
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation <em>Social History Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation
   * @generated
   */
	public Adapter createSocialHistoryObservationAdapter() {
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Procedure
   * @generated
   */
	public Adapter createProcedureAdapter() {
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

} //HepbAdapterFactory
