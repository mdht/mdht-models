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
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Severity;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasUnknownResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryCauseOfDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntrySeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHealthStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getCauseOfDeathObservation() <em>Get Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getHealthStatusObservation() <em>Get Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getComments() <em>Get Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionEntryOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "or not self.getSection().informant->isEmpty()"
			+ "or not self.getClinicalDocument().informant->isEmpty()"
			+ "or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryInformationSource(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryInformationSource"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryContainsPatientAwareness(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS,
					ConsolPlugin.INSTANCE.getString("ConditionEntryContainsPatientAwareness"),
					new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHasTextReference(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryHasTextReference"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd=true)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryCommentInversionInd(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_COMMENT_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("ConditionEntryCommentInversionInd"),
					new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHasOnsetDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryHasOnsetDate"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHasResolutionDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryHasResolutionDate"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHasUnknownResolutionDate(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryHasUnknownResolutionDate"),
					new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryTemplateId(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ConditionEntryTemplateId"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryMoodCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryMoodCode"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryId(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_ID,
					ConsolPlugin.INSTANCE.getString("ConditionEntryId"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_CODE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryCode"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryText(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_TEXT,
					ConsolPlugin.INSTANCE.getString("ConditionEntryText"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryStatusCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryStatusCode"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryEffectiveTime(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ConditionEntryEffectiveTime"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryValue(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_VALUE,
					ConsolPlugin.INSTANCE.getString("ConditionEntryValue"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryAgeObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_AGE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ConditionEntryAgeObservation"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryCauseOfDeathObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ConditionEntryCauseOfDeathObservation"),
					new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryProblemStatusObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ConditionEntryProblemStatusObservation"),
					new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Severity))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Severity))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntrySeverity(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_SEVERITY,
					ConsolPlugin.INSTANCE.getString("ConditionEntrySeverity"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Health Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryHealthStatusObservation(ConditionEntry conditionEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ConditionEntryHealthStatusObservation"),
					new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryComment(ConditionEntry conditionEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION_ENTRY__CONDITION_ENTRY_COMMENT,
					ConsolPlugin.INSTANCE.getString("ConditionEntryComment"), new Object[] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeObservation(ConditionEntry) <em>Get Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeObservation(ConditionEntry) <em>Get Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AgeObservation getAgeObservation(ConditionEntry conditionEntry) {
		if (GET_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION_ENTRY,
				ConsolPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(70));
			try {
				GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCauseOfDeathObservation(ConditionEntry) <em>Get Cause Of Death Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CauseOfDeathObservation))->asSequence()->first().oclAsType(consol::CauseOfDeathObservation)";

	/**
	 * The cached OCL query for the '{@link #getCauseOfDeathObservation(ConditionEntry) <em>Get Cause Of Death Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CauseOfDeathObservation))->asSequence()->first().oclAsType(consol::CauseOfDeathObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static CauseOfDeathObservation getCauseOfDeathObservation(ConditionEntry conditionEntry) {
		if (GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION_ENTRY,
				ConsolPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(71));
			try {
				GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY = helper.createQuery(GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAUSE_OF_DEATH_OBSERVATION__EOCL_QRY);
		return (CauseOfDeathObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatusObservation(ConditionEntry) <em>Get Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemStatusObservation(ConditionEntry) <em>Get Problem Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemStatusObservation getProblemStatusObservation(ConditionEntry conditionEntry) {
		if (GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION_ENTRY,
				ConsolPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(72));
			try {
				GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverity(ConditionEntry) <em>Get Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Severity))->asSequence()->first().oclAsType(consol::Severity)";

	/**
	 * The cached OCL query for the '{@link #getSeverity(ConditionEntry) <em>Get Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Severity))->asSequence()->first().oclAsType(consol::Severity)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Severity getSeverity(ConditionEntry conditionEntry) {
		if (GET_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION_ENTRY,
				ConsolPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(73));
			try {
				GET_SEVERITY__EOCL_QRY = helper.createQuery(GET_SEVERITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY__EOCL_QRY);
		return (Severity) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusObservation(ConditionEntry) <em>Get Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation))->asSequence()->first().oclAsType(consol::HealthStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getHealthStatusObservation(ConditionEntry) <em>Get Health Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation))->asSequence()->first().oclAsType(consol::HealthStatusObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HealthStatusObservation getHealthStatusObservation(ConditionEntry conditionEntry) {
		if (GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION_ENTRY,
				ConsolPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(74));
			try {
				GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY);
		return (HealthStatusObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(ConditionEntry) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Comment)).oclAsType(consol::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(ConditionEntry) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Comment)).oclAsType(consol::Comment)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Comment> getComments(ConditionEntry conditionEntry) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION_ENTRY,
				ConsolPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(75));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(conditionEntry);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

} // ConditionEntryOperations
