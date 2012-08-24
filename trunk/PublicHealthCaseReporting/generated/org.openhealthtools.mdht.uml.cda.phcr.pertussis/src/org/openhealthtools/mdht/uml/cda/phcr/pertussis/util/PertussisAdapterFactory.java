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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.*;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage
 * @generated
 */
public class PertussisAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PertussisPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PertussisAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PertussisPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
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
  protected PertussisSwitch<Adapter> modelSwitch =
    new PertussisSwitch<Adapter>()
    {
      @Override
      public Adapter casePertussisCaseReport(PertussisCaseReport object)
      {
        return createPertussisCaseReportAdapter();
      }
      @Override
      public Adapter casePertussisSocialHistorySection(PertussisSocialHistorySection object)
      {
        return createPertussisSocialHistorySectionAdapter();
      }
      @Override
      public Adapter casePertussisPossibleExposureLocationAct(PertussisPossibleExposureLocationAct object)
      {
        return createPertussisPossibleExposureLocationActAdapter();
      }
      @Override
      public Adapter casePertussisPossibleCaseContactLocationAct(PertussisPossibleCaseContactLocationAct object)
      {
        return createPertussisPossibleCaseContactLocationActAdapter();
      }
      @Override
      public Adapter casePertussisClinicalInformationSection(PertussisClinicalInformationSection object)
      {
        return createPertussisClinicalInformationSectionAdapter();
      }
      @Override
      public Adapter casePertussisCaseObservation(PertussisCaseObservation object)
      {
        return createPertussisCaseObservationAdapter();
      }
      @Override
      public Adapter casePertussisSignsAndSymptomsObservation(PertussisSignsAndSymptomsObservation object)
      {
        return createPertussisSignsAndSymptomsObservationAdapter();
      }
      @Override
      public Adapter casePertussisTreatmentInformationSection(PertussisTreatmentInformationSection object)
      {
        return createPertussisTreatmentInformationSectionAdapter();
      }
      @Override
      public Adapter casePertussisTherapeuticRegimenAct(PertussisTherapeuticRegimenAct object)
      {
        return createPertussisTherapeuticRegimenActAdapter();
      }
      @Override
      public Adapter casePertussisTreatmentGivenSubstanceAdministration(PertussisTreatmentGivenSubstanceAdministration object)
      {
        return createPertussisTreatmentGivenSubstanceAdministrationAdapter();
      }
      @Override
      public Adapter casePertussisTreatmentNotGivenSubstanceAdministration(PertussisTreatmentNotGivenSubstanceAdministration object)
      {
        return createPertussisTreatmentNotGivenSubstanceAdministrationAdapter();
      }
      @Override
      public Adapter casePertussisRelevantDxTestsSection(PertussisRelevantDxTestsSection object)
      {
        return createPertussisRelevantDxTestsSectionAdapter();
      }
      @Override
      public Adapter casePertussisResultObservation(PertussisResultObservation object)
      {
        return createPertussisResultObservationAdapter();
      }
      @Override
      public Adapter casePertussisResultOrganizer(PertussisResultOrganizer object)
      {
        return createPertussisResultOrganizerAdapter();
      }
      @Override
      public Adapter casePertussisImmunizationsSection(PertussisImmunizationsSection object)
      {
        return createPertussisImmunizationsSectionAdapter();
      }
      @Override
      public Adapter casePertussisImmunizationActivity(PertussisImmunizationActivity object)
      {
        return createPertussisImmunizationActivityAdapter();
      }
      @Override
      public Adapter casePertussisImmunizationProduct(PertussisImmunizationProduct object)
      {
        return createPertussisImmunizationProductAdapter();
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
      public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object)
      {
        return createCDA_ActAdapter();
      }
      @Override
      public Adapter casePhcrClinicalInformationSection(PhcrClinicalInformationSection object)
      {
        return createPhcrClinicalInformationSectionAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
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
      public Adapter caseSubstanceAdministration(SubstanceAdministration object)
      {
        return createSubstanceAdministrationAdapter();
      }
      @Override
      public Adapter caseTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration object)
      {
        return createTreatmentGivenSubstanceAdministrationAdapter();
      }
      @Override
      public Adapter caseTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration object)
      {
        return createTreatmentNotGivenSubstanceAdministrationAdapter();
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
      public Adapter caseOrganizer(Organizer object)
      {
        return createOrganizerAdapter();
      }
      @Override
      public Adapter caseResultOrganizer(ResultOrganizer object)
      {
        return createResultOrganizerAdapter();
      }
      @Override
      public Adapter casePhcr_ResultOrganizer(org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer object)
      {
        return createPhcr_ResultOrganizerAdapter();
      }
      @Override
      public Adapter caseImmunizationsSection(ImmunizationsSection object)
      {
        return createImmunizationsSectionAdapter();
      }
      @Override
      public Adapter caseMedicationActivity(MedicationActivity object)
      {
        return createMedicationActivityAdapter();
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport <em>Case Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport
   * @generated
   */
  public Adapter createPertussisCaseReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection <em>Social History Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection
   * @generated
   */
  public Adapter createPertussisSocialHistorySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct <em>Possible Exposure Location Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct
   * @generated
   */
	public Adapter createPertussisPossibleExposureLocationActAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct <em>Possible Case Contact Location Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct
   * @generated
   */
	public Adapter createPertussisPossibleCaseContactLocationActAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection <em>Clinical Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection
   * @generated
   */
	public Adapter createPertussisClinicalInformationSectionAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection <em>Treatment Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection
   * @generated
   */
	public Adapter createPertussisTreatmentInformationSectionAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct
   * @generated
   */
	public Adapter createPertussisTherapeuticRegimenActAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration
   * @generated
   */
	public Adapter createPertussisTreatmentGivenSubstanceAdministrationAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentNotGivenSubstanceAdministration
   * @generated
   */
	public Adapter createPertussisTreatmentNotGivenSubstanceAdministrationAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection <em>Immunizations Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection
   * @generated
   */
	public Adapter createPertussisImmunizationsSectionAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity <em>Immunization Activity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity
   * @generated
   */
	public Adapter createPertussisImmunizationActivityAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation <em>Case Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation
   * @generated
   */
	public Adapter createPertussisCaseObservationAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation
   * @generated
   */
	public Adapter createPertussisSignsAndSymptomsObservationAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation <em>Result Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation
   * @generated
   */
	public Adapter createPertussisResultObservationAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection <em>Relevant Dx Tests Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection
   * @generated
   */
	public Adapter createPertussisRelevantDxTestsSectionAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer <em>Result Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer
   * @generated
   */
	public Adapter createPertussisResultOrganizerAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct <em>Immunization Product</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct
   * @generated
   */
	public Adapter createPertussisImmunizationProductAdapter() {
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
  public Adapter createInfrastructureRootAdapter()
  {
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
  public Adapter createActAdapter()
  {
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
  public Adapter createClinicalDocumentAdapter()
  {
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
  public Adapter createPublicHealthCaseReportAdapter()
  {
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
  public Adapter createSectionAdapter()
  {
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
  public Adapter createSocialHistorySectionAdapter()
  {
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
  public Adapter createPhcrSocialHistorySectionAdapter()
  {
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
  public Adapter createClinicalStatementAdapter()
  {
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
  public Adapter createCDA_ActAdapter()
  {
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Organizer
   * @generated
   */
	public Adapter createOrganizerAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer <em>Result Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer
   * @generated
   */
	public Adapter createResultOrganizerAdapter() {
    return null;
  }

		/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer <em>Result Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer
   * @generated
   */
	public Adapter createPhcr_ResultOrganizerAdapter() {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PertussisAdapterFactory
