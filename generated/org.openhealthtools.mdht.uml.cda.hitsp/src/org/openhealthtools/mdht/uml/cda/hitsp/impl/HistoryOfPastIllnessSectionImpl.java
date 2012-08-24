/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.cdt.operations.PastMedicalHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.HistoryOfPastIllnessSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Of Past Illness Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryOfPastIllnessSectionImpl extends
		org.openhealthtools.mdht.uml.cda.ihe.impl.HistoryOfPastIllnessSectionImpl implements
		HistoryOfPastIllnessSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HistoryOfPastIllnessSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return HITSPPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionHasClinicalStatements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionHasClinicalStatements(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePastMedicalHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHITSPHistoryOfPastIllnessSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryOfPastIllnessSectionOperations.validateHITSPHistoryOfPastIllnessSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHITSPHistoryOfPastIllnessSectionCondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryOfPastIllnessSectionOperations.validateHITSPHistoryOfPastIllnessSectionCondition(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Condition getCondition() {
    return HistoryOfPastIllnessSectionOperations.getCondition(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public HistoryOfPastIllnessSection init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HistoryOfPastIllnessSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HistoryOfPastIllnessSectionImpl
