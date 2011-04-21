/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

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
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.Condition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getIds() <em>Get Ids</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#addId(org.openhealthtools.mdht.uml.hl7.datatypes.II) <em>Add Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getCode() <em>Get Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#setCode(org.openhealthtools.mdht.uml.hl7.datatypes.CD) <em>Set Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getStatusCode() <em>Get Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#setStatusCode(org.openhealthtools.mdht.uml.hl7.datatypes.CS) <em>Set Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getEffectiveTime() <em>Get Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#setEffectiveTime(org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS) <em>Set Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#setEpisodeObservation(org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation) <em>Set Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getConditionEntries() <em>Get Condition Entries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#addProblemEntry(org.openhealthtools.mdht.uml.cda.apitest.domain.IConditionEntry) <em>Add Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getTreatingProvider() <em>Get Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#setTreatingProvider(org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider) <em>Set Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionSubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionHasProviderTreatmentTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionTreatingProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Treating Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Act toCDAType(Condition condition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::id.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<II> getIds(Condition condition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain at least one [1..*] <tt><b>id</b></tt> (CONF-148).
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition addId(Condition condition, II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::code.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD getCode(Condition condition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>code</b></tt><tt>/@nullFlavor</tt> = "NA" <i>NA (not applicable)</i> (CONF-149).
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setCode(Condition condition, CD value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::statusCode.
	 * <p>
	 * The statusCode associated with any concern must be one of the following values:
	 * </p>
	 * <p>
	 * <b>active</b>: A concern that is still being tracked.
	 * <b>suspended</b>: A concern that is active, but which may be set aside. For example, this value might be used to suspend concern
	 * about a patient problem after some period of remission, but before assumption that the concern has been resolved.
	 * <b>aborted</b>: A concern that is no longer actively being tracked, but for reasons other than because the problem was resolved.
	 * This value might be used to mark a concern as being aborted after a patient leaves care against medical advice.
	 * <b>completed</b>:
	 * The problem, allergy or medical state has been resolved and the concern no longer needs to be tracked except for
	 * historical purposes.
	 * </p>
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CS getStatusCode(Condition condition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>statusCode</b></tt>, which <b>SHALL</b> be selected from ValueSet<tt> ConcernEntryStatus</tt><b> STATIC</b>.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setStatusCode(Condition condition, CS value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::effectiveTime.
	 * The effectiveTime element records the starting and ending times during which the concern was active.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IVL_TS getEffectiveTime(Condition condition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>effectiveTime</b></tt>.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setEffectiveTime(Condition condition, IVL_TS value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getEpisodeObservation(Condition) <em>Get Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EPISODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::EpisodeObservation))->asSequence()->first().oclAsType(apitest::EpisodeObservation)";

	/**
	 * The cached OCL query for the '{@link #getEpisodeObservation(Condition) <em>Get Episode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EPISODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::episodeObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::EpisodeObservation))->asSequence()->first().oclAsType(apitest::EpisodeObservation)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IEpisodeObservation getEpisodeObservation(Condition condition) {
		if (GET_EPISODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.ICONDITION, DomainPackage.Literals.ICONDITION.getEAllOperations().get(9));
			try {
				GET_EPISODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EPISODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EPISODE_OBSERVATION__EOCL_QRY);
		return (IEpisodeObservation) query.evaluate(condition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain exactly one [1..1] <tt><b>entryRelationship</b></tt> (CONF-168), such that.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setEpisodeObservation(Condition condition, IEpisodeObservation value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getConditionEntries(Condition) <em>Get Condition Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionEntries(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITION_ENTRIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::ConditionEntry)).oclAsType(apitest::ConditionEntry)";

	/**
	 * The cached OCL query for the '{@link #getConditionEntries(Condition) <em>Get Condition Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionEntries(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITION_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::conditionEntry.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::ConditionEntry)).oclAsType(apitest::ConditionEntry)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<IConditionEntry> getConditionEntries(Condition condition) {
		if (GET_CONDITION_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.ICONDITION, DomainPackage.Literals.ICONDITION.getEAllOperations().get(11));
			try {
				GET_CONDITION_ENTRIES__EOCL_QRY = helper.createQuery(GET_CONDITION_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITION_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IConditionEntry> result = (Collection<IConditionEntry>) query.evaluate(condition);
		return new BasicEList.UnmodifiableEList<IConditionEntry>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains at least one [1..*] <tt><b>entryRelationship</b></tt>, such that.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition addProblemEntry(Condition condition, IConditionEntry value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getTreatingProvider(Condition) <em>Get Treating Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatingProvider(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TREATING_PROVIDER__EOCL_EXP = "self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(apitest::Condition::TreatingProvider))->asSequence()->first().oclAsType(apitest::Condition::TreatingProvider)";

	/**
	 * The cached OCL query for the '{@link #getTreatingProvider(Condition) <em>Get Treating Provider</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatingProvider(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TREATING_PROVIDER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::treatingProvider.
	 * self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(apitest::Condition::TreatingProvider))->asSequence()->first().oclAsType(apitest::Condition::TreatingProvider)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ITreatingProvider getTreatingProvider(Condition condition) {
		if (GET_TREATING_PROVIDER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.ICONDITION, DomainPackage.Literals.ICONDITION.getEAllOperations().get(13));
			try {
				GET_TREATING_PROVIDER__EOCL_QRY = helper.createQuery(GET_TREATING_PROVIDER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TREATING_PROVIDER__EOCL_QRY);
		return (ITreatingProvider) query.evaluate(condition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain zero or one [0..1] <tt><b>performer</b></tt>, such that.
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setTreatingProvider(Condition condition, ITreatingProvider value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->isEmpty()
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryRelationshipRequired(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_ENTRY_RELATIONSHIP_REQUIRED,
						 APITestPlugin.INSTANCE.getString("ConditionEntryRelationshipRequired"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and "+
"  (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionSubjectOfTarget(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_SUBJECT_OF_TARGET,
						 APITestPlugin.INSTANCE.getString("ConditionSubjectOfTarget"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionContainsProblemObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CONTAINS_PROBLEM_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionContainsProblemObservation"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionContainsAlertObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CONTAINS_ALERT_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionContainsAlertObservation"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionContainsPatientAwareness(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CONTAINS_PATIENT_AWARENESS,
						 APITestPlugin.INSTANCE.getString("ConditionContainsPatientAwareness"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()"+
"   and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())"+
"   and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 *    and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())
	 *    and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEffectiveTimeLowHigh(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_EFFECTIVE_TIME_LOW_HIGH,
						 APITestPlugin.INSTANCE.getString("ConditionEffectiveTimeLowHigh"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionHasProviderTreatmentTime(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_HAS_PROVIDER_TREATMENT_TIME,
						 APITestPlugin.INSTANCE.getString("ConditionHasProviderTreatmentTime"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.7')
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionTemplateId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_TEMPLATE_ID,
						 APITestPlugin.INSTANCE.getString("ConditionTemplateId"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionClassCode(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CLASS_CODE,
						 APITestPlugin.INSTANCE.getString("ConditionClassCode"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionMoodCode(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_MOOD_CODE,
						 APITestPlugin.INSTANCE.getString("ConditionMoodCode"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_ID,
						 APITestPlugin.INSTANCE.getString("ConditionId"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionCodeNullFlavor(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CODE_NULL_FLAVOR,
						 APITestPlugin.INSTANCE.getString("ConditionCodeNullFlavor"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEffectiveTime(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_EFFECTIVE_TIME,
						 APITestPlugin.INSTANCE.getString("ConditionEffectiveTime"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::EpisodeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::EpisodeObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEpisodeObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_EPISODE_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionEpisodeObservation"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Treating Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Treating Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionTreatingProvider(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_TREATING_PROVIDER,
						 APITestPlugin.INSTANCE.getString("ConditionTreatingProvider"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

} // ConditionOperations