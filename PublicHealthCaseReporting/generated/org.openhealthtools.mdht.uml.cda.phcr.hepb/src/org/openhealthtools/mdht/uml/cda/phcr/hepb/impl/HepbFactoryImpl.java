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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HepbFactoryImpl extends EFactoryImpl implements HepbFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static HepbFactory init() {
    try
    {
      HepbFactory theHepbFactory = (HepbFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/hepb"); 
      if (theHepbFactory != null)
      {
        return theHepbFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HepbFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HepbFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case HepbPackage.ACUTE_HEPATITIS_BCASE_REPORT: return createAcuteHepatitisBCaseReport();
      case HepbPackage.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION: return createAcuteHepatitisBSocialHistorySection();
      case HepbPackage.JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION: return createJobRelatedBodyFluidExposureRiskFrequencyObservation();
      case HepbPackage.ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT: return createAcuteHepatitisBPossibleExposureLocationAndTypeAct();
      case HepbPackage.ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION: return createAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation();
      case HepbPackage.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION: return createAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation();
      case HepbPackage.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION: return createAcuteHepatitisBPHCRClinicalInformationSection();
      case HepbPackage.ACUTE_HEPATITIS_BCASE_OBSERVATION: return createAcuteHepatitisBCaseObservation();
      case HepbPackage.ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION: return createAcuteHepatitisBSignsAndSymptomsObservation();
      case HepbPackage.ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE: return createAcuteHepatitisBRiskAssociatedProcedure();
      case HepbPackage.VIRAL_HEPATITIS_HISTORY_OBSERVATION: return createViralHepatitisHistoryObservation();
      case HepbPackage.STD_HISTORY_OBSERVATION: return createSTDHistoryObservation();
      case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION: return createAcuteHepatitisBImmunizationSection();
      case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY: return createAcuteHepatitisBImmunizationActivity();
      case HepbPackage.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION: return createAcuteHepatitisBPHCRTreatmentInformationSection();
      case HepbPackage.ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT: return createAcuteHepatitisBTherapeuticRegimenAct();
      case HepbPackage.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION: return createAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();
      case HepbPackage.ACUTE_HEPATITIS_BRESULT_OBSERVATION: return createAcuteHepatitisBResultObservation();
      case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT: return createAcuteHepatitisBImmunizationProduct();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBCaseReport createAcuteHepatitisBCaseReport() {
    AcuteHepatitisBCaseReportImpl acuteHepatitisBCaseReport = new AcuteHepatitisBCaseReportImpl();
    return acuteHepatitisBCaseReport;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBSocialHistorySection createAcuteHepatitisBSocialHistorySection() {
    AcuteHepatitisBSocialHistorySectionImpl acuteHepatitisBSocialHistorySection = new AcuteHepatitisBSocialHistorySectionImpl();
    return acuteHepatitisBSocialHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public JobRelatedBodyFluidExposureRiskFrequencyObservation createJobRelatedBodyFluidExposureRiskFrequencyObservation() {
    JobRelatedBodyFluidExposureRiskFrequencyObservationImpl jobRelatedBodyFluidExposureRiskFrequencyObservation = new JobRelatedBodyFluidExposureRiskFrequencyObservationImpl();
    return jobRelatedBodyFluidExposureRiskFrequencyObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation createAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation() {
    AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation = new AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl();
    return acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation createAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation() {
    AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation = new AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl();
    return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBPossibleExposureLocationAndTypeAct createAcuteHepatitisBPossibleExposureLocationAndTypeAct() {
    AcuteHepatitisBPossibleExposureLocationAndTypeActImpl acuteHepatitisBPossibleExposureLocationAndTypeAct = new AcuteHepatitisBPossibleExposureLocationAndTypeActImpl();
    return acuteHepatitisBPossibleExposureLocationAndTypeAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBImmunizationSection createAcuteHepatitisBImmunizationSection() {
    AcuteHepatitisBImmunizationSectionImpl acuteHepatitisBImmunizationSection = new AcuteHepatitisBImmunizationSectionImpl();
    return acuteHepatitisBImmunizationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBImmunizationActivity createAcuteHepatitisBImmunizationActivity() {
    AcuteHepatitisBImmunizationActivityImpl acuteHepatitisBImmunizationActivity = new AcuteHepatitisBImmunizationActivityImpl();
    return acuteHepatitisBImmunizationActivity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBPHCRClinicalInformationSection createAcuteHepatitisBPHCRClinicalInformationSection() {
    AcuteHepatitisBPHCRClinicalInformationSectionImpl acuteHepatitisBPHCRClinicalInformationSection = new AcuteHepatitisBPHCRClinicalInformationSectionImpl();
    return acuteHepatitisBPHCRClinicalInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBCaseObservation createAcuteHepatitisBCaseObservation() {
    AcuteHepatitisBCaseObservationImpl acuteHepatitisBCaseObservation = new AcuteHepatitisBCaseObservationImpl();
    return acuteHepatitisBCaseObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBSignsAndSymptomsObservation createAcuteHepatitisBSignsAndSymptomsObservation() {
    AcuteHepatitisBSignsAndSymptomsObservationImpl acuteHepatitisBSignsAndSymptomsObservation = new AcuteHepatitisBSignsAndSymptomsObservationImpl();
    return acuteHepatitisBSignsAndSymptomsObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBRiskAssociatedProcedure createAcuteHepatitisBRiskAssociatedProcedure() {
    AcuteHepatitisBRiskAssociatedProcedureImpl acuteHepatitisBRiskAssociatedProcedure = new AcuteHepatitisBRiskAssociatedProcedureImpl();
    return acuteHepatitisBRiskAssociatedProcedure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ViralHepatitisHistoryObservation createViralHepatitisHistoryObservation() {
    ViralHepatitisHistoryObservationImpl viralHepatitisHistoryObservation = new ViralHepatitisHistoryObservationImpl();
    return viralHepatitisHistoryObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public STDHistoryObservation createSTDHistoryObservation() {
    STDHistoryObservationImpl stdHistoryObservation = new STDHistoryObservationImpl();
    return stdHistoryObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBPHCRTreatmentInformationSection createAcuteHepatitisBPHCRTreatmentInformationSection() {
    AcuteHepatitisBPHCRTreatmentInformationSectionImpl acuteHepatitisBPHCRTreatmentInformationSection = new AcuteHepatitisBPHCRTreatmentInformationSectionImpl();
    return acuteHepatitisBPHCRTreatmentInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBTherapeuticRegimenAct createAcuteHepatitisBTherapeuticRegimenAct() {
    AcuteHepatitisBTherapeuticRegimenActImpl acuteHepatitisBTherapeuticRegimenAct = new AcuteHepatitisBTherapeuticRegimenActImpl();
    return acuteHepatitisBTherapeuticRegimenAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection createAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
    AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection = new AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl();
    return acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBResultObservation createAcuteHepatitisBResultObservation() {
    AcuteHepatitisBResultObservationImpl acuteHepatitisBResultObservation = new AcuteHepatitisBResultObservationImpl();
    return acuteHepatitisBResultObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBImmunizationProduct createAcuteHepatitisBImmunizationProduct() {
    AcuteHepatitisBImmunizationProductImpl acuteHepatitisBImmunizationProduct = new AcuteHepatitisBImmunizationProductImpl();
    return acuteHepatitisBImmunizationProduct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HepbPackage getHepbPackage() {
    return (HepbPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static HepbPackage getPackage() {
    return HepbPackage.eINSTANCE;
  }

} //HepbFactoryImpl
