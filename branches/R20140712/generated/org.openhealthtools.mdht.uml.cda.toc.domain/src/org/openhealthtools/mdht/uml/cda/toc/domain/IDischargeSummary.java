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
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discharge Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getDischargeSummary()
 * @generated
 */
public interface IDischargeSummary {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(ClinicalDocument)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getDischargeSummary_CDAType()
	 * @generated
	 */
	ClinicalDocument getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(ClinicalDocument value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::typeId.
	 * The clinical document type ID identifies the constraints imposed by CDA R2 on the
	 * content, essentially acting as a version identifier.
	 * self.typeId.oclAsType(cda::InfrastructureRootTypeId)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] typeId (CONF-HP-16).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InfrastructureRootTypeId withTypeId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] typeId (CONF-HP-16).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setTypeId(InfrastructureRootTypeId value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::id.
	 * The ClinicalDocument/id element is an instance identifier data type (see HL7 Version 3
	 * Abstract Data in Section 5 REFERENCES). The root attribute is a UUID or OID. The
	 * root uniquely identifies the scope of the extension. The root and extension attributes
	 * uniquely identify the document.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] id (CONF-HP-17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II withId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] id (CONF-HP-17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::code.
	 * Specifies the type of the clinical document.
	 * self.code.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] code (CONF-HP-21).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] code (CONF-HP-21).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::title.
	 * Specifies the local name used for the document.
	 * Note that the title does not need to be the same as the display name provided with the
	 * document type code. For example, the display name provided by LOINC&#174; as an aid in
	 * debugging may be "HISTORY AND PHYSICAL." The title can be localized, as appropriate.
	 * self.title.oclAsType(datatypes::ST)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] title (CONF-HP-22).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] title (CONF-HP-22).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setTitle(ST value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::effectiveTime.
	 * Specifies the creation time of the document. All documents
	 * authored by direct input to a computer system should record an effectiveTime that is
	 * precise to the second. When authored in other ways, for example, by filling out a
	 * paper form that is then transferred into an EHR system, the precision of
	 * effectiveTime may be less than to the second.
	 * self.effectiveTime.oclAsType(datatypes::TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] effectiveTime (CONF-HP-23).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] effectiveTime (CONF-HP-23).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setEffectiveTime(TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::confidentialityCode.
	 * Specifies the confidentiality assigned to the document. This specification provides no further guidance beyond CDA R2
	 * on documents with respect to the vocabulary used for confidentialityCode, nor
	 * treatment or implementation of confidentiality.
	 * self.confidentialityCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getConfidentialityCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains exactly one [1..1] confidentialityCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withConfidentialityCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains exactly one [1..1] confidentialityCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setConfidentialityCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::languageCode.
	 * self.languageCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getLanguageCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] languageCode (CONF-HP-24).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withLanguageCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] languageCode (CONF-HP-24).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setLanguageCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::recordTarget.
	 * self.getRecordTargets()->select(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget)).oclAsType(cda::RecordTarget)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<RecordTarget> getRecordTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] recordTarget, where its type is Record Target.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	RecordTarget addRecordTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] recordTarget, where its type is Record Target.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary addRecordTarget(RecordTarget value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::author.
	 * self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)).oclAsType(cda::Author)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<Author> getAuthors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] author, where its type is Author.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Author addAuthor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] author, where its type is Author.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary addAuthor(Author value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::custodian.
	 * self.getCustodians()->select(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))->asSequence()->first().oclAsType(cda::Custodian)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Custodian getCustodian();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] custodian, where its type is Custodian.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Custodian withCustodian();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] custodian, where its type is Custodian.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setCustodian(Custodian value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::component.
	 * self.getComponent2s()->select(component2 : cda::Component2 | not component2.oclIsUndefined() and component2.oclIsKindOf(cda::Component2))->asSequence()->first().oclAsType(cda::Component2)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Component2 getComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] component, where its type is Component2.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Component2 withComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] component, where its type is Component2.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setComponent(Component2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::dataEnterer.
	 * <p>The dataEnterer element represents the person who transferred the information from
	 * other sources into the clinical document, where the other sources wrote the content of
	 * the note. The guiding rule of thumb is that an author provides the content found
	 * within the header or body of the document, subject to their own interpretation. The
	 * dataEnterer adds information to the electronic system. A person can participate as
	 * both author and dataEnterer.</p>
	 * <p>If the role of the actor is to transfer information from one source to another (e.g.,
	 * transcription or transfer from paper form to electronic system), that actor is considered
	 * a dataEnterer.</p>
	 * self.getDataEnterers()->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->asSequence()->first().oclAsType(cda::DataEnterer)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	DataEnterer getDataEnterer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or one [0..1] dataEnterer, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	DataEnterer withDataEnterer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or one [0..1] dataEnterer, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setDataEnterer(DataEnterer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::informationRecipient.
	 * informationRecipient, when used in the context of a referral or request for consultation,
	 * this records the intended recipient of the information at the time the document is
	 * created. The intended recipient may also be the health chart of the patient, in which
	 * case the receivedOrganization is the scoping organization of that chart.
	 * self.getInformationRecipients()->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient)).oclAsType(cda::InformationRecipient)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<InformationRecipient> getInformationRecipients();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or more [0..*] informationRecipient, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InformationRecipient addInformationRecipient();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or more [0..*] informationRecipient, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary addInformationRecipient(InformationRecipient value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::legalAuthenticator.
	 * <p>The legalAuthenticator element identifies the legal authenticator of the document and
	 * must be present if the document has been legally authenticated. Based on local
	 * practice, clinical documents may be released before legal authentication. This implies
	 * that a clinical document that does not contain this element has not been legally
	 * authenticated.</p>
	 * <p>The act of legal authentication requires a certain privilege be granted to the legal
	 * authenticator depending upon local policy. All clinical documents have the potential for
	 * legal authentication, given the appropriate credentials.</p>
	 * <p>Local policies may choose to delegate the function of legal authentication to a device or
	 * system that generates the clinical document. In these cases, the legal authenticator is
	 * a person accepting responsibility for the document, not the generating device or system.</p>
	 * self.getLegalAuthenticators()->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->asSequence()->first().oclAsType(cda::LegalAuthenticator)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	LegalAuthenticator getLegalAuthenticator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or one [0..1] legalAuthenticator, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	LegalAuthenticator withLegalAuthenticator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or one [0..1] legalAuthenticator, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setLegalAuthenticator(LegalAuthenticator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::authenticator.
	 * <p>The authenticator identifies the participant who attested to the accuracy of the
	 * information in the document.</p>
	 * <p>Automated systems, such as a PHR, that allow a clinical document to be generated need to give
	 * special consideration to authentication permissions because the information contained in the
	 * document may come from sources or contain information that the author cannot validate.</p>
	 * self.getAuthenticators()->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator)).oclAsType(cda::Authenticator)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<Authenticator> getAuthenticators();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or more [0..*] authenticator, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Authenticator addAuthenticator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or more [0..*] authenticator, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary addAuthenticator(Authenticator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::allergiesReactionsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AllergiesReactionsSection))->asSequence()->first().oclAsType(domain::AllergiesReactionsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergiesReactionsSection getAllergies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Allergies Reactions Section (templateId: 2.16.840.1.113883.3.88.11.83.102).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergiesReactionsSection withAllergies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Allergies Reactions Section (templateId: 2.16.840.1.113883.3.88.11.83.102).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setAllergies(IAllergiesReactionsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::problemListSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ProblemListSection))->asSequence()->first().oclAsType(domain::ProblemListSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemListSection getActiveProblems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Problem List Section (templateId: 2.16.840.1.113883.3.88.11.83.103).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemListSection withActiveProblems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Problem List Section (templateId: 2.16.840.1.113883.3.88.11.83.103).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setActiveProblems(IProblemListSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::hospitalCourseSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalCourseSection))->asSequence()->first().oclAsType(domain::HospitalCourseSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalCourseSection getHospitalCourse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Hospital Course Section (templateId: 2.16.840.1.113883.3.88.11.83.121).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalCourseSection withHospitalCourse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Hospital Course Section (templateId: 2.16.840.1.113883.3.88.11.83.121).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setHospitalCourse(IHospitalCourseSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::hospitalDischargeMedicationsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalDischargeMedicationsSection))->asSequence()->first().oclAsType(domain::HospitalDischargeMedicationsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalDischargeMedicationsSection getDischargeMeds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Hospital Discharge Medications Section (templateId: 2.16.840.1.113883.3.88.11.83.114).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalDischargeMedicationsSection withDischargeMeds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Hospital Discharge Medications Section (templateId: 2.16.840.1.113883.3.88.11.83.114).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setDischargeMeds(IHospitalDischargeMedicationsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::dischargeDiagnosisSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::DischargeDiagnosisSection))->asSequence()->first().oclAsType(domain::DischargeDiagnosisSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeDiagnosisSection getDischargeDiagnosis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Discharge Diagnosis Section (templateId: 2.16.840.1.113883.3.88.11.83.111).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeDiagnosisSection withDischargeDiagnosis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Discharge Diagnosis Section (templateId: 2.16.840.1.113883.3.88.11.83.111).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setDischargeDiagnosis(IDischargeDiagnosisSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::planOfCareSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::PlanOfCareSection))->asSequence()->first().oclAsType(domain::PlanOfCareSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection getPlanOfCare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Plan Of Care Section (templateId: 2.16.840.1.113883.3.88.11.83.124).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection withPlanOfCare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Plan Of Care Section (templateId: 2.16.840.1.113883.3.88.11.83.124).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setPlanOfCare(IPlanOfCareSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::surgeriesSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::SurgeriesSection))->asSequence()->first().oclAsType(domain::SurgeriesSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection getSurgeries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Surgeries Section (templateId: 2.16.840.1.113883.3.88.11.83.108).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection withSurgeries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Surgeries Section (templateId: 2.16.840.1.113883.3.88.11.83.108).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setSurgeries(ISurgeriesSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::chiefComplaintSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ChiefComplaintSection))->asSequence()->first().oclAsType(domain::ChiefComplaintSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IChiefComplaintSection getChiefComplaint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Chief Complaint Section (templateId: 2.16.840.1.113883.3.88.11.83.105).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IChiefComplaintSection withChiefComplaint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Chief Complaint Section (templateId: 2.16.840.1.113883.3.88.11.83.105).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setChiefComplaint(IChiefComplaintSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::dischargeDiet.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::DischargeDiet))->asSequence()->first().oclAsType(domain::DischargeDiet)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeDiet getDischargeDiet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] IHE Discharge Diet (templateId: 1.3.6.1.4.1.19376.1.5.3.1.3.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeDiet withDischargeDiet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] IHE Discharge Diet (templateId: 1.3.6.1.4.1.19376.1.5.3.1.3.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setDischargeDiet(IDischargeDiet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::familyHistorySection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::FamilyHistorySection))->asSequence()->first().oclAsType(domain::FamilyHistorySection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistorySection getFamilyHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Family History Section (templateId: 2.16.840.1.113883.3.88.11.83.125).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistorySection withFamilyHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Family History Section (templateId: 2.16.840.1.113883.3.88.11.83.125).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setFamilyHistory(IFamilyHistorySection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::functionalStatusSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::FunctionalStatusSection))->asSequence()->first().oclAsType(domain::FunctionalStatusSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFunctionalStatusSection getFunctionalStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Functional Status Section (templateId: 2.16.840.1.113883.3.88.11.83.109).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFunctionalStatusSection withFunctionalStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Functional Status Section (templateId: 2.16.840.1.113883.3.88.11.83.109).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setFunctionalStatus(IFunctionalStatusSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::historyOfPresentIllness.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HistoryOfPresentIllness))->asSequence()->first().oclAsType(domain::HistoryOfPresentIllness)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHistoryOfPresentIllness getHistoryOfPresentIllness();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP History Of Present Illness (templateId: 2.16.840.1.113883.3.88.11.83.107).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHistoryOfPresentIllness withHistoryOfPresentIllness();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP History Of Present Illness (templateId: 2.16.840.1.113883.3.88.11.83.107).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setHistoryOfPresentIllness(IHistoryOfPresentIllness value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::hospitalDischargePhysical.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalDischargePhysical))->asSequence()->first().oclAsType(domain::HospitalDischargePhysical)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalDischargePhysical getHospitalDischargePhysical();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] IHE Hospital Discharge Physical (templateId: 1.3.6.1.4.1.19376.1.5.3.1.3.26).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalDischargePhysical withHospitalDischargePhysical();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] IHE Hospital Discharge Physical (templateId: 1.3.6.1.4.1.19376.1.5.3.1.3.26).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setHospitalDischargePhysical(IHospitalDischargePhysical value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::hospitalDischargeStudiesSummarySection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalDischargeStudiesSummarySection))->asSequence()->first().oclAsType(domain::HospitalDischargeStudiesSummarySection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] CDT Hospital Discharge Studies Summary Section (templateId: 2.16.840.1.113883.10.20.16.2.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHospitalDischargeStudiesSummarySection withHospitalDischargeStudiesSummary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] CDT Hospital Discharge Studies Summary Section (templateId: 2.16.840.1.113883.10.20.16.2.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setHospitalDischargeStudiesSummary(IHospitalDischargeStudiesSummarySection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::immunizationsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ImmunizationsSection))->asSequence()->first().oclAsType(domain::ImmunizationsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunizationsSection getImmunizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Immunizations Section (templateId: 2.16.840.1.113883.3.88.11.83.117).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunizationsSection withImmunizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Immunizations Section (templateId: 2.16.840.1.113883.3.88.11.83.117).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setImmunizations(IImmunizationsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::reviewOfSystemsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ReviewOfSystemsSection))->asSequence()->first().oclAsType(domain::ReviewOfSystemsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IReviewOfSystemsSection getReviewOfSystems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Review Of Systems Section (templateId: 2.16.840.1.113883.3.88.11.83.120).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IReviewOfSystemsSection withReviewOfSystems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Review Of Systems Section (templateId: 2.16.840.1.113883.3.88.11.83.120).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setReviewOfSystems(IReviewOfSystemsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::socialHistorySection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::SocialHistorySection))->asSequence()->first().oclAsType(domain::SocialHistorySection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistorySection getSocialHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Social History Section (templateId: 2.16.840.1.113883.3.88.11.83.126).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistorySection withSocialHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Social History Section (templateId: 2.16.840.1.113883.3.88.11.83.126).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setSocialHistory(ISocialHistorySection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeSummary::vitalSignsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VitalSignsSection))->asSequence()->first().oclAsType(domain::VitalSignsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsSection getVitalSigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Vital Signs Section (templateId: 2.16.840.1.113883.3.88.11.83.119).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsSection withVitalSigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Summary SHOULD contain zero or one [0..1] component, such that Contains exactly one [1..1] HITSP Vital Signs Section (templateId: 2.16.840.1.113883.3.88.11.83.119).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeSummary setVitalSigns(IVitalSignsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary init();
} // IDischargeSummary
