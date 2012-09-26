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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PertussisFactoryImpl extends EFactoryImpl implements PertussisFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static PertussisFactory init()
  {
		try {
			PertussisFactory thePertussisFactory = (PertussisFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/pertussis"); 
			if (thePertussisFactory != null) {
				return thePertussisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PertussisFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PertussisFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case PertussisPackage.PERTUSSIS_CASE_REPORT: return createPertussisCaseReport();
			case PertussisPackage.PERTUSSIS_SOCIAL_HISTORY_SECTION: return createPertussisSocialHistorySection();
			case PertussisPackage.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT: return createPertussisPossibleExposureLocationAct();
			case PertussisPackage.PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT: return createPertussisPossibleCaseContactLocationAct();
			case PertussisPackage.PERTUSSIS_CLINICAL_INFORMATION_SECTION: return createPertussisClinicalInformationSection();
			case PertussisPackage.PERTUSSIS_CASE_OBSERVATION: return createPertussisCaseObservation();
			case PertussisPackage.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION: return createPertussisSignsAndSymptomsObservation();
			case PertussisPackage.PERTUSSIS_TREATMENT_INFORMATION_SECTION: return createPertussisTreatmentInformationSection();
			case PertussisPackage.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT: return createPertussisTherapeuticRegimenAct();
			case PertussisPackage.PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createPertussisTreatmentGivenSubstanceAdministration();
			case PertussisPackage.PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createPertussisTreatmentNotGivenSubstanceAdministration();
			case PertussisPackage.PERTUSSIS_RELEVANT_DX_TESTS_SECTION: return createPertussisRelevantDxTestsSection();
			case PertussisPackage.PERTUSSIS_RESULT_OBSERVATION: return createPertussisResultObservation();
			case PertussisPackage.PERTUSSIS_RESULT_ORGANIZER: return createPertussisResultOrganizer();
			case PertussisPackage.PERTUSSIS_IMMUNIZATIONS_SECTION: return createPertussisImmunizationsSection();
			case PertussisPackage.PERTUSSIS_IMMUNIZATION_ACTIVITY: return createPertussisImmunizationActivity();
			case PertussisPackage.PERTUSSIS_IMMUNIZATION_PRODUCT: return createPertussisImmunizationProduct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PertussisCaseReport createPertussisCaseReport()
  {
		PertussisCaseReportImpl pertussisCaseReport = new PertussisCaseReportImpl();
		return pertussisCaseReport;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PertussisSocialHistorySection createPertussisSocialHistorySection()
  {
		PertussisSocialHistorySectionImpl pertussisSocialHistorySection = new PertussisSocialHistorySectionImpl();
		return pertussisSocialHistorySection;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisPossibleExposureLocationAct createPertussisPossibleExposureLocationAct() {
		PertussisPossibleExposureLocationActImpl pertussisPossibleExposureLocationAct = new PertussisPossibleExposureLocationActImpl();
		return pertussisPossibleExposureLocationAct;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisPossibleCaseContactLocationAct createPertussisPossibleCaseContactLocationAct() {
		PertussisPossibleCaseContactLocationActImpl pertussisPossibleCaseContactLocationAct = new PertussisPossibleCaseContactLocationActImpl();
		return pertussisPossibleCaseContactLocationAct;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisClinicalInformationSection createPertussisClinicalInformationSection() {
		PertussisClinicalInformationSectionImpl pertussisClinicalInformationSection = new PertussisClinicalInformationSectionImpl();
		return pertussisClinicalInformationSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisTreatmentInformationSection createPertussisTreatmentInformationSection() {
		PertussisTreatmentInformationSectionImpl pertussisTreatmentInformationSection = new PertussisTreatmentInformationSectionImpl();
		return pertussisTreatmentInformationSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisTherapeuticRegimenAct createPertussisTherapeuticRegimenAct() {
		PertussisTherapeuticRegimenActImpl pertussisTherapeuticRegimenAct = new PertussisTherapeuticRegimenActImpl();
		return pertussisTherapeuticRegimenAct;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisTreatmentGivenSubstanceAdministration createPertussisTreatmentGivenSubstanceAdministration() {
		PertussisTreatmentGivenSubstanceAdministrationImpl pertussisTreatmentGivenSubstanceAdministration = new PertussisTreatmentGivenSubstanceAdministrationImpl();
		return pertussisTreatmentGivenSubstanceAdministration;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisTreatmentNotGivenSubstanceAdministration createPertussisTreatmentNotGivenSubstanceAdministration() {
		PertussisTreatmentNotGivenSubstanceAdministrationImpl pertussisTreatmentNotGivenSubstanceAdministration = new PertussisTreatmentNotGivenSubstanceAdministrationImpl();
		return pertussisTreatmentNotGivenSubstanceAdministration;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisImmunizationsSection createPertussisImmunizationsSection() {
		PertussisImmunizationsSectionImpl pertussisImmunizationsSection = new PertussisImmunizationsSectionImpl();
		return pertussisImmunizationsSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisImmunizationActivity createPertussisImmunizationActivity() {
		PertussisImmunizationActivityImpl pertussisImmunizationActivity = new PertussisImmunizationActivityImpl();
		return pertussisImmunizationActivity;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisCaseObservation createPertussisCaseObservation() {
		PertussisCaseObservationImpl pertussisCaseObservation = new PertussisCaseObservationImpl();
		return pertussisCaseObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisSignsAndSymptomsObservation createPertussisSignsAndSymptomsObservation() {
		PertussisSignsAndSymptomsObservationImpl pertussisSignsAndSymptomsObservation = new PertussisSignsAndSymptomsObservationImpl();
		return pertussisSignsAndSymptomsObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisResultObservation createPertussisResultObservation() {
		PertussisResultObservationImpl pertussisResultObservation = new PertussisResultObservationImpl();
		return pertussisResultObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisRelevantDxTestsSection createPertussisRelevantDxTestsSection() {
		PertussisRelevantDxTestsSectionImpl pertussisRelevantDxTestsSection = new PertussisRelevantDxTestsSectionImpl();
		return pertussisRelevantDxTestsSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisResultOrganizer createPertussisResultOrganizer() {
		PertussisResultOrganizerImpl pertussisResultOrganizer = new PertussisResultOrganizerImpl();
		return pertussisResultOrganizer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisImmunizationProduct createPertussisImmunizationProduct() {
		PertussisImmunizationProductImpl pertussisImmunizationProduct = new PertussisImmunizationProductImpl();
		return pertussisImmunizationProduct;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PertussisPackage getPertussisPackage()
  {
		return (PertussisPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static PertussisPackage getPackage()
  {
		return PertussisPackage.eINSTANCE;
	}

} //PertussisFactoryImpl
