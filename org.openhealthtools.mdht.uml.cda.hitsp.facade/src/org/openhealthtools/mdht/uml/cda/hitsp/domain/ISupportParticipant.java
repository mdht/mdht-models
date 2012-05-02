/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included. If no healthcare providers are supplied, the reason should be supplied as free text in the narrative block (e.g., Unknown, etc).
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSupportParticipant()
 * @generated
 */
public interface ISupportParticipant extends ISupport {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Participant1)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSupportParticipant_CDAType()
	 * @generated
	 */
	Participant1 getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Participant1 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Participant1::time.
	 * Indicates the time of the participation.
	 * self.time.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Participant MAY contain zero or one [0..1] time.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Participant MAY contain zero or one [0..1] time.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupportParticipant setTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Participant1::associatedEntity.
	 * self.getAssociatedEntities()->select(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity))->asSequence()->first().oclAsType(cda::AssociatedEntity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	AssociatedEntity getAssociatedEntity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Participant1 Contains exactly one [1..1] associatedEntity, where its type is Associated Entity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	AssociatedEntity withAssociatedEntity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Participant1 Contains exactly one [1..1] associatedEntity, where its type is Associated Entity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupportParticipant setAssociatedEntity(AssociatedEntity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupportParticipant init();
} // ISupportParticipant
