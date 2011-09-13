/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements IDomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "domain.ecore";

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
	private EClass medicationEClass = null;

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
	private EClass productInstanceEClass = null;

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
	private EClass medicationFullfillmentInstructionsEClass = null;

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
	private EClass problemEntryEClass = null;

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
	private EClass statusObservationEClass = null;

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
	private EClass allergiesReactionsSectionEClass = null;

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
	private EClass causeOfDeathObservationEClass = null;

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
	private EClass simpleObservationEClass = null;

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
	private EClass encountersActivityEClass = null;

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
	private EClass planOfCareActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityEClass = null;

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
	private EClass procedureEntryEClass = null;

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
	private EClass pregnancyObservationEClass = null;

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
	private EClass resultEClass = null;

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
	private EClass familyHistorySectionEClass = null;

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
	private EClass socialHistoryObservationEClass = null;

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
	private EClass medicalEquipmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentInstructionEClass = null;

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
	private EClass patientInstructionEClass = null;

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
	private EClass dischargeDietEClass = null;

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
	private EClass familyHistoryOrganizerEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, IDomainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IDomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IDomainPackage init() {
		if (isInited) {
			return (IDomainPackage) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI);
		}

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new DomainPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Load packages
		theDomainPackage.loadPackage();

		// Fix loaded packages
		theDomainPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IDomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyDrugSensitivity() {
		if (allergyDrugSensitivityEClass == null) {
			allergyDrugSensitivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				0);
		}
		return allergyDrugSensitivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyDrugSensitivity_CDAType() {
		return (EReference) getAllergyDrugSensitivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeObservation() {
		if (episodeObservationEClass == null) {
			episodeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				1);
		}
		return episodeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeObservation_CDAType() {
		return (EReference) getEpisodeObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntolerance() {
		if (allergyIntoleranceEClass == null) {
			allergyIntoleranceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				2);
		}
		return allergyIntoleranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		if (medicationEClass == null) {
			medicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				14);
		}
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_CDAType() {
		return (EReference) getMedication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSeriesNumberObservation() {
		if (medicationSeriesNumberObservationEClass == null) {
			medicationSeriesNumberObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(15);
		}
		return medicationSeriesNumberObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationSeriesNumberObservation_CDAType() {
		return (EReference) getMedicationSeriesNumberObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatusObservation() {
		if (medicationStatusObservationEClass == null) {
			medicationStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				16);
		}
		return medicationStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionObservation() {
		if (reactionObservationEClass == null) {
			reactionObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				17);
		}
		return reactionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactionObservation_CDAType() {
		return (EReference) getReactionObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverityObservation() {
		if (severityObservationEClass == null) {
			severityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				18);
		}
		return severityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeverityObservation_CDAType() {
		return (EReference) getSeverityObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		if (productInstanceEClass == null) {
			productInstanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				19);
		}
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInstance_CDAType() {
		return (EReference) getProductInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalReference() {
		if (internalReferenceEClass == null) {
			internalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				20);
		}
		return internalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalReference_CDAType() {
		return (EReference) getInternalReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientMedicalInstructions() {
		if (patientMedicalInstructionsEClass == null) {
			patientMedicalInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				21);
		}
		return patientMedicalInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientMedicalInstructions_CDAType() {
		return (EReference) getPatientMedicalInstructions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationType() {
		if (medicationTypeEClass == null) {
			medicationTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				22);
		}
		return medicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationType_CDAType() {
		return (EReference) getMedicationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationOrderInformation() {
		if (medicationOrderInformationEClass == null) {
			medicationOrderInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				23);
		}
		return medicationOrderInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderInformation_CDAType() {
		return (EReference) getMedicationOrderInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationFullfillmentInstructions() {
		if (medicationFullfillmentInstructionsEClass == null) {
			medicationFullfillmentInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(24);
		}
		return medicationFullfillmentInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationFullfillmentInstructions_CDAType() {
		return (EReference) getMedicationFullfillmentInstructions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				25);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_CDAType() {
		return (EReference) getCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemEntry() {
		if (problemEntryEClass == null) {
			problemEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				3);
		}
		return problemEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemEntry_CDAType() {
		return (EReference) getProblemEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeObservation() {
		if (ageObservationEClass == null) {
			ageObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				4);
		}
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgeObservation_CDAType() {
		return (EReference) getAgeObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverity() {
		if (severityEClass == null) {
			severityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				5);
		}
		return severityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeverity_CDAType() {
		return (EReference) getSeverity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemStatusObservation() {
		if (problemStatusObservationEClass == null) {
			problemStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				6);
		}
		return problemStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusObservation() {
		if (statusObservationEClass == null) {
			statusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				7);
		}
		return statusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusObservation_CDAType() {
		return (EReference) getStatusObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthStatusObservation() {
		if (healthStatusObservationEClass == null) {
			healthStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				8);
		}
		return healthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthStatusObservation_CDAType() {
		return (EReference) getHealthStatusObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientSummary() {
		if (patientSummaryEClass == null) {
			patientSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				26);
		}
		return patientSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSummary_CDAType() {
		return (EReference) getPatientSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				46);
		}
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvanceDirectivesSection_CDAType() {
		return (EReference) getAdvanceDirectivesSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirective() {
		if (advanceDirectiveEClass == null) {
			advanceDirectiveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				47);
		}
		return advanceDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvanceDirective_CDAType() {
		return (EReference) getAdvanceDirective().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveVerification() {
		if (advanceDirectiveVerificationEClass == null) {
			advanceDirectiveVerificationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				48);
		}
		return advanceDirectiveVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvanceDirectiveVerification_CDAType() {
		return (EReference) getAdvanceDirectiveVerification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveStatusObservation() {
		if (advanceDirectiveStatusObservationEClass == null) {
			advanceDirectiveStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(49);
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
			advanceDirectiveReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				50);
		}
		return advanceDirectiveReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvanceDirectiveReference_CDAType() {
		return (EReference) getAdvanceDirectiveReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesReactionsSection() {
		if (allergiesReactionsSectionEClass == null) {
			allergiesReactionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				51);
		}
		return allergiesReactionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergiesReactionsSection_CDAType() {
		return (EReference) getAllergiesReactionsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				9);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_CDAType() {
		return (EReference) getComment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCauseOfDeathObservation() {
		if (causeOfDeathObservationEClass == null) {
			causeOfDeathObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				10);
		}
		return causeOfDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryObservation() {
		if (familyHistoryObservationEClass == null) {
			familyHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				11);
		}
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleObservation() {
		if (simpleObservationEClass == null) {
			simpleObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				12);
		}
		return simpleObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleObservation_CDAType() {
		return (EReference) getSimpleObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemEntryReactionObservationContainer() {
		if (problemEntryReactionObservationContainerEClass == null) {
			problemEntryReactionObservationContainerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(13);
		}
		return problemEntryReactionObservationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemListSection() {
		if (problemListSectionEClass == null) {
			problemListSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				52);
		}
		return problemListSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemListSection_CDAType() {
		return (EReference) getProblemListSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSection() {
		if (encountersSectionEClass == null) {
			encountersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				53);
		}
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncountersSection_CDAType() {
		return (EReference) getEncountersSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersActivity() {
		if (encountersActivityEClass == null) {
			encountersActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				54);
		}
		return encountersActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncountersActivity_CDAType() {
		return (EReference) getEncountersActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocation() {
		if (encounterLocationEClass == null) {
			encounterLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				55);
		}
		return encounterLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_CDAType() {
		return (EReference) getEncounterLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounter() {
		if (encounterEClass == null) {
			encounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				56);
		}
		return encounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_CDAType() {
		return (EReference) getEncounter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSection() {
		if (immunizationsSectionEClass == null) {
			immunizationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				57);
		}
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationsSection_CDAType() {
		return (EReference) getImmunizationsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunization() {
		if (immunizationEClass == null) {
			immunizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				58);
		}
		return immunizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_CDAType() {
		return (EReference) getImmunization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayersSection() {
		if (payersSectionEClass == null) {
			payersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				59);
		}
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayersSection_CDAType() {
		return (EReference) getPayersSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntity() {
		if (payerEntityEClass == null) {
			payerEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				62);
		}
		return payerEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayerEntity_CDAType() {
		return (EReference) getPayerEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoveredParty() {
		if (coveredPartyEClass == null) {
			coveredPartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				63);
		}
		return coveredPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoveredParty_CDAType() {
		return (EReference) getCoveredParty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicySubscriber() {
		if (policySubscriberEClass == null) {
			policySubscriberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				64);
		}
		return policySubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicySubscriber_CDAType() {
		return (EReference) getPolicySubscriber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSection() {
		if (medicationsSectionEClass == null) {
			medicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				65);
		}
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationsSection_CDAType() {
		return (EReference) getMedicationsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareSection() {
		if (planOfCareSectionEClass == null) {
			planOfCareSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				66);
		}
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanOfCareSection_CDAType() {
		return (EReference) getPlanOfCareSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityAct() {
		if (planOfCareActivityActEClass == null) {
			planOfCareActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				67);
		}
		return planOfCareActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanOfCareActivityAct_CDAType() {
		return (EReference) getPlanOfCareActivityAct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivity() {
		if (planOfCareActivityEClass == null) {
			planOfCareActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				68);
		}
		return planOfCareActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityEncounter() {
		if (planOfCareActivityEncounterEClass == null) {
			planOfCareActivityEncounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				69);
		}
		return planOfCareActivityEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanOfCareActivityEncounter_CDAType() {
		return (EReference) getPlanOfCareActivityEncounter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityObservation() {
		if (planOfCareActivityObservationEClass == null) {
			planOfCareActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(70);
		}
		return planOfCareActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanOfCareActivityObservation_CDAType() {
		return (EReference) getPlanOfCareActivityObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityProcedure() {
		if (planOfCareActivityProcedureEClass == null) {
			planOfCareActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				71);
		}
		return planOfCareActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanOfCareActivityProcedure_CDAType() {
		return (EReference) getPlanOfCareActivityProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySubstanceAdministration() {
		if (planOfCareActivitySubstanceAdministrationEClass == null) {
			planOfCareActivitySubstanceAdministrationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(72);
		}
		return planOfCareActivitySubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanOfCareActivitySubstanceAdministration_CDAType() {
		return (EReference) getPlanOfCareActivitySubstanceAdministration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivitySupply() {
		if (planOfCareActivitySupplyEClass == null) {
			planOfCareActivitySupplyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				73);
		}
		return planOfCareActivitySupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanOfCareActivitySupply_CDAType() {
		return (EReference) getPlanOfCareActivitySupply().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurgeriesSection() {
		if (surgeriesSectionEClass == null) {
			surgeriesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				77);
		}
		return surgeriesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurgeriesSection_CDAType() {
		return (EReference) getSurgeriesSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReference() {
		if (externalReferenceEClass == null) {
			externalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				78);
		}
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalReference_CDAType() {
		return (EReference) getExternalReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEntryProcedureActivityProcedure() {
		if (procedureEntryProcedureActivityProcedureEClass == null) {
			procedureEntryProcedureActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(79);
		}
		return procedureEntryProcedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEntry() {
		if (procedureEntryEClass == null) {
			procedureEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				80);
		}
		return procedureEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureEntry_CDAType() {
		return (EReference) getProcedureEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				74);
		}
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_CDAType() {
		return (EReference) getProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyHistorySection() {
		if (pregnancyHistorySectionEClass == null) {
			pregnancyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				75);
		}
		return pregnancyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPregnancyHistorySection_CDAType() {
		return (EReference) getPregnancyHistorySection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyObservation() {
		if (pregnancyObservationEClass == null) {
			pregnancyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				76);
		}
		return pregnancyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupport() {
		if (supportEClass == null) {
			supportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				81);
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
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				82);
		}
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVitalSignsSection_CDAType() {
		return (EReference) getVitalSignsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizer() {
		if (vitalSignsOrganizerEClass == null) {
			vitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				83);
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
			vitalSignObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				84);
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
			diagnosticResultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				85);
		}
		return diagnosticResultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticResultsSection_CDAType() {
		return (EReference) getDiagnosticResultsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		if (resultEClass == null) {
			resultEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				36);
		}
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_CDAType() {
		return (EReference) getResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSign() {
		if (vitalSignEClass == null) {
			vitalSignEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				86);
		}
		return vitalSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVitalSign_CDAType() {
		return (EReference) getVitalSign().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPastIllnessSection() {
		if (historyOfPastIllnessSectionEClass == null) {
			historyOfPastIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				87);
		}
		return historyOfPastIllnessSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryOfPastIllnessSection_CDAType() {
		return (EReference) getHistoryOfPastIllnessSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChiefComplaintSection() {
		if (chiefComplaintSectionEClass == null) {
			chiefComplaintSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				88);
		}
		return chiefComplaintSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChiefComplaintSection_CDAType() {
		return (EReference) getChiefComplaintSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForReferralSection() {
		if (reasonForReferralSectionEClass == null) {
			reasonForReferralSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				89);
		}
		return reasonForReferralSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasonForReferralSection_CDAType() {
		return (EReference) getReasonForReferralSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPresentIllness() {
		if (historyOfPresentIllnessEClass == null) {
			historyOfPresentIllnessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				90);
		}
		return historyOfPresentIllnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryOfPresentIllness_CDAType() {
		return (EReference) getHistoryOfPresentIllness().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusSection() {
		if (functionalStatusSectionEClass == null) {
			functionalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				43);
		}
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalStatusSection_CDAType() {
		return (EReference) getFunctionalStatusSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeSection() {
		if (purposeSectionEClass == null) {
			purposeSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				44);
		}
		return purposeSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPurposeSection_CDAType() {
		return (EReference) getPurposeSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeActivity() {
		if (purposeActivityEClass == null) {
			purposeActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				45);
		}
		return purposeActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPurposeActivity_CDAType() {
		return (EReference) getPurposeActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionDiagnosisSection() {
		if (hospitalAdmissionDiagnosisSectionEClass == null) {
			hospitalAdmissionDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(91);
		}
		return hospitalAdmissionDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitalAdmissionDiagnosisSection_CDAType() {
		return (EReference) getHospitalAdmissionDiagnosisSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDiagnosisSection() {
		if (dischargeDiagnosisSectionEClass == null) {
			dischargeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				92);
		}
		return dischargeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDischargeDiagnosisSection_CDAType() {
		return (EReference) getDischargeDiagnosisSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmissionMedicationHistorySection() {
		if (admissionMedicationHistorySectionEClass == null) {
			admissionMedicationHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(93);
		}
		return admissionMedicationHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdmissionMedicationHistorySection_CDAType() {
		return (EReference) getAdmissionMedicationHistorySection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargeMedicationsSection() {
		if (hospitalDischargeMedicationsSectionEClass == null) {
			hospitalDischargeMedicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(94);
		}
		return hospitalDischargeMedicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitalDischargeMedicationsSection_CDAType() {
		return (EReference) getHospitalDischargeMedicationsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsAdministeredSection() {
		if (medicationsAdministeredSectionEClass == null) {
			medicationsAdministeredSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(95);
		}
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationsAdministeredSection_CDAType() {
		return (EReference) getMedicationsAdministeredSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalExamSection() {
		if (physicalExamSectionEClass == null) {
			physicalExamSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				96);
		}
		return physicalExamSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalExamSection_CDAType() {
		return (EReference) getPhysicalExamSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralAppearanceSection() {
		if (generalAppearanceSectionEClass == null) {
			generalAppearanceSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				97);
		}
		return generalAppearanceSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralAppearanceSection_CDAType() {
		return (EReference) getGeneralAppearanceSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibleImplantedMedicalDevicesSection() {
		if (visibleImplantedMedicalDevicesSectionEClass == null) {
			visibleImplantedMedicalDevicesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(98);
		}
		return visibleImplantedMedicalDevicesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibleImplantedMedicalDevicesSection_CDAType() {
		return (EReference) getVisibleImplantedMedicalDevicesSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegumentarySystemSection() {
		if (integumentarySystemSectionEClass == null) {
			integumentarySystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				99);
		}
		return integumentarySystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegumentarySystemSection_CDAType() {
		return (EReference) getIntegumentarySystemSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadSection() {
		if (headSectionEClass == null) {
			headSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				100);
		}
		return headSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeadSection_CDAType() {
		return (EReference) getHeadSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEyesSection() {
		if (eyesSectionEClass == null) {
			eyesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				101);
		}
		return eyesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEyesSection_CDAType() {
		return (EReference) getEyesSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarsNoseMouthThroatSection() {
		if (earsNoseMouthThroatSectionEClass == null) {
			earsNoseMouthThroatSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				102);
		}
		return earsNoseMouthThroatSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarsNoseMouthThroatSection_CDAType() {
		return (EReference) getEarsNoseMouthThroatSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarsSection() {
		if (earsSectionEClass == null) {
			earsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				103);
		}
		return earsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarsSection_CDAType() {
		return (EReference) getEarsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoseSection() {
		if (noseSectionEClass == null) {
			noseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				104);
		}
		return noseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoseSection_CDAType() {
		return (EReference) getNoseSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMouthThroatTeethSection() {
		if (mouthThroatTeethSectionEClass == null) {
			mouthThroatTeethSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				105);
		}
		return mouthThroatTeethSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMouthThroatTeethSection_CDAType() {
		return (EReference) getMouthThroatTeethSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeckSection() {
		if (neckSectionEClass == null) {
			neckSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				106);
		}
		return neckSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeckSection_CDAType() {
		return (EReference) getNeckSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndocrineSystemSection() {
		if (endocrineSystemSectionEClass == null) {
			endocrineSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				107);
		}
		return endocrineSystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndocrineSystemSection_CDAType() {
		return (EReference) getEndocrineSystemSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoraxLungsSection() {
		if (thoraxLungsSectionEClass == null) {
			thoraxLungsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				108);
		}
		return thoraxLungsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoraxLungsSection_CDAType() {
		return (EReference) getThoraxLungsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChestWallSection() {
		if (chestWallSectionEClass == null) {
			chestWallSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				109);
		}
		return chestWallSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChestWallSection_CDAType() {
		return (EReference) getChestWallSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastSection() {
		if (breastSectionEClass == null) {
			breastSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				110);
		}
		return breastSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreastSection_CDAType() {
		return (EReference) getBreastSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartSection() {
		if (heartSectionEClass == null) {
			heartSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				111);
		}
		return heartSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeartSection_CDAType() {
		return (EReference) getHeartSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespiratorySystemSection() {
		if (respiratorySystemSectionEClass == null) {
			respiratorySystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				112);
		}
		return respiratorySystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRespiratorySystemSection_CDAType() {
		return (EReference) getRespiratorySystemSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbdomenSection() {
		if (abdomenSectionEClass == null) {
			abdomenSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				113);
		}
		return abdomenSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbdomenSection_CDAType() {
		return (EReference) getAbdomenSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLymphaticSection() {
		if (lymphaticSectionEClass == null) {
			lymphaticSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				114);
		}
		return lymphaticSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLymphaticSection_CDAType() {
		return (EReference) getLymphaticSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVesselsSection() {
		if (vesselsSectionEClass == null) {
			vesselsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				115);
		}
		return vesselsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVesselsSection_CDAType() {
		return (EReference) getVesselsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMusculoskeletalSystemSection() {
		if (musculoskeletalSystemSectionEClass == null) {
			musculoskeletalSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				116);
		}
		return musculoskeletalSystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusculoskeletalSystemSection_CDAType() {
		return (EReference) getMusculoskeletalSystemSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeurologicSystemSection() {
		if (neurologicSystemSectionEClass == null) {
			neurologicSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				117);
		}
		return neurologicSystemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeurologicSystemSection_CDAType() {
		return (EReference) getNeurologicSystemSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenitaliaSection() {
		if (genitaliaSectionEClass == null) {
			genitaliaSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				118);
		}
		return genitaliaSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenitaliaSection_CDAType() {
		return (EReference) getGenitaliaSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectumSection() {
		if (rectumSectionEClass == null) {
			rectumSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				119);
		}
		return rectumSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectumSection_CDAType() {
		return (EReference) getRectumSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtremitiesSection() {
		if (extremitiesSectionEClass == null) {
			extremitiesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				120);
		}
		return extremitiesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtremitiesSection_CDAType() {
		return (EReference) getExtremitiesSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewOfSystemsSection() {
		if (reviewOfSystemsSectionEClass == null) {
			reviewOfSystemsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				121);
		}
		return reviewOfSystemsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReviewOfSystemsSection_CDAType() {
		return (EReference) getReviewOfSystemsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalCourseSection() {
		if (hospitalCourseSectionEClass == null) {
			hospitalCourseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				122);
		}
		return hospitalCourseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospitalCourseSection_CDAType() {
		return (EReference) getHospitalCourseSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentAndPlanSection() {
		if (assessmentAndPlanSectionEClass == null) {
			assessmentAndPlanSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				123);
		}
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentAndPlanSection_CDAType() {
		return (EReference) getAssessmentAndPlanSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySection() {
		if (familyHistorySectionEClass == null) {
			familyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				27);
		}
		return familyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyHistorySection_CDAType() {
		return (EReference) getFamilyHistorySection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				30);
		}
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocialHistorySection_CDAType() {
		return (EReference) getSocialHistorySection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistory() {
		if (socialHistoryEClass == null) {
			socialHistoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				31);
		}
		return socialHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocialHistory_CDAType() {
		return (EReference) getSocialHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryStatusObservation() {
		if (socialHistoryStatusObservationEClass == null) {
			socialHistoryStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(32);
		}
		return socialHistoryStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryObservation() {
		if (socialHistoryObservationEClass == null) {
			socialHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				33);
		}
		return socialHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocialHistoryObservation_CDAType() {
		return (EReference) getSocialHistoryObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSection() {
		if (resultsSectionEClass == null) {
			resultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				34);
		}
		return resultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsSection_CDAType() {
		return (EReference) getResultsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultOrganizer() {
		if (resultOrganizerEClass == null) {
			resultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				35);
		}
		return resultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultOrganizer_CDAType() {
		return (EReference) getResultOrganizer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultObservation() {
		if (resultObservationEClass == null) {
			resultObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				37);
		}
		return resultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultObservation_CDAType() {
		return (EReference) getResultObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalEquipmentSection() {
		if (medicalEquipmentSectionEClass == null) {
			medicalEquipmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				38);
		}
		return medicalEquipmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalEquipmentSection_CDAType() {
		return (EReference) getMedicalEquipmentSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyActivity() {
		if (supplyActivityEClass == null) {
			supplyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				39);
		}
		return supplyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyActivity_CDAType() {
		return (EReference) getSupplyActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillmentInstruction() {
		if (fulfillmentInstructionEClass == null) {
			fulfillmentInstructionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				40);
		}
		return fulfillmentInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillmentInstruction_CDAType() {
		return (EReference) getFulfillmentInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationActivity() {
		if (medicationActivityEClass == null) {
			medicationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				41);
		}
		return medicationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationActivity_CDAType() {
		return (EReference) getMedicationActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientInstruction() {
		if (patientInstructionEClass == null) {
			patientInstructionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				42);
		}
		return patientInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientInstruction_CDAType() {
		return (EReference) getPatientInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageSpoken() {
		if (languageSpokenEClass == null) {
			languageSpokenEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				124);
		}
		return languageSpokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageSpoken_CDAType() {
		return (EReference) getLanguageSpoken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsuranceProvider() {
		if (insuranceProviderEClass == null) {
			insuranceProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				60);
		}
		return insuranceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceProvider_CDAType() {
		return (EReference) getInsuranceProvider().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntry() {
		if (payerEntryEClass == null) {
			payerEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				61);
		}
		return payerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayerEntry_CDAType() {
		return (EReference) getPayerEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareProvider() {
		if (healthcareProviderEClass == null) {
			healthcareProviderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				125);
		}
		return healthcareProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareProvider_CDAType() {
		return (EReference) getHealthcareProvider().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationNormalDose() {
		if (medicationNormalDoseEClass == null) {
			medicationNormalDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				126);
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
			medicationSplitDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				127);
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
			medicationTaperedDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				128);
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
			medicationConditionalDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				129);
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
				IDomainPackage.eNS_URI).getEClassifiers().get(130);
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
			supportGuardianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				131);
		}
		return supportGuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportGuardian_CDAType() {
		return (EReference) getSupportGuardian().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportParticipant() {
		if (supportParticipantEClass == null) {
			supportParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				132);
		}
		return supportParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportParticipant_CDAType() {
		return (EReference) getSupportParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument() {
		if (unstructuredDocumentEClass == null) {
			unstructuredDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				133);
		}
		return unstructuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnstructuredDocument_CDAType() {
		return (EReference) getUnstructuredDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanOriginalAuthor() {
		if (scanOriginalAuthorEClass == null) {
			scanOriginalAuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				134);
		}
		return scanOriginalAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScanOriginalAuthor_CDAType() {
		return (EReference) getScanOriginalAuthor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanningDevice() {
		if (scanningDeviceEClass == null) {
			scanningDeviceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				135);
		}
		return scanningDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScanningDevice_CDAType() {
		return (EReference) getScanningDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanDataEnterer() {
		if (scanDataEntererEClass == null) {
			scanDataEntererEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				136);
		}
		return scanDataEntererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScanDataEnterer_CDAType() {
		return (EReference) getScanDataEnterer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationInformation() {
		if (medicationInformationEClass == null) {
			medicationInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				137);
		}
		return medicationInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationInformation_CDAType() {
		return (EReference) getMedicationInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredOrScannedDocument() {
		if (unstructuredOrScannedDocumentEClass == null) {
			unstructuredOrScannedDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IDomainPackage.eNS_URI).getEClassifiers().get(138);
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
			referralSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				139);
		}
		return referralSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralSummary_CDAType() {
		return (EReference) getReferralSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeSummary() {
		if (dischargeSummaryEClass == null) {
			dischargeSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				140);
		}
		return dischargeSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDischargeSummary_CDAType() {
		return (EReference) getDischargeSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDiet() {
		if (dischargeDietEClass == null) {
			dischargeDietEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				141);
		}
		return dischargeDietEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDischargeDiet_CDAType() {
		return (EReference) getDischargeDiet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistory() {
		if (familyHistoryEClass == null) {
			familyHistoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				28);
		}
		return familyHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyHistory_CDAType() {
		return (EReference) getFamilyHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryOrganizer() {
		if (familyHistoryOrganizerEClass == null) {
			familyHistoryOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IDomainPackage.eNS_URI).getEClassifiers().get(
				29);
		}
		return familyHistoryOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyHistoryOrganizer_CDAType() {
		return (EReference) getFamilyHistoryOrganizer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDomainFactory getDomainFactory() {
		return (IDomainFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.hitsp.domain." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // DomainPackageImpl
