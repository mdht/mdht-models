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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Eye</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlasgowEyeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowEyeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowEyeTemplateId(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeTemplateId(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_EYE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.160')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowEyeTemplateId(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeTemplateId(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_EYE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowEye The receiving '<em><b>Glasgow Eye</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowEyeTemplateId(GlasgowEye glasgowEye, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_EYE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_EYE);
			try {
				VALIDATE_GLASGOW_EYE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_EYE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_EYE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowEye)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_EYE__GLASGOW_EYE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("GlasgowEyeTemplateId"), new Object[] { glasgowEye }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowEyeMoodCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeMoodCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_EYE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowEyeMoodCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeMoodCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_EYE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowEye The receiving '<em><b>Glasgow Eye</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowEyeMoodCode(GlasgowEye glasgowEye, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_EYE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_EYE);
			try {
				VALIDATE_GLASGOW_EYE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_EYE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_EYE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowEye)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_EYE__GLASGOW_EYE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("GlasgowEyeMoodCode"), new Object[] { glasgowEye }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowEyeCodeP(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeCodeP(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_EYE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowEyeCodeP(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeCodeP(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_EYE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowEye The receiving '<em><b>Glasgow Eye</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowEyeCodeP(GlasgowEye glasgowEye, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_EYE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_EYE);
			try {
				VALIDATE_GLASGOW_EYE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_EYE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_EYE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowEye)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_EYE__GLASGOW_EYE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("GlasgowEyeCodeP"), new Object[] { glasgowEye }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEyeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEyeCodeP", passToken);
				}
				passToken.add(glasgowEye);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowEyeCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_EYE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '9267-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowEyeCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeCode(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_EYE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowEye The receiving '<em><b>Glasgow Eye</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowEyeCode(GlasgowEye glasgowEye, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEyeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(glasgowEye)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_GLASGOW_EYE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_EYE);
			try {
				VALIDATE_GLASGOW_EYE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_EYE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_EYE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowEye)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE, EmspcrValidator.GLASGOW_EYE__GLASGOW_EYE_CODE,
					EmspcrPlugin.INSTANCE.getString("GlasgowEyeCode"), new Object[] { glasgowEye }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowEyeValue(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeValue(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_EYE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowEyeValue(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowEyeValue(GlasgowEye, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GLASGOW_EYE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowEye The receiving '<em><b>Glasgow Eye</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGlasgowEyeValue(GlasgowEye glasgowEye, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GLASGOW_EYE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_EYE);
			try {
				VALIDATE_GLASGOW_EYE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_EYE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_EYE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowEye)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.GLASGOW_EYE__GLASGOW_EYE_VALUE, EmspcrPlugin.INSTANCE.getString("GlasgowEyeValue"),
					new Object[] { glasgowEye }));
			}

			return false;
		}
		return true;
	}

} // GlasgowEyeOperations
