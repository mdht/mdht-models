/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Immunization;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.Medication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.Result;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.Severity;
import org.openhealthtools.mdht.uml.cda.consol.StatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolFactoryImpl extends EFactoryImpl implements ConsolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConsolFactory init() {
		try {
			ConsolFactory theConsolFactory = (ConsolFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/consol");
			if (theConsolFactory != null) {
				return theConsolFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConsolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConsolPackage.STATUS_OBSERVATION:
				return createStatusObservation();
			case ConsolPackage.CONDITION:
				return createCondition();
			case ConsolPackage.EPISODE_OBSERVATION:
				return createEpisodeObservation();
			case ConsolPackage.CONDITION_ENTRY:
				return createConditionEntry();
			case ConsolPackage.AGE_OBSERVATION:
				return createAgeObservation();
			case ConsolPackage.PROBLEM_STATUS_OBSERVATION:
				return createProblemStatusObservation();
			case ConsolPackage.HEALTH_STATUS_OBSERVATION:
				return createHealthStatusObservation();
			case ConsolPackage.SEVERITY:
				return createSeverity();
			case ConsolPackage.COMMENT:
				return createComment();
			case ConsolPackage.PROBLEM_LIST_SECTION:
				return createProblemListSection();
			case ConsolPackage.PROBLEM_LIST_NARRATIVE_SECTION:
				return createProblemListNarrativeSection();
			case ConsolPackage.DIAGNOSTIC_RESULTS_SECTION:
				return createDiagnosticResultsSection();
			case ConsolPackage.DIAGNOSTIC_RESULTS_NARRATIVE_SECTION:
				return createDiagnosticResultsNarrativeSection();
			case ConsolPackage.RESULT_ORGANIZER:
				return createResultOrganizer();
			case ConsolPackage.RESULT:
				return createResult();
			case ConsolPackage.EXTERNAL_REFERENCE:
				return createExternalReference();
			case ConsolPackage.VITAL_SIGNS_SECTION:
				return createVitalSignsSection();
			case ConsolPackage.VITAL_SIGNS_NARRATIVE_SECTION:
				return createVitalSignsNarrativeSection();
			case ConsolPackage.VITAL_SIGNS_ORGANIZER:
				return createVitalSignsOrganizer();
			case ConsolPackage.VITAL_SIGN:
				return createVitalSign();
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS:
				return createGeneralHeaderConstraints();
			case ConsolPackage.PATIENT_AWARENESS:
				return createPatientAwareness();
			case ConsolPackage.MEDICATION:
				return createMedication();
			case ConsolPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return createMedicationSeriesNumberObservation();
			case ConsolPackage.MEDICATION_STATUS_OBSERVATION:
				return createMedicationStatusObservation();
			case ConsolPackage.REACTION_OBSERVATION:
				return createReactionObservation();
			case ConsolPackage.PRODUCT_INSTANCE:
				return createProductInstance();
			case ConsolPackage.INTERNAL_REFERENCE:
				return createInternalReference();
			case ConsolPackage.PATIENT_MEDICAL_INSTRUCTIONS:
				return createPatientMedicalInstructions();
			case ConsolPackage.MEDICATION_TYPE:
				return createMedicationType();
			case ConsolPackage.MEDICATION_ORDER_INFORMATION:
				return createMedicationOrderInformation();
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return createMedicationFullfillmentInstructions();
			case ConsolPackage.MEDICATIONS_SECTION:
				return createMedicationsSection();
			case ConsolPackage.MEDICATIONS_NARRATIVE_SECTION:
				return createMedicationsNarrativeSection();
			case ConsolPackage.MEDICATION_NORMAL_DOSE:
				return createMedicationNormalDose();
			case ConsolPackage.MEDICATION_SPLIT_DOSE:
				return createMedicationSplitDose();
			case ConsolPackage.MEDICATION_TAPERED_DOSE:
				return createMedicationTaperedDose();
			case ConsolPackage.MEDICATION_CONDITIONAL_DOSE:
				return createMedicationConditionalDose();
			case ConsolPackage.MEDICATION_COMBINATION_MEDICATION:
				return createMedicationCombinationMedication();
			case ConsolPackage.MEDICATION_INFORMATION:
				return createMedicationInformation();
			case ConsolPackage.IMMUNIZATION:
				return createImmunization();
			case ConsolPackage.IMMUNIZATIONS_SECTION:
				return createImmunizationsSection();
			case ConsolPackage.IMMUNIZATIONS_NARRATIVE_SECTION:
				return createImmunizationsNarrativeSection();
			case ConsolPackage.ENCOUNTER_LOCATION:
				return createEncounterLocation();
			case ConsolPackage.SURGERIES_SECTION:
				return createSurgeriesSection();
			case ConsolPackage.SURGERIES_NARRATIVE_SECTION:
				return createSurgeriesNarrativeSection();
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return createProcedureActivityProcedure();
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT:
				return createProcedureActivityAct();
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION:
				return createProcedureActivityObservation();
			case ConsolPackage.CONSOL_REGISTRY_DELEGATE:
				return createConsolRegistryDelegate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusObservation createStatusObservation() {
		StatusObservationImpl statusObservation = new StatusObservationImpl();
		return statusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation createEpisodeObservation() {
		EpisodeObservationImpl episodeObservation = new EpisodeObservationImpl();
		return episodeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEntry createConditionEntry() {
		ConditionEntryImpl conditionEntry = new ConditionEntryImpl();
		return conditionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverity() {
		SeverityImpl severity = new SeverityImpl();
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation createProblemStatusObservation() {
		ProblemStatusObservationImpl problemStatusObservation = new ProblemStatusObservationImpl();
		return problemStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation createHealthStatusObservation() {
		HealthStatusObservationImpl healthStatusObservation = new HealthStatusObservationImpl();
		return healthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection createProblemListSection() {
		ProblemListSectionImpl problemListSection = new ProblemListSectionImpl();
		return problemListSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListNarrativeSection createProblemListNarrativeSection() {
		ProblemListNarrativeSectionImpl problemListNarrativeSection = new ProblemListNarrativeSectionImpl();
		return problemListNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticResultsSection createDiagnosticResultsSection() {
		DiagnosticResultsSectionImpl diagnosticResultsSection = new DiagnosticResultsSectionImpl();
		return diagnosticResultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticResultsNarrativeSection createDiagnosticResultsNarrativeSection() {
		DiagnosticResultsNarrativeSectionImpl diagnosticResultsNarrativeSection = new DiagnosticResultsNarrativeSectionImpl();
		return diagnosticResultsNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsNarrativeSection createVitalSignsNarrativeSection() {
		VitalSignsNarrativeSectionImpl vitalSignsNarrativeSection = new VitalSignsNarrativeSectionImpl();
		return vitalSignsNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSign createVitalSign() {
		VitalSignImpl vitalSign = new VitalSignImpl();
		return vitalSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAwareness createPatientAwareness() {
		PatientAwarenessImpl patientAwareness = new PatientAwarenessImpl();
		return patientAwareness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation createMedicationSeriesNumberObservation() {
		MedicationSeriesNumberObservationImpl medicationSeriesNumberObservation = new MedicationSeriesNumberObservationImpl();
		return medicationSeriesNumberObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation createMedicationStatusObservation() {
		MedicationStatusObservationImpl medicationStatusObservation = new MedicationStatusObservationImpl();
		return medicationStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation createReactionObservation() {
		ReactionObservationImpl reactionObservation = new ReactionObservationImpl();
		return reactionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReference createInternalReference() {
		InternalReferenceImpl internalReference = new InternalReferenceImpl();
		return internalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientMedicalInstructions createPatientMedicalInstructions() {
		PatientMedicalInstructionsImpl patientMedicalInstructions = new PatientMedicalInstructionsImpl();
		return patientMedicalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType createMedicationType() {
		MedicationTypeImpl medicationType = new MedicationTypeImpl();
		return medicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderInformation createMedicationOrderInformation() {
		MedicationOrderInformationImpl medicationOrderInformation = new MedicationOrderInformationImpl();
		return medicationOrderInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFullfillmentInstructions createMedicationFullfillmentInstructions() {
		MedicationFullfillmentInstructionsImpl medicationFullfillmentInstructions = new MedicationFullfillmentInstructionsImpl();
		return medicationFullfillmentInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsNarrativeSection createMedicationsNarrativeSection() {
		MedicationsNarrativeSectionImpl medicationsNarrativeSection = new MedicationsNarrativeSectionImpl();
		return medicationsNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationNormalDose createMedicationNormalDose() {
		MedicationNormalDoseImpl medicationNormalDose = new MedicationNormalDoseImpl();
		return medicationNormalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSplitDose createMedicationSplitDose() {
		MedicationSplitDoseImpl medicationSplitDose = new MedicationSplitDoseImpl();
		return medicationSplitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationTaperedDose createMedicationTaperedDose() {
		MedicationTaperedDoseImpl medicationTaperedDose = new MedicationTaperedDoseImpl();
		return medicationTaperedDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationConditionalDose createMedicationConditionalDose() {
		MedicationConditionalDoseImpl medicationConditionalDose = new MedicationConditionalDoseImpl();
		return medicationConditionalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationCombinationMedication createMedicationCombinationMedication() {
		MedicationCombinationMedicationImpl medicationCombinationMedication = new MedicationCombinationMedicationImpl();
		return medicationCombinationMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation createMedicationInformation() {
		MedicationInformationImpl medicationInformation = new MedicationInformationImpl();
		return medicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsNarrativeSection createImmunizationsNarrativeSection() {
		ImmunizationsNarrativeSectionImpl immunizationsNarrativeSection = new ImmunizationsNarrativeSectionImpl();
		return immunizationsNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection createSurgeriesSection() {
		SurgeriesSectionImpl surgeriesSection = new SurgeriesSectionImpl();
		return surgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesNarrativeSection createSurgeriesNarrativeSection() {
		SurgeriesNarrativeSectionImpl surgeriesNarrativeSection = new SurgeriesNarrativeSectionImpl();
		return surgeriesNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedure createProcedureActivityProcedure() {
		ProcedureActivityProcedureImpl procedureActivityProcedure = new ProcedureActivityProcedureImpl();
		return procedureActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityAct createProcedureActivityAct() {
		ProcedureActivityActImpl procedureActivityAct = new ProcedureActivityActImpl();
		return procedureActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityObservation createProcedureActivityObservation() {
		ProcedureActivityObservationImpl procedureActivityObservation = new ProcedureActivityObservationImpl();
		return procedureActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolRegistryDelegate createConsolRegistryDelegate() {
		ConsolRegistryDelegateImpl consolRegistryDelegate = new ConsolRegistryDelegateImpl();
		return consolRegistryDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolPackage getConsolPackage() {
		return (ConsolPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConsolPackage getPackage() {
		return ConsolPackage.eINSTANCE;
	}

} // ConsolFactoryImpl
