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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CocciPackageImpl extends EPackageImpl implements CocciPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesCaseReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesPHCRSocialHistorySectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesPossibleExposureLocationActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesPHCRClinicalInformationSectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesCaseObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesSignsAndSymptomsObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesImmunosuppressedMedicalConditionProblemObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesPHCRTreatmentInformationSectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesTherapeuticRegimenActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesPHCRRelevantDxTestsSectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesResultObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesResultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesTreatmentGivenSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coccidioidesTreatmentNotGivenSubstanceAdministrationEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CocciPackageImpl() {
		super(eNS_URI, CocciFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CocciPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CocciPackage init() {
		if (isInited) return (CocciPackage)EPackage.Registry.INSTANCE.getEPackage(CocciPackage.eNS_URI);

		// Obtain or create and register package
		CocciPackageImpl theCocciPackage = (CocciPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CocciPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CocciPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PhcrPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCocciPackage.createPackageContents();

		// Initialize created meta-data
		theCocciPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCocciPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CocciValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCocciPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CocciPackage.eNS_URI, theCocciPackage);
		return theCocciPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesCaseReport() {
		return coccidioidesCaseReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesPHCRSocialHistorySection() {
		return coccidioidesPHCRSocialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesPossibleExposureLocationAct() {
		return coccidioidesPossibleExposureLocationActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesPHCRClinicalInformationSection() {
		return coccidioidesPHCRClinicalInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesCaseObservation() {
		return coccidioidesCaseObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesSignsAndSymptomsObservation() {
		return coccidioidesSignsAndSymptomsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesImmunosuppressedMedicalConditionHistoryObservation() {
		return coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesImmunosuppressedMedicalConditionProblemObservation() {
		return coccidioidesImmunosuppressedMedicalConditionProblemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesPHCRTreatmentInformationSection() {
		return coccidioidesPHCRTreatmentInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesTherapeuticRegimenAct() {
		return coccidioidesTherapeuticRegimenActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesPHCRRelevantDxTestsSection() {
		return coccidioidesPHCRRelevantDxTestsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesResultObservation() {
		return coccidioidesResultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesResultOrganizer() {
		return coccidioidesResultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesTreatmentGivenSubstanceAdministration() {
		return coccidioidesTreatmentGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoccidioidesTreatmentNotGivenSubstanceAdministration() {
		return coccidioidesTreatmentNotGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CocciFactory getCocciFactory() {
		return (CocciFactory)getEFactoryInstance();
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
		coccidioidesCaseReportEClass = createEClass(COCCIDIOIDES_CASE_REPORT);

		coccidioidesPHCRSocialHistorySectionEClass = createEClass(COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION);

		coccidioidesPossibleExposureLocationActEClass = createEClass(COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT);

		coccidioidesPHCRClinicalInformationSectionEClass = createEClass(COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION);

		coccidioidesCaseObservationEClass = createEClass(COCCIDIOIDES_CASE_OBSERVATION);

		coccidioidesSignsAndSymptomsObservationEClass = createEClass(COCCIDIOIDES_SIGNS_AND_SYMPTOMS_OBSERVATION);

		coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass = createEClass(COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION);

		coccidioidesImmunosuppressedMedicalConditionProblemObservationEClass = createEClass(COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION);

		coccidioidesPHCRTreatmentInformationSectionEClass = createEClass(COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION);

		coccidioidesTherapeuticRegimenActEClass = createEClass(COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT);

		coccidioidesTreatmentGivenSubstanceAdministrationEClass = createEClass(COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

		coccidioidesTreatmentNotGivenSubstanceAdministrationEClass = createEClass(COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);

		coccidioidesPHCRRelevantDxTestsSectionEClass = createEClass(COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION);

		coccidioidesResultObservationEClass = createEClass(COCCIDIOIDES_RESULT_OBSERVATION);

		coccidioidesResultOrganizerEClass = createEClass(COCCIDIOIDES_RESULT_ORGANIZER);
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
		coccidioidesCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
		coccidioidesPHCRSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
		coccidioidesPossibleExposureLocationActEClass.getESuperTypes().add(theCDAPackage.getAct());
		coccidioidesPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
		coccidioidesCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
		coccidioidesSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
		coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantMedicalConditionHistoryObservation());
		coccidioidesImmunosuppressedMedicalConditionProblemObservationEClass.getESuperTypes().add(theCCDPackage.getProblemObservation());
		coccidioidesPHCRTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
		coccidioidesTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
		coccidioidesTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
		coccidioidesTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());
		coccidioidesPHCRRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
		coccidioidesResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());
		coccidioidesResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());

		// Initialize classes and features; add operations and parameters
		initEClass(coccidioidesCaseReportEClass, CoccidioidesCaseReport.class, "CoccidioidesCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(coccidioidesCaseReportEClass, ecorePackage.getEBoolean(), "validateCoccidioidesCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesCaseReportEClass, ecorePackage.getEBoolean(), "validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesCaseReportEClass, ecorePackage.getEBoolean(), "validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesCaseReportEClass, ecorePackage.getEBoolean(), "validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesCaseReportEClass, ecorePackage.getEBoolean(), "validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesCaseReportEClass, this.getCoccidioidesPHCRSocialHistorySection(), "getCoccidioidesPHCRSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(coccidioidesCaseReportEClass, this.getCoccidioidesPHCRClinicalInformationSection(), "getCoccidioidesPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(coccidioidesCaseReportEClass, this.getCoccidioidesPHCRTreatmentInformationSection(), "getCoccidioidesPHCRTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(coccidioidesCaseReportEClass, this.getCoccidioidesPHCRRelevantDxTestsSection(), "getCoccidioidesPHCRRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesPHCRSocialHistorySectionEClass, CoccidioidesPHCRSocialHistorySection.class, "CoccidioidesPHCRSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesPHCRSocialHistorySectionEClass, this.getCoccidioidesPossibleExposureLocationAct(), "getCoccidioidesPossibleExposureLocationActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesPossibleExposureLocationActEClass, CoccidioidesPossibleExposureLocationAct.class, "CoccidioidesPossibleExposureLocationAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPossibleExposureLocationActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPossibleExposureLocationActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPossibleExposureLocationActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPossibleExposureLocationActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesPossibleExposureLocationActEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPossibleExposureLocationActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coccidioidesPHCRClinicalInformationSectionEClass, CoccidioidesPHCRClinicalInformationSection.class, "CoccidioidesPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesPHCRClinicalInformationSectionEClass, this.getCoccidioidesCaseObservation(), "getCoccidioidesCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(coccidioidesPHCRClinicalInformationSectionEClass, this.getCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(), "getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesCaseObservationEClass, CoccidioidesCaseObservation.class, "CoccidioidesCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(coccidioidesCaseObservationEClass, this.getCoccidioidesSignsAndSymptomsObservation(), "getCoccidioidesSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesSignsAndSymptomsObservationEClass, CoccidioidesSignsAndSymptomsObservation.class, "CoccidioidesSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass, CoccidioidesImmunosuppressedMedicalConditionHistoryObservation.class, "CoccidioidesImmunosuppressedMedicalConditionHistoryObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass, ecorePackage.getEBoolean(), "validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass, this.getCoccidioidesImmunosuppressedMedicalConditionProblemObservation(), "getCoccidioidesImmunosuppressedMedicalConditionProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesImmunosuppressedMedicalConditionProblemObservationEClass, CoccidioidesImmunosuppressedMedicalConditionProblemObservation.class, "CoccidioidesImmunosuppressedMedicalConditionProblemObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coccidioidesPHCRTreatmentInformationSectionEClass, CoccidioidesPHCRTreatmentInformationSection.class, "CoccidioidesPHCRTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesPHCRTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesPHCRTreatmentInformationSectionEClass, this.getCoccidioidesTherapeuticRegimenAct(), "getCoccidioidesTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesTherapeuticRegimenActEClass, CoccidioidesTherapeuticRegimenAct.class, "CoccidioidesTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesTherapeuticRegimenActEClass, this.getCoccidioidesTreatmentGivenSubstanceAdministration(), "getCoccidioidesTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(coccidioidesTherapeuticRegimenActEClass, this.getCoccidioidesTreatmentNotGivenSubstanceAdministration(), "getCoccidioidesTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesTreatmentGivenSubstanceAdministrationEClass, CoccidioidesTreatmentGivenSubstanceAdministration.class, "CoccidioidesTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coccidioidesTreatmentNotGivenSubstanceAdministrationEClass, CoccidioidesTreatmentNotGivenSubstanceAdministration.class, "CoccidioidesTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coccidioidesPHCRRelevantDxTestsSectionEClass, CoccidioidesPHCRRelevantDxTestsSection.class, "CoccidioidesPHCRRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesPHCRRelevantDxTestsSectionEClass, this.getCoccidioidesResultObservation(), "getCoccidioidesResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(coccidioidesPHCRRelevantDxTestsSectionEClass, this.getCoccidioidesResultOrganizer(), "getCoccidioidesResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(coccidioidesResultObservationEClass, CoccidioidesResultObservation.class, "CoccidioidesResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coccidioidesResultOrganizerEClass, CoccidioidesResultOrganizer.class, "CoccidioidesResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(coccidioidesResultOrganizerEClass, ecorePackage.getEBoolean(), "validateCoccidioidesResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(coccidioidesResultOrganizerEClass, ecorePackage.getEBoolean(), "validateCoccidioidesResultOrganizerCoccidioidesResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(coccidioidesResultOrganizerEClass, this.getCoccidioidesResultObservation(), "getCoccidioidesResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

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
		  (coccidioidesCaseReportEClass, 
		   source, 
		   new String[] {
			 "title.mixed", "Public Health Case Report - Coccidioidomycosis",
			 "templateId.root", "2.16.840.1.113883.10.20.15.1.10",
			 "constraints.validation.error", "CoccidioidesCaseReportTemplateId CoccidioidesCaseReportTitle CoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection",
			 "constraints.validation.warning", "CoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection CoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection CoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection"
		   });																															
		addAnnotation
		  (coccidioidesPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.29",
			 "constraints.validation.error", "CoccidioidesPHCRSocialHistorySectionTemplateId",
			 "constraints.validation.info", "CoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct"
		   });									
		addAnnotation
		  (coccidioidesPossibleExposureLocationActEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.86",
			 "code.displayName", "Finding with explicit context",
			 "constraints.validation.error", "CoccidioidesPossibleExposureLocationActTemplateId CoccidioidesPossibleExposureLocationActClassCode CoccidioidesPossibleExposureLocationActCode CoccidioidesPossibleExposureLocationActMoodCode CoccidioidesPossibleExposureLocationActStatusCode",
			 "code.codeSystemName", "SNOMEDCT",
			 "classCode", "ACT",
			 "code.code", "413350009",
			 "moodCode", "EVN"
		   });																						
		addAnnotation
		  (coccidioidesPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.30",
			 "constraints.validation.error", "CoccidioidesPHCRClinicalInformationSectionTemplateId CoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation",
			 "constraints.validation.info", "CoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation"
		   });															
		addAnnotation
		  (coccidioidesCaseObservationEClass, 
		   source, 
		   new String[] {
			 "value.displayName", "Coccidioidomycosis",
			 "value.codeSystemName", "SNOMEDCT",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.87",
			 "value.code", "60826002",
			 "constraints.validation.error", "CoccidioidesCaseObservationTemplateId CaseObservationValue",
			 "value.codeSystem", "2.16.840.1.113883.6.96"
		   });					
		addAnnotation
		  (coccidioidesSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.88",
			 "constraints.validation.error", "CoccidioidesSignsAndSymptomsObservationTemplateId"
		   });			
		addAnnotation
		  (coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.94",
			 "constraints.validation.error", "CoccidioidesImmunosuppressedMedicalConditionHistoryObservationTemplateId",
			 "constraints.validation.warning", "CoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation"
		   });									
		addAnnotation
		  (coccidioidesImmunosuppressedMedicalConditionProblemObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.95",
			 "constraints.validation.error", "CoccidioidesImmunosuppressedMedicalConditionProblemObservationTemplateId"
		   });			
		addAnnotation
		  (coccidioidesPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.31",
			 "constraints.validation.error", "CoccidioidesPHCRTreatmentInformationSectionTemplateId CoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct"
		   });									
		addAnnotation
		  (coccidioidesTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.89",
			 "constraints.validation.error", "CoccidioidesTherapeuticRegimenActTemplateId",
			 "constraints.validation.warning", "CoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration",
			 "constraints.validation.info", "CoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration"
		   });															
		addAnnotation
		  (coccidioidesTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.90",
			 "constraints.validation.error", "CoccidioidesTreatmentGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (coccidioidesTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.91",
			 "constraints.validation.error", "CoccidioidesTreatmentNotGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (coccidioidesPHCRRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.32",
			 "constraints.validation.error", "CoccidioidesPHCRRelevantDxTestsSectionTemplateId",
			 "constraints.validation.warning", "CoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation",
			 "constraints.validation.info", "CoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer"
		   });															
		addAnnotation
		  (coccidioidesResultObservationEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "Code System OID",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.93",
			 "constraints.validation.error", "CoccidioidesResultObservationTemplateId ResultObservationCode",
			 "code.codeSystemName", "Code System Name"
		   });			
		addAnnotation
		  (coccidioidesResultOrganizerEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.92",
			 "constraints.validation.error", "CoccidioidesResultOrganizerTemplateId CoccidioidesResultOrganizerCode CoccidioidesResultOrganizerCoccidioidesResultObservation"
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
		  (coccidioidesCaseReportEClass, 
		   source, 
		   new String[] {
		   });																															
		addAnnotation
		  (coccidioidesPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
		   });																														
		addAnnotation
		  (coccidioidesPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (coccidioidesCaseObservationEClass, 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (coccidioidesSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (coccidioidesImmunosuppressedMedicalConditionHistoryObservationEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (coccidioidesImmunosuppressedMedicalConditionProblemObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (coccidioidesPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (coccidioidesTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (coccidioidesTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (coccidioidesTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (coccidioidesPHCRRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (coccidioidesResultObservationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (coccidioidesResultOrganizerEClass, 
		   source, 
		   new String[] {
		   });										
	}

} //CocciPackageImpl
