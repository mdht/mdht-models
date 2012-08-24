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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements ChlamydiatrachomatisPHCRRelevantDxTestsSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations.validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations.validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ChlamydiatrachomatisResultObservation> getChlamydiatrachomatisResultObservations() {
    return ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations.getChlamydiatrachomatisResultObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<chlamydiatrachomatisResultOrganizer> getChlamydiatrachomatisResultOrganizers() {
    return ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations.getChlamydiatrachomatisResultOrganizers(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChlamydiatrachomatisPHCRRelevantDxTestsSection init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChlamydiatrachomatisPHCRRelevantDxTestsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl
