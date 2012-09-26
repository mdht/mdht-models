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
package org.openhealthtools.mdht.uml.cda.phcr.hib.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;



import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibSignsAndSymptoms;
import org.openhealthtools.mdht.uml.cda.phcr.hib.util.HibValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HibPackageImpl extends EPackageImpl implements HibPackage
{
  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass hibCaseReportEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hibPhcrClinicalInformationSectionEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hibCaseObservationEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hibSignsAndSymptomsEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hibPhcrRelevantDxTestsSectionEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hibResultObservationEClass = null;

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hibResultOrganizerEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage#eNS_URI
     * @see #init()
     * @generated
     */
  private HibPackageImpl()
  {
        super(eNS_URI, HibFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link HibPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
  public static HibPackage init()
  {
        if (isInited) return (HibPackage)EPackage.Registry.INSTANCE.getEPackage(HibPackage.eNS_URI);

        // Obtain or create and register package
        HibPackageImpl theHibPackage = (HibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HibPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PhcrPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theHibPackage.createPackageContents();

        // Initialize created meta-data
        theHibPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theHibPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return HibValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theHibPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.phcr.hib", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theHibPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(HibPackage.eNS_URI, theHibPackage);
        return theHibPackage;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getHIBCaseReport()
  {
        return hibCaseReportEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHibPhcrClinicalInformationSection() {
        return hibPhcrClinicalInformationSectionEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHibCaseObservation() {
        return hibCaseObservationEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHibSignsAndSymptoms() {
        return hibSignsAndSymptomsEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHibPhcrRelevantDxTestsSection() {
        return hibPhcrRelevantDxTestsSectionEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHibResultObservation() {
        return hibResultObservationEClass;
    }

		/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHibResultOrganizer() {
        return hibResultOrganizerEClass;
    }

		/**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public HibFactory getHibFactory()
  {
        return (HibFactory)getEFactoryInstance();
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
        hibCaseReportEClass = createEClass(HIB_CASE_REPORT);

        hibPhcrClinicalInformationSectionEClass = createEClass(HIB_PHCR_CLINICAL_INFORMATION_SECTION);

        hibCaseObservationEClass = createEClass(HIB_CASE_OBSERVATION);

        hibSignsAndSymptomsEClass = createEClass(HIB_SIGNS_AND_SYMPTOMS);

        hibPhcrRelevantDxTestsSectionEClass = createEClass(HIB_PHCR_RELEVANT_DX_TESTS_SECTION);

        hibResultObservationEClass = createEClass(HIB_RESULT_OBSERVATION);

        hibResultOrganizerEClass = createEClass(HIB_RESULT_ORGANIZER);
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
        hibCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
        hibPhcrClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
        hibCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
        hibSignsAndSymptomsEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
        hibPhcrRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
        hibResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
        hibResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());

        // Initialize classes and features; add operations and parameters
        initEClass(hibCaseReportEClass, HIBCaseReport.class, "HIBCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(hibCaseReportEClass, ecorePackage.getEBoolean(), "validateHIBCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hibCaseReportEClass, ecorePackage.getEBoolean(), "validateHIBCaseReportHibPhcrClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hibCaseReportEClass, ecorePackage.getEBoolean(), "validateHIBCaseReportHibPhcrRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hibCaseReportEClass, this.getHibPhcrClinicalInformationSection(), "getHibPhcrClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hibCaseReportEClass, this.getHibPhcrRelevantDxTestsSection(), "getHibPhcrRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hibPhcrClinicalInformationSectionEClass, HibPhcrClinicalInformationSection.class, "HibPhcrClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hibPhcrClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateHibPhcrClinicalInformationSectionHibCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hibPhcrClinicalInformationSectionEClass, this.getHibCaseObservation(), "getHibCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hibCaseObservationEClass, HibCaseObservation.class, "HibCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hibCaseObservationEClass, ecorePackage.getEBoolean(), "validateHibCaseObservationHibSignsAndSymptoms", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hibCaseObservationEClass, this.getHibSignsAndSymptoms(), "getHibSignsAndSymptomss", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hibSignsAndSymptomsEClass, HibSignsAndSymptoms.class, "HibSignsAndSymptoms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hibPhcrRelevantDxTestsSectionEClass, HibPhcrRelevantDxTestsSection.class, "HibPhcrRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hibPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateHibPhcrRelevantDxTestsSectionHibResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(hibPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateHibPhcrRelevantDxTestsSectionHibResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hibPhcrRelevantDxTestsSectionEClass, this.getHibResultObservation(), "getHibResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(hibPhcrRelevantDxTestsSectionEClass, this.getHibResultOrganizer(), "getHibResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(hibResultObservationEClass, HibResultObservation.class, "HibResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hibResultOrganizerEClass, HibResultOrganizer.class, "HibResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(hibResultOrganizerEClass, ecorePackage.getEBoolean(), "validateHibResultOrganizerHibResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(hibResultOrganizerEClass, this.getHibResultObservation(), "getHibResultObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
    protected void createUmlAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml";     
        addAnnotation
          (this, 
           source, 
           new String[] {
             "initializers", "org.openhealthtools.mdht.uml.cda.hib"
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
          (hibCaseReportEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HIBCaseReportTemplateId HIBCaseReportTitle HIBCaseReportHibPhcrClinicalInformationSection ",
             "templateId.root", "2.16.840.1.113883.10.20.15.1.14",
             "title.mixed", "Public Health Case Report - Haemophilus Influenzae Type B",
             "constraints.validation.warning", "HIBCaseReportHibPhcrRelevantDxTestsSection"
           });                      
        addAnnotation
          (hibPhcrClinicalInformationSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HibPhcrClinicalInformationSection TemplateId HibPhcrClinicalInformationSection HibCaseObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.57"
           });            
        addAnnotation
          (hibCaseObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HibCaseObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.134",
             "constraints.validation.warning", "HibCaseObservationHibSignsAndSymptoms"
           });            
        addAnnotation
          (hibSignsAndSymptomsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HibSignsAndSymptomsTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.135"
           });      
        addAnnotation
          (hibPhcrRelevantDxTestsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HibPhcrRelevantDxTestsSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.2.58",
             "constraints.validation.warning", "HibPhcrRelevantDxTestsSectionHibResultObservation",
             "constraints.validation.info", "HibPhcrRelevantDxTestsSectionHibResultOrganizer"
           });                  
        addAnnotation
          (hibResultObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HibResultObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.137"
           });      
        addAnnotation
          (hibResultOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "HibResultOrganizerTemplateId HibResultOrganizerHibResultObservation",
             "templateId.root", "2.16.840.1.113883.10.20.15.3.136"
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
          (hibCaseReportEClass, 
           source, 
           new String[] {
           });                      
        addAnnotation
          (hibPhcrClinicalInformationSectionEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (hibCaseObservationEClass, 
           source, 
           new String[] {
           });            
        addAnnotation
          (hibSignsAndSymptomsEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (hibPhcrRelevantDxTestsSectionEClass, 
           source, 
           new String[] {
           });                  
        addAnnotation
          (hibResultObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (hibResultOrganizerEClass, 
           source, 
           new String[] {
           });      
    }

} //HibPackageImpl
