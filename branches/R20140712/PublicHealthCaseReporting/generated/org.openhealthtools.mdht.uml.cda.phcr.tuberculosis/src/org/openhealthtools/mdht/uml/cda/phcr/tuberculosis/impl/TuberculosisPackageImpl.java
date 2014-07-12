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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TuberculosisPackageImpl extends EPackageImpl implements TuberculosisPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisCaseReportEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisPHCRSocialHistorySectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisPossibleExposureLocationActEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass smokingStatusObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hivStatusObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisPHCRClinicalInformationSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisCaseObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisSignsAndSymptomsObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass tuberculosisRelevantMedicalConditionHistoryObservationEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass tuberculosisRelevantMedicalConditionProblemObservationEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisPHCRRelevantDxTestsSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisResultOrganizerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisResultObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisPHCRTreatmentInformationSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisTherapeuticRegimenActEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisTreatmentGivenSubstanceAdministrationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisTreatmentNotGivenSubstanceAdministrationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tuberculosisPHCRImmunizationSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass tuberculosisImmunizationActivitySubstanceAdministrationEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass tuberculosisImmunizationManufacturedProductEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass tuberculosisSiteOfTBDiseaseObservationEClass = null;

  /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private TuberculosisPackageImpl() {
        super(eNS_URI, TuberculosisFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TuberculosisPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static TuberculosisPackage init() {
        if (isInited) return (TuberculosisPackage)EPackage.Registry.INSTANCE.getEPackage(TuberculosisPackage.eNS_URI);

        // Obtain or create and register package
        TuberculosisPackageImpl theTuberculosisPackage = (TuberculosisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TuberculosisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TuberculosisPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PhcrPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theTuberculosisPackage.createPackageContents();

        // Initialize created meta-data
        theTuberculosisPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theTuberculosisPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return TuberculosisValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theTuberculosisPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.phcr.tuberculosis", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theTuberculosisPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TuberculosisPackage.eNS_URI, theTuberculosisPackage);
        return theTuberculosisPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisCaseReport() {
        return tuberculosisCaseReportEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisPHCRSocialHistorySection() {
        return tuberculosisPHCRSocialHistorySectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisPossibleExposureLocationAct() {
        return tuberculosisPossibleExposureLocationActEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisSocioBehavioralBooleanRiskFactorObservation() {
        return tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSmokingStatusObservation() {
        return smokingStatusObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHIVStatusObservation() {
        return hivStatusObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisPHCRClinicalInformationSection() {
        return tuberculosisPHCRClinicalInformationSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisCaseObservation() {
        return tuberculosisCaseObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisSignsAndSymptomsObservation() {
        return tuberculosisSignsAndSymptomsObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getTuberculosisRelevantMedicalConditionHistoryObservation()
  {
        return tuberculosisRelevantMedicalConditionHistoryObservationEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getTuberculosisRelevantMedicalConditionProblemObservation()
  {
        return tuberculosisRelevantMedicalConditionProblemObservationEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisPHCRRelevantDxTestsSection() {
        return tuberculosisPHCRRelevantDxTestsSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisResultOrganizer() {
        return tuberculosisResultOrganizerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisResultObservation() {
        return tuberculosisResultObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisPHCRTreatmentInformationSection() {
        return tuberculosisPHCRTreatmentInformationSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisTherapeuticRegimenAct() {
        return tuberculosisTherapeuticRegimenActEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisTreatmentGivenSubstanceAdministration() {
        return tuberculosisTreatmentGivenSubstanceAdministrationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisTreatmentNotGivenSubstanceAdministration() {
        return tuberculosisTreatmentNotGivenSubstanceAdministrationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTuberculosisPHCRImmunizationSection() {
        return tuberculosisPHCRImmunizationSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getTuberculosisImmunizationActivitySubstanceAdministration()
  {
        return tuberculosisImmunizationActivitySubstanceAdministrationEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getTuberculosisImmunizationManufacturedProduct()
  {
        return tuberculosisImmunizationManufacturedProductEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getTuberculosisSiteOfTBDiseaseObservation()
  {
        return tuberculosisSiteOfTBDiseaseObservationEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TuberculosisFactory getTuberculosisFactory() {
        return (TuberculosisFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        tuberculosisCaseReportEClass = createEClass(TUBERCULOSIS_CASE_REPORT);

        tuberculosisPHCRSocialHistorySectionEClass = createEClass(TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION);

        tuberculosisPossibleExposureLocationActEClass = createEClass(TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);

        tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass = createEClass(TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);

        smokingStatusObservationEClass = createEClass(SMOKING_STATUS_OBSERVATION);

        hivStatusObservationEClass = createEClass(HIV_STATUS_OBSERVATION);

        tuberculosisPHCRClinicalInformationSectionEClass = createEClass(TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION);

        tuberculosisCaseObservationEClass = createEClass(TUBERCULOSIS_CASE_OBSERVATION);

        tuberculosisSignsAndSymptomsObservationEClass = createEClass(TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);

        tuberculosisSiteOfTBDiseaseObservationEClass = createEClass(TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION);

        tuberculosisRelevantMedicalConditionHistoryObservationEClass = createEClass(TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION);

        tuberculosisRelevantMedicalConditionProblemObservationEClass = createEClass(TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION);

        tuberculosisPHCRRelevantDxTestsSectionEClass = createEClass(TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);

        tuberculosisResultOrganizerEClass = createEClass(TUBERCULOSIS_RESULT_ORGANIZER);

        tuberculosisResultObservationEClass = createEClass(TUBERCULOSIS_RESULT_OBSERVATION);

        tuberculosisPHCRTreatmentInformationSectionEClass = createEClass(TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION);

        tuberculosisTherapeuticRegimenActEClass = createEClass(TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT);

        tuberculosisTreatmentGivenSubstanceAdministrationEClass = createEClass(TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

        tuberculosisTreatmentNotGivenSubstanceAdministrationEClass = createEClass(TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);

        tuberculosisPHCRImmunizationSectionEClass = createEClass(TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION);

        tuberculosisImmunizationActivitySubstanceAdministrationEClass = createEClass(TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION);

        tuberculosisImmunizationManufacturedProductEClass = createEClass(TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        PhcrPackage thePhcrPackage = (PhcrPackage)EPackage.Registry.INSTANCE.getEPackage(PhcrPackage.eNS_URI);
        CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
        CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        tuberculosisCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
        tuberculosisPHCRSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
        tuberculosisPossibleExposureLocationActEClass.getESuperTypes().add(theCDAPackage.getAct());
        tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass.getESuperTypes().add(theCCDPackage.getSocialHistoryObservation());
        smokingStatusObservationEClass.getESuperTypes().add(theCCDPackage.getSocialHistoryObservation());
        hivStatusObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        tuberculosisPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
        tuberculosisCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
        tuberculosisSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
        tuberculosisSiteOfTBDiseaseObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        tuberculosisRelevantMedicalConditionHistoryObservationEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantMedicalConditionHistoryObservation());
        tuberculosisRelevantMedicalConditionProblemObservationEClass.getESuperTypes().add(theCCDPackage.getProblemObservation());
        tuberculosisPHCRRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
        tuberculosisResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
        tuberculosisResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
        tuberculosisPHCRTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
        tuberculosisTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
        tuberculosisTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
        tuberculosisTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());
        tuberculosisPHCRImmunizationSectionEClass.getESuperTypes().add(theCCDPackage.getImmunizationsSection());
        tuberculosisImmunizationActivitySubstanceAdministrationEClass.getESuperTypes().add(theCCDPackage.getMedicationActivity());
        tuberculosisImmunizationManufacturedProductEClass.getESuperTypes().add(theCCDPackage.getProduct());

        // Initialize classes and features; add operations and parameters
        initEClass(tuberculosisCaseReportEClass, TuberculosisCaseReport.class, "TuberculosisCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(tuberculosisCaseReportEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisCaseReportEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisCaseReportEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisCaseReportEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisCaseReportEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisCaseReportEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisCaseReportEClass, this.getTuberculosisPHCRSocialHistorySection(), "getTuberculosisPHCRSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisCaseReportEClass, this.getTuberculosisPHCRClinicalInformationSection(), "getTuberculosisPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisCaseReportEClass, this.getTuberculosisPHCRRelevantDxTestsSection(), "getTuberculosisPHCRRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisCaseReportEClass, this.getTuberculosisPHCRTreatmentInformationSection(), "getTuberculosisPHCRTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisCaseReportEClass, this.getTuberculosisPHCRImmunizationSection(), "getTuberculosisPHCRImmunizationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisPHCRSocialHistorySectionEClass, TuberculosisPHCRSocialHistorySection.class, "TuberculosisPHCRSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisPHCRSocialHistorySectionEClass, this.getTuberculosisPossibleExposureLocationAct(), "getTuberculosisPossibleExposureLocationActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisPHCRSocialHistorySectionEClass, this.getTuberculosisSocioBehavioralBooleanRiskFactorObservation(), "getTuberculosisSocioBehavioralBooleanRiskFactorObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisPHCRSocialHistorySectionEClass, this.getSmokingStatusObservation(), "getSmokingStatusObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisPHCRSocialHistorySectionEClass, this.getHIVStatusObservation(), "getHIVStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisPossibleExposureLocationActEClass, TuberculosisPossibleExposureLocationAct.class, "TuberculosisPossibleExposureLocationAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateTuberculosisPossibleExposureLocationActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateTuberculosisPossibleExposureLocationActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateTuberculosisPossibleExposureLocationActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateTuberculosisPossibleExposureLocationActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateTuberculosisPossibleExposureLocationActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass, TuberculosisSocioBehavioralBooleanRiskFactorObservation.class, "TuberculosisSocioBehavioralBooleanRiskFactorObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(smokingStatusObservationEClass, SmokingStatusObservation.class, "SmokingStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(smokingStatusObservationEClass, ecorePackage.getEBoolean(), "validateSmokingStatusObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(smokingStatusObservationEClass, ecorePackage.getEBoolean(), "validateSmokingStatusObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(hivStatusObservationEClass, HIVStatusObservation.class, "HIVStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hivStatusObservationEClass, ecorePackage.getEBoolean(), "validateHIVStatusObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tuberculosisPHCRClinicalInformationSectionEClass, TuberculosisPHCRClinicalInformationSection.class, "TuberculosisPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisPHCRClinicalInformationSectionEClass, this.getTuberculosisCaseObservation(), "getTuberculosisCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisPHCRClinicalInformationSectionEClass, this.getTuberculosisRelevantMedicalConditionHistoryObservation(), "getTuberculosisRelevantMedicalConditionHistoryObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisCaseObservationEClass, TuberculosisCaseObservation.class, "TuberculosisCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisCaseObservationEClass, this.getTuberculosisSignsAndSymptomsObservation(), "getTuberculosisSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisCaseObservationEClass, this.getTuberculosisSiteOfTBDiseaseObservation(), "getTuberculosisSiteOfTBDiseaseObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisSignsAndSymptomsObservationEClass, TuberculosisSignsAndSymptomsObservation.class, "TuberculosisSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tuberculosisSiteOfTBDiseaseObservationEClass, TuberculosisSiteOfTBDiseaseObservation.class, "TuberculosisSiteOfTBDiseaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisSiteOfTBDiseaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSiteOfTBDiseaseObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSiteOfTBDiseaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSiteOfTBDiseaseObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSiteOfTBDiseaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSiteOfTBDiseaseObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSiteOfTBDiseaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSiteOfTBDiseaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSiteOfTBDiseaseObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSiteOfTBDiseaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSiteOfTBDiseaseObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisSiteOfTBDiseaseObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisSiteOfTBDiseaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tuberculosisRelevantMedicalConditionHistoryObservationEClass, TuberculosisRelevantMedicalConditionHistoryObservation.class, "TuberculosisRelevantMedicalConditionHistoryObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisRelevantMedicalConditionHistoryObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisRelevantMedicalConditionHistoryObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisRelevantMedicalConditionHistoryObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisRelevantMedicalConditionHistoryObservationEClass, this.getTuberculosisRelevantMedicalConditionProblemObservation(), "getTuberculosisRelevantMedicalConditionProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisRelevantMedicalConditionProblemObservationEClass, TuberculosisRelevantMedicalConditionProblemObservation.class, "TuberculosisRelevantMedicalConditionProblemObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisRelevantMedicalConditionProblemObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisRelevantMedicalConditionProblemObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tuberculosisPHCRRelevantDxTestsSectionEClass, TuberculosisPHCRRelevantDxTestsSection.class, "TuberculosisPHCRRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisPHCRRelevantDxTestsSectionEClass, this.getTuberculosisResultOrganizer(), "getTuberculosisResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisPHCRRelevantDxTestsSectionEClass, this.getTuberculosisResultObservation(), "getTuberculosisResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisResultOrganizerEClass, TuberculosisResultOrganizer.class, "TuberculosisResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTuberculosisResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTuberculosisResultOrganizerTuberculosisResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisResultOrganizerEClass, this.getTuberculosisResultObservation(), "getTuberculosisResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisResultObservationEClass, TuberculosisResultObservation.class, "TuberculosisResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisResultObservationEClass, ecorePackage.getEBoolean(), "validateTuberculosisResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tuberculosisPHCRTreatmentInformationSectionEClass, TuberculosisPHCRTreatmentInformationSection.class, "TuberculosisPHCRTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisPHCRTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisPHCRTreatmentInformationSectionEClass, this.getTuberculosisTherapeuticRegimenAct(), "getTuberculosisTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisTherapeuticRegimenActEClass, TuberculosisTherapeuticRegimenAct.class, "TuberculosisTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(tuberculosisTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisTherapeuticRegimenActEClass, this.getTuberculosisTreatmentGivenSubstanceAdministration(), "getTuberculosisTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(tuberculosisTherapeuticRegimenActEClass, this.getTuberculosisTreatmentNotGivenSubstanceAdministration(), "getTuberculosisTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisTreatmentGivenSubstanceAdministrationEClass, TuberculosisTreatmentGivenSubstanceAdministration.class, "TuberculosisTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tuberculosisTreatmentNotGivenSubstanceAdministrationEClass, TuberculosisTreatmentNotGivenSubstanceAdministration.class, "TuberculosisTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tuberculosisPHCRImmunizationSectionEClass, TuberculosisPHCRImmunizationSection.class, "TuberculosisPHCRImmunizationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(tuberculosisPHCRImmunizationSectionEClass, ecorePackage.getEBoolean(), "validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tuberculosisPHCRImmunizationSectionEClass, this.getTuberculosisImmunizationActivitySubstanceAdministration(), "getTuberculosisImmunizationActivitySubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(tuberculosisImmunizationActivitySubstanceAdministrationEClass, TuberculosisImmunizationActivitySubstanceAdministration.class, "TuberculosisImmunizationActivitySubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tuberculosisImmunizationManufacturedProductEClass, TuberculosisImmunizationManufacturedProduct.class, "TuberculosisImmunizationManufacturedProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.openhealthtools.org/mdht/uml
        createUmlAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation
        createAnnotationAnnotations();
        // duplicates
        createDuplicatesAnnotations();
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createUmlAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml";     
        addAnnotation
          (this, 
           source, 
           new String[] {
             "initializers", "org.openhealthtools.mdht.uml.cda.phcr.tuberculosis"
           });                                                                                                                                                                                                                                                                                       
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createAnnotationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (tuberculosisCaseReportEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisCaseReportTemplateId TuberculosisCaseReportTitle TuberculosisCaseReportTuberculosisPHCRClinicalInformationSection",
             "templateId.root", "2.16.840.1.113883.10.20.15.1.1",
             "title.mixed", "Public Health Case Report - Tuberculosis",
             "constraints.validation.warning", "TuberculosisCaseReportTuberculosisPHCRSocialHistorySection TuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection TuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection",
             "constraints.validation.info", "TuberculosisCaseReportTuberculosisPHCRImmunizationSection"
           });                                        
        addAnnotation
          (tuberculosisPHCRSocialHistorySectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisPHCRSocialHistorySectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.7",
             "constraints.validation.warning", "TuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct TuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation TuberculosisPHCRSocialHistorySectionSmokingStatusObservation TuberculosisPHCRSocialHistorySectionHIVStatusObservation"
           });                              
        addAnnotation
          (tuberculosisPossibleExposureLocationActEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisPossibleExposureLocationActTemplateId TuberculosisPossibleExposureLocationActClassCode TuberculosisPossibleExposureLocationActCode TuberculosisPossibleExposureLocationActMoodCode TuberculosisPossibleExposureLocationActStatusCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.12",
             "classCode", "ACT",
             "code.code", "413350009",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Finding with explicit context",
             "moodCode", "EVN",
             "statusCode.code", "completed"
           });                         
        addAnnotation
          (tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisSocioBehavioralBooleanRiskFactorObservationTemplateId TuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd TuberculosisSocioBehavioralBooleanRiskFactorObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.15",
             "constraints.validation.warning", "TuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime",
             "code.code", "ASSERTION",
             "code.codeSystem", "2.16.840.1.113883.5.4",
             "code.codeSystemName", "HL7ActCode"
           });                  
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SmokingStatusObservationTemplateId SmokingStatusObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.85",
             "code.code", "266918002",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Tobacco use and exposure",
             "constraints.validation.warning", "SmokingStatusObservationEffectiveTime"
           });              
        addAnnotation
          (hivStatusObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HIVStatusObservationTemplateId HIVStatusObservationClassCode HIVStatusObservationCode HIVStatusObservationStatusCode HIVStatusObservationMoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.4",
             "classCode", "OBS",
             "code.code", "ASSERTION",
             "code.codeSystem", "2.16.840.1.113883.5.4",
             "code.codeSystemName", "HL7ActCode",
             "statusCode.code", "completed",
             "moodCode", "EVN"
           });                         
        addAnnotation
          (tuberculosisPHCRClinicalInformationSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisPHCRClinicalInformationSectionTemplateId TuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.5",
             "constraints.validation.warning", "TuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation"
           });                  
        addAnnotation
          (tuberculosisCaseObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisCaseObservationTemplateId TuberculosisCaseObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.54",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "constraints.validation.warning", "TuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation TuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation"
           });                      
        addAnnotation
          (tuberculosisSignsAndSymptomsObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisSignsAndSymptomsObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.14"
           });      
        addAnnotation
          (tuberculosisSiteOfTBDiseaseObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisSiteOfTBDiseaseObservationTemplateId TuberculosisSiteOfTBDiseaseObservationClassCode TuberculosisSiteOfTBDiseaseObservationCode TuberculosisSiteOfTBDiseaseObservationMoodCode TuberculosisSiteOfTBDiseaseObservationStatusCode TuberculosisSiteOfTBDiseaseObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.98",
             "classCode", "OBS",
             "code.code", "ASSERTION",
             "code.codeSystem", "2.16.840.1.113883.5.4",
             "code.codeSystemName", "HL7ActCode",
             "constraints.validation.warning", "TuberculosisSiteOfTBDiseaseObservationEffectiveTime",
             "moodCode", "EVN",
             "statusCode.code", "completed",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT"
           });                                 
        addAnnotation
          (tuberculosisRelevantMedicalConditionHistoryObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisRelevantMedicalConditionHistoryObservationTemplateId TuberculosisRelevantMedicalConditionHistoryObservationValue TuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.107",
             "value.code", "398192003",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "value.displayName", "Co-morbid conditions"
           });                
        addAnnotation
          (tuberculosisRelevantMedicalConditionProblemObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisRelevantMedicalConditionProblemObservationTemplateId TuberculosisRelevantMedicalConditionProblemObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.108",
             "code.code", "64572001",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Condition"
           });          
        addAnnotation
          (tuberculosisPHCRRelevantDxTestsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisPHCRRelevantDxTestsSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.6",
             "constraints.validation.info", "TuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer",
             "constraints.validation.warning", "TuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation"
           });                  
        addAnnotation
          (tuberculosisResultOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisResultOrganizerTemplateId TuberculosisResultOrganizerCode TuberculosisResultOrganizerTuberculosisResultObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.21",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC"
           });                
        addAnnotation
          (tuberculosisResultObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisResultObservationTemplateId TuberculosisResultObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.13",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC"
           });          
        addAnnotation
          (tuberculosisPHCRTreatmentInformationSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisPHCRTreatmentInformationSectionTemplateId TuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.8"
           });            
        addAnnotation
          (tuberculosisTherapeuticRegimenActEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisTherapeuticRegimenActTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.18",
             "constraints.validation.warning", "TuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration",
             "constraints.validation.info", "TuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration"
           });                  
        addAnnotation
          (tuberculosisTreatmentGivenSubstanceAdministrationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisTreatmentGivenSubstanceAdministrationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.16"
           });      
        addAnnotation
          (tuberculosisTreatmentNotGivenSubstanceAdministrationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisTreatmentNotGivenSubstanceAdministrationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.19"
           });      
        addAnnotation
          (tuberculosisPHCRImmunizationSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisPHCRImmunizationSectionTemplateId TuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.23"
           });            
        addAnnotation
          (tuberculosisImmunizationActivitySubstanceAdministrationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisImmunizationActivitySubstanceAdministrationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.60"
           });      
        addAnnotation
          (tuberculosisImmunizationManufacturedProductEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TuberculosisImmunizationManufacturedProductTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.61"
           }); 
    }

	/**
     * Initializes the annotations for <b>duplicates</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createDuplicatesAnnotations() {
        String source = "duplicates";       
        addAnnotation
          (tuberculosisCaseReportEClass, 
           source, 
           new String[] {
           });                                        
        addAnnotation
          (tuberculosisPHCRSocialHistorySectionEClass, 
           source, 
           new String[] {
           });                                                   
        addAnnotation
          (tuberculosisSocioBehavioralBooleanRiskFactorObservationEClass, 
           source, 
           new String[] {
           });                  
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] {
           });                                   
        addAnnotation
          (tuberculosisPHCRClinicalInformationSectionEClass, 
           source, 
           new String[] {
           });                  
        addAnnotation
          (tuberculosisCaseObservationEClass, 
           source, 
           new String[] {
           });                      
        addAnnotation
          (tuberculosisSignsAndSymptomsObservationEClass, 
           source, 
           new String[] {
           });                                   
        addAnnotation
          (tuberculosisRelevantMedicalConditionHistoryObservationEClass, 
           source, 
           new String[] {
           });                
        addAnnotation
          (tuberculosisRelevantMedicalConditionProblemObservationEClass, 
           source, 
           new String[] {
           });          
        addAnnotation
          (tuberculosisPHCRRelevantDxTestsSectionEClass, 
           source, 
           new String[] {
           });                  
        addAnnotation
          (tuberculosisResultOrganizerEClass, 
           source, 
           new String[] {
           });                
        addAnnotation
          (tuberculosisResultObservationEClass, 
           source, 
           new String[] {
           });          
        addAnnotation
          (tuberculosisPHCRTreatmentInformationSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (tuberculosisTherapeuticRegimenActEClass, 
           source, 
           new String[] {
           });                  
        addAnnotation
          (tuberculosisTreatmentGivenSubstanceAdministrationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (tuberculosisTreatmentNotGivenSubstanceAdministrationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (tuberculosisPHCRImmunizationSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (tuberculosisImmunizationActivitySubstanceAdministrationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (tuberculosisImmunizationManufacturedProductEClass, 
           source, 
           new String[] {
           });
    }

} //TuberculosisPackageImpl
