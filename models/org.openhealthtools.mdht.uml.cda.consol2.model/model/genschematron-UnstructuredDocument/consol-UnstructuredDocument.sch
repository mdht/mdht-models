<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_author_2_21_4-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_author_2_21_4-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_author_2_21_4-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: UnstructuredDocumentAuthor
		-->
	<assert test="count(cda:author)=1">Error: UnstructuredDocument - 2.21.4 author
		Conformance: SHALL contain exactly one [1..1] author (CONF:7640)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_recordTarget_2_21_3-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_recordTarget_2_21_3-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_recordTarget_2_21_3-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: UnstructuredDocumentRecordTarget
		-->
	<assert test="count(cda:recordTarget)=1">Error: UnstructuredDocument - 2.21.3 recordTarget
		Conformance: SHALL contain exactly one [1..1] recordTarget (CONF:7643)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_effectiveTime_2_21_7-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_effectiveTime_2_21_7-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_effectiveTime_2_21_7-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: UnstructuredDocument - 2.21.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_code_2_21_5-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_code_2_21_5-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_code_2_21_5-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code">Error: UnstructuredDocument - 2.21.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:5253, R2.1=CONF:1198-5253)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_informant_2_21_20-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_informant_2_21_20-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_informant_2_21_20-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: UnstructuredDocument - 2.21.20 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:8001)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_2_UnstructuredDocument_component_2_21_5-error_mdht" see="#p-UnstructuredDocument_2_UnstructuredDocument_component_2_21_5-error_mdht" name="p-UnstructuredDocument_2_UnstructuredDocument_component_2_21_5-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))
			Constraint name: UnstructuredDocumentComponent
		-->
	<assert test="count(cda:component)=1">Error: UnstructuredDocument - 2.21.5 component
		Conformance: SHALL contain exactly one [1..1] component (CONF:14097)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_informationRecipient_2_21_17-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_informationRecipient_2_21_17-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_informationRecipient_2_21_17-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: UnstructuredDocument - 2.21.17 informationRecipient
		Conformance: MAY contain zero or more [0..*] informationRecipient (CONF:5565)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_id_2_21_4-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_id_2_21_4-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_id_2_21_4-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: UnstructuredDocument - 2.21.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363, R2.1=CONF:1198-5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_versionNumber_2_21_11-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_versionNumber_2_21_11-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_versionNumber_2_21_11-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: UnstructuredDocument - 2.21.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_realmCode_2_21_2-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_realmCode_2_21_2-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_realmCode_2_21_2-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: UnstructuredDocument - 2.21.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: UnstructuredDocument - 2.21.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_title_2_21_6-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_title_2_21_6-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_title_2_21_6-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: UnstructuredDocument - 2.21.6 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_legalAuthenticator_2_21_18-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_legalAuthenticator_2_21_18-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_legalAuthenticator_2_21_18-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: UnstructuredDocument - 2.21.18 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_setId_2_21_10-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_setId_2_21_10-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_setId_2_21_10-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: UnstructuredDocument - 2.21.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_confidentialityCode_2_21_8-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_confidentialityCode_2_21_8-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_confidentialityCode_2_21_8-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: UnstructuredDocument - 2.21.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: UnstructuredDocument - 2.21.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_2_UnstructuredDocument_componentOf_2_21_13-error_mdht" see="#p-UnstructuredDocument_2_UnstructuredDocument_componentOf_2_21_13-error_mdht" name="p-UnstructuredDocument_2_UnstructuredDocument_componentOf_2_21_13-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: GeneralHeaderConstraintsComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: UnstructuredDocument - 2.21.13 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:9955)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_dataEnterer_2_21_15-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_dataEnterer_2_21_15-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_dataEnterer_2_21_15-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: UnstructuredDocument - 2.21.15 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_custodian_2_21_6-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_custodian_2_21_6-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_custodian_2_21_6-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: UnstructuredDocumentCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: UnstructuredDocument - 2.21.6 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:7645)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_authenticator_2_21_19-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_authenticator_2_21_19-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_authenticator_2_21_19-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: UnstructuredDocument - 2.21.19 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_languageCode_2_21_9-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_languageCode_2_21_9-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_languageCode_2_21_9-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: UnstructuredDocument - 2.21.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: UnstructuredDocument - 2.21.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_templateId_2_21_1-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_templateId_2_21_1-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_templateId_2_21_1-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.10')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.10'">Error: UnstructuredDocument - 2.21.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:7710, CONF:10054 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.10&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_authorization_2_21_24-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_authorization_2_21_24-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_authorization_2_21_24-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: UnstructuredDocument - 2.21.24 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_typeId_2_21_3-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_typeId_2_21_3-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_typeId_2_21_3-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: UnstructuredDocument - 2.21.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_documentationOf_2_21_23-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_documentationOf_2_21_23-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_documentationOf_2_21_23-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->select(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOf
		-->
	<assert test="count(cda:documentationOf) &gt;= 0">Error: UnstructuredDocument - 2.21.23 documentationOf
		Conformance: MAY contain zero or more [0..*] documentationOf (CONF:14835)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_supportParticipant_2_21_21-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_supportParticipant_2_21_21-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_supportParticipant_2_21_21-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: UnstructuredDocument - 2.21.21 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocument_1A_UnstructuredDocument_inFulfillmentOf_2_21_22-error_mdht" see="#p-UnstructuredDocument_1A_UnstructuredDocument_inFulfillmentOf_2_21_22-error_mdht" name="p-UnstructuredDocument_1A_UnstructuredDocument_inFulfillmentOf_2_21_22-error_mdht">
		<!--
			UML path: /UnstructuredDocument
			UML root path: /UnstructuredDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: UnstructuredDocument - 2.21.22 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:9952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-UnstructuredDocument_1A_RecordTarget_patientRole2_2_21_3_i-error_mdht" see="#p-UnstructuredDocument_1A_RecordTarget_patientRole2_2_21_3_i-error_mdht" name="p-UnstructuredDocument_1A_RecordTarget_patientRole2_2_21_3_i-error_mdht">
		<!--
			UML path: /UnstructuredDocument/recordTarget
			UML root path: /UnstructuredDocument/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::UnstructuredDocument::RecordTarget::PatientRole2))
			Constraint name: UnstructuredDocumentRecordTargetPatientRole2
		-->
	<assert test="count(cda:patientRole)=1">Error: UnstructuredDocument - 2.21.3.i patientRole2
		Conformance: SHALL contain exactly one [1..1] patientRole
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole2 -->

