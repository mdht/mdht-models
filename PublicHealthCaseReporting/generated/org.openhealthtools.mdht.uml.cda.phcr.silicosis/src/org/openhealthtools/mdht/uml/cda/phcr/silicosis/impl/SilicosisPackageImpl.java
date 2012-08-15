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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SilicosisPackageImpl extends EPackageImpl implements SilicosisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silicosisCaseReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silicosisPHCRSocialHistorySectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silicosisSocioBehavioralBooleanRiskFactorObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silicosisPHCRClinicalInformationSectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silicosisCaseObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silicosisSignsAndSymptomsObservationEClass = null;
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass silicosisHistoryOfTuberculosisObservationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass silicosisPHCRRelevantDxTestsSectionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass silicosisImagingObservationEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silicosisPossibleExposureLocationAndTypeActEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SilicosisPackageImpl() {
		super(eNS_URI, SilicosisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SilicosisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SilicosisPackage init() {
		if (isInited) return (SilicosisPackage)EPackage.Registry.INSTANCE.getEPackage(SilicosisPackage.eNS_URI);

		// Obtain or create and register package
		SilicosisPackageImpl theSilicosisPackage = (SilicosisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SilicosisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SilicosisPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PhcrPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSilicosisPackage.createPackageContents();

		// Initialize created meta-data
		theSilicosisPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSilicosisPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SilicosisValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSilicosisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SilicosisPackage.eNS_URI, theSilicosisPackage);
		return theSilicosisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicosisCaseReport() {
		return silicosisCaseReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicosisPHCRSocialHistorySection() {
		return silicosisPHCRSocialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicosisSocioBehavioralBooleanRiskFactorObservation() {
		return silicosisSocioBehavioralBooleanRiskFactorObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicosisPHCRClinicalInformationSection() {
		return silicosisPHCRClinicalInformationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicosisCaseObservation() {
		return silicosisCaseObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicosisSignsAndSymptomsObservation() {
		return silicosisSignsAndSymptomsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSilicosisHistoryOfTuberculosisObservation()
  {
		return silicosisHistoryOfTuberculosisObservationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSilicosisPHCRRelevantDxTestsSection()
  {
		return silicosisPHCRRelevantDxTestsSectionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSilicosisImagingObservation()
  {
		return silicosisImagingObservationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicosisPossibleExposureLocationAndTypeAct() {
		return silicosisPossibleExposureLocationAndTypeActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisFactory getSilicosisFactory() {
		return (SilicosisFactory)getEFactoryInstance();
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
		silicosisCaseReportEClass = createEClass(SILICOSIS_CASE_REPORT);

		silicosisPHCRSocialHistorySectionEClass = createEClass(SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION);

		silicosisSocioBehavioralBooleanRiskFactorObservationEClass = createEClass(SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION);

		silicosisPossibleExposureLocationAndTypeActEClass = createEClass(SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);

		silicosisPHCRClinicalInformationSectionEClass = createEClass(SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION);

		silicosisCaseObservationEClass = createEClass(SILICOSIS_CASE_OBSERVATION);

		silicosisSignsAndSymptomsObservationEClass = createEClass(SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);

		silicosisHistoryOfTuberculosisObservationEClass = createEClass(SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION);

		silicosisPHCRRelevantDxTestsSectionEClass = createEClass(SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);

		silicosisImagingObservationEClass = createEClass(SILICOSIS_IMAGING_OBSERVATION);
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
		silicosisCaseReportEClass.getESuperTypes().add(thePhcrPackage.getPublicHealthCaseReport());
		silicosisPHCRSocialHistorySectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrSocialHistorySection());
		silicosisSocioBehavioralBooleanRiskFactorObservationEClass.getESuperTypes().add(theCCDPackage.getSocialHistoryObservation());
		silicosisPossibleExposureLocationAndTypeActEClass.getESuperTypes().add(theCDAPackage.getAct());
		silicosisPHCRClinicalInformationSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrClinicalInformationSection());
		silicosisCaseObservationEClass.getESuperTypes().add(thePhcrPackage.getCaseObservation());
		silicosisSignsAndSymptomsObservationEClass.getESuperTypes().add(thePhcrPackage.getSignsAndSymptomsObservation());
		silicosisHistoryOfTuberculosisObservationEClass.getESuperTypes().add(theCCDPackage.getProblemObservation());
		silicosisPHCRRelevantDxTestsSectionEClass.getESuperTypes().add(thePhcrPackage.getPhcrRelevantDxTestsSection());
		silicosisImagingObservationEClass.getESuperTypes().add(thePhcrPackage.getImagingObservation());

		// Initialize classes and features; add operations and parameters
		initEClass(silicosisCaseReportEClass, SilicosisCaseReport.class, "SilicosisCaseReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(silicosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSilicosisCaseReportTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSilicosisCaseReportSilicosisPHCRSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisCaseReportEClass, ecorePackage.getEBoolean(), "validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(silicosisCaseReportEClass, this.getSilicosisPHCRSocialHistorySection(), "getSilicosisPHCRSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(silicosisCaseReportEClass, this.getSilicosisPHCRClinicalInformationSection(), "getSilicosisPHCRClinicalInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(silicosisCaseReportEClass, this.getSilicosisPHCRRelevantDxTestsSection(), "getSilicosisPHCRRelevantDxTestsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(silicosisPHCRSocialHistorySectionEClass, SilicosisPHCRSocialHistorySection.class, "SilicosisPHCRSocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisPHCRSocialHistorySectionEClass, ecorePackage.getEBoolean(), "validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(silicosisPHCRSocialHistorySectionEClass, this.getSilicosisSocioBehavioralBooleanRiskFactorObservation(), "getSilicosisSocioBehavioralBooleanRiskFactorObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(silicosisPHCRSocialHistorySectionEClass, this.getSilicosisPossibleExposureLocationAndTypeAct(), "getSilicosisPossibleExposureLocationAndTypeActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(silicosisSocioBehavioralBooleanRiskFactorObservationEClass, SilicosisSocioBehavioralBooleanRiskFactorObservation.class, "SilicosisSocioBehavioralBooleanRiskFactorObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisSocioBehavioralBooleanRiskFactorObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(silicosisPossibleExposureLocationAndTypeActEClass, SilicosisPossibleExposureLocationAndTypeAct.class, "SilicosisPossibleExposureLocationAndTypeAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSilicosisPossibleExposureLocationAndTypeActTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSilicosisPossibleExposureLocationAndTypeActClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSilicosisPossibleExposureLocationAndTypeActCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSilicosisPossibleExposureLocationAndTypeActMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisPossibleExposureLocationAndTypeActEClass, ecorePackage.getEBoolean(), "validateSilicosisPossibleExposureLocationAndTypeActStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(silicosisPHCRClinicalInformationSectionEClass, SilicosisPHCRClinicalInformationSection.class, "SilicosisPHCRClinicalInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisPHCRClinicalInformationSectionEClass, ecorePackage.getEBoolean(), "validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(silicosisPHCRClinicalInformationSectionEClass, this.getSilicosisCaseObservation(), "getSilicosisCaseObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(silicosisPHCRClinicalInformationSectionEClass, this.getSilicosisHistoryOfTuberculosisObservation(), "getSilicosisHistoryOfTuberculosisObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(silicosisCaseObservationEClass, SilicosisCaseObservation.class, "SilicosisCaseObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisCaseObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisCaseObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(silicosisCaseObservationEClass, this.getSilicosisSignsAndSymptomsObservation(), "getSilicosisSignsAndSymptomsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(silicosisSignsAndSymptomsObservationEClass, SilicosisSignsAndSymptomsObservation.class, "SilicosisSignsAndSymptomsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisSignsAndSymptomsObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisSignsAndSymptomsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(silicosisHistoryOfTuberculosisObservationEClass, SilicosisHistoryOfTuberculosisObservation.class, "SilicosisHistoryOfTuberculosisObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisHistoryOfTuberculosisObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisHistoryOfTuberculosisObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(silicosisHistoryOfTuberculosisObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisHistoryOfTuberculosisObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(silicosisPHCRRelevantDxTestsSectionEClass, SilicosisPHCRRelevantDxTestsSection.class, "SilicosisPHCRRelevantDxTestsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisPHCRRelevantDxTestsSectionEClass, ecorePackage.getEBoolean(), "validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(silicosisPHCRRelevantDxTestsSectionEClass, this.getSilicosisImagingObservation(), "getSilicosisImagingObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(silicosisImagingObservationEClass, SilicosisImagingObservation.class, "SilicosisImagingObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(silicosisImagingObservationEClass, ecorePackage.getEBoolean(), "validateSilicosisImagingObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		  (silicosisCaseReportEClass, 
		   source, 
		   new String[] {
			 "title.mixed", "Public Health Case Report - Silicosis",
			 "templateId.root", "2.16.840.1.113883.10.20.15.1.8",
			 "constraints.validation.error", "SilicosisCaseReportTemplateId SilicosisCaseReportTitle SilicosisCaseReportSilicosisPHCRClinicalInformationSection",
			 "constraints.validation.warning", "SilicosisCaseReportSilicosisPHCRSocialHistorySection SilicosisCaseReportSilicosisPHCRRelevantDxTestsSection"
		   });																									
		addAnnotation
		  (silicosisPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.33",
			 "constraints.validation.error", "SilicosisPHCRSocialHistorySectionTemplateId",
			 "constraints.validation.warning", "SilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation SilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct"
		   });															
		addAnnotation
		  (silicosisSocioBehavioralBooleanRiskFactorObservationEClass, 
		   source, 
		   new String[] {
			 "value.displayName", "Exposure to toxic dust",
			 "value.codeSystemName", "SNOMEDCT",
			 "code.codeSystem", "2.16.840.1.113883.5.4",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.110",
			 "value.code", "102445001",
			 "constraints.validation.error", "SilicosisSocioBehavioralBooleanRiskFactorObservationTemplateId SilicosisSocioBehavioralBooleanRiskFactorObservationCode SilicosisSocioBehavioralBooleanRiskFactorObservationCodeP SilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd SilicosisSocioBehavioralBooleanRiskFactorObservationValue",
			 "code.codeSystemName", "HL7ActCode",
			 "constraints.validation.warning", "SilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime",
			 "code.code", "ASSERTION",
			 "value.codeSystem", "2.16.840.1.113883.6.96",
			 "constraints.validation.dependOn.SilicosisSocioBehavioralBooleanRiskFactorObservationCode", "SilicosisSocioBehavioralBooleanRiskFactorObservationCodeP"
		   });																							
		addAnnotation
		  (silicosisPossibleExposureLocationAndTypeActEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.96",
			 "code.displayName", "Finding with explicit context",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.109",
			 "constraints.validation.error", "SilicosisPossibleExposureLocationAndTypeActTemplateId SilicosisPossibleExposureLocationAndTypeActClassCode SilicosisPossibleExposureLocationAndTypeActCode SilicosisPossibleExposureLocationAndTypeActMoodCode SilicosisPossibleExposureLocationAndTypeActStatusCode",
			 "code.codeSystemName", "SNOMEDCT",
			 "classCode", "ACT",
			 "code.code", "413350009",
			 "moodCode", "EVN"
		   });																						
		addAnnotation
		  (silicosisPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.34",
			 "constraints.validation.error", "SilicosisPHCRClinicalInformationSectionTemplateId SilicosisPHCRClinicalInformationSectionSilicosisCaseObservation",
			 "constraints.validation.warning", "SilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation"
		   });															
		addAnnotation
		  (silicosisCaseObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.111",
			 "constraints.validation.error", "SilicosisCaseObservationTemplateId SilicosisCaseObservationValue",
			 "constraints.validation.warning", "SilicosisCaseObservationSilicosisSignsAndSymptomsObservation"
		   });													
		addAnnotation
		  (silicosisSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.112",
			 "constraints.validation.error", "SilicosisSignsAndSymptomsObservationTemplateId SilicosisSignsAndSymptomsObservationValue"
		   });							
		addAnnotation
		  (silicosisHistoryOfTuberculosisObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.107",
			 "constraints.validation.error", "SilicosisHistoryOfTuberculosisObservationTemplateId SilicosisHistoryOfTuberculosisObservationClassCode SilicosisHistoryOfTuberculosisObservationValue",
			 "classCode", "OBS"
		   });											
		addAnnotation
		  (silicosisPHCRRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.35",
			 "constraints.validation.error", "SilicosisPHCRRelevantDxTestsSectionTemplateId",
			 "constraints.validation.info", "SilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation"
		   });									
		addAnnotation
		  (silicosisImagingObservationEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.108",
			 "constraints.validation.error", "SilicosisImagingObservationTemplateId SilicosisImagingObservationValue"
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
		  (silicosisCaseReportEClass, 
		   source, 
		   new String[] {
		   });																									
		addAnnotation
		  (silicosisPHCRSocialHistorySectionEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (silicosisSocioBehavioralBooleanRiskFactorObservationEClass, 
		   source, 
		   new String[] {
		   });																																												
		addAnnotation
		  (silicosisPHCRClinicalInformationSectionEClass, 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (silicosisCaseObservationEClass, 
		   source, 
		   new String[] {
		   });													
		addAnnotation
		  (silicosisSignsAndSymptomsObservationEClass, 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (silicosisHistoryOfTuberculosisObservationEClass, 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  (silicosisPHCRRelevantDxTestsSectionEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (silicosisImagingObservationEClass, 
		   source, 
		   new String[] {
		   });				
	}

} //SilicosisPackageImpl
