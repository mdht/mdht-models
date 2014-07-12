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
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medical Equipment Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Medical Equipment section contains information describing a patient's implanted and external medical
 *     devices and equipment that their health status depends on, as well as any pertinent equipment or device history. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getMedicalEquipmentSection()
 * @generated
 */
public interface IMedicalEquipmentSection {
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
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getMedicalEquipmentSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection#getCDAType <em>CDA Type</em>}' reference.
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
	 * CCD Medical Equipment Section SHALL contain exactly one [1..1] title (CONF-CCD-521).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medical Equipment Section SHALL contain exactly one [1..1] title (CONF-CCD-521).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicalEquipmentSection setTitle(ST value);

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
	 * CCD Medical Equipment Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medical Equipment Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicalEquipmentSection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicalEquipmentSection::supplyActivity.
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(domain::SupplyActivity)).oclAsType(domain::SupplyActivity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<ISupplyActivity> getSupplyActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medical Equipment Section SHOULD contain zero or more [0..*] entry, such that Contains exactly one [1..1] Supply Activity (templateId: 2.16.840.1.113883.10.20.1.34).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity addSupplyActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medical Equipment Section SHOULD contain zero or more [0..*] entry, such that Contains exactly one [1..1] Supply Activity (templateId: 2.16.840.1.113883.10.20.1.34).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicalEquipmentSection addSupplyActivity(ISupplyActivity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicalEquipmentSection::medicationActivity.
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::MedicationActivity)).oclAsType(domain::MedicationActivity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IMedicationActivity> getMedicationActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medical Equipment Section MAY contain zero or more [0..*] entry, such that Contains exactly one [1..1] Medication Activity (templateId: 2.16.840.1.113883.10.20.1.24).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addMedicationActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medical Equipment Section MAY contain zero or more [0..*] entry, such that Contains exactly one [1..1] Medication Activity (templateId: 2.16.840.1.113883.10.20.1.24).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicalEquipmentSection addMedicationActivity(IMedicationActivity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicalEquipmentSection init();
} // IMedicalEquipmentSection
