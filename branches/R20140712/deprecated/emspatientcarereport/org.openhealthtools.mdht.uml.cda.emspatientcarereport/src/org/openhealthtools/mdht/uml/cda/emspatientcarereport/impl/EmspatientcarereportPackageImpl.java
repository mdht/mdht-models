/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;

import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSBilling;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSBillingEntry;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatient;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientBloodPressureOrganizer;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientBodyTemperature;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientDiastolicBloodPressure;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientHeartRate;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientRespiratoryRate;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientRole;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientSystolicBloodPressure;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSRecordTarget;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSTransport;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportFactory;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.util.EmspatientcarereportValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspatientcarereportPackageImpl extends EPackageImpl implements EmspatientcarereportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientBodyTemperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientHeartRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientSystolicBloodPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientDiastolicBloodPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientBloodPressureOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsVitalSignsOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientRespiratoryRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emergencyRunReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsPatientRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsRecordTargetEClass = null;

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
	private EClass emsTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emsBillingEntryEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmspatientcarereportPackageImpl() {
		super(eNS_URI, EmspatientcarereportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EmspatientcarereportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmspatientcarereportPackage init() {
		if (isInited) return (EmspatientcarereportPackage)EPackage.Registry.INSTANCE.getEPackage(EmspatientcarereportPackage.eNS_URI);

		// Obtain or create and register package
		EmspatientcarereportPackageImpl theEmspatientcarereportPackage = (EmspatientcarereportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmspatientcarereportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmspatientcarereportPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDTPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEmspatientcarereportPackage.createPackageContents();

		// Initialize created meta-data
		theEmspatientcarereportPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEmspatientcarereportPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EmspatientcarereportValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEmspatientcarereportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmspatientcarereportPackage.eNS_URI, theEmspatientcarereportPackage);
		return theEmspatientcarereportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatientBodyTemperature() {
		return emsPatientBodyTemperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatientHeartRate() {
		return emsPatientHeartRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatientSystolicBloodPressure() {
		return emsPatientSystolicBloodPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatientDiastolicBloodPressure() {
		return emsPatientDiastolicBloodPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatientBloodPressureOrganizer() {
		return emsPatientBloodPressureOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSVitalSignsOrganizer() {
		return emsVitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatientRespiratoryRate() {
		return emsPatientRespiratoryRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergencyRunReport() {
		return emergencyRunReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatient() {
		return emsPatientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSPatientRole() {
		return emsPatientRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSRecordTarget() {
		return emsRecordTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSBilling() {
		return emsBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSTransport() {
		return emsTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMSBillingEntry() {
		return emsBillingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspatientcarereportFactory getEmspatientcarereportFactory() {
		return (EmspatientcarereportFactory)getEFactoryInstance();
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
		emsPatientBodyTemperatureEClass = createEClass(EMS_PATIENT_BODY_TEMPERATURE);

		emsPatientHeartRateEClass = createEClass(EMS_PATIENT_HEART_RATE);

		emsPatientSystolicBloodPressureEClass = createEClass(EMS_PATIENT_SYSTOLIC_BLOOD_PRESSURE);

		emsPatientDiastolicBloodPressureEClass = createEClass(EMS_PATIENT_DIASTOLIC_BLOOD_PRESSURE);

		emsPatientBloodPressureOrganizerEClass = createEClass(EMS_PATIENT_BLOOD_PRESSURE_ORGANIZER);

		emsVitalSignsOrganizerEClass = createEClass(EMS_VITAL_SIGNS_ORGANIZER);

		emsPatientRespiratoryRateEClass = createEClass(EMS_PATIENT_RESPIRATORY_RATE);

		emergencyRunReportEClass = createEClass(EMERGENCY_RUN_REPORT);

		emsPatientEClass = createEClass(EMS_PATIENT);

		emsPatientRoleEClass = createEClass(EMS_PATIENT_ROLE);

		emsRecordTargetEClass = createEClass(EMS_RECORD_TARGET);

		emsBillingEClass = createEClass(EMS_BILLING);

		emsTransportEClass = createEClass(EMS_TRANSPORT);

		emsBillingEntryEClass = createEClass(EMS_BILLING_ENTRY);
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
		CDTPackage theCDTPackage = (CDTPackage)EPackage.Registry.INSTANCE.getEPackage(CDTPackage.eNS_URI);
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emergencyRunReportEClass.getESuperTypes().add(theCDTPackage.getGeneralHeaderConstraints());
		emsPatientEClass.getESuperTypes().add(theCDAPackage.getPatient());
		emsRecordTargetEClass.getESuperTypes().add(theCDAPackage.getRecordTarget());
		emsBillingEClass.getESuperTypes().add(theCDAPackage.getSection());
		emsTransportEClass.getESuperTypes().add(theCDAPackage.getSection());
		emsBillingEntryEClass.getESuperTypes().add(theCDAPackage.getEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(emsPatientBodyTemperatureEClass, EMSPatientBodyTemperature.class, "EMSPatientBodyTemperature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsPatientHeartRateEClass, EMSPatientHeartRate.class, "EMSPatientHeartRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsPatientSystolicBloodPressureEClass, EMSPatientSystolicBloodPressure.class, "EMSPatientSystolicBloodPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsPatientDiastolicBloodPressureEClass, EMSPatientDiastolicBloodPressure.class, "EMSPatientDiastolicBloodPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsPatientBloodPressureOrganizerEClass, EMSPatientBloodPressureOrganizer.class, "EMSPatientBloodPressureOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsVitalSignsOrganizerEClass, EMSVitalSignsOrganizer.class, "EMSVitalSignsOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsPatientRespiratoryRateEClass, EMSPatientRespiratoryRate.class, "EMSPatientRespiratoryRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emergencyRunReportEClass, EmergencyRunReport.class, "EmergencyRunReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(emergencyRunReportEClass, ecorePackage.getEBoolean(), "validateEmergencyRunReportId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emergencyRunReportEClass, ecorePackage.getEBoolean(), "validateEmergencyRunReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emergencyRunReportEClass, ecorePackage.getEBoolean(), "validateEmergencyRunReportTypeId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emergencyRunReportEClass, ecorePackage.getEBoolean(), "validateEmergencyRunReportSetId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emergencyRunReportEClass, ecorePackage.getEBoolean(), "validateEmergencyRunReportVersionNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emergencyRunReportEClass, ecorePackage.getEBoolean(), "validateEmergencyRunReportVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(emergencyRunReportEClass, ecorePackage.getEJavaObject(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(emergencyRunReportEClass, theCDAPackage.getSection(), "getBillingSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emsPatientEClass, EMSPatient.class, "EMSPatient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(emsPatientEClass, ecorePackage.getEBoolean(), "validateEMSPatientAdministrativeGenderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(emsPatientRoleEClass, EMSPatientRole.class, "EMSPatientRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsRecordTargetEClass, EMSRecordTarget.class, "EMSRecordTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsBillingEClass, EMSBilling.class, "EMSBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsTransportEClass, EMSTransport.class, "EMSTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emsBillingEntryEClass, EMSBillingEntry.class, "EMSBillingEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
	protected void createAnnotationAnnotations() {
		String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";		
		addAnnotation
		  (emsPatientHeartRateEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.codeSystemName", "LOINC"
		   });		
		addAnnotation
		  (emsPatientSystolicBloodPressureEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.codeSystemName", "LOINC"
		   });		
		addAnnotation
		  (emsPatientDiastolicBloodPressureEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.codeSystemName", "LOINC"
		   });		
		addAnnotation
		  (emsPatientBloodPressureOrganizerEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.codeSystemName", "LOINC"
		   });		
		addAnnotation
		  (emsVitalSignsOrganizerEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.codeSystemName", "LOINC"
		   });		
		addAnnotation
		  (emsPatientRespiratoryRateEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.codeSystemName", "LOINC"
		   });		
		addAnnotation
		  (emergencyRunReportEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.17.3.10.1",
			 "code.displayName", "EMS Patient Care Report",
			 "constraints.validation.error", "EmergencyRunReportTemplateId GeneralHeaderConstraintsCode EmergencyRunReportId EmergencyRunReportTitle EmergencyRunReportTypeId",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "EmergencyRunReportSetId EmergencyRunReportVersionNumber EmergencyRunReportVitalSignsSection",
			 "code.code", "EMSPCR"
		   });																															
		addAnnotation
		  (emsPatientEClass, 
		   source, 
		   new String[] {
			 "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode",
			 "constraints.validation.error", "EMSPatientAdministrativeGenderCode",
			 "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1"
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
		  (emergencyRunReportEClass, 
		   source, 
		   new String[] {
		   });																																	
	}

} //EmspatientcarereportPackageImpl
