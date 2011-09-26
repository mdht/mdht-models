/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allergies and intolerances are special kinds of problems, and so are also recorded in the CDA
 * &lt;observation> element, with classCode='OBS'. They follow the same pattern as the problem
 * entry, with exceptions noted below.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getAllergyIntolerance()
 * @generated
 */
public interface IAllergyIntolerance extends IProblemEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Allergy Intolerance SHALL contain exactly one [1..1] code (CodeSystem: 2.16.840.1.113883.5.4 ObservationIntoleranceType).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Allergy Intolerance SHALL contain exactly one [1..1] value.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setValue(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Observation MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setAgeObservation(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setSeverity(ISeverity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setProblemStatusObservation(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance setHealthStatusObservation(IHealthStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Problem Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance addComment(IComment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::AllergyIntolerance::problemEntryReactionObservationContainer.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ProblemEntryReactionObservationContainer)).oclAsType(domain::ProblemEntryReactionObservationContainer)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProblemEntryReactionObservationContainer> getProblemEntryReactionObservationContainers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Allergy Intolerance MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="MFST" MFST (is manifestation of), and Contains exactly one [1..1] Problem Entry Reaction Observation Container (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntryReactionObservationContainer addProblemEntryReactionObservationContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Allergy Intolerance MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="MFST" MFST (is manifestation of), and Contains exactly one [1..1] Problem Entry Reaction Observation Container (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance addProblemEntryReactionObservationContainer(IProblemEntryReactionObservationContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergyIntolerance init();
} // IAllergyIntolerance
