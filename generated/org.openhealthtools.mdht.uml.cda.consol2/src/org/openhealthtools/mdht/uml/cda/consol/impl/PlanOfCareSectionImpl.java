/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlanOfCareSectionImpl extends SectionImpl implements PlanOfCareSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLAN_OF_CARE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlanOfCareActivityAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlanOfCareActivityEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlanOfCareActivityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlanOfCareActivityProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityProcedure(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlanOfCareActivitySupply(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySupply(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanOfCareActivityAct> getPlanOfCareActivityActs() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanOfCareActivityEncounter> getPlanOfCareActivityEncounters() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityEncounters(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanOfCareActivityObservation> getPlanOfCareActivityObservations() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanOfCareActivityProcedure> getPlanOfCareActivityProcedures() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanOfCareActivitySubstanceAdministration> getPlanOfCareActivitySubstanceAdministrations() {
		return PlanOfCareSectionOperations.getPlanOfCareActivitySubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanOfCareActivitySupply> getPlanOfCareActivitySupplies() {
		return PlanOfCareSectionOperations.getPlanOfCareActivitySupplies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instructions> getInstructionss() {
		return PlanOfCareSectionOperations.getInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlanOfCareSectionImpl
