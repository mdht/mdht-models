/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.impl;

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
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IHEPackageImpl extends EPackageImpl implements IHEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ihe.ecore";

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
	private EClass medicationsAdministeredSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeProblemsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemConcernEntryEClass = null;

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
	private EClass medicationEClass = null;

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
	private EClass medicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceConcernEClass = null;

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
	private EClass allergiesReactionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taperedDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalDoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationMedicationEClass = null;

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
	private EClass codedVitalSignsSectionEClass = null;

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
	private EClass simpleObservationEClass = null;

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
	private EClass payersSectionEClass = null;

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
	private EClass surgeriesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codedSurgeriesSectionEClass = null;

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
	private EClass codedAdvanceDirectivesSectionEClass = null;

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
	private EClass physicalExamNarrativeSectionEClass = null;

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
	private EClass codedResultsSectionEClass = null;

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
	private EClass assessmentAndPlanSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMedicalHistorySectionEClass = null;

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
	private EClass encounterHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalDevicesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalSummaryEClass = null;

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
	private EClass coverageEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareProvidersPharmaciesEClass = null;

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
	private EClass observationRequestEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEntryEClass = null;

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
	private EClass procedureEntryProcedureActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEntryPlanOfCareActivityProcedureEClass = null;

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
	private EClass payerEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phrExtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phrUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterPlanOfCareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intakeOutputSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyEntryEClass = null;

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
	private EClass patientContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientContactGuardianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientContactParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scannedDocumentEClass = null;

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
	private EClass dischargeDietEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargePhysicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codedFamilyMedicalHistorySectionEClass = null;

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
	private EClass socialHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codedReasonForReferralSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codedSocialHistorySectionEClass = null;

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
	private EClass proceduresAndInterventionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iheRegistryDelegateEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IHEPackageImpl() {
		super(eNS_URI, IHEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IHEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static IHEPackage init() {
		if (isInited) {
			return (IHEPackage) EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI);
		}

		// Obtain or create and register package
		IHEPackageImpl theIHEPackage = (IHEPackageImpl) (EPackage.Registry.INSTANCE.get(
			eNS_URI) instanceof IHEPackageImpl
					? EPackage.Registry.INSTANCE.get(eNS_URI)
					: new IHEPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDTPackage.eINSTANCE.eClass();

		// Load packages
		theIHEPackage.loadPackage();

		// Fix loaded packages
		theIHEPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theIHEPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return IHEValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theIHEPackage.freeze();

		// publish my initializers in the registry
		Initializer.Registry.INSTANCE.registerFactory(
			"org.openhealthtools.mdht.uml.cda.ihe", AnnotationBasedInitializer.FACTORY);
		Initializer.Registry.INSTANCE.initializeEPackage(theIHEPackage);

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IHEPackage.eNS_URI, theIHEPackage);
		return theIHEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSection() {
		if (immunizationsSectionEClass == null) {
			immunizationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(0);
		}
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsAdministeredSection() {
		if (medicationsAdministeredSectionEClass == null) {
			medicationsAdministeredSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(2);
		}
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcernEntry() {
		if (concernEntryEClass == null) {
			concernEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(3);
		}
		return concernEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalDocument() {
		if (medicalDocumentEClass == null) {
			medicalDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(4);
		}
		return medicalDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveProblemsSection() {
		if (activeProblemsSectionEClass == null) {
			activeProblemsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(5);
		}
		return activeProblemsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemConcernEntry() {
		if (problemConcernEntryEClass == null) {
			problemConcernEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(6);
		}
		return problemConcernEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemEntry() {
		if (problemEntryEClass == null) {
			problemEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(7);
		}
		return problemEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverity() {
		if (severityEClass == null) {
			severityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI).getEClassifiers().get(
				8);
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
			problemStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(9);
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
			healthStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(10);
		}
		return healthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		if (medicationEClass == null) {
			medicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(12);
		}
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalReference() {
		if (internalReferenceEClass == null) {
			internalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(13);
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
			patientMedicalInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(14);
		}
		return patientMedicalInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSection() {
		if (medicationsSectionEClass == null) {
			medicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(17);
		}
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceConcern() {
		if (allergyIntoleranceConcernEClass == null) {
			allergyIntoleranceConcernEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(18);
		}
		return allergyIntoleranceConcernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntolerance() {
		if (allergyIntoleranceEClass == null) {
			allergyIntoleranceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(19);
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
				IHEPackage.eNS_URI).getEClassifiers().get(20);
		}
		return problemEntryReactionObservationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesReactionsSection() {
		if (allergiesReactionsSectionEClass == null) {
			allergiesReactionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(21);
		}
		return allergiesReactionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalDose() {
		if (normalDoseEClass == null) {
			normalDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(22);
		}
		return normalDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaperedDose() {
		if (taperedDoseEClass == null) {
			taperedDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(23);
		}
		return taperedDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitDose() {
		if (splitDoseEClass == null) {
			splitDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI).getEClassifiers().get(
				24);
		}
		return splitDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalDose() {
		if (conditionalDoseEClass == null) {
			conditionalDoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(25);
		}
		return conditionalDoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinationMedication() {
		if (combinationMedicationEClass == null) {
			combinationMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(26);
		}
		return combinationMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSection() {
		if (vitalSignsSectionEClass == null) {
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(27);
		}
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedVitalSignsSection() {
		if (codedVitalSignsSectionEClass == null) {
			codedVitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(28);
		}
		return codedVitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignObservation() {
		if (vitalSignObservationEClass == null) {
			vitalSignObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(30);
		}
		return vitalSignObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleObservation() {
		if (simpleObservationEClass == null) {
			simpleObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(31);
		}
		return simpleObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizer() {
		if (vitalSignsOrganizerEClass == null) {
			vitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(29);
		}
		return vitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayersSection() {
		if (payersSectionEClass == null) {
			payersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(32);
		}
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfPastIllnessSection() {
		if (historyOfPastIllnessSectionEClass == null) {
			historyOfPastIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(35);
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
			chiefComplaintSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(36);
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
			reasonForReferralSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(37);
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
			historyOfPresentIllnessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(38);
		}
		return historyOfPresentIllnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurgeriesSection() {
		if (surgeriesSectionEClass == null) {
			surgeriesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(39);
		}
		return surgeriesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedSurgeriesSection() {
		if (codedSurgeriesSectionEClass == null) {
			codedSurgeriesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(40);
		}
		return codedSurgeriesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalAdmissionDiagnosisSection() {
		if (hospitalAdmissionDiagnosisSectionEClass == null) {
			hospitalAdmissionDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(44);
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
			dischargeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(45);
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
				IHEPackage.eNS_URI).getEClassifiers().get(46);
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
				IHEPackage.eNS_URI).getEClassifiers().get(47);
		}
		return hospitalDischargeMedicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedAdvanceDirectivesSection() {
		if (codedAdvanceDirectivesSectionEClass == null) {
			codedAdvanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(48);
		}
		return codedAdvanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(49);
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
			advanceDirectiveObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(50);
		}
		return advanceDirectiveObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalExamNarrativeSection() {
		if (physicalExamNarrativeSectionEClass == null) {
			physicalExamNarrativeSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(51);
		}
		return physicalExamNarrativeSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalExamSection() {
		if (physicalExamSectionEClass == null) {
			physicalExamSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(52);
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
			generalAppearanceSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(53);
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
				IHEPackage.eNS_URI).getEClassifiers().get(54);
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
			integumentarySystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(55);
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
			headSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(56);
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
			eyesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(57);
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
			earsNoseMouthThroatSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(58);
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
			earsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(59);
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
			noseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(60);
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
			mouthThroatTeethSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(61);
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
			neckSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(62);
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
			endocrineSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(63);
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
			thoraxLungsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(64);
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
			chestWallSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(65);
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
			breastSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(66);
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
			heartSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(67);
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
			respiratorySystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(68);
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
			abdomenSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(69);
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
			lymphaticSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(70);
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
			vesselsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(71);
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
			musculoskeletalSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(72);
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
			neurologicSystemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(73);
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
			genitaliaSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(74);
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
			rectumSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(75);
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
			extremitiesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(76);
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
			reviewOfSystemsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(77);
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
			hospitalCourseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(78);
		}
		return hospitalCourseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedResultsSection() {
		if (codedResultsSectionEClass == null) {
			codedResultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(79);
		}
		return codedResultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReference() {
		if (externalReferenceEClass == null) {
			externalReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(41);
		}
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentAndPlanSection() {
		if (assessmentAndPlanSectionEClass == null) {
			assessmentAndPlanSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(80);
		}
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanSection() {
		if (carePlanSectionEClass == null) {
			carePlanSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(81);
		}
		return carePlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMedicalHistorySection() {
		if (familyMedicalHistorySectionEClass == null) {
			familyMedicalHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(82);
		}
		return familyMedicalHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(83);
		}
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterHistorySection() {
		if (encounterHistorySectionEClass == null) {
			encounterHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(84);
		}
		return encounterHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterEntry() {
		if (encounterEntryEClass == null) {
			encounterEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(85);
		}
		return encounterEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalDevicesSection() {
		if (medicalDevicesSectionEClass == null) {
			medicalDevicesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(86);
		}
		return medicalDevicesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageCommunication() {
		if (languageCommunicationEClass == null) {
			languageCommunicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(87);
		}
		return languageCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalSummary() {
		if (medicalSummaryEClass == null) {
			medicalSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(88);
		}
		return medicalSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeSummary() {
		if (dischargeSummaryEClass == null) {
			dischargeSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(89);
		}
		return dischargeSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageEntry() {
		if (coverageEntryEClass == null) {
			coverageEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(33);
		}
		return coverageEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareProvidersPharmacies() {
		if (healthcareProvidersPharmaciesEClass == null) {
			healthcareProvidersPharmaciesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(90);
		}
		return healthcareProvidersPharmaciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunization() {
		if (immunizationEClass == null) {
			immunizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(1);
		}
		return immunizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationRequestEntry() {
		if (observationRequestEntryEClass == null) {
			observationRequestEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(91);
		}
		return observationRequestEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductEntry() {
		if (productEntryEClass == null) {
			productEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(92);
		}
		return productEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEntry() {
		if (procedureEntryEClass == null) {
			procedureEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(43);
		}
		return procedureEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEntryProcedureActivityProcedure() {
		if (procedureEntryProcedureActivityProcedureEClass == null) {
			procedureEntryProcedureActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(42);
		}
		return procedureEntryProcedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureEntryPlanOfCareActivityProcedure() {
		if (procedureEntryPlanOfCareActivityProcedureEClass == null) {
			procedureEntryPlanOfCareActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(93);
		}
		return procedureEntryPlanOfCareActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI).getEClassifiers().get(
				11);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntry() {
		if (payerEntryEClass == null) {
			payerEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(34);
		}
		return payerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPHRExtract() {
		if (phrExtractEClass == null) {
			phrExtractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(94);
		}
		return phrExtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPHRUpdate() {
		if (phrUpdateEClass == null) {
			phrUpdateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(IHEPackage.eNS_URI).getEClassifiers().get(
				95);
		}
		return phrUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterActivity() {
		if (encounterActivityEClass == null) {
			encounterActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(96);
		}
		return encounterActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterPlanOfCare() {
		if (encounterPlanOfCareEClass == null) {
			encounterPlanOfCareEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(97);
		}
		return encounterPlanOfCareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntakeOutputSection() {
		if (intakeOutputSectionEClass == null) {
			intakeOutputSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(98);
		}
		return intakeOutputSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyEntry() {
		if (supplyEntryEClass == null) {
			supplyEntryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(15);
		}
		return supplyEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationFullfillmentInstructions() {
		if (medicationFullfillmentInstructionsEClass == null) {
			medicationFullfillmentInstructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(16);
		}
		return medicationFullfillmentInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregnancyHistorySection() {
		if (pregnancyHistorySectionEClass == null) {
			pregnancyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(99);
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
			pregnancyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(100);
		}
		return pregnancyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientContact() {
		if (patientContactEClass == null) {
			patientContactEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(101);
		}
		return patientContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientContactGuardian() {
		if (patientContactGuardianEClass == null) {
			patientContactGuardianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(102);
		}
		return patientContactGuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientContactParticipant() {
		if (patientContactParticipantEClass == null) {
			patientContactParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(103);
		}
		return patientContactParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScannedDocument() {
		if (scannedDocumentEClass == null) {
			scannedDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(104);
		}
		return scannedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanOriginalAuthor() {
		if (scanOriginalAuthorEClass == null) {
			scanOriginalAuthorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(105);
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
			scanningDeviceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(106);
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
			scanDataEntererEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(107);
		}
		return scanDataEntererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDiet() {
		if (dischargeDietEClass == null) {
			dischargeDietEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(108);
		}
		return dischargeDietEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalDischargePhysical() {
		if (hospitalDischargePhysicalEClass == null) {
			hospitalDischargePhysicalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(109);
		}
		return hospitalDischargePhysicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedFamilyMedicalHistorySection() {
		if (codedFamilyMedicalHistorySectionEClass == null) {
			codedFamilyMedicalHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(110);
		}
		return codedFamilyMedicalHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryOrganizer() {
		if (familyHistoryOrganizerEClass == null) {
			familyHistoryOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(111);
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
			familyHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(112);
		}
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryObservation() {
		if (socialHistoryObservationEClass == null) {
			socialHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(113);
		}
		return socialHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedReasonForReferralSection() {
		if (codedReasonForReferralSectionEClass == null) {
			codedReasonForReferralSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(114);
		}
		return codedReasonForReferralSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedSocialHistorySection() {
		if (codedSocialHistorySectionEClass == null) {
			codedSocialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(115);
		}
		return codedSocialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusSection() {
		if (functionalStatusSectionEClass == null) {
			functionalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(116);
		}
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresAndInterventionsSection() {
		if (proceduresAndInterventionsSectionEClass == null) {
			proceduresAndInterventionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(117);
		}
		return proceduresAndInterventionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHERegistryDelegate() {
		if (iheRegistryDelegateEClass == null) {
			iheRegistryDelegateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				IHEPackage.eNS_URI).getEClassifiers().get(118);
		}
		return iheRegistryDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEFactory getIHEFactory() {
		return (IHEFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.ihe." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // IHEPackageImpl
