/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A problem is a clinical statement that a clinician is particularly concerned about and wants to track. It has important patient management use cases (e.g. health records often present the problem list as a way of summarizing a patient's medical history).
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getICondition()
 * @generated
 */
public interface ICondition extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Act toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain at least one [1..*] <tt><b>id</b></tt> (CONF-148).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::code.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>code</b></tt><tt>/@nullFlavor</tt> = "NA" <i>NA (not applicable)</i> (CONF-149).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setCode(CD value);

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
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>statusCode</b></tt>, which <b>SHALL</b> be selected from ValueSet<tt> ConcernEntryStatus</tt><b> STATIC</b>.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::effectiveTime.
	 * The effectiveTime element records the starting and ending times during which the concern was active.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>effectiveTime</b></tt>.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::episodeObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::EpisodeObservation))->asSequence()->first().oclAsType(apitest::EpisodeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEpisodeObservation getEpisodeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain exactly one [1..1] <tt><b>entryRelationship</b></tt> (CONF-168), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setEpisodeObservation(IEpisodeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::conditionEntry.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::ConditionEntry)).oclAsType(apitest::ConditionEntry)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IConditionEntry> getConditionEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains at least one [1..*] <tt><b>entryRelationship</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition addProblemEntry(IConditionEntry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::treatingProvider.
	 * self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(apitest::Condition::TreatingProvider))->asSequence()->first().oclAsType(apitest::Condition::TreatingProvider)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ITreatingProvider getTreatingProvider();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain zero or one [0..1] <tt><b>performer</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setTreatingProvider(ITreatingProvider value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICondition init();
} // ICondition
