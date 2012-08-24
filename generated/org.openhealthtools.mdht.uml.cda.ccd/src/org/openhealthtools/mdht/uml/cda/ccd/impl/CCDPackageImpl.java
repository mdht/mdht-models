/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.impl;

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
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CCDPackageImpl extends EPackageImpl implements CCDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ccd.ecore";

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
	private EClass continuityOfCareDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemActEClass = null;

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
	private EClass problemSectionEClass = null;

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
	private EClass episodeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientAwarenessEClass = null;

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
	private EClass familyHistoryObservationEClass = null;

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
	private EClass socialHistoryStatusObservationEClass = null;

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
	private EClass immunizationsSectionEClass = null;

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
	private EClass medicationActivityEClass = null;

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
	private EClass alertsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertObservationEClass = null;

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
	private EClass alertStatusObservationEClass = null;

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
	private EClass resultsSectionEClass = null;

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
	private EClass encounterLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

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
	private EClass planOfCareSectionEClass = null;

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
	private EClass vitalSignsSectionEClass = null;

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
	private EClass advanceDirectivesSectionEClass = null;

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
	private EClass vitalSignsOrganizerEClass = null;

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
	private EClass advanceDirectiveStatusObservationEClass = null;

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
	private EClass authorizationActivityEClass = null;

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
	private EClass procedureActivityEClass = null;

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
	private EClass fulfillmentInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusObservationEClass = null;

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
	private EClass ageObservationEClass = null;

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
	private EClass planOfCareActivityEncounterEClass = null;

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
	private EClass procedureActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityObservationEClass = null;

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
	private EClass coveragePlanDescriptionEClass = null;

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
	private EClass supportEClass = null;

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
	private EClass commentEClass = null;

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
	private EClass familyHistoryCauseOfDeathObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccdRegistryDelegateEClass = null;

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
	private EClass problemHealthStatusObservationEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CCDPackageImpl() {
		super(eNS_URI, CCDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CCDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CCDPackage init() {
		if (isInited) {
			return (CCDPackage) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);
		}

		// Obtain or create and register package
		CCDPackageImpl theCCDPackage = (CCDPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CCDPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new CCDPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Load packages
		theCCDPackage.loadPackage();

		// Fix loaded packages
		theCCDPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCCDPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CCDValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCCDPackage.freeze();

		// publish my initializers in the registry
		Initializer.Registry.INSTANCE.registerFactory(
			"org.openhealthtools.mdht.uml.cda.ccd", AnnotationBasedInitializer.FACTORY);
		Initializer.Registry.INSTANCE.initializeEPackage(theCCDPackage);

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CCDPackage.eNS_URI, theCCDPackage);
		return theCCDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsSection() {
		if (medicationsSectionEClass == null) {
			medicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				0);
		}
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuityOfCareDocument() {
		if (continuityOfCareDocumentEClass == null) {
			continuityOfCareDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				11);
		}
		return continuityOfCareDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemAct() {
		if (problemActEClass == null) {
			problemActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				13);
		}
		return problemActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemObservation() {
		if (problemObservationEClass == null) {
			problemObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				51);
		}
		return problemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSection() {
		if (problemSectionEClass == null) {
			problemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				12);
		}
		return problemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemStatusObservation() {
		if (problemStatusObservationEClass == null) {
			problemStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				19);
		}
		return problemStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeObservation() {
		if (episodeObservationEClass == null) {
			episodeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				14);
		}
		return episodeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientAwareness() {
		if (patientAwarenessEClass == null) {
			patientAwarenessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				53);
		}
		return patientAwarenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySection() {
		if (familyHistorySectionEClass == null) {
			familyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				15);
		}
		return familyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryObservation() {
		if (familyHistoryObservationEClass == null) {
			familyHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				17);
		}
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryOrganizer() {
		if (familyHistoryOrganizerEClass == null) {
			familyHistoryOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				16);
		}
		return familyHistoryOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultOrganizer() {
		if (resultOrganizerEClass == null) {
			resultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				25);
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
			resultObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				26);
		}
		return resultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				20);
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
			socialHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				21);
		}
		return socialHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistoryStatusObservation() {
		if (socialHistoryStatusObservationEClass == null) {
			socialHistoryStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				22);
		}
		return socialHistoryStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersSection() {
		if (encountersSectionEClass == null) {
			encountersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				28);
		}
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationsSection() {
		if (immunizationsSectionEClass == null) {
			immunizationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				38);
		}
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncountersActivity() {
		if (encountersActivityEClass == null) {
			encountersActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				29);
		}
		return encountersActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationActivity() {
		if (medicationActivityEClass == null) {
			medicationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				1);
		}
		return medicationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyActivity() {
		if (supplyActivityEClass == null) {
			supplyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				9);
		}
		return supplyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertsSection() {
		if (alertsSectionEClass == null) {
			alertsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				23);
		}
		return alertsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertObservation() {
		if (alertObservationEClass == null) {
			alertObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				54);
		}
		return alertObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionObservation() {
		if (reactionObservationEClass == null) {
			reactionObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				6);
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
			severityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				7);
		}
		return severityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertStatusObservation() {
		if (alertStatusObservationEClass == null) {
			alertStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				55);
		}
		return alertStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCauseOfDeathObservation() {
		if (causeOfDeathObservationEClass == null) {
			causeOfDeathObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				56);
		}
		return causeOfDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsSection() {
		if (resultsSectionEClass == null) {
			resultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				24);
		}
		return resultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationSeriesNumberObservation() {
		if (medicationSeriesNumberObservationEClass == null) {
			medicationSeriesNumberObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CCDPackage.eNS_URI).getEClassifiers().get(2);
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
			medicationStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				3);
		}
		return medicationStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocation() {
		if (encounterLocationEClass == null) {
			encounterLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				57);
		}
		return encounterLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		if (productEClass == null) {
			productEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				58);
		}
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresSection() {
		if (proceduresSectionEClass == null) {
			proceduresSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				27);
		}
		return proceduresSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareSection() {
		if (planOfCareSectionEClass == null) {
			planOfCareSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				30);
		}
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivity() {
		if (planOfCareActivityEClass == null) {
			planOfCareActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				31);
		}
		return planOfCareActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSection() {
		if (vitalSignsSectionEClass == null) {
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				39);
		}
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalEquipmentSection() {
		if (medicalEquipmentSectionEClass == null) {
			medicalEquipmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				41);
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
			functionalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				42);
		}
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				43);
		}
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayersSection() {
		if (payersSectionEClass == null) {
			payersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				46);
		}
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurposeSection() {
		if (purposeSectionEClass == null) {
			purposeSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				49);
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
			purposeActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				50);
		}
		return purposeActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizer() {
		if (vitalSignsOrganizerEClass == null) {
			vitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				40);
		}
		return vitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveObservation() {
		if (advanceDirectiveObservationEClass == null) {
			advanceDirectiveObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				44);
		}
		return advanceDirectiveObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveStatusObservation() {
		if (advanceDirectiveStatusObservationEClass == null) {
			advanceDirectiveStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CCDPackage.eNS_URI).getEClassifiers().get(45);
		}
		return advanceDirectiveStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveVerification() {
		if (advanceDirectiveVerificationEClass == null) {
			advanceDirectiveVerificationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				59);
		}
		return advanceDirectiveVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageActivity() {
		if (coverageActivityEClass == null) {
			coverageActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				47);
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
			policyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				48);
		}
		return policyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayerEntity() {
		if (payerEntityEClass == null) {
			payerEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				66);
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
			coveredPartyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				67);
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
			policySubscriberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				68);
		}
		return policySubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationActivity() {
		if (authorizationActivityEClass == null) {
			authorizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				60);
		}
		return authorizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityAct() {
		if (planOfCareActivityActEClass == null) {
			planOfCareActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				32);
		}
		return planOfCareActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivity() {
		if (procedureActivityEClass == null) {
			procedureActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				61);
		}
		return procedureActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientInstruction() {
		if (patientInstructionEClass == null) {
			patientInstructionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				5);
		}
		return patientInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillmentInstruction() {
		if (fulfillmentInstructionEClass == null) {
			fulfillmentInstructionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				10);
		}
		return fulfillmentInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalStatusObservation() {
		if (functionalStatusObservationEClass == null) {
			functionalStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				62);
		}
		return functionalStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		if (productInstanceEClass == null) {
			productInstanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				8);
		}
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeObservation() {
		if (ageObservationEClass == null) {
			ageObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				18);
		}
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityObservation() {
		if (planOfCareActivityObservationEClass == null) {
			planOfCareActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				34);
		}
		return planOfCareActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityEncounter() {
		if (planOfCareActivityEncounterEClass == null) {
			planOfCareActivityEncounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				33);
		}
		return planOfCareActivityEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanOfCareActivityProcedure() {
		if (planOfCareActivityProcedureEClass == null) {
			planOfCareActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				35);
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
				CCDPackage.eNS_URI).getEClassifiers().get(36);
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
			planOfCareActivitySupplyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				37);
		}
		return planOfCareActivitySupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityAct() {
		if (procedureActivityActEClass == null) {
			procedureActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				63);
		}
		return procedureActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityObservation() {
		if (procedureActivityObservationEClass == null) {
			procedureActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				64);
		}
		return procedureActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureActivityProcedure() {
		if (procedureActivityProcedureEClass == null) {
			procedureActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				65);
		}
		return procedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoveragePlanDescription() {
		if (coveragePlanDescriptionEClass == null) {
			coveragePlanDescriptionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				69);
		}
		return coveragePlanDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportParticipant() {
		if (supportParticipantEClass == null) {
			supportParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				70);
		}
		return supportParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupport() {
		if (supportEClass == null) {
			supportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				71);
		}
		return supportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportGuardian() {
		if (supportGuardianEClass == null) {
			supportGuardianEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				72);
		}
		return supportGuardianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				73);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectiveReference() {
		if (advanceDirectiveReferenceEClass == null) {
			advanceDirectiveReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				74);
		}
		return advanceDirectiveReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryCauseOfDeathObservation() {
		if (familyHistoryCauseOfDeathObservationEClass == null) {
			familyHistoryCauseOfDeathObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				CCDPackage.eNS_URI).getEClassifiers().get(75);
		}
		return familyHistoryCauseOfDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCCDRegistryDelegate() {
		if (ccdRegistryDelegateEClass == null) {
			ccdRegistryDelegateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				76);
		}
		return ccdRegistryDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusObservation() {
		if (statusObservationEClass == null) {
			statusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				4);
		}
		return statusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemHealthStatusObservation() {
		if (problemHealthStatusObservationEClass == null) {
			problemHealthStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI).getEClassifiers().get(
				52);
		}
		return problemHealthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDFactory getCCDFactory() {
		return (CCDFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.ccd." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // CCDPackageImpl
