/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This module contains data describing the patient's Advance Directives and any reference to supporting documentation. This section contains data such as the existence of living wills, healthcare proxies and CPR and resuscitation status. The custodian of these documents may be described.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirective#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getAdvanceDirective()
 * @generated
 */
public interface IAdvanceDirective {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getAdvanceDirective_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirective#getCDAType <em>CDA Type</em>}' reference.
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
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirective addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Advance Directive SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.20.2 Advance Directive Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Advance Directive SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.20.2 Advance Directive Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirective setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Advance Directive SHALL contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Advance Directive SHALL contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirective setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * The advance directive observation may include a <value> element using the Boolean (xsi:type='BL') data type to indicate simply whether the procedure described is permitted. Absence of the the <value> element indicates that an advance directive of the specified type has been recorded, and must be examined to determine what type of treatment should be performed. The value element is not permitted when the <code> element describes an Other directive
	 * self.value.oclAsType(datatypes::BL)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<BL> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Advance Directive Observation Contains zero or more [0..*] value, where its data type is BL.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	BL addValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Advance Directive Observation Contains zero or more [0..*] value, where its data type is BL.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirective addValue(BL value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::AdvanceDirectiveObservation::advanceDirectiveVerification.
	 * self.getParticipant2s()->select(participant2 : cda::Participant2 | not participant2.oclIsUndefined() and participant2.oclIsKindOf(domain::AdvanceDirectiveVerification)).oclAsType(domain::AdvanceDirectiveVerification)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IAdvanceDirectiveVerification> getAdvanceDirectiveVerifications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation MAY contain at least one [1..*] advanceDirectiveVerification, such that Contains exactly one [1..1] Advance Directive Verification (templateId: 2.16.840.1.113883.10.20.1.58).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveVerification addAdvanceDirectiveVerification();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation MAY contain at least one [1..*] advanceDirectiveVerification, such that Contains exactly one [1..1] Advance Directive Verification (templateId: 2.16.840.1.113883.10.20.1.58).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirective addAdvanceDirectiveVerification(IAdvanceDirectiveVerification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::AdvanceDirectiveObservation::advanceDirectiveStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::AdvanceDirectiveStatusObservation))->asSequence()->first().oclAsType(domain::AdvanceDirectiveStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveStatusObservation getAdvanceDirectiveStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation SHALL contain exactly one [1..1] entryRelationship, such that Contains exactly one [1..1] Advance Directive Status Observation (templateId: 2.16.840.1.113883.10.20.1.37).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveStatusObservation withAdvanceDirectiveStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation SHALL contain exactly one [1..1] entryRelationship, such that Contains exactly one [1..1] Advance Directive Status Observation (templateId: 2.16.840.1.113883.10.20.1.37).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirective setAdvanceDirectiveStatusObservation(IAdvanceDirectiveStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::AdvanceDirectiveObservation::advanceDirectiveReference.
	 * self.getExternalDocuments()->select(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(domain::AdvanceDirectiveReference))->asSequence()->first().oclAsType(domain::AdvanceDirectiveReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveReference getAdvanceDirectiveReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation MAY contain zero or one [0..1] advanceDirectiveReference, such that Contains exactly one [1..1] Advance Directive Reference (templateId: 2.16.840.1.113883.10.20.1.36).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveReference withAdvanceDirectiveReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Observation MAY contain zero or one [0..1] advanceDirectiveReference, such that Contains exactly one [1..1] Advance Directive Reference (templateId: 2.16.840.1.113883.10.20.1.36).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirective setAdvanceDirectiveReference(IAdvanceDirectiveReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirective init();
} // IAdvanceDirective
