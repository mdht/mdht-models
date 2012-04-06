/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.cdt.operations.AssessmentAndPlanSectionOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment And Plan Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSectionImpl extends
		org.openhealthtools.mdht.uml.cda.ihe.impl.AssessmentAndPlanSectionImpl implements AssessmentAndPlanSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentAndPlanSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentAndPlanSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentAndPlanSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPAssessmentAndPlanSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPAssessmentAndPlanSectionMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPAssessmentAndPlanSectionImmunization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionImmunization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPAssessmentAndPlanSectionEncounterEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionEncounterEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPAssessmentAndPlanSectionProcedureEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionProcedureEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medication> getMedications() {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.getMedications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Immunization> getImmunizations() {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.getImmunizations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encounter> getEncounterEntries() {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.getEncounterEntries(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedureEntries() {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations.getProcedureEntries(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection init() {
		CDAUtil.init(this);
		return this;
	}
} // AssessmentAndPlanSectionImpl
