/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;
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
public interface ICondition {
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
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain at least one [1..*] id (CONF-148).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain at least one [1..*] id (CONF-148).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] code/@nullFlavor = "NA" NA (not applicable) (CONF-149).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] code/@nullFlavor = "NA" NA (not applicable) (CONF-149).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition withCode(CD value);

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
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ConcernEntryStatus STATIC.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ConcernEntryStatus STATIC.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition withStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::effectiveTime.
	 * The effectiveTime element records the starting and ending times during which the concern was active.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition withEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition MAY contain exactly one [1..1] entryRelationship (CONF-168), such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEpisodeObservation withEpisodeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition MAY contain exactly one [1..1] entryRelationship (CONF-168), such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition withEpisodeObservation(IEpisodeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Condition Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry addProblemEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Condition Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition addProblemEntry(IProblemEntry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain zero or one [0..1] performer, such that Contains exactly one [1..1] Treating Provider.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ITreatingProvider withTreatingProvider();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain zero or one [0..1] performer, such that Contains exactly one [1..1] Treating Provider.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition withTreatingProvider(ITreatingProvider value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICondition init();
} // ICondition
