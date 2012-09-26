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
package org.openhealthtools.mdht.uml.cda.phcr.tss.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tss.util.tssValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tssPackageImpl extends EPackageImpl implements tssPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass toxicShockSyndromeCaseReportEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass tssPhcrClinicalInformationSectionEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass tssCaseObservationEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass tssSignsAndSymptomsObservationEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass tssPhcrRelevantDxTestsSectionEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass tssResultOrganizerEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass tssResultObservationEClass = null;

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
   * @see org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private tssPackageImpl() {
    super(eNS_URI, tssFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link tssPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static tssPackage init() {
    if (isInited) return (tssPackage)EPackage.Registry.INSTANCE.getEPackage(tssPackage.eNS_URI);

    // Obtain or create and register package
    tssPackageImpl thetssPackage = (tssPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tssPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tssPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    PhcrPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    thetssPackage.createPackageContents();

    // Initialize created meta-data
    thetssPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (thetssPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return tssValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    thetssPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(tssPackage.eNS_URI, thetssPackage);
    return thetssPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getToxicShockSyndromeCaseReport() {
    return toxicShockSyndromeCaseReportEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTssPhcrClinicalInformationSection() {
    return tssPhcrClinicalInformationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTssCaseObservation() {
    return tssCaseObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTssSignsAndSymptomsObservation() {
    return tssSignsAndSymptomsObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTssPhcrRelevantDxTestsSection() {
    return tssPhcrRelevantDxTestsSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTssResultOrganizer() {
    return tssResultOrganizerEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTssResultObservation() {
    return tssResultObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public tssFactory gettssFactory() {
    return (tssFactory)getEFactoryInstance();
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
    toxicShockSyndromeCaseReportEClass = createEClass(TOXIC_SHOCK_SYNDROME_CASE_REPORT);

    tssPhcrClinicalInformationSectionEClass = createEClass(TSS_PHCR_CLINICAL_INFORMATION_SECTION);

    tssCaseObservationEClass = createEClass(TSS_CASE_OBSERVATION);

    tssSignsAndSymptomsObservationEClass = createEClass(TSS_SIGNS_AND_SYMPTOMS_OBSERVATION);

    tssPhcrRelevantDxTestsSectionEClass = createEClass(TSS_PHCR_RELEVANT_DX_TESTS_SECTION);

    tssResultOrganizerEClass = createEClass(TSS_RESULT_ORGANIZER);

    tssResultObservationEClass = createEClass(TSS_RESULT_OBSERVATION);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    toxicShockSyndromeCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
    tssPhcrClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
    tssCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
    tssSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
    tssPhcrRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
    tssResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
    tssResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());

    // Initialize classes and features; add operations and parameters
    initEClass(toxicShockSyndromeCaseReportEClass, ToxicShockSyndromeCaseReport.class, "ToxicShockSyndromeCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(toxicShockSyndromeCaseReportEClass, ecorePackage.getEBoolean(), "validateToxicShockSyndromeCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(toxicShockSyndromeCaseReportEClass, ecorePackage.getEBoolean(), "validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(toxicShockSyndromeCaseReportEClass, ecorePackage.getEBoolean(), "validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(toxicShockSyndromeCaseReportEClass, this.getTssPhcrClinicalInformationSection(), "getTssPhcrClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(toxicShockSyndromeCaseReportEClass, this.getTssPhcrRelevantDxTestsSection(), "getTssPhcrRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(tssPhcrClinicalInformationSectionEClass, TssPhcrClinicalInformationSection.class, "TssPhcrClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(tssPhcrClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateTssPhcrClinicalInformationSectionTssCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(tssPhcrClinicalInformationSectionEClass, this.getTssCaseObservation(), "getTssCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(tssCaseObservationEClass, TssCaseObservation.class, "TssCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(tssCaseObservationEClass, ecorePackage.getEBoolean(), "validateTssCaseObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tssCaseObservationEClass, ecorePackage.getEBoolean(), "validateTssCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tssCaseObservationEClass, ecorePackage.getEBoolean(), "validateTssCaseObservationTssSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(tssCaseObservationEClass, this.getTssSignsAndSymptomsObservation(), "getTssSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(tssSignsAndSymptomsObservationEClass, TssSignsAndSymptomsObservation.class, "TssSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(tssSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validateTssSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(tssPhcrRelevantDxTestsSectionEClass, TssPhcrRelevantDxTestsSection.class, "TssPhcrRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(tssPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateTssPhcrRelevantDxTestsSectionTssResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tssPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateTssPhcrRelevantDxTestsSectionTssResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(tssPhcrRelevantDxTestsSectionEClass, this.getTssResultOrganizer(), "getTssResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(tssPhcrRelevantDxTestsSectionEClass, this.getTssResultObservation(), "getTssResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(tssResultOrganizerEClass, TssResultOrganizer.class, "TssResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(tssResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTssResultOrganizerCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tssResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTssResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tssResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTssResultOrganizerTssResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(tssResultOrganizerEClass, this.getTssResultObservation(), "getTssResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(tssResultObservationEClass, TssResultObservation.class, "TssResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(tssResultObservationEClass, ecorePackage.getEBoolean(), "validateTssResultObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tssResultObservationEClass, ecorePackage.getEBoolean(), "validateTssResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
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
       "initializers", "org.openhealthtools.mdht.uml.cda.phcr.tss"
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
      (toxicShockSyndromeCaseReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ToxicShockSyndromeCaseReportTemplateId ToxicShockSyndromeCaseReportTitle ToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection",
       "templateId.root", "2.16.840.1.113883.10.20.15.1.6",
       "title.mixed", "Public Health Case Report - Toxic Shock Syndrome",
       "constraints.validation.warning", "ToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection"
       });																			
    addAnnotation
      (tssPhcrClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TssPhcrClinicalInformationSectionTemplateId TssPhcrClinicalInformationSectionTssCaseObservation",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.42"
       });									
    addAnnotation
      (tssCaseObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TssCaseObservationTemplateId TssCaseObservationValue TssCaseObservationValueP",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.99",
       "value.code", "240450004",
       "value.codeSystem", "2.16.840.1.113883.6.96",
       "value.codeSystemName", "SNOMEDCT",
       "constraints.validation.dependOn.TssCaseObservationValue", "TssCaseObservationValueP",
       "constraints.validation.warning", "TssCaseObservationTssSignsAndSymptomsObservation"
       });																	
    addAnnotation
      (tssSignsAndSymptomsObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TssSignsAndSymptomsObservationTemplateId TssSignsAndSymptomsObservationValue",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.100"
       });							
    addAnnotation
      (tssPhcrRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TssPhcrRelevantDxTestsSectionTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.43",
       "constraints.validation.info", "TssPhcrRelevantDxTestsSectionTssResultOrganizer",
       "constraints.validation.warning", "TssPhcrRelevantDxTestsSectionTssResultObservation"
       });															
    addAnnotation
      (tssResultOrganizerEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TssResultOrganizerTemplateId TssResultOrganizerCode TssResultOrganizerCodeP TssResultOrganizerTssResultObservation",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.101",
       "code.codeSystemName", "",
       "constraints.validation.dependOn.TssResultOrganizerCode", "TssResultOrganizerCodeP"
       });																	
    addAnnotation
      (tssResultObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "TssResultObservationTemplateId TssResultObservationCode TssResultObservationCodeP",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.102",
       "code.codeSystemName", "",
       "constraints.validation.dependOn.TssResultObservationCode", "TssResultObservationCodeP"
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
      (toxicShockSyndromeCaseReportEClass, 
       source, 
       new String[] 
       {
       });																			
    addAnnotation
      (tssPhcrClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       });									
    addAnnotation
      (tssCaseObservationEClass, 
       source, 
       new String[] 
       {
       });																	
    addAnnotation
      (tssSignsAndSymptomsObservationEClass, 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (tssPhcrRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       });															
    addAnnotation
      (tssResultOrganizerEClass, 
       source, 
       new String[] 
       {
       });																	
    addAnnotation
      (tssResultObservationEClass, 
       source, 
       new String[] 
       {
       });								
  }

} //tssPackageImpl