<pattern id="p-UnstructuredDocument_1A_PatientRole2_id_2_21_3_i_a-error_mdht" see="#p-UnstructuredDocument_1A_PatientRole2_id_2_21_3_i_a-error_mdht" name="p-UnstructuredDocument_1A_PatientRole2_id_2_21_3_i_a-error_mdht">
		<!--
			UML path: /UnstructuredDocument/recordTarget/patientRole2
			UML root path: /UnstructuredDocument/recordTarget/patientRole2
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.id->size() = 1
			Constraint name: UnstructuredDocumentRecordTargetPatientRole2Id
		-->
	<assert test="count(cda:id) = 1">Error: UnstructuredDocument - 2.21.3.i.a id
		Conformance: SHALL contain exactly one [1..1] id (CONF:7643)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-UnstructuredDocument_1A_Author_assignedAuthor2_2_21_4_i-error_mdht" see="#p-UnstructuredDocument_1A_Author_assignedAuthor2_2_21_4_i-error_mdht" name="p-UnstructuredDocument_1A_Author_assignedAuthor2_2_21_4_i-error_mdht">
		<!--
			UML path: /UnstructuredDocument/author
			UML root path: /UnstructuredDocument/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::UnstructuredDocument::Author::AssignedAuthor2))
			Constraint name: UnstructuredDocumentAuthorAssignedAuthor2
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: UnstructuredDocument - 2.21.4.i assignedAuthor2
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:7640)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor2 -->

