/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocFactory;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consoltoc.util.ConsoltocValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsoltocPackageImpl extends EPackageImpl implements ConsoltocPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dischargeSummaryEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consultationRequestEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consultationSummaryEClass = null;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dischargeInstructionsEClass = null;
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
   * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ConsoltocPackageImpl()
  {
    super(eNS_URI, ConsoltocFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ConsoltocPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ConsoltocPackage init()
  {
    if (isInited) return (ConsoltocPackage)EPackage.Registry.INSTANCE.getEPackage(ConsoltocPackage.eNS_URI);

    // Obtain or create and register package
    ConsoltocPackageImpl theConsoltocPackage = (ConsoltocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConsoltocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConsoltocPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ConsolPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theConsoltocPackage.createPackageContents();

    // Initialize created meta-data
    theConsoltocPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theConsoltocPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return ConsoltocValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theConsoltocPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ConsoltocPackage.eNS_URI, theConsoltocPackage);
    return theConsoltocPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDischargeSummary()
  {
    return dischargeSummaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsultationRequest()
  {
    return consultationRequestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsultationSummary()
  {
    return consultationSummaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDischargeInstructions()
  {
    return dischargeInstructionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsoltocFactory getConsoltocFactory()
  {
    return (ConsoltocFactory)getEFactoryInstance();
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
    dischargeSummaryEClass = createEClass(DISCHARGE_SUMMARY);

    consultationRequestEClass = createEClass(CONSULTATION_REQUEST);

    consultationSummaryEClass = createEClass(CONSULTATION_SUMMARY);

    dischargeInstructionsEClass = createEClass(DISCHARGE_INSTRUCTIONS);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dischargeSummaryEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    consultationRequestEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    consultationSummaryEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    dischargeInstructionsEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());

    // Initialize classes and features; add operations and parameters
    initEClass(dischargeSummaryEClass, DischargeSummary.class, "DischargeSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getAllergiesSectionEntriesOptional(), "getAllergiesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getHospitalCourseSection(), "getHospitalCourseSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getHospitalDischargeDiagnosisSection(), "getHospitalDischargeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getHospitalDischargeMedicationsSectionEntriesOptional(), "getHospitalDischargeMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getProblemSectionEntriesOptional(), "getProblemSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getChiefComplaintAndReasonForVisitSection(), "getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getDischargeDietSection(), "getDischargeDietSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getFamilyHistorySection(), "getFamilyHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getHistoryOfPresentIllnessSection(), "getHistoryOfPresentIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getHospitalDischargePhysicalSection(), "getHospitalDischargePhysicalSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getHospitalDischargeStudiesSummarySection(), "getHospitalDischargeStudiesSummarySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getProceduresSectionEntriesOptional(), "getProceduresSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getReasonForVisitSection(), "getReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getReviewOfSystemsSection(), "getReviewOfSystemsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getVitalSignsSectionEntriesOptional(), "getVitalSignsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeSummaryEClass, theConsolPackage.getImmunizationsSectionEntriesOptional(), "getImmunizationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(consultationRequestEClass, ConsultationRequest.class, "ConsultationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(consultationRequestEClass, theConsolPackage.getAllergiesSectionEntriesOptional(), "getAllergiesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getHistoryOfPresentIllnessSection(), "getHistoryOfPresentIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getPhysicalExamSection(), "getPhysicalExamSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getReasonForReferralSection(), "getReasonForReferralSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getMedicationsSectionEntriesOptional(), "getMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getProblemSectionEntriesOptional(), "getProblemSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getProceduresSectionEntriesOptional(), "getProceduresSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getResultsSectionEntriesOptional(), "getResultsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getAdvanceDirectivesSectionEntriesOptional(), "getAdvanceDirectivesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getEncountersSectionEntriesOptional(), "getEncountersSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getFamilyHistorySection(), "getFamilyHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getImmunizationsSectionEntriesOptional(), "getImmunizationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getMedicalEquipmentSection(), "getMedicalEquipmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getVitalSignsSectionEntriesOptional(), "getVitalSignsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getChiefComplaintAndReasonForVisitSection(), "getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getGeneralStatusSection(), "getGeneralStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getHistoryOfPastIllnessSection(), "getHistoryOfPastIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationRequestEClass, theConsolPackage.getPayersSection(), "getPayersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(consultationSummaryEClass, ConsultationSummary.class, "ConsultationSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(consultationSummaryEClass, theConsolPackage.getAllergiesSectionEntriesOptional(), "getAllergiesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getMedicationsSectionEntriesOptional(), "getMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getProblemSectionEntriesOptional(), "getProblemSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getResultsSectionEntriesOptional(), "getResultsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getAdvanceDirectivesSectionEntriesOptional(), "getAdvanceDirectivesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getEncountersSectionEntriesOptional(), "getEncountersSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getFamilyHistorySection(), "getFamilyHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getImmunizationsSectionEntriesOptional(), "getImmunizationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getProceduresSectionEntriesOptional(), "getProceduresSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getMedicalEquipmentSection(), "getMedicalEquipmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getPayersSection(), "getPayersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(consultationSummaryEClass, theConsolPackage.getVitalSignsSectionEntriesOptional(), "getVitalSignsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(dischargeInstructionsEClass, DischargeInstructions.class, "DischargeInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getAllergiesSectionEntriesOptional(), "getAllergiesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getProblemSectionEntriesOptional(), "getProblemSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getHospitalDischargeMedicationsSectionEntriesOptional(), "getHospitalDischargeMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getAdvanceDirectivesSectionEntriesOptional(), "getAdvanceDirectivesSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getImmunizationsSectionEntriesOptional(), "getImmunizationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getMedicalEquipmentSection(), "getMedicalEquipmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(dischargeInstructionsEClass, theConsolPackage.getAdvanceDirectivesSectionEntriesOptional(), "getAdvanceDirectivesSectionEntriesOptional2", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
      (dischargeSummaryEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "2.16.840.1.113883.3.1275.1.1.1.1",
       "constraints.validation.error", "DischargeSummaryTemplateId"
       });																																											
    addAnnotation
      (consultationRequestEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "2.16.840.1.113883.3.1275.1.1.4.1",
       "constraints.validation.error", "ConsultationRequestTemplateId"
       });																																																	
    addAnnotation
      (consultationSummaryEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "2.16.840.1.113883.3.1275.1.1.3.1",
       "constraints.validation.error", "ConsultationSummaryTemplateId"
       });																																	
    addAnnotation
      (dischargeInstructionsEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "2.16.840.1.113883.3.1275.1.1.2.1",
       "constraints.validation.error", "DischargeInstructionsTemplateId"
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
      (dischargeSummaryEClass, 
       source, 
       new String[] 
       {
       });																																											
    addAnnotation
      (consultationRequestEClass, 
       source, 
       new String[] 
       {
       });																																																	
    addAnnotation
      (consultationSummaryEClass, 
       source, 
       new String[] 
       {
       });																																	
    addAnnotation
      (dischargeInstructionsEClass, 
       source, 
       new String[] 
       {
       });																
  }

} //ConsoltocPackageImpl
