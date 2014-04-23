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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response On Scene Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseOnSceneOdometerReadingOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseOnSceneOdometerReadingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOnSceneOdometerReadingTemplateId(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingTemplateId(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.172')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOnSceneOdometerReadingTemplateId(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingTemplateId(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOnSceneOdometerReading The receiving '<em><b>Response On Scene Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOnSceneOdometerReadingTemplateId(
			ResponseOnSceneOdometerReading responseOnSceneOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ON_SCENE_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseOnSceneOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_ON_SCENE_ODOMETER_READING__RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ResponseOnSceneOdometerReadingTemplateId"),
					new Object[] { responseOnSceneOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOnSceneOdometerReadingMoodCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingMoodCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOnSceneOdometerReadingMoodCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingMoodCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOnSceneOdometerReading The receiving '<em><b>Response On Scene Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOnSceneOdometerReadingMoodCode(
			ResponseOnSceneOdometerReading responseOnSceneOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ON_SCENE_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseOnSceneOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_ON_SCENE_ODOMETER_READING__RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseOnSceneOdometerReadingMoodCode"),
					new Object[] { responseOnSceneOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOnSceneOdometerReadingCodeP(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingCodeP(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOnSceneOdometerReadingCodeP(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingCodeP(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOnSceneOdometerReading The receiving '<em><b>Response On Scene Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOnSceneOdometerReadingCodeP(
			ResponseOnSceneOdometerReading responseOnSceneOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ON_SCENE_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseOnSceneOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_ON_SCENE_ODOMETER_READING__RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ResponseOnSceneOdometerReadingCodeP"),
					new Object[] { responseOnSceneOdometerReading }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReadingCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReadingCodeP", passToken);
				}
				passToken.add(responseOnSceneOdometerReading);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOnSceneOdometerReadingCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67485-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOnSceneOdometerReadingCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingCode(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOnSceneOdometerReading The receiving '<em><b>Response On Scene Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOnSceneOdometerReadingCode(
			ResponseOnSceneOdometerReading responseOnSceneOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReadingCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(responseOnSceneOdometerReading)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ON_SCENE_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseOnSceneOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_ON_SCENE_ODOMETER_READING__RESPONSE_ON_SCENE_ODOMETER_READING_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseOnSceneOdometerReadingCode"),
					new Object[] { responseOnSceneOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOnSceneOdometerReadingValue(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingValue(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOnSceneOdometerReadingValue(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOnSceneOdometerReadingValue(ResponseOnSceneOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOnSceneOdometerReading The receiving '<em><b>Response On Scene Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOnSceneOdometerReadingValue(
			ResponseOnSceneOdometerReading responseOnSceneOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ON_SCENE_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseOnSceneOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_ON_SCENE_ODOMETER_READING__RESPONSE_ON_SCENE_ODOMETER_READING_VALUE,
					EmspcrPlugin.INSTANCE.getString("ResponseOnSceneOdometerReadingValue"),
					new Object[] { responseOnSceneOdometerReading }));
			}

			return false;
		}
		return true;
	}

} // ResponseOnSceneOdometerReadingOperations
