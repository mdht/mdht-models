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
import org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation;
import org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Basic Occupation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationBasicIndustryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Basic Industry Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#getBasicIndustryObservation() <em>Get Basic Industry Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicOccupationObservationOperations extends ClinicalStatementOperations {

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
	protected BasicOccupationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationTemplateId(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationTemplateId(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.503' and id.extension = '2023-05- 01')";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationTemplateId(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationTemplateId(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationTemplateId(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationTemplateId", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"BasicOccupationObservationBasicOccupationObservationTemplateId"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationCodeP(BasicOccupationObservation basicOccupationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationCodeP", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("BasicOccupationObservationBasicOccupationObservationCodeP"),
						new Object[] { basicOccupationObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservationCodeP", passToken);
				}
				passToken.add(basicOccupationObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '11341-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationCode(BasicOccupationObservation basicOccupationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(basicOccupationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationCode", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("BasicOccupationObservationBasicOccupationObservationCode"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationStatusCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationStatusCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationStatusCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationStatusCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationStatusCode(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationStatusCode", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"BasicOccupationObservationBasicOccupationObservationStatusCode"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationStatusCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationStatusCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationStatusCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationStatusCodeP(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationStatusCodeP(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationStatusCodeP", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"BasicOccupationObservationBasicOccupationObservationStatusCodeP"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationEffectiveTime(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationEffectiveTime(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationEffectiveTime(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationEffectiveTime(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationEffectiveTime(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationEffectiveTime", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"BasicOccupationObservationBasicOccupationObservationEffectiveTime"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationClassCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationClassCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationClassCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationClassCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationClassCode(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationClassCode", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"BasicOccupationObservationBasicOccupationObservationClassCode"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationMoodCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationMoodCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationMoodCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationMoodCode(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationMoodCode(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationMoodCode", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("BasicOccupationObservationBasicOccupationObservationMoodCode"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationSubject(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationSubject(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationSubject(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationSubject(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationSubject(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationSubject", "INFO");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_SUBJECT,
						ConsolPlugin.INSTANCE.getString("BasicOccupationObservationBasicOccupationObservationSubject"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationBasicIndustryObservation(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Basic Industry Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationBasicIndustryObservation(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::BasicIndustryObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationBasicIndustryObservation(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Basic Industry Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationBasicIndustryObservation(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBasicOccupationObservationBasicIndustryObservation(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "BasicOccupationObservationBasicOccupationObservationBasicIndustryObservation", "WARNING");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				basicOccupationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"BasicOccupationObservationBasicOccupationObservationBasicIndustryObservation"),
						new Object[] { basicOccupationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationIVLTSLow(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationIVLTSLow(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	// protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =
	// "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or
	// low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationIVLTSLow(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationIVLTSLow(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateBasicOccupationObservationIVLTSLow(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationIVLTSLow", "ERROR");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			basicOccupationObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"BasicOccupationObservationBasicOccupationObservationIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBasicOccupationObservationIVLTSHigh(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationIVLTSHigh(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	// protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =
	// "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or
	// high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";
	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateBasicOccupationObservationIVLTSHigh(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBasicOccupationObservationIVLTSHigh(BasicOccupationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param basicOccupationObservation The receiving '<em><b>Basic Occupation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateBasicOccupationObservationIVLTSHigh(
			BasicOccupationObservation basicOccupationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "BasicOccupationObservationBasicOccupationObservationIVLTSHigh", "INFO");

		if (VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			basicOccupationObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.BASIC_OCCUPATION_OBSERVATION__BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"BasicOccupationObservationBasicOccupationObservationIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBasicIndustryObservation(BasicOccupationObservation) <em>Get Basic Industry Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicIndustryObservation(BasicOccupationObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BASIC_INDUSTRY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::BasicIndustryObservation))->asSequence()->any(true).oclAsType(consol::BasicIndustryObservation)";

	/**
	 * The cached OCL query for the '{@link #getBasicIndustryObservation(BasicOccupationObservation) <em>Get Basic Industry Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicIndustryObservation(BasicOccupationObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BASIC_INDUSTRY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BasicIndustryObservation getBasicIndustryObservation(
			BasicOccupationObservation basicOccupationObservation) {

		if (GET_BASIC_INDUSTRY_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION,
				ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION.getEAllOperations().get(63));
			try {
				GET_BASIC_INDUSTRY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_BASIC_INDUSTRY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BASIC_INDUSTRY_OBSERVATION__EOCL_QRY);
		return (BasicIndustryObservation) query.evaluate(basicOccupationObservation);
	}

} // BasicOccupationObservationOperations
