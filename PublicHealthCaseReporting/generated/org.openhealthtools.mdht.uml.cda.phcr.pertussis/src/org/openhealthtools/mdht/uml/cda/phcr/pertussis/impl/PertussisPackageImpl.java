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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl;

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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory;
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PertussisPackageImpl extends EPackageImpl implements PertussisPackage
{
  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass pertussisCaseReportEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass pertussisSocialHistorySectionEClass = null;
  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisPossibleExposureLocationActEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisPossibleCaseContactLocationActEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisClinicalInformationSectionEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisTreatmentInformationSectionEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisTherapeuticRegimenActEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisTreatmentGivenSubstanceAdministrationEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisTreatmentNotGivenSubstanceAdministrationEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisImmunizationsSectionEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisImmunizationActivityEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisCaseObservationEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisSignsAndSymptomsObservationEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisResultObservationEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisRelevantDxTestsSectionEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisResultOrganizerEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pertussisImmunizationProductEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage#eNS_URI
     * @see #init()
     * @generated
     */
  private PertussisPackageImpl()
  {
        super(eNS_URI, PertussisFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PertussisPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
  public static PertussisPackage init()
  {
        if (isInited) return (PertussisPackage)EPackage.Registry.INSTANCE.getEPackage(PertussisPackage.eNS_URI);

        // Obtain or create and register package
        PertussisPackageImpl thePertussisPackage = (PertussisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PertussisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PertussisPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PhcrPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        thePertussisPackage.createPackageContents();

        // Initialize created meta-data
        thePertussisPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (thePertussisPackage, 
             new EValidator.Descriptor()
             {
                 public EValidator getEValidator()
                 {
                     return PertussisValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        thePertussisPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.phcr.pertussis", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(thePertussisPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PertussisPackage.eNS_URI, thePertussisPackage);
        return thePertussisPackage;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPertussisCaseReport()
  {
        return pertussisCaseReportEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPertussisSocialHistorySection()
  {
        return pertussisSocialHistorySectionEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisPossibleExposureLocationAct() {
        return pertussisPossibleExposureLocationActEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisPossibleCaseContactLocationAct() {
        return pertussisPossibleCaseContactLocationActEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisClinicalInformationSection() {
        return pertussisClinicalInformationSectionEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisTreatmentInformationSection() {
        return pertussisTreatmentInformationSectionEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisTherapeuticRegimenAct() {
        return pertussisTherapeuticRegimenActEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisTreatmentGivenSubstanceAdministration() {
        return pertussisTreatmentGivenSubstanceAdministrationEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisTreatmentNotGivenSubstanceAdministration() {
        return pertussisTreatmentNotGivenSubstanceAdministrationEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisImmunizationsSection() {
        return pertussisImmunizationsSectionEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisImmunizationActivity() {
        return pertussisImmunizationActivityEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisCaseObservation() {
        return pertussisCaseObservationEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisSignsAndSymptomsObservation() {
        return pertussisSignsAndSymptomsObservationEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisResultObservation() {
        return pertussisResultObservationEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisRelevantDxTestsSection() {
        return pertussisRelevantDxTestsSectionEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisResultOrganizer() {
        return pertussisResultOrganizerEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPertussisImmunizationProduct() {
        return pertussisImmunizationProductEClass;
    }

		/**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public PertussisFactory getPertussisFactory()
  {
        return (PertussisFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        pertussisCaseReportEClass = createEClass(PERTUSSIS_CASE_REPORT);

        pertussisSocialHistorySectionEClass = createEClass(PERTUSSIS_SOCIAL_HISTORY_SECTION);

        pertussisPossibleExposureLocationActEClass = createEClass(PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);

        pertussisPossibleCaseContactLocationActEClass = createEClass(PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT);

        pertussisClinicalInformationSectionEClass = createEClass(PERTUSSIS_CLINICAL_INFORMATION_SECTION);

        pertussisCaseObservationEClass = createEClass(PERTUSSIS_CASE_OBSERVATION);

        pertussisSignsAndSymptomsObservationEClass = createEClass(PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);

        pertussisTreatmentInformationSectionEClass = createEClass(PERTUSSIS_TREATMENT_INFORMATION_SECTION);

        pertussisTherapeuticRegimenActEClass = createEClass(PERTUSSIS_THERAPEUTIC_REGIMEN_ACT);

        pertussisTreatmentGivenSubstanceAdministrationEClass = createEClass(PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

        pertussisTreatmentNotGivenSubstanceAdministrationEClass = createEClass(PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);

        pertussisRelevantDxTestsSectionEClass = createEClass(PERTUSSIS_RELEVANT_DX_TESTS_SECTION);

        pertussisResultObservationEClass = createEClass(PERTUSSIS_RESULT_OBSERVATION);

        pertussisResultOrganizerEClass = createEClass(PERTUSSIS_RESULT_ORGANIZER);

        pertussisImmunizationsSectionEClass = createEClass(PERTUSSIS_IMMUNIZATIONS_SECTION);

        pertussisImmunizationActivityEClass = createEClass(PERTUSSIS_IMMUNIZATION_ACTIVITY);

        pertussisImmunizationProductEClass = createEClass(PERTUSSIS_IMMUNIZATION_PRODUCT);
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
  public void initializePackageContents()
  {
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
        pertussisCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
        pertussisSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
        pertussisPossibleExposureLocationActEClass.getESuperTypes().add(theCDAPackage.getAct());
        pertussisPossibleCaseContactLocationActEClass.getESuperTypes().add(theCDAPackage.getAct());
        pertussisClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
        pertussisCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
        pertussisSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
        pertussisTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
        pertussisTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
        pertussisTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
        pertussisTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());
        pertussisRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
        pertussisResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
        pertussisResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
        pertussisImmunizationsSectionEClass.getESuperTypes().add(theCCDPackage.getImmunizationsSection());
        pertussisImmunizationActivityEClass.getESuperTypes().add(theCCDPackage.getMedicationActivity());
        pertussisImmunizationProductEClass.getESuperTypes().add(theCCDPackage.getProduct());

        // Initialize classes and features; add operations and parameters
        initEClass(pertussisCaseReportEClass, PertussisCaseReport.class, "PertussisCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(pertussisCaseReportEClass, ecorePackage.getEBoolean(), "validatePertussisCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisCaseReportEClass, ecorePackage.getEBoolean(), "validatePertussisCaseReportPertussisSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisCaseReportEClass, ecorePackage.getEBoolean(), "validatePertussisCaseReportPertussisClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisCaseReportEClass, ecorePackage.getEBoolean(), "validatePertussisCaseReportPertussisTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisCaseReportEClass, ecorePackage.getEBoolean(), "validatePertussisCaseReportPertussisRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisCaseReportEClass, ecorePackage.getEBoolean(), "validatePertussisCaseReportPertussisImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisCaseReportEClass, this.getPertussisSocialHistorySection(), "getPertussisSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(pertussisCaseReportEClass, this.getPertussisClinicalInformationSection(), "getPertussisClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(pertussisCaseReportEClass, this.getPertussisTreatmentInformationSection(), "getPertussisTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(pertussisCaseReportEClass, this.getPertussisRelevantDxTestsSection(), "getPertussisRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(pertussisCaseReportEClass, this.getPertussisImmunizationsSection(), "getPertussisImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisSocialHistorySectionEClass, PertussisSocialHistorySection.class, "PertussisSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisSocialHistorySectionEClass, this.getPertussisPossibleExposureLocationAct(), "getPertussisPossibleExposureLocationActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(pertussisSocialHistorySectionEClass, this.getPertussisPossibleCaseContactLocationAct(), "getPertussisPossibleCaseContactLocationActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisPossibleExposureLocationActEClass, PertussisPossibleExposureLocationAct.class, "PertussisPossibleExposureLocationAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleExposureLocationActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleExposureLocationActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleExposureLocationActCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleExposureLocationActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleExposureLocationActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleExposureLocationActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleExposureLocationActStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pertussisPossibleCaseContactLocationActEClass, PertussisPossibleCaseContactLocationAct.class, "PertussisPossibleCaseContactLocationAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisPossibleCaseContactLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleCaseContactLocationActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleCaseContactLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleCaseContactLocationActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleCaseContactLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleCaseContactLocationActCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleCaseContactLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleCaseContactLocationActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleCaseContactLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleCaseContactLocationActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleCaseContactLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleCaseContactLocationActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisPossibleCaseContactLocationActEClass, ecorePackage.getEBoolean(), "validatePertussisPossibleCaseContactLocationActStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pertussisClinicalInformationSectionEClass, PertussisClinicalInformationSection.class, "PertussisClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validatePertussisClinicalInformationSectionPertussisCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisClinicalInformationSectionEClass, this.getPertussisCaseObservation(), "getPertussisCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisCaseObservationEClass, PertussisCaseObservation.class, "PertussisCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisCaseObservationEClass, ecorePackage.getEBoolean(), "validatePertussisCaseObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisCaseObservationEClass, ecorePackage.getEBoolean(), "validatePertussisCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisCaseObservationEClass, ecorePackage.getEBoolean(), "validatePertussisCaseObservationPertussisSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisCaseObservationEClass, this.getPertussisSignsAndSymptomsObservation(), "getPertussisSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisSignsAndSymptomsObservationEClass, PertussisSignsAndSymptomsObservation.class, "PertussisSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validatePertussisSignsAndSymptomsObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validatePertussisSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pertussisTreatmentInformationSectionEClass, PertussisTreatmentInformationSection.class, "PertussisTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisTreatmentInformationSectionEClass, this.getPertussisTherapeuticRegimenAct(), "getPertussisTherapeuticRegimen", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisTherapeuticRegimenActEClass, PertussisTherapeuticRegimenAct.class, "PertussisTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisTherapeuticRegimenActEClass, this.getPertussisTreatmentGivenSubstanceAdministration(), "getPertussisTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(pertussisTherapeuticRegimenActEClass, this.getPertussisTreatmentNotGivenSubstanceAdministration(), "getPertussisTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisTreatmentGivenSubstanceAdministrationEClass, PertussisTreatmentGivenSubstanceAdministration.class, "PertussisTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(pertussisTreatmentNotGivenSubstanceAdministrationEClass, PertussisTreatmentNotGivenSubstanceAdministration.class, "PertussisTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(pertussisRelevantDxTestsSectionEClass, PertussisRelevantDxTestsSection.class, "PertussisRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validatePertussisRelevantDxTestsSectionPertussisResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validatePertussisRelevantDxTestsSectionPertussisResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisRelevantDxTestsSectionEClass, this.getPertussisResultObservation(), "getPertussisResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(pertussisRelevantDxTestsSectionEClass, this.getPertussisResultOrganizer(), "getPertussisResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisResultObservationEClass, PertussisResultObservation.class, "PertussisResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisResultObservationEClass, ecorePackage.getEBoolean(), "validatePertussisResultObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisResultObservationEClass, ecorePackage.getEBoolean(), "validatePertussisResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pertussisResultOrganizerEClass, PertussisResultOrganizer.class, "PertussisResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisResultOrganizerEClass, ecorePackage.getEBoolean(), "validatePertussisResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pertussisResultOrganizerEClass, ecorePackage.getEBoolean(), "validatePertussisResultOrganizerPertussisResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisResultOrganizerEClass, this.getPertussisResultObservation(), "getPertussisResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisImmunizationsSectionEClass, PertussisImmunizationsSection.class, "PertussisImmunizationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisImmunizationsSectionEClass, ecorePackage.getEBoolean(), "validatePertussisImmunizationsSectionPertussisImmunizationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(pertussisImmunizationsSectionEClass, this.getPertussisImmunizationActivity(), "getPertussisImmunizationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(pertussisImmunizationActivityEClass, PertussisImmunizationActivity.class, "PertussisImmunizationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pertussisImmunizationActivityEClass, ecorePackage.getEBoolean(), "validatePertussisImmunizationActivityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pertussisImmunizationProductEClass, PertussisImmunizationProduct.class, "PertussisImmunizationProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
           new String[] 
           {
             "initializers", "org.openhealthtools.mdht.uml.cda.phcr.pertussis"
           });                                                                                                                                                                     
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  protected void createAnnotationAnnotations()
  {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (pertussisCaseReportEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisCaseReportTemplateId PertussisCaseReportTitle PertussisCaseReportPertussisClinicalInformationSection",
             "templateId.root", "2.16.840.1.113883.10.20.15.1.5",
             "title.mixed", "Public Health Case Report - Pertussis",
             "constraints.validation.warning", "PertussisCaseReportPertussisSocialHistorySection PertussisCaseReportPertussisTreatmentInformationSection PertussisCaseReportPertussisRelevantDxTestsSection PertussisCaseReportPertussisImmunizationsSection"
           });                             
        addAnnotation
          (pertussisSocialHistorySectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisSocialHistorySectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.24",
             "constraints.validation.info", "PertussisSocialHistorySectionPertussisPossibleExposureLocationAct PertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct"
           });              
        addAnnotation
          (pertussisPossibleExposureLocationActEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisPossibleExposureLocationActTemplateId PertussisPossibleExposureLocationActClassCode PertussisPossibleExposureLocationActCode PertussisPossibleExposureLocationActCodeP PertussisPossibleExposureLocationActMoodCode PertussisPossibleExposureLocationActStatusCode PertussisPossibleExposureLocationActStatusCodeP",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.63",
             "classCode", "ACT",
             "code.code", "413350009",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Finding with explicit context",
             "constraints.validation.dependOn.PertussisPossibleExposureLocationActCode", "PertussisPossibleExposureLocationActCodeP",
             "moodCode", "EVN",
             "statusCode.code", "completed"
           });                          
        addAnnotation
          (pertussisPossibleCaseContactLocationActEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisPossibleCaseContactLocationActTemplateId PertussisPossibleCaseContactLocationActClassCode PertussisPossibleCaseContactLocationActCode PertussisPossibleCaseContactLocationActCodeP PertussisPossibleCaseContactLocationActMoodCode PertussisPossibleCaseContactLocationActStatusCode PertussisPossibleCaseContactLocationActStatusCodeP",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.64",
             "classCode", "ACT",
             "code.code", "413350009",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Finding with explicit context",
             "constraints.validation.dependOn.PertussisPossibleCaseContactLocationActCode", "PertussisPossibleCaseContactLocationActCodeP",
             "moodCode", "EVN",
             "statusCode.code", "completed"
           });                          
        addAnnotation
          (pertussisClinicalInformationSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisClinicalInformationSectionTemplateId PertussisClinicalInformationSectionPertussisCaseObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.25"
           });          
        addAnnotation
          (pertussisCaseObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisCaseObservationTemplateId PertussisCaseObservationValue PertussisCaseObservationValueP",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.65",
             "value.code", "27836007",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "value.displayName", "Pertussis",
             "constraints.validation.dependOn.PertussisCaseObservationValue", "PertussisCaseObservationValueP",
             "constraints.validation.warning", "PertussisCaseObservationPertussisSignsAndSymptomsObservation"
           });                
        addAnnotation
          (pertussisSignsAndSymptomsObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisSignsAndSymptomsObservationTemplateId PertussisSignsAndSymptomsObservationValue PertussisSignsAndSymptomsObservationValueP",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.66",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.PertussisSignsAndSymptomsObservationValue", "PertussisSignsAndSymptomsObservationValueP"
           });            
        addAnnotation
          (pertussisTreatmentInformationSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisTreatmentInformationSectionTemplateId PertussisTreatmentInformationSectionPertussisTherapeuticRegimen",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.26"
           });          
        addAnnotation
          (pertussisTherapeuticRegimenActEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisTherapeuticRegimenActTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.67",
             "constraints.validation.warning", "PertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration",
             "constraints.validation.info", "PertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration"
           });              
        addAnnotation
          (pertussisTreatmentGivenSubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisTreatmentGivenSubstanceAdministrationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.68"
           });      
        addAnnotation
          (pertussisTreatmentNotGivenSubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisTreatmentNotGivenSubstanceAdministrationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.69"
           });      
        addAnnotation
          (pertussisRelevantDxTestsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisRelevantDxTestsSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.27",
             "constraints.validation.warning", "PertussisRelevantDxTestsSectionPertussisResultObservation",
             "constraints.validation.info", "PertussisRelevantDxTestsSectionPertussisResultOrganizer"
           });              
        addAnnotation
          (pertussisResultObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisResultObservationTemplateId PertussisResultObservationCode PertussisResultObservationCodeP",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.71",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "constraints.validation.dependOn.PertussisResultObservationCode", "PertussisResultObservationCodeP"
           });            
        addAnnotation
          (pertussisResultOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisResultOrganizerTemplateId PertussisResultOrganizerCode PertussisResultOrganizerPertussisResultObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.70"
           });             
        addAnnotation
          (pertussisImmunizationsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisImmunizationsSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.28",
             "constraints.validation.warning", "PertussisImmunizationsSectionPertussisImmunizationActivity"
           });          
        addAnnotation
          (pertussisImmunizationActivityEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisImmunizationActivityTemplateId PertussisImmunizationActivityMoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.72"
           });         
        addAnnotation
          (pertussisImmunizationProductEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PertussisImmunizationProductTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.73"
           }); 
    }

  /**
     * Initializes the annotations for <b>duplicates</b>.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  protected void createDuplicatesAnnotations()
  {
        String source = "duplicates";       
        addAnnotation
          (pertussisCaseReportEClass, 
           source, 
           new String[] 
           {
           });                             
        addAnnotation
          (pertussisSocialHistorySectionEClass, 
           source, 
           new String[] 
           {
           });                                                          
        addAnnotation
          (pertussisClinicalInformationSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (pertussisCaseObservationEClass, 
           source, 
           new String[] 
           {
           });                
        addAnnotation
          (pertussisSignsAndSymptomsObservationEClass, 
           source, 
           new String[] 
           {
           });            
        addAnnotation
          (pertussisTreatmentInformationSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (pertussisTherapeuticRegimenActEClass, 
           source, 
           new String[] 
           {
           });              
        addAnnotation
          (pertussisTreatmentGivenSubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
           });      
        addAnnotation
          (pertussisTreatmentNotGivenSubstanceAdministrationEClass, 
           source, 
           new String[] 
           {
           });      
        addAnnotation
          (pertussisRelevantDxTestsSectionEClass, 
           source, 
           new String[] 
           {
           });              
        addAnnotation
          (pertussisResultObservationEClass, 
           source, 
           new String[] 
           {
           });            
        addAnnotation
          (pertussisResultOrganizerEClass, 
           source, 
           new String[] 
           {
           });             
        addAnnotation
          (pertussisImmunizationsSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (pertussisImmunizationActivityEClass, 
           source, 
           new String[] 
           {
           });         
        addAnnotation
          (pertussisImmunizationProductEClass, 
           source, 
           new String[] 
           {
           });
    }

} //PertussisPackageImpl
