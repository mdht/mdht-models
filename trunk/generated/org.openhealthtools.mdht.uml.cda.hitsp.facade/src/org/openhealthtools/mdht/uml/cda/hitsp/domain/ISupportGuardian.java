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

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Guardian</b></em>'.
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSupportGuardian()
 * @generated
 */
public interface ISupportGuardian extends ISupport {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Guardian)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSupportGuardian_CDAType()
	 * @generated
	 */
	Guardian getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Guardian value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Guardian::code.
	 * self.code.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Guardian SHALL contain zero or one [0..1] code (CodeSystem: 2.16.840.1.113883.5.111 RoleCode).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Guardian SHALL contain zero or one [0..1] code (CodeSystem: 2.16.840.1.113883.5.111 RoleCode).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupportGuardian setCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Guardian::addr.
	 * self.addr.oclAsType(datatypes::AD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<AD> getAddrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Guardian SHOULD contain zero or more [0..*] addr.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	AD addAddr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Guardian SHOULD contain zero or more [0..*] addr.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupportGuardian addAddr(AD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Guardian::telecom.
	 * self.telecom.oclAsType(datatypes::TEL)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<TEL> getTelecoms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Guardian SHOULD contain zero or more [0..*] telecom.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	TEL addTelecom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Patient Contact Guardian SHOULD contain zero or more [0..*] telecom.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupportGuardian addTelecom(TEL value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupportGuardian init();
} // ISupportGuardian
