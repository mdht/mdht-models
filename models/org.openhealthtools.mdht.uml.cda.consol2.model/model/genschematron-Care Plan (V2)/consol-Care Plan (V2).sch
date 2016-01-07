<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_informationRecipient_2_1_6-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_informationRecipient_2_1_6-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_informationRecipient_2_1_6-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: CarePlanInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: Care Plan (V2) - 2.1.6 informationRecipient
		Conformance: SHOULD contain zero or more [0..*] informationRecipient (CONF:1198-31993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_authorization_2_1_17-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_authorization_2_1_17-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_authorization_2_1_17-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: Care Plan (V2) - 2.1.17 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:1198-16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_participantCaregiver_2_1_9-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_participantCaregiver_2_1_9-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_participantCaregiver_2_1_9-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::IND)->size() >= 0
			Constraint name: CarePlanParticipantCaregiver
		-->
	<assert test="count(cda:participant[@typeCode = 'IND']) &gt;= 0">Error: Care Plan (V2) - 2.1.9 participantCaregiver
		Conformance: SHOULD contain zero or more [0..*] participant (CONF:1198-31895)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_authenticator_2_1_7-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_authenticator_2_1_7-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_authenticator_2_1_7-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() <= 1
			Constraint name: CarePlanAuthenticator
		-->
	<assert test="count(cda:authenticator) &lt;= 1">Error: Care Plan (V2) - 2.1.7 authenticator
		Conformance: SHOULD contain zero or one [0..1] authenticator (CONF:1198-31910)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_participantCarePlanReview_2_1_8-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_participantCarePlanReview_2_1_8-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_participantCarePlanReview_2_1_8-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::VRF)->size() >= 0
			Constraint name: CarePlanParticipantCarePlanReview
		-->
	<assert test="count(cda:participant[@typeCode = 'VRF']) &gt;= 0">Error: Care Plan (V2) - 2.1.8 participantCarePlanReview
		Conformance: SHOULD contain zero or more [0..*] participant (CONF:1198-31677)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_title_2_1_4-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_title_2_1_4-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_title_2_1_4-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: Care Plan (V2) - 2.1.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1198-5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_effectiveTime_2_1_7-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_effectiveTime_2_1_7-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_effectiveTime_2_1_7-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Care Plan (V2) - 2.1.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_author_2_1_7-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_author_2_1_7-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_author_2_1_7-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: Care Plan (V2) - 2.1.7 author
		Conformance: SHALL contain at least one [1..*] author (CONF:1198-5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_languageCode_2_1_9-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_languageCode_2_1_9-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_languageCode_2_1_9-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: Care Plan (V2) - 2.1.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: Care Plan (V2) - 2.1.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_dataEnterer_2_1_6-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_dataEnterer_2_1_6-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_dataEnterer_2_1_6-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: Care Plan (V2) - 2.1.6 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:1198-5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_realmCode_2_1_3-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_realmCode_2_1_3-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_realmCode_2_1_3-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: Care Plan (V2) - 2.1.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: Care Plan (V2) - 2.1.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_templateId_2_1_1-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_templateId_2_1_1-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_templateId_2_1_1-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.15' and id.extension = '2015-08-01')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.15' and @extension = '2015-08-01'">Error: Care Plan (V2) - 2.1.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-28741, CONF:1198-28742, CONF:1198-32877 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.15&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_id_2_1_4-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_id_2_1_4-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_id_2_1_4-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363, R2.1=CONF:1198-5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_supportParticipant_2_1_15-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_supportParticipant_2_1_15-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_supportParticipant_2_1_15-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: Care Plan (V2) - 2.1.15 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:1198-10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_legalAuthenticator_2_1_10-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_legalAuthenticator_2_1_10-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_legalAuthenticator_2_1_10-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: Care Plan (V2) - 2.1.10 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:1198-5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_recordTarget_2_1_5-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_recordTarget_2_1_5-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_recordTarget_2_1_5-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: Care Plan (V2) - 2.1.5 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:1198-5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_informant_2_1_12-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_informant_2_1_12-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_informant_2_1_12-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: Care Plan (V2) - 2.1.12 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:1198-8001, CONF:1198-31355)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_custodian_2_1_8-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_custodian_2_1_8-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_custodian_2_1_8-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: Care Plan (V2) - 2.1.8 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:1198-5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_code_2_1_3-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_code_2_1_3-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_code_2_1_3-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 2.1.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-28745)/@code=&quot;52521-2&quot; Overall Plan of Care/&#8203;Advance Care Directives (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-28746, CONF:1198-28747)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '52521-2' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code and cda:code[@code = '52521-2' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 2.1.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-28745)/@code=&quot;52521-2&quot; Overall Plan of Care/&#8203;Advance Care Directives (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-28746, CONF:1198-28747)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_confidentialityCode_2_1_8-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_confidentialityCode_2_1_8-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_confidentialityCode_2_1_8-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: Care Plan (V2) - 2.1.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: Care Plan (V2) - 2.1.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_CarePlanDoesNotHavePlanOfTreatmentSectionV2_2_1_14-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_CarePlanDoesNotHavePlanOfTreatmentSectionV2_2_1_14-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_CarePlanDoesNotHavePlanOfTreatmentSectionV2_2_1_14-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.getAllSections()->exists(s : cda::Section | s.oclIsTypeOf(consol::PlanOfTreatmentSection2))
			Constraint name: CarePlanDoesNotHavePlanOfTreatmentSectionV2
		-->
	<assert test="not(.//cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10'])">Error: Care Plan (V2) - 2.1.14 CarePlanDoesNotHavePlanOfTreatmentSectionV2
		Conformance: structuredBody SHALL NOT contain a Plan of Treatment Section (V2) (identifier: urn:hl7ii:2.16.840.1.113883.10.20.22.2.10:2014-06-09) (CONF:1198-31044)
		Analysis: structuredBody SHALL NOT contain a Plan of Treatment Section (V2) (identifier: urn:hl7ii:2.16.840.1.113883.10.20.22.2.10:2014-06-09)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_2_CarePlanV2_component_2_1_13-error_mdht" see="#p-CarePlanV2_2_CarePlanV2_component_2_1_13-error_mdht" name="p-CarePlanV2_2_CarePlanV2_component_2_1_13-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(consol::CarePlan::Component))
			Constraint name: CarePlanComponent
		-->
	<assert test="count(cda:component)=1">Error: Care Plan (V2) - 2.1.13 component
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_inFulfillmentOf_2_1_13-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_inFulfillmentOf_2_1_13-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_inFulfillmentOf_2_1_13-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: Care Plan (V2) - 2.1.13 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:1198-9952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_documentationOf_2_1_10-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_documentationOf_2_1_10-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_documentationOf_2_1_10-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
			Constraint name: CarePlanDocumentationOf
		-->
	<assert test="count(cda:documentationOf)=1">Error: Care Plan (V2) - 2.1.10 documentationOf
		Conformance: SHALL contain exactly one [1..1] documentationOf (CONF:1198-31901)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_versionNumber_2_1_5-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_versionNumber_2_1_5-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_versionNumber_2_1_5-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: Care Plan (V2) - 2.1.5 versionNumber
		Conformance: SHOULD contain zero or one [0..1] versionNumber (CONF:1198-32322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_setId_2_1_4-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_setId_2_1_4-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_setId_2_1_4-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: Care Plan (V2) - 2.1.4 setId
		Conformance: SHOULD contain zero or one [0..1] setId (CONF:1198-32321)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_relatedDocument_2_1_11-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_relatedDocument_2_1_11-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_relatedDocument_2_1_11-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.relatedDocument->select(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))->size() >= 0
			Constraint name: CarePlanRelatedDocument
		-->
	<assert test="count(cda:relatedDocument) &gt;= 0">Error: Care Plan (V2) - 2.1.11 relatedDocument
		Conformance: MAY contain zero or more [0..*] relatedDocument (CONF:1198-29893)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_1A_CarePlanV2_typeId_2_1_3-error_mdht" see="#p-CarePlanV2_1A_CarePlanV2_typeId_2_1_3-error_mdht" name="p-CarePlanV2_1A_CarePlanV2_typeId_2_1_3-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: Care Plan (V2) - 2.1.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CarePlan: 2.16.840.1.113883.10.20.22.1.15 -->

<pattern id="p-CarePlanV2_2_CarePlanV2_componentOf_2_1_12-error_mdht" see="#p-CarePlanV2_2_CarePlanV2_componentOf_2_1_12-error_mdht" name="p-CarePlanV2_2_CarePlanV2_componentOf_2_1_12-error_mdht">
		<!--
			UML path: /CarePlan
			UML root path: /CarePlan
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: CarePlanComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: Care Plan (V2) - 2.1.12 componentOf
		Conformance: SHOULD contain zero or one [0..1] componentOf (CONF:1198-32004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-CarePlanV2_1A_InformationRecipient_intendedRecipient_2_1_6_i-error_mdht" see="#p-CarePlanV2_1A_InformationRecipient_intendedRecipient_2_1_6_i-error_mdht" name="p-CarePlanV2_1A_InformationRecipient_intendedRecipient_2_1_6_i-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient
			UML root path: /CarePlan/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::CarePlan::InformationRecipient::IntendedRecipient))
			Constraint name: CarePlanInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: Care Plan (V2) - 2.1.6.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:1198-31994)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-CarePlanV2_1A_IntendedRecipient_telecom_2_1_6_i_c-error_mdht" see="#p-CarePlanV2_1A_IntendedRecipient_telecom_2_1_6_i_c-error_mdht" name="p-CarePlanV2_1A_IntendedRecipient_telecom_2_1_6_i_c-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient
			UML root path: /CarePlan/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: CarePlanInformationRecipientIntendedRecipientTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Care Plan (V2) - 2.1.6.i.c telecom
		Conformance: SHOULD contain zero or more [0..*] telecom (CONF:1198-31998)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-CarePlanV2_1A_IntendedRecipient_informationRecipient_2_1_6_i_d-error_mdht" see="#p-CarePlanV2_1A_IntendedRecipient_informationRecipient_2_1_6_i_d-error_mdht" name="p-CarePlanV2_1A_IntendedRecipient_informationRecipient_2_1_6_i_d-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient
			UML root path: /CarePlan/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(consol::CarePlan::InformationRecipient::IntendedRecipient::InformationRecipient))->size() <= 1
			Constraint name: CarePlanInformationRecipientIntendedRecipientInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &lt;= 1">Error: Care Plan (V2) - 2.1.6.i.d informationRecipient
		Conformance: SHOULD contain zero or one [0..1] informationRecipient (CONF:1198-31999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-CarePlanV2_1A_IntendedRecipient_addr_2_1_6_i_b-error_mdht" see="#p-CarePlanV2_1A_IntendedRecipient_addr_2_1_6_i_b-error_mdht" name="p-CarePlanV2_1A_IntendedRecipient_addr_2_1_6_i_b-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient
			UML root path: /CarePlan/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: CarePlanInformationRecipientIntendedRecipientAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Care Plan (V2) - 2.1.6.i.b addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:1198-31997)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-CarePlanV2_1A_IntendedRecipient_receivedOrganization_2_1_6_i_e-error_mdht" see="#p-CarePlanV2_1A_IntendedRecipient_receivedOrganization_2_1_6_i_e-error_mdht" name="p-CarePlanV2_1A_IntendedRecipient_receivedOrganization_2_1_6_i_e-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient
			UML root path: /CarePlan/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.receivedOrganization->select(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(consol::CarePlan::InformationRecipient::IntendedRecipient::ReceivedOrganization))->size() <= 1
			Constraint name: CarePlanInformationRecipientIntendedRecipientReceivedOrganization
		-->
	<assert test="count(cda:receivedOrganization) &lt;= 1">Error: Care Plan (V2) - 2.1.6.i.e receivedOrganization
		Conformance: SHOULD contain zero or one [0..1] receivedOrganization (CONF:1198-32000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-CarePlanV2_1A_IntendedRecipient_id_2_1_6_i_a-error_mdht" see="#p-CarePlanV2_1A_IntendedRecipient_id_2_1_6_i_a-error_mdht" name="p-CarePlanV2_1A_IntendedRecipient_id_2_1_6_i_a-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient
			UML root path: /CarePlan/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: CarePlanInformationRecipientIntendedRecipientId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.6.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-31996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-CarePlanV2_1A_InformationRecipient_name_2_1_6_i_d_1-error_mdht" see="#p-CarePlanV2_1A_InformationRecipient_name_2_1_6_i_d_1-error_mdht" name="p-CarePlanV2_1A_InformationRecipient_name_2_1_6_i_d_1-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient/informationRecipient
			UML root path: /CarePlan/informationRecipient/intendedRecipient/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">
		<!--
			OCL: self.name->size() = 1
			Constraint name: CarePlanInformationRecipientIntendedRecipientInformationRecipientName
		-->
	<assert test="count(cda:name) = 1">Error: Care Plan (V2) - 2.1.6.i.d.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:1198-32320)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ReceivedOrganization -->

<pattern id="p-CarePlanV2_1A_ReceivedOrganization_id_2_1_6_i_e_1-error_mdht" see="#p-CarePlanV2_1A_ReceivedOrganization_id_2_1_6_i_e_1-error_mdht" name="p-CarePlanV2_1A_ReceivedOrganization_id_2_1_6_i_e_1-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient/receivedOrganization
			UML root path: /CarePlan/informationRecipient/intendedRecipient/receivedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: CarePlanInformationRecipientIntendedRecipientReceivedOrganizationId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Care Plan (V2) - 2.1.6.i.e.1 id
		Conformance: SHOULD contain zero or more [0..*] id (CONF:1198-32001)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ReceivedOrganization -->

<pattern id="p-CarePlanV2_1A_ReceivedOrganization_standardIndustryClassCode_2_1_6_i_e_3-error_mdht" see="#p-CarePlanV2_1A_ReceivedOrganization_standardIndustryClassCode_2_1_6_i_e_3-error_mdht" name="p-CarePlanV2_1A_ReceivedOrganization_standardIndustryClassCode_2_1_6_i_e_3-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient/receivedOrganization
			UML root path: /CarePlan/informationRecipient/intendedRecipient/receivedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">
		<!--
			OCL: ((not self.standardIndustryClassCode.oclIsUndefined()) and self.standardIndustryClassCode.isNullFlavorUndefined()) implies (not self.standardIndustryClassCode.oclIsUndefined())
			Constraint name: CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP
		-->
	<assert test="not(cda:standardIndustryClassCode and not(cda:standardIndustryClassCode/@nullFlavor)) or cda:standardIndustryClassCode">Error: Care Plan (V2) - 2.1.6.i.e.3 standardIndustryClassCode
		Conformance: SHOULD contain zero or one [0..1] standardIndustryClassCode, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32003)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.standardIndustryClassCode.oclIsUndefined()) and self.standardIndustryClassCode.isNullFlavorUndefined()) implies (not self.standardIndustryClassCode.oclIsUndefined() and self.standardIndustryClassCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.standardIndustryClassCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode
		-->
	<assert test="not(cda:standardIndustryClassCode and not(cda:standardIndustryClassCode/@nullFlavor)) or cda:standardIndustryClassCode and cda:standardIndustryClassCode[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Care Plan (V2) - 2.1.6.i.e.3 standardIndustryClassCode
		Conformance: SHOULD contain zero or one [0..1] standardIndustryClassCode, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ReceivedOrganization -->

<pattern id="p-CarePlanV2_1A_ReceivedOrganization_name_2_1_6_i_e_2-error_mdht" see="#p-CarePlanV2_1A_ReceivedOrganization_name_2_1_6_i_e_2-error_mdht" name="p-CarePlanV2_1A_ReceivedOrganization_name_2_1_6_i_e_2-error_mdht">
		<!--
			UML path: /CarePlan/informationRecipient/intendedRecipient/receivedOrganization
			UML root path: /CarePlan/informationRecipient/intendedRecipient/receivedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: CarePlanInformationRecipientIntendedRecipientReceivedOrganizationName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.6.i.e.2 name
		Conformance: SHALL contain at least one [1..*] name (CONF:1198-32002)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-CarePlanV2_1A_Authenticator_sDTCSignatureText_2_1_7_iii-error_mdht" see="#p-CarePlanV2_1A_Authenticator_sDTCSignatureText_2_1_7_iii-error_mdht" name="p-CarePlanV2_1A_Authenticator_sDTCSignatureText_2_1_7_iii-error_mdht">
		<!--
			UML path: /CarePlan/authenticator
			UML root path: /CarePlan/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: CarePlanAuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Care Plan (V2) - 2.1.7.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-31913)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-CarePlanV2_1A_Authenticator_assignedEntity_2_1_7_iv-error_mdht" see="#p-CarePlanV2_1A_Authenticator_assignedEntity_2_1_7_iv-error_mdht" name="p-CarePlanV2_1A_Authenticator_assignedEntity_2_1_7_iv-error_mdht">
		<!--
			UML path: /CarePlan/authenticator
			UML root path: /CarePlan/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::CarePlan::Authenticator::AssignedEntity))
			Constraint name: CarePlanAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Care Plan (V2) - 2.1.7.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-31914)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-CarePlanV2_1A_Authenticator_signatureCode_2_1_7_ii-error_mdht" see="#p-CarePlanV2_1A_Authenticator_signatureCode_2_1_7_ii-error_mdht" name="p-CarePlanV2_1A_Authenticator_signatureCode_2_1_7_ii-error_mdht">
		<!--
			UML path: /CarePlan/authenticator
			UML root path: /CarePlan/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: CarePlanAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode">Error: Care Plan (V2) - 2.1.7.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:1198-31912)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-CarePlanV2_1A_Authenticator_time_2_1_7_i-error_mdht" see="#p-CarePlanV2_1A_Authenticator_time_2_1_7_i-error_mdht" name="p-CarePlanV2_1A_Authenticator_time_2_1_7_i-error_mdht">
		<!--
			UML path: /CarePlan/authenticator
			UML root path: /CarePlan/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: CarePlanAuthenticatorTime
		-->
	<assert test="cda:time">Error: Care Plan (V2) - 2.1.7.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:1198-31911)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_code_2_1_7_iv_b-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_code_2_1_7_iv_b-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_code_2_1_7_iv_b-error_mdht">
		<!--
			UML path: /CarePlan/authenticator/assignedEntity
			UML root path: /CarePlan/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = 'ONESELF' and value.codeSystem = '2.16.840.1.113883.5.111'
			Constraint name: CarePlanAuthenticatorAssignedEntityCode
		-->
	<assert test="cda:code and cda:code[@code = 'ONESELF' and @codeSystem = '2.16.840.1.113883.5.111']">Error: Care Plan (V2) - 2.1.7.iv.b code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-31916)/@code=&quot;ONESELF&quot; Self (CodeSystem: 2.16.840.1.113883.5.111 RoleCode) (CONF:1198-31917, CONF:1198-31918)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: CarePlanAuthenticatorAssignedEntityCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 2.1.7.iv.b code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-31916)/@code=&quot;ONESELF&quot; Self (CodeSystem: 2.16.840.1.113883.5.111 RoleCode) (CONF:1198-31917, CONF:1198-31918)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_id_2_1_7_iv_a-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_id_2_1_7_iv_a-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_id_2_1_7_iv_a-error_mdht">
		<!--
			UML path: /CarePlan/authenticator/assignedEntity
			UML root path: /CarePlan/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: CarePlanAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.7.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-31915)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantCarePlanReview -->

<pattern id="p-CarePlanV2_1A_ParticipantCarePlanReview_functionCode_2_1_8_ii-error_mdht" see="#p-CarePlanV2_1A_ParticipantCarePlanReview_functionCode_2_1_8_ii-error_mdht" name="p-CarePlanV2_1A_ParticipantCarePlanReview_functionCode_2_1_8_ii-error_mdht">
		<!--
			UML path: /CarePlan/participantCarePlanReview
			UML root path: /CarePlan/participantCarePlanReview
		-->
	<rule context="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">
		<!--
			OCL: not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in 
value.code = '425268008' and value.codeSystem = '2.16.840.1.113883.6.96'
			Constraint name: CarePlanParticipantCarePlanReviewFunctionCode
		-->
	<assert test="cda:functionCode and cda:functionCode[@code = '425268008' and @codeSystem = '2.16.840.1.113883.6.96']">Error: Care Plan (V2) - 2.1.8.ii functionCode
		Conformance: SHALL contain exactly one [1..1] functionCode (CONF:1198-31679)/@code=&quot;425268008&quot; Review of Care Plan (CodeSystem: 2.16.840.1.113883.6.96 SNOMEDCT) (CONF:1198-31680, CONF:1198-31681)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.functionCode.oclIsUndefined()
			Constraint name: CarePlanParticipantCarePlanReviewFunctionCodeP
		-->
	<assert test="cda:functionCode">Error: Care Plan (V2) - 2.1.8.ii functionCode
		Conformance: SHALL contain exactly one [1..1] functionCode (CONF:1198-31679)/@code=&quot;425268008&quot; Review of Care Plan (CodeSystem: 2.16.840.1.113883.6.96 SNOMEDCT) (CONF:1198-31680, CONF:1198-31681)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantCarePlanReview -->

<pattern id="p-CarePlanV2_1A_ParticipantCarePlanReview_associatedEntity_2_1_8_iv-error_mdht" see="#p-CarePlanV2_1A_ParticipantCarePlanReview_associatedEntity_2_1_8_iv-error_mdht" name="p-CarePlanV2_1A_ParticipantCarePlanReview_associatedEntity_2_1_8_iv-error_mdht">
		<!--
			UML path: /CarePlan/participantCarePlanReview
			UML root path: /CarePlan/participantCarePlanReview
		-->
	<rule context="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">
		<!--
			OCL: self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(consol::CarePlan::ParticipantCarePlanReview::AssociatedEntity))
			Constraint name: CarePlanParticipantCarePlanReviewAssociatedEntity
		-->
	<assert test="count(cda:associatedEntity)=1">Error: Care Plan (V2) - 2.1.8.iv associatedEntity
		Conformance: SHALL contain exactly one [1..1] associatedEntity (CONF:1198-31683)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantCarePlanReview -->

<pattern id="p-CarePlanV2_1A_ParticipantCarePlanReview_time_2_1_8_iii-error_mdht" see="#p-CarePlanV2_1A_ParticipantCarePlanReview_time_2_1_8_iii-error_mdht" name="p-CarePlanV2_1A_ParticipantCarePlanReview_time_2_1_8_iii-error_mdht">
		<!--
			UML path: /CarePlan/participantCarePlanReview
			UML root path: /CarePlan/participantCarePlanReview
		-->
	<rule context="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: CarePlanParticipantCarePlanReviewTime
		-->
	<assert test="cda:time">Error: Care Plan (V2) - 2.1.8.iii time
		Conformance: SHALL contain exactly one [1..1] time (CONF:1198-31682)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantCarePlanReview -->

