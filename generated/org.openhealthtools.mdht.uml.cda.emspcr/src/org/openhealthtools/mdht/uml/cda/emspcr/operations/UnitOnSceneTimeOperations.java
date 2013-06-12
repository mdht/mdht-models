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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit On Scene Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitOnSceneTimeOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected UnitOnSceneTimeOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateUnitOnSceneTimeTemplateId(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeTemplateId(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_UNIT_ON_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.41')";

	/**
	* The cached OCL invariant for the '{@link #validateUnitOnSceneTimeTemplateId(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeTemplateId(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_UNIT_ON_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param unitOnSceneTime The receiving '<em><b>Unit On Scene Time</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateUnitOnSceneTimeTemplateId(UnitOnSceneTime unitOnSceneTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNIT_ON_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_ON_SCENE_TIME);
			try {
				VALIDATE_UNIT_ON_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_ON_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_ON_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitOnSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_ON_SCENE_TIME__UNIT_ON_SCENE_TIME_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("UnitOnSceneTimeTemplateId"), new Object[] { unitOnSceneTime }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateUnitOnSceneTimeCodeP(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeCodeP(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_UNIT_ON_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateUnitOnSceneTimeCodeP(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeCodeP(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_UNIT_ON_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param unitOnSceneTime The receiving '<em><b>Unit On Scene Time</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateUnitOnSceneTimeCodeP(UnitOnSceneTime unitOnSceneTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_UNIT_ON_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_ON_SCENE_TIME);
			try {
				VALIDATE_UNIT_ON_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_ON_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_ON_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitOnSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_ON_SCENE_TIME__UNIT_ON_SCENE_TIME_CODE_P,
					EmspcrPlugin.INSTANCE.getString("UnitOnSceneTimeCodeP"), new Object[] { unitOnSceneTime }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTimeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTimeCodeP", passToken);
				}
				passToken.add(unitOnSceneTime);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateUnitOnSceneTimeCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_UNIT_ON_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69473-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateUnitOnSceneTimeCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_UNIT_ON_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param unitOnSceneTime The receiving '<em><b>Unit On Scene Time</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateUnitOnSceneTimeCode(UnitOnSceneTime unitOnSceneTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTimeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(unitOnSceneTime)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_UNIT_ON_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_ON_SCENE_TIME);
			try {
				VALIDATE_UNIT_ON_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_ON_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_ON_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitOnSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_ON_SCENE_TIME__UNIT_ON_SCENE_TIME_CODE,
					EmspcrPlugin.INSTANCE.getString("UnitOnSceneTimeCode"), new Object[] { unitOnSceneTime }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateUnitOnSceneTimeValue(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeValue(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_UNIT_ON_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	* The cached OCL invariant for the '{@link #validateUnitOnSceneTimeValue(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeValue(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_UNIT_ON_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param unitOnSceneTime The receiving '<em><b>Unit On Scene Time</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateUnitOnSceneTimeValue(UnitOnSceneTime unitOnSceneTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_UNIT_ON_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_ON_SCENE_TIME);
			try {
				VALIDATE_UNIT_ON_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_ON_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_ON_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitOnSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_ON_SCENE_TIME__UNIT_ON_SCENE_TIME_VALUE,
					EmspcrPlugin.INSTANCE.getString("UnitOnSceneTimeValue"), new Object[] { unitOnSceneTime }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateUnitOnSceneTimeMoodCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeMoodCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_UNIT_ON_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateUnitOnSceneTimeMoodCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateUnitOnSceneTimeMoodCode(UnitOnSceneTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_UNIT_ON_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param unitOnSceneTime The receiving '<em><b>Unit On Scene Time</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateUnitOnSceneTimeMoodCode(UnitOnSceneTime unitOnSceneTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_UNIT_ON_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_ON_SCENE_TIME);
			try {
				VALIDATE_UNIT_ON_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_ON_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_ON_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unitOnSceneTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.UNIT_ON_SCENE_TIME__UNIT_ON_SCENE_TIME_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("UnitOnSceneTimeMoodCode"), new Object[] { unitOnSceneTime }));
			}

			return false;
		}
		return true;
	}

} // UnitOnSceneTimeOperations