<pattern id="p-UnstructuredDocument_1A_AssignedAuthor2_addr_2_21_4_i_a-error_mdht" see="#p-UnstructuredDocument_1A_AssignedAuthor2_addr_2_21_4_i_a-error_mdht" name="p-UnstructuredDocument_1A_AssignedAuthor2_addr_2_21_4_i_a-error_mdht">
		<!--
			UML path: /UnstructuredDocument/author/assignedAuthor2
			UML root path: /UnstructuredDocument/author/assignedAuthor2
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: self.addr->size() = 1
			Constraint name: UnstructuredDocumentAuthorAssignedAuthor2Addr
		-->
	<assert test="count(cda:addr) = 1">Error: UnstructuredDocument - 2.21.4.i.a addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:7641)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor2 -->

<pattern id="p-UnstructuredDocument_1A_AssignedAuthor2_telecom_2_21_4_i_b-error_mdht" see="#p-UnstructuredDocument_1A_AssignedAuthor2_telecom_2_21_4_i_b-error_mdht" name="p-UnstructuredDocument_1A_AssignedAuthor2_telecom_2_21_4_i_b-error_mdht">
		<!--
			UML path: /UnstructuredDocument/author/assignedAuthor2
			UML root path: /UnstructuredDocument/author/assignedAuthor2
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: self.telecom->size() = 1
			Constraint name: UnstructuredDocumentAuthorAssignedAuthor2Telecom
		-->
	<assert test="count(cda:telecom) = 1">Error: UnstructuredDocument - 2.21.4.i.b telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:7642)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-UnstructuredDocument_1A_Custodian_assignedCustodian2_2_21_6_i-error_mdht" see="#p-UnstructuredDocument_1A_Custodian_assignedCustodian2_2_21_6_i-error_mdht" name="p-UnstructuredDocument_1A_Custodian_assignedCustodian2_2_21_6_i-error_mdht">
		<!--
			UML path: /UnstructuredDocument/custodian
			UML root path: /UnstructuredDocument/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::UnstructuredDocument::Custodian::AssignedCustodian3))
			Constraint name: UnstructuredDocumentCustodianAssignedCustodian2
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: UnstructuredDocument - 2.21.6.i assignedCustodian2
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:7645)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian3 -->

