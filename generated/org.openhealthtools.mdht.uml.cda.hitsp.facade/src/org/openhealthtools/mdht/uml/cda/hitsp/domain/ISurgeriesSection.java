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
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surgeries Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSurgeriesSection()
 * @generated
 */
public interface ISurgeriesSection {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSurgeriesSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection#getCDAType <em>CDA Type</em>}' reference.
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
	 * CCD Procedures Section SHALL contain exactly one [1..1] title (CONF-425).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedures Section SHALL contain exactly one [1..1] title (CONF-425).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection setTitle(ST value);

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
	 * CCD Procedures Section SHALL contain exactly one [1..1] text (CONF-422).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedures Section SHALL contain exactly one [1..1] text (CONF-422).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::CodedSurgeriesSection::externalReference.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference))->asSequence()->first().oclAsType(ihe::ExternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ExternalReference getExternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Surgeries Section SHOULD contain zero or one [0..1] entry, such that Contains exactly one [1..1] External Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ExternalReference withExternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Surgeries Section SHOULD contain zero or one [0..1] entry, such that Contains exactly one [1..1] External Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection setExternalReference(ExternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::SurgeriesSection::procedureActivity.
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::Procedure)).oclAsType(domain::Procedure)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProcedure> getProcedureActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Surgeries Section SHALL contain at least one [1..*] entry (C83-[CT-108-2]), such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addProcedureActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Surgeries Section SHALL contain at least one [1..*] entry (C83-[CT-108-2]), such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection addProcedureActivity(IProcedure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISurgeriesSection init();
} // ISurgeriesSection
