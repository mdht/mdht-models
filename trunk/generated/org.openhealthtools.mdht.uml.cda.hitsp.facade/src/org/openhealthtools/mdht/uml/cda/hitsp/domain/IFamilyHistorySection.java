/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Family History Section contains information about the genetic family members, to the extent that
 *     they are known, the diseases they suffered from, their ages at death, and other relevant genetic information. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * This section contains data defining the patient's genetic relatives in terms of possible or relevant health risk factors that have a potential impact on the patient's healthcare risk profile.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getFamilyHistorySection()
 * @generated
 */
public interface IFamilyHistorySection {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getFamilyHistorySection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection#getCDAType <em>CDA Type</em>}' reference.
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
	 * CCD Family History Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistorySection setTitle(ST value);

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
	 * CCD Family History Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistorySection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistorySection init();
} // IFamilyHistorySection
