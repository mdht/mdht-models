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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage
 * @generated
 */
public interface AnthraxFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	AnthraxFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl.AnthraxFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Report</em>'.
   * @generated
   */
	AnthraxCaseReport createAnthraxCaseReport();

	/**
   * Returns a new object of class '<em>Phcr Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Phcr Clinical Information Section</em>'.
   * @generated
   */
	AnthraxPhcrClinicalInformationSection createAnthraxPhcrClinicalInformationSection();

	/**
   * Returns a new object of class '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Observation</em>'.
   * @generated
   */
	AnthraxCaseObservation createAnthraxCaseObservation();

	/**
   * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
   * @generated
   */
	AnthraxSignsAndSymptomsObservation createAnthraxSignsAndSymptomsObservation();

	/**
   * Returns a new object of class '<em>Phcr Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Phcr Relevant Dx Tests Section</em>'.
   * @generated
   */
	AnthraxPhcrRelevantDxTestsSection createAnthraxPhcrRelevantDxTestsSection();

	/**
   * Returns a new object of class '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Observation</em>'.
   * @generated
   */
	AnthraxResultObservation createAnthraxResultObservation();

	/**
   * Returns a new object of class '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Organizer</em>'.
   * @generated
   */
	AnthraxResultOrganizer createAnthraxResultOrganizer();

	/**
   * Returns a new object of class '<em>Phcr Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Phcr Social History Section</em>'.
   * @generated
   */
	AnthraxPhcrSocialHistorySection createAnthraxPhcrSocialHistorySection();

	/**
   * Returns a new object of class '<em>Possible Expossure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Possible Expossure Location And Type Act</em>'.
   * @generated
   */
	AnthraxPossibleExpossureLocationAndTypeAct createAnthraxPossibleExpossureLocationAndTypeAct();

	/**
   * Returns a new object of class '<em>Phcr Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Phcr Treatment Information Section</em>'.
   * @generated
   */
	AnthraxPhcrTreatmentInformationSection createAnthraxPhcrTreatmentInformationSection();

	/**
   * Returns a new object of class '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Therapeutic Regimen Act</em>'.
   * @generated
   */
	AnthraxTherapeuticRegimenAct createAnthraxTherapeuticRegimenAct();

	/**
   * Returns a new object of class '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Given Substance Administration</em>'.
   * @generated
   */
	AnthraxTreatmentGivenSubstanceAdministration createAnthraxTreatmentGivenSubstanceAdministration();

	/**
   * Returns a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * @generated
   */
	AnthraxTreatmentNotGivenSubstanceAdministration createAnthraxTreatmentNotGivenSubstanceAdministration();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	AnthraxPackage getAnthraxPackage();

} //AnthraxFactory
