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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantMedicalConditionHistoryObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisRelevantMedicalConditionHistoryObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relevant Medical Condition History Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisRelevantMedicalConditionHistoryObservationImpl extends PhcrRelevantMedicalConditionHistoryObservationImpl implements TuberculosisRelevantMedicalConditionHistoryObservation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TuberculosisRelevantMedicalConditionHistoryObservationImpl()
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
		return TuberculosisPackage.Literals.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePhcrRelevantMedicalConditionHistoryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationValue(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisRelevantMedicalConditionHistoryObservationOperations.validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisRelevantMedicalConditionProblemObservation getTuberculosisRelevantMedicalConditionProblemObservation()
  {
		return TuberculosisRelevantMedicalConditionHistoryObservationOperations.getTuberculosisRelevantMedicalConditionProblemObservation(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisRelevantMedicalConditionHistoryObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TuberculosisRelevantMedicalConditionHistoryObservationImpl
