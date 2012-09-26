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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SilicosisFactoryImpl extends EFactoryImpl implements SilicosisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SilicosisFactory init() {
		try {
			SilicosisFactory theSilicosisFactory = (SilicosisFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/silicosis"); 
			if (theSilicosisFactory != null) {
				return theSilicosisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SilicosisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisFactoryImpl() {
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
			case SilicosisPackage.SILICOSIS_CASE_REPORT: return createSilicosisCaseReport();
			case SilicosisPackage.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION: return createSilicosisPHCRSocialHistorySection();
			case SilicosisPackage.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION: return createSilicosisSocioBehavioralBooleanRiskFactorObservation();
			case SilicosisPackage.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT: return createSilicosisPossibleExposureLocationAndTypeAct();
			case SilicosisPackage.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION: return createSilicosisPHCRClinicalInformationSection();
			case SilicosisPackage.SILICOSIS_CASE_OBSERVATION: return createSilicosisCaseObservation();
			case SilicosisPackage.SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION: return createSilicosisSignsAndSymptomsObservation();
			case SilicosisPackage.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION: return createSilicosisHistoryOfTuberculosisObservation();
			case SilicosisPackage.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION: return createSilicosisPHCRRelevantDxTestsSection();
			case SilicosisPackage.SILICOSIS_IMAGING_OBSERVATION: return createSilicosisImagingObservation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisCaseReport createSilicosisCaseReport() {
		SilicosisCaseReportImpl silicosisCaseReport = new SilicosisCaseReportImpl();
		return silicosisCaseReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisPHCRSocialHistorySection createSilicosisPHCRSocialHistorySection() {
		SilicosisPHCRSocialHistorySectionImpl silicosisPHCRSocialHistorySection = new SilicosisPHCRSocialHistorySectionImpl();
		return silicosisPHCRSocialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisSocioBehavioralBooleanRiskFactorObservation createSilicosisSocioBehavioralBooleanRiskFactorObservation() {
		SilicosisSocioBehavioralBooleanRiskFactorObservationImpl silicosisSocioBehavioralBooleanRiskFactorObservation = new SilicosisSocioBehavioralBooleanRiskFactorObservationImpl();
		return silicosisSocioBehavioralBooleanRiskFactorObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisPHCRClinicalInformationSection createSilicosisPHCRClinicalInformationSection() {
		SilicosisPHCRClinicalInformationSectionImpl silicosisPHCRClinicalInformationSection = new SilicosisPHCRClinicalInformationSectionImpl();
		return silicosisPHCRClinicalInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisCaseObservation createSilicosisCaseObservation() {
		SilicosisCaseObservationImpl silicosisCaseObservation = new SilicosisCaseObservationImpl();
		return silicosisCaseObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisSignsAndSymptomsObservation createSilicosisSignsAndSymptomsObservation() {
		SilicosisSignsAndSymptomsObservationImpl silicosisSignsAndSymptomsObservation = new SilicosisSignsAndSymptomsObservationImpl();
		return silicosisSignsAndSymptomsObservation;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SilicosisHistoryOfTuberculosisObservation createSilicosisHistoryOfTuberculosisObservation()
  {
		SilicosisHistoryOfTuberculosisObservationImpl silicosisHistoryOfTuberculosisObservation = new SilicosisHistoryOfTuberculosisObservationImpl();
		return silicosisHistoryOfTuberculosisObservation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SilicosisPHCRRelevantDxTestsSection createSilicosisPHCRRelevantDxTestsSection()
  {
		SilicosisPHCRRelevantDxTestsSectionImpl silicosisPHCRRelevantDxTestsSection = new SilicosisPHCRRelevantDxTestsSectionImpl();
		return silicosisPHCRRelevantDxTestsSection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SilicosisImagingObservation createSilicosisImagingObservation()
  {
		SilicosisImagingObservationImpl silicosisImagingObservation = new SilicosisImagingObservationImpl();
		return silicosisImagingObservation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisPossibleExposureLocationAndTypeAct createSilicosisPossibleExposureLocationAndTypeAct() {
		SilicosisPossibleExposureLocationAndTypeActImpl silicosisPossibleExposureLocationAndTypeAct = new SilicosisPossibleExposureLocationAndTypeActImpl();
		return silicosisPossibleExposureLocationAndTypeAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilicosisPackage getSilicosisPackage() {
		return (SilicosisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SilicosisPackage getPackage() {
		return SilicosisPackage.eINSTANCE;
	}

} //SilicosisFactoryImpl
