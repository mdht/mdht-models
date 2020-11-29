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
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Expiration Date Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation TS Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpirationDateObservationOperations extends ClinicalStatementOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
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
	protected ExpirationDateObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExpirationDateObservationTemplateId(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationTemplateId(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.309' and id.extension = '2019-06-21')";

	/**
	 * The cached OCL invariant for the '{@link #validateExpirationDateObservationTemplateId(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationTemplateId(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param expirationDateObservation The receiving '<em><b>Expiration Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExpirationDateObservationTemplateId(
			ExpirationDateObservation expirationDateObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ExpirationDateObservationExpirationDateObservationTemplateId", "ERROR");

		if (VALIDATE_EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXPIRATION_DATE_OBSERVATION);
			try {
				VALIDATE_EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				expirationDateObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXPIRATION_DATE_OBSERVATION__EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ExpirationDateObservationExpirationDateObservationTemplateId"),
						new Object[] { expirationDateObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExpirationDateObservationCodeP(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationCodeP(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExpirationDateObservationCodeP(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationCodeP(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param expirationDateObservation The receiving '<em><b>Expiration Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExpirationDateObservationCodeP(ExpirationDateObservation expirationDateObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ExpirationDateObservationExpirationDateObservationCodeP", "ERROR");

		if (VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXPIRATION_DATE_OBSERVATION);
			try {
				VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				expirationDateObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXPIRATION_DATE_OBSERVATION__EXPIRATION_DATE_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("ExpirationDateObservationExpirationDateObservationCodeP"),
						new Object[] { expirationDateObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservationCodeP", passToken);
				}
				passToken.add(expirationDateObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExpirationDateObservationCode(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationCode(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'C101670' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExpirationDateObservationCode(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationCode(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param expirationDateObservation The receiving '<em><b>Expiration Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExpirationDateObservationCode(ExpirationDateObservation expirationDateObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(expirationDateObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ExpirationDateObservationExpirationDateObservationCode", "ERROR");

		if (VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXPIRATION_DATE_OBSERVATION);
			try {
				VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				expirationDateObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXPIRATION_DATE_OBSERVATION__EXPIRATION_DATE_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("ExpirationDateObservationExpirationDateObservationCode"),
						new Object[] { expirationDateObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExpirationDateObservationValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXPIRATION_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExpirationDateObservationValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_EXPIRATION_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param expirationDateObservation The receiving '<em><b>Expiration Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExpirationDateObservationValue(ExpirationDateObservation expirationDateObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ExpirationDateObservationExpirationDateObservationValue", "ERROR");

		if (VALIDATE_EXPIRATION_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXPIRATION_DATE_OBSERVATION);
			try {
				VALIDATE_EXPIRATION_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_EXPIRATION_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXPIRATION_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				expirationDateObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXPIRATION_DATE_OBSERVATION__EXPIRATION_DATE_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("ExpirationDateObservationExpirationDateObservationValue"),
						new Object[] { expirationDateObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExpirationDateObservationTSValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation TS Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationTSValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_EXPIRATION_DATE_OBSERVATION_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( isNullFlavorDefined() or isDefined('value') )";

	/**
	 * The cached OCL invariant for the '{@link #validateExpirationDateObservationTSValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation TS Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExpirationDateObservationTSValue(ExpirationDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_EXPIRATION_DATE_OBSERVATION_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param expirationDateObservation The receiving '<em><b>Expiration Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExpirationDateObservationTSValue(ExpirationDateObservation expirationDateObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ExpirationDateObservationExpirationDateObservationTSValue", "ERROR");

		if (VALIDATE_EXPIRATION_DATE_OBSERVATION_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXPIRATION_DATE_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_EXPIRATION_DATE_OBSERVATION_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXPIRATION_DATE_OBSERVATION_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_EXPIRATION_DATE_OBSERVATION_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			expirationDateObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.EXPIRATION_DATE_OBSERVATION__EXPIRATION_DATE_OBSERVATION_TS_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"ExpirationDateObservationExpirationDateObservationTSValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ExpirationDateObservationOperations
