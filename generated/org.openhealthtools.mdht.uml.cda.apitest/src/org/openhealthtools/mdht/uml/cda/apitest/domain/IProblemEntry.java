/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProblem Entry</b></em>'.
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
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIProblemEntry()
 * @generated
 */
public interface IProblemEntry {
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
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain at least one [1..*] id.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * II value = (II) eObject;
	 * getIds().add(value);
	 * return value;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * This is a fixed value indicating the level of medical judgment used to determine the existence of a problem.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * CD value = (CD) eObject;
	 * setCode(value);
	 * return value;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withProblemType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemType(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * <p>This is a text description of the problem suffered.</p>
	 * <p>The &lt;text> element is required and points to the text describing the problem being recorded; including any dates, comments, et cetera. The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.</p>
	 * self.text.oclAsType(datatypes::ED)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] text.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ED value = (ED) eObject;
	 * setText(value);
	 * return value;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED withProblemName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] text.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemName(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * <p>This is the range of time of which the problem was active for the patient or subject.</p>
	 * 
	 * <p>The &lt;effectiveTime> of this &lt;observation> is the time interval over which the &lt;observation> is known to be true. The &lt;low> and &lt;high> values should be no more precise than known, but as precise as possible. While CDA allows for multiple mechanisms to record this time interval (e.g., by low and high values, low and width, high and width, or center point and width), we are constraining Medical summaries to use only the low/high form. The &lt;low> value is the earliest point for which the condition is known to have existed. The &lt;high> value, when present, indicates the time at which the observation was no longer known to be true. Thus, the implication is made that if the &lt;high> value is specified, that the observation was no longer seen after this time, and it thus represents the date of resolution of the problem. Similarly, the &lt;low> value may seem to represent onset of the problem. Neither of these statements is necessarily precise, as the &lt;low> and &lt;high> values may represent only an approximation of the true onset and resolution (respectively) times. For example, it may be the case that onset occurred prior to the &lt;low> value, but no observation may have been possible before that time to discern whether the condition existed prior to that time. The &lt;low> value should normally be present. There are exceptions, such as for the case where the patient may be able to report that they had chicken pox, but are unsure when. In this case, the &lt;effectiveTime> element shall have a &lt;low> element with a nullFlavor attribute set to 'UNK'. The &lt;high> value need not be present when the observation is about a state of the patient that is unlikely to change (e.g., the diagnosis of an incurable disease).</p>
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getProblemDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IVL_TS value = (IVL_TS) eObject;
	 * setEffectiveTime(value);
	 * return value;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withProblemDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemDate(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * This value is a code describing the problem according to a specific vocabulary of problems.
	 * self.value.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1, where its data type is CD.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * CD value = (CD) eObject;
	 * getValues().add(value);
	 * return value;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withProblemCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1, where its data type is CD.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AgeObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IAgeObservation clinicalStatement = (IAgeObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeAtOnset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AgeObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IAgeObservation clinicalStatement = (IAgeObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withAgeAtOnset(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Severity");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ISeverity clinicalStatement = (ISeverity) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity withSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Severity");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ISeverity clinicalStatement = (ISeverity) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withSeverity(ISeverity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IProblemStatusObservation clinicalStatement = (IProblemStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation withProblemStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IProblemStatusObservation clinicalStatement = (IProblemStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemStatus(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HealthStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IHealthStatusObservation clinicalStatement = (IHealthStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHealthStatusObservation withHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HealthStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IHealthStatusObservation clinicalStatement = (IHealthStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withHealthStatusObservation(IHealthStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 2.16.840.1.113883.3.88.11.83.11).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Comment");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IComment clinicalStatement = (IComment) eObject;
	 * clinicalStatement.init();
	 * addAct((org.openhealthtools.mdht.uml.cda.Act)clinicalStatement);
	 * return clinicalStatement;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IComment addComment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 2.16.840.1.113883.3.88.11.83.11).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry addComment(IComment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CauseOfDeathObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ICauseOfDeathObservation clinicalStatement = (ICauseOfDeathObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation withCauseOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CauseOfDeathObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ICauseOfDeathObservation clinicalStatement = (ICauseOfDeathObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withCauseOfDeath(ICauseOfDeathObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry init();
} // IProblemEntry
