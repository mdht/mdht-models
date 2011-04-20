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
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Entry</b></em>'.
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
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getConditionEntry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConditionEntry extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Observation toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ActClass getClassCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Contains exactly one [1..1] <tt><b>@classCode</b>="OBS" </tt><i>Observation</i> (CodeSystem:<tt> 2.16.840.1.113883.5.6 HL7ActClass</tt>)</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setClassCode(ActClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific observation being recorded must have an identifier (&lt;id>) that shall be provided for tracking purposes. If the source EMR does not or cannot supply an intrinsic identifier, then a GUID shall be provided as the root, with no extension (e.g., &lt;id root='CE1215CD-69EC-4C7B-805F-569233C5E159'/>). At least one identifier must be present, more than one may appear.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHALL</b> contain at least one [1..*] <tt><b>id</b></tt></p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	CD getProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHOULD</b> contain exactly one [1..1] <tt><b>code</b></tt>, which <b>SHOULD</b> be selected from ValueSet<tt> 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type</tt><b> STATIC</b> 1</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setProblemType(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The &lt;text> element is required and points to the text describing the problem being recorded; including any dates, comments, et cetera. The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ED getProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHALL</b> contain exactly one [1..1] <tt><b>text</b></tt></p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setProblemName(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The &lt;effectiveTime> of this &lt;observation> is the time interval over which the &lt;observation> is known to be true. The &lt;low> and &lt;high> values should be no more precise than known, but as precise as possible. While CDA allows for multiple mechanisms to record this time interval (e.g., by low and high values, low and width, high and width, or center point and width), we are constraining Medical summaries to use only the low/high form. The &lt;low> value is the earliest point for which the condition is known to have existed. The &lt;high> value, when present, indicates the time at which the observation was no longer known to be true. Thus, the implication is made that if the &lt;high> value is specified, that the observation was no longer seen after this time, and it thus represents the date of resolution of the problem. Similarly, the &lt;low> value may seem to represent onset of the problem. Neither of these statements is necessarily precise, as the &lt;low> and &lt;high> values may represent only an approximation of the true onset and resolution (respectively) times. For example, it may be the case that onset occurred prior to the &lt;low> value, but no observation may have been possible before that time to discern whether the condition existed prior to that time. The &lt;low> value should normally be present. There are exceptions, such as for the case where the patient may be able to report that they had chicken pox, but are unsure when. In this case, the &lt;effectiveTime> element shall have a &lt;low> element with a nullFlavor attribute set to 'UNK'. The &lt;high> value need not be present when the observation is about a state of the patient that is unlikely to change (e.g., the diagnosis of an incurable disease).
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	IVL_TS getProblemDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHOULD</b> contain exactly one [1..1] <tt><b>effectiveTime</b></tt></p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setProblemDate(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	CD getProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHALL</b> contain exactly one [1..1] <tt><b>value</b></tt>, which <b>SHALL</b> be selected from ValueSet<tt> 2.16.840.1.113883.3.88.12.3221.7.4 Problem</tt><b> STATIC</b> 1, where its data type is CD</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setProblemCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	AgeObservation getAgeAtOnset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt> (CONF-160), such that</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setAgeAtOnset(AgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setSeverity(Severity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ProblemStatusObservation getProblemStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setProblemStatus(ProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	HealthStatusObservation getHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setHealthStatusObservation(HealthStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>MAY</b> contain zero or more [0..*] <tt><b>entryRelationship</b></tt>, such that</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry addComment(Comment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	CauseOfDeathObservation getCauseOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>MAY</b> contain zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ConditionEntry setCauseOfDeath(CauseOfDeathObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEntry init();
} // ConditionEntry
