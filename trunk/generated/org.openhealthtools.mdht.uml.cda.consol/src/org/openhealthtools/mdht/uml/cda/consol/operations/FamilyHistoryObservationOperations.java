/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasSubjectPatientRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Subject Patient Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationRelationshipValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Relationship Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationHasSubjectPatientRelationship(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Subject Patient Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasSubjectPatientRelationship(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.oclIsUndefined()  implies self.subject.relatedSubject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationHasSubjectPatientRelationship(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Subject Patient Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasSubjectPatientRelationship(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.oclIsUndefined()  implies self.subject.relatedSubject->size() = 1
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationHasSubjectPatientRelationship(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationHasSubjectPatientRelationship"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationRelationshipValueCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Relationship Value Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationRelationshipValueCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationRelationshipValueCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Relationship Value Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationRelationshipValueCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationRelationshipValueCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationRelationshipValueCode"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationHasRelatedSubjectCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasRelatedSubjectCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationHasRelatedSubjectCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasRelatedSubjectCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.code->size() = 1
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationHasRelatedSubjectCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationHasRelatedSubjectCode"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationRelatedSubjectCodeValueSet(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationRelatedSubjectCodeValueSet(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationRelatedSubjectCodeValueSet(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationRelatedSubjectCodeValueSet(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationRelatedSubjectCodeValueSet(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationRelatedSubjectCodeValueSet"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationHasRelatedSubjectSubject(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasRelatedSubjectSubject(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.subject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationHasRelatedSubjectSubject(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasRelatedSubjectSubject(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.subject->size() = 1
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationHasRelatedSubjectSubject(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationHasRelatedSubjectSubject"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationHasGenderCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasGenderCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationHasGenderCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationHasGenderCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.oclIsUndefined()  implies self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationHasGenderCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationHasGenderCode"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationRelatedSubjectBirthTime(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationRelatedSubjectBirthTime(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.birthTime->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationRelatedSubjectBirthTime(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationRelatedSubjectBirthTime(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.birthTime->size() = 1
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationRelatedSubjectBirthTime(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationRelatedSubjectBirthTime"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.3')
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationTemplateId"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_ID,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationId"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationCode"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationStatusCode"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationValue(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationValue(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationValue(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationValue(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationValue(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationValue"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationAgeObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationAgeObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationAgeObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Age Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationAgeObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationAgeObservation(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationAgeObservation"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationProblemStatusObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationProblemStatusObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationProblemStatusObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationProblemStatusObservation(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation))
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationProblemStatusObservation(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_PROBLEM_STATUS_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("FamilyHistoryObservationProblemStatusObservation"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeObservation(FamilyHistoryObservation) <em>Get Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(FamilyHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeObservation(FamilyHistoryObservation) <em>Get Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(FamilyHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AgeObservation getAgeObservation(FamilyHistoryObservation familyHistoryObservation) {
		if (GET_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION, ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION.getEAllOperations().get(63));
			try {
				GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(familyHistoryObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatusObservation(FamilyHistoryObservation) <em>Get Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(FamilyHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemStatusObservation(FamilyHistoryObservation) <em>Get Problem Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(FamilyHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemStatusObservation getProblemStatusObservation(FamilyHistoryObservation familyHistoryObservation) {
		if (GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION, ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION.getEAllOperations().get(64));
			try {
				GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(familyHistoryObservation);
	}

} // FamilyHistoryObservationOperations