<pattern id="p-CarePlanV2_1A_ParticipantCarePlanReview_typeCode_2_1_8_i-error_mdht" see="#p-CarePlanV2_1A_ParticipantCarePlanReview_typeCode_2_1_8_i-error_mdht" name="p-CarePlanV2_1A_ParticipantCarePlanReview_typeCode_2_1_8_i-error_mdht">
		<!--
			UML path: /CarePlan/participantCarePlanReview
			UML root path: /CarePlan/participantCarePlanReview
		-->
	<rule context="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">
		<!--
			OCL: self.typeCode=vocab::ParticipationType::VRF
			Constraint name: CarePlanParticipantCarePlanReviewTypeCode
		-->
	<assert test="@typeCode = 'VRF'">Error: Care Plan (V2) - 2.1.8.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;VRF&quot;  (CONF:1198-31678)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-CarePlanV2_1A_AssociatedEntity_code_2_1_8_iv_c-error_mdht" see="#p-CarePlanV2_1A_AssociatedEntity_code_2_1_8_iv_c-error_mdht" name="p-CarePlanV2_1A_AssociatedEntity_code_2_1_8_iv_c-error_mdht">
		<!--
			UML path: /CarePlan/participantCarePlanReview/associatedEntity
			UML root path: /CarePlan/participantCarePlanReview/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = 'ASSIGNED']">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: CarePlanParticipantCarePlanReviewAssociatedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 2.1.8.iv.c code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:1198-31685), which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-32367)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: CarePlanParticipantCarePlanReviewAssociatedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: Care Plan (V2) - 2.1.8.iv.c code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:1198-31685), which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-32367)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_8_iv_a-error_mdht" see="#p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_8_iv_a-error_mdht" name="p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_8_iv_a-error_mdht">
		<!--
			UML path: /CarePlan/participantCarePlanReview/associatedEntity
			UML root path: /CarePlan/participantCarePlanReview/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = 'ASSIGNED']">
		<!--
			OCL: self.classCode=vocab::RoleClassAssociative::ASSIGNED
			Constraint name: CarePlanParticipantCarePlanReviewAssociatedEntityClassCode
		-->
	<assert test="@classCode = 'ASSIGNED'">Error: Care Plan (V2) - 2.1.8.iv.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ASSIGNED&quot;  (CONF:1198-31686)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-CarePlanV2_1A_AssociatedEntity_id_2_1_8_iv_b-error_mdht" see="#p-CarePlanV2_1A_AssociatedEntity_id_2_1_8_iv_b-error_mdht" name="p-CarePlanV2_1A_AssociatedEntity_id_2_1_8_iv_b-error_mdht">
		<!--
			UML path: /CarePlan/participantCarePlanReview/associatedEntity
			UML root path: /CarePlan/participantCarePlanReview/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = 'ASSIGNED']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: CarePlanParticipantCarePlanReviewAssociatedEntityId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.8.iv.b id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-31684)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantCaregiver -->

<pattern id="p-CarePlanV2_1A_ParticipantCaregiver_associatedEntity_2_1_9_ii-error_mdht" see="#p-CarePlanV2_1A_ParticipantCaregiver_associatedEntity_2_1_9_ii-error_mdht" name="p-CarePlanV2_1A_ParticipantCaregiver_associatedEntity_2_1_9_ii-error_mdht">
		<!--
			UML path: /CarePlan/participantCaregiver
			UML root path: /CarePlan/participantCaregiver
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(consol::CarePlan::ParticipantCaregiver::AssociatedEntity))
			Constraint name: CarePlanParticipantCaregiverAssociatedEntity
		-->
	<assert test="count(cda:associatedEntity)=1">Error: Care Plan (V2) - 2.1.9.ii associatedEntity
		Conformance: SHALL contain exactly one [1..1] associatedEntity (CONF:1198-31897)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantCaregiver -->

<pattern id="p-CarePlanV2_1A_ParticipantCaregiver_typeCode_2_1_9_i-error_mdht" see="#p-CarePlanV2_1A_ParticipantCaregiver_typeCode_2_1_9_i-error_mdht" name="p-CarePlanV2_1A_ParticipantCaregiver_typeCode_2_1_9_i-error_mdht">
		<!--
			UML path: /CarePlan/participantCaregiver
			UML root path: /CarePlan/participantCaregiver
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: self.typeCode=vocab::ParticipationType::IND
			Constraint name: CarePlanParticipantCaregiverTypeCode
		-->
	<assert test="@typeCode = 'IND'">Error: Care Plan (V2) - 2.1.9.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;IND&quot;  (CONF:1198-31896)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-CarePlanV2_1A_AssociatedEntity_associatedPerson_2_1_9_ii_b-error_mdht" see="#p-CarePlanV2_1A_AssociatedEntity_associatedPerson_2_1_9_ii_b-error_mdht" name="p-CarePlanV2_1A_AssociatedEntity_associatedPerson_2_1_9_ii_b-error_mdht">
		<!--
			UML path: /CarePlan/participantCaregiver/associatedEntity
			UML root path: /CarePlan/participantCaregiver/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">
		<!--
			OCL: self.associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(consol::CarePlan::ParticipantCaregiver::AssociatedEntity::AssociatedPerson))
			Constraint name: CarePlanParticipantCaregiverAssociatedEntityAssociatedPerson
		-->
	<assert test="count(cda:associatedPerson)=1">Error: Care Plan (V2) - 2.1.9.ii.b associatedPerson
		Conformance: SHALL contain exactly one [1..1] associatedPerson (CONF:1198-31899)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_9_ii_a-error_mdht" see="#p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_9_ii_a-error_mdht" name="p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_9_ii_a-error_mdht">
		<!--
			UML path: /CarePlan/participantCaregiver/associatedEntity
			UML root path: /CarePlan/participantCaregiver/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">
		<!--
			OCL: isDefined('classCode')
			Constraint name: CarePlanParticipantCaregiverAssociatedEntityClassCodeP
		-->
	<assert test="attribute::node()[name() = 'classCode']">Error: Care Plan (V2) - 2.1.9.ii.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode, which SHALL be selected from ValueSet INDRoleclassCodes 2.16.840.1.113883.11.20.9.33 STATIC 2011-09-30 (CONF:1198-31898)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.classCode.oclIsUndefined() and self.classCode.oclIsKindOf(vocab::RoleClassAssociative) and 
let value : vocab::RoleClassAssociative = self.classCode.oclAsType(vocab::RoleClassAssociative) in 
value = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON
			Constraint name: CarePlanParticipantCaregiverAssociatedEntityClassCode
		-->
	<assert test="@classCode and @classCode[. = 'PRS' or . = 'NOK' or . = 'CAREGIVER' or . = 'AGNT' or . = 'GUAR' or . = 'ECON']">Error: Care Plan (V2) - 2.1.9.ii.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode, which SHALL be selected from ValueSet INDRoleclassCodes 2.16.840.1.113883.11.20.9.33 STATIC 2011-09-30 (CONF:1198-31898)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedPerson -->

<pattern id="p-CarePlanV2_1A_AssociatedPerson_name_2_1_9_ii_b_1-error_mdht" see="#p-CarePlanV2_1A_AssociatedPerson_name_2_1_9_ii_b_1-error_mdht" name="p-CarePlanV2_1A_AssociatedPerson_name_2_1_9_ii_b_1-error_mdht">
		<!--
			UML path: /CarePlan/participantCaregiver/associatedEntity/associatedPerson
			UML root path: /CarePlan/participantCaregiver/associatedEntity/associatedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: CarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.9.ii.b.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:1198-31900)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-CarePlanV2_1A_DocumentationOf_serviceEvent_2_1_10_i-error_mdht" see="#p-CarePlanV2_1A_DocumentationOf_serviceEvent_2_1_10_i-error_mdht" name="p-CarePlanV2_1A_DocumentationOf_serviceEvent_2_1_10_i-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf
			UML root path: /CarePlan/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::CarePlan::DocumentationOf::ServiceEvent))
			Constraint name: CarePlanDocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: Care Plan (V2) - 2.1.10.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:1198-31902)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-CarePlanV2_1A_ServiceEvent_performer1_2_1_10_i_c-error_mdht" see="#p-CarePlanV2_1A_ServiceEvent_performer1_2_1_10_i_c-error_mdht" name="p-CarePlanV2_1A_ServiceEvent_performer1_2_1_10_i_c-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent
			UML root path: /CarePlan/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::CarePlan::DocumentationOf::ServiceEvent::Performer))
			Constraint name: CarePlanDocumentationOfServiceEventPerformer1
		-->
	<assert test="cda:performer">Error: Care Plan (V2) - 2.1.10.i.c performer1
		Conformance: SHALL contain at least one [1..*] performer (CONF:1198-31905)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-CarePlanV2_1A_ServiceEvent_effectiveTime_2_1_10_i_b-error_mdht" see="#p-CarePlanV2_1A_ServiceEvent_effectiveTime_2_1_10_i_b-error_mdht" name="p-CarePlanV2_1A_ServiceEvent_effectiveTime_2_1_10_i_b-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent
			UML root path: /CarePlan/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: CarePlanDocumentationOfServiceEventEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Care Plan (V2) - 2.1.10.i.b effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:1198-31904)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-CarePlanV2_1A_ServiceEvent_classCode_2_1_10_i_a-error_mdht" see="#p-CarePlanV2_1A_ServiceEvent_classCode_2_1_10_i_a-error_mdht" name="p-CarePlanV2_1A_ServiceEvent_classCode_2_1_10_i_a-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent
			UML root path: /CarePlan/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::ActClassRoot::PCPR
			Constraint name: CarePlanDocumentationOfServiceEventClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'PCPR'">Error: Care Plan (V2) - 2.1.10.i.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;PCPR&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1198-31903)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IVLTS -->

<pattern id="p-CarePlanV2_1A_IVLTS_low_2_1_10_i_b_1-error_mdht" see="#p-CarePlanV2_1A_IVLTS_low_2_1_10_i_b_1-error_mdht" name="p-CarePlanV2_1A_IVLTS_low_2_1_10_i_b_1-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent/effectiveTime
			UML root path: /CarePlan/documentationOf/serviceEvent/effectiveTime
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.low.oclIsUndefined() ))
			Constraint name: CarePlanDocumentationOfServiceEventIVLTSLow
		-->
	<assert test="@nullFlavor or cda:low">Error: Care Plan (V2) - 2.1.10.i.b.1 low
		Conformance: SHALL contain exactly one [1..1] low (CONF:1198-32330)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IVLTS -->

<pattern id="p-CarePlanV2_1A_IVLTS_high_2_1_10_i_b_2-error_mdht" see="#p-CarePlanV2_1A_IVLTS_high_2_1_10_i_b_2-error_mdht" name="p-CarePlanV2_1A_IVLTS_high_2_1_10_i_b_2-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent/effectiveTime
			UML root path: /CarePlan/documentationOf/serviceEvent/effectiveTime
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.high.oclIsUndefined()) and self.high.isNullFlavorUndefined()) implies (not self.high.oclIsUndefined()) ))
			Constraint name: CarePlanDocumentationOfServiceEventIVLTSHigh
		-->
	<assert test="@nullFlavor or not(cda:high and not(cda:high/@nullFlavor)) or cda:high">Error: Care Plan (V2) - 2.1.10.i.b.2 high
		Conformance: MAY contain zero or one [0..1] high (CONF:1198-32331)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer -->

<pattern id="p-CarePlanV2_1A_Performer_assignedEntity_2_1_10_i_c_1-error_mdht" see="#p-CarePlanV2_1A_Performer_assignedEntity_2_1_10_i_c_1-error_mdht" name="p-CarePlanV2_1A_Performer_assignedEntity_2_1_10_i_c_1-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent/performer1
			UML root path: /CarePlan/documentationOf/serviceEvent/performer1
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::CarePlan::DocumentationOf::ServiceEvent::Performer::AssignedEntity))
			Constraint name: CarePlanDocumentationOfServiceEventPerformerAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Care Plan (V2) - 2.1.10.i.c.1 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-31907)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_code_2_1_10_i_c_1_ii-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_code_2_1_10_i_c_1_ii-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_code_2_1_10_i_c_1_ii-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity
			UML root path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: CarePlanDocumentationOfServiceEventPerformerAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 2.1.10.i.c.1.ii code
		Conformance: MAY contain zero or one [0..1] code (CONF:1198-31909)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_id_2_1_10_i_c_1_i-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_id_2_1_10_i_c_1_i-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_id_2_1_10_i_c_1_i-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity
			UML root path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: CarePlanDocumentationOfServiceEventPerformerAssignedEntityId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.10.i.c.1.i id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-31908)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_i_c_1_iii-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_i_c_1_iii-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_i_c_1_iii-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity
			UML root path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::CarePlan::DocumentationOf::ServiceEvent::Performer::AssignedEntity::AssignedPerson))
			Constraint name: CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Care Plan (V2) - 2.1.10.i.c.1.iii assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:1198-32328)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedPerson -->

<pattern id="p-CarePlanV2_1A_AssignedPerson_name_2_1_10_i_c_1_iii_a-error_mdht" see="#p-CarePlanV2_1A_AssignedPerson_name_2_1_10_i_c_1_iii_a-error_mdht" name="p-CarePlanV2_1A_AssignedPerson_name_2_1_10_i_c_1_iii_a-error_mdht">
		<!--
			UML path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity/assignedPerson
			UML root path: /CarePlan/documentationOf/serviceEvent/performer1/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: self.name->size() = 1
			Constraint name: CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName
		-->
	<assert test="count(cda:name) = 1">Error: Care Plan (V2) - 2.1.10.i.c.1.iii.a name
		Conformance: SHALL contain exactly one [1..1] name (CONF:1198-32329)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedDocument -->

<pattern id="p-CarePlanV2_1A_RelatedDocument_parentDocument_2_1_11_ii-error_mdht" see="#p-CarePlanV2_1A_RelatedDocument_parentDocument_2_1_11_ii-error_mdht" name="p-CarePlanV2_1A_RelatedDocument_parentDocument_2_1_11_ii-error_mdht">
		<!--
			UML path: /CarePlan/relatedDocument
			UML root path: /CarePlan/relatedDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:relatedDocument">
		<!--
			OCL: self.parentDocument->one(parentDocument : cda::ParentDocument | not parentDocument.oclIsUndefined() and parentDocument.oclIsKindOf(consol::CarePlan::RelatedDocument::ParentDocument))
			Constraint name: CarePlanRelatedDocumentParentDocument
		-->
	<assert test="count(cda:parentDocument)=1">Error: Care Plan (V2) - 2.1.11.ii parentDocument
		Conformance: SHALL contain exactly one [1..1] parentDocument (CONF:1198-29894)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedDocument -->

<pattern id="p-CarePlanV2_1A_RelatedDocument_typeCode_2_1_11_i-error_mdht" see="#p-CarePlanV2_1A_RelatedDocument_typeCode_2_1_11_i-error_mdht" name="p-CarePlanV2_1A_RelatedDocument_typeCode_2_1_11_i-error_mdht">
		<!--
			UML path: /CarePlan/relatedDocument
			UML root path: /CarePlan/relatedDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:relatedDocument">
		<!--
			OCL: isDefined('typeCode')
			Constraint name: CarePlanRelatedDocumentTypeCodeP
		-->
	<assert test="attribute::node()[name() = 'typeCode']">Error: Care Plan (V2) - 2.1.11.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode, which SHALL be selected from ValueSet Related Document (append/replace) 2.16.840.1.113883.11.20.9.62 STATIC 2014-09-01 (CONF:1198-31889)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.typeCode.oclIsUndefined() and self.typeCode.oclIsKindOf(vocab::x_ActRelationshipDocument) and 
let value : vocab::x_ActRelationshipDocument = self.typeCode.oclAsType(vocab::x_ActRelationshipDocument) in 
value = vocab::x_ActRelationshipDocument::APND or value = vocab::x_ActRelationshipDocument::RPLC
			Constraint name: CarePlanRelatedDocumentTypeCode
		-->
	<assert test="@typeCode and @typeCode[. = 'APND' or . = 'RPLC']">Error: Care Plan (V2) - 2.1.11.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode, which SHALL be selected from ValueSet Related Document (append/replace) 2.16.840.1.113883.11.20.9.62 STATIC 2014-09-01 (CONF:1198-31889)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParentDocument -->

<pattern id="p-CarePlanV2_1A_ParentDocument_versionNumber_2_1_11_ii_b-error_mdht" see="#p-CarePlanV2_1A_ParentDocument_versionNumber_2_1_11_ii_b-error_mdht" name="p-CarePlanV2_1A_ParentDocument_versionNumber_2_1_11_ii_b-error_mdht">
		<!--
			UML path: /CarePlan/relatedDocument/parentDocument
			UML root path: /CarePlan/relatedDocument/parentDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument">
		<!--
			OCL: not self.versionNumber.oclIsUndefined()
			Constraint name: CarePlanRelatedDocumentParentDocumentVersionNumber
		-->
	<assert test="cda:versionNumber">Error: Care Plan (V2) - 2.1.11.ii.b versionNumber
		Conformance: SHALL contain exactly one [1..1] versionNumber (CONF:1198-29896)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParentDocument -->

<pattern id="p-CarePlanV2_1A_ParentDocument_setId_2_1_11_ii_a-error_mdht" see="#p-CarePlanV2_1A_ParentDocument_setId_2_1_11_ii_a-error_mdht" name="p-CarePlanV2_1A_ParentDocument_setId_2_1_11_ii_a-error_mdht">
		<!--
			UML path: /CarePlan/relatedDocument/parentDocument
			UML root path: /CarePlan/relatedDocument/parentDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument">
		<!--
			OCL: not self.setId.oclIsUndefined()
			Constraint name: CarePlanRelatedDocumentParentDocumentSetId
		-->
	<assert test="cda:setId">Error: Care Plan (V2) - 2.1.11.ii.a setId
		Conformance: SHALL contain exactly one [1..1] setId (CONF:1198-29895)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-CarePlanV2_2_ComponentOf_encompassingEncounter_2_1_12_i-error_mdht" see="#p-CarePlanV2_2_ComponentOf_encompassingEncounter_2_1_12_i-error_mdht" name="p-CarePlanV2_2_ComponentOf_encompassingEncounter_2_1_12_i-error_mdht">
		<!--
			UML path: /CarePlan/componentOf
			UML root path: /CarePlan/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::CarePlan::ComponentOf::EncompassingEncounter))
			Constraint name: CarePlanComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: Care Plan (V2) - 2.1.12.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:1198-32005)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-CarePlanV2_2_EncompassingEncounter_effectiveTime_2_1_12_i_a-error_mdht" see="#p-CarePlanV2_2_EncompassingEncounter_effectiveTime_2_1_12_i_a-error_mdht" name="p-CarePlanV2_2_EncompassingEncounter_effectiveTime_2_1_12_i_a-error_mdht">
		<!--
			UML path: /CarePlan/componentOf/encompassingEncounter
			UML root path: /CarePlan/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: CarePlanComponentOfEncompassingEncounterEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Care Plan (V2) - 2.1.12.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:1198-32007)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-CarePlanV2_2_Component_structuredBody_2_1_13_i-error_mdht" see="#p-CarePlanV2_2_Component_structuredBody_2_1_13_i-error_mdht" name="p-CarePlanV2_2_Component_structuredBody_2_1_13_i-error_mdht">
		<!--
			UML path: /CarePlan/component
			UML root path: /CarePlan/component
		-->
	<rule context="/cda:ClinicalDocument/cda:component">
		<!--
			OCL: self.structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(consol::CarePlan::Component::StructuredBody))
			Constraint name: CarePlanComponentStructuredBody
		-->
	<assert test="count(cda:structuredBody)=1">Error: Care Plan (V2) - 2.1.13.i structuredBody
		Conformance: SHALL contain exactly one [1..1] structuredBody
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-CarePlanV2_2_StructuredBody_healthStatusEvaluationsOutcomesSection_2_1_13_i_d-error_mdht" see="#p-CarePlanV2_2_StructuredBody_healthStatusEvaluationsOutcomesSection_2_1_13_i_d-error_mdht" name="p-CarePlanV2_2_StructuredBody_healthStatusEvaluationsOutcomesSection_2_1_13_i_d-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody
			UML root path: /CarePlan/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::CarePlan::Component::StructuredBody::Component))
			Constraint name: CarePlanComponentStructuredBodyHealthStatusEvaluationsOutcomesSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58'])=1">Error: Care Plan (V2) - 2.1.13.i.d healthStatusEvaluationsOutcomesSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-CarePlanV2_2_StructuredBody_goalsSection_2_1_13_i_b-error_mdht" see="#p-CarePlanV2_2_StructuredBody_goalsSection_2_1_13_i_b-error_mdht" name="p-CarePlanV2_2_StructuredBody_goalsSection_2_1_13_i_b-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody
			UML root path: /CarePlan/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::CarePlan::Component::StructuredBody::Component))
			Constraint name: CarePlanComponentStructuredBodyGoalsSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58'])=1">Error: Care Plan (V2) - 2.1.13.i.b goalsSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-CarePlanV2_2_StructuredBody_interventionsSection2_2_1_13_i_c-error_mdht" see="#p-CarePlanV2_2_StructuredBody_interventionsSection2_2_1_13_i_c-error_mdht" name="p-CarePlanV2_2_StructuredBody_interventionsSection2_2_1_13_i_c-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody
			UML root path: /CarePlan/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::CarePlan::Component::StructuredBody::Component))
			Constraint name: CarePlanComponentStructuredBodyInterventionsSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58'])=1">Error: Care Plan (V2) - 2.1.13.i.c interventionsSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-CarePlanV2_2_StructuredBody_healthConcernsSection_2_1_13_i_a-error_mdht" see="#p-CarePlanV2_2_StructuredBody_healthConcernsSection_2_1_13_i_a-error_mdht" name="p-CarePlanV2_2_StructuredBody_healthConcernsSection_2_1_13_i_a-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody
			UML root path: /CarePlan/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::CarePlan::Component::StructuredBody::Component))
			Constraint name: CarePlanComponentStructuredBodyHealthConcernsSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58'])=1">Error: Care Plan (V2) - 2.1.13.i.a healthConcernsSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-CarePlanV2_2_Component_healthConcernsSection_2_1_13_i_a_1-error_mdht" see="#p-CarePlanV2_2_Component_healthConcernsSection_2_1_13_i_a_1-error_mdht" name="p-CarePlanV2_2_Component_healthConcernsSection_2_1_13_i_a_1-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody/healthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthConcernsSection))
			Constraint name: CarePlanComponentStructuredBodyComponentHealthConcernsSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58'])=1">Error: Care Plan (V2) - 2.1.13.i.a.1 healthConcernsSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-28755, CONF:1198-28756)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_7-error_mdht" see="#p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_7-error_mdht" name="p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_7-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::HealthConcernsSection::HealthConcernActEntry))
			Constraint name: HealthConcernsSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry[cda:act/cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.132'])=1">Error: Care Plan (V2) - 3.37.7 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_2_HealthConcernsSectionV2_templateId_3_37_1-error_mdht" see="#p-CarePlanV2_2_HealthConcernsSectionV2_templateId_3_37_1-error_mdht" name="p-CarePlanV2_2_HealthConcernsSectionV2_templateId_3_37_1-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.58' and id.extension = '2015-08-01')
			Constraint name: HealthConcernsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58' and @extension = '2015-08-01'">Error: Care Plan (V2) - 3.37.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-28804, CONF:1198-28805, CONF:1198-32862 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.58&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_2_HealthConcernsSectionV2_nullFlavor_3_37_2-error_mdht" see="#p-CarePlanV2_2_HealthConcernsSectionV2_nullFlavor_3_37_2-error_mdht" name="p-CarePlanV2_2_HealthConcernsSectionV2_nullFlavor_3_37_2-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: (not self.nullFlavor.oclIsUndefined()) implies (self.nullFlavor=vocab::NullFlavor::NI)
			Constraint name: HealthConcernsSectionNullFlavor
		-->
	<assert test="not(@nullFlavor) or @nullFlavor = 'NI'">Error: Care Plan (V2) - 3.37.2 nullFlavor
		Conformance: MAY contain zero or one [0..1] @nullFlavor=&quot;NI&quot;  (CONF:1198-32802)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_2_HealthConcernsSectionV2_code_3_37_3-error_mdht" see="#p-CarePlanV2_2_HealthConcernsSectionV2_code_3_37_3-error_mdht" name="p-CarePlanV2_2_HealthConcernsSectionV2_code_3_37_3-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '75310-3' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: HealthConcernsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '75310-3' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 3.37.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-28806)/@code=&quot;75310-3&quot; Health concerns document (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-28807, CONF:1198-28808)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: HealthConcernsSectionCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 3.37.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-28806)/@code=&quot;75310-3&quot; Health concerns document (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-28807, CONF:1198-28808)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_6-error_mdht" see="#p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_6-error_mdht" name="p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_6-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::HealthConcernsSection::HealthStatusObservation2Entry))
			Constraint name: HealthConcernsSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Care Plan (V2) - 3.37.6 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_2_HealthConcernsSectionV2_text_3_37_5-error_mdht" see="#p-CarePlanV2_2_HealthConcernsSectionV2_text_3_37_5-error_mdht" name="p-CarePlanV2_2_HealthConcernsSectionV2_text_3_37_5-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: HealthConcernsSectionText
		-->
	<assert test="cda:text">Error: Care Plan (V2) - 3.37.5 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:1198-28810)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_8-error_mdht" see="#p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_8-error_mdht" name="p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_8-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::HealthConcernsSection::RiskConcernActEntry))
			Constraint name: HealthConcernsSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Care Plan (V2) - 3.37.8 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthConcernsSection: 2.16.840.1.113883.10.20.22.2.58 -->

