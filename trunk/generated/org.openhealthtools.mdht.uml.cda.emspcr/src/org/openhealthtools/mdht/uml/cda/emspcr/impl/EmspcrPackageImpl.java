/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectives;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactions;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspcrPackageImpl extends EPackageImpl implements EmspcrPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patientCareReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsBillingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsInjuryIncidentDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsCardiacArrestEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsAdvanceDirectivesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsAllergiesAndAdverseReactionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emsCurrentMedicationSectionEClass = null;

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
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EmspcrPackageImpl()
  {
    super(eNS_URI, EmspcrFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EmspcrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EmspcrPackage init()
  {
    if (isInited) return (EmspcrPackage)EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI);

    // Obtain or create and register package
    EmspcrPackageImpl theEmspcrPackage = (EmspcrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmspcrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmspcrPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ConsolPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEmspcrPackage.createPackageContents();

    // Initialize created meta-data
    theEmspcrPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theEmspcrPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return EmspcrValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theEmspcrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EmspcrPackage.eNS_URI, theEmspcrPackage);
    return theEmspcrPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatientCareReport()
  {
    return patientCareReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSBilling()
  {
    return emsBillingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSInjuryIncidentDescription()
  {
    return emsInjuryIncidentDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSCardiacArrestEvent()
  {
    return emsCardiacArrestEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSAdvanceDirectives()
  {
    return emsAdvanceDirectivesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSAllergiesAndAdverseReactions()
  {
    return emsAllergiesAndAdverseReactionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMSCurrentMedicationSection()
  {
    return emsCurrentMedicationSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmspcrFactory getEmspcrFactory()
  {
    return (EmspcrFactory)getEFactoryInstance();
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
    patientCareReportEClass = createEClass(PATIENT_CARE_REPORT);

    emsBillingEClass = createEClass(EMS_BILLING);

    emsInjuryIncidentDescriptionEClass = createEClass(EMS_INJURY_INCIDENT_DESCRIPTION);

    emsCardiacArrestEventEClass = createEClass(EMS_CARDIAC_ARREST_EVENT);

    emsAdvanceDirectivesEClass = createEClass(EMS_ADVANCE_DIRECTIVES);

    emsAllergiesAndAdverseReactionsEClass = createEClass(EMS_ALLERGIES_AND_ADVERSE_REACTIONS);

    emsCurrentMedicationSectionEClass = createEClass(EMS_CURRENT_MEDICATION_SECTION);
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
    ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
    CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    patientCareReportEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    emsBillingEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsInjuryIncidentDescriptionEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsCardiacArrestEventEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsAdvanceDirectivesEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsAllergiesAndAdverseReactionsEClass.getESuperTypes().add(theCDAPackage.getSection());
    emsCurrentMedicationSectionEClass.getESuperTypes().add(theCDAPackage.getSection());

    // Initialize classes and features; add operations and parameters
    initEClass(patientCareReportEClass, PatientCareReport.class, "PatientCareReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportVersionNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportHumanAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportComponentOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportAdvanceDirectivesSectionEntriesOptional", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportAllergiesSectionEntriesOptional", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(patientCareReportEClass, theConsolPackage.getAdvanceDirectivesSectionEntriesOptional(), "getAdvanceDirectivesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, theConsolPackage.getAllergiesSectionEntriesOptional(), "getAllergiesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSBilling(), "getBilling", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(patientCareReportEClass, this.getEMSInjuryIncidentDescription(), "getSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsBillingEClass, EMSBilling.class, "EMSBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsBillingEClass, ecorePackage.getEBoolean(), "validateEMSBillingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingEClass, ecorePackage.getEBoolean(), "validateEMSBillingCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsBillingEClass, ecorePackage.getEBoolean(), "validateEMSBillingLevelOfService", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsBillingEClass, theCDAPackage.getObservation(), "getLevelOfService", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsBillingEClass, theCDAPackage.getObservation(), "getBillingCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsInjuryIncidentDescriptionEClass, EMSInjuryIncidentDescription.class, "EMSInjuryIncidentDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsInjuryIncidentDescriptionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsInjuryIncidentDescriptionEClass, ecorePackage.getEBoolean(), "validateEMSInjuryIncidentDescriptionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getInjuryCauseCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getInjuryMechanism", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getTraumaCenterCriteria", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getInjuryRiskFactor", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getVehicleImpactArea", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getPatientLocationInVehicle", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getVehicleOccupantSafetyEquipment", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getAirbagDeploymentStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(emsInjuryIncidentDescriptionEClass, theCDAPackage.getObservation(), "getHeightOfFall", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsCardiacArrestEventEClass, EMSCardiacArrestEvent.class, "EMSCardiacArrestEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsCardiacArrestEventEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsCardiacArrestEventEClass, ecorePackage.getEBoolean(), "validateEMSCardiacArrestEventCardiacArrestExistence", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emsCardiacArrestEventEClass, theCDAPackage.getObservation(), "getCardiacArrestExistence", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(emsAdvanceDirectivesEClass, EMSAdvanceDirectives.class, "EMSAdvanceDirectives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsAdvanceDirectivesEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emsAdvanceDirectivesEClass, ecorePackage.getEBoolean(), "validateEMSAdvanceDirectivesCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsAllergiesAndAdverseReactionsEClass, EMSAllergiesAndAdverseReactions.class, "EMSAllergiesAndAdverseReactions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsAllergiesAndAdverseReactionsEClass, ecorePackage.getEBoolean(), "validateEMSAllergiesAndAdverseReactionsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emsCurrentMedicationSectionEClass, EMSCurrentMedicationSection.class, "EMSCurrentMedicationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emsCurrentMedicationSectionEClass, ecorePackage.getEBoolean(), "validateEMSCurrentMedicationSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
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
    // http://www.openhealthtools.org/mdht/uml/cda/annotation
    createAnnotationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole
    createEmspcrPatientCareReportEMSRecordTargetPatientRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient
    createEmspcrPatientCareReportEMSRecordTargetPatientRolePatientAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation
    createEmspcrPatientCareReportEMSAuthoringDeviceParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole
    createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice
    createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDeviceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole
    createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor
    createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace
    createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity
    createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson
    createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPersonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization
    createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganizationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship
    createEmspcrPatientCareReportEMSParentDocumentRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation
    createEmspcrPatientCareReportEMSDestinationParticipantParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory
    createEmspcrPatientCareReportEMSMedicalHistoryAnnotations();
    // duplicates
    createDuplicatesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingLevelOfService
    createEmspcrEMSBillingLevelOfServiceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingBillingCondition
    createEmspcrEMSBillingBillingConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryCauseCategory
    createEmspcrEMSInjuryIncidentDescriptionInjuryCauseCategoryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryMechanism
    createEmspcrEMSInjuryIncidentDescriptionInjuryMechanismAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionTraumaCenterCriteria
    createEmspcrEMSInjuryIncidentDescriptionTraumaCenterCriteriaAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryRiskFactor
    createEmspcrEMSInjuryIncidentDescriptionInjuryRiskFactorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionVehicleImpactArea
    createEmspcrEMSInjuryIncidentDescriptionVehicleImpactAreaAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionPatientLocationInVehicle
    createEmspcrEMSInjuryIncidentDescriptionPatientLocationInVehicleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionVehicleOccupantSafetyEquipment
    createEmspcrEMSInjuryIncidentDescriptionVehicleOccupantSafetyEquipmentAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionAirbagDeploymentStatus
    createEmspcrEMSInjuryIncidentDescriptionAirbagDeploymentStatusAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionHeightOfFall
    createEmspcrEMSInjuryIncidentDescriptionHeightOfFallAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionDisasterType
    createEmspcrEMSInjuryIncidentDescriptionDisasterTypeAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistence
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationship
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTimingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationship
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCauseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipation
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationship
    createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPR
    createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation
    createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationship
    createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUse
    createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation
    createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationship
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipArrestRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationship
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationship
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm
    createEmspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythmAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentlyOnMedication
    createEmspcrEMSCurrentMedicationSectionCurrentlyOnMedicationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionPatientOnAnticoagulants
    createEmspcrEMSCurrentMedicationSectionPatientOnAnticoagulantsAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug
    createEmspcrEMSCurrentMedicationSectionEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrugAnnotations();
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
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1",
       "code.displayName", "EMS Patient Care Report",
       "constraints.validation.error", "PatientCareReportTemplateId PatientCareReportClassCode PatientCareReportMoodCode GeneralHeaderConstraintsCode PatientCareReportCode PatientCareReportId PatientCareReportTitle",
       "code.codeSystemName", "LOINC",
       "classCode", "DOCCLIN",
       "constraints.validation.warning", "PatientCareReportAdvanceDirectivesSectionEntriesOptional PatientCareReportAllergiesSectionEntriesOptional",
       "code.code", "67796-3",
       "constraints.validation.info", "PatientCareReportVersionNumber PatientCareReportHumanAuthor PatientCareReportComponentOf",
       "moodCode", "EVN"
       });																																																																					
    addAnnotation
      (emsBillingEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.5",
       "constraints.validation.error", "EMSBillingTemplateId EMSBillingCode EMSBillingLevelOfService",
       "code.codeSystemName", "LOINC",
       "code.code", "67659-3"
       });																				
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.17",
       "code.displayName", "Injury incident description",
       "constraints.validation.error", "EMSInjuryIncidentDescriptionTemplateId EMSInjuryIncidentDescriptionCode",
       "code.codeSystemName", "LOINC",
       "code.code", "11374-6"
       });																																						
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "title.mixed", "EMS Cardiac Arrest Event",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS CARDIAC ARREST EVENT",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.14",
       "constraints.validation.error", "EMSCardiacArrestEventTemplateId EMSCardiacArrestEventCode EMSCardiacArrestEventCardiacArrestExistence",
       "code.codeSystemName", "LOINC",
       "constraints.validation.warning", "EMSCardiacArrestEventTitle",
       "code.code", "67799-7"
       });																																							
    addAnnotation
      (emsAdvanceDirectivesEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.12",
       "code.displayName", "EMS Advance Directives",
       "constraints.validation.error", "EMSAdvanceDirectivesTemplateId EMSAdvanceDirectivesCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67840-9"
       });										
    addAnnotation
      (emsAllergiesAndAdverseReactionsEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "2.16.840.1.113883.17.3.10.1.13",
       "constraints.validation.error", "EMSAllergiesAndAdverseReactionsTemplateId"
       });						
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS Current Medications",
       "constraints.validation.error", "EMSCurrentMedicationSectionCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67844-1"
       });							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSRecordTargetPatientRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRole";			
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientRoleAddr"
       });																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSRecordTargetPatientRolePatientAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSRecordTargetPatientRolePatient";				
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientAdministrativeGenderCode"
       });																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSAuthoringDeviceParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipation";					
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAuthoringDeviceParticipationTypeCode",
       "typeCode", "AUT"
       });																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRole";						
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAuthoringDeviceRoleClassCode",
       "classCode", "ASSIGNED"
       });																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDeviceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSAuthoringDeviceParticipationEMSAuthoringDeviceRoleEMSAuthoringDevice";							
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSAuthoringDeviceManufacturerModelName EMSAuthoringDeviceSoftwareName"
       });																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRole";								
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHumanAuthorRoleId EMSHumanAuthorRoleAddr EMSHumanAuthorRoleTelecom"
       });																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSHumanAuthorParticipationEMSHumanAuthorRoleEMSHumanAuthor";									
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSHumanAuthorName"
       });																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationship";										
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EMSEncompassingEncounterRelationshipTypeCode",
       "typeCode", "COMP"
       });																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounter";											
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EncompassingEncounterEffectiveTime"
       });																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocation";												
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "LocationHealthCareFacility"
       });																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility";													
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "HealthCareFacilityId HealthCareFacilityPlace"
       });																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace";														
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PlaceClassCode",
       "classCode", "PLC",
       "constraints.validation.info", "PlaceName PlaceAddr"
       });																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntity";															
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113993.17.3.5.69",
       "constraints.validation.error", "AssociatedEntityAddr AssociatedEntityCode AssociatedEntityCodeP AssociatedEntityAssociatedPerson AssociatedEntityOrganization",
       "code.codeSystemName", "Facility Type"
       });																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPersonAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityPerson";																
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PersonName"
       });																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganizationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantAssociatedEntityOrganization";																	
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "OrganizationName"
       });																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSParentDocumentRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSParentDocumentRelationship";																		
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RPLC"
       });																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSDestinationParticipantParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSDestinationParticipantParticipation";																			
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "typeCode", "DST"
       });																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportEMSMedicalHistoryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEMSMedicalHistory";																				
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS History of past illness",
       "constraints.validation.error", "EMSMedicalHistoryCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67842-5"
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
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       });																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingLevelOfService</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSBillingLevelOfServiceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingLevelOfService";																																																																							
    addAnnotation
      (emsBillingEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "EMS level of service",
       "constraints.validation.error", "LevelOfServiceCode LevelOfServiceCodeP LevelOfServiceValue LevelOfServiceValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "69464-6",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingBillingCondition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSBillingBillingConditionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingBillingCondition";																																																																								
    addAnnotation
      (emsBillingEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "BillingConditionCode BillingConditionCodeVS BillingConditionCodeP BillingConditionValue BillingConditionValueP",
       "code.codeSystemName", "LOINC",
       "code.code", "67556-1",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryCauseCategory</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionInjuryCauseCategoryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryCauseCategory";																																																																																										
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Injury Cause",
       "constraints.validation.error", "InjuryCauseCategoryCode",
       "code.codeSystemName", "LOINC",
       "code.code", "69543-7"
       });																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryMechanism</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionInjuryMechanismAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryMechanism";																																																																																											
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Injury Mechanism",
       "constraints.validation.error", "InjuryMechanismCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67494-5"
       });																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionTraumaCenterCriteria</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionTraumaCenterCriteriaAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionTraumaCenterCriteria";																																																																																												
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Trauma Center Critieria",
       "constraints.validation.error", "TraumaCenterCriteriaCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67495-2"
       });																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryRiskFactor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionInjuryRiskFactorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionInjuryRiskFactor";																																																																																													
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Other injury risk factors",
       "constraints.validation.error", "InjuryRiskFactorCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67496-0"
       });																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionVehicleImpactArea</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionVehicleImpactAreaAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionVehicleImpactArea";																																																																																														
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Location of impact on the vehicle",
       "constraints.validation.error", "VehicleImpactAreaCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67497-8"
       });																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionPatientLocationInVehicle</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionPatientLocationInVehicleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionPatientLocationInVehicle";																																																																																															
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Location of patient in vehicle",
       "constraints.validation.error", "PatientLocationInVehicleCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67498-6"
       });																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionVehicleOccupantSafetyEquipment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionVehicleOccupantSafetyEquipmentAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionVehicleOccupantSafetyEquipment";																																																																																																
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Safety equipment",
       "constraints.validation.error", "VehicleOccupantSafetyEquipmentCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67499-4"
       });																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionAirbagDeploymentStatus</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionAirbagDeploymentStatusAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionAirbagDeploymentStatus";																																																																																																	
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Airbag deployment",
       "constraints.validation.error", "AirbagDeploymentStatusCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67500-9"
       });																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionHeightOfFall</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionHeightOfFallAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionHeightOfFall";																																																																																																		
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Height of fall",
       "constraints.validation.error", "HeightOfFallCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67501-7"
       });																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionDisasterType</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSInjuryIncidentDescriptionDisasterTypeAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionDisasterType";																																																																																																			
    addAnnotation
      (emsInjuryIncidentDescriptionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Suspected intentional or unintentional disaster",
       "constraints.validation.error", "DisasterTypeCode",
       "code.codeSystemName", "LOINC",
       "code.code", "69463-8"
       });																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistence</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistence";																																																																																																																															
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "value.displayName", "cardiac arrest",
       "value.codeSystemName", "SNOMEDCT",
       "code.codeSystem", "2.16.840.1.113883.5.4",
       "code.displayName", "ASSERTION",
       "value.code", "410429000",
       "constraints.validation.error", "CardiacArrestExistenceCode CardiacArrestExistenceValue",
       "code.codeSystemName", "HL7ActCode",
       "code.code", "ASSERTION",
       "value.codeSystem", "2.16.840.1.113883.6.96"
       });																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationship";																																																																																																																																
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "constraints.validation.error", "CardiacArrestTimingRelationshipInversionInd",
       "typeCode", "SUBJ"
       });																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTimingAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming";																																																																																																																																	
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "CardiacArrestTimingCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67502-5"
       });																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationship";																																																																																																																																		
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCauseAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause";																																																																																																																																			
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Cardiac arrest cause",
       "constraints.validation.error", "CardiacArrestCauseCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67503-3"
       });																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipation";																																																																																																																																				
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "typeCode", "INF"
       });																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole";																																																																																																																																					
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "classCode", "AGNT"
       });																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationship";																																																																																																																																						
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPR</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPR";																																																																																																																																							
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "CPR prior to EMS arrival",
       "constraints.validation.error", "PriorCPRCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67506-6"
       });																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation";																																																																																																																																								
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RESP"
       });																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationship";																																																																																																																																									
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUse</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUseAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUse";																																																																																																																																										
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "AED use prior to EMS arrival",
       "constraints.validation.error", "PriorAEDUseCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67508-2"
       });																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation";																																																																																																																																											
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RESP"
       });																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationship";																																																																																																																																												
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipArrestRhythmAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm";																																																																																																																																													
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "First monitored rhythm",
       "constraints.validation.error", "ArrestRhythmCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67512-4"
       });																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationship";																																																																																																																																														
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation";																																																																																																																																															
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Return of spontaneous circulation",
       "constraints.validation.error", "ReturnOfSpontaneousCirculationCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67513-2"
       });																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationship";																																																																																																																																																
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "inversionInd", "TRUE",
       "typeCode", "SUBJ"
       });																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythmAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm";																																																																																																																																																	
    addAnnotation
      (emsCardiacArrestEventEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Cardiac rhythm",
       "constraints.validation.error", "DestinationRhythmCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67519-9"
       });																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentlyOnMedication</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCurrentMedicationSectionCurrentlyOnMedicationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionCurrentlyOnMedication";																																																																																																																																																																																			
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.displayName", "Currently on medication",
       "constraints.validation.error", "CurrentlyOnMedicationCode",
       "code.codeSystemName", "LOINC",
       "code.code", "67791-4"
       });						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionPatientOnAnticoagulants</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCurrentMedicationSectionPatientOnAnticoagulantsAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionPatientOnAnticoagulants";																																																																																																																																																																																				
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "PatientOnAnticoagulantsCode",
       "code.codeSystemName", "LOINC",
       "code.code", "69749-0"
       });					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrEMSCurrentMedicationSectionEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrugAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCurrentMedicationSectionEMSCurrentMedicationEMSCurrentMedicationConsumableEMSCurrentMedicationProductEMSCurrentMedicationDrug";																																																																																																																																																																																					
    addAnnotation
      (emsCurrentMedicationSectionEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.88",
       "constraints.validation.error", "EMSCurrentMedicationDrugCode",
       "code.codeSystemName", "RxNorm"
       });				
  }

} //EmspcrPackageImpl
