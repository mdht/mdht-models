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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedurePerformer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Performer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedurePatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getProblemAct() <em>Get Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityProcedureOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProcedureActivityProcedureOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.29')";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureTemplateId(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureTemplateId"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureMoodCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureMoodCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureMoodCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureMoodCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureMoodCode(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureMoodCode"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureCode(ProcedureActivityProcedure procedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_CODE,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureCode"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureEffectiveTime(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureEffectiveTime(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureEffectiveTime(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureEffectiveTime(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureEffectiveTime(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureEffectiveTime"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureId(ProcedureActivityProcedure procedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_ID,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureId"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureSpecimen(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Specimen</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureSpecimen(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->exists(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(rim::Participation))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureSpecimen(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Specimen</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureSpecimen(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityProcedureSpecimen(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureSpecimen"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureEncounterLocation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Encounter Location</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureEncounterLocation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(ccd::EncounterLocation))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureEncounterLocation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Encounter Location</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureEncounterLocation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityProcedureEncounterLocation(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_LOCATION,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureEncounterLocation"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedurePerformer2(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Performer2</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedurePerformer2(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedurePerformer2(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Performer2</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedurePerformer2(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureActivityProcedurePerformer2(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER2,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedurePerformer2"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureProblemObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureProblemObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureProblemObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureProblemObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureProblemObservation(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureProblemObservation"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureProblemAct(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Act</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureProblemAct(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::ProblemAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureProblemAct(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Act</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureProblemAct(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureProblemAct(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureProblemAct"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureAgeObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Age Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureAgeObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureAgeObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Age Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureAgeObservation(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureAgeObservation(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureAgeObservation"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedureMedicationActivity(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Medication Activity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureMedicationActivity(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(ccd::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedureMedicationActivity(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Medication Activity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedureMedicationActivity(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedureMedicationActivity(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedureMedicationActivity"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureActivityProcedurePatientInstruction(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Patient Instruction</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedurePatientInstruction(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::PatientInstruction))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureActivityProcedurePatientInstruction(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Patient Instruction</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureActivityProcedurePatientInstruction(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureActivityProcedurePatientInstruction(
			ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION,
					CCDPlugin.INSTANCE.getString("ProcedureActivityProcedurePatientInstruction"),
					new Object[] { procedureActivityProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getProblemObservation(ProcedureActivityProcedure) <em>Get Problem Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemObservation(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROBLEM_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemObservation))->asSequence()->any(true).oclAsType(ccd::ProblemObservation)";

	/**
	* The cached OCL query for the '{@link #getProblemObservation(ProcedureActivityProcedure) <em>Get Problem Observation</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemObservation(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProblemObservation getProblemObservation(ProcedureActivityProcedure procedureActivityProcedure) {
		if (GET_PROBLEM_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE,
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(64));
			try {
				GET_PROBLEM_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATION__EOCL_QRY);
		return (ProblemObservation) query.evaluate(procedureActivityProcedure);
	}

	/**
	* The cached OCL expression body for the '{@link #getProblemAct(ProcedureActivityProcedure) <em>Get Problem Act</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemAct(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROBLEM_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::ProblemAct))->asSequence()->any(true).oclAsType(ccd::ProblemAct)";

	/**
	* The cached OCL query for the '{@link #getProblemAct(ProcedureActivityProcedure) <em>Get Problem Act</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemAct(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROBLEM_ACT__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProblemAct getProblemAct(ProcedureActivityProcedure procedureActivityProcedure) {
		if (GET_PROBLEM_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE,
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(65));
			try {
				GET_PROBLEM_ACT__EOCL_QRY = helper.createQuery(GET_PROBLEM_ACT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ACT__EOCL_QRY);
		return (ProblemAct) query.evaluate(procedureActivityProcedure);
	}

	/**
	* The cached OCL expression body for the '{@link #getAgeObservation(ProcedureActivityProcedure) <em>Get Age Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAgeObservation(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::AgeObservation))->asSequence()->any(true).oclAsType(ccd::AgeObservation)";

	/**
	* The cached OCL query for the '{@link #getAgeObservation(ProcedureActivityProcedure) <em>Get Age Observation</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAgeObservation(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AgeObservation getAgeObservation(ProcedureActivityProcedure procedureActivityProcedure) {
		if (GET_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE,
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(66));
			try {
				GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(procedureActivityProcedure);
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicationActivities(ProcedureActivityProcedure) <em>Get Medication Activities</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationActivities(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(ccd::MedicationActivity)).oclAsType(ccd::MedicationActivity)";

	/**
	* The cached OCL query for the '{@link #getMedicationActivities(ProcedureActivityProcedure) <em>Get Medication Activities</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationActivities(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static EList<MedicationActivity> getMedicationActivities(
			ProcedureActivityProcedure procedureActivityProcedure) {
		if (GET_MEDICATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE,
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(67));
			try {
				GET_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(procedureActivityProcedure);
		return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
	}

	/**
	* The cached OCL expression body for the '{@link #getPatientInstructions(ProcedureActivityProcedure) <em>Get Patient Instructions</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientInstructions(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static final String GET_PATIENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::PatientInstruction)).oclAsType(ccd::PatientInstruction)";

	/**
	* The cached OCL query for the '{@link #getPatientInstructions(ProcedureActivityProcedure) <em>Get Patient Instructions</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientInstructions(ProcedureActivityProcedure)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PATIENT_INSTRUCTIONS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static EList<PatientInstruction> getPatientInstructions(ProcedureActivityProcedure procedureActivityProcedure) {
		if (GET_PATIENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE,
				CCDPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(68));
			try {
				GET_PATIENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PatientInstruction> result = (Collection<PatientInstruction>) query.evaluate(procedureActivityProcedure);
		return new BasicEList.UnmodifiableEList<PatientInstruction>(result.size(), result.toArray());
	}

} // ProcedureActivityProcedureOperations
