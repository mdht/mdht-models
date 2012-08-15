/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.flu.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fluFactoryImpl extends EFactoryImpl implements fluFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static fluFactory init() {
		try {
			fluFactory thefluFactory = (fluFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/flu"); 
			if (thefluFactory != null) {
				return thefluFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new fluFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fluFactoryImpl() {
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
			case fluPackage.INFLUENZA_CASE_REPORT: return createInfluenzaCaseReport();
			case fluPackage.INFLUENZA_IMMUNIZATION_SECTION: return createInfluenzaImmunizationSection();
			case fluPackage.INFLUENZA_IMMUNIZATION_ACTIVITY: return createInfluenzaImmunizationActivity();
			case fluPackage.INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION: return createInfluenzaPHCRClinicalInformationSection();
			case fluPackage.INFLUENZA_CASE_OBSERVATION: return createInfluenzaCaseObservation();
			case fluPackage.INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION: return createInfluenzaSignsAndSymptomsObservation();
			case fluPackage.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION: return createInfluenzaPHCRTreatmentInformationSection();
			case fluPackage.INFLUENZA_THERAPEUTIC_REGIMEN_ACT: return createInfluenzaTherapeuticRegimenAct();
			case fluPackage.INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createInfluenzaTreatmentGivenSubstanceAdministration();
			case fluPackage.INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createInfluenzaTreatmentNotGivenSubstanceAdministration();
			case fluPackage.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION: return createInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();
			case fluPackage.INFLUENZA_RESULT_OBSERVATION: return createInfluenzaResultObservation();
			case fluPackage.INFLUENZA_IMAGING_OBSERVATION: return createInfluenzaImagingObservation();
			case fluPackage.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION: return createInfluenzaPHCRSocialHistorySection();
			case fluPackage.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION: return createInfluenzaEmploymentStatusObservation();
			case fluPackage.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT: return createInfluenzaPossibleExposureLocationAct();
			case fluPackage.INFLUENZA_IMMUNIZATION_PRODUCT: return createInfluenzaImmunizationProduct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaCaseReport createInfluenzaCaseReport() {
		InfluenzaCaseReportImpl influenzaCaseReport = new InfluenzaCaseReportImpl();
		return influenzaCaseReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaImmunizationSection createInfluenzaImmunizationSection() {
		InfluenzaImmunizationSectionImpl influenzaImmunizationSection = new InfluenzaImmunizationSectionImpl();
		return influenzaImmunizationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaImmunizationActivity createInfluenzaImmunizationActivity() {
		InfluenzaImmunizationActivityImpl influenzaImmunizationActivity = new InfluenzaImmunizationActivityImpl();
		return influenzaImmunizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRClinicalInformationSection createInfluenzaPHCRClinicalInformationSection() {
		InfluenzaPHCRClinicalInformationSectionImpl influenzaPHCRClinicalInformationSection = new InfluenzaPHCRClinicalInformationSectionImpl();
		return influenzaPHCRClinicalInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaCaseObservation createInfluenzaCaseObservation() {
		InfluenzaCaseObservationImpl influenzaCaseObservation = new InfluenzaCaseObservationImpl();
		return influenzaCaseObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaSignsAndSymptomsObservation createInfluenzaSignsAndSymptomsObservation() {
		InfluenzaSignsAndSymptomsObservationImpl influenzaSignsAndSymptomsObservation = new InfluenzaSignsAndSymptomsObservationImpl();
		return influenzaSignsAndSymptomsObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRTreatmentInformationSection createInfluenzaPHCRTreatmentInformationSection() {
		InfluenzaPHCRTreatmentInformationSectionImpl influenzaPHCRTreatmentInformationSection = new InfluenzaPHCRTreatmentInformationSectionImpl();
		return influenzaPHCRTreatmentInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaTherapeuticRegimenAct createInfluenzaTherapeuticRegimenAct() {
		InfluenzaTherapeuticRegimenActImpl influenzaTherapeuticRegimenAct = new InfluenzaTherapeuticRegimenActImpl();
		return influenzaTherapeuticRegimenAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaTreatmentGivenSubstanceAdministration createInfluenzaTreatmentGivenSubstanceAdministration() {
		InfluenzaTreatmentGivenSubstanceAdministrationImpl influenzaTreatmentGivenSubstanceAdministration = new InfluenzaTreatmentGivenSubstanceAdministrationImpl();
		return influenzaTreatmentGivenSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaTreatmentNotGivenSubstanceAdministration createInfluenzaTreatmentNotGivenSubstanceAdministration() {
		InfluenzaTreatmentNotGivenSubstanceAdministrationImpl influenzaTreatmentNotGivenSubstanceAdministration = new InfluenzaTreatmentNotGivenSubstanceAdministrationImpl();
		return influenzaTreatmentNotGivenSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection createInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
		InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection = new InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl();
		return influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaResultObservation createInfluenzaResultObservation() {
		InfluenzaResultObservationImpl influenzaResultObservation = new InfluenzaResultObservationImpl();
		return influenzaResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaImagingObservation createInfluenzaImagingObservation() {
		InfluenzaImagingObservationImpl influenzaImagingObservation = new InfluenzaImagingObservationImpl();
		return influenzaImagingObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRSocialHistorySection createInfluenzaPHCRSocialHistorySection() {
		InfluenzaPHCRSocialHistorySectionImpl influenzaPHCRSocialHistorySection = new InfluenzaPHCRSocialHistorySectionImpl();
		return influenzaPHCRSocialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaEmploymentStatusObservation createInfluenzaEmploymentStatusObservation() {
		InfluenzaEmploymentStatusObservationImpl influenzaEmploymentStatusObservation = new InfluenzaEmploymentStatusObservationImpl();
		return influenzaEmploymentStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPossibleExposureLocationAct createInfluenzaPossibleExposureLocationAct() {
		InfluenzaPossibleExposureLocationActImpl influenzaPossibleExposureLocationAct = new InfluenzaPossibleExposureLocationActImpl();
		return influenzaPossibleExposureLocationAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaImmunizationProduct createInfluenzaImmunizationProduct() {
		InfluenzaImmunizationProductImpl influenzaImmunizationProduct = new InfluenzaImmunizationProductImpl();
		return influenzaImmunizationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fluPackage getfluPackage() {
		return (fluPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static fluPackage getPackage() {
		return fluPackage.eINSTANCE;
	}

} //fluFactoryImpl
