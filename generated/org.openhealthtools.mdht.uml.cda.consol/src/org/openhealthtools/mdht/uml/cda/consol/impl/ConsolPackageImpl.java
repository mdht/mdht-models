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
	private EClass allergyDrugSensitivityEClass = null;

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
	private EClass allergyIntoleranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEntryReactionObservationContainerEClass = null;

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
	private EClass severityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemStatusObservationEClass = null;

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
	private EClass medicationEClass = null;

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
	private EClass medicationOrderInformationEClass = null;

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
	private EClass productInstanceEClass = null;

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
	private EClass medicationSeriesNumberObservationEClass = null;

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
	private EClass patientMedicalInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

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
	private EClass causeOfDeathObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientSummaryEClass = null;

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
	private EClass advanceDirectiveEClass = null;

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
	private EClass allergiesReactionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemListSectionEClass = null;

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
	private EClass encounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersActivityEClass = null;

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
	private EClass immunizationEClass = null;

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
	private EClass medicationsSectionEClass = null;

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
	private EClass procedureEClass = null;

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
	private EClass pregnancyHistorySectionEClass = null;

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
	private EClass surgeriesSectionEClass = null;

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
	private EClass procedureEntryProcedureActivityProcedureEClass = null;

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
	private EClass vitalSignEClass = null;

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
	private EClass resultEClass = null;

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
	private EClass familyHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryEClass = null;

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
	private EClass socialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistoryEClass = null;

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
	private EClass resultsSectionEClass = null;

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
	private EClass advanceDirectiveVerificationEClass = null;

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
	private EClass encounterLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payerEntityEClass = null;

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
	private EClass supportGuardianEClass = null;

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
	private EClass dischargeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionMedicationHistorySectionEClass = null;

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
	private EClass generalAppearanceSectionEClass = null;

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
	private EClass dischargeDietEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyAndPhysicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iheHistoryOfPresentIllnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewOfSystemsSectionIHEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccdVitalSignsSectionEClass = null;

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
	private EClass diagnosticFindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultationNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pastMedicalHistorySectionConsultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForVisitSectionConsultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelOneConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelTwoConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelThreeConformanceEClass = null;

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
	private EClass planSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForVisitSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForVisitAndChiefComplaintSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentAndPlanSectionProcNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentSectionProcNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintSectionProcNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectiveSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeStudiesSummarySectionEClass = null;

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
	public EClass getAllergyDrugSensitivity() {
		if (allergyDrugSensitivityEClass == null) {
			allergyDrugSensitivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				0);
		}
		return allergyDrugSensitivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeObservation() {
		if (episodeObservationEClass == null) {
			episodeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				1);
		}
		return episodeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntolerance() {
		if (allergyIntoleranceEClass == null) {
			allergyIntoleranceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				2);
		}
		return allergyIntoleranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemEntryReactionObservationContainer() {
		if (problemEntryReactionObservationContainerEClass == null) {
			problemEntryReactionObservationContainerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(3);
		}
		return problemEntryReactionObservationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeObservation() {
		if (ageObservationEClass == null) {
			ageObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				4);
		}
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverity() {
		if (severityEClass == null) {
			severityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				5);
		}
		return severityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemStatusObservation() {
		if (problemStatusObservationEClass == null) {
			problemStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				6);
		}
		return problemStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthStatusObservation() {
		if (healthStatusObservationEClass == null) {
			healthStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				7);
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
				8);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		if (medicationEClass == null) {
			medicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				9);
		}
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationType() {
		if (medicationTypeEClass == null) {
			medicationTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				10);
		}
		return medicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationOrderInformation() {
		if (medicationOrderInformationEClass == null) {
			medicationOrderInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				11);
		}
		return medicationOrderInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatusObservation() {
		if (medicationStatusObservationEClass == null) {
			medicationStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				12);
		}
		return medicationStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		if (productInstanceEClass == null) {
			productInstanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				13);
		}
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationFullfillmentInstructions() {
		if (medicationFullfillmentInstructionsEClass == null) {
			medicationFullfillmentInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(14);
		}
		return medicationFullfillmentInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSeriesNumberObservation() {
		if (medicationSeriesNumberObservationEClass == null) {
			medicationSeriesNumberObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(15);
		}
		return medicationSeriesNumberObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalReference() {
		if (internalReferenceEClass == null) {
			internalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				16);
		}
		return internalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientMedicalInstructions() {
		if (patientMedicalInstructionsEClass == null) {
			patientMedicalInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				17);
		}
		return patientMedicalInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				18);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEntry() {
		if (conditionEntryEClass == null) {
			conditionEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				19);
		}
		return conditionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCauseOfDeathObservation() {
		if (causeOfDeathObservationEClass == null) {
			causeOfDeathObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				20);
		}
		return causeOfDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientSummary() {
		if (patientSummaryEClass == null) {
			patientSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				21);
		}
		return patientSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				22);
		}
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirective() {
		if (advanceDirectiveEClass == null) {
			advanceDirectiveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				23);
		}
		return advanceDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveStatusObservation() {
		if (advanceDirectiveStatusObservationEClass == null) {
			advanceDirectiveStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(24);
		}
		return advanceDirectiveStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesReactionsSection() {
		if (allergiesReactionsSectionEClass == null) {
			allergiesReactionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				25);
		}
		return allergiesReactionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemListSection() {
		if (problemListSectionEClass == null) {
			problemListSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				26);
		}
		return problemListSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSection() {
		if (encountersSectionEClass == null) {
			encountersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				27);
		}
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounter() {
		if (encounterEClass == null) {
			encounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				28);
		}
		return encounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersActivity() {
		if (encountersActivityEClass == null) {
			encountersActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				29);
		}
		return encountersActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSection() {
		if (immunizationsSectionEClass == null) {
			immunizationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				30);
		}
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunization() {
		if (immunizationEClass == null) {
			immunizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				31);
		}
		return immunizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayersSection() {
		if (payersSectionEClass == null) {
			payersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				32);
		}
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsuranceProvider() {
		if (insuranceProviderEClass == null) {
			insuranceProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				33);
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
				34);
		}
		return payerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSection() {
		if (medicationsSectionEClass == null) {
			medicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				35);
		}
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareSection() {
		if (planOfCareSectionEClass == null) {
			planOfCareSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				36);
		}
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				37);
		}
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityAct() {
		if (planOfCareActivityActEClass == null) {
			planOfCareActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				38);
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
				39);
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
				40);
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
				41);
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
				ConsolPackage.eNS_URI).getEClassifiers().get(42);
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
				43);
		}
		return planOfCareActivitySupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyHistorySection() {
		if (pregnancyHistorySectionEClass == null) {
			pregnancyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				44);
		}
		return pregnancyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyObservation() {
		if (pregnancyObservationEClass == null) {
			pregnancyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				45);
		}
		return pregnancyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurgeriesSection() {
		if (surgeriesSectionEClass == null) {
			surgeriesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				46);
		}
		return surgeriesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReference() {
		if (externalReferenceEClass == null) {
			externalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				47);
		}
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEntryProcedureActivityProcedure() {
		if (procedureEntryProcedureActivityProcedureEClass == null) {
			procedureEntryProcedureActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(48);
		}
		return procedureEntryProcedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSection() {
		if (vitalSignsSectionEClass == null) {
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				49);
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
				50);
		}
		return vitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSign() {
		if (vitalSignEClass == null) {
			vitalSignEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				51);
		}
		return vitalSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticResultsSection() {
		if (diagnosticResultsSectionEClass == null) {
			diagnosticResultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				52);
		}
		return diagnosticResultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		if (resultEClass == null) {
			resultEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				53);
		}
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultOrganizer() {
		if (resultOrganizerEClass == null) {
			resultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				54);
		}
		return resultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySection() {
		if (familyHistorySectionEClass == null) {
			familyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				55);
		}
		return familyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistory() {
		if (familyHistoryEClass == null) {
			familyHistoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				56);
		}
		return familyHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryObservation() {
		if (familyHistoryObservationEClass == null) {
			familyHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				57);
		}
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				58);
		}
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistory() {
		if (socialHistoryEClass == null) {
			socialHistoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				59);
		}
		return socialHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryStatusObservation() {
		if (socialHistoryStatusObservationEClass == null) {
			socialHistoryStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(60);
		}
		return socialHistoryStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSection() {
		if (resultsSectionEClass == null) {
			resultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				61);
		}
		return resultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalEquipmentSection() {
		if (medicalEquipmentSectionEClass == null) {
			medicalEquipmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				62);
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
				63);
		}
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeSection() {
		if (purposeSectionEClass == null) {
			purposeSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				64);
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
				65);
		}
		return purposeActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveVerification() {
		if (advanceDirectiveVerificationEClass == null) {
			advanceDirectiveVerificationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				66);
		}
		return advanceDirectiveVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveReference() {
		if (advanceDirectiveReferenceEClass == null) {
			advanceDirectiveReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				67);
		}
		return advanceDirectiveReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocation() {
		if (encounterLocationEClass == null) {
			encounterLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				68);
		}
		return encounterLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntity() {
		if (payerEntityEClass == null) {
			payerEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				69);
		}
		return payerEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoveredParty() {
		if (coveredPartyEClass == null) {
			coveredPartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				70);
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
				71);
		}
		return policySubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportGuardian() {
		if (supportGuardianEClass == null) {
			supportGuardianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				72);
		}
		return supportGuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPastIllnessSection() {
		if (historyOfPastIllnessSectionEClass == null) {
			historyOfPastIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				73);
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
				74);
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
				75);
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
				76);
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
				ConsolPackage.eNS_URI).getEClassifiers().get(77);
		}
		return hospitalAdmissionDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDiagnosisSection() {
		if (dischargeDiagnosisSectionEClass == null) {
			dischargeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				78);
		}
		return dischargeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmissionMedicationHistorySection() {
		if (admissionMedicationHistorySectionEClass == null) {
			admissionMedicationHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(79);
		}
		return admissionMedicationHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeMedicationsSection() {
		if (hospitalDischargeMedicationsSectionEClass == null) {
			hospitalDischargeMedicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(80);
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
				ConsolPackage.eNS_URI).getEClassifiers().get(81);
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
				82);
		}
		return physicalExamSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralAppearanceSection() {
		if (generalAppearanceSectionEClass == null) {
			generalAppearanceSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				83);
		}
		return generalAppearanceSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibleImplantedMedicalDevicesSection() {
		if (visibleImplantedMedicalDevicesSectionEClass == null) {
			visibleImplantedMedicalDevicesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(84);
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
				85);
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
				86);
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
				87);
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
				88);
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
				89);
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
				90);
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
				91);
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
				92);
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
				93);
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
				94);
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
				95);
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
				96);
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
				97);
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
				98);
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
				99);
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
				100);
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
				101);
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
				102);
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
				103);
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
				104);
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
				105);
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
				106);
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
				107);
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
				108);
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
				109);
		}
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageSpoken() {
		if (languageSpokenEClass == null) {
			languageSpokenEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				110);
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
				111);
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
				112);
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
				113);
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
				114);
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
				115);
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
				ConsolPackage.eNS_URI).getEClassifiers().get(116);
		}
		return medicationCombinationMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportParticipant() {
		if (supportParticipantEClass == null) {
			supportParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				117);
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
				118);
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
				119);
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
				120);
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
				121);
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
				122);
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
				123);
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
				124);
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
				125);
		}
		return dischargeSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDiet() {
		if (dischargeDietEClass == null) {
			dischargeDietEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				126);
		}
		return dischargeDietEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryAndPhysical() {
		if (historyAndPhysicalEClass == null) {
			historyAndPhysicalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				127);
		}
		return historyAndPhysicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHEHistoryOfPresentIllness() {
		if (iheHistoryOfPresentIllnessEClass == null) {
			iheHistoryOfPresentIllnessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				128);
		}
		return iheHistoryOfPresentIllnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewOfSystemsSectionIHE() {
		if (reviewOfSystemsSectionIHEEClass == null) {
			reviewOfSystemsSectionIHEEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				129);
		}
		return reviewOfSystemsSectionIHEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCCDVitalSignsSection() {
		if (ccdVitalSignsSectionEClass == null) {
			ccdVitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				130);
		}
		return ccdVitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralStatusSection() {
		if (generalStatusSectionEClass == null) {
			generalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				131);
		}
		return generalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticFindings() {
		if (diagnosticFindingsEClass == null) {
			diagnosticFindingsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				132);
		}
		return diagnosticFindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsultationNote() {
		if (consultationNoteEClass == null) {
			consultationNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				133);
		}
		return consultationNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPastMedicalHistorySectionConsult() {
		if (pastMedicalHistorySectionConsultEClass == null) {
			pastMedicalHistorySectionConsultEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(134);
		}
		return pastMedicalHistorySectionConsultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForVisitSectionConsult() {
		if (reasonForVisitSectionConsultEClass == null) {
			reasonForVisitSectionConsultEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				135);
		}
		return reasonForVisitSectionConsultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelOneConformance() {
		if (levelOneConformanceEClass == null) {
			levelOneConformanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				136);
		}
		return levelOneConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelTwoConformance() {
		if (levelTwoConformanceEClass == null) {
			levelTwoConformanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				137);
		}
		return levelTwoConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelThreeConformance() {
		if (levelThreeConformanceEClass == null) {
			levelThreeConformanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				138);
		}
		return levelThreeConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentSection() {
		if (assessmentSectionEClass == null) {
			assessmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				139);
		}
		return assessmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanSection() {
		if (planSectionEClass == null) {
			planSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				140);
		}
		return planSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForVisitSection() {
		if (reasonForVisitSectionEClass == null) {
			reasonForVisitSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				141);
		}
		return reasonForVisitSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForVisitAndChiefComplaintSection() {
		if (reasonForVisitAndChiefComplaintSectionEClass == null) {
			reasonForVisitAndChiefComplaintSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(142);
		}
		return reasonForVisitAndChiefComplaintSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressNote() {
		if (progressNoteEClass == null) {
			progressNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				143);
		}
		return progressNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentAndPlanSectionProcNote() {
		if (assessmentAndPlanSectionProcNoteEClass == null) {
			assessmentAndPlanSectionProcNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(144);
		}
		return assessmentAndPlanSectionProcNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentSectionProcNote() {
		if (assessmentSectionProcNoteEClass == null) {
			assessmentSectionProcNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				145);
		}
		return assessmentSectionProcNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChiefComplaintSectionProcNote() {
		if (chiefComplaintSectionProcNoteEClass == null) {
			chiefComplaintSectionProcNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				146);
		}
		return chiefComplaintSectionProcNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveSection() {
		if (objectiveSectionEClass == null) {
			objectiveSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				147);
		}
		return objectiveSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectiveSection() {
		if (subjectiveSectionEClass == null) {
			subjectiveSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI).getEClassifiers().get(
				148);
		}
		return subjectiveSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeStudiesSummarySection() {
		if (hospitalDischargeStudiesSummarySectionEClass == null) {
			hospitalDischargeStudiesSummarySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(149);
		}
		return hospitalDischargeStudiesSummarySectionEClass;
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
