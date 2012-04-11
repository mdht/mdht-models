/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
 * A representation of the model object '<em><b>Discharge Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getDischargeInstructions()
 * @generated
 */
public interface IDischargeInstructions {
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
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getDischargeInstructions_CDAType()
	 * @generated
	 */
	ClinicalDocument getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions#getCDAType <em>CDA Type</em>}' reference.
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
	IDischargeInstructions setTypeId(InfrastructureRootTypeId value);

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
	IDischargeInstructions setId(II value);

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
	IDischargeInstructions setCode(CE value);

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
	IDischargeInstructions setTitle(ST value);

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
	IDischargeInstructions setEffectiveTime(TS value);

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
	IDischargeInstructions setConfidentialityCode(CE value);

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
	IDischargeInstructions setLanguageCode(CS value);

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
	IDischargeInstructions addRecordTarget(RecordTarget value);

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
	IDischargeInstructions addAuthor(Author value);

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
	IDischargeInstructions setCustodian(Custodian value);

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
	IDischargeInstructions setComponent(Component2 value);

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
	IDischargeInstructions setDataEnterer(DataEnterer value);

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
	IDischargeInstructions addInformationRecipient(InformationRecipient value);

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
	IDischargeInstructions setLegalAuthenticator(LegalAuthenticator value);

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
	IDischargeInstructions addAuthenticator(Authenticator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeInstructions::planOfCareSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::PlanOfCareSection))->asSequence()->first().oclAsType(domain::PlanOfCareSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection getPlanOfCare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Plan Of Care Section (templateId: 2.16.840.1.113883.3.88.11.83.124).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection withPlanOfCare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Plan Of Care Section (templateId: 2.16.840.1.113883.3.88.11.83.124).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeInstructions setPlanOfCare(IPlanOfCareSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeInstructions::allergiesReactionsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AllergiesReactionsSection))->asSequence()->first().oclAsType(domain::AllergiesReactionsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergiesReactionsSection getAllergies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Allergies Reactions Section (templateId: 2.16.840.1.113883.3.88.11.83.102).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergiesReactionsSection withAllergies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Allergies Reactions Section (templateId: 2.16.840.1.113883.3.88.11.83.102).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeInstructions setAllergies(IAllergiesReactionsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeInstructions::problemListSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ProblemListSection))->asSequence()->first().oclAsType(domain::ProblemListSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemListSection getActiveProblems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Problem List Section (templateId: 2.16.840.1.113883.3.88.11.83.103).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemListSection withActiveProblems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Problem List Section (templateId: 2.16.840.1.113883.3.88.11.83.103).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeInstructions setActiveProblems(IProblemListSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeInstructions::dischargeDiagnosisSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::DischargeDiagnosisSection))->asSequence()->first().oclAsType(domain::DischargeDiagnosisSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeDiagnosisSection getDischargeDiagnosis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Discharge Diagnosis Section (templateId: 2.16.840.1.113883.3.88.11.83.111).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeDiagnosisSection withDischargeDiagnosis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Discharge Diagnosis Section (templateId: 2.16.840.1.113883.3.88.11.83.111).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeInstructions setDischargeDiagnosis(IDischargeDiagnosisSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeInstructions::advanceDirectivesSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AdvanceDirectivesSection))->asSequence()->first().oclAsType(domain::AdvanceDirectivesSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectivesSection getAdvanceDirectives();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Advance Directives Section (templateId: 2.16.840.1.113883.3.88.11.83.116).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectivesSection withAdvanceDirectives();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Advance Directives Section (templateId: 2.16.840.1.113883.3.88.11.83.116).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeInstructions setAdvanceDirectives(IAdvanceDirectivesSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeInstructions::immunizationsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ImmunizationsSection))->asSequence()->first().oclAsType(domain::ImmunizationsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunizationsSection getImmunizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Immunizations Section (templateId: 2.16.840.1.113883.3.88.11.83.117).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunizationsSection withImmunizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Immunizations Section (templateId: 2.16.840.1.113883.3.88.11.83.117).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeInstructions setImmunizations(IImmunizationsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * toc::DischargeInstructions::medicalEquipmentSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::MedicalEquipmentSection))->asSequence()->first().oclAsType(domain::MedicalEquipmentSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicalEquipmentSection getMedicalEquipment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Medical Equipment Section (templateId: 2.16.840.1.113883.3.88.11.83.128).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicalEquipmentSection withMedicalEquipment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ToC Discharge Instructions SHALL contain exactly one [1..1] component, such that Contains exactly one [1..1] HITSP Medical Equipment Section (templateId: 2.16.840.1.113883.3.88.11.83.128).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IDischargeInstructions setMedicalEquipment(IMedicalEquipmentSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions init();
} // IDischargeInstructions
