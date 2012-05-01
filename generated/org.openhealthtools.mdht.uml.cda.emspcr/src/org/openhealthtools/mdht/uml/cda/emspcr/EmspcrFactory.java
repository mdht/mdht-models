/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public interface EmspcrFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmspcrFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patient Care Report</em>'.
   * @generated
   */
  PatientCareReport createPatientCareReport();

  /**
   * Returns a new object of class '<em>EMS Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Billing</em>'.
   * @generated
   */
  EMSBilling createEMSBilling();

  /**
   * Returns a new object of class '<em>EMS Injury Incident Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Injury Incident Description</em>'.
   * @generated
   */
  EMSInjuryIncidentDescription createEMSInjuryIncidentDescription();

  /**
   * Returns a new object of class '<em>EMS Cardiac Arrest Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Cardiac Arrest Event</em>'.
   * @generated
   */
  EMSCardiacArrestEvent createEMSCardiacArrestEvent();

  /**
   * Returns a new object of class '<em>EMS Advance Directives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Advance Directives</em>'.
   * @generated
   */
  EMSAdvanceDirectives createEMSAdvanceDirectives();

  /**
   * Returns a new object of class '<em>EMS Allergies And Adverse Reactions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Allergies And Adverse Reactions</em>'.
   * @generated
   */
  EMSAllergiesAndAdverseReactions createEMSAllergiesAndAdverseReactions();

  /**
   * Returns a new object of class '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Current Medication Section</em>'.
   * @generated
   */
  EMSCurrentMedicationSection createEMSCurrentMedicationSection();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EmspcrPackage getEmspcrPackage();

} //EmspcrFactory
