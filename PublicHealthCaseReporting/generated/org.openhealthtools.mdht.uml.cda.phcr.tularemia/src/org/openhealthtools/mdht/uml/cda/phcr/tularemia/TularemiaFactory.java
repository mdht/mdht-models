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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage
 * @generated
 */
public interface TularemiaFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	TularemiaFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Report</em>'.
   * @generated
   */
	TularemiaCaseReport createTularemiaCaseReport();

	/**
   * Returns a new object of class '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Social History Section</em>'.
   * @generated
   */
	TularemiaPHCRSocialHistorySection createTularemiaPHCRSocialHistorySection();

	/**
   * Returns a new object of class '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Possible Exposure Location And Type Act</em>'.
   * @generated
   */
	TularemiaPossibleExposureLocationAndTypeAct createTularemiaPossibleExposureLocationAndTypeAct();

	/**
   * Returns a new object of class '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Clinical Information Section</em>'.
   * @generated
   */
	TularemiaPHCRClinicalInformationSection createTularemiaPHCRClinicalInformationSection();

	/**
   * Returns a new object of class '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Observation</em>'.
   * @generated
   */
	TularemiaCaseObservation createTularemiaCaseObservation();

	/**
   * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
   * @generated
   */
	TularemiaSignsAndSymptomsObservation createTularemiaSignsAndSymptomsObservation();

	/**
   * Returns a new object of class '<em>Location Of Lesion Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Of Lesion Observation</em>'.
   * @generated
   */
	LocationOfLesionObservation createLocationOfLesionObservation();

	/**
   * Returns a new object of class '<em>PHCR Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Treatment Information Section</em>'.
   * @generated
   */
	TularemiaPHCRTreatmentInformationSection createTularemiaPHCRTreatmentInformationSection();

	/**
   * Returns a new object of class '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Therapeutic Regimen Act</em>'.
   * @generated
   */
	TularemiaTherapeuticRegimenAct createTularemiaTherapeuticRegimenAct();

	/**
   * Returns a new object of class '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Given Substance Administration</em>'.
   * @generated
   */
	TularemiaTreatmentGivenSubstanceAdministration createTularemiaTreatmentGivenSubstanceAdministration();

	/**
   * Returns a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * @generated
   */
	TularemiaTreatmentNotGivenSubstanceAdministration createTularemiaTreatmentNotGivenSubstanceAdministration();

	/**
   * Returns a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * @generated
   */
	TularemiaPHCRRelevantDxTestsSection createTularemiaPHCRRelevantDxTestsSection();

	/**
   * Returns a new object of class '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Organizer</em>'.
   * @generated
   */
	TularemiaResultOrganizer createTularemiaResultOrganizer();

	/**
   * Returns a new object of class '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Observation</em>'.
   * @generated
   */
	TularemiaResultObservation createTularemiaResultObservation();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	TularemiaPackage getTularemiaPackage();

} //TularemiaFactory