<pattern id="p-CarePlanV2_2_HealthConcernsSectionV2_title_3_37_4-error_mdht" see="#p-CarePlanV2_2_HealthConcernsSectionV2_title_3_37_4-error_mdht" name="p-CarePlanV2_2_HealthConcernsSectionV2_title_3_37_4-error_mdht">
		<!--
			UML path: /HealthConcernsSection
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: HealthConcernsSectionTitle
		-->
	<assert test="cda:title">Error: Care Plan (V2) - 3.37.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1198-28809)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusObservation2Entry -->

<pattern id="p-CarePlanV2_3A_HealthStatusObservation2Entry_healthStatusObservation2_3_37_6_i-error_mdht" see="#p-CarePlanV2_3A_HealthStatusObservation2Entry_healthStatusObservation2_3_37_6_i-error_mdht" name="p-CarePlanV2_3A_HealthStatusObservation2Entry_healthStatusObservation2_3_37_6_i-error_mdht">
		<!--
			UML path: /HealthConcernsSection/entry
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation2))->size() >= 0
			Constraint name: HealthConcernsSectionHealthStatusObservation2EntryHealthStatusObservation2
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']) &gt;= 0">Error: Care Plan (V2) - 3.37.6.i healthStatusObservation2
		Conformance: SHOULD contain zero or more [0..*] observation (CONF:1198-30483, CONF:1198-30484)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusObservation2: 2.16.840.1.113883.10.20.22.4.5 -->

<pattern id="p-CarePlanV2_3A_HealthStatusObservation2_text_4_52_5-error_mdht" see="#p-CarePlanV2_3A_HealthStatusObservation2_text_4_52_5-error_mdht" name="p-CarePlanV2_3A_HealthStatusObservation2_text_4_52_5-error_mdht">
		<!--
			UML path: /HealthStatusObservation2
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection/entry/healthStatusObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (true)
			Constraint name: HealthStatusObservationText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or true()">Error: Care Plan (V2) - 4.52.5 text
		Conformance: contain zero or one [0..1] text
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusObservation2: 2.16.840.1.113883.10.20.22.4.5 -->

<pattern id="p-CarePlanV2_3A_HealthStatusObservation2_id_4_52_3-error_mdht" see="#p-CarePlanV2_3A_HealthStatusObservation2_id_4_52_3-error_mdht" name="p-CarePlanV2_3A_HealthStatusObservation2_id_4_52_3-error_mdht">
		<!--
			UML path: /HealthStatusObservation2
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection/entry/healthStatusObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: HealthStatusObservation2Id
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.52.3 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-32486)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusObservation2: 2.16.840.1.113883.10.20.22.4.5 -->

<pattern id="p-CarePlanV2_3A_HealthStatusObservation2_templateId_4_52_1-error_mdht" see="#p-CarePlanV2_3A_HealthStatusObservation2_templateId_4_52_1-error_mdht" name="p-CarePlanV2_3A_HealthStatusObservation2_templateId_4_52_1-error_mdht">
		<!--
			UML path: /HealthStatusObservation2
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection/entry/healthStatusObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.5' and id.extension = '2014-06-09')
			Constraint name: HealthStatusObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5' and @extension = '2014-06-09'">Error: Care Plan (V2) - 4.52.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-16756, CONF:1098-16757, CONF:1098-32558 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.5&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusObservation2: 2.16.840.1.113883.10.20.22.4.5 -->

<pattern id="p-CarePlanV2_3A_HealthStatusObservation2_statusCode_4_52_6-error_mdht" see="#p-CarePlanV2_3A_HealthStatusObservation2_statusCode_4_52_6-error_mdht" name="p-CarePlanV2_3A_HealthStatusObservation2_statusCode_4_52_6-error_mdht">
		<!--
			UML path: /HealthStatusObservation2
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection/entry/healthStatusObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: HealthStatusObservationStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Care Plan (V2) - 4.52.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-9074)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-19103)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: HealthStatusObservationStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Care Plan (V2) - 4.52.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-9074)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-19103)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusObservation2: 2.16.840.1.113883.10.20.22.4.5 -->

<pattern id="p-CarePlanV2_3A_HealthStatusObservation2_code_4_52_4-error_mdht" see="#p-CarePlanV2_3A_HealthStatusObservation2_code_4_52_4-error_mdht" name="p-CarePlanV2_3A_HealthStatusObservation2_code_4_52_4-error_mdht">
		<!--
			UML path: /HealthStatusObservation2
			UML root path: /CarePlan/component/structuredBody/healthConcernsSection/healthConcernsSection/entry/healthStatusObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: HealthStatusObservationCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 4.52.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-19143)/@code=&quot;11323-3&quot; Health status (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-19144, CONF:1098-32161)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '11323-3' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: HealthStatusObservationCode
		-->
	<assert test="cda:code and cda:code[@code = '11323-3' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 4.52.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-19143)/@code=&quot;11323-3&quot; Health status (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-19144, CONF:1098-32161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-CarePlanV2_2_Component_goalsSection_2_1_13_i_b_1-error_mdht" see="#p-CarePlanV2_2_Component_goalsSection_2_1_13_i_b_1-error_mdht" name="p-CarePlanV2_2_Component_goalsSection_2_1_13_i_b_1-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody/goalsSection
			UML root path: /CarePlan/component/structuredBody/goalsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GoalsSection))
			Constraint name: CarePlanComponentStructuredBodyComponentGoalsSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60'])=1">Error: Care Plan (V2) - 2.1.13.i.b.1 goalsSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-28761, CONF:1198-28762)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalsSection: 2.16.840.1.113883.10.20.22.2.60 -->

<pattern id="p-CarePlanV2_2_GoalsSection_code_3_36_3-error_mdht" see="#p-CarePlanV2_2_GoalsSection_code_3_36_3-error_mdht" name="p-CarePlanV2_2_GoalsSection_code_3_36_3-error_mdht">
		<!--
			UML path: /GoalsSection
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '61146-7' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: GoalsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '61146-7' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 3.36.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-29586)/@code=&quot;61146-7&quot; Goals (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-29588)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GoalsSectionCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 3.36.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-29586)/@code=&quot;61146-7&quot; Goals (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-29588)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalsSection: 2.16.840.1.113883.10.20.22.2.60 -->

<pattern id="p-CarePlanV2_2_GoalsSection_nullFlavor_3_36_2-error_mdht" see="#p-CarePlanV2_2_GoalsSection_nullFlavor_3_36_2-error_mdht" name="p-CarePlanV2_2_GoalsSection_nullFlavor_3_36_2-error_mdht">
		<!--
			UML path: /GoalsSection
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">
		<!--
			OCL: (not self.nullFlavor.oclIsUndefined()) implies (self.nullFlavor=vocab::NullFlavor::NI)
			Constraint name: GoalsSectionNullFlavor
		-->
	<assert test="not(@nullFlavor) or @nullFlavor = 'NI'">Error: Care Plan (V2) - 3.36.2 nullFlavor
		Conformance: MAY contain zero or one [0..1] @nullFlavor=&quot;NI&quot;  (CONF:1098-32819)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalsSection: 2.16.840.1.113883.10.20.22.2.60 -->

<pattern id="p-CarePlanV2_2_GoalsSection_templateId_3_36_1-error_mdht" see="#p-CarePlanV2_2_GoalsSection_templateId_3_36_1-error_mdht" name="p-CarePlanV2_2_GoalsSection_templateId_3_36_1-error_mdht">
		<!--
			UML path: /GoalsSection
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.60')
			Constraint name: GoalsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60'">Error: Care Plan (V2) - 3.36.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-29584, CONF:1098-29585 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.60&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalsSection: 2.16.840.1.113883.10.20.22.2.60 -->

<pattern id="p-CarePlanV2_3A_GoalsSection_entry_3_36_6-error_mdht" see="#p-CarePlanV2_3A_GoalsSection_entry_3_36_6-error_mdht" name="p-CarePlanV2_3A_GoalsSection_entry_3_36_6-error_mdht">
		<!--
			UML path: /GoalsSection
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::GoalsSection::GoalObservationEntry))
			Constraint name: GoalsSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry[cda:observation/cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121'])=1">Error: Care Plan (V2) - 3.36.6 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalsSection: 2.16.840.1.113883.10.20.22.2.60 -->

<pattern id="p-CarePlanV2_2_GoalsSection_text_3_36_5-error_mdht" see="#p-CarePlanV2_2_GoalsSection_text_3_36_5-error_mdht" name="p-CarePlanV2_2_GoalsSection_text_3_36_5-error_mdht">
		<!--
			UML path: /GoalsSection
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: GoalsSectionText
		-->
	<assert test="cda:text">Error: Care Plan (V2) - 3.36.5 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:1098-30722)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalsSection: 2.16.840.1.113883.10.20.22.2.60 -->

<pattern id="p-CarePlanV2_2_GoalsSection_title_3_36_4-error_mdht" see="#p-CarePlanV2_2_GoalsSection_title_3_36_4-error_mdht" name="p-CarePlanV2_2_GoalsSection_title_3_36_4-error_mdht">
		<!--
			UML path: /GoalsSection
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GoalsSectionTitle
		-->
	<assert test="cda:title">Error: Care Plan (V2) - 3.36.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1098-30721)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservationEntry -->

<pattern id="p-CarePlanV2_3A_GoalObservationEntry_goalObservation_3_36_6_i-error_mdht" see="#p-CarePlanV2_3A_GoalObservationEntry_goalObservation_3_36_6_i-error_mdht" name="p-CarePlanV2_3A_GoalObservationEntry_goalObservation_3_36_6_i-error_mdht">
		<!--
			UML path: /GoalsSection/entry
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry">
		<!--
			OCL: self.observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation))
			Constraint name: GoalsSectionGoalObservationEntryGoalObservation
		-->
	<assert test="cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Error: Care Plan (V2) - 3.36.6.i goalObservation
		Conformance: SHALL contain at least one [1..*] observation (CONF:1098-30719, CONF:1098-30720)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_authorParticipation_4_48_9-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_authorParticipation_4_48_9-error_mdht" name="p-CarePlanV2_3A_GoalObservation_authorParticipation_4_48_9-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))
			Constraint name: GoalObservationAuthorParticipation
		-->
	<assert test="cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">Error: Care Plan (V2) - 4.48.9 authorParticipation
		Conformance: SHALL contain  [1..*] author such that it  (CONF:1098-30995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_14-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_14-error_mdht" name="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_14-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::GoalObservation::GoalObservationEntryRelationship))
			Constraint name: GoalObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.48.14 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_id_4_48_4-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_id_4_48_4-error_mdht" name="p-CarePlanV2_3A_GoalObservation_id_4_48_4-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GoalObservationId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.48.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-32332)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_12-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_12-error_mdht" name="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_12-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::GoalObservation::EntryReferenceEntryRelationship))
			Constraint name: GoalObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.48.12 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_reference_4_48_10-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_reference_4_48_10-error_mdht" name="p-CarePlanV2_3A_GoalObservation_reference_4_48_10-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.reference->select(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))->size() >= 0
			Constraint name: GoalObservationReference
		-->
	<assert test="count(cda:reference) &gt;= 0">Error: Care Plan (V2) - 4.48.10 reference
		Conformance: MAY contain zero or more [0..*] reference (CONF:1098-32754)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_statusCode_4_48_6-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_statusCode_4_48_6-error_mdht" name="p-CarePlanV2_3A_GoalObservation_statusCode_4_48_6-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'active'
			Constraint name: GoalObservationStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'active']">Error: Care Plan (V2) - 4.48.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-32333)/@code=&quot;active&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-32334)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GoalObservationStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Care Plan (V2) - 4.48.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-32333)/@code=&quot;active&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-32334)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_value_4_48_8-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_value_4_48_8-error_mdht" name="p-CarePlanV2_3A_GoalObservation_value_4_48_8-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: ((not self.value->isEmpty()) and self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() <= 1)
			Constraint name: GoalObservationValue
		-->
	<assert test="not(cda:value and cda:value[not(@nullFlavor)]) or count(cda:value) &lt;= 1">Error: Care Plan (V2) - 4.48.8 value
		Conformance: MAY contain zero or one [0..1] value (CONF:1098-32743)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_15-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_15-error_mdht" name="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_15-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::GoalObservation::EntryReferenceEntryRelationship))
			Constraint name: GoalObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.48.15 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_classCode_4_48_2-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_classCode_4_48_2-error_mdht" name="p-CarePlanV2_3A_GoalObservation_classCode_4_48_2-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::OBS
			Constraint name: GoalObservationClassCode
		-->
	<assert test="@classCode = 'OBS'">Error: Care Plan (V2) - 4.48.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;OBS&quot; Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1098-30418)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_code_4_48_5-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_code_4_48_5-error_mdht" name="p-CarePlanV2_3A_GoalObservation_code_4_48_5-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GoalObservationCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 4.48.5 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-30784)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: GoalObservationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 4.48.5 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-30784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_moodCode_4_48_3-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_moodCode_4_48_3-error_mdht" name="p-CarePlanV2_3A_GoalObservation_moodCode_4_48_3-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::GOL
			Constraint name: GoalObservationMoodCode
		-->
	<assert test="@moodCode = 'GOL'">Error: Care Plan (V2) - 4.48.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;GOL&quot;  (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1098-30419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_13-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_13-error_mdht" name="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_13-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::GoalObservation::PriorityPreferenceEntryRelationship))
			Constraint name: GoalObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.48.13 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_effectiveTime_4_48_7-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_effectiveTime_4_48_7-error_mdht" name="p-CarePlanV2_3A_GoalObservation_effectiveTime_4_48_7-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: GoalObservationEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Care Plan (V2) - 4.48.7 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:1098-32335)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_templateId_4_48_1-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_templateId_4_48_1-error_mdht" name="p-CarePlanV2_3A_GoalObservation_templateId_4_48_1-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.121')
			Constraint name: GoalObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121'">Error: Care Plan (V2) - 4.48.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-8583, CONF:1098-10512 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.121&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GoalObservation: 2.16.840.1.113883.10.20.22.4.121 -->

<pattern id="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_11-error_mdht" see="#p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_11-error_mdht" name="p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_11-error_mdht">
		<!--
			UML path: /GoalObservation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::GoalObservation::EntryReferenceEntryRelationship))
			Constraint name: GoalObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.48.11 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthorParticipation: 2.16.840.1.113883.10.20.22.4.119 -->

<pattern id="p-CarePlanV2_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht" see="#p-CarePlanV2_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht" name="p-CarePlanV2_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht">
		<!--
			UML path: /AuthorParticipation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))
			Constraint name: AuthorParticipationAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: Care Plan (V2) - 4.48.9.iii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1098-31472)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthorParticipation: 2.16.840.1.113883.10.20.22.4.119 -->

<pattern id="p-CarePlanV2_3A_AuthorParticipation_time_4_48_9_ii-error_mdht" see="#p-CarePlanV2_3A_AuthorParticipation_time_4_48_9_ii-error_mdht" name="p-CarePlanV2_3A_AuthorParticipation_time_4_48_9_ii-error_mdht">
		<!--
			UML path: /AuthorParticipation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: AuthorParticipationTime
		-->
	<assert test="cda:time">Error: Care Plan (V2) - 4.48.9.ii time
		Conformance: SHALL contain exactly one [1..1] time (CONF:1098-31471)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthorParticipation: 2.16.840.1.113883.10.20.22.4.119 -->

<pattern id="p-CarePlanV2_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht" see="#p-CarePlanV2_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht" name="p-CarePlanV2_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht">
		<!--
			UML path: /AuthorParticipation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.119')
			Constraint name: AuthorParticipationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119'">Error: Care Plan (V2) - 4.48.9.i templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-32017, CONF:1098-32018 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.119&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht" see="#p-CarePlanV2_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht" name="p-CarePlanV2_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: code.codeSystem = '2.16.840.1.113883.6.101' or code.codeSystem = '2.16.840.1.113883.5.111'
			Constraint name: AuthorParticipationAssignedAuthorCodeTerminology
		-->
	<assert test="cda:code/@codeSystem = '2.16.840.1.113883.6.101' or cda:code/@codeSystem = '2.16.840.1.113883.5.111'">Error: Care Plan (V2) - 4.48.9.iii.e AuthorParticipationAssignedAuthorCodeTerminology
		Conformance: code/@code SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC. If the content is patient authored the code/@code SHOULD be selected from Personal And Legal Relationship Role Type (2.16.840.1.113883.11.20.12.1) (CONF:1098-31671, CONF:1098-32315)
		Analysis: code/@code SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC. If the content is patient authored the code/@code SHOULD be selected from Personal And Legal Relationship Role Type (2.16.840.1.113883.11.20.12.1)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht" see="#p-CarePlanV2_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht" name="p-CarePlanV2_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: AuthorParticipationAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 4.48.9.iii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:1098-31671)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht" see="#p-CarePlanV2_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht" name="p-CarePlanV2_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: self.assignedPerson->select(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::AuthorParticipation::AssignedAuthor::AssignedPerson))->size() <= 1
			Constraint name: AuthorParticipationAssignedAuthorAssignedPerson
		-->
	<assert test="count(cda:assignedPerson) &lt;= 1">Error: Care Plan (V2) - 4.48.9.iii.c assignedPerson
		Conformance: MAY contain zero or one [0..1] assignedPerson (CONF:1098-31474)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht" see="#p-CarePlanV2_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht" name="p-CarePlanV2_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: self.representedOrganization->select(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(consol::AuthorParticipation::AssignedAuthor::RepresentedOrganization))->size() <= 1
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganization
		-->
	<assert test="count(cda:representedOrganization) &lt;= 1">Error: Care Plan (V2) - 4.48.9.iii.d representedOrganization
		Conformance: MAY contain zero or one [0..1] representedOrganization (CONF:1098-31476)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht" see="#p-CarePlanV2_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht" name="p-CarePlanV2_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: AuthorParticipationAssignedAuthorId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.48.9.iii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-31473)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedPerson -->

<pattern id="p-CarePlanV2_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht" see="#p-CarePlanV2_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht" name="p-CarePlanV2_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/assignedPerson
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorAssignedPersonName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or cda:name">Error: Care Plan (V2) - 4.48.9.iii.c.1 name
		Conformance: MAY contain zero or more [0..*] name (CONF:1098-31475)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-CarePlanV2_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht" see="#p-CarePlanV2_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht" name="p-CarePlanV2_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::EntityClassOrganization::ORG
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'ORG'">Error: Care Plan (V2) - 4.48.9.iii.d.1 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ORG&quot;  (CONF:1098-31477)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-CarePlanV2_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht" see="#p-CarePlanV2_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht" name="p-CarePlanV2_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or cda:name">Error: Care Plan (V2) - 4.48.9.iii.d.3 name
		Conformance: MAY contain zero or more [0..*] name (CONF:1098-31479)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-CarePlanV2_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht" see="#p-CarePlanV2_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht" name="p-CarePlanV2_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Care Plan (V2) - 4.48.9.iii.d.2 id
		Conformance: MAY contain zero or more [0..*] id (CONF:1098-31478)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-CarePlanV2_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht" see="#p-CarePlanV2_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht" name="p-CarePlanV2_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Care Plan (V2) - 4.48.9.iii.d.5 addr
		Conformance: MAY contain zero or more [0..*] addr (CONF:1098-31481)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-CarePlanV2_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht" see="#p-CarePlanV2_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht" name="p-CarePlanV2_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Care Plan (V2) - 4.48.9.iii.d.4 telecom
		Conformance: MAY contain zero or more [0..*] telecom (CONF:1098-31480)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_typeCode_4_48_10_i-error_mdht" see="#p-CarePlanV2_3A_Reference_typeCode_4_48_10_i-error_mdht" name="p-CarePlanV2_3A_Reference_typeCode_4_48_10_i-error_mdht">
		<!--
			UML path: /GoalObservation/reference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference">
		<!--
			OCL: self.typeCode=vocab::x_ActRelationshipExternalReference::REFR
			Constraint name: GoalObservationReferenceTypeCode
		-->
	<assert test="@typeCode = 'REFR'">Error: Care Plan (V2) - 4.48.10.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;REFR&quot;  (CONF:1098-32755)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_externalDocumentReference_4_48_10_ii-error_mdht" see="#p-CarePlanV2_3A_Reference_externalDocumentReference_4_48_10_ii-error_mdht" name="p-CarePlanV2_3A_Reference_externalDocumentReference_4_48_10_ii-error_mdht">
		<!--
			UML path: /GoalObservation/reference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference">
		<!--
			OCL: self.externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference))
			Constraint name: GoalObservationReferenceExternalDocumentReference
		-->
	<assert test="count(cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115'])=1">Error: Care Plan (V2) - 4.48.10.ii externalDocumentReference
		Conformance: SHALL contain exactly one [1..1] externalDocument (CONF:1098-32756)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocumentReference: 2.16.840.1.113883.10.20.22.4.115 -->

