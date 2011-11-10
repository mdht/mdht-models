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
import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cause Of Death Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationHasSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationHasSubjectPatientRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Subject Patient Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationRelationshipValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Relationship Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationHasRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationHasRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#validateCauseOfDeathObservationCauseOfDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation#getCauseOfDeathObservations() <em>Get Cause Of Death Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CauseOfDeathObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseOfDeathObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationHasSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationHasSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject->size() > 0
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationHasSubject(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationHasSubject"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationHasSubjectPatientRelationship(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Subject Patient Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasSubjectPatientRelationship(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationHasSubjectPatientRelationship(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Subject Patient Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasSubjectPatientRelationship(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject->size() = 1
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationHasSubjectPatientRelationship(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationHasSubjectPatientRelationship"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationRelationshipValueCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Relationship Value Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationRelationshipValueCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationRelationshipValueCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Relationship Value Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationRelationshipValueCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationRelationshipValueCode(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationRelationshipValueCode"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationHasRelatedSubjectCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Related Subject Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasRelatedSubjectCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationHasRelatedSubjectCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Related Subject Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasRelatedSubjectCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.code->size() = 1
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationHasRelatedSubjectCode(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationHasRelatedSubjectCode"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationRelatedSubjectCodeValueSet(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Related Subject Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationRelatedSubjectCodeValueSet(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationRelatedSubjectCodeValueSet(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Related Subject Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationRelatedSubjectCodeValueSet(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationRelatedSubjectCodeValueSet(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationRelatedSubjectCodeValueSet"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationHasRelatedSubjectSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Related Subject Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasRelatedSubjectSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationHasRelatedSubjectSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Related Subject Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasRelatedSubjectSubject(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject->size() = 1
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationHasRelatedSubjectSubject(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationHasRelatedSubjectSubject"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationHasGenderCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasGenderCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationHasGenderCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Has Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationHasGenderCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationHasGenderCode(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_HAS_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationHasGenderCode"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationRelatedSubjectBirthTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Related Subject Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationRelatedSubjectBirthTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.birthTime->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationRelatedSubjectBirthTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Related Subject Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationRelatedSubjectBirthTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.birthTime->size() = 1
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationRelatedSubjectBirthTime(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationRelatedSubjectBirthTime"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.42')";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.42')
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationTemplateId(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationTemplateId"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationMoodCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationMoodCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationMoodCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationMoodCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationMoodCode(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationMoodCode"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationId(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationId"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationStatusCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationStatusCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationStatusCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationStatusCode(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationStatusCode(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationStatusCode"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationEffectiveTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationEffectiveTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationEffectiveTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationEffectiveTime(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationEffectiveTime(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationEffectiveTime"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationAgeObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationAgeObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationAgeObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Age Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationAgeObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationAgeObservation(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_AGE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationAgeObservation"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationProblemStatusObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationProblemStatusObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationProblemStatusObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationProblemStatusObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation))
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationProblemStatusObservation(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationProblemStatusObservation"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCauseOfDeathObservationCauseOfDeathObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Cause Of Death Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationCauseOfDeathObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateCauseOfDeathObservationCauseOfDeathObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cause Of Death Observation Cause Of Death Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCauseOfDeathObservationCauseOfDeathObservation(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCauseOfDeathObservationCauseOfDeathObservation(
			CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("CauseOfDeathObservationCauseOfDeathObservation"),
					new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeObservation(CauseOfDeathObservation) <em>Get Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeObservation(CauseOfDeathObservation) <em>Get Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AgeObservation getAgeObservation(CauseOfDeathObservation causeOfDeathObservation) {
		if (GET_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION,
				ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION.getEAllOperations().get(65));
			try {
				GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(causeOfDeathObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatusObservation(CauseOfDeathObservation) <em>Get Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemStatusObservation(CauseOfDeathObservation) <em>Get Problem Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemStatusObservation getProblemStatusObservation(CauseOfDeathObservation causeOfDeathObservation) {
		if (GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION,
				ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION.getEAllOperations().get(66));
			try {
				GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(causeOfDeathObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCauseOfDeathObservations(CauseOfDeathObservation) <em>Get Cause Of Death Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservations(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CauseOfDeathObservation)).oclAsType(consol::CauseOfDeathObservation)";

	/**
	 * The cached OCL query for the '{@link #getCauseOfDeathObservations(CauseOfDeathObservation) <em>Get Cause Of Death Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservations(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CauseOfDeathObservation)).oclAsType(consol::CauseOfDeathObservation)
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<CauseOfDeathObservation> getCauseOfDeathObservations(
			CauseOfDeathObservation causeOfDeathObservation) {
		if (GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION,
				ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION.getEAllOperations().get(67));
			try {
				GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CauseOfDeathObservation> result = (Collection<CauseOfDeathObservation>) query.evaluate(causeOfDeathObservation);
		return new BasicEList.UnmodifiableEList<CauseOfDeathObservation>(result.size(), result.toArray());
	}

} // CauseOfDeathObservationOperations
