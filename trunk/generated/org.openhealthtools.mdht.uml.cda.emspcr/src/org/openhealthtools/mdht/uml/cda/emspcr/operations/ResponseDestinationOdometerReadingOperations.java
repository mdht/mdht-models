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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Destination Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseDestinationOdometerReadingOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ResponseDestinationOdometerReadingOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDestinationOdometerReadingTemplateId(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingTemplateId(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.173')";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDestinationOdometerReadingTemplateId(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingTemplateId(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDestinationOdometerReading The receiving '<em><b>Response Destination Odometer Reading</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDestinationOdometerReadingTemplateId(
			ResponseDestinationOdometerReading responseDestinationOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DESTINATION_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseDestinationOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DESTINATION_ODOMETER_READING__RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ResponseDestinationOdometerReadingTemplateId"),
					new Object[] { responseDestinationOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDestinationOdometerReadingCodeP(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingCodeP(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDestinationOdometerReadingCodeP(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingCodeP(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDestinationOdometerReading The receiving '<em><b>Response Destination Odometer Reading</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDestinationOdometerReadingCodeP(
			ResponseDestinationOdometerReading responseDestinationOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DESTINATION_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseDestinationOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DESTINATION_ODOMETER_READING__RESPONSE_DESTINATION_ODOMETER_READING_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ResponseDestinationOdometerReadingCodeP"),
					new Object[] { responseDestinationOdometerReading }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReadingCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReadingCodeP", passToken);
				}
				passToken.add(responseDestinationOdometerReading);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDestinationOdometerReadingCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67486-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDestinationOdometerReadingCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDestinationOdometerReading The receiving '<em><b>Response Destination Odometer Reading</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDestinationOdometerReadingCode(
			ResponseDestinationOdometerReading responseDestinationOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReadingCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(responseDestinationOdometerReading)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DESTINATION_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseDestinationOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DESTINATION_ODOMETER_READING__RESPONSE_DESTINATION_ODOMETER_READING_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseDestinationOdometerReadingCode"),
					new Object[] { responseDestinationOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDestinationOdometerReadingValue(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingValue(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDestinationOdometerReadingValue(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingValue(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDestinationOdometerReading The receiving '<em><b>Response Destination Odometer Reading</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDestinationOdometerReadingValue(
			ResponseDestinationOdometerReading responseDestinationOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DESTINATION_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseDestinationOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DESTINATION_ODOMETER_READING__RESPONSE_DESTINATION_ODOMETER_READING_VALUE,
					EmspcrPlugin.INSTANCE.getString("ResponseDestinationOdometerReadingValue"),
					new Object[] { responseDestinationOdometerReading }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDestinationOdometerReadingMoodCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingMoodCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDestinationOdometerReadingMoodCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDestinationOdometerReadingMoodCode(ResponseDestinationOdometerReading, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDestinationOdometerReading The receiving '<em><b>Response Destination Odometer Reading</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDestinationOdometerReadingMoodCode(
			ResponseDestinationOdometerReading responseDestinationOdometerReading, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DESTINATION_ODOMETER_READING);
			try {
				VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseDestinationOdometerReading)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DESTINATION_ODOMETER_READING__RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseDestinationOdometerReadingMoodCode"),
					new Object[] { responseDestinationOdometerReading }));
			}

			return false;
		}
		return true;
	}

} // ResponseDestinationOdometerReadingOperations
