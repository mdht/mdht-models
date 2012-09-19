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
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage
 * @generated
 */
public interface MeningococcalFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MeningococcalFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.meningococcal.impl.MeningococcalFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Report</em>'.
	 * @generated
	 */
  MeningococcalCaseReport createMeningococcalCaseReport();

  /**
	 * Returns a new object of class '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phcr Clinical Information Section</em>'.
	 * @generated
	 */
	MeningococcalPhcrClinicalInformationSection createMeningococcalPhcrClinicalInformationSection();

		/**
	 * Returns a new object of class '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Observation</em>'.
	 * @generated
	 */
	MeningococcalCaseObservation createMeningococcalCaseObservation();

		/**
	 * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
	 * @generated
	 */
	MeningococcalSignsAndSymptomsObservation createMeningococcalSignsAndSymptomsObservation();

		/**
	 * Returns a new object of class '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phcr Relevant Dx Tests Section</em>'.
	 * @generated
	 */
	MeningococcalPhcrRelevantDxTestsSection createMeningococcalPhcrRelevantDxTestsSection();

		/**
	 * Returns a new object of class '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation</em>'.
	 * @generated
	 */
	MeningococcalResultObservation createMeningococcalResultObservation();

		/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	MeningococcalResultOrganizer createMeningococcalResultOrganizer();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  MeningococcalPackage getMeningococcalPackage();

} //MeningococcalFactory
