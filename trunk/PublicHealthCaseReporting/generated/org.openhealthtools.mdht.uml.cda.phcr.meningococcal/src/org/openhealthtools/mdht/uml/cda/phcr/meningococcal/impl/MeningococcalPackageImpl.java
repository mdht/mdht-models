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
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;



import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalFactory;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.util.MeningococcalValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeningococcalPackageImpl extends EPackageImpl implements MeningococcalPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass meningococcalCaseReportEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meningococcalPhcrClinicalInformationSectionEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meningococcalCaseObservationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meningococcalSignsAndSymptomsObservationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meningococcalPhcrRelevantDxTestsSectionEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meningococcalResultObservationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meningococcalResultOrganizerEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private MeningococcalPackageImpl()
  {
		super(eNS_URI, MeningococcalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeningococcalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static MeningococcalPackage init()
  {
		if (isInited) return (MeningococcalPackage)EPackage.Registry.INSTANCE.getEPackage(MeningococcalPackage.eNS_URI);

		// Obtain or create and register package
		MeningococcalPackageImpl theMeningococcalPackage = (MeningococcalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeningococcalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeningococcalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PhcrPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMeningococcalPackage.createPackageContents();

		// Initialize created meta-data
		theMeningococcalPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMeningococcalPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MeningococcalValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMeningococcalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeningococcalPackage.eNS_URI, theMeningococcalPackage);
		return theMeningococcalPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMeningococcalCaseReport()
  {
		return meningococcalCaseReportEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeningococcalPhcrClinicalInformationSection() {
		return meningococcalPhcrClinicalInformationSectionEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeningococcalCaseObservation() {
		return meningococcalCaseObservationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeningococcalSignsAndSymptomsObservation() {
		return meningococcalSignsAndSymptomsObservationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeningococcalPhcrRelevantDxTestsSection() {
		return meningococcalPhcrRelevantDxTestsSectionEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeningococcalResultObservation() {
		return meningococcalResultObservationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeningococcalResultOrganizer() {
		return meningococcalResultOrganizerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MeningococcalFactory getMeningococcalFactory()
  {
		return (MeningococcalFactory)getEFactoryInstance();
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
		meningococcalCaseReportEClass = createEClass(MENINGOCOCCAL_CASE_REPORT);

		meningococcalPhcrClinicalInformationSectionEClass = createEClass(MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION);

		meningococcalCaseObservationEClass = createEClass(MENINGOCOCCAL_CASE_OBSERVATION);

		meningococcalSignsAndSymptomsObservationEClass = createEClass(MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION);

		meningococcalPhcrRelevantDxTestsSectionEClass = createEClass(MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION);

		meningococcalResultObservationEClass = createEClass(MENINGOCOCCAL_RESULT_OBSERVATION);

		meningococcalResultOrganizerEClass = createEClass(MENINGOCOCCAL_RESULT_ORGANIZER);
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
		meningococcalCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
		meningococcalPhcrClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
		meningococcalCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
		meningococcalSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
		meningococcalPhcrRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
		meningococcalResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
		meningococcalResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());

		// Initialize classes and features; add operations and parameters
		initEClass(meningococcalCaseReportEClass, MeningococcalCaseReport.class, "MeningococcalCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(meningococcalCaseReportEClass, ecorePackage.getEBoolean(), "validateMeningococcalCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(meningococcalCaseReportEClass, ecorePackage.getEBoolean(), "validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(meningococcalCaseReportEClass, ecorePackage.getEBoolean(), "validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meningococcalCaseReportEClass, this.getMeningococcalPhcrClinicalInformationSection(), "getMeningococcalPhcrClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(meningococcalCaseReportEClass, this.getMeningococcalPhcrRelevantDxTestsSection(), "getMeningococcalPhcrRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(meningococcalPhcrClinicalInformationSectionEClass, MeningococcalPhcrClinicalInformationSection.class, "MeningococcalPhcrClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(meningococcalPhcrClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meningococcalPhcrClinicalInformationSectionEClass, this.getMeningococcalCaseObservation(), "getMeningococcalCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(meningococcalCaseObservationEClass, MeningococcalCaseObservation.class, "MeningococcalCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(meningococcalCaseObservationEClass, ecorePackage.getEBoolean(), "validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meningococcalCaseObservationEClass, this.getMeningococcalSignsAndSymptomsObservation(), "getMeningococcalSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(meningococcalSignsAndSymptomsObservationEClass, MeningococcalSignsAndSymptomsObservation.class, "MeningococcalSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meningococcalPhcrRelevantDxTestsSectionEClass, MeningococcalPhcrRelevantDxTestsSection.class, "MeningococcalPhcrRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(meningococcalPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(meningococcalPhcrRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meningococcalPhcrRelevantDxTestsSectionEClass, this.getMeningococcalResultObservation(), "getMeningococcalResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(meningococcalPhcrRelevantDxTestsSectionEClass, this.getMeningococcalResultOrganizer(), "getMeningococcalResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(meningococcalResultObservationEClass, MeningococcalResultObservation.class, "MeningococcalResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meningococcalResultOrganizerEClass, MeningococcalResultOrganizer.class, "MeningococcalResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(meningococcalResultOrganizerEClass, this.getMeningococcalResultObservation(), "getMeningococcalResultObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
		  (meningococcalCaseReportEClass, 
		   source, 
		   new String[] {
			 "title.mixed", "Public Health Case Report - Meningococcal",
			 "templateId.root", "2.16.840.1.113883.10.20.15.1.15",
			 "constraints.validation.error", "MeningococcalCaseReportTemplateId MeningococcalCaseReportTitle MeningococcalCaseReportMeningococcalPhcrClinicalInformationSection",
			 "constraints.validation.warning", "MeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection"
		   });																			
		addAnnotation
		  (meningococcalPhcrClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.59",
			 "constraints.validation.error", "MeningococcalPhcrClinicalInformationSectionTemplateId MeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation"
		   });									
		addAnnotation
		  (meningococcalCaseObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.138",
			 "constraints.validation.error", "MeningococcalCaseObservationTemplateId",
			 "constraints.validation.warning", "MeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation"
		   });									
		addAnnotation
		  (meningococcalSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.139",
			 "constraints.validation.error", "MeningococcalSignsAndSymptomsObservationTemplateId"
		   });			
		addAnnotation
		  (meningococcalPhcrRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.60",
			 "constraints.validation.error", "MeningococcalPhcrRelevantDxTestsSectionTemplateId",
			 "constraints.validation.warning", "MeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation",
			 "constraints.validation.info", "MeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer"
		   });															
		addAnnotation
		  (meningococcalResultObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.141",
			 "constraints.validation.error", "MeningococcalResultObservationTemplateId"
		   });			
		addAnnotation
		  (meningococcalResultOrganizerEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.140",
			 "constraints.validation.error", "MeningococcalResultOrganizerTemplateId"
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
		  (meningococcalCaseReportEClass, 
		   source, 
		   new String[] {
		   });																			
		addAnnotation
		  (meningococcalPhcrClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (meningococcalCaseObservationEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (meningococcalSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (meningococcalPhcrRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (meningococcalResultObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (meningococcalResultOrganizerEClass, 
		   source, 
		   new String[] {
		   });		
	}

} //MeningococcalPackageImpl
