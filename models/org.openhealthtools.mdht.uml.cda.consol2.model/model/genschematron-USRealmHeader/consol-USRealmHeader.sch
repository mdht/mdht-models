<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_id_2_10_4-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_id_2_10_4-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_id_2_10_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.10.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363, R2.1=CONF:1198-5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_languageCode_2_10_9-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_languageCode_2_10_9-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_languageCode_2_10_9-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: USRealmHeader - 2.10.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: USRealmHeader - 2.10.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_10_21-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_10_21-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_10_21-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: USRealmHeader - 2.10.21 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_recordTarget_2_10_12-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_recordTarget_2_10_12-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_recordTarget_2_10_12-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: USRealmHeader - 2.10.12 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_realmCode_2_10_2-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_realmCode_2_10_2-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_realmCode_2_10_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: USRealmHeader - 2.10.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: USRealmHeader - 2.10.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_custodian_2_10_16-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_custodian_2_10_16-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_custodian_2_10_16-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: USRealmHeader - 2.10.16 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_10_17-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_10_17-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_10_17-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: USRealmHeader - 2.10.17 informationRecipient
		Conformance: MAY contain zero or more [0..*] informationRecipient (CONF:5565)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_10_18-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_10_18-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_10_18-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: USRealmHeader - 2.10.18 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_10_8-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_10_8-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_10_8-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: USRealmHeader - 2.10.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: USRealmHeader - 2.10.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_10_27-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_10_27-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_10_27-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.setId.oclIsUndefined() implies not self.versionNumber.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsSetIdVersionNumber
		-->
	<assert test="not(cda:setId) or cda:versionNumber">Error: USRealmHeader - 2.10.27 GeneralHeaderConstraintsSetIdVersionNumber
		Conformance: If setId is present versionNumber SHALL be present (CONF:6380, R2.1=CONF:1198-6380)
		Analysis: If setId is present versionNumber SHALL be present
		Validation message: n/a	</assert>
		<!--
			OCL: not self.versionNumber.oclIsUndefined() implies not self.setId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsVersionNumberSetId
		-->
	<assert test="not(cda:versionNumber) or cda:setId">Error: USRealmHeader - 2.10.27 GeneralHeaderConstraintsSetIdVersionNumber
		Conformance: If setId is present versionNumber SHALL be present (CONF:6380, R2.1=CONF:1198-6380)
		Analysis: If versionNumber is present setId SHALL be present
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_10_7-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_10_7-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_10_7-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: USRealmHeader - 2.10.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_typeId_2_10_3-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_typeId_2_10_3-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_typeId_2_10_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: USRealmHeader - 2.10.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_authorization_2_10_24-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_authorization_2_10_24-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_authorization_2_10_24-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: USRealmHeader - 2.10.24 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_code_2_10_5-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_code_2_10_5-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_code_2_10_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code">Error: USRealmHeader - 2.10.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:5253, R2.1=CONF:1198-5253)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_title_2_10_6-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_title_2_10_6-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_title_2_10_6-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: USRealmHeader - 2.10.6 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_templateId_2_10_1-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_templateId_2_10_1-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_templateId_2_10_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.1'">Error: USRealmHeader - 2.10.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:5252, CONF:10036 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.1'">Error: USRealmHeader - 2.10.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:5252, CONF:10036 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_authenticator_2_10_19-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_authenticator_2_10_19-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_authenticator_2_10_19-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: USRealmHeader - 2.10.19 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_10_15-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_10_15-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_10_15-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: USRealmHeader - 2.10.15 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_informant_2_10_20-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_informant_2_10_20-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_informant_2_10_20-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: USRealmHeader - 2.10.20 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:8001)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_10_22-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_10_22-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_10_22-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: USRealmHeader - 2.10.22 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:9952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_author_2_10_14-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_author_2_10_14-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_author_2_10_14-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: USRealmHeader - 2.10.14 author
		Conformance: SHALL contain at least one [1..*] author (CONF:5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_documentationOf_2_10_23-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_documentationOf_2_10_23-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_documentationOf_2_10_23-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->select(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOf
		-->
	<assert test="count(cda:documentationOf) &gt;= 0">Error: USRealmHeader - 2.10.23 documentationOf
		Conformance: MAY contain zero or more [0..*] documentationOf (CONF:14835)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_setId_2_10_10-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_setId_2_10_10-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_setId_2_10_10-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: USRealmHeader - 2.10.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_2_USRealmHeader_componentOf_2_10_13-error_mdht" see="#p-USRealmHeader_2_USRealmHeader_componentOf_2_10_13-error_mdht" name="p-USRealmHeader_2_USRealmHeader_componentOf_2_10_13-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: GeneralHeaderConstraintsComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: USRealmHeader - 2.10.13 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:9955)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_versionNumber_2_10_11-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_versionNumber_2_10_11-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_versionNumber_2_10_11-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: USRealmHeader - 2.10.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-USRealmHeader_1A_RecordTarget_patientRole_2_10_12_i-error_mdht" see="#p-USRealmHeader_1A_RecordTarget_patientRole_2_10_12_i-error_mdht" name="p-USRealmHeader_1A_RecordTarget_patientRole_2_10_12_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget
			UML root path: /GeneralHeaderConstraints/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: USRealmHeader - 2.10.12.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader_1A_PatientRole_patient_2_10_12_i_d-error_mdht" see="#p-USRealmHeader_1A_PatientRole_patient_2_10_12_i_d-error_mdht" name="p-USRealmHeader_1A_PatientRole_patient_2_10_12_i_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: USRealmHeader - 2.10.12.i.d patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:1198-5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: USRealmHeader - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: USRealmHeader - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: USRealmHeader - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: USRealmHeader - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: USRealmHeader - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: USRealmHeader - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_guardian_2_10_12_i_d_9-error_mdht" see="#p-USRealmHeader_1A_Patient_guardian_2_10_12_i_d_9-error_mdht" name="p-USRealmHeader_1A_Patient_guardian_2_10_12_i_d_9-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: USRealmHeader - 2.10.12.i.d.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_birthplace_2_10_12_i_d_10-error_mdht" see="#p-USRealmHeader_1A_Patient_birthplace_2_10_12_i_d_10-error_mdht" name="p-USRealmHeader_1A_Patient_birthplace_2_10_12_i_d_10-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: USRealmHeader - 2.10.12.i.d.10 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_10_12_i_d_12-error_mdht" see="#p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_10_12_i_d_12-error_mdht" name="p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_10_12_i_d_12-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: sDTCRaceCode->notEmpty() implies not raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode) or cda:raceCode">Error: USRealmHeader - 2.10.12.i.d.12 GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		Conformance: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode (CONF:31347, R2.1=CONF:1198-31347)
		Analysis: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_ethnicGroupCode_2_10_12_i_d_8-error_mdht" see="#p-USRealmHeader_1A_Patient_ethnicGroupCode_2_10_12_i_d_8-error_mdht" name="p-USRealmHeader_1A_Patient_ethnicGroupCode_2_10_12_i_d_8-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode">Error: USRealmHeader - 2.10.12.i.d.8 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined() and self.ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.ethnicGroupCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: USRealmHeader - 2.10.12.i.d.8 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_birthTime_2_10_12_i_d_3-error_mdht" see="#p-USRealmHeader_1A_Patient_birthTime_2_10_12_i_d_3-error_mdht" name="p-USRealmHeader_1A_Patient_birthTime_2_10_12_i_d_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: USRealmHeader - 2.10.12.i.d.3 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_raceCode_2_10_12_i_d_6-error_mdht" see="#p-USRealmHeader_1A_Patient_raceCode_2_10_12_i_d_6-error_mdht" name="p-USRealmHeader_1A_Patient_raceCode_2_10_12_i_d_6-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode">Error: USRealmHeader - 2.10.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined() and self.raceCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and @code]">Error: USRealmHeader - 2.10.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_languageCommunication_2_10_12_i_d_11-error_mdht" see="#p-USRealmHeader_1A_Patient_languageCommunication_2_10_12_i_d_11-error_mdht" name="p-USRealmHeader_1A_Patient_languageCommunication_2_10_12_i_d_11-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: USRealmHeader - 2.10.12.i.d.11 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: USRealmHeader - 2.19.5.ii.b.1.iv prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155, R2.1=CONF:81-7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: USRealmHeader - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: USRealmHeader - 2.19.5.ii.b.1.iii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157, R2.1=CONF:81-7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: USRealmHeader - 2.10 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT have mixed content except for white space
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: USRealmHeader - 2.19.5.ii.b.1.ii family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, R2.1=CONF:81-7159)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: USRealmHeader - 2.19.5.ii.b.1.v suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161, R2.1=CONF:81-7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-USRealmHeader_1A_TS_value_2_10_12_i_d_3_i-error_mdht" see="#p-USRealmHeader_1A_TS_value_2_10_12_i_d_3_i-error_mdht" name="p-USRealmHeader_1A_TS_value_2_10_12_i_d_3_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.value.oclIsUndefined() ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or @value">Error: USRealmHeader - 2.10.12.i.d.3.i value
		Conformance: SHALL contain exactly one [1..1] value (CONF:5299, CONF:5300)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_code_2_10_12_i_d_9_i-error_mdht" see="#p-USRealmHeader_1A_Guardian_code_2_10_12_i_d_9_i-error_mdht" name="p-USRealmHeader_1A_Guardian_code_2_10_12_i_d_9_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.10.12.i.d.9.i code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_telecom_2_10_12_i_d_9_iii-error_mdht" see="#p-USRealmHeader_1A_Guardian_telecom_2_10_12_i_d_9_iii-error_mdht" name="p-USRealmHeader_1A_Guardian_telecom_2_10_12_i_d_9_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: USRealmHeader - 2.10.12.i.d.9.iii telecom
		Conformance: MAY contain zero or more [0..*] telecom
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_10_12_i_d_9_v-error_mdht" see="#p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_10_12_i_d_9_v-error_mdht" name="p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_10_12_i_d_9_v-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: (not code.oclIsUndefined()) and code.isNullFlavorUndefined() implies
(code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'ADOPT' or value.code = 'AUNT' or value.code = 'CHILD' or value.code = 'CHLDINLAW' or value.code = 'COUSN' or value.code = 'DOMPART' or value.code = 'FAMMEMB' or value.code = 'CHLDFOST' or value.code = 'GRNDCHILD' or value.code = 'GPARNT' or value.code = 'GRPRN' or value.code = 'GGRPRN' or value.code = 'HSIB' or value.code = 'MAUNT' or value.code = 'MCOUSN' or value.code = 'MGRPRN' or value.code = 'MGGRPRN' or value.code = 'MUNCLE' or value.code = 'NCHILD' or value.code = 'NPRN' or value.code = 'NSIB' or value.code = 'NBOR' or value.code = 'NIENEPH' or value.code = 'PRN' or value.code = 'PRNINLAW' or value.code = 'PAUNT' or value.code = 'PCOUSN' or value.code = 'PGRPRN' or value.code = 'PGGRPRN' or value.code = 'PUNCLE' or value.code = 'ROOM' or value.code = 'SIB' or value.code = 'SIBINLAW' or value.code = 'SIGOTHR' or value.code = 'SPS' or value.code = 'STEP' or value.code = 'STPPRN' or value.code = 'STPSIB' or value.code = 'UNCLE' or value.code = 'FRND' or value.code = 'RESPRSN' or value.code = 'EXCEST' or value.code = 'GUADLTM' or value.code = 'GUARD' or value.code = 'POWATT' or value.code = 'DPOWATT' or value.code = 'HPOWATT' or value.code = 'SPOWATT'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code[@codeSystem = '2.16.840.1.113883.5.111' and (@code = 'ADOPT' or @code = 'AUNT' or @code = 'CHILD' or @code = 'CHLDINLAW' or @code = 'COUSN' or @code = 'DOMPART' or @code = 'FAMMEMB' or @code = 'CHLDFOST' or @code = 'GRNDCHILD' or @code = 'GPARNT' or @code = 'GRPRN' or @code = 'GGRPRN' or @code = 'HSIB' or @code = 'MAUNT' or @code = 'MCOUSN' or @code = 'MGRPRN' or @code = 'MGGRPRN' or @code = 'MUNCLE' or @code = 'NCHILD' or @code = 'NPRN' or @code = 'NSIB' or @code = 'NBOR' or @code = 'NIENEPH' or @code = 'PRN' or @code = 'PRNINLAW' or @code = 'PAUNT' or @code = 'PCOUSN' or @code = 'PGRPRN' or @code = 'PGGRPRN' or @code = 'PUNCLE' or @code = 'ROOM' or @code = 'SIB' or @code = 'SIBINLAW' or @code = 'SIGOTHR' or @code = 'SPS' or @code = 'STEP' or @code = 'STPPRN' or @code = 'STPSIB' or @code = 'UNCLE' or @code = 'FRND' or @code = 'RESPRSN' or @code = 'EXCEST' or @code = 'GUADLTM' or @code = 'GUARD' or @code = 'POWATT' or @code = 'DPOWATT' or @code = 'HPOWATT' or @code = 'SPOWATT')]">Error: USRealmHeader - 2.10.12.i.d.9.v GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty
		Conformance: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC (CONF:5326)
		Analysis: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_10_12_i_d_9_iii_a-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_10_12_i_d_9_iii_a-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_10_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.10.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993, R2.1=CONF:1198-7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-USRealmHeader_1A_Birthplace_place_2_10_12_i_d_10_i-error_mdht" see="#p-USRealmHeader_1A_Birthplace_place_2_10_12_i_d_10_i-error_mdht" name="p-USRealmHeader_1A_Birthplace_place_2_10_12_i_d_10_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: USRealmHeader - 2.10.12.i.d.10.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-USRealmHeader_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_10_12_i_d_10_i_b-error_mdht" see="#p-USRealmHeader_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_10_12_i_d_10_i_b-error_mdht" name="p-USRealmHeader_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_10_12_i_d_10_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: (addr.country->exists(curCountry | not curCountry.oclIsUndefined() and curCountry.getText() = 'US')) implies (addr.state->size() = 1) and ((addr.state->exists(curState | (curState.getText() = 'AL' or curState.getText() = 'AK' or curState.getText() = 'AS' or curState.getText() = 'AZ' or curState.getText() = 'AR' or curState.getText() = 'CA' or curState.getText() = 'CO' or curState.getText() = 'CT' or curState.getText() = 'DE' or curState.getText() = 'DC' or curState.getText() = 'FL' or curState.getText() = 'FM' or curState.getText() = 'GA' or curState.getText() = 'GU' or curState.getText() = 'HI' or curState.getText() = 'ID' or curState.getText() = 'IL' or curState.getText() = 'IN' or curState.getText() = 'IA' or curState.getText() = 'KS' or curState.getText() = 'KY' or curState.getText() = 'LA' or curState.getText() = 'ME' or curState.getText() = 'MH' or curState.getText() = 'MD' or curState.getText() = 'MA' or curState.getText() = 'MI' or curState.getText() = 'MN' or curState.getText() = 'MS' or curState.getText() = 'MO' or curState.getText() = 'MT' or curState.getText() = 'NE' or curState.getText() = 'NV' or curState.getText() = 'NH' or curState.getText() = 'NJ' or curState.getText() = 'NM' or curState.getText() = 'NY' or curState.getText() = 'NC' or curState.getText() = 'ND' or curState.getText() = 'MP' or curState.getText() = 'OH' or curState.getText() = 'OK' or curState.getText() = 'OR' or curState.getText() = 'PW' or curState.getText() = 'PA' or curState.getText() = 'PR' or curState.getText() = 'RI' or curState.getText() = 'SC' or curState.getText() = 'SD' or curState.getText() = 'TN' or curState.getText() = 'TX' or curState.getText() = 'UM' or curState.getText() = 'UT' or curState.getText() = 'VT' or curState.getText() = 'VA' or curState.getText() = 'VI' or curState.getText() = 'WA' or curState.getText() = 'WV' or curState.getText() = 'WI' or curState.getText() = 'WY' ))) or (addr.state->exists(curState | curState.isNullFlavorDefined())))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState
		-->
	<assert test="not(cda:addr/cda:country[string(.//text()) = 'US']) or count(cda:addr/cda:state) = 1 and (cda:addr/cda:state[string(.//text()) = 'AL' or string(.//text()) = 'AK' or string(.//text()) = 'AS' or string(.//text()) = 'AZ' or string(.//text()) = 'AR' or string(.//text()) = 'CA' or string(.//text()) = 'CO' or string(.//text()) = 'CT' or string(.//text()) = 'DE' or string(.//text()) = 'DC' or string(.//text()) = 'FL' or string(.//text()) = 'FM' or string(.//text()) = 'GA' or string(.//text()) = 'GU' or string(.//text()) = 'HI' or string(.//text()) = 'ID' or string(.//text()) = 'IL' or string(.//text()) = 'IN' or string(.//text()) = 'IA' or string(.//text()) = 'KS' or string(.//text()) = 'KY' or string(.//text()) = 'LA' or string(.//text()) = 'ME' or string(.//text()) = 'MH' or string(.//text()) = 'MD' or string(.//text()) = 'MA' or string(.//text()) = 'MI' or string(.//text()) = 'MN' or string(.//text()) = 'MS' or string(.//text()) = 'MO' or string(.//text()) = 'MT' or string(.//text()) = 'NE' or string(.//text()) = 'NV' or string(.//text()) = 'NH' or string(.//text()) = 'NJ' or string(.//text()) = 'NM' or string(.//text()) = 'NY' or string(.//text()) = 'NC' or string(.//text()) = 'ND' or string(.//text()) = 'MP' or string(.//text()) = 'OH' or string(.//text()) = 'OK' or string(.//text()) = 'OR' or string(.//text()) = 'PW' or string(.//text()) = 'PA' or string(.//text()) = 'PR' or string(.//text()) = 'RI' or string(.//text()) = 'SC' or string(.//text()) = 'SD' or string(.//text()) = 'TN' or string(.//text()) = 'TX' or string(.//text()) = 'UM' or string(.//text()) = 'UT' or string(.//text()) = 'VT' or string(.//text()) = 'VA' or string(.//text()) = 'VI' or string(.//text()) = 'WA' or string(.//text()) = 'WV' or string(.//text()) = 'WI' or string(.//text()) = 'WY'] or cda:addr/cda:state[@nullFlavor])">Error: USRealmHeader - 2.10.12.i.d.10.i.b GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState
		Conformance: If country is US, this addr SHALL contain exactly one [1..1] state, which SHALL be selected from ValueSet StateValueSet 2.16.840.1.113883.3.88.12.80.1 DYNAMIC (CONF:5402)
		Analysis: If country is US, this addr SHALL contain exactly one [1..1] state, which SHALL be selected from ValueSet StateValueSet 2.16.840.1.113883.3.88.12.80.1 DYNAMIC
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_10_12_i_d_11_iv-error_mdht" see="#p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_10_12_i_d_11_iv-error_mdht" name="p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_10_12_i_d_11_iv-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: USRealmHeader - 2.10.12.i.d.11.iv preferenceInd
		Conformance: MAY contain zero or one [0..1] preferenceInd (CONF:5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeader_1A_LanguageCommunication_languageCode_2_10_12_i_d_11_i-error_mdht" see="#p-USRealmHeader_1A_LanguageCommunication_languageCode_2_10_12_i_d_11_i-error_mdht" name="p-USRealmHeader_1A_LanguageCommunication_languageCode_2_10_12_i_d_11_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: USRealmHeader - 2.10.12.i.d.11.i languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: USRealmHeader - 2.10.12.i.d.11.i languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_10_13_i-error_mdht" see="#p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_10_13_i-error_mdht" name="p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_10_13_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/componentOf
			UML root path: /GeneralHeaderConstraints/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::GeneralHeaderConstraints::ComponentOf::EncompassingEncounter))
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: USRealmHeader - 2.10.13.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:9956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-USRealmHeader_1A_Author_assignedAuthor_2_10_14_ii-error_mdht" see="#p-USRealmHeader_1A_Author_assignedAuthor_2_10_14_ii-error_mdht" name="p-USRealmHeader_1A_Author_assignedAuthor_2_10_14_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author
			UML root path: /GeneralHeaderConstraints/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::GeneralHeaderConstraints::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: USRealmHeader - 2.10.14.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeader_1A_AssignedAuthor_code_2_10_14_ii_b-error_mdht" see="#p-USRealmHeader_1A_AssignedAuthor_code_2_10_14_ii_b-error_mdht" name="p-USRealmHeader_1A_AssignedAuthor_code_2_10_14_ii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.10.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: USRealmHeader - 2.10.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-USRealmHeader_1A_DataEnterer_assignedEntity_2_10_15_i-error_mdht" see="#p-USRealmHeader_1A_DataEnterer_assignedEntity_2_10_15_i-error_mdht" name="p-USRealmHeader_1A_DataEnterer_assignedEntity_2_10_15_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer
			UML root path: /GeneralHeaderConstraints/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: USRealmHeader - 2.10.15.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_10_15_i_b-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_10_15_i_b-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_10_15_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.10.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: USRealmHeader - 2.10.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_10_17_i-error_mdht" see="#p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_10_17_i-error_mdht" name="p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_10_17_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informationRecipient
			UML root path: /GeneralHeaderConstraints/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient))
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: USRealmHeader - 2.10.17.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:5566)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Informant -->

