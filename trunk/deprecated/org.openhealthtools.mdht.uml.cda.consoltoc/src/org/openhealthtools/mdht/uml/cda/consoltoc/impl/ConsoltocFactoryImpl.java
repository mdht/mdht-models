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
package org.openhealthtools.mdht.uml.cda.consoltoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.consoltoc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsoltocFactoryImpl extends EFactoryImpl implements ConsoltocFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ConsoltocFactory init()
  {
		try {
			ConsoltocFactory theConsoltocFactory = (ConsoltocFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/consoltoc"); 
			if (theConsoltocFactory != null) {
				return theConsoltocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConsoltocFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConsoltocFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ConsoltocPackage.DISCHARGE_SUMMARY: return createDischargeSummary();
			case ConsoltocPackage.CONSULTATION_REQUEST: return createConsultationRequest();
			case ConsoltocPackage.CONSULTATION_SUMMARY: return createConsultationSummary();
			case ConsoltocPackage.DISCHARGE_INSTRUCTIONS: return createDischargeInstructions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DischargeSummary createDischargeSummary()
  {
		DischargeSummaryImpl dischargeSummary = new DischargeSummaryImpl();
		return dischargeSummary;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConsultationRequest createConsultationRequest()
  {
		ConsultationRequestImpl consultationRequest = new ConsultationRequestImpl();
		return consultationRequest;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConsultationSummary createConsultationSummary()
  {
		ConsultationSummaryImpl consultationSummary = new ConsultationSummaryImpl();
		return consultationSummary;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DischargeInstructions createDischargeInstructions()
  {
		DischargeInstructionsImpl dischargeInstructions = new DischargeInstructionsImpl();
		return dischargeInstructions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConsoltocPackage getConsoltocPackage()
  {
		return (ConsoltocPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ConsoltocPackage getPackage()
  {
		return ConsoltocPackage.eINSTANCE;
	}

} //ConsoltocFactoryImpl
