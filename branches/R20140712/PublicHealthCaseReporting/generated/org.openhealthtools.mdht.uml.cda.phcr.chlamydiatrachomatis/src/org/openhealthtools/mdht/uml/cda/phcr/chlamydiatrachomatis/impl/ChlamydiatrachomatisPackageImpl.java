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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChlamydiatrachomatisPackageImpl extends EPackageImpl implements ChlamydiatrachomatisPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisPublicHealthCaseReportEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisPHCRClinicalInformationSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisCaseObservationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisResultObservationEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisResultOrganizerEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisPHCRTreatmentInformationSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisTherapeuticRegimenActEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisTreatmentGivenSubstanceAdministrationEClass = null;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass chlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationEClass = null;

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
   * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private ChlamydiatrachomatisPackageImpl() {
    super(eNS_URI, ChlamydiatrachomatisFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ChlamydiatrachomatisPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static ChlamydiatrachomatisPackage init() {
    if (isInited) return (ChlamydiatrachomatisPackage)EPackage.Registry.INSTANCE.getEPackage(ChlamydiatrachomatisPackage.eNS_URI);

    // Obtain or create and register package
    ChlamydiatrachomatisPackageImpl theChlamydiatrachomatisPackage = (ChlamydiatrachomatisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChlamydiatrachomatisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChlamydiatrachomatisPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    PhcrPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theChlamydiatrachomatisPackage.createPackageContents();

    // Initialize created meta-data
    theChlamydiatrachomatisPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theChlamydiatrachomatisPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return ChlamydiatrachomatisValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theChlamydiatrachomatisPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ChlamydiatrachomatisPackage.eNS_URI, theChlamydiatrachomatisPackage);
    return theChlamydiatrachomatisPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisPublicHealthCaseReport() {
    return chlamydiatrachomatisPublicHealthCaseReportEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisPHCRClinicalInformationSection() {
    return chlamydiatrachomatisPHCRClinicalInformationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisCaseObservation() {
    return chlamydiatrachomatisCaseObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisPHCRRelevantDxTestsSection() {
    return chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisResultObservation() {
    return chlamydiatrachomatisResultObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getchlamydiatrachomatisResultOrganizer() {
    return chlamydiatrachomatisResultOrganizerEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisPHCRTreatmentInformationSection() {
    return chlamydiatrachomatisPHCRTreatmentInformationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisTherapeuticRegimenAct() {
    return chlamydiatrachomatisTherapeuticRegimenActEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisTreatmentGivenSubstanceAdministration() {
    return chlamydiatrachomatisTreatmentGivenSubstanceAdministrationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration() {
    return chlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChlamydiatrachomatisFactory getChlamydiatrachomatisFactory() {
    return (ChlamydiatrachomatisFactory)getEFactoryInstance();
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
    chlamydiatrachomatisPublicHealthCaseReportEClass = createEClass(CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT);

    chlamydiatrachomatisPHCRClinicalInformationSectionEClass = createEClass(CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION);

    chlamydiatrachomatisCaseObservationEClass = createEClass(CHLAMYDIATRACHOMATIS_CASE_OBSERVATION);

    chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass = createEClass(CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION);

    chlamydiatrachomatisResultObservationEClass = createEClass(CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION);

    chlamydiatrachomatisResultOrganizerEClass = createEClass(CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER);

    chlamydiatrachomatisPHCRTreatmentInformationSectionEClass = createEClass(CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION);

    chlamydiatrachomatisTherapeuticRegimenActEClass = createEClass(CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT);

    chlamydiatrachomatisTreatmentGivenSubstanceAdministrationEClass = createEClass(CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

    chlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationEClass = createEClass(CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
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
    chlamydiatrachomatisPublicHealthCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
    chlamydiatrachomatisPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
    chlamydiatrachomatisCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
    chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
    chlamydiatrachomatisResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
    chlamydiatrachomatisResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
    chlamydiatrachomatisPHCRTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
    chlamydiatrachomatisTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
    chlamydiatrachomatisTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
    chlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());

    // Initialize classes and features; add operations and parameters
    initEClass(chlamydiatrachomatisPublicHealthCaseReportEClass, ChlamydiatrachomatisPublicHealthCaseReport.class, "ChlamydiatrachomatisPublicHealthCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(chlamydiatrachomatisPublicHealthCaseReportEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPublicHealthCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(chlamydiatrachomatisPublicHealthCaseReportEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(chlamydiatrachomatisPublicHealthCaseReportEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(chlamydiatrachomatisPublicHealthCaseReportEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(chlamydiatrachomatisPublicHealthCaseReportEClass, this.getChlamydiatrachomatisPHCRClinicalInformationSection(), "getChlamydiatrachomatisPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(chlamydiatrachomatisPublicHealthCaseReportEClass, this.getChlamydiatrachomatisPHCRRelevantDxTestsSection(), "getChlamydiatrachomatisPHCRRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(chlamydiatrachomatisPublicHealthCaseReportEClass, this.getChlamydiatrachomatisPHCRTreatmentInformationSection(), "getChlamydiatrachomatisPHCRTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(chlamydiatrachomatisPHCRClinicalInformationSectionEClass, ChlamydiatrachomatisPHCRClinicalInformationSection.class, "ChlamydiatrachomatisPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(chlamydiatrachomatisPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(chlamydiatrachomatisPHCRClinicalInformationSectionEClass, this.getChlamydiatrachomatisCaseObservation(), "getChlamydiatrachomatisCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(chlamydiatrachomatisCaseObservationEClass, ChlamydiatrachomatisCaseObservation.class, "ChlamydiatrachomatisCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(chlamydiatrachomatisCaseObservationEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisCaseObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(chlamydiatrachomatisCaseObservationEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass, ChlamydiatrachomatisPHCRRelevantDxTestsSection.class, "ChlamydiatrachomatisPHCRRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass, this.getChlamydiatrachomatisResultObservation(), "getChlamydiatrachomatisResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass, this.getchlamydiatrachomatisResultOrganizer(), "getChlamydiatrachomatisResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(chlamydiatrachomatisResultObservationEClass, ChlamydiatrachomatisResultObservation.class, "ChlamydiatrachomatisResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(chlamydiatrachomatisResultObservationEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(chlamydiatrachomatisResultOrganizerEClass, chlamydiatrachomatisResultOrganizer.class, "chlamydiatrachomatisResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(chlamydiatrachomatisResultOrganizerEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(chlamydiatrachomatisPHCRTreatmentInformationSectionEClass, ChlamydiatrachomatisPHCRTreatmentInformationSection.class, "ChlamydiatrachomatisPHCRTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(chlamydiatrachomatisPHCRTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(chlamydiatrachomatisPHCRTreatmentInformationSectionEClass, this.getChlamydiatrachomatisTherapeuticRegimenAct(), "getChlamydiatrachomatisTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(chlamydiatrachomatisTherapeuticRegimenActEClass, ChlamydiatrachomatisTherapeuticRegimenAct.class, "ChlamydiatrachomatisTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(chlamydiatrachomatisTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(chlamydiatrachomatisTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(chlamydiatrachomatisTherapeuticRegimenActEClass, this.getChlamydiatrachomatisTreatmentGivenSubstanceAdministration(), "getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(chlamydiatrachomatisTherapeuticRegimenActEClass, this.getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(), "getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(chlamydiatrachomatisTreatmentGivenSubstanceAdministrationEClass, ChlamydiatrachomatisTreatmentGivenSubstanceAdministration.class, "ChlamydiatrachomatisTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationEClass, ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration.class, "ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
       "initializers", "org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis"
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
      (chlamydiatrachomatisPublicHealthCaseReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisPublicHealthCaseReportTemplateId ChlamydiatrachomatisPublicHealthCaseReportTitle ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection",
       "templateId.root", "2.16.840.1.113883.10.20.15.1.13",
       "title.mixed", "Public Health Case Report - Chlamydia trachomatis",
       "constraints.validation.warning", "ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection"
       });																									
    addAnnotation
      (chlamydiatrachomatisPHCRClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisPHCRClinicalInformationSectionTemplateId ChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.39"
       });									
    addAnnotation
      (chlamydiatrachomatisCaseObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisCaseObservationTemplateId ChlamydiatrachomatisCaseObservationValue ChlamydiatrachomatisCaseObservationValueP",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.113",
       "value.code", "105629000",
       "value.codeSystem", "2.16.840.1.113883.6.96",
       "value.codeSystemName", "SNOMEDCT",
       "value.displayName", "Chlamydial infection",
       "constraints.validation.dependOn.ChlamydiatrachomatisCaseObservationValue", "ChlamydiatrachomatisCaseObservationValueP"
       });											
    addAnnotation
      (chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisPHCRRelevantDxTestsSectionTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.41",
       "constraints.validation.warning", "ChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation",
       "constraints.validation.info", "ChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer"
       });															
    addAnnotation
      (chlamydiatrachomatisResultObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisResultObservationTemplateId ChlamydiatrachomatisResultObservationCode",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.120"
       });							
    addAnnotation
      (chlamydiatrachomatisResultOrganizerEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "chlamydiatrachomatisResultOrganizerTemplateId chlamydiatrachomatisResultOrganizerCode",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.114"
       });								
    addAnnotation
      (chlamydiatrachomatisPHCRTreatmentInformationSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisPHCRTreatmentInformationSectionTemplateId ChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct",
       "templateId.root", "2.16.840.1.113883.10.20.15.2.40"
       });									
    addAnnotation
      (chlamydiatrachomatisTherapeuticRegimenActEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisTherapeuticRegimenActTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.131",
       "constraints.validation.warning", "ChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration",
       "constraints.validation.info", "ChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration"
       });															
    addAnnotation
      (chlamydiatrachomatisTreatmentGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisTreatmentGivenSubstanceAdministrationTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.132"
       });			
    addAnnotation
      (chlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationTemplateId",
       "templateId.root", "2.16.840.1.113883.10.20.15.3.133"
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
      (chlamydiatrachomatisPublicHealthCaseReportEClass, 
       source, 
       new String[] 
       {
       });																									
    addAnnotation
      (chlamydiatrachomatisPHCRClinicalInformationSectionEClass, 
       source, 
       new String[] 
       {
       });									
    addAnnotation
      (chlamydiatrachomatisCaseObservationEClass, 
       source, 
       new String[] 
       {
       });											
    addAnnotation
      (chlamydiatrachomatisPHCRRelevantDxTestsSectionEClass, 
       source, 
       new String[] 
       {
       });															
    addAnnotation
      (chlamydiatrachomatisResultObservationEClass, 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (chlamydiatrachomatisResultOrganizerEClass, 
       source, 
       new String[] 
       {
       });								
    addAnnotation
      (chlamydiatrachomatisPHCRTreatmentInformationSectionEClass, 
       source, 
       new String[] 
       {
       });									
    addAnnotation
      (chlamydiatrachomatisTherapeuticRegimenActEClass, 
       source, 
       new String[] 
       {
       });															
    addAnnotation
      (chlamydiatrachomatisTreatmentGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (chlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationEClass, 
       source, 
       new String[] 
       {
       });
  }

} //ChlamydiatrachomatisPackageImpl