<pattern id="p-CarePlanV2_3A_ExternalDocumentReference_id_4_48_10_ii_d-error_mdht" see="#p-CarePlanV2_3A_ExternalDocumentReference_id_4_48_10_ii_d-error_mdht" name="p-CarePlanV2_3A_ExternalDocumentReference_id_4_48_10_ii_d-error_mdht">
		<!--
			UML path: /ExternalDocumentReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference/externalDocumentReference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">
		<!--
			OCL: self.id->size() = 1
			Constraint name: ExternalDocumentReferenceId
		-->
	<assert test="count(cda:id) = 1">Error: Care Plan (V2) - 4.48.10.ii.d id
		Conformance: SHALL contain exactly one [1..1] id (CONF:1098-32751)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocumentReference: 2.16.840.1.113883.10.20.22.4.115 -->

<pattern id="p-CarePlanV2_3A_ExternalDocumentReference_versionNumber_4_48_10_ii_g-error_mdht" see="#p-CarePlanV2_3A_ExternalDocumentReference_versionNumber_4_48_10_ii_g-error_mdht" name="p-CarePlanV2_3A_ExternalDocumentReference_versionNumber_4_48_10_ii_g-error_mdht">
		<!--
			UML path: /ExternalDocumentReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference/externalDocumentReference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: ExternalDocumentReferenceVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: Care Plan (V2) - 4.48.10.ii.g versionNumber
		Conformance: SHOULD contain zero or one [0..1] versionNumber (CONF:1098-32753)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocumentReference: 2.16.840.1.113883.10.20.22.4.115 -->

<pattern id="p-CarePlanV2_3A_ExternalDocumentReference_moodCode_4_48_10_ii_c-error_mdht" see="#p-CarePlanV2_3A_ExternalDocumentReference_moodCode_4_48_10_ii_c-error_mdht" name="p-CarePlanV2_3A_ExternalDocumentReference_moodCode_4_48_10_ii_c-error_mdht">
		<!--
			UML path: /ExternalDocumentReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference/externalDocumentReference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">
		<!--
			OCL: isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN
			Constraint name: ExternalDocumentReferenceMoodCode
		-->
	<assert test="attribute::node()[name() = 'moodCode'] and @moodCode = 'EVN'">Error: Care Plan (V2) - 4.48.10.ii.c moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1098-31932)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocumentReference: 2.16.840.1.113883.10.20.22.4.115 -->

<pattern id="p-CarePlanV2_3A_ExternalDocumentReference_setId_4_48_10_ii_f-error_mdht" see="#p-CarePlanV2_3A_ExternalDocumentReference_setId_4_48_10_ii_f-error_mdht" name="p-CarePlanV2_3A_ExternalDocumentReference_setId_4_48_10_ii_f-error_mdht">
		<!--
			UML path: /ExternalDocumentReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference/externalDocumentReference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: ExternalDocumentReferenceSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: Care Plan (V2) - 4.48.10.ii.f setId
		Conformance: SHOULD contain zero or one [0..1] setId (CONF:1098-32752)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocumentReference: 2.16.840.1.113883.10.20.22.4.115 -->

<pattern id="p-CarePlanV2_3A_ExternalDocumentReference_code_4_48_10_ii_e-error_mdht" see="#p-CarePlanV2_3A_ExternalDocumentReference_code_4_48_10_ii_e-error_mdht" name="p-CarePlanV2_3A_ExternalDocumentReference_code_4_48_10_ii_e-error_mdht">
		<!--
			UML path: /ExternalDocumentReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference/externalDocumentReference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ExternalDocumentReferenceCode
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 4.48.10.ii.e code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-31933)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocumentReference: 2.16.840.1.113883.10.20.22.4.115 -->

<pattern id="p-CarePlanV2_3A_ExternalDocumentReference_classCode_4_48_10_ii_b-error_mdht" see="#p-CarePlanV2_3A_ExternalDocumentReference_classCode_4_48_10_ii_b-error_mdht" name="p-CarePlanV2_3A_ExternalDocumentReference_classCode_4_48_10_ii_b-error_mdht">
		<!--
			UML path: /ExternalDocumentReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference/externalDocumentReference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::ActClassDocument::DOCCLIN
			Constraint name: ExternalDocumentReferenceClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'DOCCLIN'">Error: Care Plan (V2) - 4.48.10.ii.b classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;DOCCLIN&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1098-31931)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocumentReference: 2.16.840.1.113883.10.20.22.4.115 -->

<pattern id="p-CarePlanV2_3A_ExternalDocumentReference_templateId_4_48_10_ii_a-error_mdht" see="#p-CarePlanV2_3A_ExternalDocumentReference_templateId_4_48_10_ii_a-error_mdht" name="p-CarePlanV2_3A_ExternalDocumentReference_templateId_4_48_10_ii_a-error_mdht">
		<!--
			UML path: /ExternalDocumentReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/reference/externalDocumentReference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.115')
			Constraint name: ExternalDocumentReferenceTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115'">Error: Care Plan (V2) - 4.48.10.ii.a templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-32748, CONF:1098-32750 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.115&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EntryReferenceEntryRelationship -->

<pattern id="p-CarePlanV2_3A_EntryReferenceEntryRelationship_healthConcernActER_4_48_11_i-error_mdht" see="#p-CarePlanV2_3A_EntryReferenceEntryRelationship_healthConcernActER_4_48_11_i-error_mdht" name="p-CarePlanV2_3A_EntryReferenceEntryRelationship_healthConcernActER_4_48_11_i-error_mdht">
		<!--
			UML path: /GoalObservation/entryRelationship
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship">
		<!--
			OCL: self.act->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference))->size() >= 0
			Constraint name: GoalObservationEntryReferenceEntryRelationshipHealthConcernActER
		-->
	<assert test="count(cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']) &gt;= 0">Error: Care Plan (V2) - 4.48.11.i healthConcernActER
		Conformance: MAY contain zero or more [0..*] act (CONF:1098-30701, CONF:1098-30702, CONF:1098-30703)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EntryReference: 2.16.840.1.113883.10.20.22.4.122 -->

<pattern id="p-CarePlanV2_3A_EntryReference_moodCode_4_36_3-error_mdht" see="#p-CarePlanV2_3A_EntryReference_moodCode_4_36_3-error_mdht" name="p-CarePlanV2_3A_EntryReference_moodCode_4_36_3-error_mdht">
		<!--
			UML path: /EntryReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: EntryReferenceMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Care Plan (V2) - 4.36.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1098-31486)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EntryReference: 2.16.840.1.113883.10.20.22.4.122 -->

<pattern id="p-CarePlanV2_3A_EntryReference_templateId_4_36_1-error_mdht" see="#p-CarePlanV2_3A_EntryReference_templateId_4_36_1-error_mdht" name="p-CarePlanV2_3A_EntryReference_templateId_4_36_1-error_mdht">
		<!--
			UML path: /EntryReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.122')
			Constraint name: EntryReferenceTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122'">Error: Care Plan (V2) - 4.36.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-31487, CONF:1098-31488 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.122&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EntryReference: 2.16.840.1.113883.10.20.22.4.122 -->

<pattern id="p-CarePlanV2_3A_EntryReference_code_4_36_5-error_mdht" see="#p-CarePlanV2_3A_EntryReference_code_4_36_5-error_mdht" name="p-CarePlanV2_3A_EntryReference_code_4_36_5-error_mdht">
		<!--
			UML path: /EntryReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: EntryReferenceCode
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 4.36.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-31490)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EntryReference: 2.16.840.1.113883.10.20.22.4.122 -->

<pattern id="p-CarePlanV2_3A_EntryReference_statusCode_4_36_6-error_mdht" see="#p-CarePlanV2_3A_EntryReference_statusCode_4_36_6-error_mdht" name="p-CarePlanV2_3A_EntryReference_statusCode_4_36_6-error_mdht">
		<!--
			UML path: /EntryReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()
			Constraint name: EntryReferenceStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@codeSystem or @codeSystemName]">Error: Care Plan (V2) - 4.36.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-31498)/@code=&quot;completed&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-31499)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: EntryReferenceStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Care Plan (V2) - 4.36.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-31498)/@code=&quot;completed&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-31499)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EntryReference: 2.16.840.1.113883.10.20.22.4.122 -->

<pattern id="p-CarePlanV2_3A_EntryReference_classCode_4_36_2-error_mdht" see="#p-CarePlanV2_3A_EntryReference_classCode_4_36_2-error_mdht" name="p-CarePlanV2_3A_EntryReference_classCode_4_36_2-error_mdht">
		<!--
			UML path: /EntryReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: EntryReferenceClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: Care Plan (V2) - 4.36.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1098-31485)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EntryReference: 2.16.840.1.113883.10.20.22.4.122 -->

<pattern id="p-CarePlanV2_3A_EntryReference_id_4_36_4-error_mdht" see="#p-CarePlanV2_3A_EntryReference_id_4_36_4-error_mdht" name="p-CarePlanV2_3A_EntryReference_id_4_36_4-error_mdht">
		<!--
			UML path: /EntryReference
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: EntryReferenceId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.36.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-31489)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- II -->

<pattern id="p-CarePlanV2_3A_II_nullFlavor_4_36_4_i-error_mdht" see="#p-CarePlanV2_3A_II_nullFlavor_4_36_4_i-error_mdht" name="p-CarePlanV2_3A_II_nullFlavor_4_36_4_i-error_mdht">
		<!--
			UML path: /EntryReference/id
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER/id
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']/cda:id">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not (not self.nullFlavor.oclIsUndefined())) ))
			Constraint name: EntryReferenceIINullFlavor
		-->
	<assert test="@nullFlavor or not(@nullFlavor)">Error: Care Plan (V2) - 4.36.4.i nullFlavor
		Conformance: SHALL NOT contain  [0..0] @nullFlavor
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CD -->

<pattern id="p-CarePlanV2_3A_CD_nullFlavor_4_36_5_i-error_mdht" see="#p-CarePlanV2_3A_CD_nullFlavor_4_36_5_i-error_mdht" name="p-CarePlanV2_3A_CD_nullFlavor_4_36_5_i-error_mdht">
		<!--
			UML path: /EntryReference/code
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/entryRelationship/healthConcernActER/code
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']/cda:code">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.nullFlavor.oclIsUndefined() and self.nullFlavor.oclIsKindOf(vocab::NullFlavor) and 
let value : vocab::NullFlavor = self.nullFlavor.oclAsType(vocab::NullFlavor) in 
value = vocab::NullFlavor::NP ))
			Constraint name: EntryReferenceCDNullFlavor
		-->
	<assert test="@nullFlavor or @nullFlavor and @nullFlavor[. = 'NP']">Error: Care Plan (V2) - 4.36.5.i nullFlavor
		Conformance: SHALL contain exactly one [1..1] @nullFlavor (CONF:1098-31491)/@code=&quot;NP&quot; Not Present (CodeSystem: 2.16.840.1.113883.5.1008 HL7NullFlavor) (CONF:1098-31491)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (isDefined('nullFlavor') ))
			Constraint name: EntryReferenceCDNullFlavorP
		-->
	<assert test="@nullFlavor or attribute::node()[name() = 'nullFlavor']">Error: Care Plan (V2) - 4.36.5.i nullFlavor
		Conformance: SHALL contain exactly one [1..1] @nullFlavor (CONF:1098-31491)/@code=&quot;NP&quot; Not Present (CodeSystem: 2.16.840.1.113883.5.1008 HL7NullFlavor) (CONF:1098-31491)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-CarePlanV2_2_Component_interventionsSection2_2_1_13_i_c_1-error_mdht" see="#p-CarePlanV2_2_Component_interventionsSection2_2_1_13_i_c_1-error_mdht" name="p-CarePlanV2_2_Component_interventionsSection2_2_1_13_i_c_1-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody/interventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2))->size() <= 1
			Constraint name: CarePlanComponentStructuredBodyComponentInterventionsSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']) &lt;= 1">Error: Care Plan (V2) - 2.1.13.i.c.1 interventionsSection2
		Conformance: SHOULD contain zero or one [0..1] section (CONF:1198-28763, CONF:1198-28764)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionsSection2: 2.16.840.1.113883.10.20.21.2.3 -->

<pattern id="p-CarePlanV2_2_InterventionsSectionV3_templateId_3_59_1-error_mdht" see="#p-CarePlanV2_2_InterventionsSectionV3_templateId_3_59_1-error_mdht" name="p-CarePlanV2_2_InterventionsSectionV3_templateId_3_59_1-error_mdht">
		<!--
			UML path: /InterventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.3' and id.extension = '2015-08-01')
			Constraint name: InterventionsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3' and @extension = '2015-08-01'">Error: Care Plan (V2) - 3.59.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8680, CONF:1198-10461, CONF:1198-32559 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.21.2.3&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionsSection2: 2.16.840.1.113883.10.20.21.2.3 -->

<pattern id="p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_6-error_mdht" see="#p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_6-error_mdht" name="p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_6-error_mdht">
		<!--
			UML path: /InterventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::InterventionsSection2::PlannedInterventionActEntry))
			Constraint name: InterventionsSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Care Plan (V2) - 3.59.6 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionsSection2: 2.16.840.1.113883.10.20.21.2.3 -->

<pattern id="p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_5-error_mdht" see="#p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_5-error_mdht" name="p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_5-error_mdht">
		<!--
			UML path: /InterventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::InterventionsSection2::HandoffCommunicationParticipantsEntry))
			Constraint name: InterventionsSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Care Plan (V2) - 3.59.5 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionsSection2: 2.16.840.1.113883.10.20.21.2.3 -->

<pattern id="p-CarePlanV2_2_InterventionsSectionV3_code_3_59_3-error_mdht" see="#p-CarePlanV2_2_InterventionsSectionV3_code_3_59_3-error_mdht" name="p-CarePlanV2_2_InterventionsSectionV3_code_3_59_3-error_mdht">
		<!--
			UML path: /InterventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: InterventionsSectionCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 3.59.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15377)/@code=&quot;62387-6&quot; Interventions Provided (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15378, CONF:1198-30864)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '62387-6' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: InterventionsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '62387-6' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 3.59.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15377)/@code=&quot;62387-6&quot; Interventions Provided (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15378, CONF:1198-30864)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionsSection2: 2.16.840.1.113883.10.20.21.2.3 -->

<pattern id="p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_4-error_mdht" see="#p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_4-error_mdht" name="p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_4-error_mdht">
		<!--
			UML path: /InterventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::InterventionsSection2::InterventionActEntry))
			Constraint name: InterventionsSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Care Plan (V2) - 3.59.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionsSection2: 2.16.840.1.113883.10.20.21.2.3 -->

<pattern id="p-CarePlanV2_2_InterventionsSectionV3_title_3_59_3-error_mdht" see="#p-CarePlanV2_2_InterventionsSectionV3_title_3_59_3-error_mdht" name="p-CarePlanV2_2_InterventionsSectionV3_title_3_59_3-error_mdht">
		<!--
			UML path: /InterventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: InterventionsSectionTitle
		-->
	<assert test="cda:title">Error: Care Plan (V2) - 3.59.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8682, R2.1=CONF:1198-8682)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionsSection2: 2.16.840.1.113883.10.20.21.2.3 -->

<pattern id="p-CarePlanV2_2_InterventionsSectionV3_text_3_59_4-error_mdht" see="#p-CarePlanV2_2_InterventionsSectionV3_text_3_59_4-error_mdht" name="p-CarePlanV2_2_InterventionsSectionV3_text_3_59_4-error_mdht">
		<!--
			UML path: /InterventionsSection2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: InterventionsSectionText
		-->
	<assert test="cda:text">Error: Care Plan (V2) - 3.59.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8683, R2.1=CONF:1198-8683)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionActEntry -->

<pattern id="p-CarePlanV2_3A_InterventionActEntry_interventionAct_3_59_4_i-error_mdht" see="#p-CarePlanV2_3A_InterventionActEntry_interventionAct_3_59_4_i-error_mdht" name="p-CarePlanV2_3A_InterventionActEntry_interventionAct_3_59_4_i-error_mdht">
		<!--
			UML path: /InterventionsSection2/entry
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry">
		<!--
			OCL: self.act->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct))->size() >= 0
			Constraint name: InterventionsSection2InterventionActEntryInterventionAct
		-->
	<assert test="count(cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']) &gt;= 0">Error: Care Plan (V2) - 3.59.4.i interventionAct
		Conformance: SHOULD contain zero or more [0..*] act (CONF:1198-30996, CONF:1198-30997)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_effectiveTime_4_65_7-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_effectiveTime_4_65_7-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_effectiveTime_4_65_7-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: InterventionActEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Care Plan (V2) - 4.65.7 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:1198-31624)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_11-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_11-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_11-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::ImmunizationActivity2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.11 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_15-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_15-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_15-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::ProcedureActivityObservation2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.15 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_21-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_21-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_21-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::EntryReferenceEntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.21 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_24-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_24-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_24-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::PlannedInterventionActEntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.24 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_classCode_4_65_2-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_classCode_4_65_2-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_classCode_4_65_2-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: InterventionActClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: Care Plan (V2) - 4.65.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1198-30971)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_10-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_10-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_10-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::AdvanceDirectiveObservation2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.10 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_18-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_18-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_18-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::Instruction2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.18 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_id_4_65_4-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_id_4_65_4-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_id_4_65_4-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: InterventionActId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.65.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-30975)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_13-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_13-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_13-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::ProcedureActivityAct2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.13 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_statusCode_4_65_6-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_statusCode_4_65_6-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_statusCode_4_65_6-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: InterventionActStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Care Plan (V2) - 4.65.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1198-30979)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1198-32316)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: InterventionActStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Care Plan (V2) - 4.65.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1198-30979)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1198-32316)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_16-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_16-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_16-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::ProcedureActivityProcedure2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.16 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_19-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_19-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_19-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::NonMedicinalSupplyActivity2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.19 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_20-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_20-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_20-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::NutritionRecommendationEntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.20 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_reference_4_65_9-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_reference_4_65_9-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_reference_4_65_9-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.reference->select(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))->size() >= 0
			Constraint name: InterventionActReference
		-->
	<assert test="count(cda:reference) &gt;= 0">Error: Care Plan (V2) - 4.65.9 reference
		Conformance: MAY contain zero or more [0..*] reference (CONF:1198-32760)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_moodCode_4_65_3-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_moodCode_4_65_3-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_moodCode_4_65_3-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: InterventionActMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Care Plan (V2) - 4.65.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1198-30972)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_code_4_65_5-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_code_4_65_5-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_code_4_65_5-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: InterventionActCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 4.65.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-30976)/@code=&quot;362956003&quot; procedure / intervention (navigational concept) (CodeSystem: 2.16.840.1.113883.6.96 SNOMEDCT) (CONF:1198-30977, CONF:1198-30978)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '362956003' and value.codeSystem = '2.16.840.1.113883.6.96'
			Constraint name: InterventionActCode
		-->
	<assert test="cda:code and cda:code[@code = '362956003' and @codeSystem = '2.16.840.1.113883.6.96']">Error: Care Plan (V2) - 4.65.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-30976)/@code=&quot;362956003&quot; procedure / intervention (navigational concept) (CodeSystem: 2.16.840.1.113883.6.96 SNOMEDCT) (CONF:1198-30977, CONF:1198-30978)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_authorParticipation_4_65_8-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_authorParticipation_4_65_8-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_authorParticipation_4_65_8-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))->size() >= 0
			Constraint name: InterventionActAuthorParticipation
		-->
	<assert test="count(cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']) &gt;= 0">Error: Care Plan (V2) - 4.65.8 authorParticipation
		Conformance: SHOULD contain  [0..*] author such that it  (CONF:1198-31552)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_23-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_23-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_23-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::HandoffCommunicationParticipantsEntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.23 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_12-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_12-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_12-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::MedicationActivity2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.12 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_14-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_14-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_14-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::InterventionActEntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.14 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_17-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_17-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_17-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::EncounterActivity2EntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.17 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_22-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_22-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_22-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::InterventionAct::GoalObsEntryReferenceEntryRelationship))
			Constraint name: InterventionActEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.65.22 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InterventionAct: 2.16.840.1.113883.10.20.22.4.131 -->

