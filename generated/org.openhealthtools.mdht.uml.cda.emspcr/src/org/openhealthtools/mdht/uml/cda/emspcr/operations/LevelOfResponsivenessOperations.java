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
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Level Of Responsiveness</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelOfResponsivenessOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelOfResponsivenessOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOfResponsivenessTemplateId(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessTemplateId(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.165')";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOfResponsivenessTemplateId(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessTemplateId(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param levelOfResponsiveness The receiving '<em><b>Level Of Responsiveness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLevelOfResponsivenessTemplateId(LevelOfResponsiveness levelOfResponsiveness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS);
			try {
				VALIDATE_LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfResponsiveness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_RESPONSIVENESS__LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("LevelOfResponsivenessTemplateId"),
					new Object[] { levelOfResponsiveness }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOfResponsivenessCodeP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessCodeP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOfResponsivenessCodeP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessCodeP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param levelOfResponsiveness The receiving '<em><b>Level Of Responsiveness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLevelOfResponsivenessCodeP(LevelOfResponsiveness levelOfResponsiveness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS);
			try {
				VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfResponsiveness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_RESPONSIVENESS__LEVEL_OF_RESPONSIVENESS_CODE_P,
					EmspcrPlugin.INSTANCE.getString("LevelOfResponsivenessCodeP"),
					new Object[] { levelOfResponsiveness }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsivenessCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsivenessCodeP", passToken);
				}
				passToken.add(levelOfResponsiveness);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOfResponsivenessCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67775-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOfResponsivenessCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param levelOfResponsiveness The receiving '<em><b>Level Of Responsiveness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLevelOfResponsivenessCode(LevelOfResponsiveness levelOfResponsiveness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsivenessCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(levelOfResponsiveness)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS);
			try {
				VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfResponsiveness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_RESPONSIVENESS__LEVEL_OF_RESPONSIVENESS_CODE,
					EmspcrPlugin.INSTANCE.getString("LevelOfResponsivenessCode"),
					new Object[] { levelOfResponsiveness }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOfResponsivenessValue(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessValue(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17107-6' or value.code = 'LA17108-4' or value.code = 'LA9340-6' or value.code = 'LA9343-0')))";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOfResponsivenessValue(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessValue(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param levelOfResponsiveness The receiving '<em><b>Level Of Responsiveness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLevelOfResponsivenessValue(LevelOfResponsiveness levelOfResponsiveness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS);
			try {
				VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfResponsiveness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_RESPONSIVENESS__LEVEL_OF_RESPONSIVENESS_VALUE,
					EmspcrPlugin.INSTANCE.getString("LevelOfResponsivenessValue"),
					new Object[] { levelOfResponsiveness }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOfResponsivenessValueP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessValueP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOfResponsivenessValueP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessValueP(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param levelOfResponsiveness The receiving '<em><b>Level Of Responsiveness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLevelOfResponsivenessValueP(LevelOfResponsiveness levelOfResponsiveness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS);
			try {
				VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfResponsiveness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_RESPONSIVENESS__LEVEL_OF_RESPONSIVENESS_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("LevelOfResponsivenessValueP"),
					new Object[] { levelOfResponsiveness }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOfResponsivenessEffectiveTime(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessEffectiveTime(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOfResponsivenessEffectiveTime(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessEffectiveTime(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param levelOfResponsiveness The receiving '<em><b>Level Of Responsiveness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLevelOfResponsivenessEffectiveTime(LevelOfResponsiveness levelOfResponsiveness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS);
			try {
				VALIDATE_LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfResponsiveness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_RESPONSIVENESS__LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("LevelOfResponsivenessEffectiveTime"),
					new Object[] { levelOfResponsiveness }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOfResponsivenessMoodCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessMoodCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_OF_RESPONSIVENESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOfResponsivenessMoodCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOfResponsivenessMoodCode(LevelOfResponsiveness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LEVEL_OF_RESPONSIVENESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param levelOfResponsiveness The receiving '<em><b>Level Of Responsiveness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLevelOfResponsivenessMoodCode(LevelOfResponsiveness levelOfResponsiveness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LEVEL_OF_RESPONSIVENESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS);
			try {
				VALIDATE_LEVEL_OF_RESPONSIVENESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_OF_RESPONSIVENESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_OF_RESPONSIVENESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			levelOfResponsiveness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LEVEL_OF_RESPONSIVENESS__LEVEL_OF_RESPONSIVENESS_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("LevelOfResponsivenessMoodCode"),
					new Object[] { levelOfResponsiveness }));
			}

			return false;
		}
		return true;
	}

} // LevelOfResponsivenessOperations
