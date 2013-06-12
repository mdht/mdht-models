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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseDelayOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ResponseDelayOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDelayTemplateId(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayTemplateId(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.154')";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDelayTemplateId(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayTemplateId(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDelay The receiving '<em><b>Response Delay</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDelayTemplateId(ResponseDelay responseDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DELAY);
			try {
				VALIDATE_RESPONSE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseDelay)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DELAY__RESPONSE_DELAY_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ResponseDelayTemplateId"), new Object[] { responseDelay }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDelayCodeP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayCodeP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDelayCodeP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayCodeP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDelay The receiving '<em><b>Response Delay</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDelayCodeP(ResponseDelay responseDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DELAY);
			try {
				VALIDATE_RESPONSE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseDelay)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DELAY__RESPONSE_DELAY_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ResponseDelayCodeP"), new Object[] { responseDelay }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelayCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelayCodeP", passToken);
				}
				passToken.add(responseDelay);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDelayCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67557-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDelayCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDelay The receiving '<em><b>Response Delay</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDelayCode(ResponseDelay responseDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelayCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(responseDelay)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RESPONSE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DELAY);
			try {
				VALIDATE_RESPONSE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseDelay)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DELAY__RESPONSE_DELAY_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseDelayCode"), new Object[] { responseDelay }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDelayValue(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayValue(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17059-9' or value.code = 'LA17583-8' or value.code = 'LA17585-3' or value.code = 'LA17586-1' or value.code = 'LA17587-9' or value.code = 'LA17588-7' or value.code = 'LA17590-3' or value.code = 'LA17591-1' or value.code = 'LA17592-9' or value.code = 'LA17593-7' or value.code = 'LA17594-5' or value.code = 'LA18081-2' or value.code = 'LA18270-1' or value.code = 'LA18271-9' or value.code = 'LA18301-4')))";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDelayValue(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayValue(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDelay The receiving '<em><b>Response Delay</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDelayValue(ResponseDelay responseDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DELAY);
			try {
				VALIDATE_RESPONSE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseDelay)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DELAY__RESPONSE_DELAY_VALUE,
					EmspcrPlugin.INSTANCE.getString("ResponseDelayValue"), new Object[] { responseDelay }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDelayValueP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayValueP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDelayValueP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayValueP(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDelay The receiving '<em><b>Response Delay</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDelayValueP(ResponseDelay responseDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DELAY);
			try {
				VALIDATE_RESPONSE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseDelay)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DELAY__RESPONSE_DELAY_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("ResponseDelayValueP"), new Object[] { responseDelay }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateResponseDelayMoodCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayMoodCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_RESPONSE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateResponseDelayMoodCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateResponseDelayMoodCode(ResponseDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_RESPONSE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param responseDelay The receiving '<em><b>Response Delay</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateResponseDelayMoodCode(ResponseDelay responseDelay, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_DELAY);
			try {
				VALIDATE_RESPONSE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseDelay)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_DELAY__RESPONSE_DELAY_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseDelayMoodCode"), new Object[] { responseDelay }));
			}

			return false;
		}
		return true;
	}

} // ResponseDelayOperations
