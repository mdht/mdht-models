/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolPackageImpl extends EPackageImpl implements ConsolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "consol.ecore";

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
	private EClass allergyProblemActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonMedicinalSupplyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSupplyOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugVehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSeriesNumberObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationFullfillmentInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemConcernActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuityOfCareDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payersSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEntriesOptionalEClass = null;

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
	private EClass planOfCareActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityEncounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySupplyEClass = null;

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
	private EClass proceduresSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityActEClass = null;

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
	private EClass procedureAcivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryDeathObservationEClass = null;

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
	private EClass socialHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pregnancyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estimatedDateOfDeliveryEClass = null;

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
	private EClass resultsSectionEntriesOptionalEClass = null;

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
	private EClass medicalEquipmentSectionEClass = null;

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
	private EClass problemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistoryStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveVerificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveReferenceEClass = null;

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
	private EClass encountersActivitesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRefusalReasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insuranceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payerEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coveredPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policySubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pregnancyHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticResultsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPastIllnessSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForReferralSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPresentIllnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionMedicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeMedicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsAdministeredSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalExamSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibleImplantedMedicalDevicesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integumentarySystemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eyesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earsNoseMouthThroatSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noseSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mouthThroatTeethSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neckSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endocrineSystemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoraxLungsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chestWallSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respiratorySystemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abdomenSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lymphaticSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vesselsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass musculoskeletalSystemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neurologicSystemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genitaliaSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectumSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extremitiesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewOfSystemsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalCourseSectionEClass = null;

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
	private EClass conditionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageSpokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationNormalDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSplitDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationTaperedDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationConditionalDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationCombinationMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportGuardianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanOriginalAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanningDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanDataEntererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredOrScannedDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeDietSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionForSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationMedicationInformationEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConsolPackageImpl() {
		super(eNS_URI, ConsolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConsolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ConsolPackage init() {
		if (isInited) {
			return (ConsolPackage) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
		}

		// Obtain or create and register package
		ConsolPackageImpl theConsolPackage = (ConsolPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConsolPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ConsolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Load packages
		theConsolPackage.loadPackage();

		// Fix loaded packages
		theConsolPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theConsolPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return ConsolValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theConsolPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConsolPackage.eNS_URI, theConsolPackage);
		return theConsolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints() {
		if (generalHeaderConstraintsEClass == null) {
			generalHeaderConstraintsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				0);
		}
		return generalHeaderConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyProblemAct() {
		if (allergyProblemActEClass == null) {
			allergyProblemActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				1);
		}
		return allergyProblemActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyObservation() {
		if (allergyObservationEClass == null) {
			allergyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				2);
		}
		return allergyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionObservation() {
		if (reactionObservationEClass == null) {
			reactionObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				3);
		}
		return reactionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverityObservation() {
		if (severityObservationEClass == null) {
			severityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				4);
		}
		return severityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyStatusObservation() {
		if (allergyStatusObservationEClass == null) {
			allergyStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				18);
		}
		return allergyStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeObservation() {
		if (episodeObservationEClass == null) {
			episodeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				19);
		}
		return episodeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeObservation() {
		if (ageObservationEClass == null) {
			ageObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				7);
		}
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthStatusObservation() {
		if (healthStatusObservationEClass == null) {
			healthStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				8);
		}
		return healthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				20);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationActivity() {
		if (medicationActivityEClass == null) {
			medicationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				10);
		}
		return medicationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonMedicinalSupplyActivity() {
		if (nonMedicinalSupplyActivityEClass == null) {
			nonMedicinalSupplyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				11);
		}
		return nonMedicinalSupplyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		if (productInstanceEClass == null) {
			productInstanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				12);
		}
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructions() {
		if (instructionsEClass == null) {
			instructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				13);
		}
		return instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndication() {
		if (indicationEClass == null) {
			indicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				14);
		}
		return indicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispense() {
		if (medicationDispenseEClass == null) {
			medicationDispenseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				15);
		}
		return medicationDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSupplyOrder() {
		if (medicationSupplyOrderEClass == null) {
			medicationSupplyOrderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				16);
		}
		return medicationSupplyOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrugVehicle() {
		if (drugVehicleEClass == null) {
			drugVehicleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				17);
		}
		return drugVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSeriesNumberObservation() {
		if (medicationSeriesNumberObservationEClass == null) {
			medicationSeriesNumberObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(21);
		}
		return medicationSeriesNumberObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatusObservation() {
		if (medicationStatusObservationEClass == null) {
			medicationStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				22);
		}
		return medicationStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalReference() {
		if (internalReferenceEClass == null) {
			internalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				23);
		}
		return internalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationType() {
		if (medicationTypeEClass == null) {
			medicationTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				24);
		}
		return medicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationFullfillmentInstructions() {
		if (medicationFullfillmentInstructionsEClass == null) {
			medicationFullfillmentInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(25);
		}
		return medicationFullfillmentInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemConcernAct() {
		if (problemConcernActEClass == null) {
			problemConcernActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				26);
		}
		return problemConcernActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemObservation() {
		if (problemObservationEClass == null) {
			problemObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				6);
		}
		return problemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemStatus() {
		if (problemStatusEClass == null) {
			problemStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				9);
		}
		return problemStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuityOfCareDocument() {
		if (continuityOfCareDocumentEClass == null) {
			continuityOfCareDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				27);
		}
		return continuityOfCareDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSectionEntriesOptional() {
		if (advanceDirectivesSectionEntriesOptionalEClass == null) {
			advanceDirectivesSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(28);
		}
		return advanceDirectivesSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesSection() {
		if (allergiesSectionEClass == null) {
			allergiesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				29);
		}
		return allergiesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesSectionEntriesOptional() {
		if (allergiesSectionEntriesOptionalEClass == null) {
			allergiesSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(30);
		}
		return allergiesSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSectionEntriesOptional() {
		if (encountersSectionEntriesOptionalEClass == null) {
			encountersSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(31);
		}
		return encountersSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSectionEntriesOptional() {
		if (immunizationsSectionEntriesOptionalEClass == null) {
			immunizationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(32);
		}
		return immunizationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayersSection() {
		if (payersSectionEClass == null) {
			payersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				33);
		}
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageActivity() {
		if (coverageActivityEClass == null) {
			coverageActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				34);
		}
		return coverageActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyActivity() {
		if (policyActivityEClass == null) {
			policyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				35);
		}
		return policyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationActivity() {
		if (authorizationActivityEClass == null) {
			authorizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				36);
		}
		return authorizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSection() {
		if (medicationsSectionEClass == null) {
			medicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				37);
		}
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSectionEntriesOptional() {
		if (medicationsSectionEntriesOptionalEClass == null) {
			medicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(38);
		}
		return medicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareSection() {
		if (planOfCareSectionEClass == null) {
			planOfCareSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				39);
		}
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityAct() {
		if (planOfCareActivityActEClass == null) {
			planOfCareActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				40);
		}
		return planOfCareActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityEncounter() {
		if (planOfCareActivityEncounterEClass == null) {
			planOfCareActivityEncounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				41);
		}
		return planOfCareActivityEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityObservation() {
		if (planOfCareActivityObservationEClass == null) {
			planOfCareActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				42);
		}
		return planOfCareActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityProcedure() {
		if (planOfCareActivityProcedureEClass == null) {
			planOfCareActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				43);
		}
		return planOfCareActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySubstanceAdministration() {
		if (planOfCareActivitySubstanceAdministrationEClass == null) {
			planOfCareActivitySubstanceAdministrationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(44);
		}
		return planOfCareActivitySubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySupply() {
		if (planOfCareActivitySupplyEClass == null) {
			planOfCareActivitySupplyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				45);
		}
		return planOfCareActivitySupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresSection() {
		if (proceduresSectionEClass == null) {
			proceduresSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				46);
		}
		return proceduresSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresSectionEntriesOptional() {
		if (proceduresSectionEntriesOptionalEClass == null) {
			proceduresSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(47);
		}
		return proceduresSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityAct() {
		if (procedureActivityActEClass == null) {
			procedureActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				48);
		}
		return procedureActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityProcedure() {
		if (procedureActivityProcedureEClass == null) {
			procedureActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				5);
		}
		return procedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureAcivityObservation() {
		if (procedureAcivityObservationEClass == null) {
			procedureAcivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				49);
		}
		return procedureAcivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSectionEntriesOptional() {
		if (vitalSignsSectionEntriesOptionalEClass == null) {
			vitalSignsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(50);
		}
		return vitalSignsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySection() {
		if (familyHistorySectionEClass == null) {
			familyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				51);
		}
		return familyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryOrganizer() {
		if (familyHistoryOrganizerEClass == null) {
			familyHistoryOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				52);
		}
		return familyHistoryOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryObservation() {
		if (familyHistoryObservationEClass == null) {
			familyHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				53);
		}
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryDeathObservation() {
		if (familyHistoryDeathObservationEClass == null) {
			familyHistoryDeathObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				54);
		}
		return familyHistoryDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				55);
		}
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryObservation() {
		if (socialHistoryObservationEClass == null) {
			socialHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				56);
		}
		return socialHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyObservation() {
		if (pregnancyObservationEClass == null) {
			pregnancyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				57);
		}
		return pregnancyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstimatedDateOfDelivery() {
		if (estimatedDateOfDeliveryEClass == null) {
			estimatedDateOfDeliveryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				58);
		}
		return estimatedDateOfDeliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSection() {
		if (resultsSectionEClass == null) {
			resultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				59);
		}
		return resultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSectionEntriesOptional() {
		if (resultsSectionEntriesOptionalEClass == null) {
			resultsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				60);
		}
		return resultsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultOrganizer() {
		if (resultOrganizerEClass == null) {
			resultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				61);
		}
		return resultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultObservation() {
		if (resultObservationEClass == null) {
			resultObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				62);
		}
		return resultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalEquipmentSection() {
		if (medicalEquipmentSectionEClass == null) {
			medicalEquipmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				63);
		}
		return medicalEquipmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusSection() {
		if (functionalStatusSectionEClass == null) {
			functionalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				64);
		}
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSection() {
		if (problemSectionEClass == null) {
			problemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				65);
		}
		return problemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSectionEntriesOptional() {
		if (problemSectionEntriesOptionalEClass == null) {
			problemSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				66);
		}
		return problemSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryStatusObservation() {
		if (socialHistoryStatusObservationEClass == null) {
			socialHistoryStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(67);
		}
		return socialHistoryStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeSection() {
		if (purposeSectionEClass == null) {
			purposeSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				68);
		}
		return purposeSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeActivity() {
		if (purposeActivityEClass == null) {
			purposeActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				69);
		}
		return purposeActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				70);
		}
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveObservation() {
		if (advanceDirectiveObservationEClass == null) {
			advanceDirectiveObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				71);
		}
		return advanceDirectiveObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveVerification() {
		if (advanceDirectiveVerificationEClass == null) {
			advanceDirectiveVerificationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				72);
		}
		return advanceDirectiveVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveStatusObservation() {
		if (advanceDirectiveStatusObservationEClass == null) {
			advanceDirectiveStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(73);
		}
		return advanceDirectiveStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveReference() {
		if (advanceDirectiveReferenceEClass == null) {
			advanceDirectiveReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				74);
		}
		return advanceDirectiveReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSection() {
		if (encountersSectionEClass == null) {
			encountersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				75);
		}
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersActivites() {
		if (encountersActivitesEClass == null) {
			encountersActivitesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				76);
		}
		return encountersActivitesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDeliveryLocation() {
		if (serviceDeliveryLocationEClass == null) {
			serviceDeliveryLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				77);
		}
		return serviceDeliveryLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounter() {
		if (encounterEClass == null) {
			encounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				78);
		}
		return encounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSection() {
		if (immunizationsSectionEClass == null) {
			immunizationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				79);
		}
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationActivity() {
		if (immunizationActivityEClass == null) {
			immunizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				80);
		}
		return immunizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRefusalReason() {
		if (immunizationRefusalReasonEClass == null) {
			immunizationRefusalReasonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				81);
		}
		return immunizationRefusalReasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsuranceProvider() {
		if (insuranceProviderEClass == null) {
			insuranceProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				82);
		}
		return insuranceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntry() {
		if (payerEntryEClass == null) {
			payerEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				83);
		}
		return payerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoveredParty() {
		if (coveredPartyEClass == null) {
			coveredPartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				84);
		}
		return coveredPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicySubscriber() {
		if (policySubscriberEClass == null) {
			policySubscriberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				85);
		}
		return policySubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				86);
		}
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyHistorySection() {
		if (pregnancyHistorySectionEClass == null) {
			pregnancyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				87);
		}
		return pregnancyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReference() {
		if (externalReferenceEClass == null) {
			externalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				88);
		}
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupport() {
		if (supportEClass == null) {
			supportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				89);
		}
		return supportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSection() {
		if (vitalSignsSectionEClass == null) {
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				90);
		}
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizer() {
		if (vitalSignsOrganizerEClass == null) {
			vitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				91);
		}
		return vitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignObservation() {
		if (vitalSignObservationEClass == null) {
			vitalSignObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				92);
		}
		return vitalSignObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticResultsSection() {
		if (diagnosticResultsSectionEClass == null) {
			diagnosticResultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				93);
		}
		return diagnosticResultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPastIllnessSection() {
		if (historyOfPastIllnessSectionEClass == null) {
			historyOfPastIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				94);
		}
		return historyOfPastIllnessSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChiefComplaintSection() {
		if (chiefComplaintSectionEClass == null) {
			chiefComplaintSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				95);
		}
		return chiefComplaintSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForReferralSection() {
		if (reasonForReferralSectionEClass == null) {
			reasonForReferralSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				96);
		}
		return reasonForReferralSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPresentIllness() {
		if (historyOfPresentIllnessEClass == null) {
			historyOfPresentIllnessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				97);
		}
		return historyOfPresentIllnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionDiagnosisSection() {
		if (hospitalAdmissionDiagnosisSectionEClass == null) {
			hospitalAdmissionDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(98);
		}
		return hospitalAdmissionDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeDiagnosisSection() {
		if (hospitalDischargeDiagnosisSectionEClass == null) {
			hospitalDischargeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(99);
		}
		return hospitalDischargeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionMedicationsSectionEntriesOptional() {
		if (hospitalAdmissionMedicationsSectionEntriesOptionalEClass == null) {
			hospitalAdmissionMedicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(100);
		}
		return hospitalAdmissionMedicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeMedicationsSection() {
		if (hospitalDischargeMedicationsSectionEClass == null) {
			hospitalDischargeMedicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(101);
		}
		return hospitalDischargeMedicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsAdministeredSection() {
		if (medicationsAdministeredSectionEClass == null) {
			medicationsAdministeredSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(102);
		}
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalExamSection() {
		if (physicalExamSectionEClass == null) {
			physicalExamSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				103);
		}
		return physicalExamSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralStatusSection() {
		if (generalStatusSectionEClass == null) {
			generalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				104);
		}
		return generalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibleImplantedMedicalDevicesSection() {
		if (visibleImplantedMedicalDevicesSectionEClass == null) {
			visibleImplantedMedicalDevicesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(105);
		}
		return visibleImplantedMedicalDevicesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegumentarySystemSection() {
		if (integumentarySystemSectionEClass == null) {
			integumentarySystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				106);
		}
		return integumentarySystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadSection() {
		if (headSectionEClass == null) {
			headSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				107);
		}
		return headSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEyesSection() {
		if (eyesSectionEClass == null) {
			eyesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				108);
		}
		return eyesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarsNoseMouthThroatSection() {
		if (earsNoseMouthThroatSectionEClass == null) {
			earsNoseMouthThroatSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				109);
		}
		return earsNoseMouthThroatSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarsSection() {
		if (earsSectionEClass == null) {
			earsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				110);
		}
		return earsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoseSection() {
		if (noseSectionEClass == null) {
			noseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				111);
		}
		return noseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMouthThroatTeethSection() {
		if (mouthThroatTeethSectionEClass == null) {
			mouthThroatTeethSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				112);
		}
		return mouthThroatTeethSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeckSection() {
		if (neckSectionEClass == null) {
			neckSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				113);
		}
		return neckSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndocrineSystemSection() {
		if (endocrineSystemSectionEClass == null) {
			endocrineSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				114);
		}
		return endocrineSystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoraxLungsSection() {
		if (thoraxLungsSectionEClass == null) {
			thoraxLungsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				115);
		}
		return thoraxLungsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChestWallSection() {
		if (chestWallSectionEClass == null) {
			chestWallSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				116);
		}
		return chestWallSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastSection() {
		if (breastSectionEClass == null) {
			breastSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				117);
		}
		return breastSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartSection() {
		if (heartSectionEClass == null) {
			heartSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				118);
		}
		return heartSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespiratorySystemSection() {
		if (respiratorySystemSectionEClass == null) {
			respiratorySystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				119);
		}
		return respiratorySystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbdomenSection() {
		if (abdomenSectionEClass == null) {
			abdomenSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				120);
		}
		return abdomenSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLymphaticSection() {
		if (lymphaticSectionEClass == null) {
			lymphaticSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				121);
		}
		return lymphaticSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVesselsSection() {
		if (vesselsSectionEClass == null) {
			vesselsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				122);
		}
		return vesselsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMusculoskeletalSystemSection() {
		if (musculoskeletalSystemSectionEClass == null) {
			musculoskeletalSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				123);
		}
		return musculoskeletalSystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeurologicSystemSection() {
		if (neurologicSystemSectionEClass == null) {
			neurologicSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				124);
		}
		return neurologicSystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenitaliaSection() {
		if (genitaliaSectionEClass == null) {
			genitaliaSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				125);
		}
		return genitaliaSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectumSection() {
		if (rectumSectionEClass == null) {
			rectumSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				126);
		}
		return rectumSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtremitiesSection() {
		if (extremitiesSectionEClass == null) {
			extremitiesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				127);
		}
		return extremitiesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewOfSystemsSection() {
		if (reviewOfSystemsSectionEClass == null) {
			reviewOfSystemsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				128);
		}
		return reviewOfSystemsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalCourseSection() {
		if (hospitalCourseSectionEClass == null) {
			hospitalCourseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				129);
		}
		return hospitalCourseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentAndPlanSection() {
		if (assessmentAndPlanSectionEClass == null) {
			assessmentAndPlanSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				130);
		}
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEntry() {
		if (conditionEntryEClass == null) {
			conditionEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				131);
		}
		return conditionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageSpoken() {
		if (languageSpokenEClass == null) {
			languageSpokenEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				132);
		}
		return languageSpokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareProvider() {
		if (healthcareProviderEClass == null) {
			healthcareProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				133);
		}
		return healthcareProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationNormalDose() {
		if (medicationNormalDoseEClass == null) {
			medicationNormalDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				134);
		}
		return medicationNormalDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSplitDose() {
		if (medicationSplitDoseEClass == null) {
			medicationSplitDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				135);
		}
		return medicationSplitDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationTaperedDose() {
		if (medicationTaperedDoseEClass == null) {
			medicationTaperedDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				136);
		}
		return medicationTaperedDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationConditionalDose() {
		if (medicationConditionalDoseEClass == null) {
			medicationConditionalDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				137);
		}
		return medicationConditionalDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationCombinationMedication() {
		if (medicationCombinationMedicationEClass == null) {
			medicationCombinationMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(138);
		}
		return medicationCombinationMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportGuardian() {
		if (supportGuardianEClass == null) {
			supportGuardianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				139);
		}
		return supportGuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportParticipant() {
		if (supportParticipantEClass == null) {
			supportParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				140);
		}
		return supportParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument() {
		if (unstructuredDocumentEClass == null) {
			unstructuredDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				141);
		}
		return unstructuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanOriginalAuthor() {
		if (scanOriginalAuthorEClass == null) {
			scanOriginalAuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				142);
		}
		return scanOriginalAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanningDevice() {
		if (scanningDeviceEClass == null) {
			scanningDeviceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				143);
		}
		return scanningDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanDataEnterer() {
		if (scanDataEntererEClass == null) {
			scanDataEntererEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				144);
		}
		return scanDataEntererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationInformation() {
		if (medicationInformationEClass == null) {
			medicationInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				145);
		}
		return medicationInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredOrScannedDocument() {
		if (unstructuredOrScannedDocumentEClass == null) {
			unstructuredOrScannedDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				146);
		}
		return unstructuredOrScannedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferralSummary() {
		if (referralSummaryEClass == null) {
			referralSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				147);
		}
		return referralSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeSummary() {
		if (dischargeSummaryEClass == null) {
			dischargeSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				148);
		}
		return dischargeSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDietSection() {
		if (dischargeDietSectionEClass == null) {
			dischargeDietSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				149);
		}
		return dischargeDietSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreconditionForSubstanceAdministration() {
		if (preconditionForSubstanceAdministrationEClass == null) {
			preconditionForSubstanceAdministrationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(150);
		}
		return preconditionForSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationMedicationInformation() {
		if (immunizationMedicationInformationEClass == null) {
			immunizationMedicationInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(151);
		}
		return immunizationMedicationInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolFactory getConsolFactory() {
		return (ConsolFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) {
			return;
		}
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) {
			return;
		}
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.consol." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // ConsolPackageImpl