<pattern id="p-CarePlanV2_3A_InterventionActV2_templateId_4_65_1-error_mdht" see="#p-CarePlanV2_3A_InterventionActV2_templateId_4_65_1-error_mdht" name="p-CarePlanV2_3A_InterventionActV2_templateId_4_65_1-error_mdht">
		<!--
			UML path: /InterventionAct
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.131' and id.extension = '2015-08-01')
			Constraint name: InterventionActTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131' and @extension = '2015-08-01'">Error: Care Plan (V2) - 4.65.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-30973, CONF:1198-30974, CONF:1198-32916 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.131&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_externalDocumentReference_4_65_9_ii-error_mdht" see="#p-CarePlanV2_3A_Reference_externalDocumentReference_4_65_9_ii-error_mdht" name="p-CarePlanV2_3A_Reference_externalDocumentReference_4_65_9_ii-error_mdht">
		<!--
			UML path: /InterventionAct/reference
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:reference">
		<!--
			OCL: self.externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference))
			Constraint name: InterventionActReferenceExternalDocumentReference
		-->
	<assert test="count(cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115'])=1">Error: Care Plan (V2) - 4.65.9.ii externalDocumentReference
		Conformance: SHALL contain exactly one [1..1] externalDocument (CONF:1198-32762)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_typeCode_4_65_9_i-error_mdht" see="#p-CarePlanV2_3A_Reference_typeCode_4_65_9_i-error_mdht" name="p-CarePlanV2_3A_Reference_typeCode_4_65_9_i-error_mdht">
		<!--
			UML path: /InterventionAct/reference
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:reference">
		<!--
			OCL: self.typeCode=vocab::x_ActRelationshipExternalReference::REFR
			Constraint name: InterventionActReferenceTypeCode
		-->
	<assert test="@typeCode = 'REFR'">Error: Care Plan (V2) - 4.65.9.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;REFR&quot;  (CONF:1198-32761)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2EntryRelationship -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservation2EntryRelationship_advanceDirectiveObservation2_4_65_10_i-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservation2EntryRelationship_advanceDirectiveObservation2_4_65_10_i-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservation2EntryRelationship_advanceDirectiveObservation2_4_65_10_i-error_mdht">
		<!--
			UML path: /InterventionAct/entryRelationship
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2))->size() >= 0
			Constraint name: InterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']) &gt;= 0">Error: Care Plan (V2) - 4.65.10.i advanceDirectiveObservation2
		Conformance: MAY contain zero or more [0..*] observation (CONF:1198-30980, CONF:1198-30981, CONF:1198-30982)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_reference_4_4_8-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_reference_4_4_8-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_reference_4_4_8-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))
			Constraint name: AdvanceDirectiveObservationReference
		-->
	<assert test="cda:reference">Error: Care Plan (V2) - 4.4.8 reference
		Conformance: SHOULD contain at least one [1..*] reference (CONF:1198-8692)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_id_4_4_4-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_id_4_4_4-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_id_4_4_4-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: AdvanceDirectiveObservationId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.4.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:8654, R2.1=CONF:1198-8654)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_verifier_4_4_6-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_verifier_4_4_6-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_verifier_4_4_6-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::VRF)->size() >= 0
			Constraint name: AdvanceDirectiveObservationVerifier
		-->
	<assert test="count(cda:participant[@typeCode = 'VRF']) &gt;= 0">Error: Care Plan (V2) - 4.4.6 verifier
		Conformance: SHOULD contain zero or more [0..*] participant (CONF:1198-8662)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_templateId_4_4_1-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_templateId_4_4_1-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_templateId_4_4_1-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.48' and id.extension = '2015-08-01')
			Constraint name: AdvanceDirectiveObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48' and @extension = '2015-08-01'">Error: Care Plan (V2) - 4.4.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8655, CONF:1198-10485, CONF:1198-32496 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.48&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasStartingTime_4_4_10-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasStartingTime_4_4_10-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasStartingTime_4_4_10-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: true
			Constraint name: AdvanceDirectiveObservationHasStartingTime
		-->
	<assert test="true()">Error: Care Plan (V2) - 4.4.10 AdvanceDirectiveObservationHasStartingTime
		Conformance: MAY satisfy: This constraint is being overridden as it has been removed in v2 and should never fire.
		Analysis: This constraint is being overridden as it has been removed in v2 and should never fire.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_value_4_4_5-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_value_4_4_5-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_value_4_4_5-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.value->size() = 1
			Constraint name: AdvanceDirectiveObservation2Value
		-->
	<assert test="count(cda:value) = 1">Error: Care Plan (V2) - 4.4.5 value
		Conformance: SHALL contain exactly one [1..1] value (CONF:1198-30804)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_moodCode_4_4_3-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_moodCode_4_4_3-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_moodCode_4_4_3-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: AdvanceDirectiveObservationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Care Plan (V2) - 4.4.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:8649, R2.1=CONF:1198-8649)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_code_4_4_3-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_code_4_4_3-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_code_4_4_3-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: AdvanceDirectiveObservationCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 4.4.3 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from ValueSet AdvanceDirectiveTypeCode 2.16.840.1.113883.1.11.20.2 STATIC 2006-10-17 (CONF:1198-8651)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '52765003' or value.code = '61420007' or value.code = '71388002' or value.code = '78823007' or value.code = '89666000' or value.code = '225204009' or value.code = '281789004' or value.code = '304251008')
			Constraint name: AdvanceDirectiveObservationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.96' and (@code = '52765003' or @code = '61420007' or @code = '71388002' or @code = '78823007' or @code = '89666000' or @code = '225204009' or @code = '281789004' or @code = '304251008')]">Error: Care Plan (V2) - 4.4.3 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from ValueSet AdvanceDirectiveTypeCode 2.16.840.1.113883.1.11.20.2 STATIC 2006-10-17 (CONF:1198-8651)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasEndingTime_4_4_11-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasEndingTime_4_4_11-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasEndingTime_4_4_11-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.effectiveTime.high.hasContent() or self.effectiveTime.high.nullFlavor = vocab::NullFlavor::NA
			Constraint name: AdvanceDirectiveObservationHasEndingTime
		-->
	<assert test="cda:effectiveTime/cda:high[attribute::node()[name() != 'nullFlavor'] | child::node()] or cda:effectiveTime/cda:high/@nullFlavor = 'NA'">Error: Care Plan (V2) - 4.4.11 AdvanceDirectiveObservationHasEndingTime
		Conformance: If the Advance Directive does not have a specified ending time, the &amp;lt;high&amp;gt; element SHALL have the nullFlavor attribute set to NA (CONF:1198-32449)
		Analysis: If the Advance Directive does not have a specified ending time, the  element SHALL have the nullFlavor attribute set to NA
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_effectiveTime_4_4_4-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_effectiveTime_4_4_4-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_effectiveTime_4_4_4-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: AdvanceDirectiveObservationEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Care Plan (V2) - 4.4.4 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:1198-8656)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_statusCode_4_4_6-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_statusCode_4_4_6-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_statusCode_4_4_6-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: true
			Constraint name: AdvanceDirectiveObservationStatusCodeP
		-->
	<assert test="true()">Error: Care Plan (V2) - 4.4.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:8652, R2.1=CONF:1198-8652, R2.1=CONF:1198-19082)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: AdvanceDirectiveObservationStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Care Plan (V2) - 4.4.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:8652, R2.1=CONF:1198-8652, R2.1=CONF:1198-19082)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_custodian_4_4_7-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_custodian_4_4_7-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_custodian_4_4_7-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::CST)->size() >= 0
			Constraint name: AdvanceDirectiveObservationCustodian
		-->
	<assert test="count(cda:participant[@typeCode = 'CST']) &gt;= 0">Error: Care Plan (V2) - 4.4.7 custodian
		Conformance: SHOULD contain zero or more [0..*] participant (CONF:1198-8667)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_classCode_4_4_2-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_classCode_4_4_2-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_classCode_4_4_2-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::OBS
			Constraint name: AdvanceDirectiveObservationClassCode
		-->
	<assert test="@classCode = 'OBS'">Error: Care Plan (V2) - 4.4.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;OBS&quot; Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:8648, R2.1=CONF:1198-8648)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AdvanceDirectiveObservation2: 2.16.840.1.113883.10.20.22.4.48 -->

<pattern id="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_authorParticipation_4_4_9-error_mdht" see="#p-CarePlanV2_3A_AdvanceDirectiveObservationV3_authorParticipation_4_4_9-error_mdht" name="p-CarePlanV2_3A_AdvanceDirectiveObservationV3_authorParticipation_4_4_9-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">
		<!--
			OCL: self.author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))->size() >= 0
			Constraint name: AdvanceDirectiveObservation2AuthorParticipation
		-->
	<assert test="count(cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']) &gt;= 0">Error: Care Plan (V2) - 4.4.9 authorParticipation
		Conformance: SHOULD contain  [0..*] author such that it  (CONF:1198-32406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CD -->

<pattern id="p-CarePlanV2_3A_CD_translation_4_4_3_i-error_mdht" see="#p-CarePlanV2_3A_CD_translation_4_4_3_i-error_mdht" name="p-CarePlanV2_3A_CD_translation_4_4_3_i-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/code
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/code
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:code">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.translation->size() = 1 and self.translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.code = '75320-2' and value.codeSystem = '2.16.840.1.113883.6.1') ))
			Constraint name: AdvanceDirectiveObservation2CDTranslation
		-->
	<assert test="@nullFlavor or count(cda:translation) = 1 and not(cda:translation[not(. and @code = '75320-2' and @codeSystem = '2.16.840.1.113883.6.1')])">Error: Care Plan (V2) - 4.4.3.i translation
		Conformance: SHALL contain exactly one [1..1] translation (CONF:1198-32842)/@code=&quot;75320-2&quot; Advance directive (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-32843, CONF:1198-32844)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.translation->size() = 1 ))
			Constraint name: AdvanceDirectiveObservation2CDTranslationP
		-->
	<assert test="@nullFlavor or count(cda:translation) = 1">Error: Care Plan (V2) - 4.4.3.i translation
		Conformance: SHALL contain exactly one [1..1] translation (CONF:1198-32842)/@code=&quot;75320-2&quot; Advance directive (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-32843, CONF:1198-32844)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IVLTS -->

<pattern id="p-CarePlanV2_3A_IVLTS_low_4_4_4_i-error_mdht" see="#p-CarePlanV2_3A_IVLTS_low_4_4_4_i-error_mdht" name="p-CarePlanV2_3A_IVLTS_low_4_4_4_i-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/effectiveTime
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/effectiveTime
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:effectiveTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.low.oclIsUndefined() ))
			Constraint name: AdvanceDirectiveObservation2IVLTSLow
		-->
	<assert test="@nullFlavor or cda:low">Error: Care Plan (V2) - 4.4.4.i low
		Conformance: SHALL contain exactly one [1..1] low (CONF:1198-28719)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IVLTS -->

<pattern id="p-CarePlanV2_3A_IVLTS_high_4_4_4_ii-error_mdht" see="#p-CarePlanV2_3A_IVLTS_high_4_4_4_ii-error_mdht" name="p-CarePlanV2_3A_IVLTS_high_4_4_4_ii-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/effectiveTime
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/effectiveTime
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:effectiveTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.high.oclIsUndefined() ))
			Constraint name: AdvanceDirectiveObservation2IVLTSHigh
		-->
	<assert test="@nullFlavor or cda:high">Error: Care Plan (V2) - 4.4.4.ii high
		Conformance: SHALL contain exactly one [1..1] high (CONF:1198-15521)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Verifier: 2.16.840.1.113883.10.20.1.58 -->

<pattern id="p-CarePlanV2_3A_Verifier_participantRole_4_4_6_iii-error_mdht" see="#p-CarePlanV2_3A_Verifier_participantRole_4_4_6_iii-error_mdht" name="p-CarePlanV2_3A_Verifier_participantRole_4_4_6_iii-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">
		<!--
			OCL: self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::AdvanceDirectiveObservation2::Verifier::ParticipantRole))
			Constraint name: AdvanceDirectiveObservationVerifierParticipantRole
		-->
	<assert test="count(cda:participantRole)=1">Error: Care Plan (V2) - 4.4.6.iii participantRole
		Conformance: SHALL contain exactly one [1..1] participantRole (CONF:1198-8825)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Verifier: 2.16.840.1.113883.10.20.1.58 -->

<pattern id="p-CarePlanV2_3A_Verifier_typeCode_4_4_6_ii-error_mdht" see="#p-CarePlanV2_3A_Verifier_typeCode_4_4_6_ii-error_mdht" name="p-CarePlanV2_3A_Verifier_typeCode_4_4_6_ii-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">
		<!--
			OCL: self.typeCode=vocab::ParticipationType::VRF
			Constraint name: AdvanceDirectiveObservationVerifierTypeCode
		-->
	<assert test="@typeCode = 'VRF'">Error: Care Plan (V2) - 4.4.6.ii typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;VRF&quot;  (CONF:8663, R2.1=CONF:1198-8663)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Verifier: 2.16.840.1.113883.10.20.1.58 -->

<pattern id="p-CarePlanV2_3A_Verifier_time_4_4_6_ii-error_mdht" see="#p-CarePlanV2_3A_Verifier_time_4_4_6_ii-error_mdht" name="p-CarePlanV2_3A_Verifier_time_4_4_6_ii-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservationVerifierTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: Care Plan (V2) - 4.4.6.ii time
		Conformance: SHOULD contain zero or one [0..1] time (CONF:1198-8665, CONF:1198-8666)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Verifier: 2.16.840.1.113883.10.20.1.58 -->

<pattern id="p-CarePlanV2_3A_Verifier_templateId_4_4_6_i-error_mdht" see="#p-CarePlanV2_3A_Verifier_templateId_4_4_6_i-error_mdht" name="p-CarePlanV2_3A_Verifier_templateId_4_4_6_i-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.58')
			Constraint name: AdvanceDirectiveObservation2VerifierTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.1.58'">Error: Care Plan (V2) - 4.4.6.i templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8664, CONF:1198-10486 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.1.58&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantRole -->

<pattern id="p-CarePlanV2_3A_ParticipantRole_addr_4_4_6_iii_b-error_mdht" see="#p-CarePlanV2_3A_ParticipantRole_addr_4_4_6_iii_b-error_mdht" name="p-CarePlanV2_3A_ParticipantRole_addr_4_4_6_iii_b-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: AdvanceDirectiveObservation2VerifierParticipantRoleAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Care Plan (V2) - 4.4.6.iii.b addr
		Conformance: MAY contain zero or more [0..*] addr (CONF:1198-28451)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantRole -->

<pattern id="p-CarePlanV2_3A_ParticipantRole_code_4_4_6_iii_a-error_mdht" see="#p-CarePlanV2_3A_ParticipantRole_code_4_4_6_iii_a-error_mdht" name="p-CarePlanV2_3A_ParticipantRole_code_4_4_6_iii_a-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservation2VerifierParticipantRoleCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 4.4.6.iii.a code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-28446)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservation2VerifierParticipantRoleCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Care Plan (V2) - 4.4.6.iii.a code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-28446)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantRole -->

<pattern id="p-CarePlanV2_3A_ParticipantRole_playingEntity_4_4_6_iii_c-error_mdht" see="#p-CarePlanV2_3A_ParticipantRole_playingEntity_4_4_6_iii_c-error_mdht" name="p-CarePlanV2_3A_ParticipantRole_playingEntity_4_4_6_iii_c-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole">
		<!--
			OCL: self.playingEntity->select(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(consol::AdvanceDirectiveObservation2::Verifier::ParticipantRole::PlayingEntity))->size() <= 1
			Constraint name: AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity
		-->
	<assert test="count(cda:playingEntity) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.c playingEntity
		Conformance: MAY contain zero or one [0..1] playingEntity (CONF:1198-28428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlayingEntity -->

<pattern id="p-CarePlanV2_3A_PlayingEntity_name_4_4_6_iii_c_2-error_mdht" see="#p-CarePlanV2_3A_PlayingEntity_name_4_4_6_iii_c_2-error_mdht" name="p-CarePlanV2_3A_PlayingEntity_name_4_4_6_iii_c_2-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/playingEntity
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/playingEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:playingEntity">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
			Constraint name: AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or cda:name">Error: Care Plan (V2) - 4.4.6.iii.c.2 name
		Conformance: MAY contain zero or more [0..*] name (CONF:1198-28454)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlayingEntity -->

<pattern id="p-CarePlanV2_3A_PlayingEntity_code_4_4_6_iii_c_1-error_mdht" see="#p-CarePlanV2_3A_PlayingEntity_code_4_4_6_iii_c_1-error_mdht" name="p-CarePlanV2_3A_PlayingEntity_code_4_4_6_iii_c_1-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/playingEntity
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/playingEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:playingEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 4.4.6.iii.c.1 code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Agent Qualifier Value Set 2.16.840.1.113883.11.20.9.51 DYNAMIC (CONF:1198-28429)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '63161005' or value.code = '2603003'))
			Constraint name: AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.96' and (@code = '63161005' or @code = '2603003')]">Error: Care Plan (V2) - 4.4.6.iii.c.1 code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Agent Qualifier Value Set 2.16.840.1.113883.11.20.9.51 DYNAMIC (CONF:1198-28429)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_3A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-CarePlanV2_3A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-CarePlanV2_3A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/addr
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: Care Plan (V2) - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_3A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-CarePlanV2_3A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-CarePlanV2_3A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/addr
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_3A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-CarePlanV2_3A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-CarePlanV2_3A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/addr
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_3A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-CarePlanV2_3A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-CarePlanV2_3A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/addr
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_3A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-CarePlanV2_3A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-CarePlanV2_3A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/addr
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and 
let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in 
value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP)) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUse
		-->
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: Care Plan (V2) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_3A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-CarePlanV2_3A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-CarePlanV2_3A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/verifier/participantRole/addr
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/verifier/participantRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: Care Plan (V2) - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-CarePlanV2_3A_Custodian_advanceDirectiveObservationCustodianRole_4_4_7_ii-error_mdht" see="#p-CarePlanV2_3A_Custodian_advanceDirectiveObservationCustodianRole_4_4_7_ii-error_mdht" name="p-CarePlanV2_3A_Custodian_advanceDirectiveObservationCustodianRole_4_4_7_ii-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:participantRole/@classCode = 'AGNT']">
		<!--
			OCL: self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::AdvanceDirectiveObservation2::Custodian::CustodianRole))
			Constraint name: AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole
		-->
	<assert test="count(cda:participantRole)=1">Error: Care Plan (V2) - 4.4.7.ii advanceDirectiveObservationCustodianRole
		Conformance: SHALL contain exactly one [1..1] participantRole (CONF:1198-8669)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-CarePlanV2_3A_Custodian_typeCode_4_4_7_i-error_mdht" see="#p-CarePlanV2_3A_Custodian_typeCode_4_4_7_i-error_mdht" name="p-CarePlanV2_3A_Custodian_typeCode_4_4_7_i-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:participantRole/@classCode = 'AGNT']">
		<!--
			OCL: self.typeCode=vocab::ParticipationType::CST
			Constraint name: AdvanceDirectiveObservationCustodianTypeCode
		-->
	<assert test="@typeCode = 'CST'">Error: Care Plan (V2) - 4.4.7.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;CST&quot;  (CONF:8668, R2.1=CONF:1198-8668)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianRole -->

<pattern id="p-CarePlanV2_3A_CustodianRole_telecom_4_4_7_ii_d-error_mdht" see="#p-CarePlanV2_3A_CustodianRole_telecom_4_4_7_ii_d-error_mdht" name="p-CarePlanV2_3A_CustodianRole_telecom_4_4_7_ii_d-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: AdvanceDirectiveObservationCustodianCustodianRoleTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Care Plan (V2) - 4.4.7.ii.d telecom
		Conformance: SHOULD contain zero or more [0..*] telecom (CONF:1198-8672)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianRole -->

<pattern id="p-CarePlanV2_3A_CustodianRole_playingEntity_4_4_7_ii_e-error_mdht" see="#p-CarePlanV2_3A_CustodianRole_playingEntity_4_4_7_ii_e-error_mdht" name="p-CarePlanV2_3A_CustodianRole_playingEntity_4_4_7_ii_e-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">
		<!--
			OCL: self.playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(consol::AdvanceDirectiveObservation2::Custodian::CustodianRole::CustodianEntity))
			Constraint name: AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity
		-->
	<assert test="count(cda:playingEntity)=1">Error: Care Plan (V2) - 4.4.7.ii.e playingEntity
		Conformance: SHALL contain exactly one [1..1] playingEntity (CONF:1198-8824)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianRole -->

<pattern id="p-CarePlanV2_3A_CustodianRole_addr_4_4_7_ii_c-error_mdht" see="#p-CarePlanV2_3A_CustodianRole_addr_4_4_7_ii_c-error_mdht" name="p-CarePlanV2_3A_CustodianRole_addr_4_4_7_ii_c-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: AdvanceDirectiveObservationCustodianCustodianRoleAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Care Plan (V2) - 4.4.7.ii.c addr
		Conformance: SHOULD contain zero or one [0..1] addr (CONF:1198-8671)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianRole -->

<pattern id="p-CarePlanV2_3A_CustodianRole_code_4_4_7_ii_b-error_mdht" see="#p-CarePlanV2_3A_CustodianRole_code_4_4_7_ii_b-error_mdht" name="p-CarePlanV2_3A_CustodianRole_code_4_4_7_ii_b-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservation2CustodianCustodianRoleCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 4.4.7.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28440)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservation2CustodianCustodianRoleCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: Care Plan (V2) - 4.4.7.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28440)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianRole -->

<pattern id="p-CarePlanV2_3A_CustodianRole_classCode_4_4_7_ii_a-error_mdht" see="#p-CarePlanV2_3A_CustodianRole_classCode_4_4_7_ii_a-error_mdht" name="p-CarePlanV2_3A_CustodianRole_classCode_4_4_7_ii_a-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::RoleClassRoot::AGNT
			Constraint name: AdvanceDirectiveObservationCustodianCustodianRoleClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'AGNT'">Error: Care Plan (V2) - 4.4.7.ii.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;AGNT&quot;  (CONF:8670, R2.1=CONF:1198-8670)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianEntity -->

<pattern id="p-CarePlanV2_3A_CustodianEntity_name_4_4_7_ii_e_2-error_mdht" see="#p-CarePlanV2_3A_CustodianEntity_name_4_4_7_ii_e_2-error_mdht" name="p-CarePlanV2_3A_CustodianEntity_name_4_4_7_ii_e_2-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole/playingEntity
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole/playingEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']/cda:playingEntity">
		<!--
			OCL: self.name->size() = 1
			Constraint name: AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName
		-->
	<assert test="count(cda:name) = 1">Error: Care Plan (V2) - 4.4.7.ii.e.2 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:1198-8673)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianEntity -->

<pattern id="p-CarePlanV2_3A_CustodianEntity_code_4_4_7_ii_e_1-error_mdht" see="#p-CarePlanV2_3A_CustodianEntity_code_4_4_7_ii_e_1-error_mdht" name="p-CarePlanV2_3A_CustodianEntity_code_4_4_7_ii_e_1-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole/playingEntity
			UML root path: /CarePlan/component/structuredBody/interventionsSection2/interventionsSection2/entry/interventionAct/entryRelationship/advanceDirectiveObservation2/custodian/advanceDirectiveObservationCustodianRole/playingEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']/cda:playingEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 4.4.7.ii.e.1 code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Agent Qualifier Value Set 2.16.840.1.113883.11.20.9.51 DYNAMIC (CONF:1198-28444)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '63161005' or value.code = '2603003'))
			Constraint name: AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.96' and (@code = '63161005' or @code = '2603003')]">Error: Care Plan (V2) - 4.4.7.ii.e.1 code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Agent Qualifier Value Set 2.16.840.1.113883.11.20.9.51 DYNAMIC (CONF:1198-28444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_typeCode_4_3_10_i-error_mdht" see="#p-CarePlanV2_3A_Reference_typeCode_4_3_10_i-error_mdht" name="p-CarePlanV2_3A_Reference_typeCode_4_3_10_i-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation/reference
			UML root path: /ContinuityOfCareDocument/component/structuredBody/advanceDirectivesSection/advanceDirectivesSection/entry/advanceDirectiveObservation/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference">
		<!--
			OCL: true
			Constraint name: AdvanceDirectiveObservationReferenceTypeCodeP
		-->
	<assert test="true()">Error: Care Plan (V2) - 4.3.10.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode/@code=&quot;REFR&quot;  (CodeSystem: 2.16.840.1.113883.5.1002 HL7ActRelationshipType) (CONF:8694, R2.1=CONF:1198-8694)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.typeCode.oclIsUndefined() and self.typeCode.oclIsKindOf(vocab::x_ActRelationshipExternalReference) and 
