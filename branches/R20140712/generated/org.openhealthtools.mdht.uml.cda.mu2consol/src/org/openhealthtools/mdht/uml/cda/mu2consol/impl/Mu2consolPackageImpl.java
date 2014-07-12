/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class Mu2consolPackageImpl extends EPackageImpl implements
		Mu2consolPackage {
	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass generalHeaderConstraintsEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass summaryOfCareRecordEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass socialHistorySectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass smokingStatusObservationEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass resultsSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass resultOrganizerEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass resultObservationEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass proceduresSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass procedureActivityProcedureEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass clinicalOfficeVisitSummaryEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass medicationsAdministeredSectionEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass transitionOfCareAmbulatorySummaryEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass transitionOfCareInpatientSummaryEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass viewDownloadTransmitSummaryEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass vdtInpatientSummaryEClass = null;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private EClass vdtAmbulatorySummaryEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalStatusSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cognitiveStatusResultObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cognitiveStatusResultOrganizerEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalStatusResultObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalStatusResultOrganizerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mu2consolPackageImpl() {
        super(eNS_URI, Mu2consolFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link Mu2consolPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mu2consolPackage init() {
        if (isInited) return (Mu2consolPackage)EPackage.Registry.INSTANCE.getEPackage(Mu2consolPackage.eNS_URI);

        // Obtain or create and register package
        Mu2consolPackageImpl theMu2consolPackage = (Mu2consolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Mu2consolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Mu2consolPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ConsolPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theMu2consolPackage.createPackageContents();

        // Initialize created meta-data
        theMu2consolPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theMu2consolPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return Mu2consolValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theMu2consolPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.mu2consol", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theMu2consolPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Mu2consolPackage.eNS_URI, theMu2consolPackage);
        return theMu2consolPackage;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getGeneralHeaderConstraints() {
        return generalHeaderConstraintsEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getSummaryOfCareRecord() {
        return summaryOfCareRecordEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getSocialHistorySection() {
        return socialHistorySectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getSmokingStatusObservation() {
        return smokingStatusObservationEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getResultsSection() {
        return resultsSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getResultOrganizer() {
        return resultOrganizerEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getResultObservation() {
        return resultObservationEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getProceduresSection() {
        return proceduresSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getProcedureActivityProcedure() {
        return procedureActivityProcedureEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getClinicalOfficeVisitSummary() {
        return clinicalOfficeVisitSummaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMedicationsAdministeredSection() {
        return medicationsAdministeredSectionEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getTransitionOfCareAmbulatorySummary() {
        return transitionOfCareAmbulatorySummaryEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getTransitionOfCareInpatientSummary() {
        return transitionOfCareInpatientSummaryEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getViewDownloadTransmitSummary() {
        return viewDownloadTransmitSummaryEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getVDTInpatientSummary() {
        return vdtInpatientSummaryEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EClass getVDTAmbulatorySummary() {
        return vdtAmbulatorySummaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionalStatusSection() {
        return functionalStatusSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCognitiveStatusResultObservation() {
        return cognitiveStatusResultObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCognitiveStatusResultOrganizer() {
        return cognitiveStatusResultOrganizerEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionalStatusResultObservation() {
        return functionalStatusResultObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionalStatusResultOrganizer() {
        return functionalStatusResultOrganizerEClass;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public Mu2consolFactory getMu2consolFactory() {
        return (Mu2consolFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        generalHeaderConstraintsEClass = createEClass(GENERAL_HEADER_CONSTRAINTS);

        summaryOfCareRecordEClass = createEClass(SUMMARY_OF_CARE_RECORD);

        socialHistorySectionEClass = createEClass(SOCIAL_HISTORY_SECTION);

        smokingStatusObservationEClass = createEClass(SMOKING_STATUS_OBSERVATION);

        resultsSectionEClass = createEClass(RESULTS_SECTION);

        resultOrganizerEClass = createEClass(RESULT_ORGANIZER);

        resultObservationEClass = createEClass(RESULT_OBSERVATION);

        proceduresSectionEClass = createEClass(PROCEDURES_SECTION);

        procedureActivityProcedureEClass = createEClass(PROCEDURE_ACTIVITY_PROCEDURE);

        clinicalOfficeVisitSummaryEClass = createEClass(CLINICAL_OFFICE_VISIT_SUMMARY);

        medicationsAdministeredSectionEClass = createEClass(MEDICATIONS_ADMINISTERED_SECTION);

        transitionOfCareAmbulatorySummaryEClass = createEClass(TRANSITION_OF_CARE_AMBULATORY_SUMMARY);

        transitionOfCareInpatientSummaryEClass = createEClass(TRANSITION_OF_CARE_INPATIENT_SUMMARY);

        viewDownloadTransmitSummaryEClass = createEClass(VIEW_DOWNLOAD_TRANSMIT_SUMMARY);

        vdtInpatientSummaryEClass = createEClass(VDT_INPATIENT_SUMMARY);

        vdtAmbulatorySummaryEClass = createEClass(VDT_AMBULATORY_SUMMARY);

        functionalStatusSectionEClass = createEClass(FUNCTIONAL_STATUS_SECTION);

        cognitiveStatusResultObservationEClass = createEClass(COGNITIVE_STATUS_RESULT_OBSERVATION);

        cognitiveStatusResultOrganizerEClass = createEClass(COGNITIVE_STATUS_RESULT_ORGANIZER);

        functionalStatusResultObservationEClass = createEClass(FUNCTIONAL_STATUS_RESULT_OBSERVATION);

        functionalStatusResultOrganizerEClass = createEClass(FUNCTIONAL_STATUS_RESULT_ORGANIZER);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
        ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        generalHeaderConstraintsEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
        summaryOfCareRecordEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        socialHistorySectionEClass.getESuperTypes().add(theConsolPackage.getSocialHistorySection());
        smokingStatusObservationEClass.getESuperTypes().add(theConsolPackage.getSmokingStatusObservation());
        resultsSectionEClass.getESuperTypes().add(theConsolPackage.getResultsSection());
        resultOrganizerEClass.getESuperTypes().add(theConsolPackage.getResultOrganizer());
        resultObservationEClass.getESuperTypes().add(theConsolPackage.getResultObservation());
        proceduresSectionEClass.getESuperTypes().add(theConsolPackage.getProceduresSection());
        procedureActivityProcedureEClass.getESuperTypes().add(theConsolPackage.getProcedureActivityProcedure());
        clinicalOfficeVisitSummaryEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        medicationsAdministeredSectionEClass.getESuperTypes().add(theConsolPackage.getMedicationsAdministeredSection());
        transitionOfCareAmbulatorySummaryEClass.getESuperTypes().add(this.getSummaryOfCareRecord());
        transitionOfCareInpatientSummaryEClass.getESuperTypes().add(this.getSummaryOfCareRecord());
        viewDownloadTransmitSummaryEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        vdtInpatientSummaryEClass.getESuperTypes().add(this.getViewDownloadTransmitSummary());
        vdtAmbulatorySummaryEClass.getESuperTypes().add(this.getViewDownloadTransmitSummary());
        functionalStatusSectionEClass.getESuperTypes().add(theConsolPackage.getFunctionalStatusSection());
        cognitiveStatusResultObservationEClass.getESuperTypes().add(theConsolPackage.getCognitiveStatusResultObservation());
        cognitiveStatusResultObservationEClass.getESuperTypes().add(this.getResultObservation());
        cognitiveStatusResultOrganizerEClass.getESuperTypes().add(theConsolPackage.getCognitiveStatusResultOrganizer());
        cognitiveStatusResultOrganizerEClass.getESuperTypes().add(this.getResultOrganizer());
        functionalStatusResultObservationEClass.getESuperTypes().add(theConsolPackage.getFunctionalStatusResultObservation());
        functionalStatusResultObservationEClass.getESuperTypes().add(this.getResultObservation());
        functionalStatusResultOrganizerEClass.getESuperTypes().add(theConsolPackage.getFunctionalStatusResultOrganizer());
        functionalStatusResultOrganizerEClass.getESuperTypes().add(this.getResultOrganizer());

        // Initialize classes and features; add operations and parameters
        initEClass(generalHeaderConstraintsEClass, GeneralHeaderConstraints.class, "GeneralHeaderConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateMU2CONSOLGeneralHeaderConstraintsCareTeamMembers", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateMU2CONSOLGeneralHeaderConstraintsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(generalHeaderConstraintsEClass, theConsolPackage.getHospitalAdmissionDiagnosisSection(), "retrieveHospitalAdmissionDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(summaryOfCareRecordEClass, SummaryOfCareRecord.class, "SummaryOfCareRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordCarePlanning", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordVitalSigns", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordSocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordFunctionalStatusSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getFunctionalStatusSection(), "retrieveFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getHospitalDischargeDiagnosisSection(), "retrieveHospitalDischargeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getPostoperativeDiagnosisSection(), "retrievePostoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getPostprocedureDiagnosisSection(), "retrievePostprocedureDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(socialHistorySectionEClass, SocialHistorySection.class, "SocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateMU2CONSOLSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(socialHistorySectionEClass, this.getSmokingStatusObservation(), "getMu2consolSmokingStatusObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(smokingStatusObservationEClass, SmokingStatusObservation.class, "SmokingStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(resultsSectionEClass, ResultsSection.class, "ResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(resultsSectionEClass, this.getResultOrganizer(), "getMu2consolResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(resultOrganizerEClass, ResultOrganizer.class, "ResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(resultOrganizerEClass, this.getResultObservation(), "getMu2consolResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(resultObservationEClass, ResultObservation.class, "ResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(proceduresSectionEClass, ProceduresSection.class, "ProceduresSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(proceduresSectionEClass, this.getProcedureActivityProcedure(), "getMu2consolProcedureActivityProcedures", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(procedureActivityProcedureEClass, ProcedureActivityProcedure.class, "ProcedureActivityProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(procedureActivityProcedureEClass, ecorePackage.getEBoolean(), "validateMU2CONSOLProcedureActivityProcedureCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(clinicalOfficeVisitSummaryEClass, ClinicalOfficeVisitSummary.class, "ClinicalOfficeVisitSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryReasonforVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryCarePlanning", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryDateOfvisit", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryVisitLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryProviderNameAndContactInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryVitalSigns", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryImmunizationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummarySocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getInstructionsSection(), "retrieveInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getMedicationsAdministeredSection(), "retrieveMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getInstructionsSection(), "getInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getMedicationsAdministeredSection(), "getMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(medicationsAdministeredSectionEClass, MedicationsAdministeredSection.class, "MedicationsAdministeredSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(medicationsAdministeredSectionEClass, theConsolPackage.getMedicationActivity(), "getMu2consolMedicationActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(transitionOfCareAmbulatorySummaryEClass, TransitionOfCareAmbulatorySummary.class, "TransitionOfCareAmbulatorySummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryReasonForReferral", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(transitionOfCareAmbulatorySummaryEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(transitionOfCareInpatientSummaryEClass, TransitionOfCareInpatientSummary.class, "TransitionOfCareInpatientSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryMedications", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryEncounterDiagnoses", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(transitionOfCareInpatientSummaryEClass, theConsolPackage.getHospitalDischargeInstructionsSection(), "getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(viewDownloadTransmitSummaryEClass, ViewDownloadTransmitSummary.class, "ViewDownloadTransmitSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryCarePlanning", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryVitalSigns", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryProblemSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummarySocialHistorySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getPreoperativeDiagnosisSection(), "retrievePreoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(vdtInpatientSummaryEClass, VDTInpatientSummary.class, "VDTInpatientSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryAdmissionDate", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryDischargeDate", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryAdmissionDischargeLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryMedications", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryReasonforHospitalization", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryHospitalDischargeInstructionsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getHospitalDischargeInstructionsSection(), "getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(vdtAmbulatorySummaryEClass, VDTAmbulatorySummary.class, "VDTAmbulatorySummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(vdtAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateVDTAmbulatorySummaryProviderNameAndContactInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateVDTAmbulatorySummaryMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(vdtAmbulatorySummaryEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(functionalStatusSectionEClass, FunctionalStatusSection.class, "FunctionalStatusSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(functionalStatusSectionEClass, this.getCognitiveStatusResultObservation(), "getMu2consolCognitiveStatusResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, this.getCognitiveStatusResultOrganizer(), "getMu2consolCognitiveStatusResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, this.getFunctionalStatusResultObservation(), "getMu2consolFunctionalStatusResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(functionalStatusSectionEClass, this.getFunctionalStatusResultOrganizer(), "getMu2consolFunctionalStatusResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(cognitiveStatusResultObservationEClass, CognitiveStatusResultObservation.class, "CognitiveStatusResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cognitiveStatusResultOrganizerEClass, CognitiveStatusResultOrganizer.class, "CognitiveStatusResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(cognitiveStatusResultOrganizerEClass, this.getCognitiveStatusResultObservation(), "getMu2consolCognitiveStatusResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(functionalStatusResultObservationEClass, FunctionalStatusResultObservation.class, "FunctionalStatusResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(functionalStatusResultOrganizerEClass, FunctionalStatusResultOrganizer.class, "FunctionalStatusResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(functionalStatusResultOrganizerEClass, this.getFunctionalStatusResultObservation(), "getMu2consolFunctionalStatusResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.openhealthtools.org/mdht/uml
        createUmlAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation
        createAnnotationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget
        createMu2consolGeneralHeaderConstraintsRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole
        createMu2consolGeneralHeaderConstraintsRecordTargetPatientRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient
        createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
        createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationAnnotations();
        // duplicates
        createDuplicatesAnnotations();
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createUmlAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml";     
        addAnnotation
          (this, 
           source, 
           new String[] {
             "initializers", "org.openhealthtools.mdht.uml.cda.mu2consol"
           });                                                                                                                                                                                                                                            
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createAnnotationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "GeneralHeaderConstraintsTemplateId MU2CONSOLGeneralHeaderConstraintsCareTeamMembers MU2CONSOLGeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatient MU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole",
             "templateId.root", "2.16.840.1.113883.10.20.22.1.1",
             "constraints.validation.query", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient MU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole",
             "constraints.validation.warning", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication"
           });                       
        addAnnotation
          (summaryOfCareRecordEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SummaryOfCareRecordCarePlanning SummaryOfCareRecordVitalSigns SummaryOfCareRecordProblemSection SummaryOfCareRecordAllergiesSection SummaryOfCareRecordImmunizationsSection SummaryOfCareRecordSocialHistorySection SummaryOfCareRecordResultsSection SummaryOfCareRecordProceduresSection SummaryOfCareRecordFunctionalStatusSection"
           });                                           
        addAnnotation
          (socialHistorySectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SocialHistorySectionTemplateId MU2CONSOLSocialHistorySectionSmokingStatusObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.17"
           });          
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TobaccoUseTemplateId SmokingStatusObservationValue SmokingStatusObservationValueP",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.78",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.SmokingStatusObservationValue", "SmokingStatusObservationValueP"
           });      
        addAnnotation
          (resultsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResultsSectionEntriesOptionalTemplateId ResultsSectionResultOrganizer",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.3.1"
           });       
        addAnnotation
          (resultOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResultOrganizerTemplateId ResultOrganizerResultObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.1"
           });       
        addAnnotation
          (resultObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResultObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.2"
           });      
        addAnnotation
          (proceduresSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ProceduresSectionEntriesOptionalTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.7.1",
             "constraints.validation.info", "ProceduresSectionProcedureActivityProcedure"
           });       
        addAnnotation
          (procedureActivityProcedureEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ProcedureActivityProcedureTemplateId MU2CONSOLProcedureActivityProcedureCodeValue ProcedureActivityProcedureCode",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.14"
           });         
        addAnnotation
          (clinicalOfficeVisitSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ClinicalOfficeVisitSummaryReasonforVisit ClinicalOfficeVisitSummaryCarePlanning ClinicalOfficeVisitSummaryDateOfvisit ClinicalOfficeVisitSummaryVisitLocation ClinicalOfficeVisitSummaryProviderNameAndContactInfo ClinicalOfficeVisitSummaryVitalSigns ClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER ClinicalOfficeVisitSummaryProblemSection ClinicalOfficeVisitSummaryAllergiesSection ClinicalOfficeVisitSummaryResultsSection ClinicalOfficeVisitSummaryProceduresSection ClinicalOfficeVisitSummaryImmunizationsSection ClinicalOfficeVisitSummaryInstructionsSection ClinicalOfficeVisitSummarySocialHistorySection"
           });                                                          
        addAnnotation
          (medicationsAdministeredSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MedicationsAdministeredSectionTemplateId MedicationsAdministeredSectionMedicationActivity",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.38"
           });       
        addAnnotation
          (transitionOfCareAmbulatorySummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TransitionOfCareAmbulatorySummaryProviderNameAndContactInfo TransitionOfCareAmbulatorySummaryReasonForReferral TransitionOfCareAmbulatorySummaryEncounterDiagnoses TransitionOfCareAmbulatorySummaryMedicationsSection"
           });                  
        addAnnotation
          (transitionOfCareInpatientSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TransitionOfCareInpatientSummaryMedications TransitionOfCareInpatientSummaryEncounterDiagnoses TransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection"
           });               
        addAnnotation
          (viewDownloadTransmitSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ViewDownloadTransmitSummaryCarePlanning ViewDownloadTransmitSummaryVitalSigns ViewDownloadTransmitSummaryAllergiesSection ViewDownloadTransmitSummaryProblemSection ViewDownloadTransmitSummaryProceduresSection ViewDownloadTransmitSummaryResultsSection ViewDownloadTransmitSummarySocialHistorySection"
           });                                
        addAnnotation
          (vdtInpatientSummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "VDTInpatientSummaryAdmissionDate VDTInpatientSummaryDischargeDate VDTInpatientSummaryAdmissionDischargeLocation VDTInpatientSummaryMedications VDTInpatientSummaryReasonforHospitalization VDTInpatientSummaryHospitalDischargeInstructionsSection"
           });                        
        addAnnotation
          (vdtAmbulatorySummaryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "VDTAmbulatorySummaryProviderNameAndContactInfo VDTAmbulatorySummaryMedicationsSection"
           });            
        addAnnotation
          (functionalStatusSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "FunctionalStatusSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.14"
           });          
        addAnnotation
          (cognitiveStatusResultObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResultObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.74"
           });      
        addAnnotation
          (cognitiveStatusResultOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResultOrganizerTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.75"
           });       
        addAnnotation
          (functionalStatusResultObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResultObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.67"
           });      
        addAnnotation
          (functionalStatusResultOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResultOrganizerTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.66"
           });  
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml
	 * /cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget";       
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatient",
             "constraints.validation.query", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient",
             "constraints.validation.warning", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication"
           });                                                                                                                                                                                                                                          
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml /cda/annotation/
	 * mu2consolGeneralHeaderConstraintsRecordTargetPatientRole </b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole";        
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP",
             "constraints.validation.query", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
             "constraints.validation.warning", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication"
           });                                                                                                                                                                                                                                         
    }

	/**
	 * Initializes the annotations for
	 * <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/
	 * mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient";         
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "ethnicGroupCode.codeSystem", "2.16.840.1.113883.6.238",
             "ethnicGroupCode.codeSystemName", "Race and Ethnicity - CDC",
             "constraints.validation.error", "GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode",
             "raceCode.codeSystem", "2.16.840.1.113883.6.238",
             "raceCode.codeSystemName", "Race and Ethnicity - CDC",
             "constraints.validation.warning", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
             "constraints.validation.query", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode"
           });                                                                                                                                                                                                                                        
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication";          
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode"
           });                                                                                                                                                                                                                                       
    }

	/**
     * Initializes the annotations for <b>duplicates</b>.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected void createDuplicatesAnnotations() {
        String source = "duplicates";           
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] {
           });                                                          
        addAnnotation
          (socialHistorySectionEClass, 
           source, 
           new String[] {
           });          
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (resultsSectionEClass, 
           source, 
           new String[] {
           });       
        addAnnotation
          (resultOrganizerEClass, 
           source, 
           new String[] {
           });       
        addAnnotation
          (resultObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (proceduresSectionEClass, 
           source, 
           new String[] {
           });       
        addAnnotation
          (procedureActivityProcedureEClass, 
           source, 
           new String[] {
           });                                                               
        addAnnotation
          (medicationsAdministeredSectionEClass, 
           source, 
           new String[] {
           });                                                                                        
        addAnnotation
          (functionalStatusSectionEClass, 
           source, 
           new String[] {
           });          
        addAnnotation
          (cognitiveStatusResultObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (cognitiveStatusResultOrganizerEClass, 
           source, 
           new String[] {
           });       
        addAnnotation
          (functionalStatusResultObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (functionalStatusResultOrganizerEClass, 
           source, 
           new String[] {
           }); 
    }

} // Mu2consolPackageImpl
