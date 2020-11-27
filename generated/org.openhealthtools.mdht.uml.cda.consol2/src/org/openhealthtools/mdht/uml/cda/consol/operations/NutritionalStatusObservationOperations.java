/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutritional Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationNutritionAssessment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Nutrition Assessment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#getNutritionAssessments() <em>Get Nutrition Assessments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NutritionalStatusObservationOperations extends ClinicalStatementOperations {
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
	protected NutritionalStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationTemplateId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationTemplateId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.124')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationTemplateId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationTemplateId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationTemplateId(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationTemplateId", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationTemplateId"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationClassCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationClassCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationClassCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationClassCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationClassCode(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationClassCode", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationClassCode"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationMoodCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationMoodCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationMoodCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationMoodCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationMoodCode(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationMoodCode", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationMoodCode"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationId(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationId(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationId", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_ID,
						ConsolPlugin.INSTANCE.getString("NutritionalStatusObservationNutritionalStatusObservationId"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationCodeP(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationCodeP", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationCodeP"),
						new Object[] { nutritionalStatusObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservationCodeP", passToken);
				}
				passToken.add(nutritionalStatusObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '75305-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationCode(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(nutritionalStatusObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationCode", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("NutritionalStatusObservationNutritionalStatusObservationCode"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationStatusCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationStatusCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationStatusCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationStatusCode(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationStatusCode(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationStatusCode", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationStatusCode"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationStatusCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationStatusCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationStatusCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationStatusCodeP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationStatusCodeP(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NutritionalStatusObservationNutritionalStatusObservationStatusCodeP", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationStatusCodeP"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationEffectiveTime(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationEffectiveTime(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationEffectiveTime(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationEffectiveTime(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationEffectiveTime(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NutritionalStatusObservationNutritionalStatusObservationEffectiveTime", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationEffectiveTime"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationValue(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationValue(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationValue(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationValue(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationValue(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationValue", "WARNING");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationValue"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationValueP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationValueP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationValueP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationValueP(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationValueP(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "NutritionalStatusObservationNutritionalStatusObservationValueP", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationValueP"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionalStatusObservationNutritionAssessment(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Nutrition Assessment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationNutritionAssessment(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NutritionAssessment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionalStatusObservationNutritionAssessment(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Nutrition Assessment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionalStatusObservationNutritionAssessment(NutritionalStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionalStatusObservation The receiving '<em><b>Nutritional Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionalStatusObservationNutritionAssessment(
			NutritionalStatusObservation nutritionalStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "NutritionalStatusObservationNutritionalStatusObservationNutritionAssessment", "ERROR");

		if (VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION);
			try {
				VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				nutritionalStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.NUTRITIONAL_STATUS_OBSERVATION__NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT,
						ConsolPlugin.INSTANCE.getString(
							"NutritionalStatusObservationNutritionalStatusObservationNutritionAssessment"),
						new Object[] { nutritionalStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionAssessments(NutritionalStatusObservation) <em>Get Nutrition Assessments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessments(NutritionalStatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_ASSESSMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)).oclAsType(consol::NutritionAssessment)";

	/**
	 * The cached OCL query for the '{@link #getNutritionAssessments(NutritionalStatusObservation) <em>Get Nutrition Assessments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessments(NutritionalStatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_ASSESSMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionAssessment> getNutritionAssessments(
			NutritionalStatusObservation nutritionalStatusObservation) {

		if (GET_NUTRITION_ASSESSMENTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION,
				ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION.getEAllOperations().get(63));
			try {
				GET_NUTRITION_ASSESSMENTS__EOCL_QRY = helper.createQuery(GET_NUTRITION_ASSESSMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUTRITION_ASSESSMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionAssessment> result = (Collection<NutritionAssessment>) query.evaluate(
			nutritionalStatusObservation);
		return new BasicEList.UnmodifiableEList<NutritionAssessment>(result.size(), result.toArray());
	}

} // NutritionalStatusObservationOperations
