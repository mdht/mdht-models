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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisHistoryOfTuberculosisObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Of Tuberculosis Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SilicosisHistoryOfTuberculosisObservationImpl extends ProblemObservationImpl implements SilicosisHistoryOfTuberculosisObservation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SilicosisHistoryOfTuberculosisObservationImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SilicosisPackage.Literals.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSilicosisHistoryOfTuberculosisObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return SilicosisHistoryOfTuberculosisObservationOperations.validateSilicosisHistoryOfTuberculosisObservationClassCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSilicosisHistoryOfTuberculosisObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return SilicosisHistoryOfTuberculosisObservationOperations.validateSilicosisHistoryOfTuberculosisObservationValue(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return SilicosisHistoryOfTuberculosisObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SilicosisHistoryOfTuberculosisObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //SilicosisHistoryOfTuberculosisObservationImpl
