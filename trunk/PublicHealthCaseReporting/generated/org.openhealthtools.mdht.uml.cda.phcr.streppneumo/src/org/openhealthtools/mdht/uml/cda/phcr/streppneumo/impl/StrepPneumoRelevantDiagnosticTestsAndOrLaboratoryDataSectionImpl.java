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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl extends PhcrRelevantDxTestsSectionImpl implements StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StrepPneumoResultObservation> getStrepPneumoResultObservations() {
    return StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.getStrepPneumoResultObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<StrepPneumoResultOrganizer> getStrepPneumoResultOrganizers() {
    return StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.getStrepPneumoResultOrganizers(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl
