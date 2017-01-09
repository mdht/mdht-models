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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Abilities Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CognitiveAbilitiesObservationOperations extends ClinicalStatementOperations {
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
	protected CognitiveAbilitiesObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationTemplateId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationTemplateId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.126')";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationTemplateId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationTemplateId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationTemplateId(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationTemplateId"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationClassCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationClassCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationClassCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationClassCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationClassCode(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationClassCode"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationMoodCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationMoodCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationMoodCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationMoodCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationMoodCode(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationMoodCode"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationId(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationId(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_ID,
						ConsolPlugin.INSTANCE.getString("CognitiveAbilitiesObservationCognitiveAbilitiesObservationId"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationCodeP(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationCodeP"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservationCodeP", passToken);
				}
				passToken.add(cognitiveAbilitiesObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '61254005' or value.code = '395659009' or value.code = '286574007' or value.code = '307082005' or value.code = '304641000' or value.code = '363878000' or value.code = '418907009' or value.code = '304645009' or value.code = '311465003'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationCode(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(cognitiveAbilitiesObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationCode"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationText(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationText(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationText(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationText(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationText(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_TEXT,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationText"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationStatusCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationStatusCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationStatusCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationStatusCode(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationStatusCode(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationStatusCode"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationStatusCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationStatusCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationStatusCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationStatusCodeP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationStatusCodeP(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationStatusCodeP"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationEffectiveTime(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationEffectiveTime(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationEffectiveTime(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationEffectiveTime(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationEffectiveTime(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationEffectiveTime"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationValue(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationValue(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationValue(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationValue(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationValue(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationValue"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationValueP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationValueP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationValueP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationValueP(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationValueP(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationValueP"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationAssessmentScaleObservation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationAssessmentScaleObservation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationAssessmentScaleObservation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationAssessmentScaleObservation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationAssessmentScaleObservation(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationAssessmentScaleObservation"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveAbilitiesObservationAuthorParticipation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationAuthorParticipation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveAbilitiesObservationAuthorParticipation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveAbilitiesObservationAuthorParticipation(CognitiveAbilitiesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveAbilitiesObservation The receiving '<em><b>Cognitive Abilities Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveAbilitiesObservationAuthorParticipation(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION);
			try {
				VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				cognitiveAbilitiesObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COGNITIVE_ABILITIES_OBSERVATION__COGNITIVE_ABILITIES_OBSERVATION_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"CognitiveAbilitiesObservationCognitiveAbilitiesObservationAuthorParticipation"),
						new Object[] { cognitiveAbilitiesObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(CognitiveAbilitiesObservation) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(CognitiveAbilitiesObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(CognitiveAbilitiesObservation) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(CognitiveAbilitiesObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(
			CognitiveAbilitiesObservation cognitiveAbilitiesObservation) {

		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION,
				ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION.getEAllOperations().get(65));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(
			cognitiveAbilitiesObservation);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

} // CognitiveAbilitiesObservationOperations
