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
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
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
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mu2consolPackageImpl extends EPackageImpl implements Mu2consolPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalHeaderConstraintsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass summaryOfCareRecordEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass encountersSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass encounterActivitiesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass planOfCareSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assessmentAndPlanSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assessmentSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass socialHistorySectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smokingStatusObservationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resultsSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resultOrganizerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resultObservationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass proceduresSectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass procedureActivityProcedureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clinicalOfficeVisitSummaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transitionOfCareAmbulatorySummaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transitionOfCareInpatientSummaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass viewDownloadTransmitSummaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdtInpatientSummaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdtAmbulatorySummaryEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private Mu2consolPackageImpl() {
        super(eNS_URI, Mu2consolFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link Mu2consolPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
             new EValidator.Descriptor()
             {
                 public EValidator getEValidator()
                 {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeneralHeaderConstraints() {
        return generalHeaderConstraintsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSummaryOfCareRecord() {
        return summaryOfCareRecordEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEncountersSection() {
        return encountersSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEncounterActivities() {
        return encounterActivitiesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPlanOfCareSection() {
        return planOfCareSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssessmentAndPlanSection() {
        return assessmentAndPlanSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssessmentSection() {
        return assessmentSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSocialHistorySection() {
        return socialHistorySectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSmokingStatusObservation() {
        return smokingStatusObservationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResultsSection() {
        return resultsSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResultOrganizer() {
        return resultOrganizerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResultObservation() {
        return resultObservationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProceduresSection() {
        return proceduresSectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedureActivityProcedure() {
        return procedureActivityProcedureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
    public EClass getTransitionOfCareAmbulatorySummary() {
        return transitionOfCareAmbulatorySummaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransitionOfCareInpatientSummary() {
        return transitionOfCareInpatientSummaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getViewDownloadTransmitSummary() {
        return viewDownloadTransmitSummaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDTInpatientSummary() {
        return vdtInpatientSummaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
    public Mu2consolFactory getMu2consolFactory() {
        return (Mu2consolFactory)getEFactoryInstance();
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
        generalHeaderConstraintsEClass = createEClass(GENERAL_HEADER_CONSTRAINTS);

        summaryOfCareRecordEClass = createEClass(SUMMARY_OF_CARE_RECORD);

        encountersSectionEClass = createEClass(ENCOUNTERS_SECTION);

        encounterActivitiesEClass = createEClass(ENCOUNTER_ACTIVITIES);

        planOfCareSectionEClass = createEClass(PLAN_OF_CARE_SECTION);

        assessmentAndPlanSectionEClass = createEClass(ASSESSMENT_AND_PLAN_SECTION);

        assessmentSectionEClass = createEClass(ASSESSMENT_SECTION);

        socialHistorySectionEClass = createEClass(SOCIAL_HISTORY_SECTION);

        smokingStatusObservationEClass = createEClass(SMOKING_STATUS_OBSERVATION);

        resultsSectionEClass = createEClass(RESULTS_SECTION);

        resultOrganizerEClass = createEClass(RESULT_ORGANIZER);

        resultObservationEClass = createEClass(RESULT_OBSERVATION);

        proceduresSectionEClass = createEClass(PROCEDURES_SECTION);

        procedureActivityProcedureEClass = createEClass(PROCEDURE_ACTIVITY_PROCEDURE);

        clinicalOfficeVisitSummaryEClass = createEClass(CLINICAL_OFFICE_VISIT_SUMMARY);

        transitionOfCareAmbulatorySummaryEClass = createEClass(TRANSITION_OF_CARE_AMBULATORY_SUMMARY);

        transitionOfCareInpatientSummaryEClass = createEClass(TRANSITION_OF_CARE_INPATIENT_SUMMARY);

        viewDownloadTransmitSummaryEClass = createEClass(VIEW_DOWNLOAD_TRANSMIT_SUMMARY);

        vdtInpatientSummaryEClass = createEClass(VDT_INPATIENT_SUMMARY);

        vdtAmbulatorySummaryEClass = createEClass(VDT_AMBULATORY_SUMMARY);
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
        ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        generalHeaderConstraintsEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
        summaryOfCareRecordEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        encountersSectionEClass.getESuperTypes().add(theConsolPackage.getEncountersSection());
        encounterActivitiesEClass.getESuperTypes().add(theConsolPackage.getEncounterActivities());
        planOfCareSectionEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareSection());
        assessmentAndPlanSectionEClass.getESuperTypes().add(theConsolPackage.getAssessmentAndPlanSection());
        assessmentSectionEClass.getESuperTypes().add(theConsolPackage.getAssessmentSection());
        socialHistorySectionEClass.getESuperTypes().add(theConsolPackage.getSocialHistorySection());
        smokingStatusObservationEClass.getESuperTypes().add(theConsolPackage.getTobaccoUse());
        resultsSectionEClass.getESuperTypes().add(theConsolPackage.getResultsSection());
        resultOrganizerEClass.getESuperTypes().add(theConsolPackage.getResultOrganizer());
        resultObservationEClass.getESuperTypes().add(theConsolPackage.getResultObservation());
        proceduresSectionEClass.getESuperTypes().add(theConsolPackage.getProceduresSection());
        procedureActivityProcedureEClass.getESuperTypes().add(theConsolPackage.getProcedureActivityProcedure());
        clinicalOfficeVisitSummaryEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        transitionOfCareAmbulatorySummaryEClass.getESuperTypes().add(this.getSummaryOfCareRecord());
        transitionOfCareInpatientSummaryEClass.getESuperTypes().add(this.getSummaryOfCareRecord());
        viewDownloadTransmitSummaryEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());
        vdtInpatientSummaryEClass.getESuperTypes().add(this.getViewDownloadTransmitSummary());
        vdtAmbulatorySummaryEClass.getESuperTypes().add(this.getViewDownloadTransmitSummary());

        // Initialize classes and features; add operations and parameters
        initEClass(generalHeaderConstraintsEClass, GeneralHeaderConstraints.class, "GeneralHeaderConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateMu2consolGeneralHeaderConstraintsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateMu2consolGeneralHeaderConstraintsDocumentationOf", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(generalHeaderConstraintsEClass, ecorePackage.getEBoolean(), "validateGeneralHeaderConstraintsComponent1EncompassingEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordCognitiveStatusEntries", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordFunctionalStatusEntries", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordSocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordAssessmentSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(summaryOfCareRecordEClass, ecorePackage.getEBoolean(), "validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        addEOperation(summaryOfCareRecordEClass, this.getEncountersSection(), "getEncountersSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getAssessmentSection(), "getAssessmentSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getPostoperativeDiagnosisSection(), "getPostoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getHistoryOfPastIllnessSection(), "getHistoryOfPastIllnessSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getPreoperativeDiagnosisSection(), "getPreoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, this.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getPostprocedureDiagnosisSection(), "getPostprocedureDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(summaryOfCareRecordEClass, theConsolPackage.getFunctionalStatusSection(), "getFunctionalStatusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(encountersSectionEClass, EncountersSection.class, "EncountersSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(encountersSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolEncountersSectionEncounterActivities", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(encountersSectionEClass, this.getEncounterActivities(), "getMu2consolEncounterActivitiess", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(encounterActivitiesEClass, EncounterActivities.class, "EncounterActivities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(encounterActivitiesEClass, ecorePackage.getEBoolean(), "validateMu2consolEncounterActivitiesCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(planOfCareSectionEClass, PlanOfCareSection.class, "PlanOfCareSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(planOfCareSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityAct(), "getMu2consolPlanOfCareActivityActs", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityEncounter(), "getMu2consolPlanOfCareActivityEncounters", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(planOfCareSectionEClass, theConsolPackage.getPlanOfCareActivityObservation(), "getMu2consolPlanOfCareActivityObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(assessmentAndPlanSectionEClass, AssessmentAndPlanSection.class, "AssessmentAndPlanSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getPlanOfCareActivityProcedure(), "getPlanOfCareActivityProcedure", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getPlanOfCareActivitySubstanceAdministration(), "getPlanOfCareActivitySubstanceAdministration", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getPlanOfCareActivitySupply(), "getPlanOfCareActivitySupply", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(assessmentAndPlanSectionEClass, theConsolPackage.getProblemObservation(), "getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(assessmentSectionEClass, AssessmentSection.class, "AssessmentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(assessmentSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolAssessmentSectionProblemObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(assessmentSectionEClass, theConsolPackage.getProblemObservation(), "getProblemObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(socialHistorySectionEClass, SocialHistorySection.class, "SocialHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(socialHistorySectionEClass, ecorePackage.getEBoolean(), "validateMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(socialHistorySectionEClass, this.getSmokingStatusObservation(), "getMu2consolSmokingStatusObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(smokingStatusObservationEClass, SmokingStatusObservation.class, "SmokingStatusObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(smokingStatusObservationEClass, ecorePackage.getEBoolean(), "validateSmokingStatusObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(smokingStatusObservationEClass, ecorePackage.getEBoolean(), "validateSmokingStatusObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(resultsSectionEClass, ResultsSection.class, "ResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(resultsSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolResultsSectionResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(resultsSectionEClass, this.getResultOrganizer(), "getMu2consolResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(resultOrganizerEClass, ResultOrganizer.class, "ResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(resultOrganizerEClass, ecorePackage.getEBoolean(), "validateMu2consolResultOrganizerResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(resultOrganizerEClass, this.getResultObservation(), "getMu2consolResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(resultObservationEClass, ResultObservation.class, "ResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateMu2consolResultObservationResultObservationCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(resultObservationEClass, ecorePackage.getEBoolean(), "validateMu2consolResultObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(proceduresSectionEClass, ProceduresSection.class, "ProceduresSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(proceduresSectionEClass, ecorePackage.getEBoolean(), "validateMu2consolProceduresSectionProcedureActivityProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(proceduresSectionEClass, this.getProcedureActivityProcedure(), "getMu2consolProcedureActivityProcedures", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(procedureActivityProcedureEClass, ProcedureActivityProcedure.class, "ProcedureActivityProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(procedureActivityProcedureEClass, ecorePackage.getEBoolean(), "validateMu2consolProcedureActivityProcedureCodeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(procedureActivityProcedureEClass, ecorePackage.getEBoolean(), "validateMu2consolProcedureActivityProcedureCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(clinicalOfficeVisitSummaryEClass, ClinicalOfficeVisitSummary.class, "ClinicalOfficeVisitSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryResponsibleParty", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryReasonForOfficeVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryInstructionsEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMedicationsAdministeredSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(clinicalOfficeVisitSummaryEClass, ecorePackage.getEBoolean(), "validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getPlanOfCareSection(), "retrievePlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getInstructionsSection(), "retrieveInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getMedicationsAdministeredSection(), "retrieveMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getImmunizationsSection(), "getImmunizationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getMedicationsAdministeredSection(), "getMedicationsAdministeredSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getReasonForVisitSection(), "getReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getChiefComplaintAndReasonForVisitSection(), "getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, theConsolPackage.getInstructionsSection(), "getInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(clinicalOfficeVisitSummaryEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(transitionOfCareAmbulatorySummaryEClass, TransitionOfCareAmbulatorySummary.class, "TransitionOfCareAmbulatorySummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryResponsibleParty", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryAmbulatoryEncounterDiagnoses", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareAmbulatorySummaryReasonForReferralSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(transitionOfCareAmbulatorySummaryEClass, theConsolPackage.getReasonForReferralSection(), "getReasonForReferralSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(transitionOfCareInpatientSummaryEClass, TransitionOfCareInpatientSummary.class, "TransitionOfCareInpatientSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(transitionOfCareInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(transitionOfCareInpatientSummaryEClass, theConsolPackage.getHospitalDischargeInstructionsSection(), "getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(transitionOfCareInpatientSummaryEClass, theConsolPackage.getHospitalDischargeMedicationsSection(), "getHospitalDischargeMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(transitionOfCareInpatientSummaryEClass, theConsolPackage.getHospitalAdmissionDiagnosisSection(), "getHospitalAdmissionDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(transitionOfCareInpatientSummaryEClass, theConsolPackage.getHospitalDischargeDiagnosisSection(), "getHospitalDischargeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(transitionOfCareInpatientSummaryEClass, theConsolPackage.getHospitalAdmissionMedicationsSectionEntriesOptional(), "getHospitalAdmissionMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(viewDownloadTransmitSummaryEClass, ViewDownloadTransmitSummary.class, "ViewDownloadTransmitSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryCarePlanFields", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryPlanOfCareSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummarySocialHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(viewDownloadTransmitSummaryEClass, ecorePackage.getEBoolean(), "validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getPreoperativeDiagnosisSection(), "retrievePreoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getMedicationsSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getProblemSection(), "getProblemSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getProceduresSection(), "getProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, theConsolPackage.getVitalSignsSection(), "getVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getResultsSection(), "getResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getAssessmentAndPlanSection(), "getAssessmentAndPlanSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getPlanOfCareSection(), "getPlanOfCareSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(viewDownloadTransmitSummaryEClass, this.getSocialHistorySection(), "getSocialHistorySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(vdtInpatientSummaryEClass, VDTInpatientSummary.class, "VDTInpatientSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryChiefComplaintOrReasonForVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryPreoperativeDiagnosisEntry", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(vdtInpatientSummaryEClass, ecorePackage.getEBoolean(), "validateVDTInpatientSummaryHospitalDischargeMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getHospitalDischargeInstructionsSection(), "getHospitalDischargeInstructionsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getHospitalAdmissionDiagnosisSection(), "getHospitalAdmissionDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getChiefComplaintSection(), "getChiefComplaintSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getReasonForVisitSection(), "getReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getChiefComplaintAndReasonForVisitSection(), "getChiefComplaintAndReasonForVisitSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getHospitalDischargeMedicationsSection(), "getHospitalDischargeMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getPreoperativeDiagnosisSection(), "getPreoperativeDiagnosisSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(vdtInpatientSummaryEClass, theConsolPackage.getHospitalAdmissionMedicationsSectionEntriesOptional(), "getHospitalAdmissionMedicationsSectionEntriesOptional", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(vdtAmbulatorySummaryEClass, VDTAmbulatorySummary.class, "VDTAmbulatorySummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(vdtAmbulatorySummaryEClass, ecorePackage.getEBoolean(), "validateVDTAmbulatorySummaryResponsibleParty", 0, 1, IS_UNIQUE, IS_ORDERED);
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
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf
        createMu2consolGeneralHeaderConstraintsDocumentationOfAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1Annotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
        createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1
        createMu2consolGeneralHeaderConstraintsComponent1Annotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter
        createMu2consolGeneralHeaderConstraintsComponent1EncompassingEncounterAnnotations();
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
           new String[] 
           {
             "initializers", "org.openhealthtools.mdht.uml.cda.mu2consol"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                 
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
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolGeneralHeaderConstraintsTemplateId Mu2consolGeneralHeaderConstraintsRecordTarget Mu2consolGeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent GeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant GeneralHeaderConstraintsComponent1EncompassingEncounter",
             "templateId.root", "2.16.840.1.113883.10.20.22.1.1",
             "constraints.validation.query", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent GeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant GeneralHeaderConstraintsComponent1EncompassingEncounter",
             "constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode", "GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP"
           });                                
        addAnnotation
          (summaryOfCareRecordEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SummaryOfCareRecordCarePlanning SummaryOfCareRecordCognitiveStatusEntries SummaryOfCareRecordFunctionalStatusEntries SummaryOfCareRecordPlanOfCareSection SummaryOfCareRecordProblemSection SummaryOfCareRecordAllergiesSection SummaryOfCareRecordImmunizationsSection SummaryOfCareRecordMedicationsSection SummaryOfCareRecordSocialHistorySection SummaryOfCareRecordResultsSection SummaryOfCareRecordVitalSignsSection SummaryOfCareRecordProceduresSection SummaryOfCareRecordSocialHistorySectionTemplateId SummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation SummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordPlanOfCareSectionTemplateId SummaryOfCareRecordAssessmentAndPlanSectionTemplateId SummaryOfCareRecordAssessmentSectionTemplateId SummaryOfCareRecordMu2consolAssessmentSectionProblemObservation",
             "constraints.validation.query", "SummaryOfCareRecordCognitiveStatusEntries SummaryOfCareRecordFunctionalStatusEntries SummaryOfCareRecordSocialHistorySectionTemplateId SummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation SummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare SummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation SummaryOfCareRecordPlanOfCareSectionTemplateId SummaryOfCareRecordAssessmentAndPlanSectionTemplateId SummaryOfCareRecordAssessmentSectionTemplateId SummaryOfCareRecordMu2consolAssessmentSectionProblemObservation"
           });                                                                                      
        addAnnotation
          (encountersSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolEncountersSectionTemplateId Mu2consolEncountersSectionEncounterActivities",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.22.1"
           });          
        addAnnotation
          (encounterActivitiesEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolEncounterActivitiesTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.49",
             "constraints.validation.warning", "Mu2consolEncounterActivitiesCodeValue"
           });         
        addAnnotation
          (planOfCareSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolPlanOfCareSectionPlanOfCareActivityObservation Mu2consolPlanOfCareSectionTemplateId Mu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.10"
           });               
        addAnnotation
          (assessmentAndPlanSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolAssessmentAndPlanSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.9"
           });          
        addAnnotation
          (assessmentSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolAssessmentSectionTemplateId Mu2consolAssessmentSectionProblemObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.8"
           });          
        addAnnotation
          (socialHistorySectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolSocialHistorySectionTemplateId Mu2consolSocialHistorySectionSmokingStatusObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.17"
           });          
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "SmokingStatusObservationTemplateId SmokingStatusObservationValue SmokingStatusObservationValueP",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.78",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT",
             "constraints.validation.dependOn.SmokingStatusObservationValue", "SmokingStatusObservationValueP"
           });            
        addAnnotation
          (resultsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolResultsSectionTemplateId Mu2consolResultsSectionResultOrganizer",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.3.1"
           });          
        addAnnotation
          (resultOrganizerEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolResultOrganizerTemplateId Mu2consolResultOrganizerResultObservation",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.1"
           });          
        addAnnotation
          (resultObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolResultObservationTemplateId Mu2consolResultObservationResultObservationCodeValue Mu2consolResultObservationCode",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.2"
           });            
        addAnnotation
          (proceduresSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolProceduresSectionTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.22.2.7.1",
             "constraints.validation.info", "Mu2consolProceduresSectionProcedureActivityProcedure"
           });          
        addAnnotation
          (procedureActivityProcedureEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mu2consolProcedureActivityProcedureTemplateId Mu2consolProcedureActivityProcedureCode",
             "templateId.root", "2.16.840.1.113883.10.20.22.4.14",
             "constraints.validation.warning", "Mu2consolProcedureActivityProcedureCodeValue"
           });            
        addAnnotation
          (clinicalOfficeVisitSummaryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.query", "ClinicalOfficeVisitSummaryResponsibleParty ClinicalOfficeVisitSummaryEffectiveTime ClinicalOfficeVisitSummaryLocation ClinicalOfficeVisitSummaryPlanOfCareActOrEncounter ClinicalOfficeVisitSummaryInstructionsEntry ClinicalOfficeVisitSummaryMedicationsAdministeredEntry ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId ClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId ClinicalOfficeVisitSummarySocialHistorySectionTemplateId ClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation",
             "constraints.validation.error", "ClinicalOfficeVisitSummaryResponsibleParty ClinicalOfficeVisitSummaryReasonForOfficeVisit ClinicalOfficeVisitSummaryCarePlanning ClinicalOfficeVisitSummaryEffectiveTime ClinicalOfficeVisitSummaryLocation ClinicalOfficeVisitSummaryPlanOfCareActOrEncounter ClinicalOfficeVisitSummaryInstructionsEntry ClinicalOfficeVisitSummaryMedicationsAdministeredEntry ClinicalOfficeVisitSummaryProblemSection ClinicalOfficeVisitSummaryMedicationsSection ClinicalOfficeVisitSummaryAllergiesSection ClinicalOfficeVisitSummaryResultsSection ClinicalOfficeVisitSummaryVitalSignsSection ClinicalOfficeVisitSummaryPlanOfCareSection ClinicalOfficeVisitSummaryProceduresSection ClinicalOfficeVisitSummaryImmunizationsSection ClinicalOfficeVisitSummaryMedicationsAdministeredSection ClinicalOfficeVisitSummaryInstructionsSection ClinicalOfficeVisitSummarySocialHistorySection ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId ClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId ClinicalOfficeVisitSummarySocialHistorySectionTemplateId ClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation"
           });                                                                                                  
        addAnnotation
          (transitionOfCareAmbulatorySummaryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.query", "TransitionOfCareAmbulatorySummaryResponsibleParty",
             "constraints.validation.error", "TransitionOfCareAmbulatorySummaryResponsibleParty TransitionOfCareAmbulatorySummaryAmbulatoryEncounterDiagnoses TransitionOfCareAmbulatorySummaryReasonForReferralSection"
           });               
        addAnnotation
          (transitionOfCareInpatientSummaryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "TransitionOfCareInpatientSummaryInpatientEncounterDiagnoses TransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry TransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry TransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry TransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry TransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection TransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection",
             "constraints.validation.query", "TransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry TransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry TransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry TransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry"
           });                               
        addAnnotation
          (viewDownloadTransmitSummaryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ViewDownloadTransmitSummaryCarePlanFields ViewDownloadTransmitSummaryAllergiesSection ViewDownloadTransmitSummaryMedicationsSection ViewDownloadTransmitSummaryProblemSection ViewDownloadTransmitSummaryProceduresSection ViewDownloadTransmitSummaryVitalSignsSection ViewDownloadTransmitSummaryResultsSection ViewDownloadTransmitSummaryPlanOfCareSection ViewDownloadTransmitSummarySocialHistorySection ViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ViewDownloadTransmitSummaryPlanOfCareSectionTemplateId ViewDownloadTransmitSummarySocialHistorySectionTemplateId ViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation",
             "constraints.validation.query", "ViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation ViewDownloadTransmitSummaryPlanOfCareSectionTemplateId ViewDownloadTransmitSummarySocialHistorySectionTemplateId ViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation"
           });                                                            
        addAnnotation
          (vdtInpatientSummaryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.query", "VDTInpatientSummaryEffectiveTime VDTInpatientSummaryLocation VDTInpatientSummaryHospitalAdmissionDiagnosisEntry VDTInpatientSummaryPreoperativeDiagnosisEntry",
             "constraints.validation.error", "VDTInpatientSummaryEffectiveTime VDTInpatientSummaryLocation VDTInpatientSummaryChiefComplaintOrReasonForVisit VDTInpatientSummaryHospitalAdmissionDiagnosisEntry VDTInpatientSummaryPreoperativeDiagnosisEntry VDTInpatientSummaryHospitalDischargeInstructionsSection VDTInpatientSummaryHospitalAdmissionDiagnosisSection VDTInpatientSummaryHospitalDischargeMedicationsSection"
           });                                     
        addAnnotation
          (vdtAmbulatorySummaryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.query", "VDTAmbulatorySummaryResponsibleParty",
             "constraints.validation.error", "VDTAmbulatorySummaryResponsibleParty"
           });   
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget";       
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "RecordTargetPatientRole RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP RecordTargetPatientRolePatientLanguageCommunicationLanguageCode RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient",
             "constraints.validation.query", "RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP RecordTargetPatientRolePatientLanguageCommunicationLanguageCode RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient",
             "constraints.validation.dependOn.RecordTargetPatientRolePatientLanguageCommunicationLanguageCode", "RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole";        
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PatientRolePatient PatientRolePatientLanguageCommunicationLanguageCodeP PatientRolePatientLanguageCommunicationLanguageCode PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication",
             "constraints.validation.query", "PatientRolePatientLanguageCommunicationLanguageCodeP PatientRolePatientLanguageCommunicationLanguageCode PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication",
             "constraints.validation.dependOn.PatientRolePatientLanguageCommunicationLanguageCode", "PatientRolePatientLanguageCommunicationLanguageCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient";         
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "ethnicGroupCode.codeSystem", "2.16.840.1.113883.6.238",
             "ethnicGroupCode.codeSystemName", "Race and Ethnicity - CDC",
             "constraints.validation.error", "PatientEthnicGroupCode PatientEthnicGroupCodeP PatientRaceCode PatientRaceCodeP PatientLanguageCommunication PatientLanguageCommunicationLanguageCodeP PatientLanguageCommunicationLanguageCode",
             "raceCode.codeSystem", "2.16.840.1.113883.6.238",
             "raceCode.codeSystemName", "Race and Ethnicity - CDC",
             "constraints.validation.query", "PatientLanguageCommunicationLanguageCodeP PatientLanguageCommunicationLanguageCode",
             "constraints.validation.dependOn.PatientLanguageCommunicationLanguageCode", "PatientLanguageCommunicationLanguageCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication";          
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "LanguageCommunicationLanguageCode LanguageCommunicationLanguageCodeP",
             "constraints.validation.dependOn.LanguageCommunicationLanguageCode", "LanguageCommunicationLanguageCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf";           
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "DocumentationOfServiceEvent DocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson DocumentationOfServiceEventPerformer1AssignedEntity DocumentationOfServiceEventPerformer",
             "constraints.validation.query", "DocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson DocumentationOfServiceEventPerformer1AssignedEntity DocumentationOfServiceEventPerformer"
           });                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent";            
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "ServiceEventPerformer ServiceEventPerformer1AssignedEntityAssignedPerson ServiceEventPerformer1AssignedEntity",
             "constraints.validation.query", "ServiceEventPerformer1AssignedEntityAssignedPerson ServiceEventPerformer1AssignedEntity"
           });                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1Annotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1";             
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Performer1AssignedEntity Performer1AssignedEntityAssignedPerson",
             "constraints.validation.query", "Performer1AssignedEntityAssignedPerson"
           });                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity";              
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "AssignedEntityAssignedPerson"
           });                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsComponent1Annotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1";               
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Component1EncompassingEncounter Component1EncompassingEncounterEncounterParticipant",
             "constraints.validation.query", "Component1EncompassingEncounterEncounterParticipant"
           });                                                                                                                                                                                                                                                                                                                                                                                                                       
    }

    /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMu2consolGeneralHeaderConstraintsComponent1EncompassingEncounterAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter";                
        addAnnotation
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "EncompassingEncounterEncounterParticipant"
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
          (generalHeaderConstraintsEClass, 
           source, 
           new String[] 
           {
           });                                                                                                        
        addAnnotation
          (encountersSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (encounterActivitiesEClass, 
           source, 
           new String[] 
           {
           });         
        addAnnotation
          (planOfCareSectionEClass, 
           source, 
           new String[] 
           {
           });               
        addAnnotation
          (assessmentAndPlanSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (assessmentSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (socialHistorySectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (smokingStatusObservationEClass, 
           source, 
           new String[] 
           {
           });            
        addAnnotation
          (resultsSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (resultOrganizerEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (resultObservationEClass, 
           source, 
           new String[] 
           {
           });            
        addAnnotation
          (proceduresSectionEClass, 
           source, 
           new String[] 
           {
           });          
        addAnnotation
          (procedureActivityProcedureEClass, 
           source, 
           new String[] 
           {
           });                                                                                                                                                                                                                                       
    }

} //Mu2consolPackageImpl
