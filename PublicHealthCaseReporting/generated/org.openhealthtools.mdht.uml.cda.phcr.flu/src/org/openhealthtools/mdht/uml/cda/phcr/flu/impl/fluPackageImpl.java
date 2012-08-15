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
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluFactory;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fluPackageImpl extends EPackageImpl implements fluPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaCaseReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaImmunizationSectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaImmunizationActivityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaPHCRClinicalInformationSectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaCaseObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaSignsAndSymptomsObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaPHCRTreatmentInformationSectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaTherapeuticRegimenActEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaTreatmentGivenSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaTreatmentNotGivenSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaResultObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaImagingObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaPHCRSocialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaEmploymentStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaPossibleExposureLocationActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenzaImmunizationProductEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private fluPackageImpl() {
		super(eNS_URI, fluFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link fluPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static fluPackage init() {
		if (isInited) return (fluPackage)EPackage.Registry.INSTANCE.getEPackage(fluPackage.eNS_URI);

		// Obtain or create and register package
		fluPackageImpl thefluPackage = (fluPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof fluPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new fluPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PhcrPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thefluPackage.createPackageContents();

		// Initialize created meta-data
		thefluPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thefluPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return fluValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thefluPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(fluPackage.eNS_URI, thefluPackage);
		return thefluPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaCaseReport() {
		return influenzaCaseReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaImmunizationSection() {
		return influenzaImmunizationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaImmunizationActivity() {
		return influenzaImmunizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaPHCRClinicalInformationSection() {
		return influenzaPHCRClinicalInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaCaseObservation() {
		return influenzaCaseObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaSignsAndSymptomsObservation() {
		return influenzaSignsAndSymptomsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaPHCRTreatmentInformationSection() {
		return influenzaPHCRTreatmentInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaTherapeuticRegimenAct() {
		return influenzaTherapeuticRegimenActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaTreatmentGivenSubstanceAdministration() {
		return influenzaTreatmentGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaTreatmentNotGivenSubstanceAdministration() {
		return influenzaTreatmentNotGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
		return influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaResultObservation() {
		return influenzaResultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaImagingObservation() {
		return influenzaImagingObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaPHCRSocialHistorySection() {
		return influenzaPHCRSocialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaEmploymentStatusObservation() {
		return influenzaEmploymentStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaPossibleExposureLocationAct() {
		return influenzaPossibleExposureLocationActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenzaImmunizationProduct() {
		return influenzaImmunizationProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fluFactory getfluFactory() {
		return (fluFactory)getEFactoryInstance();
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
		influenzaCaseReportEClass = createEClass(INFLUENZA_CASE_REPORT);

		influenzaImmunizationSectionEClass = createEClass(INFLUENZA_IMMUNIZATION_SECTION);

		influenzaImmunizationActivityEClass = createEClass(INFLUENZA_IMMUNIZATION_ACTIVITY);

		influenzaPHCRClinicalInformationSectionEClass = createEClass(INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION);

		influenzaCaseObservationEClass = createEClass(INFLUENZA_CASE_OBSERVATION);

		influenzaSignsAndSymptomsObservationEClass = createEClass(INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION);

		influenzaPHCRTreatmentInformationSectionEClass = createEClass(INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION);

		influenzaTherapeuticRegimenActEClass = createEClass(INFLUENZA_THERAPEUTIC_REGIMEN_ACT);

		influenzaTreatmentGivenSubstanceAdministrationEClass = createEClass(INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

		influenzaTreatmentNotGivenSubstanceAdministrationEClass = createEClass(INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);

		influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass = createEClass(INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);

		influenzaResultObservationEClass = createEClass(INFLUENZA_RESULT_OBSERVATION);

		influenzaImagingObservationEClass = createEClass(INFLUENZA_IMAGING_OBSERVATION);

		influenzaPHCRSocialHistorySectionEClass = createEClass(INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION);

		influenzaEmploymentStatusObservationEClass = createEClass(INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION);

		influenzaPossibleExposureLocationActEClass = createEClass(INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT);

		influenzaImmunizationProductEClass = createEClass(INFLUENZA_IMMUNIZATION_PRODUCT);
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
		CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		influenzaCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
		influenzaImmunizationSectionEClass.getESuperTypes().add(theCCDPackage.getImmunizationsSection());
		influenzaImmunizationActivityEClass.getESuperTypes().add(theCCDPackage.getMedicationActivity());
		influenzaPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
		influenzaCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
		influenzaSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
		influenzaPHCRTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
		influenzaTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
		influenzaTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
		influenzaTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());
		influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
		influenzaResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
		influenzaImagingObservationEClass.getESuperTypes().add(thePhcrPackage.getImagingObservation());
		influenzaPHCRSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
		influenzaEmploymentStatusObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		influenzaPossibleExposureLocationActEClass.getESuperTypes().add(theCDAPackage.getAct());
		influenzaImmunizationProductEClass.getESuperTypes().add(theCCDPackage.getProduct());

		// Initialize classes and features; add operations and parameters
		initEClass(influenzaCaseReportEClass, InfluenzaCaseReport.class, "InfluenzaCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(influenzaCaseReportEClass, ecorePackage.getEBoolean(), "validateInfluenzaCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaCaseReportEClass, ecorePackage.getEBoolean(), "validateInfluenzaCaseReportInfluenzaImmunizationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaCaseReportEClass, ecorePackage.getEBoolean(), "validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaCaseReportEClass, ecorePackage.getEBoolean(), "validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaCaseReportEClass, ecorePackage.getEBoolean(), "validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaCaseReportEClass, ecorePackage.getEBoolean(), "validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaCaseReportEClass, this.getInfluenzaImmunizationSection(), "getInfluenzaImmunizationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(influenzaCaseReportEClass, this.getInfluenzaPHCRClinicalInformationSection(), "getInfluenzaPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(influenzaCaseReportEClass, this.getInfluenzaPHCRTreatmentInformationSection(), "getInfluenzaPHCRTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(influenzaCaseReportEClass, this.getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(), "getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(influenzaCaseReportEClass, this.getInfluenzaPHCRSocialHistorySection(), "getInfluenzaPHCRSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaImmunizationSectionEClass, InfluenzaImmunizationSection.class, "InfluenzaImmunizationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaImmunizationSectionEClass, ecorePackage.getEBoolean(), "validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaImmunizationSectionEClass, this.getInfluenzaImmunizationActivity(), "getInfluenzaImmunizationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaImmunizationActivityEClass, InfluenzaImmunizationActivity.class, "InfluenzaImmunizationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influenzaPHCRClinicalInformationSectionEClass, InfluenzaPHCRClinicalInformationSection.class, "InfluenzaPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateInfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaPHCRClinicalInformationSectionEClass, this.getInfluenzaCaseObservation(), "getInfluenzaCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaCaseObservationEClass, InfluenzaCaseObservation.class, "InfluenzaCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaCaseObservationEClass, ecorePackage.getEBoolean(), "validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaCaseObservationEClass, this.getInfluenzaSignsAndSymptomsObservation(), "getInfluenzaSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaSignsAndSymptomsObservationEClass, InfluenzaSignsAndSymptomsObservation.class, "InfluenzaSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influenzaPHCRTreatmentInformationSectionEClass, InfluenzaPHCRTreatmentInformationSection.class, "InfluenzaPHCRTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaPHCRTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaPHCRTreatmentInformationSectionEClass, this.getInfluenzaTherapeuticRegimenAct(), "getInfluenzaTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaTherapeuticRegimenActEClass, InfluenzaTherapeuticRegimenAct.class, "InfluenzaTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaTherapeuticRegimenActEClass, this.getInfluenzaTreatmentGivenSubstanceAdministration(), "getInfluenzaTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(influenzaTherapeuticRegimenActEClass, this.getInfluenzaTreatmentNotGivenSubstanceAdministration(), "getInfluenzaTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaTreatmentGivenSubstanceAdministrationEClass, InfluenzaTreatmentGivenSubstanceAdministration.class, "InfluenzaTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influenzaTreatmentNotGivenSubstanceAdministrationEClass, InfluenzaTreatmentNotGivenSubstanceAdministration.class, "InfluenzaTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection.class, "InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, ecorePackage.getEBoolean(), "validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, ecorePackage.getEBoolean(), "validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, this.getInfluenzaResultObservation(), "getInfluenzaResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, this.getInfluenzaImagingObservation(), "getInfluenzaImagingObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaResultObservationEClass, InfluenzaResultObservation.class, "InfluenzaResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaResultObservationEClass, ecorePackage.getEBoolean(), "validateInfluenzaResultObservationInterpretationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(influenzaImagingObservationEClass, InfluenzaImagingObservation.class, "InfluenzaImagingObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaImagingObservationEClass, ecorePackage.getEBoolean(), "validateInfluenzaImagingObservationMethodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(influenzaPHCRSocialHistorySectionEClass, InfluenzaPHCRSocialHistorySection.class, "InfluenzaPHCRSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(influenzaPHCRSocialHistorySectionEClass, this.getInfluenzaEmploymentStatusObservation(), "getInfluenzaEmploymentStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(influenzaPHCRSocialHistorySectionEClass, this.getInfluenzaPossibleExposureLocationAct(), "getInfluenzaPossibleExposureLocationActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(influenzaEmploymentStatusObservationEClass, InfluenzaEmploymentStatusObservation.class, "InfluenzaEmploymentStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaEmploymentStatusObservationEClass, ecorePackage.getEBoolean(), "validateInfluenzaEmploymentStatusObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaEmploymentStatusObservationEClass, ecorePackage.getEBoolean(), "validateInfluenzaEmploymentStatusObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaEmploymentStatusObservationEClass, ecorePackage.getEBoolean(), "validateInfluenzaEmploymentStatusObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(influenzaPossibleExposureLocationActEClass, InfluenzaPossibleExposureLocationAct.class, "InfluenzaPossibleExposureLocationAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(influenzaPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateInfluenzaPossibleExposureLocationActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateInfluenzaPossibleExposureLocationActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(influenzaPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateInfluenzaPossibleExposureLocationActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(influenzaImmunizationProductEClass, InfluenzaImmunizationProduct.class, "InfluenzaImmunizationProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (influenzaCaseReportEClass, 
		   source, 
		   new String[] {
			 "title.mixed", "Public Health Case Report - Influenza",
			 "templateId.root", "2.16.840.1.113883.10.20.15.1.11",
			 "constraints.validation.error", "InfluenzaCaseReportTemplateId InfluenzaCaseReportTitle InfluenzaCaseReportInfluenzaPHCRClinicalInformationSection",
			 "constraints.validation.warning", "InfluenzaCaseReportInfluenzaImmunizationSection InfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection InfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection InfluenzaCaseReportInfluenzaPHCRSocialHistorySection"
		   });																																					
		addAnnotation
		  (influenzaImmunizationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.47",
			 "constraints.validation.error", "InfluenzaImmunizationSectionTemplateId InfluenzaImmunizationSectionInfluenzaImmunizationActivity"
		   });									
		addAnnotation
		  (influenzaImmunizationActivityEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.77",
			 "constraints.validation.error", "InfluenzaImmunizationActivityTemplateId"
		   });			
		addAnnotation
		  (influenzaPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.50",
			 "constraints.validation.error", "InfluenzaPHCRClinicalInformationSectionTemplateId InfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation"
		   });									
		addAnnotation
		  (influenzaCaseObservationEClass, 
		   source, 
		   new String[] {
			 "value.codeSystemName", "SNOMEDCT",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.78",
			 "constraints.validation.error", "InfluenzaCaseObservationTemplateId CaseObservationValue",
			 "constraints.validation.warning", "InfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation",
			 "value.codeSystem", "2.16.840.1.113883.6.96"
		   });									
		addAnnotation
		  (influenzaSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
			 "value.codeSystemName", "SNOMEDCT",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.74",
			 "constraints.validation.error", "InfluenzaSignsAndSymptomsObservationTemplateId SignsAndSymptomsObservationValue",
			 "value.codeSystem", "2.16.840.1.113883.6.96"
		   });			
		addAnnotation
		  (influenzaPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.48",
			 "constraints.validation.error", "InfluenzaPHCRTreatmentInformationSectionTemplateId InfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct"
		   });									
		addAnnotation
		  (influenzaTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.75",
			 "constraints.validation.error", "InfluenzaTherapeuticRegimenActTemplateId",
			 "constraints.validation.warning", "InfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration",
			 "constraints.validation.info", "InfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration"
		   });															
		addAnnotation
		  (influenzaTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.79",
			 "constraints.validation.error", "InfluenzaTreatmentGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (influenzaTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.80",
			 "constraints.validation.error", "InfluenzaTreatmentNotGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.51",
			 "constraints.validation.error", "InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionTemplateId",
			 "constraints.validation.warning", "InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation",
			 "constraints.validation.info", "InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation"
		   });															
		addAnnotation
		  (influenzaResultObservationEClass, 
		   source, 
		   new String[] {
			 "interpretationCode.codeSystemName", "SNOMEDCT",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.81",
			 "constraints.validation.error", "InfluenzaResultObservationTemplateId ResultObservationCode",
			 "code.codeSystemName", "LOINC",
			 "constraints.validation.warning", "InfluenzaResultObservationInterpretationCode",
			 "interpretationCode.codeSystem", "2.16.840.1.113883.6.96"
		   });							
		addAnnotation
		  (influenzaImagingObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.83",
			 "constraints.validation.error", "InfluenzaImagingObservationTemplateId",
			 "constraints.validation.info", "InfluenzaImagingObservationMethodCode"
		   });							
		addAnnotation
		  (influenzaPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.49",
			 "constraints.validation.error", "InfluenzaPHCRSocialHistorySectionTemplateId InfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation",
			 "constraints.validation.warning", "InfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation InfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct"
		   });															
		addAnnotation
		  (influenzaEmploymentStatusObservationEClass, 
		   source, 
		   new String[] {
			 "value.codeSystemName", "SNOMEDCT",
			 "code.codeSystem", "2.16.840.1.113883.5.6",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.84",
			 "constraints.validation.error", "InfluenzaEmploymentStatusObservationTemplateId InfluenzaEmploymentStatusObservationCode InfluenzaEmploymentStatusObservationValue",
			 "code.codeSystemName", "HL7ActClass",
			 "classCode", "OBS",
			 "code.code", "ASSERTION",
			 "moodCode", "EVN",
			 "value.codeSystem", "2.16.840.1.113883.6.96"
		   });														
		addAnnotation
		  (influenzaPossibleExposureLocationActEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.82",
			 "constraints.validation.error", "InfluenzaPossibleExposureLocationActTemplateId InfluenzaPossibleExposureLocationActCode InfluenzaPossibleExposureLocationActStatusCode",
			 "code.codeSystemName", "SNOMEDCT",
			 "classCode", "ACT",
			 "code.code", "413350009",
			 "moodCode", "EVN"
		   });														
		addAnnotation
		  (influenzaImmunizationProductEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.76",
			 "constraints.validation.error", "InfluenzaImmunizationProduct TemplateId"
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
		  (influenzaCaseReportEClass, 
		   source, 
		   new String[] {
		   });																																					
		addAnnotation
		  (influenzaImmunizationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (influenzaImmunizationActivityEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (influenzaPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (influenzaCaseObservationEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (influenzaSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (influenzaPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (influenzaTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (influenzaTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (influenzaTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (influenzaResultObservationEClass, 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (influenzaImagingObservationEClass, 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (influenzaPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
		   });																																									
		addAnnotation
		  (influenzaImmunizationProductEClass, 
		   source, 
		   new String[] {
		   });
	}

} //fluPackageImpl
