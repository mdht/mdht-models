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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage
 * @generated
 */
public interface ChlamydiatrachomatisFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	ChlamydiatrachomatisFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Public Health Case Report</em>'.
   * @generated
   */
	ChlamydiatrachomatisPublicHealthCaseReport createChlamydiatrachomatisPublicHealthCaseReport();

	/**
   * Returns a new object of class '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Clinical Information Section</em>'.
   * @generated
   */
	ChlamydiatrachomatisPHCRClinicalInformationSection createChlamydiatrachomatisPHCRClinicalInformationSection();

	/**
   * Returns a new object of class '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Observation</em>'.
   * @generated
   */
	ChlamydiatrachomatisCaseObservation createChlamydiatrachomatisCaseObservation();

	/**
   * Returns a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * @generated
   */
	ChlamydiatrachomatisPHCRRelevantDxTestsSection createChlamydiatrachomatisPHCRRelevantDxTestsSection();

	/**
   * Returns a new object of class '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Observation</em>'.
   * @generated
   */
	ChlamydiatrachomatisResultObservation createChlamydiatrachomatisResultObservation();

	/**
   * Returns a new object of class '<em>chlamydiatrachomatis Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>chlamydiatrachomatis Result Organizer</em>'.
   * @generated
   */
	chlamydiatrachomatisResultOrganizer createchlamydiatrachomatisResultOrganizer();

	/**
   * Returns a new object of class '<em>PHCR Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Treatment Information Section</em>'.
   * @generated
   */
	ChlamydiatrachomatisPHCRTreatmentInformationSection createChlamydiatrachomatisPHCRTreatmentInformationSection();

	/**
   * Returns a new object of class '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Therapeutic Regimen Act</em>'.
   * @generated
   */
	ChlamydiatrachomatisTherapeuticRegimenAct createChlamydiatrachomatisTherapeuticRegimenAct();

	/**
   * Returns a new object of class '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Given Substance Administration</em>'.
   * @generated
   */
	ChlamydiatrachomatisTreatmentGivenSubstanceAdministration createChlamydiatrachomatisTreatmentGivenSubstanceAdministration();

	/**
   * Returns a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Treatment Not Given Substance Administration</em>'.
   * @generated
   */
	ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration createChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	ChlamydiatrachomatisPackage getChlamydiatrachomatisPackage();

} //ChlamydiatrachomatisFactory
