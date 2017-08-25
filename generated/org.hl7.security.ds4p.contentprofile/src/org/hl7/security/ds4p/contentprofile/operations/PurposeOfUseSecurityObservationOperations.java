/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation;

import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purpose Of Use Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validatePurposeOfUseSecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validatePurposeOfUseSecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validatePurposeOfUseSecurityObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Value P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validatePurposeOfUseSecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Value</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurposeOfUseSecurityObservationOperations extends SecurityObservationOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeOfUseSecurityObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeOfUseSecurityObservationCodeP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationCodeP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeOfUseSecurityObservationCodeP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationCodeP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeOfUseSecurityObservation The receiving '<em><b>Purpose Of Use Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeOfUseSecurityObservationCodeP(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PURPOSE_OF_USE_SECURITY_OBSERVATION);
			try {
				VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				purposeOfUseSecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"PurposeOfUseSecurityObservationPurposeOfUseSecurityObservationCodeP"),
						new Object[] { purposeOfUseSecurityObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservationCodeP", passToken);
				}
				passToken.add(purposeOfUseSecurityObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeOfUseSecurityObservationCode(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationCode(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'SECCONOBS' and value.codeSystem = '2.16.840.1.113883.1.11.20457'";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeOfUseSecurityObservationCode(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationCode(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeOfUseSecurityObservation The receiving '<em><b>Purpose Of Use Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeOfUseSecurityObservationCode(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(purposeOfUseSecurityObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PURPOSE_OF_USE_SECURITY_OBSERVATION);
			try {
				VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				purposeOfUseSecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"PurposeOfUseSecurityObservationPurposeOfUseSecurityObservationCode"),
						new Object[] { purposeOfUseSecurityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeOfUseSecurityObservationValueP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationValueP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.value->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeOfUseSecurityObservationValueP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationValueP(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeOfUseSecurityObservation The receiving '<em><b>Purpose Of Use Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeOfUseSecurityObservationValueP(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PURPOSE_OF_USE_SECURITY_OBSERVATION);
			try {
				VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				purposeOfUseSecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"PurposeOfUseSecurityObservationPurposeOfUseSecurityObservationValueP"),
						new Object[] { purposeOfUseSecurityObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservationValueP", passToken);
				}
				passToken.add(purposeOfUseSecurityObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePurposeOfUseSecurityObservationValue(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationValue(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = element.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.1063' and (value.code = 'TREAT' or value.code = 'ETREAT' or value.code = 'HPAYMT' or value.code = 'HRESCH' or value.code = 'CLINTRCH' or value.code = ' CLINTRL'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePurposeOfUseSecurityObservationValue(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Of Use Security Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePurposeOfUseSecurityObservationValue(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeOfUseSecurityObservation The receiving '<em><b>Purpose Of Use Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePurposeOfUseSecurityObservationValue(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservationValueP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(purposeOfUseSecurityObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PURPOSE_OF_USE_SECURITY_OBSERVATION);
			try {
				VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				purposeOfUseSecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"PurposeOfUseSecurityObservationPurposeOfUseSecurityObservationValue"),
						new Object[] { purposeOfUseSecurityObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationTemplateId(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationTemplateId(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.22')";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationTemplateId(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationTemplateId(PurposeOfUseSecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param purposeOfUseSecurityObservation The receiving '<em><b>Purpose Of Use Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSecurityObservationTemplateId(
			PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PURPOSE_OF_USE_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				purposeOfUseSecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.PURPOSE_OF_USE_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"PurposeOfUseSecurityObservationSecurityObservationTemplateId"),
						new Object[] { purposeOfUseSecurityObservation }));
			}

			return false;
		}
		return true;
	}

} // PurposeOfUseSecurityObservationOperations
