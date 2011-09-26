/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reaction represents an adverse event due to an administered or exposed substance. A reaction can be defined with respect to its severity, and can have been treated by one or more interventions. Significant reactions are to be listed in the Alerts section. Reactions in the Medications section can be used to track reactions associated with individual substance administrations or to track routine follow up to an administration (e.g. "no adverse reaction 30 minutes post administration").
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getReactionObservation()
 * @generated
 */
public interface IReactionObservation {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getReactionObservation_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation#getCDAType <em>CDA Type</em>}' reference.
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
	 * CDA Observation Contains exactly one [1..1] code, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Observation Contains exactly one [1..1] code, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IReactionObservation setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ReactionObservation::severityObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::SeverityObservation))->asSequence()->first().oclAsType(domain::SeverityObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverityObservation getSeverityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Reaction Observation MAY contain zero or one [0..1] entryRelationship (CONF-348, CONF-288), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Severity Observation (templateId: 2.16.840.1.113883.10.20.1.55).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverityObservation withSeverityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Reaction Observation MAY contain zero or one [0..1] entryRelationship (CONF-348, CONF-288), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Severity Observation (templateId: 2.16.840.1.113883.10.20.1.55).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IReactionObservation setSeverityObservation(ISeverityObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReactionObservation init();
} // IReactionObservation
