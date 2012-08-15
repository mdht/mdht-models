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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;

import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoFactory;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrepPneumoPackageImpl extends EPackageImpl implements StrepPneumoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoCaseReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoPHCRClinicalInformationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoCaseObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoSignsAndSymptomsObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoPHCRTreatmentInformationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoTherapeuticRegimenActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoTreatmentGivenSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoTreatmentNotGivenSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoResultObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoResultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoSocialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoPossibleExposureLocationActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoImmunizationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoImmunizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strepPneumoImmunizationProductEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StrepPneumoPackageImpl() {
		super(eNS_URI, StrepPneumoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StrepPneumoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StrepPneumoPackage init() {
		if (isInited) return (StrepPneumoPackage)EPackage.Registry.INSTANCE.getEPackage(StrepPneumoPackage.eNS_URI);

		// Obtain or create and register package
		StrepPneumoPackageImpl theStrepPneumoPackage = (StrepPneumoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StrepPneumoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StrepPneumoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PhcrPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStrepPneumoPackage.createPackageContents();

		// Initialize created meta-data
		theStrepPneumoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStrepPneumoPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StrepPneumoValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStrepPneumoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StrepPneumoPackage.eNS_URI, theStrepPneumoPackage);
		return theStrepPneumoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoCaseReport() {
		return strepPneumoCaseReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoPHCRClinicalInformationSection() {
		return strepPneumoPHCRClinicalInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoCaseObservation() {
		return strepPneumoCaseObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoSignsAndSymptomsObservation() {
		return strepPneumoSignsAndSymptomsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoPHCRTreatmentInformationSection() {
		return strepPneumoPHCRTreatmentInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoTherapeuticRegimenAct() {
		return strepPneumoTherapeuticRegimenActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoTreatmentGivenSubstanceAdministration() {
		return strepPneumoTreatmentGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoTreatmentNotGivenSubstanceAdministration() {
		return strepPneumoTreatmentNotGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
		return strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoResultObservation() {
		return strepPneumoResultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoResultOrganizer() {
		return strepPneumoResultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoSocialHistorySection() {
		return strepPneumoSocialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoPossibleExposureLocationAct() {
		return strepPneumoPossibleExposureLocationActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoImmunizationSection() {
		return strepPneumoImmunizationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoImmunizationActivity() {
		return strepPneumoImmunizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrepPneumoImmunizationProduct() {
		return strepPneumoImmunizationProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoFactory getStrepPneumoFactory() {
		return (StrepPneumoFactory)getEFactoryInstance();
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
		strepPneumoCaseReportEClass = createEClass(STREP_PNEUMO_CASE_REPORT);

		strepPneumoPHCRClinicalInformationSectionEClass = createEClass(STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION);

		strepPneumoCaseObservationEClass = createEClass(STREP_PNEUMO_CASE_OBSERVATION);

		strepPneumoSignsAndSymptomsObservationEClass = createEClass(STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION);

		strepPneumoPHCRTreatmentInformationSectionEClass = createEClass(STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION);

		strepPneumoTherapeuticRegimenActEClass = createEClass(STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT);

		strepPneumoTreatmentGivenSubstanceAdministrationEClass = createEClass(STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

		strepPneumoTreatmentNotGivenSubstanceAdministrationEClass = createEClass(STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);

		strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass = createEClass(STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);

		strepPneumoResultObservationEClass = createEClass(STREP_PNEUMO_RESULT_OBSERVATION);

		strepPneumoResultOrganizerEClass = createEClass(STREP_PNEUMO_RESULT_ORGANIZER);

		strepPneumoSocialHistorySectionEClass = createEClass(STREP_PNEUMO_SOCIAL_HISTORY_SECTION);

		strepPneumoPossibleExposureLocationActEClass = createEClass(STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT);

		strepPneumoImmunizationSectionEClass = createEClass(STREP_PNEUMO_IMMUNIZATION_SECTION);

		strepPneumoImmunizationActivityEClass = createEClass(STREP_PNEUMO_IMMUNIZATION_ACTIVITY);

		strepPneumoImmunizationProductEClass = createEClass(STREP_PNEUMO_IMMUNIZATION_PRODUCT);
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
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
		CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		strepPneumoCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
		strepPneumoPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
		strepPneumoCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
		strepPneumoSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
		strepPneumoPHCRTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
		strepPneumoTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
		strepPneumoTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
		strepPneumoTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());
		strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
		strepPneumoResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
		strepPneumoResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
		strepPneumoSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
		strepPneumoPossibleExposureLocationActEClass.getESuperTypes().add(theCDAPackage.getAct());
		strepPneumoImmunizationSectionEClass.getESuperTypes().add(theCCDPackage.getImmunizationsSection());
		strepPneumoImmunizationActivityEClass.getESuperTypes().add(theCCDPackage.getMedicationActivity());
		strepPneumoImmunizationProductEClass.getESuperTypes().add(theCDAPackage.getProduct());

		// Initialize classes and features; add operations and parameters
		initEClass(strepPneumoCaseReportEClass, StrepPneumoCaseReport.class, "StrepPneumoCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(strepPneumoCaseReportEClass, ecorePackage.getEBoolean(), "validateStrepPneumoCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoCaseReportEClass, ecorePackage.getEBoolean(), "validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoCaseReportEClass, ecorePackage.getEBoolean(), "validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoCaseReportEClass, ecorePackage.getEBoolean(), "validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoCaseReportEClass, ecorePackage.getEBoolean(), "validateStrepPneumoCaseReportStrepPneumoSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoCaseReportEClass, ecorePackage.getEBoolean(), "validateStrepPneumoCaseReportStrepPneumoImmunizationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoCaseReportEClass, this.getStrepPneumoPHCRClinicalInformationSection(), "getStrepPneumoPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(strepPneumoCaseReportEClass, this.getStrepPneumoPHCRTreatmentInformationSection(), "getStrepPneumoPHCRTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(strepPneumoCaseReportEClass, this.getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(), "getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(strepPneumoCaseReportEClass, this.getStrepPneumoSocialHistorySection(), "getStrepPneumoSocialHistorySections", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(strepPneumoCaseReportEClass, this.getStrepPneumoImmunizationSection(), "getStrepPneumoImmunizationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoPHCRClinicalInformationSectionEClass, StrepPneumoPHCRClinicalInformationSection.class, "StrepPneumoPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoPHCRClinicalInformationSectionEClass, this.getStrepPneumoCaseObservation(), "getStrepPneumoCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoCaseObservationEClass, StrepPneumoCaseObservation.class, "StrepPneumoCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoCaseObservationEClass, ecorePackage.getEBoolean(), "validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoCaseObservationEClass, this.getStrepPneumoSignsAndSymptomsObservation(), "getStrepPneumoSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoSignsAndSymptomsObservationEClass, StrepPneumoSignsAndSymptomsObservation.class, "StrepPneumoSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strepPneumoPHCRTreatmentInformationSectionEClass, StrepPneumoPHCRTreatmentInformationSection.class, "StrepPneumoPHCRTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoPHCRTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoPHCRTreatmentInformationSectionEClass, this.getStrepPneumoTherapeuticRegimenAct(), "getStrepPneumoTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoTherapeuticRegimenActEClass, StrepPneumoTherapeuticRegimenAct.class, "StrepPneumoTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoTherapeuticRegimenActEClass, this.getStrepPneumoTreatmentGivenSubstanceAdministration(), "getStrepPneumoTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(strepPneumoTherapeuticRegimenActEClass, this.getStrepPneumoTreatmentNotGivenSubstanceAdministration(), "getStrepPneumoTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoTreatmentGivenSubstanceAdministrationEClass, StrepPneumoTreatmentGivenSubstanceAdministration.class, "StrepPneumoTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strepPneumoTreatmentNotGivenSubstanceAdministrationEClass, StrepPneumoTreatmentNotGivenSubstanceAdministration.class, "StrepPneumoTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection.class, "StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, ecorePackage.getEBoolean(), "validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, ecorePackage.getEBoolean(), "validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, this.getStrepPneumoResultObservation(), "getStrepPneumoResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, this.getStrepPneumoResultOrganizer(), "getStrepPneumoResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoResultObservationEClass, StrepPneumoResultObservation.class, "StrepPneumoResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strepPneumoResultOrganizerEClass, StrepPneumoResultOrganizer.class, "StrepPneumoResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoResultOrganizerEClass, ecorePackage.getEBoolean(), "validateStrepPneumoResultOrganizerStrepPneumoResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoResultOrganizerEClass, this.getStrepPneumoResultObservation(), "getStrepPneumoResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoSocialHistorySectionEClass, StrepPneumoSocialHistorySection.class, "StrepPneumoSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoSocialHistorySectionEClass, this.getStrepPneumoPossibleExposureLocationAct(), "getStrepPneumoPossibleExposureLocationAndTypeActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoPossibleExposureLocationActEClass, StrepPneumoPossibleExposureLocationAct.class, "StrepPneumoPossibleExposureLocationAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateStrepPneumoPossibleExposureLocationActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateStrepPneumoPossibleExposureLocationActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateStrepPneumoPossibleExposureLocationActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateStrepPneumoPossibleExposureLocationActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(strepPneumoPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateStrepPneumoPossibleExposureLocationActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strepPneumoImmunizationSectionEClass, StrepPneumoImmunizationSection.class, "StrepPneumoImmunizationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoImmunizationSectionEClass, ecorePackage.getEBoolean(), "validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(strepPneumoImmunizationSectionEClass, this.getStrepPneumoImmunizationActivity(), "getStrepPneumoImmunizationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(strepPneumoImmunizationActivityEClass, StrepPneumoImmunizationActivity.class, "StrepPneumoImmunizationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strepPneumoImmunizationProductEClass, StrepPneumoImmunizationProduct.class, "StrepPneumoImmunizationProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strepPneumoImmunizationProductEClass, ecorePackage.getEBoolean(), "validateStrepPneumoImmunizationProductTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		  (strepPneumoCaseReportEClass, 
		   source, 
		   new String[] {
			 "title.mixed", "Public Health Case Report - Streptococcus pneumoniae",
			 "templateId.root", "2.16.840.1.113883.10.20.15.1.12",
			 "constraints.validation.error", "StrepPneumoCaseReportTemplateId StrepPneumoCaseReportTitle StrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection",
			 "constraints.validation.warning", "StrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection StrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection StrepPneumoCaseReportStrepPneumoSocialHistorySection StrepPneumoCaseReportStrepPneumoImmunizationSection"
		   });																																					
		addAnnotation
		  (strepPneumoPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.55",
			 "constraints.validation.error", "StrepPneumoPHCRClinicalInformationSectionTemplateId StrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation"
		   });									
		addAnnotation
		  (strepPneumoCaseObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.125",
			 "constraints.validation.error", "StrepPneumoCaseObservationTemplateId",
			 "constraints.validation.warning", "StrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation"
		   });									
		addAnnotation
		  (strepPneumoSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
			 "value.codeSystemName", "SNOMEDCT",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.121",
			 "constraints.validation.error", "StrepPneumoSignsAndSymptomsObservationTemplateId SignsAndSymptomsObservationValue",
			 "value.codeSystem", "2.16.840.1.113883.6.96"
		   });			
		addAnnotation
		  (strepPneumoPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.53",
			 "constraints.validation.error", "StrepPneumoPHCRTreatmentInformationSectionTemplateId StrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct"
		   });									
		addAnnotation
		  (strepPneumoTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.122",
			 "constraints.validation.error", "StrepPneumoTherapeuticRegimenActTemplateId",
			 "constraints.validation.warning", "StrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration",
			 "constraints.validation.info", "StrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration"
		   });															
		addAnnotation
		  (strepPneumoTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.126",
			 "constraints.validation.error", "StrepPneumoTreatmentGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (strepPneumoTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.127",
			 "constraints.validation.error", "StrepPneumoTreatmentNotGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.56",
			 "constraints.validation.error", "StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionTemplateId",
			 "constraints.validation.warning", "StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation",
			 "constraints.validation.info", "StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer"
		   });															
		addAnnotation
		  (strepPneumoResultObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.128",
			 "constraints.validation.error", "StrepPneumoResultObservationTemplateId"
		   });			
		addAnnotation
		  (strepPneumoResultOrganizerEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.130",
			 "constraints.validation.error", "StrepPneumoResultOrganizerTemplateId StrepPneumoResultOrganizerStrepPneumoResultObservation"
		   });									
		addAnnotation
		  (strepPneumoSocialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.54",
			 "constraints.validation.error", "StrepPneumoSocialHistorySectionTemplateId",
			 "constraints.validation.warning", "StrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct"
		   });									
		addAnnotation
		  (strepPneumoPossibleExposureLocationActEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.129",
			 "constraints.validation.error", "StrepPneumoPossibleExposureLocationActTemplateId StrepPneumoPossibleExposureLocationActClassCode StrepPneumoPossibleExposureLocationActCode StrepPneumoPossibleExposureLocationActMoodCode StrepPneumoPossibleExposureLocationActStatusCode",
			 "code.codeSystemName", "SNOMEDCT",
			 "classCode", "ACT",
			 "code.code", "413350009",
			 "moodCode", "EVN"
		   });																						
		addAnnotation
		  (strepPneumoImmunizationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.52",
			 "constraints.validation.error", "StrepPneumoImmunizationSectionTemplateId StrepPneumoImmunizationSectionStrepPneumoImmunizationActivity"
		   });									
		addAnnotation
		  (strepPneumoImmunizationActivityEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.124",
			 "constraints.validation.error", "StrepPneumoImmunizationActivityTemplateId"
		   });				
		addAnnotation
		  (strepPneumoImmunizationProductEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.123",
			 "constraints.validation.error", "StrepPneumoImmunizationProductTemplateId"
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
		  (strepPneumoCaseReportEClass, 
		   source, 
		   new String[] {
		   });																																					
		addAnnotation
		  (strepPneumoPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (strepPneumoCaseObservationEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (strepPneumoSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (strepPneumoPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (strepPneumoTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (strepPneumoTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (strepPneumoTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (strepPneumoResultObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (strepPneumoResultOrganizerEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (strepPneumoSocialHistorySectionEClass, 
		   source, 
		   new String[] {
		   });																														
		addAnnotation
		  (strepPneumoImmunizationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (strepPneumoImmunizationActivityEClass, 
		   source, 
		   new String[] {
		   });						
	}

} //StrepPneumoPackageImpl
