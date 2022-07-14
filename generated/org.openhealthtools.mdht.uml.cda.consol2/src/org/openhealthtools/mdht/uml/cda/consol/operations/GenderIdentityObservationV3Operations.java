/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenderIdentityObservationV3Operations extends SocialHistoryObservation2Operations {

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
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

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

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3ClassCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3ClassCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3ClassCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3ClassCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateGenderIdentityObservationV3ClassCode(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3ClassCode", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV3GenderIdentityObservationV3ClassCode"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3MoodCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3MoodCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3MoodCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3MoodCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateGenderIdentityObservationV3MoodCode(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3MoodCode", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV3GenderIdentityObservationV3MoodCode"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3IVLTSLow(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3IVLTSLow(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3IVLTSLow(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3IVLTSLow(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

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
	@SuppressWarnings("unchecked")
	public static boolean validateGenderIdentityObservationV3IVLTSLow(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3IVLTSLow", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			genderIdentityObservationV3);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"GenderIdentityObservationV3GenderIdentityObservationV3IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV3IVLTSHigh(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3IVLTSHigh(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV3IVLTSHigh(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV3IVLTSHigh(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

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
	@SuppressWarnings("unchecked")
	public static boolean validateGenderIdentityObservationV3IVLTSHigh(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3GenderIdentityObservationV3IVLTSHigh", "INFO");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			genderIdentityObservationV3);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"GenderIdentityObservationV3GenderIdentityObservationV3IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservation2TemplateId(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservation2TemplateId(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.34.3.45' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservation2TemplateId(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservation2TemplateId(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateSocialHistoryObservation2TemplateId(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3SocialHistoryObservation2TemplateId", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV3SocialHistoryObservation2TemplateId"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateSocialHistoryObservationCodeP(GenderIdentityObservationV3 genderIdentityObservationV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3SocialHistoryObservationCodeP", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__SOCIAL_HISTORY_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("GenderIdentityObservationV3SocialHistoryObservationCodeP"),
						new Object[] { genderIdentityObservationV3 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationCodeP", passToken);
				}
				passToken.add(genderIdentityObservationV3);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '76691-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateSocialHistoryObservationCode(GenderIdentityObservationV3 genderIdentityObservationV3,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(genderIdentityObservationV3)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "GenderIdentityObservationV3SocialHistoryObservationCode", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__SOCIAL_HISTORY_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("GenderIdentityObservationV3SocialHistoryObservationCode"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationStatusCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationStatusCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationStatusCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationStatusCodeP(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateSocialHistoryObservationStatusCodeP(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV3SocialHistoryObservationStatusCodeP", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV3SocialHistoryObservationStatusCodeP"),
						new Object[] { genderIdentityObservationV3 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationStatusCodeP", passToken);
				}
				passToken.add(genderIdentityObservationV3);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationStatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationStatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationStatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationStatusCode(GenderIdentityObservationV3, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

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

	public static boolean validateSocialHistoryObservationStatusCode(
			GenderIdentityObservationV3 genderIdentityObservationV3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(genderIdentityObservationV3)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "GenderIdentityObservationV3SocialHistoryObservationStatusCode", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV3)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V3__SOCIAL_HISTORY_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV3SocialHistoryObservationStatusCode"),
						new Object[] { genderIdentityObservationV3 }));
			}

			return false;
		}
		return true;
	}

} // GenderIdentityObservationV3Operations
