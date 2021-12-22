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
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Smoking Status Meaningful Use2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 CD Code Term Assertion Or Loinc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationIVLTSCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationIVLTSWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmokingStatusMeaningfulUse2Operations extends SmokingStatusObservationOperations {
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
	protected SmokingStatusMeaningfulUse2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusMeaningfulUse2TemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2TemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.78' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusMeaningfulUse2TemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2TemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusMeaningfulUse2TemplateId(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2TemplateId", "ERROR");

		if (VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_MEANINGFUL_USE2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2TemplateId"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2Id", "ERROR");

		if (VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_MEANINGFUL_USE2_ID,
						ConsolPlugin.INSTANCE.getString("SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2Id"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusMeaningfulUse2AuthorParticipation(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2AuthorParticipation", "WARNING");

		if (VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2AuthorParticipation"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc", "INFO");

		if (VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			smokingStatusMeaningfulUse2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC,
							ConsolPlugin.INSTANCE.getString(
								"SmokingStatusMeaningfulUse2SmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 CD Code Term Assertion Or Loinc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 CD Code Term Assertion Or Loinc</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationCodeP", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("SmokingStatusMeaningfulUse2SmokingStatusObservationCodeP"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP", passToken);
				}
				passToken.add(smokingStatusMeaningfulUse2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '72166-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(smokingStatusMeaningfulUse2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationCode", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("SmokingStatusMeaningfulUse2SmokingStatusObservationCode"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationValueP(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationValueP", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString("SmokingStatusMeaningfulUse2SmokingStatusObservationValueP"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP", passToken);
				}
				passToken.add(smokingStatusMeaningfulUse2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '449868002' or value.code = '428041000124106' or value.code = '8517006' or value.code = '266919005' or value.code = '77176002' or value.code = '266927001' or value.code = '428071000124103' or value.code = '428061000124105')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(smokingStatusMeaningfulUse2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationValue", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("SmokingStatusMeaningfulUse2SmokingStatusObservationValue"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationEffectiveTime(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationEffectiveTime", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"SmokingStatusMeaningfulUse2SmokingStatusObservationEffectiveTime"),
						new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationIVLTSCenter(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Center</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSCenter(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (center.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationIVLTSCenter(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Center</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSCenter(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSmokingStatusObservationIVLTSCenter(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSCenter", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			smokingStatusMeaningfulUse2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_IVLTS_CENTER,
							ConsolPlugin.INSTANCE.getString(
								"SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSCenter"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationIVLTSHigh(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSHigh(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (high.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationIVLTSHigh(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSHigh(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSmokingStatusObservationIVLTSHigh(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSHigh", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			smokingStatusMeaningfulUse2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationIVLTSLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (low.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationIVLTSLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSmokingStatusObservationIVLTSLow(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSLow", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			smokingStatusMeaningfulUse2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationIVLTSWidth(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSWidth(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (width.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationIVLTSWidth(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationIVLTSWidth(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSmokingStatusObservationIVLTSWidth(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSWidth", "ERROR");

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			smokingStatusMeaningfulUse2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH,
							ConsolPlugin.INSTANCE.getString(
								"SmokingStatusMeaningfulUse2SmokingStatusObservationIVLTSWidth"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // SmokingStatusMeaningfulUse2Operations
