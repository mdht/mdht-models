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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxFactory;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.util.AnthraxValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnthraxPackageImpl extends EPackageImpl implements AnthraxPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxCaseReportEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxPhcrClinicalInformationSectionEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxCaseObservationEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxSignsAndSymptomsObservationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxPhcrRelevantDxTestsSectionEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxResultObservationEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxResultOrganizerEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxPhcrSocialHistorySectionEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxPossibleExpossureLocationAndTypeActEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxPhcrTreatmentInformationSectionEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxTherapeuticRegimenActEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxTreatmentGivenSubstanceAdministrationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass anthraxTreatmentNotGivenSubstanceAdministrationEClass = null;

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
   * @see org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private AnthraxPackageImpl() {
    super(eNS_URI, AnthraxFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AnthraxPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static AnthraxPackage init() {
    if (isInited) return (AnthraxPackage)EPackage.Registry.INSTANCE.getEPackage(AnthraxPackage.eNS_URI);

    // Obtain or create and register package
    AnthraxPackageImpl theAnthraxPackage = (AnthraxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnthraxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnthraxPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    PhcrPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAnthraxPackage.createPackageContents();

    // Initialize created meta-data
    theAnthraxPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theAnthraxPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return AnthraxValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theAnthraxPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AnthraxPackage.eNS_URI, theAnthraxPackage);
    return theAnthraxPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxCaseReport() {
    return anthraxCaseReportEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxPhcrClinicalInformationSection() {
    return anthraxPhcrClinicalInformationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxCaseObservation() {
    return anthraxCaseObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxSignsAndSymptomsObservation() {
    return anthraxSignsAndSymptomsObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxPhcrRelevantDxTestsSection() {
    return anthraxPhcrRelevantDxTestsSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxResultObservation() {
    return anthraxResultObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxResultOrganizer() {
    return anthraxResultOrganizerEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxPhcrSocialHistorySection() {
    return anthraxPhcrSocialHistorySectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxPossibleExpossureLocationAndTypeAct() {
    return anthraxPossibleExpossureLocationAndTypeActEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxPhcrTreatmentInformationSection() {
    return anthraxPhcrTreatmentInformationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxTherapeuticRegimenAct() {
    return anthraxTherapeuticRegimenActEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxTreatmentGivenSubstanceAdministration() {
    return anthraxTreatmentGivenSubstanceAdministrationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnthraxTreatmentNotGivenSubstanceAdministration() {
    return anthraxTreatmentNotGivenSubstanceAdministrationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxFactory getAnthraxFactory() {
    return (AnthraxFactory)getEFactoryInstance();
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
    anthraxCaseReportEClass = createEClass(ANTHRAX_CASE_REPORT);

    anthraxPhcrSocialHistorySectionEClass = createEClass(ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION);

    anthraxPossibleExpossureLocationAndTypeActEClass = createEClass(ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT);

    anthraxPhcrClinicalInformationSectionEClass = createEClass(ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION);

    anthraxCaseObservationEClass = createEClass(ANTHRAX_CASE_OBSERVATION);

    anthraxSignsAndSymptomsObservationEClass = createEClass(ANTHRAX_SIGNS_AND_SYMPTOMS_OBSERVATION);

    anthraxPhcrTreatmentInformationSectionEClass = createEClass(ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION);

    anthraxTherapeuticRegimenActEClass = createEClass(ANTHRAX_THERAPEUTIC_REGIMEN_ACT);

    anthraxTreatmentGivenSubstanceAdministrationEClass = createEClass(ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

    anthraxTreatmentNotGivenSubstanceAdministrationEClass = createEClass(ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);

    anthraxPhcrRelevantDxTestsSectionEClass = createEClass(ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION);

    anthraxResultOrganizerEClass = createEClass(ANTHRAX_RESULT_ORGANIZER);

    anthraxResultObservationEClass = createEClass(ANTHRAX_RESULT_OBSERVATION);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    anthraxCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
    anthraxPhcrSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
    anthraxPossibleExpossureLocationAndTypeActEClass.getESuperTypes().add(theCDAPackage.getAct());
    anthraxPhcrClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
    anthraxCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
    anthraxSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
    anthraxPhcrTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
    anthraxTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
    anthraxTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
    anthraxTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());
    anthraxPhcrRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
    anthraxResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
    anthraxResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());

    // Initialize classes and features; add operations and parameters
    initEClass(anthraxCaseReportEClass, AnthraxCaseReport.class, "AnthraxCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(anthraxCaseReportEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxCaseReportEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseReportAnthraxPhcrSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxCaseReportEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxCaseReportEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxCaseReportEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxCaseReportEClass, this.getAnthraxPhcrSocialHistorySection(), "getAnthraxPhcrSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(anthraxCaseReportEClass, this.getAnthraxPhcrClinicalInformationSection(), "getAnthraxPhcrClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(anthraxCaseReportEClass, this.getAnthraxPhcrTreatmentInformationSection(), "getAnthraxPhcrTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(anthraxCaseReportEClass, this.getAnthraxPhcrRelevantDxTestsSection(), "getAnthraxPhcrRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxPhcrSocialHistorySectionEClass, AnthraxPhcrSocialHistorySection.class, "AnthraxPhcrSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxPhcrSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxPhcrSocialHistorySectionEClass, this.getAnthraxPossibleExpossureLocationAndTypeAct(), "getAnthraxPossibleExpossureLocationAndTypeActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxPossibleExpossureLocationAndTypeActEClass, AnthraxPossibleExpossureLocationAndTypeAct.class, "AnthraxPossibleExpossureLocationAndTypeAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxPossibleExpossureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAnthraxPossibleExpossureLocationAndTypeActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxPossibleExpossureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAnthraxPossibleExpossureLocationAndTypeActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxPossibleExpossureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAnthraxPossibleExpossureLocationAndTypeActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxPossibleExpossureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAnthraxPossibleExpossureLocationAndTypeActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxPossibleExpossureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateAnthraxPossibleExpossureLocationAndTypeActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(anthraxPhcrClinicalInformationSectionEClass, AnthraxPhcrClinicalInformationSection.class, "AnthraxPhcrClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxPhcrClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxPhcrClinicalInformationSectionEClass, this.getAnthraxCaseObservation(), "getAnthraxCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxCaseObservationEClass, AnthraxCaseObservation.class, "AnthraxCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxCaseObservationEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxCaseObservationEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxCaseObservationEClass, ecorePackage.getEBoolean(), "validateAnthraxCaseObservationAnthraxSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxCaseObservationEClass, this.getAnthraxSignsAndSymptomsObservation(), "getAnthraxSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxSignsAndSymptomsObservationEClass, AnthraxSignsAndSymptomsObservation.class, "AnthraxSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validateAnthraxSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(anthraxPhcrTreatmentInformationSectionEClass, AnthraxPhcrTreatmentInformationSection.class, "AnthraxPhcrTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxPhcrTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxPhcrTreatmentInformationSectionEClass, this.getAnthraxTherapeuticRegimenAct(), "getAnthraxTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxTherapeuticRegimenActEClass, AnthraxTherapeuticRegimenAct.class, "AnthraxTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxTherapeuticRegimenActEClass, this.getAnthraxTreatmentGivenSubstanceAdministration(), "getAnthraxTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(anthraxTherapeuticRegimenActEClass, this.getAnthraxTreatmentNotGivenSubstanceAdministration(), "getAnthraxTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxTreatmentGivenSubstanceAdministrationEClass, AnthraxTreatmentGivenSubstanceAdministration.class, "AnthraxTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anthraxTreatmentNotGivenSubstanceAdministrationEClass, AnthraxTreatmentNotGivenSubstanceAdministration.class, "AnthraxTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anthraxPhcrRelevantDxTestsSectionEClass, AnthraxPhcrRelevantDxTestsSection.class, "AnthraxPhcrRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxPhcrRelevantDxTestsSectionEClass, this.getAnthraxResultOrganizer(), "getAnthraxResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(anthraxPhcrRelevantDxTestsSectionEClass, this.getAnthraxResultObservation(), "getAnthraxResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxResultOrganizerEClass, AnthraxResultOrganizer.class, "AnthraxResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxResultOrganizerEClass, ecorePackage.getEBoolean(), "validateAnthraxResultOrganizerCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxResultOrganizerEClass, ecorePackage.getEBoolean(), "validateAnthraxResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxResultOrganizerEClass, ecorePackage.getEBoolean(), "validateAnthraxResultOrganizerAnthraxResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(anthraxResultOrganizerEClass, this.getAnthraxResultObservation(), "getAnthraxResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(anthraxResultObservationEClass, AnthraxResultObservation.class, "AnthraxResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(anthraxResultObservationEClass, ecorePackage.getEBoolean(), "validateAnthraxResultObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(anthraxResultObservationEClass, ecorePackage.getEBoolean(), "validateAnthraxResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
       "initializers", "org.openhealthtools.mdht.uml.cda.phcr.anthrax"
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
      (anthraxCaseReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxCaseReportTemplateId AnthraxCaseReportTitle AnthraxCaseReportAnthraxPhcrClinicalInformationSection",
       "templateId.root", "2.16.840.1.113883.10.20.15.1.3",
       "title.mixed", "Public Health Case Report - Anthrax",
       "constraints.validation.warning", "AnthraxCaseReportAnthraxPhcrSocialHistorySection AnthraxCaseReportAnthraxPhcrTreatmentInformationSection AnthraxCaseReportAnthraxPhcrRelevantDxTestsSection"
       });																															
    addAnnotation
      (anthraxPhcrSocialHistorySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxPhcrSocialHistorySectionTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.17",
       "constraints.validation.info", "AnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct"
       });									
    addAnnotation
      (anthraxPossibleExpossureLocationAndTypeActEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxPossibleExpossureLocationAndTypeActTemplateId AnthraxPossibleExpossureLocationAndTypeActClassCode AnthraxPossibleExpossureLocationAndTypeActMoodCode AnthraxPossibleExpossureLocationAndTypeActCode AnthraxPossibleExpossureLocationAndTypeActStatusCode",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.41",
       "classCode", "ACT",
       "moodCode", "EVN",
       "code.code", "413350009",
       "code.codeSystem", "2.16.840.1.113883.6.96",
       "code.codeSystemName", "SNOMEDCT",
       "code.displayName", "Finding with explicit context",
       "statusCode.code", "completed"
       });																						
    addAnnotation
      (anthraxPhcrClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxPhcrClinicalInformationSectionTemplateId AnthraxPhcrClinicalInformationSectionAnthraxCaseObservation",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.15"
       });									
    addAnnotation
      (anthraxCaseObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxCaseObservationTemplateId AnthraxCaseObservationValue AnthraxCaseObservationValueP",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.36",
       "value.codeSystem", "2.16.840.1.113883.6.96",
       "value.codeSystemName", "SNOMEDCT",
       "constraints.validation.dependOn.AnthraxCaseObservationValue", "AnthraxCaseObservationValueP",
       "constraints.validation.warning", "AnthraxCaseObservationAnthraxSignsAndSymptomsObservation"
       });																	
    addAnnotation
      (anthraxSignsAndSymptomsObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxSignsAndSymptomsObservationTemplateId AnthraxSignsAndSymptomsObservationValue",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.35"
       });							
    addAnnotation
      (anthraxPhcrTreatmentInformationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxPhcrTreatmentInformationSectionTemplateId AnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.14"
       });									
    addAnnotation
      (anthraxTherapeuticRegimenActEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxTherapeuticRegimenActTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.37",
       "constraints.validation.warning", "AnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration",
       "constraints.validation.info", "AnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration"
       });															
    addAnnotation
      (anthraxTreatmentGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxTreatmentGivenSubstanceAdministrationTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.38"
       });			
    addAnnotation
      (anthraxTreatmentNotGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxTreatmentNotGivenSubstanceAdministrationTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.56"
       });			
    addAnnotation
      (anthraxPhcrRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxPhcrRelevantDxTestsSectionTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.16",
       "constraints.validation.info", "AnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer",
       "constraints.validation.warning", "AnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation"
       });															
    addAnnotation
      (anthraxResultOrganizerEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxResultOrganizerTemplateId AnthraxResultOrganizerCode AnthraxResultOrganizerCodeP AnthraxResultOrganizerAnthraxResultObservation",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.40",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.AnthraxResultOrganizerCode", "AnthraxResultOrganizerCodeP"
       });																	
    addAnnotation
      (anthraxResultObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AnthraxResultObservationTemplateId AnthraxResultObservationCode AnthraxResultObservationCodeP",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.39",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.AnthraxResultObservationCode", "AnthraxResultObservationCodeP"
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
      (anthraxCaseReportEClass, 
       source, 
       new String[] 
       {
       });																															
    addAnnotation
      (anthraxPhcrSocialHistorySectionEClass, 
       source, 
       new String[] 
       {
       });																														
    addAnnotation
      (anthraxPhcrClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       });									
    addAnnotation
      (anthraxCaseObservationEClass, 
       source, 
       new String[] 
       {
       });																	
    addAnnotation
      (anthraxSignsAndSymptomsObservationEClass, 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (anthraxPhcrTreatmentInformationSectionEClass, 
       source, 
       new String[] 
       {
       });									
    addAnnotation
      (anthraxTherapeuticRegimenActEClass, 
       source, 
       new String[] 
       {
       });															
    addAnnotation
      (anthraxTreatmentGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (anthraxTreatmentNotGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (anthraxPhcrRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       });															
    addAnnotation
      (anthraxResultOrganizerEClass, 
       source, 
       new String[] 
       {
       });																	
    addAnnotation
      (anthraxResultObservationEClass, 
       source, 
       new String[] 
       {
       });								
  }

} //AnthraxPackageImpl
