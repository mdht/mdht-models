/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IInsuranceProvider#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getInsuranceProvider()
 * @generated
 */
public interface IInsuranceProvider {
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
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getInsuranceProvider_CDAType()
	 * @generated
	 */
	Act getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IInsuranceProvider#getCDAType <em>CDA Type</em>}' reference.
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
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Coverage Activity SHALL contain at least one [1..*] id (CONF-38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Coverage Activity SHALL contain at least one [1..*] id (CONF-38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IInsuranceProvider addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::CoverageEntry::payerEntry.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PayerEntry)).oclAsType(domain::PayerEntry)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IPayerEntry> getPayerEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coverage Entry SHALL contain at least one [1..*] entryRelationship, such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Payer Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.18).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntry addPayerEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coverage Entry SHALL contain at least one [1..*] entryRelationship, such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Payer Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.18).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IInsuranceProvider addPayerEntry(IPayerEntry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInsuranceProvider init();
} // IInsuranceProvider
