/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consoltoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage
 * @generated
 */
public interface ConsoltocFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ConsoltocFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Summary</em>'.
	 * @generated
	 */
  DischargeSummary createDischargeSummary();

  /**
	 * Returns a new object of class '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consultation Request</em>'.
	 * @generated
	 */
  ConsultationRequest createConsultationRequest();

  /**
	 * Returns a new object of class '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consultation Summary</em>'.
	 * @generated
	 */
  ConsultationSummary createConsultationSummary();

  /**
	 * Returns a new object of class '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Instructions</em>'.
	 * @generated
	 */
  DischargeInstructions createDischargeInstructions();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ConsoltocPackage getConsoltocPackage();

} //ConsoltocFactory
