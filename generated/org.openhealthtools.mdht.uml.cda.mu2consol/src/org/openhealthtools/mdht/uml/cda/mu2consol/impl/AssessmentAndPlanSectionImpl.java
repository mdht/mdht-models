/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentAndPlanSectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assessment And Plan Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl
		implements AssessmentAndPlanSection {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected AssessmentAndPlanSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public PlanOfCareActivityProcedure getPlanOfCareActivityProcedure() {
    return AssessmentAndPlanSectionOperations.getPlanOfCareActivityProcedure(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration() {
    return AssessmentAndPlanSectionOperations.getPlanOfCareActivitySubstanceAdministration(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public PlanOfCareActivitySupply getPlanOfCareActivitySupply() {
    return AssessmentAndPlanSectionOperations.getPlanOfCareActivitySupply(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ProblemObservation getProblemObservation() {
    return AssessmentAndPlanSectionOperations.getProblemObservation(this);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateAssessmentAndPlanSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public AssessmentAndPlanSection init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public AssessmentAndPlanSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AssessmentAndPlanSectionImpl
