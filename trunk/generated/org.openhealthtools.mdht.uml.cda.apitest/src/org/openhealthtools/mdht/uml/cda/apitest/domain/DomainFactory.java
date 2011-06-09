/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IStatus Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IStatus Observation</em>'.
	 * @generated
	 */
	IStatusObservation createIStatusObservation();

	/**
	 * Returns a new object of class '<em>ICondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICondition</em>'.
	 * @generated
	 */
	ICondition createICondition();

	/**
	 * Returns a new object of class '<em>IEpisode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEpisode Observation</em>'.
	 * @generated
	 */
	IEpisodeObservation createIEpisodeObservation();

	/**
	 * Returns a new object of class '<em>IProblem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProblem Entry</em>'.
	 * @generated
	 */
	IProblemEntry createIProblemEntry();

	/**
	 * Returns a new object of class '<em>IAge Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IAge Observation</em>'.
	 * @generated
	 */
	IAgeObservation createIAgeObservation();

	/**
	 * Returns a new object of class '<em>ISeverity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISeverity</em>'.
	 * @generated
	 */
	ISeverity createISeverity();

	/**
	 * Returns a new object of class '<em>IProblem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProblem Status Observation</em>'.
	 * @generated
	 */
	IProblemStatusObservation createIProblemStatusObservation();

	/**
	 * Returns a new object of class '<em>IHealth Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IHealth Status Observation</em>'.
	 * @generated
	 */
	IHealthStatusObservation createIHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>IComment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IComment</em>'.
	 * @generated
	 */
	IComment createIComment();

	/**
	 * Returns a new object of class '<em>ICause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICause Of Death Observation</em>'.
	 * @generated
	 */
	ICauseOfDeathObservation createICauseOfDeathObservation();

	/**
	 * Returns a new object of class '<em>IFamily History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFamily History Observation</em>'.
	 * @generated
	 */
	IFamilyHistoryObservation createIFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>ITreating Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ITreating Provider</em>'.
	 * @generated
	 */
	ITreatingProvider createITreatingProvider();

	/**
	 * Returns a new object of class '<em>IProblem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProblem List Section</em>'.
	 * @generated
	 */
	IProblemListSection createIProblemListSection();

	/**
	 * Returns a new object of class '<em>IPatient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPatient Summary</em>'.
	 * @generated
	 */
	IPatientSummary createIPatientSummary();

	/**
	 * Returns a new object of class '<em>IGeneral Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IGeneral Header Constraints</em>'.
	 * @generated
	 */
	IGeneralHeaderConstraints createIGeneralHeaderConstraints();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainPackage getDomainPackage();

} // DomainFactory
