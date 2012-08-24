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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerImpl extends org.openhealthtools.mdht.uml.cda.ccd.impl.ResultOrganizerImpl implements ResultOrganizer {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResultOrganizerImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PhcrPackage.Literals.RESULT_ORGANIZER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePHCRResultOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ResultOrganizerOperations.validatePHCRResultOrganizerStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerStatusCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerEffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerResultObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHCRResultOrganizerSpecimenCollectionProcedure(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validatePHCRResultOrganizerSpecimenCollectionProcedure(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ResultObservation> getPHCRResultObservations() {
    return ResultOrganizerOperations.getPHCRResultObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpecimenCollectionProcedure getSpecimenCollectionProcedure() {
    return ResultOrganizerOperations.getSpecimenCollectionProcedure(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultOrganizer init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
	
} //ResultOrganizerImpl