<pattern id="p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_10_20_iii-error_mdht" see="#p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_10_20_iii-error_mdht" name="p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_10_20_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant
			UML root path: /GeneralHeaderConstraints/informant
		-->
	<rule context="/cda:ClinicalDocument/cda:informant">
		<!--
			OCL: self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity
		-->
	<assert test="not(cda:assignedEntity) or not(cda:relatedEntity)">Error: USRealmHeader - 2.10.20.iii GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity
		Conformance: SHALL satisfy: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity (CONF:8002)
		Analysis: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_addr_2_10_20_i_c-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_addr_2_10_20_i_c-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_addr_2_10_20_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: USRealmHeader - 2.10.20.i.c addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_10_20_i_b-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_10_20_i_b-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_10_20_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.10.20.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9947)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: USRealmHeader - 2.10.20.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9947)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-USRealmHeader_1A_RelatedEntity_addr_2_10_20_ii_a-error_mdht" see="#p-USRealmHeader_1A_RelatedEntity_addr_2_10_20_ii_a-error_mdht" name="p-USRealmHeader_1A_RelatedEntity_addr_2_10_20_ii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/relatedEntity
			UML root path: /GeneralHeaderConstraints/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: USRealmHeader - 2.10.20.ii.a addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-USRealmHeader_1A_RelatedEntity_person_2_10_20_ii_b-error_mdht" see="#p-USRealmHeader_1A_RelatedEntity_person_2_10_20_ii_b-error_mdht" name="p-USRealmHeader_1A_RelatedEntity_person_2_10_20_ii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/relatedEntity
			UML root path: /GeneralHeaderConstraints/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: self.relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityPerson
		-->
	<assert test="count(cda:relatedPerson)=1">Error: USRealmHeader - 2.10.20.ii.b person
		Conformance: SHALL contain exactly one [1..1] relatedPerson (CONF:8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_10_21_ii-error_mdht" see="#p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_10_21_ii-error_mdht" name="p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_10_21_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/supportParticipant
			UML root path: /GeneralHeaderConstraints/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: USRealmHeader - 2.10.21.ii GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		Conformance: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity. (CONF:10006)
		Analysis: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_10_23_i-error_mdht" see="#p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_10_23_i-error_mdht" name="p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_10_23_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf
			UML root path: /GeneralHeaderConstraints/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: USRealmHeader - 2.10.23.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:14836)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeader_1A_ServiceEvent_performer_2_10_23_i_b-error_mdht" see="#p-USRealmHeader_1A_ServiceEvent_performer_2_10_23_i_b-error_mdht" name="p-USRealmHeader_1A_ServiceEvent_performer_2_10_23_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: USRealmHeader - 2.10.23.i.b performer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:14839)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_10_23_i_c-error_mdht" see="#p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_10_23_i_c-error_mdht" name="p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_10_23_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.effectiveTime->forAll(not low.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow
		-->
	<assert test="not(cda:effectiveTime[not(cda:low)])">Error: USRealmHeader - 2.10.23.i.c GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow
		Conformance: effectiveTime SHALL contain exactly one [1..1] low (CONF:14838, R2.1=CONF:1198-14838)
		Analysis: effectiveTime SHALL contain exactly one [1..1] low
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeader_1A_Performer1_assignedEntity_2_10_23_i_b_3-error_mdht" see="#p-USRealmHeader_1A_Performer1_assignedEntity_2_10_23_i_b_3-error_mdht" name="p-USRealmHeader_1A_Performer1_assignedEntity_2_10_23_i_b_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: USRealmHeader - 2.10.23.i.b.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:14841)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeader_1A_Performer1_functionCode_2_10_23_i_b_2-error_mdht" see="#p-USRealmHeader_1A_Performer1_functionCode_2_10_23_i_b_2-error_mdht" name="p-USRealmHeader_1A_Performer1_functionCode_2_10_23_i_b_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode">Error: USRealmHeader - 2.10.23.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.88')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode and cda:functionCode[@codeSystem = '2.16.840.1.113883.5.88']">Error: USRealmHeader - 2.10.23.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_10_23_i_b_3_ii-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_10_23_i_b_3_ii-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_10_23_i_b_3_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.10.23.i.b.3.ii code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:14842), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:14843)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: USRealmHeader - 2.10.23.i.b.3.ii code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:14842), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:14843)
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
	<assert test="/cda:ClinicalDocument/cda:recordTarget">Cannot find context /cda:ClinicalDocument/cda:recordTarget</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer">Cannot find context /cda:ClinicalDocument/cda:dataEnterer</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informant">Cannot find context /cda:ClinicalDocument/cda:informant</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-USRealmHeader_1A_USRealmHeader_id_2_10_4-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_languageCode_2_10_9-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_10_21-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_recordTarget_2_10_12-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_realmCode_2_10_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_custodian_2_10_16-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_10_17-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_10_18-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_10_8-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_10_27-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_10_7-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_typeId_2_10_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_authorization_2_10_24-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_code_2_10_5-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_title_2_10_6-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_templateId_2_10_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_authenticator_2_10_19-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_10_15-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_informant_2_10_20-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_10_22-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_author_2_10_14-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_documentationOf_2_10_23-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_setId_2_10_10-error_mdht"/>
	<active pattern = "p-USRealmHeader_2_USRealmHeader_componentOf_2_10_13-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_versionNumber_2_10_11-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_RecordTarget_patientRole_2_10_12_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_PatientRole_patient_2_10_12_i_d-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_guardian_2_10_12_i_d_9-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_birthplace_2_10_12_i_d_10-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_10_12_i_d_12-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_ethnicGroupCode_2_10_12_i_d_8-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_birthTime_2_10_12_i_d_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_raceCode_2_10_12_i_d_6-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_languageCommunication_2_10_12_i_d_11-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TS_value_2_10_12_i_d_3_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_code_2_10_12_i_d_9_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_telecom_2_10_12_i_d_9_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_10_12_i_d_9_v-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_10_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Birthplace_place_2_10_12_i_d_10_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Place_GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState_2_10_12_i_d_10_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_10_12_i_d_11_iv-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LanguageCommunication_languageCode_2_10_12_i_d_11_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_10_13_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Author_assignedAuthor_2_10_14_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedAuthor_code_2_10_14_ii_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_DataEnterer_assignedEntity_2_10_15_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_10_15_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_10_17_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_10_20_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_addr_2_10_20_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_10_20_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_RelatedEntity_addr_2_10_20_ii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_RelatedEntity_person_2_10_20_ii_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_10_21_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_10_23_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ServiceEvent_performer_2_10_23_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_10_23_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Performer1_assignedEntity_2_10_23_i_b_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Performer1_functionCode_2_10_23_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_10_23_i_b_3_ii-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
