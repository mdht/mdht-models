/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergies Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Allergies and Other Adverse Reactions Section contains data on the substance intolerances and the
 *     associated adverse reactions suffered by the patient. At a minimum, currently active and any relevant historical
 *     allergies and adverse reactions shall be listed. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getAllergiesReactionsSection()
 * @generated
 */
public interface IAllergiesReactionsSection {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getAllergiesReactionsSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection#getCDAType <em>CDA Type</em>}' reference.
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
	 * CCD Alerts Section SHALL contain exactly one [1..1] title (CONF-260).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Alerts Section SHALL contain exactly one [1..1] title (CONF-260).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergiesReactionsSection setTitle(ST value);

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
	 * CCD Alerts Section SHALL contain exactly one [1..1] text (CONF-256).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Alerts Section SHALL contain exactly one [1..1] text (CONF-256).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergiesReactionsSection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::AllergiesReactionsSection::allergyDrugSensitivity.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::AllergyDrugSensitivity)).oclAsType(domain::AllergyDrugSensitivity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IAllergyDrugSensitivity> getAllergyDrugSensitivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Allergies Reactions Section SHALL contain at least one [1..*] entry, such that Contains exactly one [1..1] Allergy Drug Sensitivity (templateId: 2.16.840.1.113883.3.88.11.83.6).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyDrugSensitivity addAllergyDrugSensitivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Allergies Reactions Section SHALL contain at least one [1..*] entry, such that Contains exactly one [1..1] Allergy Drug Sensitivity (templateId: 2.16.840.1.113883.3.88.11.83.6).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergiesReactionsSection addAllergyDrugSensitivity(IAllergyDrugSensitivity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection init();
} // IAllergiesReactionsSection
