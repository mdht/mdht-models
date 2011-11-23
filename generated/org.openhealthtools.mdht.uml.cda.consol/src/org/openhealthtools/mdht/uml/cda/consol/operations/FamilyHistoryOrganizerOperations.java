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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasSubjectPatientRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject Patient Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerRelationshipValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Relationship Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasFamilyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyMemberCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family Member Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#getFamilyHistoryObservations() <em>Get Family History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasComponent(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasComponent(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->size() >= 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasComponent(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasComponent(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->size() >= 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasComponent(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasComponent"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists (comp : cda::Component4 | comp.observation->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::FamilyHistoryObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->exists (comp : cda::Component4 | comp.observation->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::FamilyHistoryObservation)))
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasFamilyHistoryObservation(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasFamilyHistoryObservation"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject->size() = 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasSubject(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasSubject"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasSubjectPatientRelationship(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject Patient Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasSubjectPatientRelationship(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasSubjectPatientRelationship(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject Patient Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasSubjectPatientRelationship(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject->size() = 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasSubjectPatientRelationship(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasSubjectPatientRelationship"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerRelationshipValueCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Relationship Value Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelationshipValueCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerRelationshipValueCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Relationship Value Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelationshipValueCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.classCode = vocab::x_DocumentSubject::PRS
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerRelationshipValueCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerRelationshipValueCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.code->size() = 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasRelatedSubjectCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasRelatedSubjectCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject->size() = 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasRelatedSubjectSubject(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasRelatedSubjectSubject"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.administrativeGenderCode->size() = 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasGenderCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasGenderCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerRelatedSubjectBirthTime(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerRelatedSubjectBirthTime"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->size() = 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasParticipant(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasParticipant"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::PRS)";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipantParticipantRole(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::PRS)
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasParticipantParticipantRole(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasParticipantParticipantRole"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipantRoleCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.code->size() = 1
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasParticipantRoleCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasParticipantRoleCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->one(pe : cda::PlayingEntity | pe.classCode = vocab::EntityClassRoot::PSN)";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity->one(pe : cda::PlayingEntity | pe.classCode = vocab::EntityClassRoot::PSN)
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasParticipantRolePlayingEntity"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerRelatedSubjectCodeValueSet"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerHasFamilyName(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasFamilyName(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.name->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerHasFamilyName(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerHasFamilyName(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.name->size() > 0
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerHasFamilyName(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerHasFamilyName"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerFamilyMemberCondition(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family Member Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyMemberCondition(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(consol::FamilyHistoryObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerFamilyMemberCondition(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family Member Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyMemberCondition(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(consol::FamilyHistoryObservation))
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerFamilyMemberCondition(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerFamilyMemberCondition"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.18')
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerTemplateId"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerClassCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::ActMood::EVN
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerMoodCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.111'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.5.111'))
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerStatusCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::FamilyHistoryObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::FamilyHistoryObservation))
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerFamilyHistoryObservation(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerFamilyHistoryObservation"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistoryObservations(FamilyHistoryOrganizer) <em>Get Family History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryObservations(FamilyHistoryOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation)).oclAsType(consol::FamilyHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistoryObservations(FamilyHistoryOrganizer) <em>Get Family History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryObservations(FamilyHistoryOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation)).oclAsType(consol::FamilyHistoryObservation)
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<FamilyHistoryObservation> getFamilyHistoryObservations(
			FamilyHistoryOrganizer familyHistoryOrganizer) {
		if (GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER,
				ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER.getEAllOperations().get(72));
			try {
				GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistoryObservation> result = (Collection<FamilyHistoryObservation>) query.evaluate(familyHistoryOrganizer);
		return new BasicEList.UnmodifiableEList<FamilyHistoryObservation>(result.size(), result.toArray());
	}

} // FamilyHistoryOrganizerOperations
