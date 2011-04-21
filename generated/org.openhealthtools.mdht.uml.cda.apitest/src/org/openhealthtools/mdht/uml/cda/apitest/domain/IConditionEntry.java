/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICondition Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>This section makes use of the linking, severity, clinical status and comment content specifications defined elsewhere in the technical framework. In HL7 RIM parlance, observations about a problem, complaint, symptom, finding, diagnosis, or functional limitation of a patient is the event (moodCode='EVN') of observing (&lt;observation classCode='OBS'>) that problem. The &lt;value> of the observation comes from a controlled vocabulary representing such things. The &lt;code> contained within the &lt;observation> describes the method of determination from yet another controlled vocabulary.</p>
 * 
 * <p>The basic pattern for reporting a problem uses the CDA &lt;observation> element, setting the classCode='OBS' to represent that this is an observation of a problem, and the moodCode='EVN', to represent that this is an observation that has in fact taken place. The negationInd attribute, if true, specifies that the problem indicated was observed to not have occurred (which is subtly but importantly different from having not been observed). The value of negationInd should not normally be set to true. Instead, to record that there is "no prior history of chicken pox", one would use a coded value indicated exactly that. However, it is not always possible to record problems in this manner, especially if using a controlled vocabulary that does not supply pre-coordinated negations , or which do not allow the negation to be recorded with post-coordinated coded terminology.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIConditionEntry()
 * @generated
 */
public interface IConditionEntry extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Observation toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::id.
	 * The specific observation being recorded must have an identifier (&lt;id>) that shall be provided for tracking purposes. If the source EMR does not or cannot supply an intrinsic identifier, then a GUID shall be provided as the root, with no extension (e.g., &lt;id root='CE1215CD-69EC-4C7B-805F-569233C5E159'/>). At least one identifier must be present, more than one may appear.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain at least one [1..*] <tt><b>id</b></tt>.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IConditionEntry addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHOULD</b> contain exactly one [1..1] <tt><b>code</b></tt>, which <b>SHOULD</b> be selected from ValueSet<tt> 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type</tt><b> STATIC</b> 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setProblemType(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * The &lt;text> element is required and points to the text describing the problem being recorded; including any dates, comments, et cetera. The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>text</b></tt>.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setProblemName(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * The &lt;effectiveTime> of this &lt;observation> is the time interval over which the &lt;observation> is known to be true. The &lt;low> and &lt;high> values should be no more precise than known, but as precise as possible. While CDA allows for multiple mechanisms to record this time interval (e.g., by low and high values, low and width, high and width, or center point and width), we are constraining Medical summaries to use only the low/high form. The &lt;low> value is the earliest point for which the condition is known to have existed. The &lt;high> value, when present, indicates the time at which the observation was no longer known to be true. Thus, the implication is made that if the &lt;high> value is specified, that the observation was no longer seen after this time, and it thus represents the date of resolution of the problem. Similarly, the &lt;low> value may seem to represent onset of the problem. Neither of these statements is necessarily precise, as the &lt;low> and &lt;high> values may represent only an approximation of the true onset and resolution (respectively) times. For example, it may be the case that onset occurred prior to the &lt;low> value, but no observation may have been possible before that time to discern whether the condition existed prior to that time. The &lt;low> value should normally be present. There are exceptions, such as for the case where the patient may be able to report that they had chicken pox, but are unsure when. In this case, the &lt;effectiveTime> element shall have a &lt;low> element with a nullFlavor attribute set to 'UNK'. The &lt;high> value need not be present when the observation is about a state of the patient that is unlikely to change (e.g., the diagnosis of an incurable disease).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getProblemDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHOULD</b> contain exactly one [1..1] <tt><b>effectiveTime</b></tt>.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setProblemDate(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>value</b></tt>, which <b>SHALL</b> be selected from ValueSet<tt> 2.16.840.1.113883.3.88.12.3221.7.4 Problem</tt><b> STATIC</b> 1, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setProblemCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::AgeObservation))->asSequence()->first().oclAsType(apitest::AgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation getAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt> (CONF-160), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setAgeAtOnset(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::severity.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::Severity))->asSequence()->first().oclAsType(apitest::Severity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity getSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setSeverity(ISeverity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::problemStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::ProblemStatusObservation))->asSequence()->first().oclAsType(apitest::ProblemStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation getProblemStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setProblemStatus(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::healthStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::HealthStatusObservation))->asSequence()->first().oclAsType(apitest::HealthStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHealthStatusObservation getHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setHealthStatusObservation(IHealthStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::comment.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(apitest::Comment)).oclAsType(apitest::Comment)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IComment> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain zero or more [0..*] <tt><b>entryRelationship</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IConditionEntry addComment(IComment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::causeOfDeathObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::CauseOfDeathObservation))->asSequence()->first().oclAsType(apitest::CauseOfDeathObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation getCauseOfDeathObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setCauseOfDeath(ICauseOfDeathObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConditionEntry init();
} // IConditionEntry
