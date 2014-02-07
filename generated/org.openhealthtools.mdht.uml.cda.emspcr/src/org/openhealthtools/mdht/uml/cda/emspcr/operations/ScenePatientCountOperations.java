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
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scene Patient Count</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenePatientCountOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenePatientCountOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.86')";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountTemplateId(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ScenePatientCountTemplateId"), new Object[] { scenePatientCount }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountMoodCode(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ScenePatientCountMoodCode"), new Object[] { scenePatientCount }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountCodeP(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ScenePatientCountCodeP"), new Object[] { scenePatientCount }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCountCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCountCodeP", passToken);
				}
				passToken.add(scenePatientCount);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67489-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountCode(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCountCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(scenePatientCount)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_CODE,
					EmspcrPlugin.INSTANCE.getString("ScenePatientCountCode"), new Object[] { scenePatientCount }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountValue(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_VALUE,
					EmspcrPlugin.INSTANCE.getString("ScenePatientCountValue"), new Object[] { scenePatientCount }));
			}

			return false;
		}
		return true;
	}

} // ScenePatientCountOperations
