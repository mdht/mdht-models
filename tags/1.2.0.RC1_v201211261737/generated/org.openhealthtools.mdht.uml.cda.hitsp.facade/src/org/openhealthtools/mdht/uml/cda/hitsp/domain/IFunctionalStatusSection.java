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

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Functional Status Section provides information about the capability of the patient to perform acts
 *     of daily living. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <p>
 *     <i>Functional Status</i> describes the patient's status of normal functioning at the time the Care Record
 *     was created. Functional statuses include information regarding the patient relative to:
 * </p>
 * 
 *     <ul><li>Ambulatory ability</li>
 *        <li>Mental status or competency</li>
 *         <li>Activities of Daily Living (ADLs), including bathing, dressing, feeding, grooming</li>
 *         <li>Home / living situation having an effect on the health status of the patient</li>
 *         <li>Ability to care for self</li>
 *         <li>Social activity, including issues with social cognition, participation with
 *         friends and acquaintances other than family members</li>
 *        <li>Occupation activity, including activities partly or directly related to working, housework or volunteering, family
 *         and home responsibilities or activities related to home and family</li>
 *       <li>Communication ability, including issues with speech, writing or cognition required for communication</li>
 *        <li> Perception, including sight, hearing, taste, skin sensation, kinesthetic sense, proprioception, or
 *         balance</li>
 * </ul>
 * <p>
 *     Any
 *     deviation from normal function that the patient displays and is recorded in the record should be included. Of
 *     particular interest are those limitations that would in any way interfere with self care or the medical therapeutic
 *     process. In addition, an improvement, any change in or noting that the patient has normal functioning status is also
 *     valid for inclusion.
 * </p>
 * <p>Functional Statuses can be expressed in 3 different forms. They can occur as a Problem, a Result or as text. Text can be employed if and only if the Functional Status is neither a Problem nor a Result. Functional Statuses expressed as Problems include relevant clinical conditions, diagnoses, symptoms and findings. Results are the interpretation or conclusion derived from a clinical assessment or test battery, such as the Instrumental Activities of Daily Living (IADL) scale or the Functional Status Index (FSI).
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getFunctionalStatusSection()
 * @generated
 */
public interface IFunctionalStatusSection {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Section)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getFunctionalStatusSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::title.
	 * self.title.oclAsType(datatypes::ST)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Functional Status Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Functional Status Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFunctionalStatusSection setTitle(ST value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::text.
	 * self.text.oclAsType(cda::StrucDocText)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Functional Status Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Functional Status Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFunctionalStatusSection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunctionalStatusSection init();
} // IFunctionalStatusSection
