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
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Gender Identity Observation V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateSocialHistoryObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateSocialHistoryObservationV4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenderIdentityObservationV4Operations extends SocialHistoryObservationV4Operations {

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
	protected GenderIdentityObservationV4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV4Value(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4Value(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '407376001' or value.code = '407377005' or value.code = '44613100012" +
			"4102' or value.code = '44614100012" + "4107' or value.code = '44615100012" + "4109')))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV4Value(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4Value(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV4 The receiving '<em><b>Gender Identity Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGenderIdentityObservationV4Value(
			GenderIdentityObservationV4 genderIdentityObservationV4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV4GenderIdentityObservationV4Value", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V4);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V4__GENDER_IDENTITY_OBSERVATION_V4_VALUE,
						ConsolPlugin.INSTANCE.getString("GenderIdentityObservationV4GenderIdentityObservationV4Value"),
						new Object[] { genderIdentityObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV4ValueP(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4ValueP(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV4ValueP(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4ValueP(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV4 The receiving '<em><b>Gender Identity Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGenderIdentityObservationV4ValueP(
			GenderIdentityObservationV4 genderIdentityObservationV4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV4GenderIdentityObservationV4ValueP", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V4);
			try {
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V4__GENDER_IDENTITY_OBSERVATION_V4_VALUE_P,
						ConsolPlugin.INSTANCE.getString("GenderIdentityObservationV4GenderIdentityObservationV4ValueP"),
						new Object[] { genderIdentityObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV4IVLTSLow(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4IVLTSLow(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV4IVLTSLow(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4IVLTSLow(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV4 The receiving '<em><b>Gender Identity Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGenderIdentityObservationV4IVLTSLow(
			GenderIdentityObservationV4 genderIdentityObservationV4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV4GenderIdentityObservationV4IVLTSLow", "ERROR");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			genderIdentityObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.GENDER_IDENTITY_OBSERVATION_V4__GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"GenderIdentityObservationV4GenderIdentityObservationV4IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGenderIdentityObservationV4IVLTSHigh(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4IVLTSHigh(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGenderIdentityObservationV4IVLTSHigh(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGenderIdentityObservationV4IVLTSHigh(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV4 The receiving '<em><b>Gender Identity Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGenderIdentityObservationV4IVLTSHigh(
			GenderIdentityObservationV4 genderIdentityObservationV4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV4GenderIdentityObservationV4IVLTSHigh", "WARNING");

		if (VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			genderIdentityObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.GENDER_IDENTITY_OBSERVATION_V4__GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"GenderIdentityObservationV4GenderIdentityObservationV4IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationV4TemplateId(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4TemplateId(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.34.3.45' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationV4TemplateId(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4TemplateId(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV4 The receiving '<em><b>Gender Identity Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationV4TemplateId(
			GenderIdentityObservationV4 genderIdentityObservationV4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV4SocialHistoryObservationV4TemplateId", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V4);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V4__SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV4SocialHistoryObservationV4TemplateId"),
						new Object[] { genderIdentityObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationV4EffectiveTime(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4EffectiveTime(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationV4EffectiveTime(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4EffectiveTime(GenderIdentityObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param genderIdentityObservationV4 The receiving '<em><b>Gender Identity Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationV4EffectiveTime(
			GenderIdentityObservationV4 genderIdentityObservationV4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "GenderIdentityObservationV4SocialHistoryObservationV4EffectiveTime", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V4);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				genderIdentityObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENDER_IDENTITY_OBSERVATION_V4__SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"GenderIdentityObservationV4SocialHistoryObservationV4EffectiveTime"),
						new Object[] { genderIdentityObservationV4 }));
			}

			return false;
		}
		return true;
	}

} // GenderIdentityObservationV4Operations
