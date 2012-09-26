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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HepbPackageImpl extends EPackageImpl implements HepbPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBCaseReportEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBSocialHistorySectionEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jobRelatedBodyFluidExposureRiskFrequencyObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBPossibleExposureLocationAndTypeActEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBImmunizationSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBImmunizationActivityEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBPHCRClinicalInformationSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBCaseObservationEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBSignsAndSymptomsObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBRiskAssociatedProcedureEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass viralHepatitisHistoryObservationEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stdHistoryObservationEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBPHCRTreatmentInformationSectionEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBTherapeuticRegimenActEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBResultObservationEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass acuteHepatitisBImmunizationProductEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private HepbPackageImpl() {
        super(eNS_URI, HepbFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link HepbPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static HepbPackage init() {
        if (isInited) return (HepbPackage)EPackage.Registry.INSTANCE.getEPackage(HepbPackage.eNS_URI);

        // Obtain or create and register package
        HepbPackageImpl theHepbPackage = (HepbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HepbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HepbPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PhcrPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theHepbPackage.createPackageContents();

        // Initialize created meta-data
        theHepbPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theHepbPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return HepbValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theHepbPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.phcr.hepb", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theHepbPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(HepbPackage.eNS_URI, theHepbPackage);
        return theHepbPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBCaseReport() {
        return acuteHepatitisBCaseReportEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBSocialHistorySection() {
        return acuteHepatitisBSocialHistorySectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJobRelatedBodyFluidExposureRiskFrequencyObservation() {
        return jobRelatedBodyFluidExposureRiskFrequencyObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation() {
        return acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation() {
        return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBPossibleExposureLocationAndTypeAct() {
        return acuteHepatitisBPossibleExposureLocationAndTypeActEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBImmunizationSection() {
        return acuteHepatitisBImmunizationSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBImmunizationActivity() {
        return acuteHepatitisBImmunizationActivityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBPHCRClinicalInformationSection() {
        return acuteHepatitisBPHCRClinicalInformationSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBCaseObservation() {
        return acuteHepatitisBCaseObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBSignsAndSymptomsObservation() {
        return acuteHepatitisBSignsAndSymptomsObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBRiskAssociatedProcedure() {
        return acuteHepatitisBRiskAssociatedProcedureEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getViralHepatitisHistoryObservation() {
        return viralHepatitisHistoryObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSTDHistoryObservation() {
        return stdHistoryObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBPHCRTreatmentInformationSection() {
        return acuteHepatitisBPHCRTreatmentInformationSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBTherapeuticRegimenAct() {
        return acuteHepatitisBTherapeuticRegimenActEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
        return acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBResultObservation() {
        return acuteHepatitisBResultObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAcuteHepatitisBImmunizationProduct() {
        return acuteHepatitisBImmunizationProductEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HepbFactory getHepbFactory() {
        return (HepbFactory)getEFactoryInstance();
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
        acuteHepatitisBCaseReportEClass = createEClass(ACUTE_HEPATITIS_BCASE_REPORT);

        acuteHepatitisBSocialHistorySectionEClass = createEClass(ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION);

        jobRelatedBodyFluidExposureRiskFrequencyObservationEClass = createEClass(JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION);

        acuteHepatitisBPossibleExposureLocationAndTypeActEClass = createEClass(ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);

        acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass = createEClass(ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);

        acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass = createEClass(ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION);

        acuteHepatitisBPHCRClinicalInformationSectionEClass = createEClass(ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION);

        acuteHepatitisBCaseObservationEClass = createEClass(ACUTE_HEPATITIS_BCASE_OBSERVATION);

        acuteHepatitisBSignsAndSymptomsObservationEClass = createEClass(ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION);

        acuteHepatitisBRiskAssociatedProcedureEClass = createEClass(ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE);

        viralHepatitisHistoryObservationEClass = createEClass(VIRAL_HEPATITIS_HISTORY_OBSERVATION);

        stdHistoryObservationEClass = createEClass(STD_HISTORY_OBSERVATION);

        acuteHepatitisBImmunizationSectionEClass = createEClass(ACUTE_HEPATITIS_BIMMUNIZATION_SECTION);

        acuteHepatitisBImmunizationActivityEClass = createEClass(ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY);

        acuteHepatitisBPHCRTreatmentInformationSectionEClass = createEClass(ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION);

        acuteHepatitisBTherapeuticRegimenActEClass = createEClass(ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT);

        acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass = createEClass(ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);

        acuteHepatitisBResultObservationEClass = createEClass(ACUTE_HEPATITIS_BRESULT_OBSERVATION);

        acuteHepatitisBImmunizationProductEClass = createEClass(ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT);
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
        acuteHepatitisBCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
        acuteHepatitisBSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
        jobRelatedBodyFluidExposureRiskFrequencyObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        acuteHepatitisBPossibleExposureLocationAndTypeActEClass.getESuperTypes().add(theCDAPackage.getAct());
        acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass.getESuperTypes().add(theCCDPackage.getSocialHistoryObservation());
        acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        acuteHepatitisBPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
        acuteHepatitisBCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
        acuteHepatitisBSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
        acuteHepatitisBRiskAssociatedProcedureEClass.getESuperTypes().add(theCDAPackage.getProcedure());
        viralHepatitisHistoryObservationEClass.getESuperTypes().add(theCCDPackage.getProblemObservation());
        stdHistoryObservationEClass.getESuperTypes().add(theCCDPackage.getProblemObservation());
        acuteHepatitisBImmunizationSectionEClass.getESuperTypes().add(theCCDPackage.getImmunizationsSection());
        acuteHepatitisBImmunizationActivityEClass.getESuperTypes().add(theCCDPackage.getMedicationActivity());
        acuteHepatitisBPHCRTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
        acuteHepatitisBTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
        acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
        acuteHepatitisBResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
        acuteHepatitisBImmunizationProductEClass.getESuperTypes().add(theCCDPackage.getProduct());

        // Initialize classes and features; add operations and parameters
        initEClass(acuteHepatitisBCaseReportEClass, AcuteHepatitisBCaseReport.class, "AcuteHepatitisBCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(acuteHepatitisBCaseReportEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBCaseReportEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBCaseReportEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBCaseReportEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBCaseReportEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBCaseReportEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(acuteHepatitisBCaseReportEClass, this.getAcuteHepatitisBSocialHistorySection(), "getAcuteHepatitisBSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBCaseReportEClass, this.getAcuteHepatitisBPHCRClinicalInformationSection(), "getAcuteHepatitisBPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBCaseReportEClass, this.getAcuteHepatitisBImmunizationSection(), "getAcuteHepatitisBImmunizationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBCaseReportEClass, this.getAcuteHepatitisBPHCRTreatmentInformationSection(), "getAcuteHepatitisBPHCRTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBCaseReportEClass, this.getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(), "getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(acuteHepatitisBSocialHistorySectionEClass, AcuteHepatitisBSocialHistorySection.class, "AcuteHepatitisBSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(acuteHepatitisBSocialHistorySectionEClass, this.getJobRelatedBodyFluidExposureRiskFrequencyObservation(), "getJobRelatedBodyFluidExposureRiskFrequencyObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBSocialHistorySectionEClass, this.getAcuteHepatitisBPossibleExposureLocationAndTypeAct(), "getAcuteHepatitisBPossibleExposureLocationAndTypeActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBSocialHistorySectionEClass, this.getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(), "getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBSocialHistorySectionEClass, this.getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(), "getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, JobRelatedBodyFluidExposureRiskFrequencyObservation.class, "JobRelatedBodyFluidExposureRiskFrequencyObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, ecorePackage.getEBoolean(), "validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, ecorePackage.getEBoolean(), "validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, ecorePackage.getEBoolean(), "validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, ecorePackage.getEBoolean(), "validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, ecorePackage.getEBoolean(), "validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, ecorePackage.getEBoolean(), "validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(acuteHepatitisBPossibleExposureLocationAndTypeActEClass, AcuteHepatitisBPossibleExposureLocationAndTypeAct.class, "AcuteHepatitisBPossibleExposureLocationAndTypeAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPossibleExposureLocationAndTypeActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPossibleExposureLocationAndTypeActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass, AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation.class, "AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation.class, "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(acuteHepatitisBPHCRClinicalInformationSectionEClass, AcuteHepatitisBPHCRClinicalInformationSection.class, "AcuteHepatitisBPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, this.getAcuteHepatitisBCaseObservation(), "getAcuteHepatitisBCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, this.getAcuteHepatitisBRiskAssociatedProcedure(), "getAcuteHepatitisBRiskAssociatedProcedures", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, this.getViralHepatitisHistoryObservation(), "getViralHepatitisHistoryObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(acuteHepatitisBPHCRClinicalInformationSectionEClass, this.getSTDHistoryObservation(), "getSTDHistoryObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(acuteHepatitisBCaseObservationEClass, AcuteHepatitisBCaseObservation.class, "AcuteHepatitisBCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBCaseObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBCaseObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(acuteHepatitisBCaseObservationEClass, this.getAcuteHepatitisBSignsAndSymptomsObservation(), "getAcuteHepatitisBSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(acuteHepatitisBSignsAndSymptomsObservationEClass, AcuteHepatitisBSignsAndSymptomsObservation.class, "AcuteHepatitisBSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(acuteHepatitisBRiskAssociatedProcedureEClass, AcuteHepatitisBRiskAssociatedProcedure.class, "AcuteHepatitisBRiskAssociatedProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBRiskAssociatedProcedureEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBRiskAssociatedProcedureTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBRiskAssociatedProcedureEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBRiskAssociatedProcedureClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBRiskAssociatedProcedureEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBRiskAssociatedProcedureCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBRiskAssociatedProcedureEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBRiskAssociatedProcedureMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBRiskAssociatedProcedureEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBRiskAssociatedProcedureStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(acuteHepatitisBRiskAssociatedProcedureEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(viralHepatitisHistoryObservationEClass, ViralHepatitisHistoryObservation.class, "ViralHepatitisHistoryObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(viralHepatitisHistoryObservationEClass, ecorePackage.getEBoolean(), "validateViralHepatitisHistoryObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viralHepatitisHistoryObservationEClass, ecorePackage.getEBoolean(), "validateViralHepatitisHistoryObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viralHepatitisHistoryObservationEClass, ecorePackage.getEBoolean(), "validateViralHepatitisHistoryObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(stdHistoryObservationEClass, STDHistoryObservation.class, "STDHistoryObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(stdHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSTDHistoryObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(stdHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSTDHistoryObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(stdHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSTDHistoryObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(stdHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSTDHistoryObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(stdHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSTDHistoryObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(stdHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSTDHistoryObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(stdHistoryObservationEClass, ecorePackage.getEBoolean(), "validateSTDHistoryObservationProblemStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(stdHistoryObservationEClass, theCCDPackage.getProblemStatusObservation(), "gethepbProblemStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(acuteHepatitisBImmunizationSectionEClass, AcuteHepatitisBImmunizationSection.class, "AcuteHepatitisBImmunizationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBImmunizationSectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(acuteHepatitisBImmunizationSectionEClass, this.getAcuteHepatitisBImmunizationActivity(), "getAcuteHepatitisBImmunizationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(acuteHepatitisBImmunizationActivityEClass, AcuteHepatitisBImmunizationActivity.class, "AcuteHepatitisBImmunizationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(acuteHepatitisBPHCRTreatmentInformationSectionEClass, AcuteHepatitisBPHCRTreatmentInformationSection.class, "AcuteHepatitisBPHCRTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBPHCRTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(acuteHepatitisBPHCRTreatmentInformationSectionEClass, this.getAcuteHepatitisBTherapeuticRegimenAct(), "getAcuteHepatitisBTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(acuteHepatitisBTherapeuticRegimenActEClass, AcuteHepatitisBTherapeuticRegimenAct.class, "AcuteHepatitisBTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection.class, "AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, this.getAcuteHepatitisBResultObservation(), "getAcuteHepatitisBResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(acuteHepatitisBResultObservationEClass, AcuteHepatitisBResultObservation.class, "AcuteHepatitisBResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(acuteHepatitisBResultObservationEClass, ecorePackage.getEBoolean(), "validateAcuteHepatitisBResultObservationInterpretationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(acuteHepatitisBImmunizationProductEClass, AcuteHepatitisBImmunizationProduct.class, "AcuteHepatitisBImmunizationProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
             "initializers", "org.openhealthtools.mdht.uml.cda.phcr.hepb"
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
          (acuteHepatitisBCaseReportEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBCaseReportTemplateId AcuteHepatitisBCaseReportTitle AcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection",
             "templateId.root", "2.16.840.1.113883.10.20.15.1.2",
             "title.mixed", "Public Health Case Report - Acute Hepatitis B",
             "constraints.validation.warning", "AcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection AcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection AcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection AcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection"
           });                                        
        addAnnotation
          (acuteHepatitisBSocialHistorySectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBSocialHistorySectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.11",
             "constraints.validation.warning", "AcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation AcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation",
             "constraints.validation.info", "AcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct AcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation "
           });                              
        addAnnotation
          (jobRelatedBodyFluidExposureRiskFrequencyObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "JobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId JobRelatedBodyFluidExposureRiskFrequencyObservationCode JobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode JobRelatedBodyFluidExposureRiskFrequencyObservationValue JobRelatedBodyFluidExposureRiskFrequencyObservationClassCode JobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.29",
             "code.code", "55212-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Occupation related direct blood or body fluid exposure frequencyOccupation related direct blood or body fluid exposure frequency",
             "statusCode.code", "completed",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "classCode", "OBS",
             "moodCode", "EVN"
           });                             
        addAnnotation
          (acuteHepatitisBPossibleExposureLocationAndTypeActEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId AcuteHepatitisBPossibleExposureLocationAndTypeActClassCode AcuteHepatitisBPossibleExposureLocationAndTypeActCode AcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode AcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.27",
             "classCode", "ACT",
             "code.code", "413350009",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "moodCode", "EVN"
           });                         
        addAnnotation
          (acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationTemplateId AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.28",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "code.code", "ASSERTION",
             "code.codeSystem", "2.16.840.1.113883.5.4",
             "code.codeSystemName", "HL7ActCode",
             "constraints.validation.warning", "AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime"
           });                      
        addAnnotation
          (acuteHepatitisBActualBloodAndOrBodyFluidExposureObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation TemplateId AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation Code AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation StatusCode AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation ClassCode AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation Id AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation MoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.26",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "statusCode.code", "completed",
             "classCode", "OBS",
             "moodCode", "EVN"
           });                             
        addAnnotation
          (acuteHepatitisBPHCRClinicalInformationSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBPHCRClinicalInformationSectionTemplateId AcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.12",
             "constraints.validation.warning", "AcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure AcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation AcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation"
           });                              
        addAnnotation
          (acuteHepatitisBCaseObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBCaseObservationTemplateId AcuteHepatitisBCaseObservationValue AcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.30",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT"
           });                
        addAnnotation
          (acuteHepatitisBSignsAndSymptomsObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBSignsAndSymptomsObservationTemplateId AcuteHepatitisBSignsAndSymptomsObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.22",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT"
           });          
        addAnnotation
          (acuteHepatitisBRiskAssociatedProcedureEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBRiskAssociatedProcedureTemplateId AcuteHepatitisBRiskAssociatedProcedureClassCode AcuteHepatitisBRiskAssociatedProcedureCode AcuteHepatitisBRiskAssociatedProcedureMoodCode AcuteHepatitisBRiskAssociatedProcedureStatusCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.31",
             "classCode", "PROC",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "moodCode", "EVN",
             "statusCode.code", "completed",
             "constraints.validation.warning", "AcuteHepatitisBRiskAssociatedProcedureEffectiveTime"
           });                             
        addAnnotation
          (viralHepatitisHistoryObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ViralHepatitisHistoryObservationTemplateId ViralHepatitisHistoryObservationCode ViralHepatitisHistoryObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.32",
             "code.code", "ASSERTION",
             "code.codeSystem", "2.16.840.1.113883.5.4",
             "code.codeSystemName", "HL7ActCode",
             "code.displayName", "ASSERTION",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "constraints.validation.info", "ViralHepatitisHistoryObservationId"
           });                  
        addAnnotation
          (stdHistoryObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "STDHistoryObservationTemplateId STDHistoryObservationClassCode STDHistoryObservationCode STDHistoryObservationMoodCode STDHistoryObservationStatusCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.33",
             "classCode", "OBS",
             "code.code", "ASSERTION",
             "code.codeSystem", "2.16.840.1.113883.5.6",
             "code.codeSystemName", "HL7ActClass",
             "code.displayName", "ASSERTION",
             "constraints.validation.warning", "STDHistoryObservationEffectiveTime",
             "constraints.validation.info", "STDHistoryObservationId STDHistoryObservationProblemStatus",
             "moodCode", "EVN",
             "statusCode.code", "completed"
           });                                    
        addAnnotation
          (acuteHepatitisBImmunizationSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBImmunizationSectionTemplateId AcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.9"
           });            
        addAnnotation
          (acuteHepatitisBImmunizationActivityEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBImmunizationActivityTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.25"
           });      
        addAnnotation
          (acuteHepatitisBPHCRTreatmentInformationSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBPHCRTreatmentInformationSectionTemplateId AcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.10"
           });            
        addAnnotation
          (acuteHepatitisBTherapeuticRegimenActEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBTherapeuticRegimenActTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.23"
           });      
        addAnnotation
          (acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.13",
             "constraints.validation.warning", "AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation"
           });            
        addAnnotation
          (acuteHepatitisBResultObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBResultObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.34",
             "constraints.validation.warning", "AcuteHepatitisBResultObservationInterpretationCode"
           });          
        addAnnotation
          (acuteHepatitisBImmunizationProductEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AcuteHepatitisBImmunizationProductTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.24"
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
          (acuteHepatitisBCaseReportEClass, 
           source, 
           new String[] {
           });                                        
        addAnnotation
          (acuteHepatitisBSocialHistorySectionEClass, 
           source, 
           new String[] {
           });                                                                            
        addAnnotation
          (acuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEClass, 
           source, 
           new String[] {
           });                                               
        addAnnotation
          (acuteHepatitisBPHCRClinicalInformationSectionEClass, 
           source, 
           new String[] {
           });                              
        addAnnotation
          (acuteHepatitisBCaseObservationEClass, 
           source, 
           new String[] {
           });                
        addAnnotation
          (acuteHepatitisBSignsAndSymptomsObservationEClass, 
           source, 
           new String[] {
           });                                   
        addAnnotation
          (viralHepatitisHistoryObservationEClass, 
           source, 
           new String[] {
           });                  
        addAnnotation
          (stdHistoryObservationEClass, 
           source, 
           new String[] {
           });                                    
        addAnnotation
          (acuteHepatitisBImmunizationSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (acuteHepatitisBImmunizationActivityEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (acuteHepatitisBPHCRTreatmentInformationSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (acuteHepatitisBTherapeuticRegimenActEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (acuteHepatitisBResultObservationEClass, 
           source, 
           new String[] {
           });          
        addAnnotation
          (acuteHepatitisBImmunizationProductEClass, 
           source, 
           new String[] {
           });
    }

} //HepbPackageImpl
