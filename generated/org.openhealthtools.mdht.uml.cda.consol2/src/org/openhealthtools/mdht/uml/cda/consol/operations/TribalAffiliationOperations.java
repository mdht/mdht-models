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
import org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tribal Affiliation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateSocialHistoryObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TribalAffiliationOperations extends SocialHistoryObservationV4Operations {

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
	protected TribalAffiliationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationCodeP(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationCodeP(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationCodeP(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationCodeP(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_TRIBAL_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTribalAffiliationCodeP(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationCodeP", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				VALIDATE_TRIBAL_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_TRIBAL_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_TRIBAL_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			tribalAffiliation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationCodeP"),
						new Object[] { tribalAffiliation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.TribalAffiliationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.TribalAffiliationCodeP", passToken);
				}
				passToken.add(tribalAffiliation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '95370-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_TRIBAL_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTribalAffiliationCode(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.TribalAffiliationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(tribalAffiliation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationCode", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				VALIDATE_TRIBAL_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_TRIBAL_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_TRIBAL_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			tribalAffiliation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_CODE,
						ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationCode"),
						new Object[] { tribalAffiliation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationStatusCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationStatusCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationStatusCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationStatusCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_TRIBAL_AFFILIATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTribalAffiliationStatusCode(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationStatusCode", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				VALIDATE_TRIBAL_AFFILIATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_TRIBAL_AFFILIATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_TRIBAL_AFFILIATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(tribalAffiliation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationStatusCode"),
						new Object[] { tribalAffiliation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationEffectiveTime(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationEffectiveTime(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationEffectiveTime(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationEffectiveTime(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_TRIBAL_AFFILIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTribalAffiliationEffectiveTime(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationEffectiveTime", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				VALIDATE_TRIBAL_AFFILIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_TRIBAL_AFFILIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_TRIBAL_AFFILIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				tribalAffiliation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationEffectiveTime"),
						new Object[] { tribalAffiliation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationClassCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationClassCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationClassCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationClassCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_TRIBAL_AFFILIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTribalAffiliationClassCode(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationClassCode", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				VALIDATE_TRIBAL_AFFILIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_TRIBAL_AFFILIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_TRIBAL_AFFILIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(tribalAffiliation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationClassCode"),
						new Object[] { tribalAffiliation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationMoodCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationMoodCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationMoodCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationMoodCode(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_TRIBAL_AFFILIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTribalAffiliationMoodCode(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationMoodCode", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				VALIDATE_TRIBAL_AFFILIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_TRIBAL_AFFILIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_TRIBAL_AFFILIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(tribalAffiliation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationMoodCode"),
						new Object[] { tribalAffiliation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationIVLTSValue(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSValue(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationIVLTSValue(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSValue(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_TRIBAL_AFFILIATION_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTribalAffiliationIVLTSValue(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationIVLTSValue", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_TRIBAL_AFFILIATION_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRIBAL_AFFILIATION_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_TRIBAL_AFFILIATION_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			tribalAffiliation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_IVLTS_VALUE,
							ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationIVLTSValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationIVLTSLow(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSLow(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (low.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationIVLTSLow(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSLow(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_TRIBAL_AFFILIATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTribalAffiliationIVLTSLow(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationIVLTSLow", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_TRIBAL_AFFILIATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRIBAL_AFFILIATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_TRIBAL_AFFILIATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			tribalAffiliation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationIVLTSCenter(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Center</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSCenter(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (center.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationIVLTSCenter(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Center</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSCenter(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_TRIBAL_AFFILIATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTribalAffiliationIVLTSCenter(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationIVLTSCenter", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_TRIBAL_AFFILIATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRIBAL_AFFILIATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_TRIBAL_AFFILIATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			tribalAffiliation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_IVLTS_CENTER,
							ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationIVLTSCenter"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationIVLTSWidth(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSWidth(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (width.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationIVLTSWidth(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSWidth(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_TRIBAL_AFFILIATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTribalAffiliationIVLTSWidth(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationIVLTSWidth", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_TRIBAL_AFFILIATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRIBAL_AFFILIATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_TRIBAL_AFFILIATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			tribalAffiliation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_IVLTS_WIDTH,
							ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationIVLTSWidth"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTribalAffiliationIVLTSHigh(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSHigh(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRIBAL_AFFILIATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (high.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTribalAffiliationIVLTSHigh(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTribalAffiliationIVLTSHigh(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_TRIBAL_AFFILIATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTribalAffiliationIVLTSHigh(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationTribalAffiliationIVLTSHigh", "ERROR");

		if (VALIDATE_TRIBAL_AFFILIATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_TRIBAL_AFFILIATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRIBAL_AFFILIATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_TRIBAL_AFFILIATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			tribalAffiliation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.TRIBAL_AFFILIATION__TRIBAL_AFFILIATION_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString("TribalAffiliationTribalAffiliationIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationV4TemplateId(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4TemplateId(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.506' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationV4TemplateId(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4TemplateId(TribalAffiliation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tribalAffiliation The receiving '<em><b>Tribal Affiliation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationV4TemplateId(TribalAffiliation tribalAffiliation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "TribalAffiliationSocialHistoryObservationV4TemplateId", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRIBAL_AFFILIATION);
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
				tribalAffiliation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRIBAL_AFFILIATION__SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("TribalAffiliationSocialHistoryObservationV4TemplateId"),
						new Object[] { tribalAffiliation }));
			}

			return false;
		}
		return true;
	}

} // TribalAffiliationOperations
