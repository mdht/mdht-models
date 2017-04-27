/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.util.AnnotationBasedInitializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAFactory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CLONDATAPackageImpl extends EPackageImpl implements CLONDATAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "clondata.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anthracyclinesLifetimeDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastTNMMetastasisCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastTNMClinicalCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastTNMNodeCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastTNMTumorCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chemotherapeuticDrugTherapyDiscontinuedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chemotherapyProtocolReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalDrugTrialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalizationWithReasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryofCancerNoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryPedigreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastMenstrualPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chemotherapyMedicationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oncotypeDXScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chemotherapyRegimenPlansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planofCareActivityReconstructionProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chemotherapyMedicationActivityPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postTreatmentDiseaseStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastCancerConcernActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastCancerDiagnosisObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neurotoxicityImpairmentofADLsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radiationTherapyCareCompletedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breastCancerProceduresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardiacFunctionObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estrogenReceptorStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass her2ReceptorStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberofLymphNodesPositiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberofLymphNodesRemovedandExaminedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progesteroneReceptorStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lymphNodeSamplingResultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molecularDiagnosticTestingOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptorStatusOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyHeightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodySurfaceAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyWeightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistorySectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planofCareSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planofCareRadiationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsOrganizerBCTPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalOncologyTreatmentPlanandSummaryEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CLONDATAPackageImpl() {
		super(eNS_URI, CLONDATAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CLONDATAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CLONDATAPackage init() {
		if (isInited) {
			return (CLONDATAPackage) EPackage.Registry.INSTANCE.getEPackage(CLONDATAPackage.eNS_URI);
		}

		// Obtain or create and register package
		CLONDATAPackageImpl theCLONDATAPackage = (CLONDATAPackageImpl) (EPackage.Registry.INSTANCE.get(
			eNS_URI) instanceof CLONDATAPackageImpl
					? EPackage.Registry.INSTANCE.get(eNS_URI)
					: new CLONDATAPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConsolPackage.eINSTANCE.eClass();

		// Load packages
		theCLONDATAPackage.loadPackage();

		// Fix loaded packages
		theCLONDATAPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCLONDATAPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CLONDATAValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCLONDATAPackage.freeze();

		// publish my initializers in the registry
		Initializer.Registry.INSTANCE.registerFactory(
			"org.openhealthtools.mdht.uml.cda.clondata", AnnotationBasedInitializer.FACTORY);
		Initializer.Registry.INSTANCE.initializeEPackage(theCLONDATAPackage);

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CLONDATAPackage.eNS_URI, theCLONDATAPackage);
		return theCLONDATAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnthracyclinesLifetimeDose() {
		if (anthracyclinesLifetimeDoseEClass == null) {
			anthracyclinesLifetimeDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(0);
		}
		return anthracyclinesLifetimeDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastTNMMetastasisCategory() {
		if (breastTNMMetastasisCategoryEClass == null) {
			breastTNMMetastasisCategoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(1);
		}
		return breastTNMMetastasisCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastTNMClinicalCategory() {
		if (breastTNMClinicalCategoryEClass == null) {
			breastTNMClinicalCategoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(2);
		}
		return breastTNMClinicalCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastTNMNodeCategory() {
		if (breastTNMNodeCategoryEClass == null) {
			breastTNMNodeCategoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(3);
		}
		return breastTNMNodeCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastTNMTumorCategory() {
		if (breastTNMTumorCategoryEClass == null) {
			breastTNMTumorCategoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(4);
		}
		return breastTNMTumorCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChemotherapeuticDrugTherapyDiscontinued() {
		if (chemotherapeuticDrugTherapyDiscontinuedEClass == null) {
			chemotherapeuticDrugTherapyDiscontinuedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(5);
		}
		return chemotherapeuticDrugTherapyDiscontinuedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChemotherapyProtocolReference() {
		if (chemotherapyProtocolReferenceEClass == null) {
			chemotherapyProtocolReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(6);
		}
		return chemotherapyProtocolReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalDrugTrial() {
		if (clinicalDrugTrialEClass == null) {
			clinicalDrugTrialEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(7);
		}
		return clinicalDrugTrialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalizationWithReason() {
		if (hospitalizationWithReasonEClass == null) {
			hospitalizationWithReasonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(8);
		}
		return hospitalizationWithReasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryofCancerNone() {
		if (familyHistoryofCancerNoneEClass == null) {
			familyHistoryofCancerNoneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(9);
		}
		return familyHistoryofCancerNoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryPedigree() {
		if (familyHistoryPedigreeEClass == null) {
			familyHistoryPedigreeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(10);
		}
		return familyHistoryPedigreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastMenstrualPeriod() {
		if (lastMenstrualPeriodEClass == null) {
			lastMenstrualPeriodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(11);
		}
		return lastMenstrualPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChemotherapyMedicationActivity() {
		if (chemotherapyMedicationActivityEClass == null) {
			chemotherapyMedicationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(12);
		}
		return chemotherapyMedicationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOncotypeDXScore() {
		if (oncotypeDXScoreEClass == null) {
			oncotypeDXScoreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(13);
		}
		return oncotypeDXScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChemotherapyRegimenPlans() {
		if (chemotherapyRegimenPlansEClass == null) {
			chemotherapyRegimenPlansEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(14);
		}
		return chemotherapyRegimenPlansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanofCareActivityReconstructionProcedure() {
		if (planofCareActivityReconstructionProcedureEClass == null) {
			planofCareActivityReconstructionProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(15);
		}
		return planofCareActivityReconstructionProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChemotherapyMedicationActivityPlan() {
		if (chemotherapyMedicationActivityPlanEClass == null) {
			chemotherapyMedicationActivityPlanEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(16);
		}
		return chemotherapyMedicationActivityPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostTreatmentDiseaseStatus() {
		if (postTreatmentDiseaseStatusEClass == null) {
			postTreatmentDiseaseStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(17);
		}
		return postTreatmentDiseaseStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastCancerConcernAct() {
		if (breastCancerConcernActEClass == null) {
			breastCancerConcernActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(18);
		}
		return breastCancerConcernActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastCancerDiagnosisObservation() {
		if (breastCancerDiagnosisObservationEClass == null) {
			breastCancerDiagnosisObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(19);
		}
		return breastCancerDiagnosisObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeurotoxicityImpairmentofADLs() {
		if (neurotoxicityImpairmentofADLsEClass == null) {
			neurotoxicityImpairmentofADLsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(20);
		}
		return neurotoxicityImpairmentofADLsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadiationTherapyCareCompleted() {
		if (radiationTherapyCareCompletedEClass == null) {
			radiationTherapyCareCompletedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(21);
		}
		return radiationTherapyCareCompletedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreastCancerProcedures() {
		if (breastCancerProceduresEClass == null) {
			breastCancerProceduresEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(22);
		}
		return breastCancerProceduresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardiacFunctionObservation() {
		if (cardiacFunctionObservationEClass == null) {
			cardiacFunctionObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(23);
		}
		return cardiacFunctionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstrogenReceptorStatus() {
		if (estrogenReceptorStatusEClass == null) {
			estrogenReceptorStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(24);
		}
		return estrogenReceptorStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHER2ReceptorStatus() {
		if (her2ReceptorStatusEClass == null) {
			her2ReceptorStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(25);
		}
		return her2ReceptorStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberofLymphNodesPositive() {
		if (numberofLymphNodesPositiveEClass == null) {
			numberofLymphNodesPositiveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(26);
		}
		return numberofLymphNodesPositiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberofLymphNodesRemovedandExamined() {
		if (numberofLymphNodesRemovedandExaminedEClass == null) {
			numberofLymphNodesRemovedandExaminedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(27);
		}
		return numberofLymphNodesRemovedandExaminedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgesteroneReceptorStatus() {
		if (progesteroneReceptorStatusEClass == null) {
			progesteroneReceptorStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(28);
		}
		return progesteroneReceptorStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLymphNodeSamplingResultOrganizer() {
		if (lymphNodeSamplingResultOrganizerEClass == null) {
			lymphNodeSamplingResultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(29);
		}
		return lymphNodeSamplingResultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolecularDiagnosticTestingOrganizer() {
		if (molecularDiagnosticTestingOrganizerEClass == null) {
			molecularDiagnosticTestingOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(30);
		}
		return molecularDiagnosticTestingOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptorStatusOrganizer() {
		if (receptorStatusOrganizerEClass == null) {
			receptorStatusOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(31);
		}
		return receptorStatusOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyHeight() {
		if (bodyHeightEClass == null) {
			bodyHeightEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(32);
		}
		return bodyHeightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodySurfaceArea() {
		if (bodySurfaceAreaEClass == null) {
			bodySurfaceAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(33);
		}
		return bodySurfaceAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyWeight() {
		if (bodyWeightEClass == null) {
			bodyWeightEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(34);
		}
		return bodyWeightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSectionBCTPS() {
		if (encountersSectionBCTPSEClass == null) {
			encountersSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(35);
		}
		return encountersSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySectionBCTPS() {
		if (familyHistorySectionBCTPSEClass == null) {
			familyHistorySectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(36);
		}
		return familyHistorySectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusSectionBCTPS() {
		if (functionalStatusSectionBCTPSEClass == null) {
			functionalStatusSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(37);
		}
		return functionalStatusSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSectionBCTPS() {
		if (medicationsSectionBCTPSEClass == null) {
			medicationsSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(38);
		}
		return medicationsSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanofCareSectionBCTPS() {
		if (planofCareSectionBCTPSEClass == null) {
			planofCareSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(39);
		}
		return planofCareSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanofCareRadiationActivity() {
		if (planofCareRadiationActivityEClass == null) {
			planofCareRadiationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(40);
		}
		return planofCareRadiationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSectionBCTPS() {
		if (problemSectionBCTPSEClass == null) {
			problemSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(41);
		}
		return problemSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresSectionBCTPS() {
		if (proceduresSectionBCTPSEClass == null) {
			proceduresSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(42);
		}
		return proceduresSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSectionBCTPS() {
		if (resultsSectionBCTPSEClass == null) {
			resultsSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(43);
		}
		return resultsSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSectionBCTPS() {
		if (vitalSignsSectionBCTPSEClass == null) {
			vitalSignsSectionBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(44);
		}
		return vitalSignsSectionBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizerBCTPS() {
		if (vitalSignsOrganizerBCTPSEClass == null) {
			vitalSignsOrganizerBCTPSEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(45);
		}
		return vitalSignsOrganizerBCTPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalOncologyTreatmentPlanandSummary() {
		if (clinicalOncologyTreatmentPlanandSummaryEClass == null) {
			clinicalOncologyTreatmentPlanandSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CLONDATAPackage.eNS_URI).getEClassifiers().get(46);
		}
		return clinicalOncologyTreatmentPlanandSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLONDATAFactory getCLONDATAFactory() {
		return (CLONDATAFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.clondata." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // CLONDATAPackageImpl
