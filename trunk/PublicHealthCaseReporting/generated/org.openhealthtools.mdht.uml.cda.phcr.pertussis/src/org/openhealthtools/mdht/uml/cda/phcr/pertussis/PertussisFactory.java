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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage
 * @generated
 */
public interface PertussisFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PertussisFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Report</em>'.
   * @generated
   */
  PertussisCaseReport createPertussisCaseReport();

  /**
   * Returns a new object of class '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Social History Section</em>'.
   * @generated
   */
  PertussisSocialHistorySection createPertussisSocialHistorySection();

  /**
   * Returns a new object of class '<em>Possible Exposure Location Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Possible Exposure Location Act</em>'.
   * @generated
   */
	PertussisPossibleExposureLocationAct createPertussisPossibleExposureLocationAct();

		/**
   * Returns a new object of class '<em>Possible Case Contact Location Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Possible Case Contact Location Act</em>'.
   * @generated
   */
	PertussisPossibleCaseContactLocationAct createPertussisPossibleCaseContactLocationAct();

		/**
   * Returns a new object of class '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Clinical Information Section</em>'.
   * @generated
   */
	PertussisClinicalInformationSection createPertussisClinicalInformationSection();

		/**
   * Returns a new object of class '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Information Section</em>'.
   * @generated
   */
	PertussisTreatmentInformationSection createPertussisTreatmentInformationSection();

		/**
   * Returns a new object of class '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Therapeutic Regimen Act</em>'.
   * @generated
   */
	PertussisTherapeuticRegimenAct createPertussisTherapeuticRegimenAct();

		/**
   * Returns a new object of class '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Given Substance Administration</em>'.
   * @generated
   */
	PertussisTreatmentGivenSubstanceAdministration createPertussisTreatmentGivenSubstanceAdministration();

		/**
   * Returns a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * @generated
   */
	PertussisTreatmentNotGivenSubstanceAdministration createPertussisTreatmentNotGivenSubstanceAdministration();

		/**
   * Returns a new object of class '<em>Immunizations Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Immunizations Section</em>'.
   * @generated
   */
	PertussisImmunizationsSection createPertussisImmunizationsSection();

		/**
   * Returns a new object of class '<em>Immunization Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Immunization Activity</em>'.
   * @generated
   */
	PertussisImmunizationActivity createPertussisImmunizationActivity();

		/**
   * Returns a new object of class '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Observation</em>'.
   * @generated
   */
	PertussisCaseObservation createPertussisCaseObservation();

		/**
   * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
   * @generated
   */
	PertussisSignsAndSymptomsObservation createPertussisSignsAndSymptomsObservation();

		/**
   * Returns a new object of class '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Observation</em>'.
   * @generated
   */
	PertussisResultObservation createPertussisResultObservation();

		/**
   * Returns a new object of class '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Relevant Dx Tests Section</em>'.
   * @generated
   */
	PertussisRelevantDxTestsSection createPertussisRelevantDxTestsSection();

		/**
   * Returns a new object of class '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Organizer</em>'.
   * @generated
   */
	PertussisResultOrganizer createPertussisResultOrganizer();

		/**
   * Returns a new object of class '<em>Immunization Product</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Immunization Product</em>'.
   * @generated
   */
	PertussisImmunizationProduct createPertussisImmunizationProduct();

		/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PertussisPackage getPertussisPackage();

} //PertussisFactory
