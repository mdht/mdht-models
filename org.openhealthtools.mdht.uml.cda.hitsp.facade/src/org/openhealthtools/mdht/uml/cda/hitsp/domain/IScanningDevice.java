/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanning Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the scanning device and software used to produce the scanned content.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanningDevice#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getScanningDevice()
 * @generated
 */
public interface IScanningDevice {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Author)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getScanningDevice_CDAType()
	 * @generated
	 */
	Author getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanningDevice#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Author value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Author::time.
	 * Denotes the time at which the original content was scanned.
	 * self.time.oclAsType(datatypes::TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	TS getTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Scanning Device Contains exactly one [1..1] time.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	TS withTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Scanning Device Contains exactly one [1..1] time.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IScanningDevice setTime(TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Author::assignedAuthor.
	 * self.getAssignedAuthors()->select(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))->asSequence()->first().oclAsType(cda::AssignedAuthor)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	AssignedAuthor getAssignedAuthor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Author Contains exactly one [1..1] assignedAuthor, where its type is Assigned Author.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	AssignedAuthor withAssignedAuthor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Author Contains exactly one [1..1] assignedAuthor, where its type is Assigned Author.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IScanningDevice setAssignedAuthor(AssignedAuthor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IScanningDevice init();
} // IScanningDevice
