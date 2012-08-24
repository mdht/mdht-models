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
package org.openhealthtools.mdht.uml.cda.phcr.tss;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage
 * @generated
 */
public interface tssFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	tssFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.tss.impl.tssFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Toxic Shock Syndrome Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Toxic Shock Syndrome Case Report</em>'.
   * @generated
   */
	ToxicShockSyndromeCaseReport createToxicShockSyndromeCaseReport();

	/**
   * Returns a new object of class '<em>Tss Phcr Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tss Phcr Clinical Information Section</em>'.
   * @generated
   */
	TssPhcrClinicalInformationSection createTssPhcrClinicalInformationSection();

	/**
   * Returns a new object of class '<em>Tss Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tss Case Observation</em>'.
   * @generated
   */
	TssCaseObservation createTssCaseObservation();

	/**
   * Returns a new object of class '<em>Tss Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tss Signs And Symptoms Observation</em>'.
   * @generated
   */
	TssSignsAndSymptomsObservation createTssSignsAndSymptomsObservation();

	/**
   * Returns a new object of class '<em>Tss Phcr Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tss Phcr Relevant Dx Tests Section</em>'.
   * @generated
   */
	TssPhcrRelevantDxTestsSection createTssPhcrRelevantDxTestsSection();

	/**
   * Returns a new object of class '<em>Tss Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tss Result Organizer</em>'.
   * @generated
   */
	TssResultOrganizer createTssResultOrganizer();

	/**
   * Returns a new object of class '<em>Tss Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tss Result Observation</em>'.
   * @generated
   */
	TssResultObservation createTssResultObservation();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	tssPackage gettssPackage();

} //tssFactory