<pattern id="p-UnstructuredDocument_1A_AssignedCustodian3_custodianOrganization_2_21_6_i_a-error_mdht" see="#p-UnstructuredDocument_1A_AssignedCustodian3_custodianOrganization_2_21_6_i_a-error_mdht" name="p-UnstructuredDocument_1A_AssignedCustodian3_custodianOrganization_2_21_6_i_a-error_mdht">
		<!--
			UML path: /UnstructuredDocument/custodian/assignedCustodian2
			UML root path: /UnstructuredDocument/custodian/assignedCustodian2
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::UnstructuredDocument::Custodian::AssignedCustodian3::CustodianOrganization))
			Constraint name: UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: UnstructuredDocument - 2.21.6.i.a custodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:7645)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-UnstructuredDocument_1A_CustodianOrganization_id_2_21_6_i_a_2-error_mdht" see="#p-UnstructuredDocument_1A_CustodianOrganization_id_2_21_6_i_a_2-error_mdht" name="p-UnstructuredDocument_1A_CustodianOrganization_id_2_21_6_i_a_2-error_mdht">
		<!--
			UML path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
			UML root path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: self.id->size() = 1
			Constraint name: UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId
		-->
	<assert test="count(cda:id) = 1">Error: UnstructuredDocument - 2.21.6.i.a.2 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:7648)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-UnstructuredDocument_1A_CustodianOrganization_addr_2_21_6_i_a_1-error_mdht" see="#p-UnstructuredDocument_1A_CustodianOrganization_addr_2_21_6_i_a_1-error_mdht" name="p-UnstructuredDocument_1A_CustodianOrganization_addr_2_21_6_i_a_1-error_mdht">
		<!--
			UML path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
			UML root path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr
		-->
	<assert test="cda:addr">Error: UnstructuredDocument - 2.21.6.i.a.1 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:7651)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-UnstructuredDocument_1A_CustodianOrganization_telecom_2_21_6_i_a_4-error_mdht" see="#p-UnstructuredDocument_1A_CustodianOrganization_telecom_2_21_6_i_a_4-error_mdht" name="p-UnstructuredDocument_1A_CustodianOrganization_telecom_2_21_6_i_a_4-error_mdht">
		<!--
			UML path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
			UML root path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.telecom.oclIsUndefined()
			Constraint name: UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: UnstructuredDocument - 2.21.6.i.a.4 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:7650)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-UnstructuredDocument_1A_CustodianOrganization_name_2_21_6_i_a_3-error_mdht" see="#p-UnstructuredDocument_1A_CustodianOrganization_name_2_21_6_i_a_3-error_mdht" name="p-UnstructuredDocument_1A_CustodianOrganization_name_2_21_6_i_a_3-error_mdht">
		<!--
			UML path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
			UML root path: /UnstructuredDocument/custodian/assignedCustodian2/custodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.name.oclIsUndefined()
			Constraint name: UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName
		-->
	<assert test="cda:name">Error: UnstructuredDocument - 2.21.6.i.a.3 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:7649)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-UnstructuredDocument_1A_DataEnterer_assignedEntity_2_21_15_i-error_mdht" see="#p-UnstructuredDocument_1A_DataEnterer_assignedEntity_2_21_15_i-error_mdht" name="p-UnstructuredDocument_1A_DataEnterer_assignedEntity_2_21_15_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer
			UML root path: /GeneralHeaderConstraints/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: UnstructuredDocument - 2.21.15.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocument_1A_AssignedEntity_code_2_21_15_i_b-error_mdht" see="#p-UnstructuredDocument_1A_AssignedEntity_code_2_21_15_i_b-error_mdht" name="p-UnstructuredDocument_1A_AssignedEntity_code_2_21_15_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: UnstructuredDocument - 2.21.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: UnstructuredDocument - 2.21.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocument_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-UnstructuredDocument_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-UnstructuredDocument_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: UnstructuredDocument - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocument_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-UnstructuredDocument_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-UnstructuredDocument_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: UnstructuredDocument - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocument_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-UnstructuredDocument_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-UnstructuredDocument_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: UnstructuredDocument - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocument_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-UnstructuredDocument_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-UnstructuredDocument_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: UnstructuredDocument - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocument_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-UnstructuredDocument_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-UnstructuredDocument_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: UnstructuredDocument - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: UnstructuredDocument - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocument_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-UnstructuredDocument_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-UnstructuredDocument_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: UnstructuredDocument - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-UnstructuredDocument_1A_InformationRecipient_intendedRecipient_2_21_17_i-error_mdht" see="#p-UnstructuredDocument_1A_InformationRecipient_intendedRecipient_2_21_17_i-error_mdht" name="p-UnstructuredDocument_1A_InformationRecipient_intendedRecipient_2_21_17_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informationRecipient
			UML root path: /GeneralHeaderConstraints/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient))
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: UnstructuredDocument - 2.21.17.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:5566)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Informant -->

