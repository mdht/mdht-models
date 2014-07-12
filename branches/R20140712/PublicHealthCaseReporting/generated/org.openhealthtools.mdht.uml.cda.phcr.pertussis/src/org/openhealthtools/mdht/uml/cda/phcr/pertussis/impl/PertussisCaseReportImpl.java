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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PertussisCaseReportImpl extends PublicHealthCaseReportImpl implements PertussisCaseReport
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PertussisCaseReportImpl()
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
		return PertussisPackage.Literals.PERTUSSIS_CASE_REPORT;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseReportOperations.validatePertussisCaseReportTitle(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReportPertussisSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseReportOperations.validatePertussisCaseReportPertussisSocialHistorySection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReportPertussisClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseReportOperations.validatePertussisCaseReportPertussisClinicalInformationSection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReportPertussisTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseReportOperations.validatePertussisCaseReportPertussisTreatmentInformationSection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReportPertussisRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseReportOperations.validatePertussisCaseReportPertussisRelevantDxTestsSection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReportPertussisImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseReportOperations.validatePertussisCaseReportPertussisImmunizationsSection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PertussisSocialHistorySection getPertussisSocialHistorySection()
  {
		return PertussisCaseReportOperations.getPertussisSocialHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisClinicalInformationSection getPertussisClinicalInformationSection() {
		return PertussisCaseReportOperations.getPertussisClinicalInformationSection(this);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisTreatmentInformationSection getPertussisTreatmentInformationSection() {
		return PertussisCaseReportOperations.getPertussisTreatmentInformationSection(this);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisRelevantDxTestsSection getPertussisRelevantDxTestsSection() {
		return PertussisCaseReportOperations.getPertussisRelevantDxTestsSection(this);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisImmunizationsSection getPertussisImmunizationsSection() {
		return PertussisCaseReportOperations.getPertussisImmunizationsSection(this);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return PertussisCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public PertussisCaseReport init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PertussisCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PertussisCaseReportImpl
