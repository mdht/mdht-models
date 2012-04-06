/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>This section makes use of the linking, severity, clinical status and comment content specifications defined elsewhere in the technical framework. In HL7 RIM parlance, observations about a problem, complaint, symptom, finding, diagnosis, or functional limitation of a patient is the event (moodCode='EVN') of observing (&lt;observation classCode='OBS'>) that problem. The &lt;value> of the observation comes from a controlled vocabulary representing such things. The &lt;code> contained within the &lt;observation> describes the method of determination from yet another controlled vocabulary.</p>
 * 
 * <p>The basic pattern for reporting a problem uses the CDA &lt;observation> element, setting the classCode='OBS' to represent that this is an observation of a problem, and the moodCode='EVN', to represent that this is an observation that has in fact taken place. The negationInd attribute, if true, specifies that the problem indicated was observed to not have occurred (which is subtly but importantly different from having not been observed). The value of negationInd should not normally be set to true. Instead, to record that there is "no prior history of chicken pox", one would use a coded value indicated exactly that. However, it is not always possible to record problems in this manner, especially if using a controlled vocabulary that does not supply pre-coordinated negations , or which do not allow the negation to be recorded with post-coordinated coded terminology.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <p>This section makes use of the linking, severity, clinical status and comment content specifications defined elsewhere in the technical framework. In HL7 RIM parlance, observations about a problem, complaint, symptom, finding, diagnosis, or functional limitation of a patient is the event (moodCode='EVN') of observing (&lt;observation classCode='OBS'>) that problem. The &lt;value> of the observation comes from a controlled vocabulary representing such things. The &lt;code> contained within the &lt;observation> describes the method of determination from yet another controlled vocabulary.</p>
 * 
 * <p>The basic pattern for reporting a problem uses the CDA &lt;observation> element, setting the classCode='OBS' to represent that this is an observation of a problem, and the moodCode='EVN', to represent that this is an observation that has in fact taken place. The negationInd attribute, if true, specifies that the problem indicated was observed to not have occurred (which is subtly but importantly different from having not been observed). The value of negationInd should not normally be set to true. Instead, to record that there is "no prior history of chicken pox", one would use a coded value indicated exactly that. However, it is not always possible to record problems in this manner, especially if using a controlled vocabulary that does not supply pre-coordinated negations , or which do not allow the negation to be recorded with post-coordinated coded terminology.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getProblemEntry()
 * @generated
 */
