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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.util.WnvValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WnvPackageImpl extends EPackageImpl implements WnvPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass westNileVirusCaseReportEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wnvPhcrClinicalInformationSectionEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wnvCaseObservationEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wnvSignsAndSymptomsObservationEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wnvPhcrRelevantDxTestsSectionEClass = null;
  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass wnvResultOrganizerEClass = null;
		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass wnvResultObservationEClass = null;
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
   * @see org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WnvPackageImpl()
  {
    super(eNS_URI, WnvFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link WnvPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WnvPackage init()
  {
    if (isInited) return (WnvPackage)EPackage.Registry.INSTANCE.getEPackage(WnvPackage.eNS_URI);

    // Obtain or create and register package
    WnvPackageImpl theWnvPackage = (WnvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WnvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WnvPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    PhcrPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theWnvPackage.createPackageContents();

    // Initialize created meta-data
    theWnvPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theWnvPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return WnvValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theWnvPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WnvPackage.eNS_URI, theWnvPackage);
    return theWnvPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWestNileVirusCaseReport()
  {
    return westNileVirusCaseReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWnvPhcrClinicalInformationSection()
  {
    return wnvPhcrClinicalInformationSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWnvCaseObservation()
  {
    return wnvCaseObservationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWnvSignsAndSymptomsObservation()
  {
    return wnvSignsAndSymptomsObservationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWnvPhcrRelevantDxTestsSection()
  {
    return wnvPhcrRelevantDxTestsSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getWnvResultObservation() {
    return wnvResultObservationEClass;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getWnvResultOrganizer() {
    return wnvResultOrganizerEClass;
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WnvFactory getWnvFactory()
  {
    return (WnvFactory)getEFactoryInstance();
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
    westNileVirusCaseReportEClass = createEClass(WEST_NILE_VIRUS_CASE_REPORT);

    wnvPhcrClinicalInformationSectionEClass = createEClass(WNV_PHCR_CLINICAL_INFORMATION_SECTION);

    wnvCaseObservationEClass = createEClass(WNV_CASE_OBSERVATION);

    wnvSignsAndSymptomsObservationEClass = createEClass(WNV_SIGNS_AND_SYMPTOMS_OBSERVATION);

    wnvPhcrRelevantDxTestsSectionEClass = createEClass(WNV_PHCR_RELEVANT_DX_TESTS_SECTION);

    wnvResultObservationEClass = createEClass(WNV_RESULT_OBSERVATION);

    wnvResultOrganizerEClass = createEClass(WNV_RESULT_ORGANIZER);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    westNileVirusCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
    wnvPhcrClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
    wnvCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
    wnvSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
    wnvPhcrRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
    wnvResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
    wnvResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());

    // Initialize classes and features; add operations and parameters
    initEClass(westNileVirusCaseReportEClass, WestNileVirusCaseReport.class, "WestNileVirusCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(westNileVirusCaseReportEClass, ecorePackage.getEBoolean(), "validateWestNileVirusCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(westNileVirusCaseReportEClass, ecorePackage.getEBoolean(), "validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(westNileVirusCaseReportEClass, ecorePackage.getEBoolean(), "validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(westNileVirusCaseReportEClass, this.getWnvPhcrClinicalInformationSection(), "getWnvPhcrClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(westNileVirusCaseReportEClass, this.getWnvPhcrRelevantDxTestsSection(), "getWnvPhcrRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(wnvPhcrClinicalInformationSectionEClass, WnvPhcrClinicalInformationSection.class, "WnvPhcrClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(wnvPhcrClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateWnvPhcrClinicalInformationSectionWnvCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(wnvPhcrClinicalInformationSectionEClass, this.getWnvCaseObservation(), "getWnvCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(wnvCaseObservationEClass, WnvCaseObservation.class, "WnvCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(wnvCaseObservationEClass, ecorePackage.getEBoolean(), "validateWnvCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(wnvCaseObservationEClass, ecorePackage.getEBoolean(), "validateWnvCaseObservationWnvSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(wnvCaseObservationEClass, this.getWnvSignsAndSymptomsObservation(), "getWnvSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(wnvSignsAndSymptomsObservationEClass, WnvSignsAndSymptomsObservation.class, "WnvSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(wnvSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validateWnvSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(wnvPhcrRelevantDxTestsSectionEClass, WnvPhcrRelevantDxTestsSection.class, "WnvPhcrRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(wnvPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateWnvPhcrRelevantDxTestsSectionWnvResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(wnvPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(wnvPhcrRelevantDxTestsSectionEClass, this.getWnvResultObservation(), "getWnvResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(wnvPhcrRelevantDxTestsSectionEClass, this.getWnvResultOrganizer(), "getWnvResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(wnvResultObservationEClass, WnvResultObservation.class, "WnvResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(wnvResultObservationEClass, ecorePackage.getEBoolean(), "validateWnvResultObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(wnvResultObservationEClass, ecorePackage.getEBoolean(), "validateWnvResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(wnvResultOrganizerEClass, WnvResultOrganizer.class, "WnvResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(wnvResultOrganizerEClass, ecorePackage.getEBoolean(), "validateWnvResultOrganizerCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(wnvResultOrganizerEClass, ecorePackage.getEBoolean(), "validateWnvResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(wnvResultOrganizerEClass, ecorePackage.getEBoolean(), "validateWnvResultOrganizerWnvResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(wnvResultOrganizerEClass, this.getWnvResultObservation(), "getWnvResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

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
       "initializers", "org.openhealthtools.mdht.uml.cda.phcr.wnv"
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
      (westNileVirusCaseReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WestNileVirusCaseReportTemplateId WestNileVirusCaseReportTitle WestNileVirusCaseReportWnvPhcrClinicalInformationSection",
       "templateId.root", "2.16.840.1.113883.10.20.15.1.7",
       "title.mixed", "Public Health Case Report - West Nile Virus",
       "constraints.validation.warning", "WestNileVirusCaseReportWnvPhcrRelevantDxTestsSection"
       });																			
    addAnnotation
      (wnvPhcrClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WnvPhcrClinicalInformationSectionTemplateId WnvPhcrClinicalInformationSectionWnvCaseObservation",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.45"
       });									
    addAnnotation
      (wnvCaseObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WnvCaseObservationTemplateId WnvCaseObservationValue",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.103",
       "constraints.validation.warning", "WnvCaseObservationWnvSignsAndSymptomsObservation"
       });													
    addAnnotation
      (wnvSignsAndSymptomsObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WnvSignsAndSymptomsObservationTemplateId WnvSignsAndSymptomsObservationValue",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.104"
       });							
    addAnnotation
      (wnvPhcrRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WnvPhcrRelevantDxTestsSectionTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.46",
       "constraints.validation.warning", "WnvPhcrRelevantDxTestsSectionWnvResultObservation",
       "constraints.validation.info", "WnvPhcrRelevantDxTestsSectionWnvResultOrganizer"
       });															
    addAnnotation
      (wnvResultObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WnvResultObservationTemplateId WnvResultObservationCode WnvResultObservationCodeP",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.106",
       "code.codeSystemName", "",
       "constraints.validation.dependOn.WnvResultObservationCode", "WnvResultObservationCodeP"
       });											
    addAnnotation
      (wnvResultOrganizerEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WnvResultOrganizerTemplateId WnvResultOrganizerCode WnvResultOrganizerCodeP WnvResultOrganizerWnvResultObservation",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.105",
       "code.codeSystemName", "",
       "constraints.validation.dependOn.WnvResultOrganizerCode", "WnvResultOrganizerCodeP"
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
      (westNileVirusCaseReportEClass, 
       source, 
       new String[] 
       {
       });																			
    addAnnotation
      (wnvPhcrClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       });									
    addAnnotation
      (wnvCaseObservationEClass, 
       source, 
       new String[] 
       {
       });													
    addAnnotation
      (wnvSignsAndSymptomsObservationEClass, 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (wnvPhcrRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       });															
    addAnnotation
      (wnvResultObservationEClass, 
       source, 
       new String[] 
       {
       });											
    addAnnotation
      (wnvResultOrganizerEClass, 
       source, 
       new String[] 
       {
       });														
  }

} //WnvPackageImpl
