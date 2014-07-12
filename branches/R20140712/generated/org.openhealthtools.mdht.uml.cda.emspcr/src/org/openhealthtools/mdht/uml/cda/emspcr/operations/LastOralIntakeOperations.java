/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Last Oral Intake</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LastOralIntakeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LastOralIntakeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastOralIntakeTemplateId(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeTemplateId(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_ORAL_INTAKE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.80')";

	/**
	 * The cached OCL invariant for the '{@link #validateLastOralIntakeTemplateId(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeTemplateId(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LAST_ORAL_INTAKE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastOralIntake The receiving '<em><b>Last Oral Intake</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastOralIntakeTemplateId(LastOralIntake lastOralIntake, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LAST_ORAL_INTAKE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LAST_ORAL_INTAKE);
			try {
				VALIDATE_LAST_ORAL_INTAKE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_ORAL_INTAKE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LAST_ORAL_INTAKE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lastOralIntake)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LAST_ORAL_INTAKE__LAST_ORAL_INTAKE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("LastOralIntakeTemplateId"), new Object[] { lastOralIntake }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastOralIntakeMoodCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeMoodCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_ORAL_INTAKE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLastOralIntakeMoodCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeMoodCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LAST_ORAL_INTAKE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastOralIntake The receiving '<em><b>Last Oral Intake</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastOralIntakeMoodCode(LastOralIntake lastOralIntake, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LAST_ORAL_INTAKE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LAST_ORAL_INTAKE);
			try {
				VALIDATE_LAST_ORAL_INTAKE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_ORAL_INTAKE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LAST_ORAL_INTAKE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lastOralIntake)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LAST_ORAL_INTAKE__LAST_ORAL_INTAKE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("LastOralIntakeMoodCode"), new Object[] { lastOralIntake }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastOralIntakeCodeP(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeCodeP(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_ORAL_INTAKE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLastOralIntakeCodeP(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeCodeP(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LAST_ORAL_INTAKE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastOralIntake The receiving '<em><b>Last Oral Intake</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastOralIntakeCodeP(LastOralIntake lastOralIntake, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LAST_ORAL_INTAKE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LAST_ORAL_INTAKE);
			try {
				VALIDATE_LAST_ORAL_INTAKE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_ORAL_INTAKE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LAST_ORAL_INTAKE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lastOralIntake)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LAST_ORAL_INTAKE__LAST_ORAL_INTAKE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("LastOralIntakeCodeP"), new Object[] { lastOralIntake }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntakeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntakeCodeP", passToken);
				}
				passToken.add(lastOralIntake);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastOralIntakeCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_ORAL_INTAKE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67517-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLastOralIntakeCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeCode(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LAST_ORAL_INTAKE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastOralIntake The receiving '<em><b>Last Oral Intake</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastOralIntakeCode(LastOralIntake lastOralIntake, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntakeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(lastOralIntake)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_LAST_ORAL_INTAKE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LAST_ORAL_INTAKE);
			try {
				VALIDATE_LAST_ORAL_INTAKE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_ORAL_INTAKE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LAST_ORAL_INTAKE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastOralIntake)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LAST_ORAL_INTAKE__LAST_ORAL_INTAKE_CODE,
					EmspcrPlugin.INSTANCE.getString("LastOralIntakeCode"), new Object[] { lastOralIntake }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLastOralIntakeValue(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeValue(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LAST_ORAL_INTAKE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateLastOralIntakeValue(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLastOralIntakeValue(LastOralIntake, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LAST_ORAL_INTAKE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lastOralIntake The receiving '<em><b>Last Oral Intake</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLastOralIntakeValue(LastOralIntake lastOralIntake, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LAST_ORAL_INTAKE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LAST_ORAL_INTAKE);
			try {
				VALIDATE_LAST_ORAL_INTAKE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LAST_ORAL_INTAKE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LAST_ORAL_INTAKE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(lastOralIntake)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LAST_ORAL_INTAKE__LAST_ORAL_INTAKE_VALUE,
					EmspcrPlugin.INSTANCE.getString("LastOralIntakeValue"), new Object[] { lastOralIntake }));
			}

			return false;
		}
		return true;
	}

} // LastOralIntakeOperations
