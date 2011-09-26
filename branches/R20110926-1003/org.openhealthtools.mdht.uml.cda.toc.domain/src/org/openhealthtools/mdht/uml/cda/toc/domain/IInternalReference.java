/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>CDA and HL7 Version 3 Entries may reference (point to) information contained in other entries
 * within the same document or message
 * </p>
 * <p>
 * The act being referred to can be any CDA Clinical Statement element type (act, procedure,
 * observation, substanceAdministration, supply, et cetera). For compatibility with the Clinical
 * Statement model the internal reference shall always use the &lt;act> class, regardless of the XML
 * element type of the act it refers to.
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getInternalReference()
 * @generated
 */
public interface IInternalReference {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Act)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getInternalReference_CDAType()
	 * @generated
	 */
	Act getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Act value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::id.
	 * This element shall be present. The root and extension attributes shall identify an element defined
	 * elsewhere in the same document.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Internal Reference SHALL contain zero or more [0..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Internal Reference SHALL contain zero or more [0..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IInternalReference addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::code.
	 * This element shall be present. It shall be valued when the internal reference is to element that has
	 * a &lt;code> element, and shall have the same attributes as the &lt;code> element in the act it
	 * references. If the element it references does not have a &lt;code> element, then the nullFlavor
	 * attribute should be set to "NA".
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Internal Reference SHALL contain exactly one [1..1] code.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Internal Reference SHALL contain exactly one [1..1] code.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IInternalReference setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInternalReference init();
} // IInternalReference
