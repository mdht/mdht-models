/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason;
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome;
import org.openhealthtools.mdht.uml.cda.sdtm.EventPattern;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.Indication;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage
 * @generated
 */
public class SdtmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdtmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdtmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SdtmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdtmSwitch<Adapter> modelSwitch =
		new SdtmSwitch<Adapter>() {
			@Override
			public Adapter caseSubjectDataHumanClinicalTrials(SubjectDataHumanClinicalTrials object) {
				return createSubjectDataHumanClinicalTrialsAdapter();
			}
			@Override
			public Adapter caseHumanClinicalSubjectDataDocumentSection(HumanClinicalSubjectDataDocumentSection object) {
				return createHumanClinicalSubjectDataDocumentSectionAdapter();
			}
			@Override
			public Adapter caseHumanClinicalSubjectDemographics(HumanClinicalSubjectDemographics object) {
				return createHumanClinicalSubjectDemographicsAdapter();
			}
			@Override
			public Adapter caseDataCollection(DataCollection object) {
				return createDataCollectionAdapter();
			}
			@Override
			public Adapter caseEventStudyDay(EventStudyDay object) {
				return createEventStudyDayAdapter();
			}
			@Override
			public Adapter caseStudyArm(StudyArm object) {
				return createStudyArmAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseDomainAssignment(DomainAssignment object) {
				return createDomainAssignmentAdapter();
			}
			@Override
			public Adapter caseRelatedRecord(RelatedRecord object) {
				return createRelatedRecordAdapter();
			}
			@Override
			public Adapter caseSupplementalValue(SupplementalValue object) {
				return createSupplementalValueAdapter();
			}
			@Override
			public Adapter caseReferencePeriod(ReferencePeriod object) {
				return createReferencePeriodAdapter();
			}
			@Override
			public Adapter caseFindingAbout(FindingAbout object) {
				return createFindingAboutAdapter();
			}
			@Override
			public Adapter caseGroupIdentifier(GroupIdentifier object) {
				return createGroupIdentifierAdapter();
			}
			@Override
			public Adapter caseNonPerformanceReason(NonPerformanceReason object) {
				return createNonPerformanceReasonAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseSubCategory(SubCategory object) {
				return createSubCategoryAdapter();
			}
			@Override
			public Adapter caseVisit(Visit object) {
				return createVisitAdapter();
			}
			@Override
			public Adapter caseVitalSign(VitalSign object) {
				return createVitalSignAdapter();
			}
			@Override
			public Adapter caseTimingReference(TimingReference object) {
				return createTimingReferenceAdapter();
			}
			@Override
			public Adapter casePlannedStudyDay(PlannedStudyDay object) {
				return createPlannedStudyDayAdapter();
			}
			@Override
			public Adapter caseStudyDayPeriod(StudyDayPeriod object) {
				return createStudyDayPeriodAdapter();
			}
			@Override
			public Adapter caseExclusionReason(ExclusionReason object) {
				return createExclusionReasonAdapter();
			}
			@Override
			public Adapter casePositionofSubject(PositionofSubject object) {
				return createPositionofSubjectAdapter();
			}
			@Override
			public Adapter caseECGTestResult(ECGTestResult object) {
				return createECGTestResultAdapter();
			}
			@Override
			public Adapter casePhysicalExaminationFinding(PhysicalExaminationFinding object) {
				return createPhysicalExaminationFindingAdapter();
			}
			@Override
			public Adapter caseBodySystemorOrganClass(BodySystemorOrganClass object) {
				return createBodySystemorOrganClassAdapter();
			}
			@Override
			public Adapter caseMicrobiologySpecimenFinding(MicrobiologySpecimenFinding object) {
				return createMicrobiologySpecimenFindingAdapter();
			}
			@Override
			public Adapter caseSpecimenInformation(SpecimenInformation object) {
				return createSpecimenInformationAdapter();
			}
			@Override
			public Adapter caseResultCategory(ResultCategory object) {
				return createResultCategoryAdapter();
			}
			@Override
			public Adapter caseMicrobiologySusceptibility(MicrobiologySusceptibility object) {
				return createMicrobiologySusceptibilityAdapter();
			}
			@Override
			public Adapter casePharmacokineticConcentrationFinding(PharmacokineticConcentrationFinding object) {
				return createPharmacokineticConcentrationFindingAdapter();
			}
			@Override
			public Adapter caseFastingStatus(FastingStatus object) {
				return createFastingStatusAdapter();
			}
			@Override
			public Adapter caseAssayQuantitation(AssayQuantitation object) {
				return createAssayQuantitationAdapter();
			}
			@Override
			public Adapter caseDrugAccountability(DrugAccountability object) {
				return createDrugAccountabilityAdapter();
			}
			@Override
			public Adapter caseHumanClinicalLaboratoryTestResult(HumanClinicalLaboratoryTestResult object) {
				return createHumanClinicalLaboratoryTestResultAdapter();
			}
			@Override
			public Adapter caseToxicity(Toxicity object) {
				return createToxicityAdapter();
			}
			@Override
			public Adapter caseQuestionnaireFinding(QuestionnaireFinding object) {
				return createQuestionnaireFindingAdapter();
			}
			@Override
			public Adapter casePharmacokineticParameterFinding(PharmacokineticParameterFinding object) {
				return createPharmacokineticParameterFindingAdapter();
			}
			@Override
			public Adapter caseSubjectElement(SubjectElement object) {
				return createSubjectElementAdapter();
			}
			@Override
			public Adapter caseStudyEpoch(StudyEpoch object) {
				return createStudyEpochAdapter();
			}
			@Override
			public Adapter caseHumanClinicalDisposition(HumanClinicalDisposition object) {
				return createHumanClinicalDispositionAdapter();
			}
			@Override
			public Adapter caseMedicalHistoryItem(MedicalHistoryItem object) {
				return createMedicalHistoryItemAdapter();
			}
			@Override
			public Adapter casePreSpecifiedEvent(PreSpecifiedEvent object) {
				return createPreSpecifiedEventAdapter();
			}
			@Override
			public Adapter caseStartRelativetoReferencePeriod(StartRelativetoReferencePeriod object) {
				return createStartRelativetoReferencePeriodAdapter();
			}
			@Override
			public Adapter caseStopRelativetoReferencePeriod(StopRelativetoReferencePeriod object) {
				return createStopRelativetoReferencePeriodAdapter();
			}
			@Override
			public Adapter caseProtocolDeviation(ProtocolDeviation object) {
				return createProtocolDeviationAdapter();
			}
			@Override
			public Adapter caseClinicalEvent(ClinicalEvent object) {
				return createClinicalEventAdapter();
			}
			@Override
			public Adapter caseEventorFindingSeverity(EventorFindingSeverity object) {
				return createEventorFindingSeverityAdapter();
			}
			@Override
			public Adapter caseSubjectCharacteristic(SubjectCharacteristic object) {
				return createSubjectCharacteristicAdapter();
			}
			@Override
			public Adapter caseStudySubjectEvent(StudySubjectEvent object) {
				return createStudySubjectEventAdapter();
			}
			@Override
			public Adapter caseSeriousEvent(SeriousEvent object) {
				return createSeriousEventAdapter();
			}
			@Override
			public Adapter caseStudyTreatmentActionTaken(StudyTreatmentActionTaken object) {
				return createStudyTreatmentActionTakenAdapter();
			}
			@Override
			public Adapter caseOtherTreatmentActionTaken(OtherTreatmentActionTaken object) {
				return createOtherTreatmentActionTakenAdapter();
			}
			@Override
			public Adapter caseStudyTreatmentCausality(StudyTreatmentCausality object) {
				return createStudyTreatmentCausalityAdapter();
			}
			@Override
			public Adapter caseNonStudyTreatmentRelationship(NonStudyTreatmentRelationship object) {
				return createNonStudyTreatmentRelationshipAdapter();
			}
			@Override
			public Adapter caseEventPattern(EventPattern object) {
				return createEventPatternAdapter();
			}
			@Override
			public Adapter caseEventOutcome(EventOutcome object) {
				return createEventOutcomeAdapter();
			}
			@Override
			public Adapter caseConcomitantTreatment(ConcomitantTreatment object) {
				return createConcomitantTreatmentAdapter();
			}
			@Override
			public Adapter caseEventDuration(EventDuration object) {
				return createEventDurationAdapter();
			}
			@Override
			public Adapter caseStudySubjectFinding(StudySubjectFinding object) {
				return createStudySubjectFindingAdapter();
			}
			@Override
			public Adapter caseDeathRelationship(DeathRelationship object) {
				return createDeathRelationshipAdapter();
			}
			@Override
			public Adapter caseStudySubjectIntervention(StudySubjectIntervention object) {
				return createStudySubjectInterventionAdapter();
			}
			@Override
			public Adapter caseIndication(Indication object) {
				return createIndicationAdapter();
			}
			@Override
			public Adapter caseIntendedRegimen(IntendedRegimen object) {
				return createIntendedRegimenAdapter();
			}
			@Override
			public Adapter caseDoseAdjustmentReason(DoseAdjustmentReason object) {
				return createDoseAdjustmentReasonAdapter();
			}
			@Override
			public Adapter caseAdverseEvent(AdverseEvent object) {
				return createAdverseEventAdapter();
			}
			@Override
			public Adapter caseInclusionorExclusionCriteriaNotMet(InclusionorExclusionCriteriaNotMet object) {
				return createInclusionorExclusionCriteriaNotMetAdapter();
			}
			@Override
			public Adapter caseConcomitantMedication(ConcomitantMedication object) {
				return createConcomitantMedicationAdapter();
			}
			@Override
			public Adapter caseConsumableMaterial(ConsumableMaterial object) {
				return createConsumableMaterialAdapter();
			}
			@Override
			public Adapter caseHumanClinicalExposure(HumanClinicalExposure object) {
				return createHumanClinicalExposureAdapter();
			}
			@Override
			public Adapter caseSubstanceUse(SubstanceUse object) {
				return createSubstanceUseAdapter();
			}
			@Override
			public Adapter caseNonhumanLaboratoryTestResult(NonhumanLaboratoryTestResult object) {
				return createNonhumanLaboratoryTestResultAdapter();
			}
			@Override
			public Adapter caseStudyTestOrganization(StudyTestOrganization object) {
				return createStudyTestOrganizationAdapter();
			}
			@Override
			public Adapter caseStudyFindingEvaluator(StudyFindingEvaluator object) {
				return createStudyFindingEvaluatorAdapter();
			}
			@Override
			public Adapter caseSubjectDataNonClinicalTrials(SubjectDataNonClinicalTrials object) {
				return createSubjectDataNonClinicalTrialsAdapter();
			}
			@Override
			public Adapter caseNonhumanSubjectDataDocumentSection(NonhumanSubjectDataDocumentSection object) {
				return createNonhumanSubjectDataDocumentSectionAdapter();
			}
			@Override
			public Adapter caseNonhumanSubjectDemographics(NonhumanSubjectDemographics object) {
				return createNonhumanSubjectDemographicsAdapter();
			}
			@Override
			public Adapter caseNonhumanDisposition(NonhumanDisposition object) {
				return createNonhumanDispositionAdapter();
			}
			@Override
			public Adapter caseNonhumanExposure(NonhumanExposure object) {
				return createNonhumanExposureAdapter();
			}
			@Override
			public Adapter caseBodyWeight(BodyWeight object) {
				return createBodyWeightAdapter();
			}
			@Override
			public Adapter caseBodyWeightGain(BodyWeightGain object) {
				return createBodyWeightGainAdapter();
			}
			@Override
			public Adapter caseClinicalObservation(ClinicalObservation object) {
				return createClinicalObservationAdapter();
			}
			@Override
			public Adapter caseDeathDiagnosis(DeathDiagnosis object) {
				return createDeathDiagnosisAdapter();
			}
			@Override
			public Adapter caseFoodandWaterConsumption(FoodandWaterConsumption object) {
				return createFoodandWaterConsumptionAdapter();
			}
			@Override
			public Adapter caseMacroscopicFinding(MacroscopicFinding object) {
				return createMacroscopicFindingAdapter();
			}
			@Override
			public Adapter caseMicroscopicFinding(MicroscopicFinding object) {
				return createMicroscopicFindingAdapter();
			}
			@Override
			public Adapter caseOrganMeasurement(OrganMeasurement object) {
				return createOrganMeasurementAdapter();
			}
			@Override
			public Adapter casePalpableMass(PalpableMass object) {
				return createPalpableMassAdapter();
			}
			@Override
			public Adapter caseTumorFinding(TumorFinding object) {
				return createTumorFindingAdapter();
			}
			@Override
			public Adapter caseSubjectPool(SubjectPool object) {
				return createSubjectPoolAdapter();
			}
			@Override
			public Adapter caseMassIdentification(MassIdentification object) {
				return createMassIdentificationAdapter();
			}
			@Override
			public Adapter caseReferenceRange(ReferenceRange object) {
				return createReferenceRangeAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(org.eclipse.mdht.uml.hl7.rim.Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(org.eclipse.mdht.uml.cda.ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseSection(org.eclipse.mdht.uml.cda.Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(org.eclipse.mdht.uml.cda.ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter caseObservation(org.eclipse.mdht.uml.cda.Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseEncounter(org.eclipse.mdht.uml.cda.Encounter object) {
				return createEncounterAdapter();
			}
			@Override
			public Adapter caseProcedure(org.eclipse.mdht.uml.cda.Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(org.eclipse.mdht.uml.cda.SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseParticipation(org.eclipse.mdht.uml.hl7.rim.Participation object) {
				return createParticipationAdapter();
			}
			@Override
			public Adapter caseConsumable(org.eclipse.mdht.uml.cda.Consumable object) {
				return createConsumableAdapter();
			}
			@Override
			public Adapter caseParticipant2(org.eclipse.mdht.uml.cda.Participant2 object) {
				return createParticipant2Adapter();
			}
			@Override
			public Adapter caseObservationRange(org.eclipse.mdht.uml.cda.ObservationRange object) {
				return createObservationRangeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials <em>Subject Data Human Clinical Trials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials
	 * @generated
	 */
	public Adapter createSubjectDataHumanClinicalTrialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection <em>Human Clinical Subject Data Document Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection
	 * @generated
	 */
	public Adapter createHumanClinicalSubjectDataDocumentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics <em>Human Clinical Subject Demographics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics
	 * @generated
	 */
	public Adapter createHumanClinicalSubjectDemographicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.DataCollection
	 * @generated
	 */
	public Adapter createDataCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay <em>Event Study Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay
	 * @generated
	 */
	public Adapter createEventStudyDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm <em>Study Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyArm
	 * @generated
	 */
	public Adapter createStudyArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment <em>Domain Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment
	 * @generated
	 */
	public Adapter createDomainAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord <em>Related Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord
	 * @generated
	 */
	public Adapter createRelatedRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue <em>Supplemental Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue
	 * @generated
	 */
	public Adapter createSupplementalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod <em>Reference Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod
	 * @generated
	 */
	public Adapter createReferencePeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout <em>Finding About</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout
	 * @generated
	 */
	public Adapter createFindingAboutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier <em>Group Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier
	 * @generated
	 */
	public Adapter createGroupIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason <em>Non Performance Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason
	 * @generated
	 */
	public Adapter createNonPerformanceReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SubCategory
	 * @generated
	 */
	public Adapter createSubCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.Visit
	 * @generated
	 */
	public Adapter createVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.VitalSign
	 * @generated
	 */
	public Adapter createVitalSignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference <em>Timing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.TimingReference
	 * @generated
	 */
	public Adapter createTimingReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay <em>Planned Study Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay
	 * @generated
	 */
	public Adapter createPlannedStudyDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod <em>Study Day Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod
	 * @generated
	 */
	public Adapter createStudyDayPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason <em>Exclusion Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason
	 * @generated
	 */
	public Adapter createExclusionReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject <em>Positionof Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject
	 * @generated
	 */
	public Adapter createPositionofSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult <em>ECG Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult
	 * @generated
	 */
	public Adapter createECGTestResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding <em>Physical Examination Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding
	 * @generated
	 */
	public Adapter createPhysicalExaminationFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass <em>Body Systemor Organ Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass
	 * @generated
	 */
	public Adapter createBodySystemorOrganClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding <em>Microbiology Specimen Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding
	 * @generated
	 */
	public Adapter createMicrobiologySpecimenFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation <em>Specimen Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation
	 * @generated
	 */
	public Adapter createSpecimenInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory <em>Result Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory
	 * @generated
	 */
	public Adapter createResultCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility <em>Microbiology Susceptibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility
	 * @generated
	 */
	public Adapter createMicrobiologySusceptibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding <em>Pharmacokinetic Concentration Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding
	 * @generated
	 */
	public Adapter createPharmacokineticConcentrationFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus <em>Fasting Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus
	 * @generated
	 */
	public Adapter createFastingStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation <em>Assay Quantitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation
	 * @generated
	 */
	public Adapter createAssayQuantitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability <em>Drug Accountability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability
	 * @generated
	 */
	public Adapter createDrugAccountabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult <em>Human Clinical Laboratory Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult
	 * @generated
	 */
	public Adapter createHumanClinicalLaboratoryTestResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Toxicity <em>Toxicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.Toxicity
	 * @generated
	 */
	public Adapter createToxicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding <em>Questionnaire Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding
	 * @generated
	 */
	public Adapter createQuestionnaireFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding <em>Pharmacokinetic Parameter Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding
	 * @generated
	 */
	public Adapter createPharmacokineticParameterFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement <em>Subject Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement
	 * @generated
	 */
	public Adapter createSubjectElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch <em>Study Epoch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch
	 * @generated
	 */
	public Adapter createStudyEpochAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition <em>Human Clinical Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition
	 * @generated
	 */
	public Adapter createHumanClinicalDispositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem <em>Medical History Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem
	 * @generated
	 */
	public Adapter createMedicalHistoryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent <em>Pre Specified Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent
	 * @generated
	 */
	public Adapter createPreSpecifiedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod <em>Start Relativeto Reference Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod
	 * @generated
	 */
	public Adapter createStartRelativetoReferencePeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod <em>Stop Relativeto Reference Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod
	 * @generated
	 */
	public Adapter createStopRelativetoReferencePeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation <em>Protocol Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation
	 * @generated
	 */
	public Adapter createProtocolDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent <em>Clinical Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent
	 * @generated
	 */
	public Adapter createClinicalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity <em>Eventor Finding Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity
	 * @generated
	 */
	public Adapter createEventorFindingSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic <em>Subject Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic
	 * @generated
	 */
	public Adapter createSubjectCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent <em>Study Subject Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent
	 * @generated
	 */
	public Adapter createStudySubjectEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent <em>Serious Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent
	 * @generated
	 */
	public Adapter createSeriousEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken <em>Study Treatment Action Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken
	 * @generated
	 */
	public Adapter createStudyTreatmentActionTakenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken <em>Other Treatment Action Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken
	 * @generated
	 */
	public Adapter createOtherTreatmentActionTakenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality <em>Study Treatment Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality
	 * @generated
	 */
	public Adapter createStudyTreatmentCausalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship <em>Non Study Treatment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship
	 * @generated
	 */
	public Adapter createNonStudyTreatmentRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.EventPattern
	 * @generated
	 */
	public Adapter createEventPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome <em>Event Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome
	 * @generated
	 */
	public Adapter createEventOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment <em>Concomitant Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment
	 * @generated
	 */
	public Adapter createConcomitantTreatmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventDuration <em>Event Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.EventDuration
	 * @generated
	 */
	public Adapter createEventDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding <em>Study Subject Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding
	 * @generated
	 */
	public Adapter createStudySubjectFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship <em>Death Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship
	 * @generated
	 */
	public Adapter createDeathRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention <em>Study Subject Intervention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention
	 * @generated
	 */
	public Adapter createStudySubjectInterventionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Indication <em>Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.Indication
	 * @generated
	 */
	public Adapter createIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen <em>Intended Regimen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen
	 * @generated
	 */
	public Adapter createIntendedRegimenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason <em>Dose Adjustment Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason
	 * @generated
	 */
	public Adapter createDoseAdjustmentReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent <em>Adverse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent
	 * @generated
	 */
	public Adapter createAdverseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet <em>Inclusionor Exclusion Criteria Not Met</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet
	 * @generated
	 */
	public Adapter createInclusionorExclusionCriteriaNotMetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication <em>Concomitant Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication
	 * @generated
	 */
	public Adapter createConcomitantMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial <em>Consumable Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial
	 * @generated
	 */
	public Adapter createConsumableMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure <em>Human Clinical Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure
	 * @generated
	 */
	public Adapter createHumanClinicalExposureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse <em>Substance Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse
	 * @generated
	 */
	public Adapter createSubstanceUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult <em>Nonhuman Laboratory Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult
	 * @generated
	 */
	public Adapter createNonhumanLaboratoryTestResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization <em>Study Test Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization
	 * @generated
	 */
	public Adapter createStudyTestOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator <em>Study Finding Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator
	 * @generated
	 */
	public Adapter createStudyFindingEvaluatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials <em>Subject Data Non Clinical Trials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials
	 * @generated
	 */
	public Adapter createSubjectDataNonClinicalTrialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection <em>Nonhuman Subject Data Document Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection
	 * @generated
	 */
	public Adapter createNonhumanSubjectDataDocumentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics <em>Nonhuman Subject Demographics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics
	 * @generated
	 */
	public Adapter createNonhumanSubjectDemographicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition <em>Nonhuman Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition
	 * @generated
	 */
	public Adapter createNonhumanDispositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure <em>Nonhuman Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure
	 * @generated
	 */
	public Adapter createNonhumanExposureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight <em>Body Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight
	 * @generated
	 */
	public Adapter createBodyWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain <em>Body Weight Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain
	 * @generated
	 */
	public Adapter createBodyWeightGainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation <em>Clinical Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation
	 * @generated
	 */
	public Adapter createClinicalObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis <em>Death Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis
	 * @generated
	 */
	public Adapter createDeathDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption <em>Foodand Water Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption
	 * @generated
	 */
	public Adapter createFoodandWaterConsumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding <em>Macroscopic Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding
	 * @generated
	 */
	public Adapter createMacroscopicFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding <em>Microscopic Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding
	 * @generated
	 */
	public Adapter createMicroscopicFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement <em>Organ Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement
	 * @generated
	 */
	public Adapter createOrganMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass <em>Palpable Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass
	 * @generated
	 */
	public Adapter createPalpableMassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding <em>Tumor Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding
	 * @generated
	 */
	public Adapter createTumorFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool <em>Subject Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool
	 * @generated
	 */
	public Adapter createSubjectPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification <em>Mass Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification
	 * @generated
	 */
	public Adapter createMassIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ReferenceRange <em>Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.sdtm.ReferenceRange
	 * @generated
	 */
	public Adapter createReferenceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Encounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Participation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Participation
	 * @generated
	 */
	public Adapter createParticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Consumable <em>Consumable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Consumable
	 * @generated
	 */
	public Adapter createConsumableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Participant2 <em>Participant2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Participant2
	 * @generated
	 */
	public Adapter createParticipant2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ObservationRange <em>Observation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ObservationRange
	 * @generated
	 */
	public Adapter createObservationRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SdtmAdapterFactory
