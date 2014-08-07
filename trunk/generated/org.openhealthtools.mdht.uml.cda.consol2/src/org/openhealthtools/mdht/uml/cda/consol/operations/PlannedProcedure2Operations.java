/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Instruction2InversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2 Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2TargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2PatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2ProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2PlannedCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Planned Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getPatientPriorityPreferences() <em>Get Patient Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#getPlannedCoverages() <em>Get Planned Coverages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlanOfCareActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedProcedure2Operations extends PlanOfCareActivityProcedureOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedProcedure2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2Instruction2InversionInd(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2 Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Instruction2InversionInd(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instruction2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2Instruction2InversionInd(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2 Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Instruction2InversionInd(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2Instruction2InversionInd(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2Instruction2InversionInd"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2Code(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Code(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2Code(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Code(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2Code(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_CODE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2Code"), new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2StatusCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2StatusCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2StatusCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2StatusCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2StatusCode(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2StatusCode"), new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2StatusCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2StatusCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2StatusCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2StatusCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2StatusCodeP(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2StatusCodeP"), new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2EffectiveTime(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2EffectiveTime(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2EffectiveTime(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2EffectiveTime(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2EffectiveTime(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2EffectiveTime"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2MethodCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2MethodCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2MethodCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2MethodCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2MethodCode(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_METHOD_CODE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2MethodCode"), new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2TargetSiteCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2TargetSiteCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2TargetSiteCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2TargetSiteCodeP(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2TargetSiteCodeP(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_TARGET_SITE_CODE_P,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2TargetSiteCodeP"),
					new Object[] { plannedProcedure2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2TargetSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2TargetSiteCodeP", passToken);
				}
				passToken.add(plannedProcedure2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2TargetSiteCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2TargetSiteCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2TargetSiteCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2TargetSiteCode(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2TargetSiteCode(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2TargetSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedProcedure2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2TargetSiteCode"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2Performer(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Performer(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2Performer(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Performer(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2Performer(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_PERFORMER,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2Performer"), new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2AuthorParticipation(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2AuthorParticipation(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2AuthorParticipation(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2AuthorParticipation(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2AuthorParticipation(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2AuthorParticipation"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2PatientPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Patient Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2PatientPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PatientPriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2PatientPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Patient Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2PatientPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2PatientPriorityPreference(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_PATIENT_PRIORITY_PREFERENCE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2PatientPriorityPreference"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2ProviderPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Provider Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2ProviderPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProviderPriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2ProviderPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Provider Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2ProviderPriorityPreference(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2ProviderPriorityPreference(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_PROVIDER_PRIORITY_PREFERENCE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2ProviderPriorityPreference"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2Indication2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Indication2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2Indication2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Indication2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2Indication2(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_INDICATION2,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2Indication2"), new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2Instruction2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Instruction2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2Instruction2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2Instruction2(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2Instruction2(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_INSTRUCTION2,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2Instruction2"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedProcedure2PlannedCoverage(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Planned Coverage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2PlannedCoverage(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PlannedCoverage) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedProcedure2PlannedCoverage(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Planned Coverage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedProcedure2PlannedCoverage(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedProcedure2PlannedCoverage(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLANNED_PROCEDURE2_PLANNED_COVERAGE,
					ConsolPlugin.INSTANCE.getString("PlannedProcedure2PlannedCoverage"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientPriorityPreferences(PlannedProcedure2) <em>Get Patient Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPriorityPreferences(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PatientPriorityPreference)).oclAsType(consol::PatientPriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPatientPriorityPreferences(PlannedProcedure2) <em>Get Patient Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPriorityPreferences(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_PRIORITY_PREFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PatientPriorityPreference> getPatientPriorityPreferences(PlannedProcedure2 plannedProcedure2) {
		if (GET_PATIENT_PRIORITY_PREFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_PROCEDURE2,
				ConsolPackage.Literals.PLANNED_PROCEDURE2.getEAllOperations().get(70));
			try {
				GET_PATIENT_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PATIENT_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PatientPriorityPreference> result = (Collection<PatientPriorityPreference>) query.evaluate(plannedProcedure2);
		return new BasicEList.UnmodifiableEList<PatientPriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProviderPriorityPreferences(PlannedProcedure2) <em>Get Provider Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPriorityPreferences(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROVIDER_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProviderPriorityPreference)).oclAsType(consol::ProviderPriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getProviderPriorityPreferences(PlannedProcedure2) <em>Get Provider Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPriorityPreferences(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROVIDER_PRIORITY_PREFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProviderPriorityPreference> getProviderPriorityPreferences(PlannedProcedure2 plannedProcedure2) {
		if (GET_PROVIDER_PRIORITY_PREFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_PROCEDURE2,
				ConsolPackage.Literals.PLANNED_PROCEDURE2.getEAllOperations().get(71));
			try {
				GET_PROVIDER_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PROVIDER_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROVIDER_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProviderPriorityPreference> result = (Collection<ProviderPriorityPreference>) query.evaluate(plannedProcedure2);
		return new BasicEList.UnmodifiableEList<ProviderPriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication2s(PlannedProcedure2) <em>Get Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getIndication2s(PlannedProcedure2) <em>Get Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getIndication2s(PlannedProcedure2 plannedProcedure2) {
		if (GET_INDICATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_PROCEDURE2,
				ConsolPackage.Literals.PLANNED_PROCEDURE2.getEAllOperations().get(72));
			try {
				GET_INDICATION2S__EOCL_QRY = helper.createQuery(GET_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(plannedProcedure2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2s(PlannedProcedure2) <em>Get Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2s(PlannedProcedure2) <em>Get Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getInstruction2s(PlannedProcedure2 plannedProcedure2) {
		if (GET_INSTRUCTION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_PROCEDURE2,
				ConsolPackage.Literals.PLANNED_PROCEDURE2.getEAllOperations().get(73));
			try {
				GET_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(plannedProcedure2);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedCoverages(PlannedProcedure2) <em>Get Planned Coverages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedCoverages(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_COVERAGES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedCoverage)).oclAsType(consol::PlannedCoverage)";

	/**
	 * The cached OCL query for the '{@link #getPlannedCoverages(PlannedProcedure2) <em>Get Planned Coverages</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedCoverages(PlannedProcedure2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_COVERAGES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedCoverage> getPlannedCoverages(PlannedProcedure2 plannedProcedure2) {
		if (GET_PLANNED_COVERAGES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_PROCEDURE2,
				ConsolPackage.Literals.PLANNED_PROCEDURE2.getEAllOperations().get(74));
			try {
				GET_PLANNED_COVERAGES__EOCL_QRY = helper.createQuery(GET_PLANNED_COVERAGES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_COVERAGES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedCoverage> result = (Collection<PlannedCoverage>) query.evaluate(plannedProcedure2);
		return new BasicEList.UnmodifiableEList<PlannedCoverage>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityProcedureTemplateId(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityProcedureTemplateId(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.41.2')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityProcedureTemplateId(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityProcedureTemplateId(PlannedProcedure2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedProcedure2 The receiving '<em><b>Planned Procedure2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivityProcedureTemplateId(PlannedProcedure2 plannedProcedure2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_PROCEDURE2);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			plannedProcedure2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLANNED_PROCEDURE2__PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivityProcedureTemplateId"),
					new Object[] { plannedProcedure2 }));
			}

			return false;
		}
		return true;
	}

} // PlannedProcedure2Operations
