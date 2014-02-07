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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Left Scene Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitLeftSceneTimeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitLeftSceneTimeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLeftSceneTimeTemplateId(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeTemplateId(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEFT_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.43')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLeftSceneTimeTemplateId(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeTemplateId(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNIT_LEFT_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLeftSceneTime The receiving '<em><b>Unit Left Scene Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitLeftSceneTimeTemplateId(UnitLeftSceneTime unitLeftSceneTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNIT_LEFT_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEFT_SCENE_TIME);
			try {
				VALIDATE_UNIT_LEFT_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEFT_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEFT_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitLeftSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_LEFT_SCENE_TIME__UNIT_LEFT_SCENE_TIME_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("UnitLeftSceneTimeTemplateId"), new Object[] { unitLeftSceneTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLeftSceneTimeMoodCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeMoodCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEFT_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLeftSceneTimeMoodCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeMoodCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNIT_LEFT_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLeftSceneTime The receiving '<em><b>Unit Left Scene Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitLeftSceneTimeMoodCode(UnitLeftSceneTime unitLeftSceneTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNIT_LEFT_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEFT_SCENE_TIME);
			try {
				VALIDATE_UNIT_LEFT_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEFT_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEFT_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitLeftSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_LEFT_SCENE_TIME__UNIT_LEFT_SCENE_TIME_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("UnitLeftSceneTimeMoodCode"), new Object[] { unitLeftSceneTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLeftSceneTimeCodeP(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeCodeP(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEFT_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLeftSceneTimeCodeP(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeCodeP(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNIT_LEFT_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLeftSceneTime The receiving '<em><b>Unit Left Scene Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitLeftSceneTimeCodeP(UnitLeftSceneTime unitLeftSceneTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNIT_LEFT_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEFT_SCENE_TIME);
			try {
				VALIDATE_UNIT_LEFT_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEFT_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEFT_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitLeftSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_LEFT_SCENE_TIME__UNIT_LEFT_SCENE_TIME_CODE_P,
					EmspcrPlugin.INSTANCE.getString("UnitLeftSceneTimeCodeP"), new Object[] { unitLeftSceneTime }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTimeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTimeCodeP", passToken);
				}
				passToken.add(unitLeftSceneTime);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLeftSceneTimeCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEFT_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69475-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLeftSceneTimeCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeCode(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNIT_LEFT_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLeftSceneTime The receiving '<em><b>Unit Left Scene Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitLeftSceneTimeCode(UnitLeftSceneTime unitLeftSceneTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTimeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(unitLeftSceneTime)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_UNIT_LEFT_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEFT_SCENE_TIME);
			try {
				VALIDATE_UNIT_LEFT_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEFT_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEFT_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitLeftSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_LEFT_SCENE_TIME__UNIT_LEFT_SCENE_TIME_CODE,
					EmspcrPlugin.INSTANCE.getString("UnitLeftSceneTimeCode"), new Object[] { unitLeftSceneTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitLeftSceneTimeValue(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeValue(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_LEFT_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitLeftSceneTimeValue(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitLeftSceneTimeValue(UnitLeftSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNIT_LEFT_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitLeftSceneTime The receiving '<em><b>Unit Left Scene Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitLeftSceneTimeValue(UnitLeftSceneTime unitLeftSceneTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNIT_LEFT_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_LEFT_SCENE_TIME);
			try {
				VALIDATE_UNIT_LEFT_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_LEFT_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_LEFT_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitLeftSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_LEFT_SCENE_TIME__UNIT_LEFT_SCENE_TIME_VALUE,
					EmspcrPlugin.INSTANCE.getString("UnitLeftSceneTimeValue"), new Object[] { unitLeftSceneTime }));
			}

			return false;
		}
		return true;
	}

} // UnitLeftSceneTimeOperations
