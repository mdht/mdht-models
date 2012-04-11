/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.Billing;
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
  private EClass billingEClass = null;

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
  public EClass getBilling()
  {
    return billingEClass;
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

    billingEClass = createEClass(BILLING);
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
    billingEClass.getESuperTypes().add(theCDAPackage.getSection());

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

    op = addEOperation(patientCareReportEClass, ecorePackage.getEBoolean(), "validatePatientCareReportSetId", 0, 1, IS_UNIQUE, IS_ORDERED);
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

    addEOperation(patientCareReportEClass, this.getBilling(), "getBilling", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(billingEClass, Billing.class, "Billing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(billingEClass, ecorePackage.getEBoolean(), "validateBillingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(billingEClass, ecorePackage.getEBoolean(), "validateBillingCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(billingEClass, ecorePackage.getEBoolean(), "validateBillingLevelOfService", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(billingEClass, theCDAPackage.getObservation(), "getLevelOfService", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(billingEClass, theCDAPackage.getObservation(), "getBillingCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.openhealthtools.org/mdht/uml/cda/annotation
    createAnnotationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTarget
    createEmspcrPatientCareReportRecordTargetAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRole
    createEmspcrPatientCareReportRecordTargetPatientRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthor
    createEmspcrPatientCareReportAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorAssignedAuthor
    createEmspcrPatientCareReportAuthorAssignedAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportHumanAuthorAssignedAuthor
    createEmspcrPatientCareReportHumanAuthorAssignedAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOf
    createEmspcrPatientCareReportComponentOfAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounter
    createEmspcrPatientCareReportComponentOfEncompassingEncounterAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocation
    createEmspcrPatientCareReportComponentOfEncompassingEncounterLocationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacility
    createEmspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacilityPlace
    createEmspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntity
    createEmspcrPatientCareReportDestinationParticipantAssociatedEntityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntityPerson
    createEmspcrPatientCareReportDestinationParticipantAssociatedEntityPersonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntityOrganization
    createEmspcrPatientCareReportDestinationParticipantAssociatedEntityOrganizationAnnotations();
    // duplicates
    createDuplicatesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrBillingLevelOfService
    createEmspcrBillingLevelOfServiceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrBillingBillingCondition
    createEmspcrBillingBillingConditionAnnotations();
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
       "constraints.validation.error", "PatientCareReportTemplateId PatientCareReportClassCode PatientCareReportMoodCode PatientCareReportSetId GeneralHeaderConstraintsCode",
       "code.codeSystemName", "LOINC",
       "classCode", "DOCCLIN",
       "constraints.validation.warning", "PatientCareReportAdvanceDirectivesSectionEntriesOptional PatientCareReportAllergiesSectionEntriesOptional",
       "code.code", "67796-3",
       "moodCode", "EVN",
       "constraints.validation.info", "PatientCareReportHumanAuthor PatientCareReportComponentOf"
       });																																																		
    addAnnotation
      (billingEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "templateId.root", "2.16.840.1.113883.17.3.10.1.5",
       "constraints.validation.error", "BillingTemplateId BillingCode BillingLevelOfService",
       "code.codeSystemName", "LOINC",
       "code.code", "67659\u20103"
       });																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTarget</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportRecordTargetAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTarget";			
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "contextControlCode", "OP",
       "constraints.validation.error", "RecordTargetTypeId RecordTargetContextControlCode"
       });																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportRecordTargetPatientRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRole";				
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PatientRoleClassCode",
       "classCode", "PAT"
       });																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthor";					
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AuthorTypeCode",
       "typeCode", "AUT"
       });																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorAssignedAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportAuthorAssignedAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorAssignedAuthor";						
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AssignedAuthorClassCode",
       "classCode", "ASSIGNED"
       });																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportHumanAuthorAssignedAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportHumanAuthorAssignedAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportHumanAuthorAssignedAuthor";							
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AssignedAuthorId AssignedAuthorAddr AssignedAuthorTelecom"
       });																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportComponentOfAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOf";								
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ComponentOfTypeCode",
       "typeCode", "COMP"
       });																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounter</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportComponentOfEncompassingEncounterAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounter";									
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "EncompassingEncounterClassCode EncompassingEncounterMoodCode EncompassingEncounterEffectiveTime",
       "classCode", "ENC",
       "moodCode", "EVN"
       });																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportComponentOfEncompassingEncounterLocationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocation";										
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "LocationHealthCareFacility"
       });																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacility</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacilityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacility";											
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "HealthCareFacilityId HealthCareFacilityClassCode HealthCareFacilityPlace",
       "classCode", "SDLOC"
       });																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacilityPlace</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacilityPlaceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportComponentOfEncompassingEncounterLocationHealthCareFacilityPlace";												
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "classCode.codeSystem", "2.16.840.1.113883.6.3",
       "classCode.codeSystemName", "ICD-10",
       "constraints.validation.info", "PlaceName PlaceAddr"
       });																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntity</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportDestinationParticipantAssociatedEntityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntity";													
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113993.17.3.5.69",
       "constraints.validation.error", "AssociatedEntityAddr AssociatedEntityCode AssociatedEntityAssociatedPerson AssociatedEntityOrganization",
       "code.codeSystemName", "Facility Type"
       });																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntityPerson</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportDestinationParticipantAssociatedEntityPersonAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntityPerson";														
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PersonName"
       });																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntityOrganization</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrPatientCareReportDestinationParticipantAssociatedEntityOrganizationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantAssociatedEntityOrganization";															
    addAnnotation
      (patientCareReportEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "OrganizationName"
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
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrBillingLevelOfService</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrBillingLevelOfServiceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrBillingLevelOfService";																																																				
    addAnnotation
      (billingEClass, 
       source, 
       new String[] 
       {
       "value.codeSystemName", "LOINC",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "LevelOfServiceCode LevelOfServiceValue",
       "code.codeSystemName", "LOINC",
       "code.code", "67556\u20101",
       "value.codeSystem", "2.16.840.1.113883.6.1"
       });																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrBillingBillingCondition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEmspcrBillingBillingConditionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrBillingBillingCondition";																																																					
    addAnnotation
      (billingEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "constraints.validation.error", "BillingConditionCode BillingConditionValue",
       "code.codeSystemName", "LOINC"
       });																
  }

} //EmspcrPackageImpl
