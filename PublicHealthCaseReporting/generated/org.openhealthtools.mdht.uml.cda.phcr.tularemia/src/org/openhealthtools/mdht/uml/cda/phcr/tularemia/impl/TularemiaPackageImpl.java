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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TularemiaPackageImpl extends EPackageImpl implements TularemiaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaCaseReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaPHCRSocialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaPossibleExposureLocationAndTypeActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaPHCRClinicalInformationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaCaseObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaSignsAndSymptomsObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationOfLesionObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaPHCRTreatmentInformationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaTherapeuticRegimenActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaTreatmentGivenSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaTreatmentNotGivenSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaPHCRRelevantDxTestsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaResultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tularemiaResultObservationEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TularemiaPackageImpl() {
		super(eNS_URI, TularemiaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TularemiaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TularemiaPackage init() {
		if (isInited) return (TularemiaPackage)EPackage.Registry.INSTANCE.getEPackage(TularemiaPackage.eNS_URI);

		// Obtain or create and register package
		TularemiaPackageImpl theTularemiaPackage = (TularemiaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TularemiaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TularemiaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PhcrPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTularemiaPackage.createPackageContents();

		// Initialize created meta-data
		theTularemiaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTularemiaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TularemiaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTularemiaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TularemiaPackage.eNS_URI, theTularemiaPackage);
		return theTularemiaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaCaseReport() {
		return tularemiaCaseReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaPHCRSocialHistorySection() {
		return tularemiaPHCRSocialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaPossibleExposureLocationAndTypeAct() {
		return tularemiaPossibleExposureLocationAndTypeActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaPHCRClinicalInformationSection() {
		return tularemiaPHCRClinicalInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaCaseObservation() {
		return tularemiaCaseObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaSignsAndSymptomsObservation() {
		return tularemiaSignsAndSymptomsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationOfLesionObservation() {
		return locationOfLesionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaPHCRTreatmentInformationSection() {
		return tularemiaPHCRTreatmentInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaTherapeuticRegimenAct() {
		return tularemiaTherapeuticRegimenActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaTreatmentGivenSubstanceAdministration() {
		return tularemiaTreatmentGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaTreatmentNotGivenSubstanceAdministration() {
		return tularemiaTreatmentNotGivenSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaPHCRRelevantDxTestsSection() {
		return tularemiaPHCRRelevantDxTestsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaResultOrganizer() {
		return tularemiaResultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTularemiaResultObservation() {
		return tularemiaResultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TularemiaFactory getTularemiaFactory() {
		return (TularemiaFactory)getEFactoryInstance();
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
		tularemiaCaseReportEClass = createEClass(TULAREMIA_CASE_REPORT);

		tularemiaPHCRSocialHistorySectionEClass = createEClass(TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION);

		tularemiaPossibleExposureLocationAndTypeActEClass = createEClass(TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);

		tularemiaPHCRClinicalInformationSectionEClass = createEClass(TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION);

		tularemiaCaseObservationEClass = createEClass(TULAREMIA_CASE_OBSERVATION);

		tularemiaSignsAndSymptomsObservationEClass = createEClass(TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION);

		locationOfLesionObservationEClass = createEClass(LOCATION_OF_LESION_OBSERVATION);

		tularemiaPHCRTreatmentInformationSectionEClass = createEClass(TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION);

		tularemiaTherapeuticRegimenActEClass = createEClass(TULAREMIA_THERAPEUTIC_REGIMEN_ACT);

		tularemiaTreatmentGivenSubstanceAdministrationEClass = createEClass(TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION);

		tularemiaTreatmentNotGivenSubstanceAdministrationEClass = createEClass(TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);

		tularemiaPHCRRelevantDxTestsSectionEClass = createEClass(TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION);

		tularemiaResultOrganizerEClass = createEClass(TULAREMIA_RESULT_ORGANIZER);

		tularemiaResultObservationEClass = createEClass(TULAREMIA_RESULT_OBSERVATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tularemiaCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
		tularemiaPHCRSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
		tularemiaPossibleExposureLocationAndTypeActEClass.getESuperTypes().add(theCDAPackage.getAct());
		tularemiaPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
		tularemiaCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
		tularemiaSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
		locationOfLesionObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		tularemiaPHCRTreatmentInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrTreatmentInformationSection());
		tularemiaTherapeuticRegimenActEClass.getESuperTypes().add(thePhcrPackage.getTherapeuticRegimenAct());
		tularemiaTreatmentGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentGivenSubstanceAdministration());
		tularemiaTreatmentNotGivenSubstanceAdministrationEClass.getESuperTypes().add(thePhcrPackage.getTreatmentNotGivenSubstanceAdministration());
		tularemiaPHCRRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
		tularemiaResultOrganizerEClass.getESuperTypes().add(thePhcrPackage.getResultOrganizer());
		tularemiaResultObservationEClass.getESuperTypes().add(thePhcrPackage.getResultObservation());

		// Initialize classes and features; add operations and parameters
		initEClass(tularemiaCaseReportEClass, TularemiaCaseReport.class, "TularemiaCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(tularemiaCaseReportEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaCaseReportEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseReportTularemiaPHCRSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaCaseReportEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaCaseReportEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaCaseReportEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseReportPhcrEncountersSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaCaseReportEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaCaseReportEClass, this.getTularemiaPHCRSocialHistorySection(), "getTularemiaPHCRSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaCaseReportEClass, this.getTularemiaPHCRClinicalInformationSection(), "getTularemiaPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaCaseReportEClass, this.getTularemiaPHCRTreatmentInformationSection(), "getTularemiaPHCRTreatmentInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaCaseReportEClass, thePhcrPackage.getPhcrEncountersSection(), "gettularemiaPhcrEncountersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaCaseReportEClass, this.getTularemiaPHCRRelevantDxTestsSection(), "getTularemiaPHCRRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaPHCRSocialHistorySectionEClass, TularemiaPHCRSocialHistorySection.class, "TularemiaPHCRSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaPHCRSocialHistorySectionEClass, this.getTularemiaPossibleExposureLocationAndTypeAct(), "getTularemiaPossibleExposureLocationAndTypeActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaPossibleExposureLocationAndTypeActEClass, TularemiaPossibleExposureLocationAndTypeAct.class, "TularemiaPossibleExposureLocationAndTypeAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateTularemiaPossibleExposureLocationAndTypeActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateTularemiaPossibleExposureLocationAndTypeActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateTularemiaPossibleExposureLocationAndTypeActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateTularemiaPossibleExposureLocationAndTypeActCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateTularemiaPossibleExposureLocationAndTypeActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateTularemiaPossibleExposureLocationAndTypeActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tularemiaPHCRClinicalInformationSectionEClass, TularemiaPHCRClinicalInformationSection.class, "TularemiaPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaPHCRClinicalInformationSectionEClass, this.getTularemiaCaseObservation(), "getTularemiaCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaCaseObservationEClass, TularemiaCaseObservation.class, "TularemiaCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaCaseObservationEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaCaseObservationEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaCaseObservationEClass, ecorePackage.getEBoolean(), "validateTularemiaCaseObservationLocationOfLesionObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaCaseObservationEClass, this.getTularemiaSignsAndSymptomsObservation(), "getTularemiaSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaCaseObservationEClass, this.getLocationOfLesionObservation(), "getLocationOfLesionObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaSignsAndSymptomsObservationEClass, TularemiaSignsAndSymptomsObservation.class, "TularemiaSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validateTularemiaSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationOfLesionObservationEClass, LocationOfLesionObservation.class, "LocationOfLesionObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(locationOfLesionObservationEClass, ecorePackage.getEBoolean(), "validateLocationOfLesionObservationTargetSiteCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tularemiaPHCRTreatmentInformationSectionEClass, TularemiaPHCRTreatmentInformationSection.class, "TularemiaPHCRTreatmentInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaPHCRTreatmentInformationSectionEClass, ecorePackage.getEBoolean(), "validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaPHCRTreatmentInformationSectionEClass, this.getTularemiaTherapeuticRegimenAct(), "getTularemiaTherapeuticRegimenAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaTherapeuticRegimenActEClass, TularemiaTherapeuticRegimenAct.class, "TularemiaTherapeuticRegimenAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaTherapeuticRegimenActEClass, ecorePackage.getEBoolean(), "validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaTherapeuticRegimenActEClass, this.getTularemiaTreatmentGivenSubstanceAdministration(), "getTularemiaTreatmentGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaTherapeuticRegimenActEClass, this.getTularemiaTreatmentNotGivenSubstanceAdministration(), "getTularemiaTreatmentNotGivenSubstanceAdministrations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaTreatmentGivenSubstanceAdministrationEClass, TularemiaTreatmentGivenSubstanceAdministration.class, "TularemiaTreatmentGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tularemiaTreatmentNotGivenSubstanceAdministrationEClass, TularemiaTreatmentNotGivenSubstanceAdministration.class, "TularemiaTreatmentNotGivenSubstanceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tularemiaPHCRRelevantDxTestsSectionEClass, TularemiaPHCRRelevantDxTestsSection.class, "TularemiaPHCRRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateTularemiaPHCRRelevantDxTestsSectionImagingObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaPHCRRelevantDxTestsSectionEClass, this.getTularemiaResultOrganizer(), "getTularemiaResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaPHCRRelevantDxTestsSectionEClass, this.getTularemiaResultObservation(), "getTularemiaResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tularemiaPHCRRelevantDxTestsSectionEClass, thePhcrPackage.getImagingObservation(), "gettularemiaImagingObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaResultOrganizerEClass, TularemiaResultOrganizer.class, "TularemiaResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTularemiaResultOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tularemiaResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTularemiaResultOrganizerTularemiaResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tularemiaResultOrganizerEClass, this.getTularemiaResultObservation(), "getTularemiaResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tularemiaResultObservationEClass, TularemiaResultObservation.class, "TularemiaResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tularemiaResultObservationEClass, ecorePackage.getEBoolean(), "validateTularemiaResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		  (tularemiaCaseReportEClass, 
		   source, 
		   new String[] {
			 "title.mixed", "Public Health Case Report - Tularemia",
			 "templateId.root", "2.16.840.1.113883.10.20.15.1.4",
			 "constraints.validation.error", "TularemiaCaseReportTemplateId TularemiaCaseReportTitle TularemiaCaseReportTularemiaPHCRClinicalInformationSection",
			 "constraints.validation.warning", "TularemiaCaseReportTularemiaPHCRSocialHistorySection TularemiaCaseReportTularemiaPHCRTreatmentInformationSection TularemiaCaseReportPhcrEncountersSection TularemiaCaseReportTularemiaPHCRRelevantDxTestsSection"
		   });																																					
		addAnnotation
		  (tularemiaPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.18",
			 "constraints.validation.error", "TularemiaPHCRSocialHistorySectionTemplateId",
			 "constraints.validation.info", "TularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct"
		   });									
		addAnnotation
		  (tularemiaPossibleExposureLocationAndTypeActEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "code.displayName", "Finding with explicit context",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.43",
			 "constraints.validation.error", "TularemiaPossibleExposureLocationAndTypeActTemplateId TularemiaPossibleExposureLocationAndTypeActClassCode TularemiaPossibleExposureLocationAndTypeActMoodCode TularemiaPossibleExposureLocationAndTypeActCode TularemiaPossibleExposureLocationAndTypeActCodeP TularemiaPossibleExposureLocationAndTypeActStatusCode TularemiaPossibleExposureLocationAndTypeActStatusCodeP",
			 "code.codeSystemName", "SNOMEDCT",
			 "classCode", "ACT",
			 "code.code", "413350009",
			 "constraints.validation.dependOn.TularemiaPossibleExposureLocationAndTypeActCode", "TularemiaPossibleExposureLocationAndTypeActCodeP",
			 "moodCode", "EVN"
		   });																														
		addAnnotation
		  (tularemiaPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.19",
			 "constraints.validation.error", "TularemiaPHCRClinicalInformationSectionTemplateId TularemiaPHCRClinicalInformationSectionTularemiaCaseObservation"
		   });									
		addAnnotation
		  (tularemiaCaseObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.46",
			 "constraints.validation.error", "TularemiaCaseObservationTemplateId TularemiaCaseObservationValue TularemiaCaseObservationTularemiaSignsAndSymptomsObservation",
			 "constraints.validation.info", "TularemiaCaseObservationLocationOfLesionObservation"
		   });																			
		addAnnotation
		  (tularemiaSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.45",
			 "constraints.validation.error", "TularemiaSignsAndSymptomsObservationTemplateId TularemiaSignsAndSymptomsObservationValue"
		   });							
		addAnnotation
		  (locationOfLesionObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.5.4",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.44",
			 "constraints.validation.error", "LocationOfLesionObservationTemplateId LocationOfLesionObservationClassCode LocationOfLesionObservationMoodCode LocationOfLesionObservationCode LocationOfLesionObservationCodeP LocationOfLesionObservationStatusCode LocationOfLesionObservationStatusCodeP LocationOfLesionObservationValue LocationOfLesionObservationTargetSiteCode",
			 "code.codeSystemName", "HL7ActCode",
			 "constraints.validation.warning", "LocationOfLesionObservationEffectiveTime",
			 "classCode", "OBS",
			 "code.code", "ASSERTION",
			 "moodCode", "EVN",
			 "constraints.validation.dependOn.LocationOfLesionObservationCode", "LocationOfLesionObservationCodeP"
		   });																																										
		addAnnotation
		  (tularemiaPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.20",
			 "constraints.validation.error", "TularemiaPHCRTreatmentInformationSectionTemplateId TularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct"
		   });									
		addAnnotation
		  (tularemiaTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.48",
			 "constraints.validation.error", "TularemiaTherapeuticRegimenActTemplateId",
			 "constraints.validation.warning", "TularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration",
			 "constraints.validation.info", "TularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration"
		   });															
		addAnnotation
		  (tularemiaTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.47",
			 "constraints.validation.error", "TularemiaTreatmentGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (tularemiaTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.50",
			 "constraints.validation.error", "TularemiaTreatmentNotGivenSubstanceAdministrationTemplateId"
		   });			
		addAnnotation
		  (tularemiaPHCRRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.21",
			 "constraints.validation.error", "TularemiaPHCRRelevantDxTestsSectionTemplateId",
			 "constraints.validation.warning", "TularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation",
			 "constraints.validation.info", "TularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer TularemiaPHCRRelevantDxTestsSectionImagingObservation"
		   });																					
		addAnnotation
		  (tularemiaResultOrganizerEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.52",
			 "constraints.validation.error", "TularemiaResultOrganizerTemplateId ResultOrganizerCode TularemiaResultOrganizerCode TularemiaResultOrganizerTularemiaResultObservation",
			 "constraints.validation.dependOn.ResultOrganizerCode", "TularemiaResultOrganizerCode",
			 "code.codeSystemName", "LOINC"
		   });													
		addAnnotation
		  (tularemiaResultObservationEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.51",
			 "constraints.validation.dependOn.ResultObservationCode", "TularemiaResultObservationCode",
			 "constraints.validation.error", "TularemiaResultObservationTemplateId ResultObservationCode TularemiaResultObservationCode",
			 "code.codeSystemName", "LOINC"
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
		  (tularemiaCaseReportEClass, 
		   source, 
		   new String[] {
		   });																																					
		addAnnotation
		  (tularemiaPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
		   });																																						
		addAnnotation
		  (tularemiaPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (tularemiaCaseObservationEClass, 
		   source, 
		   new String[] {
		   });																			
		addAnnotation
		  (tularemiaSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
		   });																																																
		addAnnotation
		  (tularemiaPHCRTreatmentInformationSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (tularemiaTherapeuticRegimenActEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (tularemiaTreatmentGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (tularemiaTreatmentNotGivenSubstanceAdministrationEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (tularemiaPHCRRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
		   });																					
		addAnnotation
		  (tularemiaResultOrganizerEClass, 
		   source, 
		   new String[] {
		   });													
		addAnnotation
		  (tularemiaResultObservationEClass, 
		   source, 
		   new String[] {
		   });				
	}

} //TularemiaPackageImpl