let value : vocab::x_ActRelationshipExternalReference = self.typeCode.oclAsType(vocab::x_ActRelationshipExternalReference) in 
value = vocab::x_ActRelationshipExternalReference::REFR
			Constraint name: AdvanceDirectiveObservationReferenceTypeCode
		-->
	<assert test="@typeCode and @typeCode[. = 'REFR']">Error: Care Plan (V2) - 4.3.10.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode/@code=&quot;REFR&quot;  (CodeSystem: 2.16.840.1.113883.5.1002 HL7ActRelationshipType) (CONF:8694, R2.1=CONF:1198-8694)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_externalDocument_4_3_10_ii-error_mdht" see="#p-CarePlanV2_3A_Reference_externalDocument_4_3_10_ii-error_mdht" name="p-CarePlanV2_3A_Reference_externalDocument_4_3_10_ii-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation/reference
			UML root path: /ContinuityOfCareDocument/component/structuredBody/advanceDirectivesSection/advanceDirectivesSection/entry/advanceDirectiveObservation/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference">
		<!--
			OCL: self.externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::AdvanceDirectiveObservation::Reference::ExternalDocument))
			Constraint name: AdvanceDirectiveObservationReferenceExternalDocument
		-->
	<assert test="count(cda:externalDocument)=1">Error: Care Plan (V2) - 4.3.10.ii externalDocument
		Conformance: SHALL contain exactly one [1..1] externalDocument (CONF:8693, R2.1=CONF:1198-8693)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocument -->

<pattern id="p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextReference_4_3_10_ii_d-error_mdht" see="#p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextReference_4_3_10_ii_d-error_mdht" name="p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextReference_4_3_10_ii_d-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation/reference/externalDocument
			UML root path: /ContinuityOfCareDocument/component/structuredBody/advanceDirectivesSection/advanceDirectivesSection/entry/advanceDirectiveObservation/reference/externalDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">
		<!--
			OCL: not self.text.oclIsUndefined() implies not self.text.reference.oclIsUndefined()
			Constraint name: AdvanceDirectiveObservationReferenceExternalDocumentTextReference
		-->
	<assert test="not(cda:text) or cda:text/cda:reference">Error: Care Plan (V2) - 4.3.10.ii.d AdvanceDirectiveObservationReferenceExternalDocumentTextReference
		Conformance: The text, if present, MAY contain zero or one [0..1] reference.
		a. The URL of a referenced advance directive document MAY be present, and SHALL be represented in Observation/reference/ExternalDocument/text/reference.
		b. If a URL is referenced, then it SHOULD have a corresponding linkHTML element in narrative block. (CONF:8697, R2.1=CONF:1198-8697, CONF:8698, R2.1=CONF:1198-8698, CONF:8699, R2.1=CONF:1198-8699)
		Analysis: The text, if present, MAY contain zero or one [0..1] reference.
		a. The URL of a referenced advance directive document MAY be present, and SHALL be represented in Observation/reference/ExternalDocument/text/reference.
		b. If a URL is referenced, then it SHOULD have a corresponding linkHTML element in narrative block.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocument -->

<pattern id="p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType_4_3_10_ii_c-error_mdht" see="#p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType_4_3_10_ii_c-error_mdht" name="p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType_4_3_10_ii_c-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation/reference/externalDocument
			UML root path: /ContinuityOfCareDocument/component/structuredBody/advanceDirectivesSection/advanceDirectivesSection/entry/advanceDirectiveObservation/reference/externalDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">
		<!--
			OCL: not self.text.mediaType.oclIsUndefined()
			Constraint name: AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType
		-->
	<assert test="cda:text/@mediaType">Error: Care Plan (V2) - 4.3.10.ii.c AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType
		Conformance: The text, if present, MAY contain zero or one [0..1] @mediaType (CONF:8703)
		Analysis: The text, if present, MAY contain zero or one [0..1] @mediaType
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocument -->

<pattern id="p-CarePlanV2_3A_ExternalDocument_id_4_3_10_ii_a-error_mdht" see="#p-CarePlanV2_3A_ExternalDocument_id_4_3_10_ii_a-error_mdht" name="p-CarePlanV2_3A_ExternalDocument_id_4_3_10_ii_a-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation/reference/externalDocument
			UML root path: /ContinuityOfCareDocument/component/structuredBody/advanceDirectivesSection/advanceDirectivesSection/entry/advanceDirectiveObservation/reference/externalDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: AdvanceDirectiveObservationReferenceExternalDocumentId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.3.10.ii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:8695, R2.1=CONF:1198-8695)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ExternalDocument -->

<pattern id="p-CarePlanV2_3A_ExternalDocument_text_4_3_10_ii_b-error_mdht" see="#p-CarePlanV2_3A_ExternalDocument_text_4_3_10_ii_b-error_mdht" name="p-CarePlanV2_3A_ExternalDocument_text_4_3_10_ii_b-error_mdht">
		<!--
			UML path: /AdvanceDirectiveObservation/reference/externalDocument
			UML root path: /ContinuityOfCareDocument/component/structuredBody/advanceDirectivesSection/advanceDirectivesSection/entry/advanceDirectiveObservation/reference/externalDocument
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
			Constraint name: AdvanceDirectiveObservationReferenceExternalDocumentText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or cda:text">Error: Care Plan (V2) - 4.3.10.ii.b text
		Conformance: MAY contain zero or one [0..1] text (CONF:8696, R2.1=CONF:1198-8696)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-CarePlanV2_2_Component_healthStatusEvaluationsOutcomesSection_2_1_13_i_d_1-error_mdht" see="#p-CarePlanV2_2_Component_healthStatusEvaluationsOutcomesSection_2_1_13_i_d_1-error_mdht" name="p-CarePlanV2_2_Component_healthStatusEvaluationsOutcomesSection_2_1_13_i_d_1-error_mdht">
		<!--
			UML path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthStatusEvaluationsAndOutcomesSection))->size() <= 1
			Constraint name: CarePlanComponentStructuredBodyComponentHealthStatusEvaluationsOutcomesSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']) &lt;= 1">Error: Care Plan (V2) - 2.1.13.i.d.1 healthStatusEvaluationsOutcomesSection
		Conformance: SHOULD contain zero or one [0..1] section (CONF:1198-29596, CONF:1198-29597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusEvaluationsAndOutcomesSection: 2.16.840.1.113883.10.20.22.2.61 -->

<pattern id="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_text_3_38_5-error_mdht" see="#p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_text_3_38_5-error_mdht" name="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_text_3_38_5-error_mdht">
		<!--
			UML path: /HealthStatusEvaluationsAndOutcomesSection
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionText
		-->
	<assert test="cda:text">Error: Care Plan (V2) - 3.38.5 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:1098-29590)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusEvaluationsAndOutcomesSection: 2.16.840.1.113883.10.20.22.2.61 -->

<pattern id="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_nullFlavor_3_38_2-error_mdht" see="#p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_nullFlavor_3_38_2-error_mdht" name="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_nullFlavor_3_38_2-error_mdht">
		<!--
			UML path: /HealthStatusEvaluationsAndOutcomesSection
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">
		<!--
			OCL: (not self.nullFlavor.oclIsUndefined()) implies (self.nullFlavor=vocab::NullFlavor::NI)
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionNullFlavor
		-->
	<assert test="not(@nullFlavor) or @nullFlavor = 'NI'">Error: Care Plan (V2) - 3.38.2 nullFlavor
		Conformance: MAY contain zero or one [0..1] @nullFlavor=&quot;NI&quot;  (CONF:1098-32821)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusEvaluationsAndOutcomesSection: 2.16.840.1.113883.10.20.22.2.61 -->

<pattern id="p-CarePlanV2_3A_HealthStatusEvaluationsAndOutcomesSection_entry_3_38_6-error_mdht" see="#p-CarePlanV2_3A_HealthStatusEvaluationsAndOutcomesSection_entry_3_38_6-error_mdht" name="p-CarePlanV2_3A_HealthStatusEvaluationsAndOutcomesSection_entry_3_38_6-error_mdht">
		<!--
			UML path: /HealthStatusEvaluationsAndOutcomesSection
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::HealthStatusEvaluationsAndOutcomesSection::OutcomeObservationEntry))
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionEntry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry[cda:observation/cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144'])=1">Error: Care Plan (V2) - 3.38.6 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusEvaluationsAndOutcomesSection: 2.16.840.1.113883.10.20.22.2.61 -->

<pattern id="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_templateId_3_38_1-error_mdht" see="#p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_templateId_3_38_1-error_mdht" name="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_templateId_3_38_1-error_mdht">
		<!--
			UML path: /HealthStatusEvaluationsAndOutcomesSection
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.61')
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61'">Error: Care Plan (V2) - 3.38.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-29578, CONF:1098-29579 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.61&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusEvaluationsAndOutcomesSection: 2.16.840.1.113883.10.20.22.2.61 -->

<pattern id="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_title_3_38_4-error_mdht" see="#p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_title_3_38_4-error_mdht" name="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_title_3_38_4-error_mdht">
		<!--
			UML path: /HealthStatusEvaluationsAndOutcomesSection
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionTitle
		-->
	<assert test="cda:title">Error: Care Plan (V2) - 3.38.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1098-29589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- HealthStatusEvaluationsAndOutcomesSection: 2.16.840.1.113883.10.20.22.2.61 -->

<pattern id="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_code_3_38_3-error_mdht" see="#p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_code_3_38_3-error_mdht" name="p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_code_3_38_3-error_mdht">
		<!--
			UML path: /HealthStatusEvaluationsAndOutcomesSection
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '11383-7' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '11383-7' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 3.38.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-29580)/@code=&quot;11383-7&quot; Patient Problem Outcome (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-29581, CONF:1098-29582)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 3.38.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-29580)/@code=&quot;11383-7&quot; Patient Problem Outcome (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-29581, CONF:1098-29582)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservationEntry -->

<pattern id="p-CarePlanV2_3A_OutcomeObservationEntry_outcomeObservation_3_38_6_i-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservationEntry_outcomeObservation_3_38_6_i-error_mdht" name="p-CarePlanV2_3A_OutcomeObservationEntry_outcomeObservation_3_38_6_i-error_mdht">
		<!--
			UML path: /HealthStatusEvaluationsAndOutcomesSection/entry
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry">
		<!--
			OCL: self.observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::OutcomeObservation))
			Constraint name: HealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation
		-->
	<assert test="cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Error: Care Plan (V2) - 3.38.6.i outcomeObservation
		Conformance: SHALL contain at least one [1..*] observation (CONF:1098-31227, CONF:1098-31228)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_templateId_4_86_1-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_templateId_4_86_1-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_templateId_4_86_1-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.144')
			Constraint name: OutcomeObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144'">Error: Care Plan (V2) - 4.86.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-31221, CONF:1098-31222 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.144&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_9-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_9-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_9-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
			Constraint name: OutcomeObservationEntryRelationship
		-->
	<assert test="cda:entryRelationship">Error: Care Plan (V2) - 4.86.9 entryRelationship
		Conformance: SHALL contain  [1..*] entryRelationship such that it  (CONF:1098-32782)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_id_4_86_4-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_id_4_86_4-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_id_4_86_4-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: OutcomeObservationId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 4.86.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-31223)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_10-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_10-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_10-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::OutcomeObservation::EntryReferenceEntryRelationship))
			Constraint name: OutcomeObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.86.10 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_code_4_86_5-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_code_4_86_5-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_code_4_86_5-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: OutcomeObservationCodeP
		-->
	<assert test="cda:code">Error: Care Plan (V2) - 4.86.5 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-32746)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: OutcomeObservationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.1']">Error: Care Plan (V2) - 4.86.5 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-32746)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_moodCode_4_86_3-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_moodCode_4_86_3-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_moodCode_4_86_3-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: OutcomeObservationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Care Plan (V2) - 4.86.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1098-31220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_12-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_12-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_12-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::OutcomeObservation::EntryReferenceEntryRelationship))
			Constraint name: OutcomeObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.86.12 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_reference_4_86_8-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_reference_4_86_8-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_reference_4_86_8-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.reference->select(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))->size() >= 0
			Constraint name: OutcomeObservationReference
		-->
	<assert test="count(cda:reference) &gt;= 0">Error: Care Plan (V2) - 4.86.8 reference
		Conformance: MAY contain zero or more [0..*] reference (CONF:1098-32763)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_value_4_86_6-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_value_4_86_6-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_value_4_86_6-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: ((not self.value->isEmpty()) and self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() <= 1)
			Constraint name: OutcomeObservationValue
		-->
	<assert test="not(cda:value and cda:value[not(@nullFlavor)]) or count(cda:value) &lt;= 1">Error: Care Plan (V2) - 4.86.6 value
		Conformance: SHOULD contain zero or one [0..1] value (CONF:1098-32747)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_11-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_11-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_11-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::OutcomeObservation::ProgressTowardGoalObservationEntryRelationship))
			Constraint name: OutcomeObservationEntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Care Plan (V2) - 4.86.11 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_classCode_4_86_2-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_classCode_4_86_2-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_classCode_4_86_2-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::OBS
			Constraint name: OutcomeObservationClassCode
		-->
	<assert test="@classCode = 'OBS'">Error: Care Plan (V2) - 4.86.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;OBS&quot; Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1098-31219)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OutcomeObservation: 2.16.840.1.113883.10.20.22.4.144 -->

<pattern id="p-CarePlanV2_3A_OutcomeObservation_authorParticipation_4_86_7-error_mdht" see="#p-CarePlanV2_3A_OutcomeObservation_authorParticipation_4_86_7-error_mdht" name="p-CarePlanV2_3A_OutcomeObservation_authorParticipation_4_86_7-error_mdht">
		<!--
			UML path: /OutcomeObservation
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">
		<!--
			OCL: self.author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))->size() >= 0
			Constraint name: OutcomeObservationAuthorParticipation
		-->
	<assert test="count(cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']) &gt;= 0">Error: Care Plan (V2) - 4.86.7 authorParticipation
		Conformance: SHOULD contain  [0..*] author such that it  (CONF:1098-31553)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_typeCode_4_86_8_i-error_mdht" see="#p-CarePlanV2_3A_Reference_typeCode_4_86_8_i-error_mdht" name="p-CarePlanV2_3A_Reference_typeCode_4_86_8_i-error_mdht">
		<!--
			UML path: /OutcomeObservation/reference
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']/cda:reference">
		<!--
			OCL: self.typeCode=vocab::x_ActRelationshipExternalReference::REFR
			Constraint name: OutcomeObservationReferenceTypeCode
		-->
	<assert test="@typeCode = 'REFR'">Error: Care Plan (V2) - 4.86.8.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;REFR&quot;  (CONF:1098-32764)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Reference -->

<pattern id="p-CarePlanV2_3A_Reference_externalDocumentReference_4_86_8_ii-error_mdht" see="#p-CarePlanV2_3A_Reference_externalDocumentReference_4_86_8_ii-error_mdht" name="p-CarePlanV2_3A_Reference_externalDocumentReference_4_86_8_ii-error_mdht">
		<!--
			UML path: /OutcomeObservation/reference
			UML root path: /CarePlan/component/structuredBody/healthStatusEvaluationsOutcomesSection/healthStatusEvaluationsOutcomesSection/entry/outcomeObservation/reference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']/cda:reference">
		<!--
			OCL: self.externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference))
			Constraint name: OutcomeObservationReferenceExternalDocumentReference
		-->
	<assert test="count(cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115'])=1">Error: Care Plan (V2) - 4.86.8.ii externalDocumentReference
		Conformance: SHALL contain exactly one [1..1] externalDocument (CONF:1098-32765)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-CarePlanV2_1A_RecordTarget_patientRole_2_1_5_i-error_mdht" see="#p-CarePlanV2_1A_RecordTarget_patientRole_2_1_5_i-error_mdht" name="p-CarePlanV2_1A_RecordTarget_patientRole_2_1_5_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget
			UML root path: /USRealmHeader2/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: Care Plan (V2) - 2.1.5.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:1198-5267)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-CarePlanV2_1A_PatientRole_addr_2_1_5_i_b-error_mdht" see="#p-CarePlanV2_1A_PatientRole_addr_2_1_5_i_b-error_mdht" name="p-CarePlanV2_1A_PatientRole_addr_2_1_5_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.5.i.b addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5271, R2.1=CONF:1198-5271)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-CarePlanV2_1A_PatientRole_telecom_2_1_5_i_c-error_mdht" see="#p-CarePlanV2_1A_PatientRole_telecom_2_1_5_i_c-error_mdht" name="p-CarePlanV2_1A_PatientRole_telecom_2_1_5_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
		-->
	<assert test="cda:telecom">Error: Care Plan (V2) - 2.1.5.i.c telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5280, R2.1=CONF:1198-5280)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-CarePlanV2_1A_PatientRole_providerOrganization_2_1_5_i_e-error_mdht" see="#p-CarePlanV2_1A_PatientRole_providerOrganization_2_1_5_i_e-error_mdht" name="p-CarePlanV2_1A_PatientRole_providerOrganization_2_1_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
		-->
	<assert test="count(cda:providerOrganization) &lt;= 1">Error: Care Plan (V2) - 2.1.5.i.e providerOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-CarePlanV2_1A_PatientRole_patient_2_1_5_i_e-error_mdht" see="#p-CarePlanV2_1A_PatientRole_patient_2_1_5_i_e-error_mdht" name="p-CarePlanV2_1A_PatientRole_patient_2_1_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: Care Plan (V2) - 2.1.5.i.e patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:1198-5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-CarePlanV2_1A_PatientRole_id_2_1_5_i_a-error_mdht" see="#p-CarePlanV2_1A_PatientRole_id_2_1_5_i_a-error_mdht" name="p-CarePlanV2_1A_PatientRole_id_2_1_5_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.5.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5268, R2.1=CONF:1198-5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_religiousAffiliationCode_2_1_5_i_e_5-error_mdht" see="#p-CarePlanV2_1A_Patient_religiousAffiliationCode_2_1_5_i_e_5-error_mdht" name="p-CarePlanV2_1A_Patient_religiousAffiliationCode_2_1_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode">Error: Care Plan (V2) - 2.1.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode and cda:religiousAffiliationCode[@codeSystem = '2.16.840.1.113883.5.1076' and @code]">Error: Care Plan (V2) - 2.1.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_raceCode_2_1_5_i_e_6-error_mdht" see="#p-CarePlanV2_1A_Patient_raceCode_2_1_5_i_e_6-error_mdht" name="p-CarePlanV2_1A_Patient_raceCode_2_1_5_i_e_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.raceCode.oclIsUndefined() and self.raceCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '1002-5' or value.code = '2028-9' or value.code = '2054-5' or value.code = '2076-8' or value.code = '2106-3')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode
		-->
	<assert test="cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '1002-5' or @code = '2028-9' or @code = '2054-5' or @code = '2076-8' or @code = '2106-3')]">Error: Care Plan (V2) - 2.1.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="cda:raceCode">Error: Care Plan (V2) - 2.1.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_name_2_1_5_i_e_1-error_mdht" see="#p-CarePlanV2_1A_Patient_name_2_1_5_i_e_1-error_mdht" name="p-CarePlanV2_1A_Patient_name_2_1_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.5.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411, R2.1=CONF:1198-5284)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_sDTCRaceCode_2_1_5_i_e_7-error_mdht" see="#p-CarePlanV2_1A_Patient_sDTCRaceCode_2_1_5_i_e_7-error_mdht" name="p-CarePlanV2_1A_Patient_sDTCRaceCode_2_1_5_i_e_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or ext:sDTCRaceCode">Error: Care Plan (V2) - 2.1.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or not(ext:sDTCRaceCode[not(. and @codeSystem = '2.16.840.1.113883.6.238' and @code)])">Error: Care Plan (V2) - 2.1.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_birthTime_2_1_5_i_e_8-error_mdht" see="#p-CarePlanV2_1A_Patient_birthTime_2_1_5_i_e_8-error_mdht" name="p-CarePlanV2_1A_Patient_birthTime_2_1_5_i_e_8-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: Care Plan (V2) - 2.1.5.i.e.8 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:1198-5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_birthplace_2_1_5_i_e_11-error_mdht" see="#p-CarePlanV2_1A_Patient_birthplace_2_1_5_i_e_11-error_mdht" name="p-CarePlanV2_1A_Patient_birthplace_2_1_5_i_e_11-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: Care Plan (V2) - 2.1.5.i.e.11 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:1198-5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_administrativeGenderCode_2_1_5_i_e_2-error_mdht" see="#p-CarePlanV2_1A_Patient_administrativeGenderCode_2_1_5_i_e_2-error_mdht" name="p-CarePlanV2_1A_Patient_administrativeGenderCode_2_1_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
		-->
	<assert test="true()">Error: Care Plan (V2) - 2.1.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
		-->
	<assert test="cda:administrativeGenderCode and cda:administrativeGenderCode[@codeSystem = '2.16.840.1.113883.5.1' and (@code = 'F' or @code = 'M' or @code = 'UN')]">Error: Care Plan (V2) - 2.1.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_maritalStatusCode_2_1_5_i_e_4-error_mdht" see="#p-CarePlanV2_1A_Patient_maritalStatusCode_2_1_5_i_e_4-error_mdht" name="p-CarePlanV2_1A_Patient_maritalStatusCode_2_1_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode">Error: Care Plan (V2) - 2.1.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode and cda:maritalStatusCode[@codeSystem = '2.16.840.1.113883.5.2' and (@code = 'A' or @code = 'D' or @code = 'I' or @code = 'L' or @code = 'M' or @code = 'P' or @code = 'S' or @code = 'T' or @code = 'W')]">Error: Care Plan (V2) - 2.1.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_guardian_2_1_5_i_e_9-error_mdht" see="#p-CarePlanV2_1A_Patient_guardian_2_1_5_i_e_9-error_mdht" name="p-CarePlanV2_1A_Patient_guardian_2_1_5_i_e_9-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: Care Plan (V2) - 2.1.5.i.e.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:1198-5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_languageCommunication_2_1_5_i_e_10-error_mdht" see="#p-CarePlanV2_1A_Patient_languageCommunication_2_1_5_i_e_10-error_mdht" name="p-CarePlanV2_1A_Patient_languageCommunication_2_1_5_i_e_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: Care Plan (V2) - 2.1.5.i.e.10 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:1198-5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-CarePlanV2_1A_Patient_ethnicGroupCode_2_1_5_i_e_7-error_mdht" see="#p-CarePlanV2_1A_Patient_ethnicGroupCode_2_1_5_i_e_7-error_mdht" name="p-CarePlanV2_1A_Patient_ethnicGroupCode_2_1_5_i_e_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.ethnicGroupCode.oclIsUndefined() and self.ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.ethnicGroupCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode
		-->
	<assert test="cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: Care Plan (V2) - 2.1.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.ethnicGroupCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="cda:ethnicGroupCode">Error: Care Plan (V2) - 2.1.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-CarePlanV2_1A_Guardian_code_2_1_5_i_e_9_ii-error_mdht" see="#p-CarePlanV2_1A_Guardian_code_2_1_5_i_e_9_ii-error_mdht" name="p-CarePlanV2_1A_Guardian_code_2_1_5_i_e_9_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 2.1.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: Care Plan (V2) - 2.1.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-CarePlanV2_1A_Guardian_telecom_2_1_5_i_e_9_iii-error_mdht" see="#p-CarePlanV2_1A_Guardian_telecom_2_1_5_i_e_9_iii-error_mdht" name="p-CarePlanV2_1A_Guardian_telecom_2_1_5_i_e_9_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Care Plan (V2) - 2.1.5.i.e.9.iii telecom
		Conformance: SHOULD contain zero or more [0..*] telecom (CONF:1198-5382)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-CarePlanV2_1A_Guardian_addr_2_1_5_i_e_9_i-error_mdht" see="#p-CarePlanV2_1A_Guardian_addr_2_1_5_i_e_9_i-error_mdht" name="p-CarePlanV2_1A_Guardian_addr_2_1_5_i_e_9_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Care Plan (V2) - 2.1.5.i.e.9.i addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:5359, CONF:10413, R2.1=CONF:1198-5359)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-CarePlanV2_1A_Guardian_guardianPerson_2_1_5_i_e_9_iv-error_mdht" see="#p-CarePlanV2_1A_Guardian_guardianPerson_2_1_5_i_e_9_iv-error_mdht" name="p-CarePlanV2_1A_Guardian_guardianPerson_2_1_5_i_e_9_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::Person))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson
		-->
	<assert test="count(cda:guardianPerson)=1">Error: Care Plan (V2) - 2.1.5.i.e.9.iv guardianPerson
		Conformance: SHALL contain exactly one [1..1] guardianPerson (CONF:5385, R2.1=CONF:1198-5385)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-CarePlanV2_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" see="#p-CarePlanV2_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" name="p-CarePlanV2_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.6.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993, R2.1=CONF:1198-7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-CarePlanV2_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-CarePlanV2_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-CarePlanV2_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-CarePlanV2_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-CarePlanV2_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-CarePlanV2_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: Care Plan (V2) - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-CarePlanV2_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-CarePlanV2_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-CarePlanV2_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-CarePlanV2_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and 
