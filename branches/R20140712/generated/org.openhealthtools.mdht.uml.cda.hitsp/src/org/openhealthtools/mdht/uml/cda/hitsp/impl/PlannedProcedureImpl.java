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
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.PlannedProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryPlanOfCareActivityProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedProcedureImpl extends ProcedureImpl implements PlannedProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.PLANNED_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedureMoodCodeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureMoodCodeValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedureTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedureId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityProcedureOperations.validatePlanOfCareActivityProcedureMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryPlanOfCareActivityProcedureMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryPlanOfCareActivityProcedureOperations.validateProcedureEntryPlanOfCareActivityProcedureMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedure init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedProcedureImpl
