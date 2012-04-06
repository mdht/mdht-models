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
package org.openhealthtools.mdht.uml.cda.phcr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage
 * @generated
 */
public interface PhcrFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  PhcrFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Public Health Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Health Case Report</em>'.
	 * @generated
	 */
	PublicHealthCaseReport createPublicHealthCaseReport();

		/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	PhcrSocialHistorySection createPhcrSocialHistorySection();

		/**
	 * Returns a new object of class '<em>Geotemporal History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geotemporal History Observation</em>'.
	 * @generated
	 */
	GeotemporalHistoryObservation createGeotemporalHistoryObservation();

		/**
	 * Returns a new object of class '<em>Most Recent Time Arrived In USA Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Most Recent Time Arrived In USA Observation</em>'.
	 * @generated
	 */
	MostRecentTimeArrivedInUSAObservation createMostRecentTimeArrivedInUSAObservation();

		/**
	 * Returns a new object of class '<em>Race Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Race Observation</em>'.
	 * @generated
	 */
	RaceObservation createRaceObservation();

		/**
	 * Returns a new object of class '<em>Occupation Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occupation Observation</em>'.
	 * @generated
	 */
	OccupationObservation createOccupationObservation();

		/**
	 * Returns a new object of class '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy Observation</em>'.
	 * @generated
	 */
	PregnancyObservation createPregnancyObservation();

		/**
	 * Returns a new object of class '<em>Estimated Date Of Delivery Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estimated Date Of Delivery Observation</em>'.
	 * @generated
	 */
	EstimatedDateOfDeliveryObservation createEstimatedDateOfDeliveryObservation();

		/**
	 * Returns a new object of class '<em>Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Information Section</em>'.
	 * @generated
	 */
	PhcrClinicalInformationSection createPhcrClinicalInformationSection();

		/**
	 * Returns a new object of class '<em>Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Treatment Information Section</em>'.
	 * @generated
	 */
	PhcrTreatmentInformationSection createPhcrTreatmentInformationSection();

		/**
	 * Returns a new object of class '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Therapeutic Regimen Act</em>'.
	 * @generated
	 */
	TherapeuticRegimenAct createTherapeuticRegimenAct();

		/**
	 * Returns a new object of class '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section</em>'.
	 * @generated
	 */
	PhcrEncountersSection createPhcrEncountersSection();

		/**
	 * Returns a new object of class '<em>Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relevant Dx Tests Section</em>'.
	 * @generated
	 */
	PhcrRelevantDxTestsSection createPhcrRelevantDxTestsSection();

		/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	ResultOrganizer createResultOrganizer();

		/**
	 * Returns a new object of class '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation</em>'.
	 * @generated
	 */
	ResultObservation createResultObservation();

		/**
	 * Returns a new object of class '<em>Specimen Collection Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Collection Procedure</em>'.
	 * @generated
	 */
	SpecimenCollectionProcedure createSpecimenCollectionProcedure();

		/**
	 * Returns a new object of class '<em>Imaging Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Observation</em>'.
	 * @generated
	 */
	ImagingObservation createImagingObservation();

		/**
	 * Returns a new object of class '<em>Patient Condition Alive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Condition Alive Observation</em>'.
	 * @generated
	 */
	PatientConditionAliveObservation createPatientConditionAliveObservation();

		/**
	 * Returns a new object of class '<em>Patient Condition Deceased Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Condition Deceased Observation</em>'.
	 * @generated
	 */
	PatientConditionDeceasedObservation createPatientConditionDeceasedObservation();

		/**
	 * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
	 * @generated
	 */
	SignsAndSymptomsObservation createSignsAndSymptomsObservation();

		/**
	 * Returns a new object of class '<em>Susceptibility Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Susceptibility Result</em>'.
	 * @generated
	 */
	SusceptibilityResult createSusceptibilityResult();

		/**
	 * Returns a new object of class '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Treatment Given Substance Administration</em>'.
	 * @generated
	 */
	TreatmentGivenSubstanceAdministration createTreatmentGivenSubstanceAdministration();

		/**
	 * Returns a new object of class '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Treatment Not Given Substance Administration</em>'.
	 * @generated
	 */
	TreatmentNotGivenSubstanceAdministration createTreatmentNotGivenSubstanceAdministration();

		/**
	 * Returns a new object of class '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Observation</em>'.
	 * @generated
	 */
	CaseObservation createCaseObservation();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  PhcrPackage getPhcrPackage();

} //PhcrFactory
