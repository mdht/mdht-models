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
package org.openhealthtools.mdht.uml.cda.apitest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.apitest.APITestPackage
 * @generated
 */
public interface APITestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	APITestFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.apitest.impl.APITestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Observation</em>'.
	 * @generated
	 */
	StatusObservation createStatusObservation();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Condition Treating Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Treating Provider</em>'.
	 * @generated
	 */
	Condition_TreatingProvider createCondition_TreatingProvider();

	/**
	 * Returns a new object of class '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Observation</em>'.
	 * @generated
	 */
	EpisodeObservation createEpisodeObservation();

	/**
	 * Returns a new object of class '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Entry</em>'.
	 * @generated
	 */
	ConditionEntry createConditionEntry();

	/**
	 * Returns a new object of class '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Observation</em>'.
	 * @generated
	 */
	AgeObservation createAgeObservation();

	/**
	 * Returns a new object of class '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity</em>'.
	 * @generated
	 */
	Severity createSeverity();

	/**
	 * Returns a new object of class '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status Observation</em>'.
	 * @generated
	 */
	ProblemStatusObservation createProblemStatusObservation();

	/**
	 * Returns a new object of class '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation</em>'.
	 * @generated
	 */
	HealthStatusObservation createHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cause Of Death Observation</em>'.
	 * @generated
	 */
	CauseOfDeathObservation createCauseOfDeathObservation();

	/**
	 * Returns a new object of class '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation</em>'.
	 * @generated
	 */
	FamilyHistoryObservation createFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem List Section</em>'.
	 * @generated
	 */
	ProblemListSection createProblemListSection();

	/**
	 * Returns a new object of class '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Summary</em>'.
	 * @generated
	 */
	PatientSummary createPatientSummary();

	/**
	 * Returns a new object of class '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	APITestPackage getAPITestPackage();

} // APITestFactory