let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in 
value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP)) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUse
		-->
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: Care Plan (V2) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_1_5_i_b_7-error_mdht" see="#p-CarePlanV2_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_1_5_i_b_7-error_mdht" name="p-CarePlanV2_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_1_5_i_b_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		-->
	<assert test="@nullFlavor or count(cda:streetAddressLine) &gt;= 1 and count(cda:streetAddressLine) &lt;= 4">Error: Care Plan (V2) - 2.1.5.i.b.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		Conformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: SHALL contain at least one and not more than 4 streetAddressLine
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-CarePlanV2_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-CarePlanV2_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-CarePlanV2_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: Care Plan (V2) - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-CarePlanV2_1A_Person_name_2_1_5_i_e_9_iv_a-error_mdht" see="#p-CarePlanV2_1A_Person_name_2_1_5_i_e_9_iv_a-error_mdht" name="p-CarePlanV2_1A_Person_name_2_1_5_i_e_9_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.5.i.e.9.iv.a name
		Conformance: SHALL contain at least one [1..*] name (CONF:5386, R2.1=CONF:1198-5386)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-CarePlanV2_1A_LanguageCommunication_proficiencyLevelCode_2_1_5_i_e_10_ii-error_mdht" see="#p-CarePlanV2_1A_LanguageCommunication_proficiencyLevelCode_2_1_5_i_e_10_ii-error_mdht" name="p-CarePlanV2_1A_LanguageCommunication_proficiencyLevelCode_2_1_5_i_e_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode">Error: Care Plan (V2) - 2.1.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined() and self.proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.proficiencyLevelCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode and cda:proficiencyLevelCode[@codeSystem = '2.16.840.1.113883.5.61' and (@code = 'E' or @code = 'F' or @code = 'G' or @code = 'P')]">Error: Care Plan (V2) - 2.1.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-CarePlanV2_1A_LanguageCommunication_modeCode_2_1_5_i_e_10_i-error_mdht" see="#p-CarePlanV2_1A_LanguageCommunication_modeCode_2_1_5_i_e_10_i-error_mdht" name="p-CarePlanV2_1A_LanguageCommunication_modeCode_2_1_5_i_e_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode">Error: Care Plan (V2) - 2.1.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode and cda:modeCode[@codeSystem = '2.16.840.1.113883.5.60' and (@code = 'ESGN' or @code = 'ESP' or @code = 'EWR' or @code = 'RSGN' or @code = 'RSP' or @code = 'RWR')]">Error: Care Plan (V2) - 2.1.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-CarePlanV2_1A_LanguageCommunication_languageCode_2_1_5_i_e_10_iii-error_mdht" see="#p-CarePlanV2_1A_LanguageCommunication_languageCode_2_1_5_i_e_10_iii-error_mdht" name="p-CarePlanV2_1A_LanguageCommunication_languageCode_2_1_5_i_e_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: Care Plan (V2) - 2.1.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: Care Plan (V2) - 2.1.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-CarePlanV2_1A_LanguageCommunication_preferenceInd_2_1_5_i_e_10_iv-error_mdht" see="#p-CarePlanV2_1A_LanguageCommunication_preferenceInd_2_1_5_i_e_10_iv-error_mdht" name="p-CarePlanV2_1A_LanguageCommunication_preferenceInd_2_1_5_i_e_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: Care Plan (V2) - 2.1.5.i.e.10.iv preferenceInd
		Conformance: SHOULD contain zero or one [0..1] preferenceInd (CONF:1198-5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-CarePlanV2_1A_TS_value_2_1_5_i_e_8_i-error_mdht" see="#p-CarePlanV2_1A_TS_value_2_1_5_i_e_8_i-error_mdht" name="p-CarePlanV2_1A_TS_value_2_1_5_i_e_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (true ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or true()">Error: Care Plan (V2) - 2.1.5.i.e.8.i value
		Conformance: contain exactly one [1..1] value
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-CarePlanV2_1A_Birthplace_place_2_1_5_i_e_11_i-error_mdht" see="#p-CarePlanV2_1A_Birthplace_place_2_1_5_i_e_11_i-error_mdht" name="p-CarePlanV2_1A_Birthplace_place_2_1_5_i_e_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: Care Plan (V2) - 2.1.5.i.e.11.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:1198-5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-CarePlanV2_1A_Place_addr_2_1_5_i_e_11_i_a-error_mdht" see="#p-CarePlanV2_1A_Place_addr_2_1_5_i_e_11_i_a-error_mdht" name="p-CarePlanV2_1A_Place_addr_2_1_5_i_e_11_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.5.i.e.11.i.a addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5397, R2.1=CONF:1198-5397)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-CarePlanV2_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" see="#p-CarePlanV2_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" name="p-CarePlanV2_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: Care Plan (V2) - 2.19.5.ii.b.1.iv prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155, R2.1=CONF:81-7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-CarePlanV2_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" see="#p-CarePlanV2_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" name="p-CarePlanV2_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::EntityNameUse) and 
let value : vocab::EntityNameUse = element.oclAsType(vocab::EntityNameUse) in 
value = vocab::EntityNameUse::A or value = vocab::EntityNameUse::ABC or value = vocab::EntityNameUse::ASGN or value = vocab::EntityNameUse::C or value = vocab::EntityNameUse::I or value = vocab::EntityNameUse::IDE or value = vocab::EntityNameUse::L or value = vocab::EntityNameUse::P or value = vocab::EntityNameUse::PHON or value = vocab::EntityNameUse::R or value = vocab::EntityNameUse::SNDX or value = vocab::EntityNameUse::SRCH or value = vocab::EntityNameUse::SYL)) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUse
		-->
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: Care Plan (V2) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-CarePlanV2_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" see="#p-CarePlanV2_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" name="p-CarePlanV2_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: Care Plan (V2) - 2.19.5.ii.b.1.v suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161, R2.1=CONF:81-7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-CarePlanV2_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" see="#p-CarePlanV2_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" name="p-CarePlanV2_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: Care Plan (V2) - 2.19.5.ii.b.1.iii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157, R2.1=CONF:81-7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-CarePlanV2_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" see="#p-CarePlanV2_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" name="p-CarePlanV2_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: Care Plan (V2) - 2.10 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT have mixed content except for white space
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-CarePlanV2_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" see="#p-CarePlanV2_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" name="p-CarePlanV2_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: Care Plan (V2) - 2.19.5.ii.b.1.ii family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, R2.1=CONF:81-7159)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-CarePlanV2_1A_ProviderOrganization_telecom_2_1_5_i_e_3-error_mdht" see="#p-CarePlanV2_1A_ProviderOrganization_telecom_2_1_5_i_e_3-error_mdht" name="p-CarePlanV2_1A_ProviderOrganization_telecom_2_1_5_i_e_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: Care Plan (V2) - 2.1.5.i.e.3 telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5420, R2.1=CONF:1198-5420)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-CarePlanV2_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_1_5_i_e_5-error_mdht" see="#p-CarePlanV2_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_1_5_i_e_5-error_mdht" name="p-CarePlanV2_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_1_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Care Plan (V2) - 2.1.5.i.e.5 GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		Conformance: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996, R2.1=CONF:1198-16820)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-CarePlanV2_1A_ProviderOrganization_addr_2_1_5_i_e_4-error_mdht" see="#p-CarePlanV2_1A_ProviderOrganization_addr_2_1_5_i_e_4-error_mdht" name="p-CarePlanV2_1A_ProviderOrganization_addr_2_1_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.5.i.e.4 addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5422, R2.1=CONF:1198-5422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-CarePlanV2_1A_ProviderOrganization_id_2_1_5_i_e_1-error_mdht" see="#p-CarePlanV2_1A_ProviderOrganization_id_2_1_5_i_e_1-error_mdht" name="p-CarePlanV2_1A_ProviderOrganization_id_2_1_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.5.i.e.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5417, R2.1=CONF:1198-5417)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-CarePlanV2_1A_ProviderOrganization_name_2_1_5_i_e_2-error_mdht" see="#p-CarePlanV2_1A_ProviderOrganization_name_2_1_5_i_e_2-error_mdht" name="p-CarePlanV2_1A_ProviderOrganization_name_2_1_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.5.i.e.2 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5419, R2.1=CONF:1198-5419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-CarePlanV2_1A_TEL_use_2_1_5_i_e_3_i-error_mdht" see="#p-CarePlanV2_1A_TEL_use_2_1_5_i_e_3_i-error_mdht" name="p-CarePlanV2_1A_TEL_use_2_1_5_i_e_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.1.5.i.e.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7994, CONF:1198-7994)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-CarePlanV2_1A_TEL_use_2_1_5_i_c_1-error_mdht" see="#p-CarePlanV2_1A_TEL_use_2_1_5_i_c_1-error_mdht" name="p-CarePlanV2_1A_TEL_use_2_1_5_i_c_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.1.5.i.c.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:5375, R2.1=CONF:1198-5375)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-CarePlanV2_1A_DataEnterer_assignedEntity_2_1_6_i-error_mdht" see="#p-CarePlanV2_1A_DataEnterer_assignedEntity_2_1_6_i-error_mdht" name="p-CarePlanV2_1A_DataEnterer_assignedEntity_2_1_6_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer
			UML root path: /USRealmHeader2/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeader2::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Care Plan (V2) - 2.1.6.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_id_2_1_6_i_a-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_id_2_1_6_i_a-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_id_2_1_6_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.6.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5443, R2.1=CONF:1198-5443)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_code_2_1_6_i_d-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_code_2_1_6_i_d-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_code_2_1_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 2.1.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Care Plan (V2) - 2.1.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_6_i_e-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_6_i_e-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_6_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Care Plan (V2) - 2.1.6.i.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469, R2.1=CONF:1198-5469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_addr_2_1_6_i_c-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_addr_2_1_6_i_c-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_addr_2_1_6_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.6.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5460, R2.1=CONF:1198-5460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_telecom_2_1_6_i_d-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_telecom_2_1_6_i_d-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_telecom_2_1_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Care Plan (V2) - 2.1.6.i.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5466, R2.1=CONF:1198-5466)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-CarePlanV2_1A_TEL_use_2_1_6_i_d_1-error_mdht" see="#p-CarePlanV2_1A_TEL_use_2_1_6_i_d_1-error_mdht" name="p-CarePlanV2_1A_TEL_use_2_1_6_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.1.6.i.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7996, R2.1=CONF:1198-7996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-CarePlanV2_1A_Person_name_2_1_6_i_e_1-error_mdht" see="#p-CarePlanV2_1A_Person_name_2_1_6_i_e_1-error_mdht" name="p-CarePlanV2_1A_Person_name_2_1_6_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.6.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5470)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-CarePlanV2_1A_Author_assignedAuthor_2_1_7_ii-error_mdht" see="#p-CarePlanV2_1A_Author_assignedAuthor_2_1_7_ii-error_mdht" name="p-CarePlanV2_1A_Author_assignedAuthor_2_1_7_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::USRealmHeader2::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: Care Plan (V2) - 2.1.7.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1198-5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-CarePlanV2_1A_Author_time_2_1_7_i-error_mdht" see="#p-CarePlanV2_1A_Author_time_2_1_7_i-error_mdht" name="p-CarePlanV2_1A_Author_time_2_1_7_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorTime
		-->
	<assert test="cda:time">Error: Care Plan (V2) - 2.1.7.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5445, R2.1=CONF:1198-5445)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_1A_AssignedAuthor_id_2_1_7_ii_a-error_mdht" see="#p-CarePlanV2_1A_AssignedAuthor_id_2_1_7_ii_a-error_mdht" name="p-CarePlanV2_1A_AssignedAuthor_id_2_1_7_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.7.ii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5449, R2.1=CONF:1198-5449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_1A_AssignedAuthor_code_2_1_7_ii_d-error_mdht" see="#p-CarePlanV2_1A_AssignedAuthor_code_2_1_7_ii_d-error_mdht" name="p-CarePlanV2_1A_AssignedAuthor_code_2_1_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Care Plan (V2) - 2.1.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Care Plan (V2) - 2.1.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_1A_AssignedAuthor_telecom_2_1_7_ii_d-error_mdht" see="#p-CarePlanV2_1A_AssignedAuthor_telecom_2_1_7_ii_d-error_mdht" name="p-CarePlanV2_1A_AssignedAuthor_telecom_2_1_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTelecom
		-->
	<assert test="cda:telecom">Error: Care Plan (V2) - 2.1.7.ii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5428, R2.1=CONF:1198-5428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-CarePlanV2_1A_AssignedAuthor_addr_2_1_7_ii_c-error_mdht" see="#p-CarePlanV2_1A_AssignedAuthor_addr_2_1_7_ii_c-error_mdht" name="p-CarePlanV2_1A_AssignedAuthor_addr_2_1_7_ii_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.7.ii.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5452, R2.1=CONF:1198-5452)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-CarePlanV2_1A_AuthoringDevice_manufacturerModelName_2_1_7_ii_e_1-error_mdht" see="#p-CarePlanV2_1A_AuthoringDevice_manufacturerModelName_2_1_7_ii_e_1-error_mdht" name="p-CarePlanV2_1A_AuthoringDevice_manufacturerModelName_2_1_7_ii_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.manufacturerModelName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
		-->
	<assert test="cda:manufacturerModelName">Error: Care Plan (V2) - 2.1.7.ii.e.1 manufacturerModelName
		Conformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784, R2.1=CONF:1198-16784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-CarePlanV2_1A_AuthoringDevice_softwareName_2_1_7_ii_e_2-error_mdht" see="#p-CarePlanV2_1A_AuthoringDevice_softwareName_2_1_7_ii_e_2-error_mdht" name="p-CarePlanV2_1A_AuthoringDevice_softwareName_2_1_7_ii_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.softwareName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
		-->
	<assert test="cda:softwareName">Error: Care Plan (V2) - 2.1.7.ii.e.2 softwareName
		Conformance: SHALL contain exactly one [1..1] softwareName (CONF:16785, R2.1=CONF:1198-16785)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-CarePlanV2_1A_TEL_use_2_1_7_ii_d_1-error_mdht" see="#p-CarePlanV2_1A_TEL_use_2_1_7_ii_d_1-error_mdht" name="p-CarePlanV2_1A_TEL_use_2_1_7_ii_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/telecom
			UML root path: /USRealmHeader2/author/assignedAuthor/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.1.7.ii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7995, R2.1=CONF:1198-7995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-CarePlanV2_1A_Person_name_2_1_7_ii_f_1-error_mdht" see="#p-CarePlanV2_1A_Person_name_2_1_7_ii_f_1-error_mdht" name="p-CarePlanV2_1A_Person_name_2_1_7_ii_f_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedPerson
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorPersonName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.7.ii.f.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:16789, R2.1=CONF:1198-16789)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-CarePlanV2_1A_Custodian_assignedCustodian_2_1_8_i-error_mdht" see="#p-CarePlanV2_1A_Custodian_assignedCustodian_2_1_8_i-error_mdht" name="p-CarePlanV2_1A_Custodian_assignedCustodian_2_1_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian
			UML root path: /USRealmHeader2/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: Care Plan (V2) - 2.1.8.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:5520, R2.1=CONF:1198-5520)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-CarePlanV2_1A_AssignedCustodian_representedCustodianOrganization_2_1_8_i_a-error_mdht" see="#p-CarePlanV2_1A_AssignedCustodian_representedCustodianOrganization_2_1_8_i_a-error_mdht" name="p-CarePlanV2_1A_AssignedCustodian_representedCustodianOrganization_2_1_8_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian
			UML root path: /USRealmHeader2/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: Care Plan (V2) - 2.1.8.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:5521, R2.1=CONF:1198-5521)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-CarePlanV2_1A_CustodianOrganization_ProviderOrganization_2_1_5_i_e-error_mdht" see="#p-CarePlanV2_1A_CustodianOrganization_ProviderOrganization_2_1_5_i_e-error_mdht" name="p-CarePlanV2_1A_CustodianOrganization_ProviderOrganization_2_1_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Care Plan (V2) - 2.1.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-CarePlanV2_1A_CustodianOrganization_addr_2_1_8_i_a_4-error_mdht" see="#p-CarePlanV2_1A_CustodianOrganization_addr_2_1_8_i_a_4-error_mdht" name="p-CarePlanV2_1A_CustodianOrganization_addr_2_1_8_i_a_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.8.i.a.4 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5559, R2.1=CONF:1198-5559)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-CarePlanV2_1A_CustodianOrganization_name_2_1_8_i_a_2-error_mdht" see="#p-CarePlanV2_1A_CustodianOrganization_name_2_1_8_i_a_2-error_mdht" name="p-CarePlanV2_1A_CustodianOrganization_name_2_1_8_i_a_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.name.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.8.i.a.2 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5524, R2.1=CONF:1198-5524)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-CarePlanV2_1A_CustodianOrganization_id_2_1_8_i_a_1-error_mdht" see="#p-CarePlanV2_1A_CustodianOrganization_id_2_1_8_i_a_1-error_mdht" name="p-CarePlanV2_1A_CustodianOrganization_id_2_1_8_i_a_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.8.i.a.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5522, R2.1=CONF:1198-5522)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-CarePlanV2_1A_CustodianOrganization_telecom_2_1_8_i_a_3-error_mdht" see="#p-CarePlanV2_1A_CustodianOrganization_telecom_2_1_8_i_a_3-error_mdht" name="p-CarePlanV2_1A_CustodianOrganization_telecom_2_1_8_i_a_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.telecom.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: Care Plan (V2) - 2.1.8.i.a.3 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:5525, R2.1=CONF:1198-5525)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-CarePlanV2_1A_TEL_use_2_1_8_i_a_3_i-error_mdht" see="#p-CarePlanV2_1A_TEL_use_2_1_8_i_a_3_i-error_mdht" name="p-CarePlanV2_1A_TEL_use_2_1_8_i_a_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.1.8.i.a.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7998, R2.1=CONF:1198-7998)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-CarePlanV2_1A_LegalAuthenticator_time_2_1_10_i-error_mdht" see="#p-CarePlanV2_1A_LegalAuthenticator_time_2_1_10_i-error_mdht" name="p-CarePlanV2_1A_LegalAuthenticator_time_2_1_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorTime
		-->
	<assert test="cda:time">Error: Care Plan (V2) - 2.1.10.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5580, R2.1=CONF:1198-5580)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-CarePlanV2_1A_LegalAuthenticator_signatureCode_2_1_10_ii-error_mdht" see="#p-CarePlanV2_1A_LegalAuthenticator_signatureCode_2_1_10_ii-error_mdht" name="p-CarePlanV2_1A_LegalAuthenticator_signatureCode_2_1_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: Care Plan (V2) - 2.1.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: Care Plan (V2) - 2.1.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-CarePlanV2_1A_LegalAuthenticator_assignedEntity_2_1_10_iv-error_mdht" see="#p-CarePlanV2_1A_LegalAuthenticator_assignedEntity_2_1_10_iv-error_mdht" name="p-CarePlanV2_1A_LegalAuthenticator_assignedEntity_2_1_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Care Plan (V2) - 2.1.10.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585, R2.1=CONF:1198-5585)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-CarePlanV2_1A_LegalAuthenticator_sDTCSignatureText_2_1_10_iii-error_mdht" see="#p-CarePlanV2_1A_LegalAuthenticator_sDTCSignatureText_2_1_10_iii-error_mdht" name="p-CarePlanV2_1A_LegalAuthenticator_sDTCSignatureText_2_1_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2LegalAuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Care Plan (V2) - 2.1.10.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30810)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_id_2_1_10_iv_a-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_id_2_1_10_iv_a-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_id_2_1_10_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.10.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5586, R2.1=CONF:1198-5586)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_iv_e-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_iv_e-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Care Plan (V2) - 2.1.10.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597, R2.1=CONF:1198-5597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_code_2_1_10_iv_b-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_code_2_1_10_iv_b-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_code_2_1_10_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 2.1.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Care Plan (V2) - 2.1.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_addr_2_1_10_iv_c-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_addr_2_1_10_iv_c-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_addr_2_1_10_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.10.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5589, R2.1=CONF:1198-5589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_ProviderOrganization_2_1_5_i_e-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_ProviderOrganization_2_1_5_i_e-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_ProviderOrganization_2_1_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Care Plan (V2) - 2.1.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id MAY contain zero or one [0..1] @root=&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_telecom_2_1_10_iv_d-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_telecom_2_1_10_iv_d-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_telecom_2_1_10_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Care Plan (V2) - 2.1.10.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5595, R2.1=CONF:1198-5595)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-CarePlanV2_1A_TEL_use_2_1_10_iv_d_1-error_mdht" see="#p-CarePlanV2_1A_TEL_use_2_1_10_iv_d_1-error_mdht" name="p-CarePlanV2_1A_TEL_use_2_1_10_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Care Plan (V2) - 2.1.10.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7999, R2.1=CONF:1198-7999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-CarePlanV2_1A_Person_name_2_1_10_iv_e_1-error_mdht" see="#p-CarePlanV2_1A_Person_name_2_1_10_iv_e_1-error_mdht" name="p-CarePlanV2_1A_Person_name_2_1_10_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.10.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5598, R2.1=CONF:1198-5598)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_id_2_1_12_i_a-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_id_2_1_12_i_a-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_id_2_1_12_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.12.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9945, R2.1=CONF:1198-9945)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_code_2_1_12_i_b-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_code_2_1_12_i_b-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_code_2_1_12_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 2.1.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Care Plan (V2) - 2.1.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_12_i_d-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_12_i_d-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_12_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Care Plan (V2) - 2.1.12.i.d assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:8221, R2.1=CONF:1198-8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-CarePlanV2_1A_AssignedEntity_addr_2_1_12_i_c-error_mdht" see="#p-CarePlanV2_1A_AssignedEntity_addr_2_1_12_i_c-error_mdht" name="p-CarePlanV2_1A_AssignedEntity_addr_2_1_12_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Care Plan (V2) - 2.1.12.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:1198-8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-CarePlanV2_1A_Person_name_2_1_12_i_d_1-error_mdht" see="#p-CarePlanV2_1A_Person_name_2_1_12_i_d_1-error_mdht" name="p-CarePlanV2_1A_Person_name_2_1_12_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/informant/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Care Plan (V2) - 2.1.12.i.d.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:8222, CONF:10420, R2.1=CONF:1198-8222)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-CarePlanV2_1A_RelatedEntity_addr_2_1_12_ii_a-error_mdht" see="#p-CarePlanV2_1A_RelatedEntity_addr_2_1_12_ii_a-error_mdht" name="p-CarePlanV2_1A_RelatedEntity_addr_2_1_12_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/relatedEntity
			UML root path: /USRealmHeader2/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: (not ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())))
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)])">Error: Care Plan (V2) - 2.1.12.ii.a addr
		Conformance: contain  [0..0] addr
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InFulfillmentOf -->

