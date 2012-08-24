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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage
 * @generated
 */
public interface SilicosisFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	SilicosisFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.silicosis.impl.SilicosisFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Report</em>'.
   * @generated
   */
	SilicosisCaseReport createSilicosisCaseReport();

	/**
   * Returns a new object of class '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Social History Section</em>'.
   * @generated
   */
	SilicosisPHCRSocialHistorySection createSilicosisPHCRSocialHistorySection();

	/**
   * Returns a new object of class '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * @generated
   */
	SilicosisSocioBehavioralBooleanRiskFactorObservation createSilicosisSocioBehavioralBooleanRiskFactorObservation();

	/**
   * Returns a new object of class '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Clinical Information Section</em>'.
   * @generated
   */
	SilicosisPHCRClinicalInformationSection createSilicosisPHCRClinicalInformationSection();

	/**
   * Returns a new object of class '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Observation</em>'.
   * @generated
   */
	SilicosisCaseObservation createSilicosisCaseObservation();

	/**
   * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
   * @generated
   */
	SilicosisSignsAndSymptomsObservation createSilicosisSignsAndSymptomsObservation();

	/**
   * Returns a new object of class '<em>History Of Tuberculosis Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>History Of Tuberculosis Observation</em>'.
   * @generated
   */
  SilicosisHistoryOfTuberculosisObservation createSilicosisHistoryOfTuberculosisObservation();

  /**
   * Returns a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * @generated
   */
  SilicosisPHCRRelevantDxTestsSection createSilicosisPHCRRelevantDxTestsSection();

  /**
   * Returns a new object of class '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imaging Observation</em>'.
   * @generated
   */
  SilicosisImagingObservation createSilicosisImagingObservation();

  /**
   * Returns a new object of class '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Possible Exposure Location And Type Act</em>'.
   * @generated
   */
	SilicosisPossibleExposureLocationAndTypeAct createSilicosisPossibleExposureLocationAndTypeAct();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	SilicosisPackage getSilicosisPackage();

} //SilicosisFactory