<pattern id="p-UnstructuredDocument_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_21_20_iii-error_mdht" see="#p-UnstructuredDocument_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_21_20_iii-error_mdht" name="p-UnstructuredDocument_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_21_20_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant
			UML root path: /GeneralHeaderConstraints/informant
		-->
	<rule context="/cda:ClinicalDocument/cda:informant">
		<!--
			OCL: self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity
		-->
	<assert test="not(cda:assignedEntity) or not(cda:relatedEntity)">Error: UnstructuredDocument - 2.21.20.iii GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity
		Conformance: SHALL satisfy: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity (CONF:8002)
		Analysis: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocument_1A_AssignedEntity_code_2_21_20_i_b-error_mdht" see="#p-UnstructuredDocument_1A_AssignedEntity_code_2_21_20_i_b-error_mdht" name="p-UnstructuredDocument_1A_AssignedEntity_code_2_21_20_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: UnstructuredDocument - 2.21.20.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9947)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: UnstructuredDocument - 2.21.20.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9947)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocument_1A_AssignedEntity_addr_2_21_20_i_c-error_mdht" see="#p-UnstructuredDocument_1A_AssignedEntity_addr_2_21_20_i_c-error_mdht" name="p-UnstructuredDocument_1A_AssignedEntity_addr_2_21_20_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: UnstructuredDocument - 2.21.20.i.c addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-UnstructuredDocument_1A_RelatedEntity_addr_2_21_20_ii_a-error_mdht" see="#p-UnstructuredDocument_1A_RelatedEntity_addr_2_21_20_ii_a-error_mdht" name="p-UnstructuredDocument_1A_RelatedEntity_addr_2_21_20_ii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/relatedEntity
			UML root path: /GeneralHeaderConstraints/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: UnstructuredDocument - 2.21.20.ii.a addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-UnstructuredDocument_1A_RelatedEntity_person_2_21_20_ii_b-error_mdht" see="#p-UnstructuredDocument_1A_RelatedEntity_person_2_21_20_ii_b-error_mdht" name="p-UnstructuredDocument_1A_RelatedEntity_person_2_21_20_ii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/relatedEntity
			UML root path: /GeneralHeaderConstraints/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: self.relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityPerson
		-->
	<assert test="count(cda:relatedPerson)=1">Error: UnstructuredDocument - 2.21.20.ii.b person
		Conformance: SHALL contain exactly one [1..1] relatedPerson (CONF:8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-UnstructuredDocument_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_21_21_ii-error_mdht" see="#p-UnstructuredDocument_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_21_21_ii-error_mdht" name="p-UnstructuredDocument_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_21_21_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/supportParticipant
			UML root path: /GeneralHeaderConstraints/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: UnstructuredDocument - 2.21.21.ii GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		Conformance: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity. (CONF:10006)
		Analysis: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-UnstructuredDocument_2_ComponentOf_encompassingEncounter_2_21_13_i-error_mdht" see="#p-UnstructuredDocument_2_ComponentOf_encompassingEncounter_2_21_13_i-error_mdht" name="p-UnstructuredDocument_2_ComponentOf_encompassingEncounter_2_21_13_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/componentOf
			UML root path: /GeneralHeaderConstraints/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::GeneralHeaderConstraints::ComponentOf::EncompassingEncounter))
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: UnstructuredDocument - 2.21.13.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:9956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-UnstructuredDocument_1A_DocumentationOf_serviceEvent_2_21_23_i-error_mdht" see="#p-UnstructuredDocument_1A_DocumentationOf_serviceEvent_2_21_23_i-error_mdht" name="p-UnstructuredDocument_1A_DocumentationOf_serviceEvent_2_21_23_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf
			UML root path: /GeneralHeaderConstraints/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: UnstructuredDocument - 2.21.23.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:14836)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-UnstructuredDocument_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_21_23_i_c-error_mdht" see="#p-UnstructuredDocument_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_21_23_i_c-error_mdht" name="p-UnstructuredDocument_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_21_23_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.effectiveTime->forAll(not low.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow
		-->
	<assert test="not(cda:effectiveTime[not(cda:low)])">Error: UnstructuredDocument - 2.21.23.i.c GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow
		Conformance: effectiveTime SHALL contain exactly one [1..1] low (CONF:14838, R2.1=CONF:1198-14838)
		Analysis: effectiveTime SHALL contain exactly one [1..1] low
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-UnstructuredDocument_1A_ServiceEvent_performer_2_21_23_i_b-error_mdht" see="#p-UnstructuredDocument_1A_ServiceEvent_performer_2_21_23_i_b-error_mdht" name="p-UnstructuredDocument_1A_ServiceEvent_performer_2_21_23_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: UnstructuredDocument - 2.21.23.i.b performer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:14839)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-UnstructuredDocument_1A_Performer1_functionCode_2_21_23_i_b_2-error_mdht" see="#p-UnstructuredDocument_1A_Performer1_functionCode_2_21_23_i_b_2-error_mdht" name="p-UnstructuredDocument_1A_Performer1_functionCode_2_21_23_i_b_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode">Error: UnstructuredDocument - 2.21.23.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.88')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode and cda:functionCode[@codeSystem = '2.16.840.1.113883.5.88']">Error: UnstructuredDocument - 2.21.23.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-UnstructuredDocument_1A_Performer1_assignedEntity_2_21_23_i_b_3-error_mdht" see="#p-UnstructuredDocument_1A_Performer1_assignedEntity_2_21_23_i_b_3-error_mdht" name="p-UnstructuredDocument_1A_Performer1_assignedEntity_2_21_23_i_b_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: UnstructuredDocument - 2.21.23.i.b.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:14841)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocument_1A_AssignedEntity_code_2_21_23_i_b_3_ii-error_mdht" see="#p-UnstructuredDocument_1A_AssignedEntity_code_2_21_23_i_b_3_ii-error_mdht" name="p-UnstructuredDocument_1A_AssignedEntity_code_2_21_23_i_b_3_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: UnstructuredDocument - 2.21.23.i.b.3.ii code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:14842), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:14843)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: UnstructuredDocument - 2.21.23.i.b.3.ii code
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
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian">Cannot find context /cda:ClinicalDocument/cda:custodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer">Cannot find context /cda:ClinicalDocument/cda:dataEnterer</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informant">Cannot find context /cda:ClinicalDocument/cda:informant</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_author_2_21_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_recordTarget_2_21_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_effectiveTime_2_21_7-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_code_2_21_5-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_informant_2_21_20-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_2_UnstructuredDocument_component_2_21_5-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_informationRecipient_2_21_17-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_id_2_21_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_versionNumber_2_21_11-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_realmCode_2_21_2-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_title_2_21_6-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_legalAuthenticator_2_21_18-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_setId_2_21_10-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_confidentialityCode_2_21_8-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_2_UnstructuredDocument_componentOf_2_21_13-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_dataEnterer_2_21_15-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_custodian_2_21_6-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_authenticator_2_21_19-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_languageCode_2_21_9-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_templateId_2_21_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_authorization_2_21_24-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_typeId_2_21_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_documentationOf_2_21_23-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_supportParticipant_2_21_21-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_UnstructuredDocument_inFulfillmentOf_2_21_22-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_RecordTarget_patientRole2_2_21_3_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_PatientRole2_id_2_21_3_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_Author_assignedAuthor2_2_21_4_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_AssignedAuthor2_addr_2_21_4_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_AssignedAuthor2_telecom_2_21_4_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_Custodian_assignedCustodian2_2_21_6_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_AssignedCustodian3_custodianOrganization_2_21_6_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_CustodianOrganization_id_2_21_6_i_a_2-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_CustodianOrganization_addr_2_21_6_i_a_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_CustodianOrganization_telecom_2_21_6_i_a_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_CustodianOrganization_name_2_21_6_i_a_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_DataEnterer_assignedEntity_2_21_15_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_AssignedEntity_code_2_21_15_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_InformationRecipient_intendedRecipient_2_21_17_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_21_20_iii-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_AssignedEntity_code_2_21_20_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_AssignedEntity_addr_2_21_20_i_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_RelatedEntity_addr_2_21_20_ii_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_RelatedEntity_person_2_21_20_ii_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_21_21_ii-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_2_ComponentOf_encompassingEncounter_2_21_13_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_DocumentationOf_serviceEvent_2_21_23_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_21_23_i_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_ServiceEvent_performer_2_21_23_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_Performer1_functionCode_2_21_23_i_b_2-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_Performer1_assignedEntity_2_21_23_i_b_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocument_1A_AssignedEntity_code_2_21_23_i_b_3_ii-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
