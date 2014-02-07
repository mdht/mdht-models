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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Beginning Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseBeginningOdometerReadingOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseBeginningOdometerReadingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseBeginningOdometerReadingTemplateId(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingTemplateId(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.171')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseBeginningOdometerReadingTemplateId(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingTemplateId(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseBeginningOdometerReading The receiving '<em><b>Response Beginning Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseBeginningOdometerReadingTemplateId(
			ResponseBeginningOdometerReading responseBeginningOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_BEGINNING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseBeginningOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_BEGINNING_ODOMETER_READING__RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ResponseBeginningOdometerReadingTemplateId"),
					new Object[] { responseBeginningOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseBeginningOdometerReadingMoodCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingMoodCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseBeginningOdometerReadingMoodCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingMoodCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseBeginningOdometerReading The receiving '<em><b>Response Beginning Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseBeginningOdometerReadingMoodCode(
			ResponseBeginningOdometerReading responseBeginningOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_BEGINNING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseBeginningOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_BEGINNING_ODOMETER_READING__RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseBeginningOdometerReadingMoodCode"),
					new Object[] { responseBeginningOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseBeginningOdometerReadingCodeP(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingCodeP(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseBeginningOdometerReadingCodeP(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingCodeP(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseBeginningOdometerReading The receiving '<em><b>Response Beginning Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseBeginningOdometerReadingCodeP(
			ResponseBeginningOdometerReading responseBeginningOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_BEGINNING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseBeginningOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_BEGINNING_ODOMETER_READING__RESPONSE_BEGINNING_ODOMETER_READING_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ResponseBeginningOdometerReadingCodeP"),
					new Object[] { responseBeginningOdometerReading }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReadingCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReadingCodeP", passToken);
				}
				passToken.add(responseBeginningOdometerReading);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseBeginningOdometerReadingCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67484-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseBeginningOdometerReadingCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingCode(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseBeginningOdometerReading The receiving '<em><b>Response Beginning Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseBeginningOdometerReadingCode(
			ResponseBeginningOdometerReading responseBeginningOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReadingCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(responseBeginningOdometerReading)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_BEGINNING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseBeginningOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_BEGINNING_ODOMETER_READING__RESPONSE_BEGINNING_ODOMETER_READING_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseBeginningOdometerReadingCode"),
					new Object[] { responseBeginningOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseBeginningOdometerReadingValue(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingValue(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseBeginningOdometerReadingValue(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseBeginningOdometerReadingValue(ResponseBeginningOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseBeginningOdometerReading The receiving '<em><b>Response Beginning Odometer Reading</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseBeginningOdometerReadingValue(
			ResponseBeginningOdometerReading responseBeginningOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_BEGINNING_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseBeginningOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_BEGINNING_ODOMETER_READING__RESPONSE_BEGINNING_ODOMETER_READING_VALUE,
					EmspcrPlugin.INSTANCE.getString("ResponseBeginningOdometerReadingValue"),
					new Object[] { responseBeginningOdometerReading }));
			}

			return false;
		}
		return true;
	}

} // ResponseBeginningOdometerReadingOperations
