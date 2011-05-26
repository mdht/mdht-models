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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.PlanOfCareActivityProcedureImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryPlanOfCareActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Entry Plan Of Care Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryPlanOfCareActivityProcedureImpl extends PlanOfCareActivityProcedureImpl implements
		ProcedureEntryPlanOfCareActivityProcedure {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProcedureEntryPlanOfCareActivityProcedureImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedureEntryPlanOfCareActivityProcedureTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryPlanOfCareActivityProcedureOperations.validateProcedureEntryPlanOfCareActivityProcedureTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public ProcedureEntryPlanOfCareActivityProcedure init() {
		CDAUtil.init(this);
		return this;
	}
} // ProcedureEntryPlanOfCareActivityProcedureImpl
