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
package org.openhealthtools.mdht.uml.cda.phcr.wnv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage
 * @generated
 */
public interface WnvFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  WnvFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.wnv.impl.WnvFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>West Nile Virus Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>West Nile Virus Case Report</em>'.
	 * @generated
	 */
  WestNileVirusCaseReport createWestNileVirusCaseReport();

  /**
	 * Returns a new object of class '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phcr Clinical Information Section</em>'.
	 * @generated
	 */
  WnvPhcrClinicalInformationSection createWnvPhcrClinicalInformationSection();

  /**
	 * Returns a new object of class '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Observation</em>'.
	 * @generated
	 */
  WnvCaseObservation createWnvCaseObservation();

  /**
	 * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
	 * @generated
	 */
  WnvSignsAndSymptomsObservation createWnvSignsAndSymptomsObservation();

  /**
	 * Returns a new object of class '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phcr Relevant Dx Tests Section</em>'.
	 * @generated
	 */
  WnvPhcrRelevantDxTestsSection createWnvPhcrRelevantDxTestsSection();

  /**
	 * Returns a new object of class '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation</em>'.
	 * @generated
	 */
	WnvResultObservation createWnvResultObservation();

		/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	WnvResultOrganizer createWnvResultOrganizer();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  WnvPackage getWnvPackage();

} //WnvFactory
