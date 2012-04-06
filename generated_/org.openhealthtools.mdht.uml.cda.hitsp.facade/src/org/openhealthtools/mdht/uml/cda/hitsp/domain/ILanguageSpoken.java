/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Spoken</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getLanguageSpoken()
 * @generated
 */
public interface ILanguageSpoken {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(LanguageCommunication)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getLanguageSpoken_CDAType()
	 * @generated
	 */
	LanguageCommunication getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(LanguageCommunication value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::LanguageCommunication::languageCode.
	 * self.languageCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getLanguageCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Language Spoken SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.11526 Language DYNAMIC (C154-[DE-2.01-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withLanguageCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Language Spoken SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.11526 Language DYNAMIC (C154-[DE-2.01-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ILanguageSpoken setLanguageCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::LanguageCommunication::modeCode.
	 * Mode codes SHALL be appropriate to the type of language. Thus English, as spoken in the U.S. SHOULD use the code en-US and SHOULD only use mode codes for written and verbal communications. On the other hand, American Sign Language would be represented using the code sign-US, and would only use mode codes for signed communication.
	 * self.modeCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getModeCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Language Spoken SHALL contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.12249 LanguageAbilityMode STATIC 1 (C83-[DE-2.01-CDA-4]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withModeCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Language Spoken SHALL contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.12249 LanguageAbilityMode STATIC 1 (C83-[DE-2.01-CDA-4]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ILanguageSpoken setModeCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILanguageSpoken init();
} // ILanguageSpoken
