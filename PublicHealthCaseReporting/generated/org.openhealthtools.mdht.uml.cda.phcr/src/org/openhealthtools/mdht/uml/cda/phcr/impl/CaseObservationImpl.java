/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.CaseObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CaseObservationImpl extends ProblemObservationImpl implements CaseObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CaseObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PhcrPackage.Literals.CASE_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationEffectiveTimeLow(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationAuthor(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationAuthorAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationAuthorAssignedAuthor(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationEffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationProblemStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationProblemStatusObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationSignsAndSymptomsObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProblemStatusObservation getProblemStatusObservation() {
    return CaseObservationOperations.getProblemStatusObservation(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaseObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CaseObservationOperations.validateCaseObservationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaseObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CaseObservationOperations.validateCaseObservationStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateCaseObservationStatusCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SignsAndSymptomsObservation> getSignsAndSymptomsObservations() {
    return CaseObservationOperations.getSignsAndSymptomsObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CaseObservation init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CaseObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
	
} //CaseObservationImpl
