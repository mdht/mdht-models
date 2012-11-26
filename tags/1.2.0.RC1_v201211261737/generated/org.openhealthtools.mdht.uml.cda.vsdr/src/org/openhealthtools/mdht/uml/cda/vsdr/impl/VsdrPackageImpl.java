/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VsdrPackageImpl extends EPackageImpl implements VsdrPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deathReportDocumentBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeofDeathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationofDeathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deathCertificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mannerofDeathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pregnancyStatusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tobaccoUseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass injuryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deathCausalInformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autopsyPerformanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autopsyResultsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coronerReferralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coronerCaseTransferEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deathLocationTypeEClass = null;

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
   * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VsdrPackageImpl()
  {
    super(eNS_URI, VsdrFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link VsdrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VsdrPackage init()
  {
    if (isInited) return (VsdrPackage)EPackage.Registry.INSTANCE.getEPackage(VsdrPackage.eNS_URI);

    // Obtain or create and register package
    VsdrPackageImpl theVsdrPackage = (VsdrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VsdrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VsdrPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CDAPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theVsdrPackage.createPackageContents();

    // Initialize created meta-data
    theVsdrPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theVsdrPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return VsdrValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theVsdrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VsdrPackage.eNS_URI, theVsdrPackage);
    return theVsdrPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportingdeathinformationfromaclinicalsettingtovitalrecords()
  {
    return reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeathReportDocumentBody()
  {
    return deathReportDocumentBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeofDeath()
  {
    return timeofDeathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationofDeath()
  {
    return locationofDeathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeathCertification()
  {
    return deathCertificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMannerofDeath()
  {
    return mannerofDeathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPregnancyStatus()
  {
    return pregnancyStatusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTobaccoUse()
  {
    return tobaccoUseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInjury()
  {
    return injuryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeathCausalInformation()
  {
    return deathCausalInformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutopsyPerformance()
  {
    return autopsyPerformanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutopsyResults()
  {
    return autopsyResultsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoronerReferral()
  {
    return coronerReferralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoronerCaseTransfer()
  {
    return coronerCaseTransferEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeathLocationType()
  {
    return deathLocationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsdrFactory getVsdrFactory()
  {
    return (VsdrFactory)getEFactoryInstance();
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
    reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass = createEClass(REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);

    deathReportDocumentBodyEClass = createEClass(DEATH_REPORT_DOCUMENT_BODY);

    timeofDeathEClass = createEClass(TIMEOF_DEATH);

    locationofDeathEClass = createEClass(LOCATIONOF_DEATH);

    deathCertificationEClass = createEClass(DEATH_CERTIFICATION);

    mannerofDeathEClass = createEClass(MANNEROF_DEATH);

    pregnancyStatusEClass = createEClass(PREGNANCY_STATUS);

    tobaccoUseEClass = createEClass(TOBACCO_USE);

    injuryEClass = createEClass(INJURY);

    deathCausalInformationEClass = createEClass(DEATH_CAUSAL_INFORMATION);

    autopsyPerformanceEClass = createEClass(AUTOPSY_PERFORMANCE);

    autopsyResultsEClass = createEClass(AUTOPSY_RESULTS);

    coronerReferralEClass = createEClass(CORONER_REFERRAL);

    coronerCaseTransferEClass = createEClass(CORONER_CASE_TRANSFER);

    deathLocationTypeEClass = createEClass(DEATH_LOCATION_TYPE);
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
    CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
    deathReportDocumentBodyEClass.getESuperTypes().add(theCDAPackage.getSection());
    timeofDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());
    locationofDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());
    deathCertificationEClass.getESuperTypes().add(theCDAPackage.getObservation());
    mannerofDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());
    pregnancyStatusEClass.getESuperTypes().add(theCDAPackage.getObservation());
    tobaccoUseEClass.getESuperTypes().add(theCDAPackage.getObservation());
    injuryEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
    deathCausalInformationEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
    autopsyPerformanceEClass.getESuperTypes().add(theCDAPackage.getObservation());
    autopsyResultsEClass.getESuperTypes().add(theCDAPackage.getObservation());
    coronerReferralEClass.getESuperTypes().add(theCDAPackage.getObservation());
    coronerCaseTransferEClass.getESuperTypes().add(theCDAPackage.getObservation());
    deathLocationTypeEClass.getESuperTypes().add(theCDAPackage.getObservation());

    // Initialize classes and features; add operations and parameters
    initEClass(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, Reportingdeathinformationfromaclinicalsettingtovitalrecords.class, "Reportingdeathinformationfromaclinicalsettingtovitalrecords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, this.getDeathReportDocumentBody(), "getDeathReportDocumentBody", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(deathReportDocumentBodyEClass, DeathReportDocumentBody.class, "DeathReportDocumentBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyTimeofDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyLocationofDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyDeathCertification", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyMannerofDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyPregnancyStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyTobaccoUse", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyInjury", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCauseofDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyAutopsyPerformance", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyAutopsyResults", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCoronerReferral", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyCoronerCaseTransfer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathReportDocumentBodyEClass, ecorePackage.getEBoolean(), "validateDeathReportDocumentBodyDeathLocationType", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getTimeofDeath(), "getTimeofDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getLocationofDeath(), "getLocationofDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getDeathCertification(), "getDeathCertification", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getMannerofDeath(), "getMannerofDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getPregnancyStatus(), "getPregnancyStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getTobaccoUse(), "getTobaccoUse", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getInjury(), "getInjury", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getDeathCausalInformation(), "getCauseofDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getAutopsyPerformance(), "getAutopsyPerformance", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getAutopsyResults(), "getAutopsyResults", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getCoronerReferral(), "getCoronerReferral", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getCoronerCaseTransfer(), "getCoronerCaseTransfer", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(deathReportDocumentBodyEClass, this.getDeathLocationType(), "getDeathLocationType", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(timeofDeathEClass, TimeofDeath.class, "TimeofDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(timeofDeathEClass, ecorePackage.getEBoolean(), "validateTimeofDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(timeofDeathEClass, ecorePackage.getEBoolean(), "validateTimeofDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(timeofDeathEClass, ecorePackage.getEBoolean(), "validateTimeofDeathCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(timeofDeathEClass, ecorePackage.getEBoolean(), "validateTimeofDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(timeofDeathEClass, ecorePackage.getEBoolean(), "validateTimeofDeathEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(timeofDeathEClass, ecorePackage.getEBoolean(), "validateTimeofDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(timeofDeathEClass, ecorePackage.getEBoolean(), "validateTimeofDeathText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(locationofDeathEClass, LocationofDeath.class, "LocationofDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(locationofDeathEClass, ecorePackage.getEBoolean(), "validateLocationofDeathValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(deathCertificationEClass, DeathCertification.class, "DeathCertification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleAddr", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCertificationEClass, ecorePackage.getEBoolean(), "validateDeathCertificationCertificationPerformerCertifierRole", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(mannerofDeathEClass, MannerofDeath.class, "MannerofDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(mannerofDeathEClass, ecorePackage.getEBoolean(), "validateMannerofDeathValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(pregnancyStatusEClass, PregnancyStatus.class, "PregnancyStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pregnancyStatusEClass, ecorePackage.getEBoolean(), "validatePregnancyStatusValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(tobaccoUseEClass, TobaccoUse.class, "TobaccoUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(tobaccoUseEClass, ecorePackage.getEBoolean(), "validateTobaccoUseValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(injuryEClass, Injury.class, "Injury", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentInjuryInformationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentWorkAssociationWorkAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTransportationAssociationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationAssociationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationshipValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(injuryEClass, ecorePackage.getEBoolean(), "validateInjuryComponentTransportationRelationshipTransportationRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(deathCausalInformationEClass, DeathCausalInformation.class, "DeathCausalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCause", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseInterval", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCauseValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseSequenceNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentCauseDeathCause", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue1", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalSequenceNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathCausalInformationEClass, ecorePackage.getEBoolean(), "validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(autopsyPerformanceEClass, AutopsyPerformance.class, "AutopsyPerformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(autopsyResultsEClass, AutopsyResults.class, "AutopsyResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(autopsyResultsEClass, ecorePackage.getEBoolean(), "validateAutopsyResultsValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(coronerReferralEClass, CoronerReferral.class, "CoronerReferral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerReferralEClass, ecorePackage.getEBoolean(), "validateCoronerReferralValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(coronerCaseTransferEClass, CoronerCaseTransfer.class, "CoronerCaseTransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(coronerCaseTransferEClass, ecorePackage.getEBoolean(), "validateCoronerCaseTransferValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(deathLocationTypeEClass, DeathLocationType.class, "DeathLocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(deathLocationTypeEClass, ecorePackage.getEBoolean(), "validateDeathLocationTypeValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
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
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson
    createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformer
    createVsdrDeathCertificationCertificationPerformerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRole
    createVsdrDeathCertificationCertificationPerformerCertifierRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRoleCertifyingParty
    createVsdrDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation
    createVsdrInjuryComponentInjuryInformationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation
    createVsdrInjuryComponentInjuryInformationInjuryInformationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation
    createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole
    createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury
    createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation
    createVsdrInjuryComponentWorkAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation
    createVsdrInjuryComponentWorkAssociationWorkAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation
    createVsdrInjuryComponentTransportationAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation
    createVsdrInjuryComponentTransportationAssociationTransportationAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship
    createVsdrInjuryComponentTransportationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship
    createVsdrInjuryComponentTransportationRelationshipTransportationRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition
    createVsdrDeathCausalInformationComponentOtherSignificantConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition
    createVsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause
    createVsdrDeathCausalInformationComponentCauseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause
    createVsdrDeathCausalInformationComponentCauseDeathCauseAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentDeathCauseInterval
    createVsdrDeathCausalInformationComponentDeathCauseIntervalAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval
    createVsdrDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer
    createVsdrAutopsyPerformanceAutopsyPerformerAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole
    createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician
    createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianAnnotations();
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
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Reporting death information from a clinical setting to vital recordsTemplateId Reporting death information from a clinical setting to vital recordsClassCode Reporting death information from a clinical setting to vital recordsCode Reporting death information from a clinical setting to vital recordsCodeP Reporting death information from a clinical setting to vital recordsId Reporting death information from a clinical setting to vital recordsMoodCode Reporting death information from a clinical setting to vital recordsRealmCode Reporting death information from a clinical setting to vital recordsEffectiveTime Reporting death information from a clinical setting to vital recordsCustodian Reporting death information from a clinical setting to vital recordsDeath Report Document Body Reporting death information from a clinical setting to vital recordsAuthor Reporting death information from a clinical setting to vital recordsRecordTarget Reporting death information from a clinical setting to vital recordsCustodianAssignedCustodianCustodianOrganizationName Reporting death information from a clinical setting to vital recordsCustodianAssignedCustodianCustodianOrganizationId Reporting death information from a clinical setting to vital recordsCustodianAssignedCustodian Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPersonClassCode Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPersonDeterminerCode Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPersonName Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorClassCode Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorId Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthorAuthoringPerson Reporting death information from a clinical setting to vital recordsAuthorTypeCode Reporting death information from a clinical setting to vital recordsAuthorTime Reporting death information from a clinical setting to vital recordsAuthorAssignedAuthor Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonAdministrativeGenderCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonAdministrativeGenderCodeP Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonClassCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonDeterminerCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientPersonName Reporting death information from a clinical setting to vital recordsRecordTargetPatientClassCode Reporting death information from a clinical setting to vital recordsRecordTargetPatientId Reporting death information from a clinical setting to vital recordsRecordTargetPatientPerson Reporting death information from a clinical setting to vital recordsRecordTargetTypeCode Reporting death information from a clinical setting to vital recordsRecordTargetPatient",
       "templateId.root", "2.16.840.1.113883.10.20.26.1",
       "classCode", "DOCCLIN",
       "code.code", "69409-1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "U.S. standard certificate of death - 2003 revision"
       });																																																																																																																																																																												
    addAnnotation
      (deathReportDocumentBodyEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Death Report Document BodyTemplateId Death Report Document BodyCode Death Report Document BodyCodeP Death Report Document BodyTime of Death Death Report Document BodyLocation of Death Death Report Document BodyManner of Death Death Report Document BodyCause of Death Death Report Document BodyAutopsy Performance Death Report Document BodyCoroner Case Transfer Death Report Document BodyDeathLocationType",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.1",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC"
       });																																																																																												
    addAnnotation
      (timeofDeathEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Time of DeathTemplateId Time of DeathClassCode Time of DeathCode Time of DeathCodeP Time of DeathMoodCode",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.13",
       "classCode", "OBS",
       "code.code", "31211-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Date of Death"
       });																														
    addAnnotation
      (locationofDeathEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Location of DeathTemplateId Location of DeathClassCode Location of DeathCode Location of DeathCodeP Location of DeathMoodCode Location of DeathValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.10",
       "classCode", "OBS",
       "code.code", "LOINC TBD",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Location of Death"
       });																														
    addAnnotation
      (deathCertificationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Death CertificationTemplateId Death CertificationClassCode Death CertificationCode Death CertificationEffectiveTime Death CertificationMoodCode Death CertificationCertificationPerformer Death CertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyName Death CertificationCertificationPerformerCertifierRoleAddr Death CertificationCertificationPerformerCertifierRoleClassCode Death CertificationCertificationPerformerCertifierRoleCode Death CertificationCertificationPerformerCertifierRoleCodeP Death CertificationCertificationPerformerCertifierRoleId Death CertificationCertificationPerformerCertifierRoleCertifyingParty Death CertificationCertificationPerformerTypeCode Death CertificationCertificationPerformerCertifierRole",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.7",
       "code.code", "69437-2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Death Certifier",
       "constraints.validation.query", "Death CertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Death CertificationCertificationPerformerCertifierRoleCertifyingPartyName Death CertificationCertificationPerformerCertifierRoleAddr Death CertificationCertificationPerformerCertifierRoleClassCode Death CertificationCertificationPerformerCertifierRoleCode Death CertificationCertificationPerformerCertifierRoleCodeP Death CertificationCertificationPerformerCertifierRoleId Death CertificationCertificationPerformerCertifierRoleCertifyingParty Death CertificationCertificationPerformerTypeCode Death CertificationCertificationPerformerCertifierRole"
       });																																																																									
    addAnnotation
      (mannerofDeathEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Manner of DeathTemplateId Manner of DeathClassCode Manner of DeathCode Manner of DeathCodeP Manner of DeathMoodCode Manner of DeathValue Manner of DeathValueP",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.11",
       "classCode", "OBS",
       "code.code", "69449-7",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Manner of Death"
       });																														
    addAnnotation
      (pregnancyStatusEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Pregnancy StatusTemplateId Pregnancy StatusClassCode Pregnancy StatusCode Pregnancy StatusCodeP Pregnancy StatusMoodCode Pregnancy StatusValue Pregnancy StatusValueP",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.12",
       "classCode", "OBS",
       "code.code", "69442-2",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Timing of recent pregancy related to death"
       });																														
    addAnnotation
      (tobaccoUseEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Tobacco UseTemplateId Tobacco UseClassCode Tobacco UseCode Tobacco UseMoodCode Tobacco UseValue Tobacco UseValueP",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.14",
       "classCode", "OBS",
       "code.code", "69443-0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Tobacco Use",
       "moodCode", "EVN",
       "value.codeSystem", "2.16.840.1.114222.4.11.6004",
       "value.codeSystemName", "Tobacco Use"
       });																										
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "InjuryTemplateId InjuryClassCode InjuryCode InjuryCodeP InjuryMoodCode InjuryStatusCode InjuryComponentInjuryInformation InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationTypeCode InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.9",
       "classCode", "CLUSTER",
       "code.code", "LOINC TBD",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Injury Cluster",
       "moodCode", "EVN",
       "constraints.validation.info", "InjuryComponentWorkAssociation InjuryComponentTransportationAssociation InjuryComponentTransportationRelationship InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentWorkAssociationWorkAssociation",
       "constraints.validation.query", "InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationTypeCode InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship",
       "constraints.validation.dependOn.InjuryComponentInjuryInformationInjuryInformationCode", "InjuryComponentInjuryInformationInjuryInformationCodeP",
       "constraints.validation.dependOn.InjuryComponentWorkAssociationWorkAssociationCode", "InjuryComponentWorkAssociationWorkAssociationCodeP",
       "constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode", "InjuryComponentTransportationAssociationTransportationAssociationCodeP",
       "constraints.validation.dependOn.InjuryComponentTransportationRelationshipTransportationRelationshipCode", "InjuryComponentTransportationRelationshipTransportationRelationshipCodeP"
       });																																																																																																																																																																																																	
    addAnnotation
      (deathCausalInformationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Death Causal InformationTemplateId Death Causal InformationClassCode Death Causal InformationCode Death Causal InformationMoodCode Death Causal InformationStatusCode Death Causal InformationComponentCause Death Causal InformationComponentDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue Death Causal InformationComponentCauseSequenceNumber Death Causal InformationComponentCauseTypeCode Death Causal InformationComponentCauseDeathCause Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue Death Causal InformationComponentOtherSignificantConditionTypeCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValueDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue1 Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentDeathCauseIntervalSequenceNumber Death Causal InformationComponentDeathCauseIntervalTypeCode Death Causal InformationComponentDeathCauseIntervalDeathCauseInterval",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.6",
       "classCode", "CLUSTER",
       "code.code", "69453-9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Cause Of Death",
       "moodCode", "EVN",
       "constraints.validation.warning", "Death Causal InformationComponentOtherSignificantCondition",
       "constraints.validation.query", "Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue Death Causal InformationComponentCauseSequenceNumber Death Causal InformationComponentCauseTypeCode Death Causal InformationComponentCauseDeathCause Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue Death Causal InformationComponentOtherSignificantConditionTypeCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1 Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValueDeath Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue1 Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentDeathCauseIntervalSequenceNumber Death Causal InformationComponentDeathCauseIntervalTypeCode Death Causal InformationComponentDeathCauseIntervalDeathCauseInterval"
       });																																																																																																																																																								
    addAnnotation
      (autopsyPerformanceEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Autopsy PerformanceTemplateId Autopsy PerformanceClassCode Autopsy PerformanceCode Autopsy PerformanceCodeP Autopsy PerformanceEffectiveTime Autopsy PerformanceValue Autopsy PerformanceMoodCode Autopsy PerformanceAutopsyPerformer Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerTypeCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRole",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.2",
       "classCode", "OBS",
       "code.code", "21986-5",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Autopsy Status"
       });																																																													
    addAnnotation
      (autopsyResultsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Autopsy ResultsTemplateId Autopsy ResultsClassCode Autopsy ResultsCode Autopsy ResultsCodeP Autopsy ResultsMoodCode Autopsy ResultsValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.3",
       "classCode", "OBS",
       "code.code", "69436-4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Autopsy results available"
       });																										
    addAnnotation
      (coronerReferralEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Coroner ReferralTemplateId Coroner ReferralClassCode Coroner ReferralCode Coroner ReferralCodeP Coroner ReferralMoodCode Coroner ReferralValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.5",
       "classCode", "OBS",
       "code.code", "69438-0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Coroner Referral Reason"
       });																										
    addAnnotation
      (coronerCaseTransferEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Coroner Case TransferTemplateId Coroner Case TransferCode Coroner Case TransferCodeP Coroner Case TransferMoodCode Coroner Case TransferValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.4",
       "classCode", "OBS",
       "constraints.validation.warning", "Coroner Case TransferClassCode",
       "code.code", "LOINC TBD",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Coroner Assignment"
       });																														
    addAnnotation
      (deathLocationTypeEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "DeathLocationTypeTemplateId DeathLocationTypeClassCode DeathLocationTypeCode DeathLocationTypeCodeP DeathLocationTypeMoodCode DeathLocationTypeValue DeathLocationTypeValueP",
       "templateId.root", "2.16.840.1.113883.10.20.26.1.8",
       "classCode", "OBS",
       "code.code", "LOINC TBD",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "constraints.validation.dependOn.DeathLocationTypeCode", "DeathLocationTypeCodeP",
       "moodCode", "EVN",
       "value.codeSystem", "OID TBD",
       "value.codeSystemName", "Death Location Types"
       });																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian";			
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "CustodianAssignedCustodian CustodianAssignedCustodianCustodianOrganizationName CustodianAssignedCustodianCustodianOrganizationId",
       "constraints.validation.query", "CustodianAssignedCustodianCustodianOrganizationName CustodianAssignedCustodianCustodianOrganizationId"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization";				
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "CustodianOrganizationName CustodianOrganizationId"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor";					
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "AUT",
       "constraints.validation.error", "AuthorTypeCode AuthorTime AuthorAssignedAuthor"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor";						
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "classCode", "ASSIGNED",
       "constraints.validation.error", "AssignedAuthorClassCode AssignedAuthorId AssignedAuthorAuthoringPerson AssignedAuthorAuthoringPersonClassCode AssignedAuthorAuthoringPersonDeterminerCode AssignedAuthorAuthoringPersonName",
       "constraints.validation.query", "AssignedAuthorAuthoringPersonClassCode AssignedAuthorAuthoringPersonDeterminerCode AssignedAuthorAuthoringPersonName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson";							
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "classCode", "PSN",
       "constraints.validation.error", "AuthoringPersonClassCode AuthoringPersonDeterminerCode AuthoringPersonName",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget";								
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RCT",
       "constraints.validation.error", "RecordTargetTypeCode RecordTargetPatient"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient";									
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "classCode", "PAT",
       "constraints.validation.error", "PatientClassCode PatientId PatientPerson PatientPersonAdministrativeGenderCode PatientPersonAdministrativeGenderCodeP PatientPersonClassCode PatientPersonDeterminerCode PatientPersonName",
       "constraints.validation.warning", "PatientAddr PatientPersonBirthTime",
       "constraints.validation.query", "PatientPersonAdministrativeGenderCode PatientPersonAdministrativeGenderCodeP PatientPersonBirthTime PatientPersonClassCode PatientPersonDeterminerCode PatientPersonName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson";										
    addAnnotation
      (reportingdeathinformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
       "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode",
       "constraints.validation.error", "PersonAdministrativeGenderCode PersonAdministrativeGenderCodeP PersonClassCode PersonDeterminerCode PersonName",
       "constraints.validation.warning", "PersonBirthTime",
       "classCode", "PSN",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCertificationCertificationPerformerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformer";																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (deathCertificationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "PRF",
       "constraints.validation.error", "CertificationPerformerTypeCode CertificationPerformerCertifierRole CertificationPerformerCertifierRoleCertifyingPartyClassCode CertificationPerformerCertifierRoleCertifyingPartyDeterminerCode CertificationPerformerCertifierRoleCertifyingPartyName CertificationPerformerCertifierRoleAddr CertificationPerformerCertifierRoleClassCode CertificationPerformerCertifierRoleCode CertificationPerformerCertifierRoleCodeP CertificationPerformerCertifierRoleId CertificationPerformerCertifierRoleCertifyingParty",
       "constraints.validation.query", "CertificationPerformerCertifierRoleCertifyingPartyClassCode CertificationPerformerCertifierRoleCertifyingPartyDeterminerCode CertificationPerformerCertifierRoleCertifyingPartyName CertificationPerformerCertifierRoleAddr CertificationPerformerCertifierRoleClassCode CertificationPerformerCertifierRoleCode CertificationPerformerCertifierRoleCodeP CertificationPerformerCertifierRoleId CertificationPerformerCertifierRoleCertifyingParty"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCertificationCertificationPerformerCertifierRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRole";																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (deathCertificationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "CertifierRoleAddr CertifierRoleClassCode CertifierRoleCode CertifierRoleCodeP CertifierRoleId CertifierRoleCertifyingParty CertifierRoleCertifyingPartyClassCode CertifierRoleCertifyingPartyDeterminerCode CertifierRoleCertifyingPartyName",
       "classCode", "ASSIGNED",
       "code.codeSystem", "2.16.840.1.114222.4.11.6001",
       "code.codeSystemName", "Certifier Types",
       "constraints.validation.query", "CertifierRoleCertifyingPartyClassCode CertifierRoleCertifyingPartyDeterminerCode CertifierRoleCertifyingPartyName"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRoleCertifyingParty</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCertificationCertificationPerformerCertifierRoleCertifyingParty";																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (deathCertificationEClass, 
       source, 
       new String[] 
       {
       "classCode", "PSN",
       "constraints.validation.error", "CertifyingPartyClassCode CertifyingPartyDeterminerCode CertifyingPartyName",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentInjuryInformationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "ComponentInjuryInformationTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentInjuryInformationInjuryInformationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "InjuryInformationClassCode InjuryInformationCode InjuryInformationCodeP InjuryInformationMoodCode InjuryInformationValue InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryInformationLocationParticipationTypeCode",
       "code.code", "11374-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Injury incident description",
       "constraints.validation.dependOn.InjuryInformationCode", "InjuryInformationCodeP",
       "moodCode", "EVN",
       "constraints.validation.info", "InjuryInformationText InjuryInformationEffectiveTime InjuryInformationLocationParticipation InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury",
       "constraints.validation.query", "InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryInformationLocationParticipationTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "typeCode", "LOC",
       "constraints.validation.error", "LocationParticipationTypeCode LocationParticipationInjuryLocationRolePlaceOfInjuryClassCode LocationParticipationInjuryLocationRoleClassCode",
       "constraints.validation.query", "LocationParticipationInjuryLocationRolePlaceOfInjuryClassCode LocationParticipationInjuryLocationRolePlaceOfInjuryDesc LocationParticipationInjuryLocationRoleAddr LocationParticipationInjuryLocationRoleClassCode LocationParticipationInjuryLocationRolePlaceOfInjury",
       "constraints.validation.info", "LocationParticipationInjuryLocationRolePlaceOfInjuryDesc LocationParticipationInjuryLocationRoleAddr LocationParticipationInjuryLocationRolePlaceOfInjury"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "InjuryLocationRoleAddr InjuryLocationRolePlaceOfInjury InjuryLocationRolePlaceOfInjuryDesc",
       "classCode", "ISDLOC",
       "constraints.validation.error", "InjuryLocationRoleClassCode InjuryLocationRolePlaceOfInjuryClassCode",
       "constraints.validation.query", "InjuryLocationRolePlaceOfInjuryClassCode InjuryLocationRolePlaceOfInjuryDesc"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "classCode", "PLC",
       "constraints.validation.error", "PlaceOfInjuryClassCode",
       "constraints.validation.info", "PlaceOfInjuryDesc",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentWorkAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "ComponentWorkAssociationTypeCode",
       "constraints.validation.info", "ComponentWorkAssociationWorkAssociation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentWorkAssociationWorkAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "WorkAssociationClassCode WorkAssociationCode WorkAssociationCodeP WorkAssociationMoodCode WorkAssociationValue",
       "code.code", "69444-8",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Did death result from injury at work",
       "constraints.validation.dependOn.WorkAssociationCode", "WorkAssociationCodeP",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentTransportationAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "ComponentTransportationAssociationTypeCode ComponentTransportationAssociationTransportationAssociationClassCode ComponentTransportationAssociationTransportationAssociationCodeP ComponentTransportationAssociationTransportationAssociationCode ComponentTransportationAssociationTransportationAssociationMoodCode ComponentTransportationAssociationTransportationAssociationValue",
       "constraints.validation.query", "ComponentTransportationAssociationTransportationAssociationClassCode ComponentTransportationAssociationTransportationAssociationCodeP ComponentTransportationAssociationTransportationAssociationCode ComponentTransportationAssociationTransportationAssociationMoodCode ComponentTransportationAssociationTransportationAssociationValue",
       "constraints.validation.dependOn.ComponentTransportationAssociationTransportationAssociationCode", "ComponentTransportationAssociationTransportationAssociationCodeP"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentTransportationAssociationTransportationAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "TransportationAssociationClassCode TransportationAssociationCode TransportationAssociationCodeP TransportationAssociationMoodCode TransportationAssociationValue",
       "code.code", "69448-9",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Injury leading to death associated with transportation event",
       "constraints.validation.dependOn.TransportationAssociationCode", "TransportationAssociationCodeP",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentTransportationRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "ComponentTransportationRelationshipTypeCode ComponentTransportationRelationshipTransportationRelationship"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrInjuryComponentTransportationRelationshipTransportationRelationshipAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (injuryEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "TransportationRelationshipClassCode TransportationRelationshipCode TransportationRelationshipCodeP TransportationRelationshipMoodCode TransportationRelationshipValue",
       "code.code", "69451-3",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Transportation role of decedent",
       "constraints.validation.dependOn.TransportationRelationshipCode", "TransportationRelationshipCodeP",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCausalInformationComponentOtherSignificantConditionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (deathCausalInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "ComponentOtherSignificantConditionTypeCode ComponentOtherSignificantConditionOtherSignificantCondition ComponentOtherSignificantConditionOtherSignificantConditionClassCode ComponentOtherSignificantConditionOtherSignificantConditionCodeP ComponentOtherSignificantConditionOtherSignificantConditionCode ComponentOtherSignificantConditionOtherSignificantConditionMoodCode ComponentOtherSignificantConditionOtherSignificantConditionValue",
       "constraints.validation.query", "ComponentOtherSignificantConditionOtherSignificantConditionClassCode ComponentOtherSignificantConditionOtherSignificantConditionCodeP ComponentOtherSignificantConditionOtherSignificantConditionCode ComponentOtherSignificantConditionOtherSignificantConditionMoodCode ComponentOtherSignificantConditionOtherSignificantConditionValue",
       "constraints.validation.dependOn.ComponentOtherSignificantConditionOtherSignificantConditionCode", "ComponentOtherSignificantConditionOtherSignificantConditionCodeP"
       });																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (deathCausalInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "OtherSignificantConditionClassCode OtherSignificantConditionCode OtherSignificantConditionCodeP OtherSignificantConditionMoodCode OtherSignificantConditionValue",
       "code.code", "69441-4",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Other Significant Condition",
       "constraints.validation.dependOn.OtherSignificantConditionCode", "OtherSignificantConditionCodeP",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCausalInformationComponentCauseAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (deathCausalInformationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ComponentCauseSequenceNumber ComponentCauseTypeCode ComponentCauseDeathCause ComponentCauseDeathCauseClassCode ComponentCauseDeathCauseCodeP ComponentCauseDeathCauseCode ComponentCauseDeathCauseMoodCode ComponentCauseDeathCauseValue",
       "typeCode", "COMP",
       "constraints.validation.query", "ComponentCauseDeathCauseClassCode ComponentCauseDeathCauseCodeP ComponentCauseDeathCauseCode ComponentCauseDeathCauseMoodCode ComponentCauseDeathCauseValue",
       "constraints.validation.dependOn.ComponentCauseDeathCauseCode", "ComponentCauseDeathCauseCodeP"
       });																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCausalInformationComponentCauseDeathCauseAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (deathCausalInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "DeathCauseClassCode DeathCauseCode DeathCauseCodeP DeathCauseMoodCode DeathCauseValue",
       "code.code", "21984-0",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Cause of Death",
       "constraints.validation.dependOn.DeathCauseCode", "DeathCauseCodeP",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentDeathCauseInterval</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCausalInformationComponentDeathCauseIntervalAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentDeathCauseInterval";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (deathCausalInformationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ComponentDeathCauseIntervalSequenceNumber ComponentDeathCauseIntervalTypeCode ComponentDeathCauseIntervalDeathCauseInterval ComponentDeathCauseIntervalDeathCauseIntervalClassCode ComponentDeathCauseIntervalDeathCauseIntervalCodeP ComponentDeathCauseIntervalDeathCauseIntervalCode ComponentDeathCauseIntervalDeathCauseIntervalMoodCode ComponentDeathCauseIntervalDeathCauseIntervalValue",
       "typeCode", "COMP",
       "constraints.validation.query", "ComponentDeathCauseIntervalDeathCauseIntervalClassCode ComponentDeathCauseIntervalDeathCauseIntervalCodeP ComponentDeathCauseIntervalDeathCauseIntervalCode ComponentDeathCauseIntervalDeathCauseIntervalMoodCode ComponentDeathCauseIntervalDeathCauseIntervalValue",
       "constraints.validation.dependOn.ComponentDeathCauseIntervalDeathCauseIntervalCode", "ComponentDeathCauseIntervalDeathCauseIntervalCodeP"
       });																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (deathCausalInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "DeathCauseIntervalClassCode DeathCauseIntervalCode DeathCauseIntervalCodeP DeathCauseIntervalMoodCode DeathCauseIntervalValue",
       "code.code", "69440-6",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "code.displayName", "Disease onset to death interval",
       "constraints.validation.dependOn.DeathCauseIntervalCode", "DeathCauseIntervalCodeP",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrAutopsyPerformanceAutopsyPerformerAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (autopsyPerformanceEClass, 
       source, 
       new String[] 
       {
       "typeCode", "PRF",
       "constraints.validation.error", "AutopsyPerformerTypeCode AutopsyPerformerAutopsyPerformerRole AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName AutopsyPerformerAutopsyPerformerRoleClassCode",
       "constraints.validation.query", "AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName AutopsyPerformerAutopsyPerformerRoleClassCode"
       });																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (autopsyPerformanceEClass, 
       source, 
       new String[] 
       {
       "classCode", "ASSIGNED",
       "constraints.validation.error", "AutopsyPerformerRoleClassCode AutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerRoleAutopsyClinicianName",
       "constraints.validation.query", "AutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerRoleAutopsyClinicianName"
       });																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (autopsyPerformanceEClass, 
       source, 
       new String[] 
       {
       "classCode", "PSN",
       "constraints.validation.error", "AutopsyClinicianClassCode AutopsyClinicianDeterminerCode AutopsyClinicianName",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																				
  }

} //VsdrPackageImpl
