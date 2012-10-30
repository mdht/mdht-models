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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Entry Plan Of Care Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryPlanOfCareActivityProcedure#validateProcedureEntryPlanOfCareActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Plan Of Care Activity Procedure Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryPlanOfCareActivityProcedureOperations extends PlanOfCareActivityProcedureOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProcedureEntryPlanOfCareActivityProcedureOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureEntryPlanOfCareActivityProcedureMoodCode(ProcedureEntryPlanOfCareActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Plan Of Care Activity Procedure Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureEntryPlanOfCareActivityProcedureMoodCode(ProcedureEntryPlanOfCareActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureEntryPlanOfCareActivityProcedureMoodCode(ProcedureEntryPlanOfCareActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Plan Of Care Activity Procedure Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureEntryPlanOfCareActivityProcedureMoodCode(ProcedureEntryPlanOfCareActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureEntryPlanOfCareActivityProcedure The receiving '<em><b>Procedure Entry Plan Of Care Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureEntryPlanOfCareActivityProcedureMoodCode(
			ProcedureEntryPlanOfCareActivityProcedure procedureEntryPlanOfCareActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryPlanOfCareActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE,
					IHEPlugin.INSTANCE.getString("ProcedureEntryPlanOfCareActivityProcedureMoodCode"),
					new Object[] { procedureEntryPlanOfCareActivityProcedure }));
			}

			return false;
		}
		return true;
	}

} // ProcedureEntryPlanOfCareActivityProcedureOperations
