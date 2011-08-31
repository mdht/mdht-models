/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directive Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getAdvanceDirectiveVerification()
 * @generated
 */
public interface IAdvanceDirectiveVerification {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Participant2)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getAdvanceDirectiveVerification_CDAType()
	 * @generated
	 */
	Participant2 getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Participant2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Participant2::time.
	 * self.time.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Verification SHOULD contain exactly one [1..1] time.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Verification SHOULD contain exactly one [1..1] time.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveVerification setTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Participant2::participantRole.
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))->asSequence()->first().oclAsType(cda::ParticipantRole)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ParticipantRole getParticipantRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Participant2 Contains exactly one [1..1] participantRole, where its type is Participant Role.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ParticipantRole withParticipantRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Participant2 Contains exactly one [1..1] participantRole, where its type is Participant Role.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveVerification setParticipantRole(ParticipantRole value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveVerification init();
} // IAdvanceDirectiveVerification
