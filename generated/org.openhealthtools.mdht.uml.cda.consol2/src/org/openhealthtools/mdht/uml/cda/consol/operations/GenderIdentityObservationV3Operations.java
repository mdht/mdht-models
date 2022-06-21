/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Gender Identity Observation V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenderIdentityObservationV3Operations extends ClinicalStatementOperations {

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
	protected GenderIdentityObservationV3Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3Code(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3Code(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3Code(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3Code(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV3 The receiving '<em><b>Gender Identity Observation V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGenderIdentityObservationV3Code(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3Code", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3_CODE,
						ConsolPlugin.INSTANCE.getString("GenderIdentityObservationV3GenderIdentityObservationV3Code"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3StatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3StatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3StatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3StatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV3 The receiving '<em><b>Gender Identity Observation V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGenderIdentityObservationV3StatusCode(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3StatusCode", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV3GenderIdentityObservationV3StatusCode"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3EffectiveTime(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3EffectiveTime(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3EffectiveTime(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3EffectiveTime(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV3 The receiving '<em><b>Gender Identity Observation V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGenderIdentityObservationV3EffectiveTime(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "GenderIdentityObservationV3GenderIdentityObservationV3EffectiveTime", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV3GenderIdentityObservationV3EffectiveTime"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3Value(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3Value(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '407376001' or value.code = '407377005' or value.code = '44613100012" +
			"4102' or value.code = '44614100012" + "4107' or value.code = '44615100012" + "4109')))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3Value(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3Value(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV3 The receiving '<em><b>Gender Identity Observation V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGenderIdentityObservationV3Value(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3Value", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3_VALUE,
						ConsolPlugin.INSTANCE.getString("GenderIdentityObservationV3GenderIdentityObservationV3Value"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3ValueP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3ValueP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3ValueP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3ValueP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV3 The receiving '<em><b>Gender Identity Observation V3</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGenderIdentityObservationV3ValueP(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3ValueP", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3_VALUE_P,
						ConsolPlugin.INSTANCE.getString("GenderIdentityObservationV3GenderIdentityObservationV3ValueP"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

} // GenderIdentityObservationV3Operations