<pattern id="p-CarePlanV2_1A_InFulfillmentOf_order_2_1_13_i-error_mdht" see="#p-CarePlanV2_1A_InFulfillmentOf_order_2_1_13_i-error_mdht" name="p-CarePlanV2_1A_InFulfillmentOf_order_2_1_13_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf
			UML root path: /USRealmHeader2/inFulfillmentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf">
		<!--
			OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::GeneralHeaderConstraints::InFulfillmentOf::Order))
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrder
		-->
	<assert test="count(cda:order)=1">Error: Care Plan (V2) - 2.1.13.i order
		Conformance: SHALL contain exactly one [1..1] order (CONF:9953, R2.1=CONF:1198-9953)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Order -->

<pattern id="p-CarePlanV2_1A_Order_id_2_1_13_i_a-error_mdht" see="#p-CarePlanV2_1A_Order_id_2_1_13_i_a-error_mdht" name="p-CarePlanV2_1A_Order_id_2_1_13_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf/order
			UML root path: /USRealmHeader2/inFulfillmentOf/order
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrderId
		-->
	<assert test="cda:id">Error: Care Plan (V2) - 2.1.13.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9954, R2.1=CONF:1198-9954)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-CarePlanV2_1A_ParticipantSupport_time_2_1_15_i-error_mdht" see="#p-CarePlanV2_1A_ParticipantSupport_time_2_1_15_i-error_mdht" name="p-CarePlanV2_1A_ParticipantSupport_time_2_1_15_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: Care Plan (V2) - 2.1.15.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004, R2.1=CONF:1198-10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-CarePlanV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" see="#p-CarePlanV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" name="p-CarePlanV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: Care Plan (V2) - 2.6.21 ParticipantSupport
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: SHALL contain associatedEntity/associatedPerson AND/OR associatedEntity/scopingOrganization
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-CarePlanV2_1A_Authorization_consent_2_1_17_i-error_mdht" see="#p-CarePlanV2_1A_Authorization_consent_2_1_17_i-error_mdht" name="p-CarePlanV2_1A_Authorization_consent_2_1_17_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization
			UML root path: /USRealmHeader2/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::GeneralHeaderConstraints::Authorization::Consent))
			Constraint name: GeneralHeaderConstraintsAuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: Care Plan (V2) - 2.1.17.i consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:16793, R2.1=CONF:1198-16793)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-CarePlanV2_1A_Consent_id_2_1_17_i_a-error_mdht" see="#p-CarePlanV2_1A_Consent_id_2_1_17_i_a-error_mdht" name="p-CarePlanV2_1A_Consent_id_2_1_17_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Care Plan (V2) - 2.1.17.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:16794, R2.1=CONF:1198-16794)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-CarePlanV2_1A_Consent_code_2_1_17_i_b-error_mdht" see="#p-CarePlanV2_1A_Consent_code_2_1_17_i_b-error_mdht" name="p-CarePlanV2_1A_Consent_code_2_1_17_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Care Plan (V2) - 2.1.17.i.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16795, R2.1=CONF:1198-16795)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-CarePlanV2_1A_Consent_statusCode_2_1_17_i_c-error_mdht" see="#p-CarePlanV2_1A_Consent_statusCode_2_1_17_i_c-error_mdht" name="p-CarePlanV2_1A_Consent_statusCode_2_1_17_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Care Plan (V2) - 2.1.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Care Plan (V2) - 2.1.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<pattern id="allcontexts_mdht" see="#allcontexts_mdht" name="allcontexts_mdht">
		<!--tests all contexts-->
	<rule context="/cda:ClinicalDocument">
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument">Cannot find context /cda:ClinicalDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">Cannot find context /cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = "ASSIGNED"]</assert>
	<assert test="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">Cannot find context /cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = "ASSIGNED"]</assert>
	<assert test="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">Cannot find context /cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = "ASSIGNED"]</assert>
	<assert test="/cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = 'ASSIGNED']">Cannot find context /cda:ClinicalDocument/cda:participant[cda:associatedEntity/@classCode = "ASSIGNED"]</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = 'ASSIGNED']">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = "ASSIGNED"]</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = 'ASSIGNED']">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = "ASSIGNED"]</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = 'ASSIGNED']">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity[@classCode = "ASSIGNED"]</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity/cda:associatedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:relatedDocument">Cannot find context /cda:ClinicalDocument/cda:relatedDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:relatedDocument">Cannot find context /cda:ClinicalDocument/cda:relatedDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument">Cannot find context /cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument">Cannot find context /cda:ClinicalDocument/cda:relatedDocument/cda:parentDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:component">Cannot find context /cda:ClinicalDocument/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.58']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.5']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.58"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.5"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:author[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.119"]/cda:assignedAuthor/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference/cda:externalDocument[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.115"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference/cda:externalDocument[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.115"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference/cda:externalDocument[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.115"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference/cda:externalDocument[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.115"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference/cda:externalDocument[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.115"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference/cda:externalDocument[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.115"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:reference/cda:externalDocument[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.115']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:reference/cda:externalDocument[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.115"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']/cda:id">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]/cda:id</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.122']/cda:code">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.60"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.121"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.122"]/cda:code</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:code">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:code</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:effectiveTime">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:effectiveTime</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:effectiveTime">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:effectiveTime</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:playingEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:playingEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:playingEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:playingEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:templateId/@root = '2.16.840.1.113883.10.20.1.58']/cda:participantRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:templateId/@root = "2.16.840.1.113883.10.20.1.58"]/cda:participantRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:participantRole/@classCode = 'AGNT']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:participantRole/@classCode = "AGNT"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant[cda:participantRole/@classCode = 'AGNT']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant[cda:participantRole/@classCode = "AGNT"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant/cda:participantRole[@classCode = "AGNT"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant/cda:participantRole[@classCode = "AGNT"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant/cda:participantRole[@classCode = "AGNT"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant/cda:participantRole[@classCode = "AGNT"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant/cda:participantRole[@classCode = "AGNT"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']/cda:playingEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant/cda:participantRole[@classCode = "AGNT"]/cda:playingEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.21.2.3']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.131']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:participant/cda:participantRole[@classCode = 'AGNT']/cda:playingEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.21.2.3"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.131"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:participant/cda:participantRole[@classCode = "AGNT"]/cda:playingEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.21.1"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.21.1"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.21.1"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:reference/cda:externalDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.21.1"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:reference/cda:externalDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.21.1"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:reference/cda:externalDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.21.1']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.48']/cda:reference/cda:externalDocument">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.21.1"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.48"]/cda:reference/cda:externalDocument</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.61']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.144']/cda:reference">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.61"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.144"]/cda:reference</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget">Cannot find context /cda:ClinicalDocument/cda:recordTarget</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer">Cannot find context /cda:ClinicalDocument/cda:dataEnterer</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian">Cannot find context /cda:ClinicalDocument/cda:custodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf/cda:order</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization">Cannot find context /cda:ClinicalDocument/cda:authorization</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-CarePlanV2_1A_CarePlanV2_informationRecipient_2_1_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_authorization_2_1_17-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_participantCaregiver_2_1_9-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_authenticator_2_1_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_participantCarePlanReview_2_1_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_title_2_1_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_effectiveTime_2_1_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_author_2_1_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_languageCode_2_1_9-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_dataEnterer_2_1_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_realmCode_2_1_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_templateId_2_1_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_id_2_1_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_supportParticipant_2_1_15-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_legalAuthenticator_2_1_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_recordTarget_2_1_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_informant_2_1_12-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_custodian_2_1_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_code_2_1_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_confidentialityCode_2_1_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_CarePlanDoesNotHavePlanOfTreatmentSectionV2_2_1_14-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_CarePlanV2_component_2_1_13-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_inFulfillmentOf_2_1_13-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_documentationOf_2_1_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_versionNumber_2_1_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_setId_2_1_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_relatedDocument_2_1_11-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CarePlanV2_typeId_2_1_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_CarePlanV2_componentOf_2_1_12-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_InformationRecipient_intendedRecipient_2_1_6_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_IntendedRecipient_telecom_2_1_6_i_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_IntendedRecipient_informationRecipient_2_1_6_i_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_IntendedRecipient_addr_2_1_6_i_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_IntendedRecipient_receivedOrganization_2_1_6_i_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_IntendedRecipient_id_2_1_6_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_InformationRecipient_name_2_1_6_i_d_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ReceivedOrganization_id_2_1_6_i_e_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ReceivedOrganization_standardIndustryClassCode_2_1_6_i_e_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ReceivedOrganization_name_2_1_6_i_e_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Authenticator_sDTCSignatureText_2_1_7_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Authenticator_assignedEntity_2_1_7_iv-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Authenticator_signatureCode_2_1_7_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Authenticator_time_2_1_7_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_code_2_1_7_iv_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_id_2_1_7_iv_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantCarePlanReview_functionCode_2_1_8_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantCarePlanReview_associatedEntity_2_1_8_iv-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantCarePlanReview_time_2_1_8_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantCarePlanReview_typeCode_2_1_8_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssociatedEntity_code_2_1_8_iv_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_8_iv_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssociatedEntity_id_2_1_8_iv_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantCaregiver_associatedEntity_2_1_9_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantCaregiver_typeCode_2_1_9_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssociatedEntity_associatedPerson_2_1_9_ii_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssociatedEntity_classCode_2_1_9_ii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssociatedPerson_name_2_1_9_ii_b_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_DocumentationOf_serviceEvent_2_1_10_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ServiceEvent_performer1_2_1_10_i_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ServiceEvent_effectiveTime_2_1_10_i_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ServiceEvent_classCode_2_1_10_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_IVLTS_low_2_1_10_i_b_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_IVLTS_high_2_1_10_i_b_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Performer_assignedEntity_2_1_10_i_c_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_code_2_1_10_i_c_1_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_id_2_1_10_i_c_1_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_i_c_1_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedPerson_name_2_1_10_i_c_1_iii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_RelatedDocument_parentDocument_2_1_11_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_RelatedDocument_typeCode_2_1_11_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParentDocument_versionNumber_2_1_11_ii_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParentDocument_setId_2_1_11_ii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_ComponentOf_encompassingEncounter_2_1_12_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_EncompassingEncounter_effectiveTime_2_1_12_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_Component_structuredBody_2_1_13_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_StructuredBody_healthStatusEvaluationsOutcomesSection_2_1_13_i_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_StructuredBody_goalsSection_2_1_13_i_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_StructuredBody_interventionsSection2_2_1_13_i_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_StructuredBody_healthConcernsSection_2_1_13_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_Component_healthConcernsSection_2_1_13_i_a_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthConcernsSectionV2_templateId_3_37_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthConcernsSectionV2_nullFlavor_3_37_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthConcernsSectionV2_code_3_37_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthConcernsSectionV2_text_3_37_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthConcernsSectionV2_entry_3_37_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthConcernsSectionV2_title_3_37_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthStatusObservation2Entry_healthStatusObservation2_3_37_6_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthStatusObservation2_text_4_52_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthStatusObservation2_id_4_52_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthStatusObservation2_templateId_4_52_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthStatusObservation2_statusCode_4_52_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthStatusObservation2_code_4_52_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_Component_goalsSection_2_1_13_i_b_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_GoalsSection_code_3_36_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_GoalsSection_nullFlavor_3_36_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_GoalsSection_templateId_3_36_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalsSection_entry_3_36_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_GoalsSection_text_3_36_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_GoalsSection_title_3_36_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservationEntry_goalObservation_3_36_6_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_authorParticipation_4_48_9-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_14-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_id_4_48_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_12-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_reference_4_48_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_statusCode_4_48_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_value_4_48_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_15-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_classCode_4_48_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_code_4_48_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_moodCode_4_48_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_13-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_effectiveTime_4_48_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_templateId_4_48_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_GoalObservation_entryRelationship_4_48_11-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AuthorParticipation_time_4_48_9_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_typeCode_4_48_10_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_externalDocumentReference_4_48_10_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocumentReference_id_4_48_10_ii_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocumentReference_versionNumber_4_48_10_ii_g-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocumentReference_moodCode_4_48_10_ii_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocumentReference_setId_4_48_10_ii_f-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocumentReference_code_4_48_10_ii_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocumentReference_classCode_4_48_10_ii_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocumentReference_templateId_4_48_10_ii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_EntryReferenceEntryRelationship_healthConcernActER_4_48_11_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_EntryReference_moodCode_4_36_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_EntryReference_templateId_4_36_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_EntryReference_code_4_36_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_EntryReference_statusCode_4_36_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_EntryReference_classCode_4_36_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_EntryReference_id_4_36_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_II_nullFlavor_4_36_4_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CD_nullFlavor_4_36_5_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_Component_interventionsSection2_2_1_13_i_c_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_InterventionsSectionV3_templateId_3_59_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_InterventionsSectionV3_code_3_59_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionsSectionV3_entry_3_59_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_InterventionsSectionV3_title_3_59_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_InterventionsSectionV3_text_3_59_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActEntry_interventionAct_3_59_4_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_effectiveTime_4_65_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_11-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_15-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_21-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_24-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_classCode_4_65_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_18-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_id_4_65_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_13-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_statusCode_4_65_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_16-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_19-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_20-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_reference_4_65_9-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_moodCode_4_65_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_code_4_65_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_authorParticipation_4_65_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_23-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_12-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_14-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_17-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_entryRelationship_4_65_22-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_InterventionActV2_templateId_4_65_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_externalDocumentReference_4_65_9_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_typeCode_4_65_9_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservation2EntryRelationship_advanceDirectiveObservation2_4_65_10_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_reference_4_4_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_id_4_4_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_verifier_4_4_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_templateId_4_4_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasStartingTime_4_4_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_value_4_4_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_moodCode_4_4_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_code_4_4_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_AdvanceDirectiveObservationHasEndingTime_4_4_11-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_effectiveTime_4_4_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_statusCode_4_4_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_custodian_4_4_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_classCode_4_4_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_AdvanceDirectiveObservationV3_authorParticipation_4_4_9-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CD_translation_4_4_3_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_IVLTS_low_4_4_4_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_IVLTS_high_4_4_4_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Verifier_participantRole_4_4_6_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Verifier_typeCode_4_4_6_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Verifier_time_4_4_6_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Verifier_templateId_4_4_6_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ParticipantRole_addr_4_4_6_iii_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ParticipantRole_code_4_4_6_iii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ParticipantRole_playingEntity_4_4_6_iii_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_PlayingEntity_name_4_4_6_iii_c_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_PlayingEntity_code_4_4_6_iii_c_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Custodian_advanceDirectiveObservationCustodianRole_4_4_7_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Custodian_typeCode_4_4_7_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CustodianRole_telecom_4_4_7_ii_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CustodianRole_playingEntity_4_4_7_ii_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CustodianRole_addr_4_4_7_ii_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CustodianRole_code_4_4_7_ii_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CustodianRole_classCode_4_4_7_ii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CustodianEntity_name_4_4_7_ii_e_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_CustodianEntity_code_4_4_7_ii_e_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_typeCode_4_3_10_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_externalDocument_4_3_10_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextReference_4_3_10_ii_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocument_AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType_4_3_10_ii_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocument_id_4_3_10_ii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_ExternalDocument_text_4_3_10_ii_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_Component_healthStatusEvaluationsOutcomesSection_2_1_13_i_d_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_text_3_38_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_nullFlavor_3_38_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_HealthStatusEvaluationsAndOutcomesSection_entry_3_38_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_templateId_3_38_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_title_3_38_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_2_HealthStatusEvaluationsAndOutcomesSection_code_3_38_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservationEntry_outcomeObservation_3_38_6_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_templateId_4_86_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_9-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_id_4_86_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_code_4_86_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_moodCode_4_86_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_12-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_reference_4_86_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_value_4_86_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_entryRelationship_4_86_11-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_classCode_4_86_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_OutcomeObservation_authorParticipation_4_86_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_typeCode_4_86_8_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_3A_Reference_externalDocumentReference_4_86_8_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_RecordTarget_patientRole_2_1_5_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_PatientRole_addr_2_1_5_i_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_PatientRole_telecom_2_1_5_i_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_PatientRole_providerOrganization_2_1_5_i_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_PatientRole_patient_2_1_5_i_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_PatientRole_id_2_1_5_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_religiousAffiliationCode_2_1_5_i_e_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_raceCode_2_1_5_i_e_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_name_2_1_5_i_e_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_sDTCRaceCode_2_1_5_i_e_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_birthTime_2_1_5_i_e_8-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_birthplace_2_1_5_i_e_11-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_administrativeGenderCode_2_1_5_i_e_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_maritalStatusCode_2_1_5_i_e_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_guardian_2_1_5_i_e_9-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_languageCommunication_2_1_5_i_e_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Patient_ethnicGroupCode_2_1_5_i_e_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Guardian_code_2_1_5_i_e_9_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Guardian_telecom_2_1_5_i_e_9_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Guardian_addr_2_1_5_i_e_9_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Guardian_guardianPerson_2_1_5_i_e_9_iv-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_1_5_i_b_7-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Person_name_2_1_5_i_e_9_iv_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LanguageCommunication_proficiencyLevelCode_2_1_5_i_e_10_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LanguageCommunication_modeCode_2_1_5_i_e_10_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LanguageCommunication_languageCode_2_1_5_i_e_10_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LanguageCommunication_preferenceInd_2_1_5_i_e_10_iv-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TS_value_2_1_5_i_e_8_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Birthplace_place_2_1_5_i_e_11_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Place_addr_2_1_5_i_e_11_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ProviderOrganization_telecom_2_1_5_i_e_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_1_5_i_e_5-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ProviderOrganization_addr_2_1_5_i_e_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ProviderOrganization_id_2_1_5_i_e_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ProviderOrganization_name_2_1_5_i_e_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TEL_use_2_1_5_i_e_3_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TEL_use_2_1_5_i_c_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_DataEnterer_assignedEntity_2_1_6_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_id_2_1_6_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_code_2_1_6_i_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_6_i_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_addr_2_1_6_i_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_telecom_2_1_6_i_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TEL_use_2_1_6_i_d_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Person_name_2_1_6_i_e_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Author_assignedAuthor_2_1_7_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Author_time_2_1_7_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedAuthor_id_2_1_7_ii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedAuthor_code_2_1_7_ii_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedAuthor_telecom_2_1_7_ii_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedAuthor_addr_2_1_7_ii_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AuthoringDevice_manufacturerModelName_2_1_7_ii_e_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AuthoringDevice_softwareName_2_1_7_ii_e_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TEL_use_2_1_7_ii_d_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Person_name_2_1_7_ii_f_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Custodian_assignedCustodian_2_1_8_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedCustodian_representedCustodianOrganization_2_1_8_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CustodianOrganization_ProviderOrganization_2_1_5_i_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CustodianOrganization_addr_2_1_8_i_a_4-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CustodianOrganization_name_2_1_8_i_a_2-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CustodianOrganization_id_2_1_8_i_a_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_CustodianOrganization_telecom_2_1_8_i_a_3-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TEL_use_2_1_8_i_a_3_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LegalAuthenticator_time_2_1_10_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LegalAuthenticator_signatureCode_2_1_10_ii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LegalAuthenticator_assignedEntity_2_1_10_iv-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_LegalAuthenticator_sDTCSignatureText_2_1_10_iii-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_id_2_1_10_iv_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_10_iv_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_code_2_1_10_iv_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_addr_2_1_10_iv_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_ProviderOrganization_2_1_5_i_e-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_telecom_2_1_10_iv_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_TEL_use_2_1_10_iv_d_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Person_name_2_1_10_iv_e_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_id_2_1_12_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_code_2_1_12_i_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_assignedPerson_2_1_12_i_d-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_AssignedEntity_addr_2_1_12_i_c-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Person_name_2_1_12_i_d_1-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_RelatedEntity_addr_2_1_12_ii_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_InFulfillmentOf_order_2_1_13_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Order_id_2_1_13_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantSupport_time_2_1_15_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Authorization_consent_2_1_17_i-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Consent_id_2_1_17_i_a-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Consent_code_2_1_17_i_b-error_mdht"/>
	<active pattern = "p-CarePlanV2_1A_Consent_statusCode_2_1_17_i_c-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
