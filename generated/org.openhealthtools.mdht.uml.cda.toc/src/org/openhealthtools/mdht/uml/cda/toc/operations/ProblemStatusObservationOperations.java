/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.TOCPackage;
import org.openhealthtools.mdht.uml.cda.toc.TOCPlugin;

import org.openhealthtools.mdht.uml.cda.toc.util.TOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ProblemStatusObservation#validateProblemStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemStatusObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationNoAdditionalParticipants(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation No Additional Participants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationNoAdditionalParticipants(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationNoAdditionalParticipants(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation No Additional Participants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationNoAdditionalParticipants(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->isEmpty()
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationNoAdditionalParticipants(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationNoAdditionalParticipants"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationHasTextReference(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationHasTextReference(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationHasTextReference(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationHasTextReference(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationHasTextReference(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationHasTextReference"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationTemplateId(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationTemplateId(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationTemplateId(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationTemplateId(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.1.1')
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationTemplateId(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationTemplateId"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationClassCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationClassCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationClassCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationClassCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationClassCode(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_CLASS_CODE,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationClassCode"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationMoodCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationMoodCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationMoodCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationMoodCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationMoodCode(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_MOOD_CODE,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationMoodCode"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '33999-4' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '33999-4' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationCode(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_CODE,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationCode"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationText(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationText(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationText(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationText(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationText(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_TEXT,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationText"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationStatusCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationStatusCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationStatusCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationStatusCode(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationStatusCode(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_STATUS_CODE,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationStatusCode"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemStatusObservationValue(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationValue(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '55561003' or value.code = '73425007' or value.code = '90734009' or value.code = '7087005' or value.code = '255227004' or value.code = '415684004' or value.code = '410516002' or value.code = '413322009')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemStatusObservationValue(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemStatusObservationValue(ProblemStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '55561003' or value.code = '73425007' or value.code = '90734009' or value.code = '7087005' or value.code = '255227004' or value.code = '415684004' or value.code = '410516002' or value.code = '413322009')))
	 * @param problemStatusObservation The receiving '<em><b>Problem Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemStatusObservationValue(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TOCPackage.Literals.PROBLEM_STATUS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TOCValidator.DIAGNOSTIC_SOURCE,
						 TOCValidator.PROBLEM_STATUS_OBSERVATION__PROBLEM_STATUS_OBSERVATION_VALUE,
						 TOCPlugin.INSTANCE.getString("ProblemStatusObservationValue"),
						 new Object [] { problemStatusObservation }));
			}
			return false;
		}
		return true;
	}

} // ProblemStatusObservationOperations