public interface IProblemEntry {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Observation)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getProblemEntry_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Observation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::id.
	 * The specific observation being recorded must have an identifier (&lt;id>) that shall be provided for tracking purposes. If the source EMR does not or cannot supply an intrinsic identifier, then a GUID shall be provided as the root, with no extension (e.g., &lt;id root='CE1215CD-69EC-4C7B-805F-569233C5E159'/>). At least one identifier must be present, more than one may appear.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setProblemType(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * The &lt;text> element is required and points to the text describing the problem being recorded; including any dates, comments, et cetera. The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.
	 * self.text.oclAsType(datatypes::ED)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED withProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setProblemName(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * The &lt;effectiveTime> of this &lt;observation> is the time interval over which the &lt;observation> is known to be true. The &lt;low> and &lt;high> values should be no more precise than known, but as precise as possible. While CDA allows for multiple mechanisms to record this time interval (e.g., by low and high values, low and width, high and width, or center point and width), we are constraining Medical summaries to use only the low/high form. The &lt;low> value is the earliest point for which the condition is known to have existed. The &lt;high> value, when present, indicates the time at which the observation was no longer known to be true. Thus, the implication is made that if the &lt;high> value is specified, that the observation was no longer seen after this time, and it thus represents the date of resolution of the problem. Similarly, the &lt;low> value may seem to represent onset of the problem. Neither of these statements is necessarily precise, as the &lt;low> and &lt;high> values may represent only an approximation of the true onset and resolution (respectively) times. For example, it may be the case that onset occurred prior to the &lt;low> value, but no observation may have been possible before that time to discern whether the condition existed prior to that time. The &lt;low> value should normally be present. There are exceptions, such as for the case where the patient may be able to report that they had chicken pox, but are unsure when. In this case, the &lt;effectiveTime> element shall have a &lt;low> element with a nullFlavor attribute set to 'UNK'. The &lt;high> value need not be present when the observation is about a state of the patient that is unlikely to change (e.g., the diagnosis of an incurable disease).
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * <p>The &lt;value> is the condition that was found. This element is required. While the value may be a coded or an un-coded string, the type is always a coded value (xsi:type='CD'). If coded, the code and codeSystem attributes shall be present. The codeSystem should reference a controlled vocabulary describing problems, complaints, symptoms, findings, diagnoses, or functional limitations, e.g., ICD-9, SNOMED-CT or MEDCIN, or others.</p>
	 * <p>It is recommended that the codeSystemName associated with the codeSystem, and the displayName for the code also be provided for diagnostic and human readability purposes, but this is not required by this profile.</p>
	 * <p>If uncoded, all attributes other than xsi:type='CD' must be absent.</p>
	 * <p>The &lt;value> contains a &lt;reference> to the &lt;originalText> in order to link the coded value to the problem narrative text (minus any dates, comments, et cetera). The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.</p>
	 * self.value.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setProblemCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProblemObservation::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::AgeObservation))->asSequence()->first().oclAsType(domain::AgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation getAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Observation MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Observation MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setAgeObservation(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProblemEntry::severity.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::Severity))->asSequence()->first().oclAsType(domain::Severity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity getSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity withSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setSeverity(ISeverity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProblemEntry::problemStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ProblemStatusObservation))->asSequence()->first().oclAsType(domain::ProblemStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation getProblemStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation withProblemStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setProblemStatusObservation(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProblemEntry::healthStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::HealthStatusObservation))->asSequence()->first().oclAsType(domain::HealthStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHealthStatusObservation getHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHealthStatusObservation withHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setHealthStatusObservation(IHealthStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProblemEntry::comment.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::Comment)).oclAsType(domain::Comment)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IComment> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IComment addComment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry addComment(IComment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::ConditionEntry::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::AgeObservation))->asSequence()->first().oclAsType(domain::AgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation getAgeAtOnset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] CCD Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeAtOnset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] CCD Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setAgeAtOnset(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::ConditionEntry::causeOfDeathObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::CauseOfDeathObservation))->asSequence()->first().oclAsType(domain::CauseOfDeathObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation getCauseOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] CCD Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation withCauseOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] CCD Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setCauseOfDeath(ICauseOfDeathObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::ConditionEntry::problemStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ProblemStatusObservation))->asSequence()->first().oclAsType(domain::ProblemStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation getProblemStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] IHE Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation withProblemStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] IHE Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setProblemStatus(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * The &lt;code> describes the process of establishing a problem. The code element should be used, as the process of determining the value is important to clinicians (e.g., a diagnosis is a more advanced statement than a symptom). When a physical exam observation is being recorded the code used should be "Finding." When a review of systems observation is being recorded the code used should be "Symptom." The recommended vocabulary for describing problems is specified as a value set. Subclasses of this content module may specify other vocabularies.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * The &lt;text> element is required and points to the text describing the problem being recorded; including any dates, comments, et cetera. The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.
	 * self.text.oclAsType(datatypes::ED)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * <p>The &lt;value> is the condition that was found. This element is required. While the value may be a coded or an un-coded string, the type is always a coded value (xsi:type='CD'). If coded, the code and codeSystem attributes shall be present. The codeSystem should reference a controlled vocabulary describing problems, complaints, symptoms, findings, diagnoses, or functional limitations, e.g., ICD-9, SNOMED-CT or MEDCIN, or others.</p>
	 * <p>It is recommended that the codeSystemName associated with the codeSystem, and the displayName for the code also be provided for diagnostic and human readability purposes, but this is not required by this profile.</p>
	 * <p>If uncoded, all attributes other than xsi:type='CD' must be absent.</p>
	 * <p>The &lt;value> contains a &lt;reference> to the &lt;originalText> in order to link the coded value to the problem narrative text (minus any dates, comments, et cetera). The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.</p>
	 * self.value.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain exactly one [1..1] value, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain exactly one [1..1] value, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry setValue(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry init();
} // IProblemEntry
