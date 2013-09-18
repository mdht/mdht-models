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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Status Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateCognitiveStatusResultOrganizerCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Cognitive Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#getCognitiveStatusResultObservations() <em>Get Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CognitiveStatusResultOrganizerOperations extends ResultOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveStatusResultOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultOrganizerCodeCodeSystem(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultOrganizerCodeCodeSystem(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.254' or self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultOrganizerCodeCodeSystem(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultOrganizerCodeCodeSystem(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultOrganizerCodeCodeSystem(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerCognitiveStatusResultOrganizerCodeCodeSystem"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Cognitive Status Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::CognitiveStatusResultObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Cognitive Status Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerCognitiveStatusResultOrganizerCognitiveStatusResultObservation"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCognitiveStatusResultObservations(CognitiveStatusResultOrganizer) <em>Get Cognitive Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusResultObservations(CognitiveStatusResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getCognitiveStatusResultObservations(CognitiveStatusResultOrganizer) <em>Get Cognitive Status Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusResultObservations(CognitiveStatusResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CognitiveStatusResultObservation> getCognitiveStatusResultObservations(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer) {
		if (GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER,
				ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER.getEAllOperations().get(65));
			try {
				GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultObservation> result = (Collection<CognitiveStatusResultObservation>) query.evaluate(cognitiveStatusResultOrganizer);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.75')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerTemplateId(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"CognitiveStatusResultOrganizerResultOrganizerTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									cognitiveStatusResultOrganizer, context) }),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerClassCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerClassCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerClassCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerClassCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerClassCode(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerResultOrganizerClassCode"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerMoodCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerMoodCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerMoodCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerMoodCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerMoodCode(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerResultOrganizerMoodCode"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerId(CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_ID,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerResultOrganizerId"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerCode(CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerResultOrganizerCode"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerStatusCodeP(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerStatusCodeP(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerStatusCodeP(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerStatusCodeP(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerStatusCodeP(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerResultOrganizerStatusCodeP"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerStatusCodeP", passToken);
				}
				passToken.add(cognitiveStatusResultOrganizer);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerStatusCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerStatusCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerStatusCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerStatusCode(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cognitiveStatusResultOrganizer The receiving '<em><b>Cognitive Status Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerStatusCode(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerStatusCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(cognitiveStatusResultOrganizer)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerResultOrganizerStatusCode"),
					new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

} // CognitiveStatusResultOrganizerOperations
