/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classification based on how the medication is
 * marketed (e.g., prescription, over the counter drug)
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getMedicationType()
 * @generated
 */
public interface IMedicationType {
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
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getMedicationType_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType#getCDAType <em>CDA Type</em>}' reference.
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
	 * HITSP Medication Type SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.19 Medication Type STATIC 1 (C83-[DE-8.19-CDA-5], C154-[DE-8.19-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Type SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.19 Medication Type STATIC 1 (C83-[DE-8.19-CDA-5], C154-[DE-8.19-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationType setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationType init();
} // IMedicationType
