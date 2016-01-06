<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_2_USRealmHeader_componentOf_2_5_13-error_mdht" see="#p-USRealmHeader_2_USRealmHeader_componentOf_2_5_13-error_mdht" name="p-USRealmHeader_2_USRealmHeader_componentOf_2_5_13-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: GeneralHeaderConstraintsComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: USRealmHeader - 2.5.13 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:9955)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_5_15-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_5_15-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_5_15-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: USRealmHeader - 2.5.15 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_informant_2_5_20-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_informant_2_5_20-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_informant_2_5_20-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: USRealmHeader - 2.5.20 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:8001)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_recordTarget_2_5_12-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_recordTarget_2_5_12-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_recordTarget_2_5_12-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: USRealmHeader - 2.5.12 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_author_2_5_14-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_author_2_5_14-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_author_2_5_14-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: USRealmHeader - 2.5.14 author
		Conformance: SHALL contain at least one [1..*] author (CONF:5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_custodian_2_5_16-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_custodian_2_5_16-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_custodian_2_5_16-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: USRealmHeader - 2.5.16 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (iv., CONF:5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_authenticator_2_5_19-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_authenticator_2_5_19-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_authenticator_2_5_19-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: USRealmHeader - 2.5.19 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_documentationOf_2_5_23-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_documentationOf_2_5_23-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_documentationOf_2_5_23-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->select(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOf
		-->
	<assert test="count(cda:documentationOf) &gt;= 0">Error: USRealmHeader - 2.5.23 documentationOf
		Conformance: MAY contain zero or more [0..*] documentationOf (CONF:14835)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_typeId_2_5_3-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_typeId_2_5_3-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_typeId_2_5_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: USRealmHeader - 2.5.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_templateId_2_5_1-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_templateId_2_5_1-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_templateId_2_5_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.1'">Error: USRealmHeader - 2.5.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:5252, CONF:10036 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.1'">Error: USRealmHeader - 2.5.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:5252, CONF:10036 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.1&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_realmCode_2_5_2-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_realmCode_2_5_2-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_realmCode_2_5_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: USRealmHeader - 2.5.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: USRealmHeader - 2.5.2 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_5_8-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_5_8-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_5_8-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: USRealmHeader - 2.5.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC (CONF:5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: USRealmHeader - 2.5.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC (CONF:5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_code_2_5_5-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_code_2_5_5-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_code_2_5_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code">Error: USRealmHeader - 2.5.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:5253)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_languageCode_2_5_9-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_languageCode_2_5_9-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_languageCode_2_5_9-error_mdht">
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
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: USRealmHeader - 2.5.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: USRealmHeader - 2.5.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_setId_2_5_10-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_setId_2_5_10-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_setId_2_5_10-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: USRealmHeader - 2.5.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_title_2_5_6-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_title_2_5_6-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_title_2_5_6-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: USRealmHeader - 2.5.6 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_5_7-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_5_7-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_5_7-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: USRealmHeader - 2.5.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_5_27-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_5_27-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_5_27-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.setId.oclIsUndefined() implies not self.versionNumber.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsSetIdVersionNumber
		-->
	<assert test="not(cda:setId) or cda:versionNumber">Error: USRealmHeader - 2.5.27 GeneralHeaderConstraintsSetIdVersionNumber
		Conformance: If setId is present versionNumber SHALL be present (CONF:6380)
		Analysis: If setId is present versionNumber SHALL be present
		Validation message: n/a	</assert>
		<!--
			OCL: not self.versionNumber.oclIsUndefined() implies not self.setId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsVersionNumberSetId
		-->
	<assert test="not(cda:versionNumber) or cda:setId">Error: USRealmHeader - 2.5.27 GeneralHeaderConstraintsSetIdVersionNumber
		Conformance: If setId is present versionNumber SHALL be present (CONF:6380)
		Analysis: If versionNumber is present setId SHALL be present
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_versionNumber_2_5_11-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_versionNumber_2_5_11-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_versionNumber_2_5_11-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: USRealmHeader - 2.5.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_5_17-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_5_17-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_5_17-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: USRealmHeader - 2.5.17 informationRecipient
		Conformance: MAY contain zero or more [0..*] informationRecipient (CONF:5565)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_5_22-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_5_22-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_5_22-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: USRealmHeader - 2.5.22 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:9952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_5_21-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_5_21-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_5_21-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: USRealmHeader - 2.5.21 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_5_18-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_5_18-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_5_18-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: USRealmHeader - 2.5.18 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_id_2_5_4-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_id_2_5_4-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_id_2_5_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- GeneralHeaderConstraints: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeader_1A_USRealmHeader_authorization_2_5_24-error_mdht" see="#p-USRealmHeader_1A_USRealmHeader_authorization_2_5_24-error_mdht" name="p-USRealmHeader_1A_USRealmHeader_authorization_2_5_24-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints
			UML root path: /GeneralHeaderConstraints
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: USRealmHeader - 2.5.24 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-USRealmHeader_1A_RecordTarget_patientRole_2_5_12_i-error_mdht" see="#p-USRealmHeader_1A_RecordTarget_patientRole_2_5_12_i-error_mdht" name="p-USRealmHeader_1A_RecordTarget_patientRole_2_5_12_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget
			UML root path: /GeneralHeaderConstraints/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: USRealmHeader - 2.5.12.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader_1A_PatientRole_id_2_5_12_i_b-error_mdht" see="#p-USRealmHeader_1A_PatientRole_id_2_5_12_i_b-error_mdht" name="p-USRealmHeader_1A_PatientRole_id_2_5_12_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.12.i.b id
		Conformance: SHALL contain at least one [1..*] id (CONF:5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader_1A_PatientRole_telecom_2_5_12_i_c-error_mdht" see="#p-USRealmHeader_1A_PatientRole_telecom_2_5_12_i_c-error_mdht" name="p-USRealmHeader_1A_PatientRole_telecom_2_5_12_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
		-->
	<assert test="cda:telecom">Error: USRealmHeader - 2.5.12.i.c telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5280)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader_1A_PatientRole_providerOrganization_2_5_12_i_e-error_mdht" see="#p-USRealmHeader_1A_PatientRole_providerOrganization_2_5_12_i_e-error_mdht" name="p-USRealmHeader_1A_PatientRole_providerOrganization_2_5_12_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
		-->
	<assert test="count(cda:providerOrganization) &lt;= 1">Error: USRealmHeader - 2.5.12.i.e providerOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader_1A_PatientRole_addr_2_5_12_i_a-error_mdht" see="#p-USRealmHeader_1A_PatientRole_addr_2_5_12_i_a-error_mdht" name="p-USRealmHeader_1A_PatientRole_addr_2_5_12_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.12.i.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5271)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader_1A_PatientRole_patient_2_5_12_i_d-error_mdht" see="#p-USRealmHeader_1A_PatientRole_patient_2_5_12_i_d-error_mdht" name="p-USRealmHeader_1A_PatientRole_patient_2_5_12_i_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: USRealmHeader - 2.5.12.i.d patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_city_2_5_12_i_a_1-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_city_2_5_12_i_a_1-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_city_2_5_12_i_a_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: USRealmHeader - 2.5.12.i.a.1 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_country_2_5_12_i_a_2-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_country_2_5_12_i_a_2-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_country_2_5_12_i_a_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: USRealmHeader - 2.5.12.i.a.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_state_2_5_12_i_a_4-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_state_2_5_12_i_a_4-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_state_2_5_12_i_a_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: USRealmHeader - 2.5.12.i.a.4 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_streetAddressLine_2_5_12_i_a_5-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_streetAddressLine_2_5_12_i_a_5-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_streetAddressLine_2_5_12_i_a_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: USRealmHeader - 2.5.12.i.a.5 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_use_2_5_12_i_a_6-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_use_2_5_12_i_a_6-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_use_2_5_12_i_a_6-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and 
let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in 
value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP)) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUse
		-->
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: USRealmHeader - 2.5.12.i.a.6 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.12.i.a.6 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_5_12_i_a_7-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_5_12_i_a_7-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_5_12_i_a_7-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		-->
	<assert test="@nullFlavor or count(cda:streetAddressLine) &gt;= 1 and count(cda:streetAddressLine) &lt;= 4">Error: USRealmHeader - 2.5.12.i.a.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		Conformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291)
		Analysis: SHALL contain at least one and not more than 4 streetAddressLine
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeader_1A_USRealmAddress_postalCode_2_5_12_i_a_3-error_mdht" see="#p-USRealmHeader_1A_USRealmAddress_postalCode_2_5_12_i_a_3-error_mdht" name="p-USRealmHeader_1A_USRealmAddress_postalCode_2_5_12_i_a_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: USRealmHeader - 2.5.12.i.a.3 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_12_i_c_1-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_12_i_c_1-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_12_i_c_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.12.i.c.1 use
		Conformance: SHOULD contain zero or one [0..1] @use
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_guardian_2_5_12_i_d_9-error_mdht" see="#p-USRealmHeader_1A_Patient_guardian_2_5_12_i_d_9-error_mdht" name="p-USRealmHeader_1A_Patient_guardian_2_5_12_i_d_9-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: USRealmHeader - 2.5.12.i.d.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_ethnicGroupCode_2_5_12_i_d_3-error_mdht" see="#p-USRealmHeader_1A_Patient_ethnicGroupCode_2_5_12_i_d_3-error_mdht" name="p-USRealmHeader_1A_Patient_ethnicGroupCode_2_5_12_i_d_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode">Error: USRealmHeader - 2.5.12.i.d.3 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.ethnicGroupCode.oclIsUndefined()) and self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined() and self.ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.ethnicGroupCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode
		-->
	<assert test="not(cda:ethnicGroupCode and not(cda:ethnicGroupCode/@nullFlavor)) or cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: USRealmHeader - 2.5.12.i.d.3 ethnicGroupCode
		Conformance: MAY contain zero or one [0..1] ethnicGroupCode, which SHALL be selected from ValueSet Ethnicity Value Set 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_sDTCRaceCode_2_5_12_i_d_8-error_mdht" see="#p-USRealmHeader_1A_Patient_sDTCRaceCode_2_5_12_i_d_8-error_mdht" name="p-USRealmHeader_1A_Patient_sDTCRaceCode_2_5_12_i_d_8-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or ext:sDTCRaceCode">Error: USRealmHeader - 2.5.12.i.d.8 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or not(ext:sDTCRaceCode[not(. and @codeSystem = '2.16.840.1.113883.6.238' and @code)])">Error: USRealmHeader - 2.5.12.i.d.8 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_languageCommunication_2_5_12_i_d_11-error_mdht" see="#p-USRealmHeader_1A_Patient_languageCommunication_2_5_12_i_d_11-error_mdht" name="p-USRealmHeader_1A_Patient_languageCommunication_2_5_12_i_d_11-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: USRealmHeader - 2.5.12.i.d.11 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_religiousAffiliationCode_2_5_12_i_d_7-error_mdht" see="#p-USRealmHeader_1A_Patient_religiousAffiliationCode_2_5_12_i_d_7-error_mdht" name="p-USRealmHeader_1A_Patient_religiousAffiliationCode_2_5_12_i_d_7-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode">Error: USRealmHeader - 2.5.12.i.d.7 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode and cda:religiousAffiliationCode[@codeSystem = '2.16.840.1.113883.5.1076' and @code]">Error: USRealmHeader - 2.5.12.i.d.7 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode (CONF:5317), which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_name_2_5_12_i_d_5-error_mdht" see="#p-USRealmHeader_1A_Patient_name_2_5_12_i_d_5-error_mdht" name="p-USRealmHeader_1A_Patient_name_2_5_12_i_d_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.12.i.d.5 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_5_12_i_d_12-error_mdht" see="#p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_5_12_i_d_12-error_mdht" name="p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_5_12_i_d_12-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: sDTCRaceCode->notEmpty() implies not raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode) or cda:raceCode">Error: USRealmHeader - 2.5.12.i.d.12 GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode
		Conformance: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode (CONF:31347)
		Analysis: If sdtc:raceCode is present, then the patient SHALL contain [1..1] raceCode
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_raceCode_2_5_12_i_d_6-error_mdht" see="#p-USRealmHeader_1A_Patient_raceCode_2_5_12_i_d_6-error_mdht" name="p-USRealmHeader_1A_Patient_raceCode_2_5_12_i_d_6-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode">Error: USRealmHeader - 2.5.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.raceCode.oclIsUndefined()) and self.raceCode.isNullFlavorUndefined()) implies (not self.raceCode.oclIsUndefined() and self.raceCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode
		-->
	<assert test="not(cda:raceCode and not(cda:raceCode/@nullFlavor)) or cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and @code]">Error: USRealmHeader - 2.5.12.i.d.6 raceCode
		Conformance: SHOULD contain zero or one [0..1] raceCode, which SHALL be selected from ValueSet Race Value Set 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_birthplace_2_5_12_i_d_10-error_mdht" see="#p-USRealmHeader_1A_Patient_birthplace_2_5_12_i_d_10-error_mdht" name="p-USRealmHeader_1A_Patient_birthplace_2_5_12_i_d_10-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: USRealmHeader - 2.5.12.i.d.10 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_birthTime_2_5_12_i_d_2-error_mdht" see="#p-USRealmHeader_1A_Patient_birthTime_2_5_12_i_d_2-error_mdht" name="p-USRealmHeader_1A_Patient_birthTime_2_5_12_i_d_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: USRealmHeader - 2.5.12.i.d.2 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_maritalStatusCode_2_5_12_i_d_4-error_mdht" see="#p-USRealmHeader_1A_Patient_maritalStatusCode_2_5_12_i_d_4-error_mdht" name="p-USRealmHeader_1A_Patient_maritalStatusCode_2_5_12_i_d_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode">Error: USRealmHeader - 2.5.12.i.d.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode and cda:maritalStatusCode[@codeSystem = '2.16.840.1.113883.5.2' and (@code = 'A' or @code = 'D' or @code = 'I' or @code = 'L' or @code = 'M' or @code = 'P' or @code = 'S' or @code = 'T' or @code = 'W')]">Error: USRealmHeader - 2.5.12.i.d.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode (CONF:5303), which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 STATIC 1
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader_1A_Patient_administrativeGenderCode_2_5_12_i_d_1-error_mdht" see="#p-USRealmHeader_1A_Patient_administrativeGenderCode_2_5_12_i_d_1-error_mdht" name="p-USRealmHeader_1A_Patient_administrativeGenderCode_2_5_12_i_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
		-->
	<assert test="true()">Error: USRealmHeader - 2.5.12.i.d.1 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
		-->
	<assert test="cda:administrativeGenderCode and cda:administrativeGenderCode[@codeSystem = '2.16.840.1.113883.5.1' and (@code = 'F' or @code = 'M' or @code = 'UN')]">Error: USRealmHeader - 2.5.12.i.d.1 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-USRealmHeader_1A_TS_value_2_5_12_i_d_2_i-error_mdht" see="#p-USRealmHeader_1A_TS_value_2_5_12_i_d_2_i-error_mdht" name="p-USRealmHeader_1A_TS_value_2_5_12_i_d_2_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.value.oclIsUndefined() ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or @value">Error: USRealmHeader - 2.5.12.i.d.2.i value
		Conformance: SHALL contain exactly one [1..1] value (CONF:5299, CONF:5300)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_prefix_2_5_12_i_d_5_iii-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_prefix_2_5_12_i_d_5_iii-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_prefix_2_5_12_i_d_5_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: USRealmHeader - 2.5.12.i.d.5.iii prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: USRealmHeader - 2.5 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT contain any mixed content other than whitespace
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_suffix_2_5_12_i_d_5_iv-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_suffix_2_5_12_i_d_5_iv-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_suffix_2_5_12_i_d_5_iv-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: USRealmHeader - 2.5.12.i.d.5.iv suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_family_2_5_12_i_d_5_i-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_family_2_5_12_i_d_5_i-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_family_2_5_12_i_d_5_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: USRealmHeader - 2.5.12.i.d.5.i family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, CONF:7160)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_given_2_5_12_i_d_5_ii-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_given_2_5_12_i_d_5_ii-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_given_2_5_12_i_d_5_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: USRealmHeader - 2.5.12.i.d.5.ii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeader_1A_USRealmPatientName_use_2_5_12_i_d_5_v-error_mdht" see="#p-USRealmHeader_1A_USRealmPatientName_use_2_5_12_i_d_5_v-error_mdht" name="p-USRealmHeader_1A_USRealmPatientName_use_2_5_12_i_d_5_v-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::EntityNameUse) and 
let value : vocab::EntityNameUse = element.oclAsType(vocab::EntityNameUse) in 
value = vocab::EntityNameUse::A or value = vocab::EntityNameUse::ABC or value = vocab::EntityNameUse::ASGN or value = vocab::EntityNameUse::C or value = vocab::EntityNameUse::I or value = vocab::EntityNameUse::IDE or value = vocab::EntityNameUse::L or value = vocab::EntityNameUse::P or value = vocab::EntityNameUse::PHON or value = vocab::EntityNameUse::R or value = vocab::EntityNameUse::SNDX or value = vocab::EntityNameUse::SRCH or value = vocab::EntityNameUse::SYL)) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUse
		-->
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: USRealmHeader - 2.5.12.i.d.5.v use
		Conformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.12.i.d.5.v use
		Conformance: MAY contain zero or one [0..1] @use (CONF:7154), which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_telecom_2_5_12_i_d_9_iii-error_mdht" see="#p-USRealmHeader_1A_Guardian_telecom_2_5_12_i_d_9_iii-error_mdht" name="p-USRealmHeader_1A_Guardian_telecom_2_5_12_i_d_9_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: USRealmHeader - 2.5.12.i.d.9.iii telecom
		Conformance: MAY contain zero or more [0..*] telecom
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_addr_2_5_12_i_d_9_i-error_mdht" see="#p-USRealmHeader_1A_Guardian_addr_2_5_12_i_d_9_i-error_mdht" name="p-USRealmHeader_1A_Guardian_addr_2_5_12_i_d_9_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: USRealmHeader - 2.5.12.i.d.9.i addr
		Conformance: SHOULD contain zero or more [0..*] addr
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_5_12_i_d_9_v-error_mdht" see="#p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_5_12_i_d_9_v-error_mdht" name="p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_5_12_i_d_9_v-error_mdht">
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
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code[@codeSystem = '2.16.840.1.113883.5.111' and (@code = 'ADOPT' or @code = 'AUNT' or @code = 'CHILD' or @code = 'CHLDINLAW' or @code = 'COUSN' or @code = 'DOMPART' or @code = 'FAMMEMB' or @code = 'CHLDFOST' or @code = 'GRNDCHILD' or @code = 'GPARNT' or @code = 'GRPRN' or @code = 'GGRPRN' or @code = 'HSIB' or @code = 'MAUNT' or @code = 'MCOUSN' or @code = 'MGRPRN' or @code = 'MGGRPRN' or @code = 'MUNCLE' or @code = 'NCHILD' or @code = 'NPRN' or @code = 'NSIB' or @code = 'NBOR' or @code = 'NIENEPH' or @code = 'PRN' or @code = 'PRNINLAW' or @code = 'PAUNT' or @code = 'PCOUSN' or @code = 'PGRPRN' or @code = 'PGGRPRN' or @code = 'PUNCLE' or @code = 'ROOM' or @code = 'SIB' or @code = 'SIBINLAW' or @code = 'SIGOTHR' or @code = 'SPS' or @code = 'STEP' or @code = 'STPPRN' or @code = 'STPSIB' or @code = 'UNCLE' or @code = 'FRND' or @code = 'RESPRSN' or @code = 'EXCEST' or @code = 'GUADLTM' or @code = 'GUARD' or @code = 'POWATT' or @code = 'DPOWATT' or @code = 'HPOWATT' or @code = 'SPOWATT')]">Error: USRealmHeader - 2.5.12.i.d.9.v GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty
		Conformance: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC (CONF:5326)
		Analysis: The guardian code, if present, SHALL be selected from ValueSet PersonalRelationshipRoleType 2.16.840.1.113883.1.11.19563 DYNAMIC or ValueSet Responsible Party 2.16.840.1.113883.1.11.19830 DYNAMIC
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_guardianPerson_2_5_12_i_d_9_iv-error_mdht" see="#p-USRealmHeader_1A_Guardian_guardianPerson_2_5_12_i_d_9_iv-error_mdht" name="p-USRealmHeader_1A_Guardian_guardianPerson_2_5_12_i_d_9_iv-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::Person))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson
		-->
	<assert test="count(cda:guardianPerson)=1">Error: USRealmHeader - 2.5.12.i.d.9.iv guardianPerson
		Conformance: SHALL contain exactly one [1..1] guardianPerson
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader_1A_Guardian_code_2_5_12_i_d_9_ii-error_mdht" see="#p-USRealmHeader_1A_Guardian_code_2_5_12_i_d_9_ii-error_mdht" name="p-USRealmHeader_1A_Guardian_code_2_5_12_i_d_9_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.12.i.d.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_12_i_d_9_iii_a-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_12_i_d_9_iii_a-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeader_1A_Person_name_2_5_12_i_d_9_iv_a-error_mdht" see="#p-USRealmHeader_1A_Person_name_2_5_12_i_d_9_iv_a-error_mdht" name="p-USRealmHeader_1A_Person_name_2_5_12_i_d_9_iv_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/guardianPerson
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/guardianPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.12.i.d.9.iv.a name
		Conformance: SHALL contain at least one [1..*] name
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-USRealmHeader_1A_Birthplace_place_2_5_12_i_d_10_i-error_mdht" see="#p-USRealmHeader_1A_Birthplace_place_2_5_12_i_d_10_i-error_mdht" name="p-USRealmHeader_1A_Birthplace_place_2_5_12_i_d_10_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: USRealmHeader - 2.5.12.i.d.10.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-USRealmHeader_1A_Place_addr_2_5_12_i_d_10_i_a-error_mdht" see="#p-USRealmHeader_1A_Place_addr_2_5_12_i_d_10_i_a-error_mdht" name="p-USRealmHeader_1A_Place_addr_2_5_12_i_d_10_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.12.i.d.10.i.a addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5397)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_5_12_i_d_11_i-error_mdht" see="#p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_5_12_i_d_11_i-error_mdht" name="p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_5_12_i_d_11_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: USRealmHeader - 2.5.12.i.d.11.i preferenceInd
		Conformance: MAY contain zero or one [0..1] preferenceInd (CONF:5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeader_1A_LanguageCommunication_languageCode_2_5_12_i_d_11_iv-error_mdht" see="#p-USRealmHeader_1A_LanguageCommunication_languageCode_2_5_12_i_d_11_iv-error_mdht" name="p-USRealmHeader_1A_LanguageCommunication_languageCode_2_5_12_i_d_11_iv-error_mdht">
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
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: USRealmHeader - 2.5.12.i.d.11.iv languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: USRealmHeader - 2.5.12.i.d.11.iv languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeader_1A_LanguageCommunication_proficiencyLevelCode_2_5_12_i_d_11_ii-error_mdht" see="#p-USRealmHeader_1A_LanguageCommunication_proficiencyLevelCode_2_5_12_i_d_11_ii-error_mdht" name="p-USRealmHeader_1A_LanguageCommunication_proficiencyLevelCode_2_5_12_i_d_11_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode">Error: USRealmHeader - 2.5.12.i.d.11.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 STATIC (CONF:9965)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined() and self.proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.proficiencyLevelCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode and cda:proficiencyLevelCode[@codeSystem = '2.16.840.1.113883.5.61' and (@code = 'E' or @code = 'F' or @code = 'G' or @code = 'P')]">Error: USRealmHeader - 2.5.12.i.d.11.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 STATIC (CONF:9965)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeader_1A_LanguageCommunication_modeCode_2_5_12_i_d_11_iii-error_mdht" see="#p-USRealmHeader_1A_LanguageCommunication_modeCode_2_5_12_i_d_11_iii-error_mdht" name="p-USRealmHeader_1A_LanguageCommunication_modeCode_2_5_12_i_d_11_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode">Error: USRealmHeader - 2.5.12.i.d.11.iii modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode and cda:modeCode[@codeSystem = '2.16.840.1.113883.5.60' and (@code = 'ESGN' or @code = 'ESP' or @code = 'EWR' or @code = 'RSGN' or @code = 'RSP' or @code = 'RWR')]">Error: USRealmHeader - 2.5.12.i.d.11.iii modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeader_1A_ProviderOrganization_name_2_5_12_i_e_3-error_mdht" see="#p-USRealmHeader_1A_ProviderOrganization_name_2_5_12_i_e_3-error_mdht" name="p-USRealmHeader_1A_ProviderOrganization_name_2_5_12_i_e_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.12.i.e.3 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeader_1A_ProviderOrganization_telecom_2_5_12_i_e_4-error_mdht" see="#p-USRealmHeader_1A_ProviderOrganization_telecom_2_5_12_i_e_4-error_mdht" name="p-USRealmHeader_1A_ProviderOrganization_telecom_2_5_12_i_e_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: USRealmHeader - 2.5.12.i.e.4 telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5420)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeader_1A_ProviderOrganization_id_2_5_12_i_e_2-error_mdht" see="#p-USRealmHeader_1A_ProviderOrganization_id_2_5_12_i_e_2-error_mdht" name="p-USRealmHeader_1A_ProviderOrganization_id_2_5_12_i_e_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.12.i.e.2 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5417)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeader_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_5_12_i_e_5-error_mdht" see="#p-USRealmHeader_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_5_12_i_e_5-error_mdht" name="p-USRealmHeader_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_5_12_i_e_5-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: USRealmHeader - 2.5.12.i.e.5 GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		Conformance: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996) (CONF:9996)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeader_1A_ProviderOrganization_addr_2_5_12_i_e_1-error_mdht" see="#p-USRealmHeader_1A_ProviderOrganization_addr_2_5_12_i_e_1-error_mdht" name="p-USRealmHeader_1A_ProviderOrganization_addr_2_5_12_i_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.12.i.e.1 addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_12_i_e_4_i-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_12_i_e_4_i-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_12_i_e_4_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/providerOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.12.i.e.4.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7994)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_5_13_i-error_mdht" see="#p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_5_13_i-error_mdht" name="p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_5_13_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/componentOf
			UML root path: /GeneralHeaderConstraints/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::GeneralHeaderConstraints::ComponentOf::EncompassingEncounter))
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: USRealmHeader - 2.5.13.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:9956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-USRealmHeader_2_EncompassingEncounter_id_2_5_13_i_b-error_mdht" see="#p-USRealmHeader_2_EncompassingEncounter_id_2_5_13_i_b-error_mdht" name="p-USRealmHeader_2_EncompassingEncounter_id_2_5_13_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/componentOf/encompassingEncounter
			UML root path: /GeneralHeaderConstraints/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.13.i.b id
		Conformance: SHALL contain at least one [1..*] id (CONF:9959)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-USRealmHeader_2_EncompassingEncounter_effectiveTime_2_5_13_i_a-error_mdht" see="#p-USRealmHeader_2_EncompassingEncounter_effectiveTime_2_5_13_i_a-error_mdht" name="p-USRealmHeader_2_EncompassingEncounter_effectiveTime_2_5_13_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/componentOf/encompassingEncounter
			UML root path: /GeneralHeaderConstraints/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: USRealmHeader - 2.5.13.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:9958)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-USRealmHeader_1A_Author_assignedAuthor_2_5_14_ii-error_mdht" see="#p-USRealmHeader_1A_Author_assignedAuthor_2_5_14_ii-error_mdht" name="p-USRealmHeader_1A_Author_assignedAuthor_2_5_14_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author
			UML root path: /GeneralHeaderConstraints/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::GeneralHeaderConstraints::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: USRealmHeader - 2.5.14.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-USRealmHeader_1A_Author_time_2_5_14_i-error_mdht" see="#p-USRealmHeader_1A_Author_time_2_5_14_i-error_mdht" name="p-USRealmHeader_1A_Author_time_2_5_14_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author
			UML root path: /GeneralHeaderConstraints/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorTime
		-->
	<assert test="cda:time">Error: USRealmHeader - 2.5.14.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5445)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeader_1A_AssignedAuthor_addr_2_5_14_ii_a-error_mdht" see="#p-USRealmHeader_1A_AssignedAuthor_addr_2_5_14_ii_a-error_mdht" name="p-USRealmHeader_1A_AssignedAuthor_addr_2_5_14_ii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.14.ii.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5452)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeader_1A_AssignedAuthor_id_2_5_14_ii_c-error_mdht" see="#p-USRealmHeader_1A_AssignedAuthor_id_2_5_14_ii_c-error_mdht" name="p-USRealmHeader_1A_AssignedAuthor_id_2_5_14_ii_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.14.ii.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeader_1A_AssignedAuthor_code_2_5_14_ii_b-error_mdht" see="#p-USRealmHeader_1A_AssignedAuthor_code_2_5_14_ii_b-error_mdht" name="p-USRealmHeader_1A_AssignedAuthor_code_2_5_14_ii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: USRealmHeader - 2.5.14.ii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:16787), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16788)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeader_1A_AssignedAuthor_telecom_2_5_14_ii_d-error_mdht" see="#p-USRealmHeader_1A_AssignedAuthor_telecom_2_5_14_ii_d-error_mdht" name="p-USRealmHeader_1A_AssignedAuthor_telecom_2_5_14_ii_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTelecom
		-->
	<assert test="cda:telecom">Error: USRealmHeader - 2.5.14.ii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_14_ii_d_1-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_14_ii_d_1-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_14_ii_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/telecom
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.14.ii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-USRealmHeader_1A_AuthoringDevice_softwareName_2_5_14_ii_e_2-error_mdht" see="#p-USRealmHeader_1A_AuthoringDevice_softwareName_2_5_14_ii_e_2-error_mdht" name="p-USRealmHeader_1A_AuthoringDevice_softwareName_2_5_14_ii_e_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.softwareName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
		-->
	<assert test="cda:softwareName">Error: USRealmHeader - 2.5.14.ii.e.2 softwareName
		Conformance: SHALL contain exactly one [1..1] softwareName (CONF:16785)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-USRealmHeader_1A_AuthoringDevice_manufacturerModelName_2_5_14_ii_e_1-error_mdht" see="#p-USRealmHeader_1A_AuthoringDevice_manufacturerModelName_2_5_14_ii_e_1-error_mdht" name="p-USRealmHeader_1A_AuthoringDevice_manufacturerModelName_2_5_14_ii_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.manufacturerModelName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
		-->
	<assert test="cda:manufacturerModelName">Error: USRealmHeader - 2.5.14.ii.e.1 manufacturerModelName
		Conformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeader_1A_Person_name_2_5_14_ii_f_1-error_mdht" see="#p-USRealmHeader_1A_Person_name_2_5_14_ii_f_1-error_mdht" name="p-USRealmHeader_1A_Person_name_2_5_14_ii_f_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/author/assignedAuthor/assignedPerson
			UML root path: /GeneralHeaderConstraints/author/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorPersonName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.14.ii.f.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:16789)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-USRealmHeader_1A_DataEnterer_assignedEntity_2_5_15_i-error_mdht" see="#p-USRealmHeader_1A_DataEnterer_assignedEntity_2_5_15_i-error_mdht" name="p-USRealmHeader_1A_DataEnterer_assignedEntity_2_5_15_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer
			UML root path: /GeneralHeaderConstraints/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: USRealmHeader - 2.5.15.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_id_2_5_15_i_c-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_id_2_5_15_i_c-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_id_2_5_15_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.15.i.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5443)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_telecom_2_5_15_i_d-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_telecom_2_5_15_i_d-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_telecom_2_5_15_i_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: USRealmHeader - 2.5.15.i.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5466)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_5_15_i_b-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_5_15_i_b-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_5_15_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: USRealmHeader - 2.5.15.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9944)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_addr_2_5_15_i_a-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_addr_2_5_15_i_a-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_addr_2_5_15_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.15.i.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_15_i_e-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_15_i_e-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_15_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: USRealmHeader - 2.5.15.i.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_ProviderOrganization_2_5_12_i_e-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_ProviderOrganization_2_5_12_i_e-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_ProviderOrganization_2_5_12_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: USRealmHeader - 2.5.12.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)
		Analysis: id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_15_i_d_1-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_15_i_d_1-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_15_i_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/telecom
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.15.i.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeader_1A_Person_name_2_5_15_i_e_1-error_mdht" see="#p-USRealmHeader_1A_Person_name_2_5_15_i_e_1-error_mdht" name="p-USRealmHeader_1A_Person_name_2_5_15_i_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/assignedPerson
			UML root path: /GeneralHeaderConstraints/dataEnterer/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.15.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-USRealmHeader_1A_Custodian_assignedCustodian_2_5_16_i-error_mdht" see="#p-USRealmHeader_1A_Custodian_assignedCustodian_2_5_16_i-error_mdht" name="p-USRealmHeader_1A_Custodian_assignedCustodian_2_5_16_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian
			UML root path: /GeneralHeaderConstraints/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: USRealmHeader - 2.5.16.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:5520)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-USRealmHeader_1A_AssignedCustodian_representedCustodianOrganization_2_5_16_i_a-error_mdht" see="#p-USRealmHeader_1A_AssignedCustodian_representedCustodianOrganization_2_5_16_i_a-error_mdht" name="p-USRealmHeader_1A_AssignedCustodian_representedCustodianOrganization_2_5_16_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: USRealmHeader - 2.5.16.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:5521)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeader_1A_CustodianOrganization_ProviderOrganization_2_5_12_i_e-error_mdht" see="#p-USRealmHeader_1A_CustodianOrganization_ProviderOrganization_2_5_12_i_e-error_mdht" name="p-USRealmHeader_1A_CustodianOrganization_ProviderOrganization_2_5_12_i_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: USRealmHeader - 2.5.12.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416)
		Analysis: The id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeader_1A_CustodianOrganization_addr_2_5_16_i_a_1-error_mdht" see="#p-USRealmHeader_1A_CustodianOrganization_addr_2_5_16_i_a_1-error_mdht" name="p-USRealmHeader_1A_CustodianOrganization_addr_2_5_16_i_a_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.16.i.a.1 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5559)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeader_1A_CustodianOrganization_id_2_5_16_i_a_2-error_mdht" see="#p-USRealmHeader_1A_CustodianOrganization_id_2_5_16_i_a_2-error_mdht" name="p-USRealmHeader_1A_CustodianOrganization_id_2_5_16_i_a_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.16.i.a.2 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5522)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeader_1A_CustodianOrganization_telecom_2_5_16_i_a_4-error_mdht" see="#p-USRealmHeader_1A_CustodianOrganization_telecom_2_5_16_i_a_4-error_mdht" name="p-USRealmHeader_1A_CustodianOrganization_telecom_2_5_16_i_a_4-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.telecom.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: USRealmHeader - 2.5.16.i.a.4 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:5525)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeader_1A_CustodianOrganization_name_2_5_16_i_a_3-error_mdht" see="#p-USRealmHeader_1A_CustodianOrganization_name_2_5_16_i_a_3-error_mdht" name="p-USRealmHeader_1A_CustodianOrganization_name_2_5_16_i_a_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.name.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.16.i.a.3 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5524)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_16_i_a_4_i-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_16_i_a_4_i-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_16_i_a_4_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization/telecom
			UML root path: /GeneralHeaderConstraints/custodian/assignedCustodian/representedCustodianOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.16.i.a.4.i use
		Conformance: SHOULD contain zero or one [0..1] @use
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_5_17_i-error_mdht" see="#p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_5_17_i-error_mdht" name="p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_5_17_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informationRecipient
			UML root path: /GeneralHeaderConstraints/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient))
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: USRealmHeader - 2.5.17.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:5566)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-USRealmHeader_1A_IntendedRecipient_receivedOrganization_2_5_17_i_b-error_mdht" see="#p-USRealmHeader_1A_IntendedRecipient_receivedOrganization_2_5_17_i_b-error_mdht" name="p-USRealmHeader_1A_IntendedRecipient_receivedOrganization_2_5_17_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
			UML root path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.receivedOrganization->select(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Organization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientReceivedOrganization
		-->
	<assert test="count(cda:receivedOrganization) &lt;= 1">Error: USRealmHeader - 2.5.17.i.b receivedOrganization
		Conformance: MAY contain zero or one [0..1] receivedOrganization (CONF:5577)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-USRealmHeader_1A_IntendedRecipient_informationRecipient_2_5_17_i_a-error_mdht" see="#p-USRealmHeader_1A_IntendedRecipient_informationRecipient_2_5_17_i_a-error_mdht" name="p-USRealmHeader_1A_IntendedRecipient_informationRecipient_2_5_17_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
			UML root path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Person))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &lt;= 1">Error: USRealmHeader - 2.5.17.i.a informationRecipient
		Conformance: MAY contain zero or one [0..1] informationRecipient (CONF:5568)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeader_1A_Person_name_2_5_17_i_a_1-error_mdht" see="#p-USRealmHeader_1A_Person_name_2_5_17_i_a_1-error_mdht" name="p-USRealmHeader_1A_Person_name_2_5_17_i_a_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient/informationRecipient
			UML root path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.17.i.a.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Organization -->

<pattern id="p-USRealmHeader_1A_Organization_name_2_5_17_i_b_1-error_mdht" see="#p-USRealmHeader_1A_Organization_name_2_5_17_i_b_1-error_mdht" name="p-USRealmHeader_1A_Organization_name_2_5_17_i_b_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient/receivedOrganization
			UML root path: /GeneralHeaderConstraints/informationRecipient/intendedRecipient/receivedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">
		<!--
			OCL: self.name->size() = 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName
		-->
	<assert test="count(cda:name) = 1">Error: USRealmHeader - 2.5.17.i.b.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5578)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeader_1A_LegalAuthenticator_assignedEntity_2_5_18_iii-error_mdht" see="#p-USRealmHeader_1A_LegalAuthenticator_assignedEntity_2_5_18_iii-error_mdht" name="p-USRealmHeader_1A_LegalAuthenticator_assignedEntity_2_5_18_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator
			UML root path: /GeneralHeaderConstraints/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: USRealmHeader - 2.5.18.iii assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeader_1A_LegalAuthenticator_time_2_5_18_i-error_mdht" see="#p-USRealmHeader_1A_LegalAuthenticator_time_2_5_18_i-error_mdht" name="p-USRealmHeader_1A_LegalAuthenticator_time_2_5_18_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator
			UML root path: /GeneralHeaderConstraints/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorTime
		-->
	<assert test="cda:time">Error: USRealmHeader - 2.5.18.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5580)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeader_1A_LegalAuthenticator_signatureCode_2_5_18_ii-error_mdht" see="#p-USRealmHeader_1A_LegalAuthenticator_signatureCode_2_5_18_ii-error_mdht" name="p-USRealmHeader_1A_LegalAuthenticator_signatureCode_2_5_18_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator
			UML root path: /GeneralHeaderConstraints/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: USRealmHeader - 2.5.18.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5583, CONF:5584)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: USRealmHeader - 2.5.18.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5583, CONF:5584)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_id_2_5_18_iii_c-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_id_2_5_18_iii_c-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_id_2_5_18_iii_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.18.iii.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5586)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_addr_2_5_18_iii_a-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_addr_2_5_18_iii_a-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_addr_2_5_18_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.18.iii.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_telecom_2_5_18_iii_d-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_telecom_2_5_18_iii_d-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_telecom_2_5_18_iii_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: USRealmHeader - 2.5.18.iii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5595)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_18_iii_e-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_18_iii_e-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_18_iii_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: USRealmHeader - 2.5.18.iii.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_5_18_iii_b-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_5_18_iii_b-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_5_18_iii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.18.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:17000), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: USRealmHeader - 2.5.18.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:17000), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_18_iii_d_1-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_18_iii_d_1-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_18_iii_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/telecom
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.18.iii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeader_1A_Person_name_2_5_18_iii_e_1-error_mdht" see="#p-USRealmHeader_1A_Person_name_2_5_18_iii_e_1-error_mdht" name="p-USRealmHeader_1A_Person_name_2_5_18_iii_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/assignedPerson
			UML root path: /GeneralHeaderConstraints/legalAuthenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.18.iii.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5598)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeader_1A_Authenticator_assignedEntity_2_5_19_iii-error_mdht" see="#p-USRealmHeader_1A_Authenticator_assignedEntity_2_5_19_iii-error_mdht" name="p-USRealmHeader_1A_Authenticator_assignedEntity_2_5_19_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator
			UML root path: /GeneralHeaderConstraints/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: USRealmHeader - 2.5.19.iii assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5612)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeader_1A_Authenticator_time_2_5_19_i-error_mdht" see="#p-USRealmHeader_1A_Authenticator_time_2_5_19_i-error_mdht" name="p-USRealmHeader_1A_Authenticator_time_2_5_19_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator
			UML root path: /GeneralHeaderConstraints/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorTime
		-->
	<assert test="cda:time">Error: USRealmHeader - 2.5.19.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5608)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeader_1A_Authenticator_signatureCode_2_5_19_ii-error_mdht" see="#p-USRealmHeader_1A_Authenticator_signatureCode_2_5_19_ii-error_mdht" name="p-USRealmHeader_1A_Authenticator_signatureCode_2_5_19_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator
			UML root path: /GeneralHeaderConstraints/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCodeP
		-->
	<assert test="true()">Error: USRealmHeader - 2.5.19.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5610)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: USRealmHeader - 2.5.19.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5610)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_id_2_5_19_iii_c-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_id_2_5_19_iii_c-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_id_2_5_19_iii_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.19.iii.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:5613)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_19_iii_e-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_19_iii_e-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_19_iii_e-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: USRealmHeader - 2.5.19.iii.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5624)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_addr_2_5_19_iii_a-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_addr_2_5_19_iii_a-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_addr_2_5_19_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: USRealmHeader - 2.5.19.iii.a addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5616)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_telecom_2_5_19_iii_d-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_telecom_2_5_19_iii_d-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_telecom_2_5_19_iii_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: USRealmHeader - 2.5.19.iii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5622)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_5_19_iii_b-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_5_19_iii_b-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_5_19_iii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.19.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: USRealmHeader - 2.5.19.iii.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (NUCC - HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeader_1A_TEL_use_2_5_19_iii_d_1-error_mdht" see="#p-USRealmHeader_1A_TEL_use_2_5_19_iii_d_1-error_mdht" name="p-USRealmHeader_1A_TEL_use_2_5_19_iii_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity/telecom
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: USRealmHeader - 2.5.19.iii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:8000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeader_1A_Person_name_2_5_19_iii_e_1-error_mdht" see="#p-USRealmHeader_1A_Person_name_2_5_19_iii_e_1-error_mdht" name="p-USRealmHeader_1A_Person_name_2_5_19_iii_e_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authenticator/assignedEntity/assignedPerson
			UML root path: /GeneralHeaderConstraints/authenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.19.iii.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5625)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Informant -->

<pattern id="p-USRealmHeader_1A_Informant_assignedEntity_2_5_20_i-error_mdht" see="#p-USRealmHeader_1A_Informant_assignedEntity_2_5_20_i-error_mdht" name="p-USRealmHeader_1A_Informant_assignedEntity_2_5_20_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant
			UML root path: /GeneralHeaderConstraints/informant
		-->
	<rule context="/cda:ClinicalDocument/cda:informant">
		<!--
			OCL: self.assignedEntity->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntity
		-->
	<assert test="count(cda:assignedEntity) &lt;= 1">Error: USRealmHeader - 2.5.20.i assignedEntity
		Conformance: MAY contain zero or one [0..1] assignedEntity
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Informant -->

<pattern id="p-USRealmHeader_1A_Informant_relatedEntity_2_5_20_ii-error_mdht" see="#p-USRealmHeader_1A_Informant_relatedEntity_2_5_20_ii-error_mdht" name="p-USRealmHeader_1A_Informant_relatedEntity_2_5_20_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant
			UML root path: /GeneralHeaderConstraints/informant
		-->
	<rule context="/cda:ClinicalDocument/cda:informant">
		<!--
			OCL: self.relatedEntity->select(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::RelatedEntity))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntity
		-->
	<assert test="count(cda:relatedEntity) &lt;= 1">Error: USRealmHeader - 2.5.20.ii relatedEntity
		Conformance: MAY contain zero or one [0..1] relatedEntity
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Informant -->

<pattern id="p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_5_20_iii-error_mdht" see="#p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_5_20_iii-error_mdht" name="p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_5_20_iii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant
			UML root path: /GeneralHeaderConstraints/informant
		-->
	<rule context="/cda:ClinicalDocument/cda:informant">
		<!--
			OCL: self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity
		-->
	<assert test="not(cda:assignedEntity) or not(cda:relatedEntity)">Error: USRealmHeader - 2.5.20.iii GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity
		Conformance: SHALL satisfy: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity (CONF:8002)
		Analysis: contain exactly one [1..1] assignedEntity OR exactly one [1..1] relatedEntity
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_20_i_d-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_20_i_d-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_20_i_d-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: USRealmHeader - 2.5.20.i.d assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_addr_2_5_20_i_a-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_addr_2_5_20_i_a-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_addr_2_5_20_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: USRealmHeader - 2.5.20.i.a addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_5_20_i_b-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_5_20_i_b-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_5_20_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.20.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9947)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: USRealmHeader - 2.5.20.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:9947)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_id_2_5_20_i_c-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_id_2_5_20_i_c-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_id_2_5_20_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.20.i.c id
		Conformance: SHALL contain at least one [1..*] id (CONF:9945)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeader_1A_Person_name_2_5_20_i_d_1-error_mdht" see="#p-USRealmHeader_1A_Person_name_2_5_20_i_d_1-error_mdht" name="p-USRealmHeader_1A_Person_name_2_5_20_i_d_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/assignedEntity/assignedPerson
			UML root path: /GeneralHeaderConstraints/informant/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: USRealmHeader - 2.5.20.i.d.1 name
		Conformance: SHALL contain at least one [1..*] name
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-USRealmHeader_1A_RelatedEntity_person_2_5_20_ii_b-error_mdht" see="#p-USRealmHeader_1A_RelatedEntity_person_2_5_20_ii_b-error_mdht" name="p-USRealmHeader_1A_RelatedEntity_person_2_5_20_ii_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/relatedEntity
			UML root path: /GeneralHeaderConstraints/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: self.relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityPerson
		-->
	<assert test="count(cda:relatedPerson)=1">Error: USRealmHeader - 2.5.20.ii.b person
		Conformance: SHALL contain exactly one [1..1] relatedPerson (CONF:8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-USRealmHeader_1A_RelatedEntity_addr_2_5_20_ii_a-error_mdht" see="#p-USRealmHeader_1A_RelatedEntity_addr_2_5_20_ii_a-error_mdht" name="p-USRealmHeader_1A_RelatedEntity_addr_2_5_20_ii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/informant/relatedEntity
			UML root path: /GeneralHeaderConstraints/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: USRealmHeader - 2.5.20.ii.a addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-USRealmHeader_1A_ParticipantSupport_time_2_5_21_i-error_mdht" see="#p-USRealmHeader_1A_ParticipantSupport_time_2_5_21_i-error_mdht" name="p-USRealmHeader_1A_ParticipantSupport_time_2_5_21_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/supportParticipant
			UML root path: /GeneralHeaderConstraints/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: USRealmHeader - 2.5.21.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_5_21_ii-error_mdht" see="#p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_5_21_ii-error_mdht" name="p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_5_21_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/supportParticipant
			UML root path: /GeneralHeaderConstraints/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: USRealmHeader - 2.5.21.ii GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		Conformance: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity. (CONF:10006)
		Analysis: Such participants, if present, SHALL have an associatedPerson or scopingOrganization element under participant/associatedEntity.
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InFulfillmentOf -->

<pattern id="p-USRealmHeader_1A_InFulfillmentOf_order_2_5_22_i-error_mdht" see="#p-USRealmHeader_1A_InFulfillmentOf_order_2_5_22_i-error_mdht" name="p-USRealmHeader_1A_InFulfillmentOf_order_2_5_22_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/inFulfillmentOf
			UML root path: /GeneralHeaderConstraints/inFulfillmentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf">
		<!--
			OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::GeneralHeaderConstraints::InFulfillmentOf::Order))
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrder
		-->
	<assert test="count(cda:order)=1">Error: USRealmHeader - 2.5.22.i order
		Conformance: SHALL contain exactly one [1..1] order (CONF:9953)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Order -->

<pattern id="p-USRealmHeader_1A_Order_id_2_5_22_i_a-error_mdht" see="#p-USRealmHeader_1A_Order_id_2_5_22_i_a-error_mdht" name="p-USRealmHeader_1A_Order_id_2_5_22_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/inFulfillmentOf/order
			UML root path: /GeneralHeaderConstraints/inFulfillmentOf/order
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrderId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.22.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9954)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_5_23_i-error_mdht" see="#p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_5_23_i-error_mdht" name="p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_5_23_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf
			UML root path: /GeneralHeaderConstraints/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: USRealmHeader - 2.5.23.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:14836)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeader_1A_ServiceEvent_effectiveTime_2_5_23_i_a-error_mdht" see="#p-USRealmHeader_1A_ServiceEvent_effectiveTime_2_5_23_i_a-error_mdht" name="p-USRealmHeader_1A_ServiceEvent_effectiveTime_2_5_23_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: USRealmHeader - 2.5.23.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:14837)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_5_23_i_c-error_mdht" see="#p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_5_23_i_c-error_mdht" name="p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_5_23_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.effectiveTime->forAll(not low.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow
		-->
	<assert test="not(cda:effectiveTime[not(cda:low)])">Error: USRealmHeader - 2.5.23.i.c GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow
		Conformance: effectiveTime SHALL contain exactly one [1..1] low (CONF:14838)
		Analysis: effectiveTime SHALL contain exactly one [1..1] low
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeader_1A_ServiceEvent_performer_2_5_23_i_b-error_mdht" see="#p-USRealmHeader_1A_ServiceEvent_performer_2_5_23_i_b-error_mdht" name="p-USRealmHeader_1A_ServiceEvent_performer_2_5_23_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: USRealmHeader - 2.5.23.i.b performer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:14839)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeader_1A_Performer1_typeCode_2_5_23_i_b_2-error_mdht" see="#p-USRealmHeader_1A_Performer1_typeCode_2_5_23_i_b_2-error_mdht" name="p-USRealmHeader_1A_Performer1_typeCode_2_5_23_i_b_2-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: isDefined('typeCode')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode
		-->
	<assert test="attribute::node()[name() = 'typeCode']">Error: USRealmHeader - 2.5.23.i.b.2 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode (CONF:14840)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeader_1A_Performer1_functionCode_2_5_23_i_b_1-error_mdht" see="#p-USRealmHeader_1A_Performer1_functionCode_2_5_23_i_b_1-error_mdht" name="p-USRealmHeader_1A_Performer1_functionCode_2_5_23_i_b_1-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode">Error: USRealmHeader - 2.5.23.i.b.1 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.88')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode and cda:functionCode[@codeSystem = '2.16.840.1.113883.5.88']">Error: USRealmHeader - 2.5.23.i.b.1 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:16818), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.5.88 ParticipationFunction) (CONF:16819)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeader_1A_Performer1_assignedEntity_2_5_23_i_b_3-error_mdht" see="#p-USRealmHeader_1A_Performer1_assignedEntity_2_5_23_i_b_3-error_mdht" name="p-USRealmHeader_1A_Performer1_assignedEntity_2_5_23_i_b_3-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::DocumentationOf::ServiceEvent::Performer1::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: USRealmHeader - 2.5.23.i.b.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:14841)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_code_2_5_23_i_b_3_i-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_code_2_5_23_i_b_3_i-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_code_2_5_23_i_b_3_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.23.i.b.3.i code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:14842), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:14843)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101']">Error: USRealmHeader - 2.5.23.i.b.3.i code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:14842), which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.101 NUCC Health Care Provider Taxonomy) (CONF:14843)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader_1A_AssignedEntity_id_2_5_23_i_b_3_ii-error_mdht" see="#p-USRealmHeader_1A_AssignedEntity_id_2_5_23_i_b_3_ii-error_mdht" name="p-USRealmHeader_1A_AssignedEntity_id_2_5_23_i_b_3_ii-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /GeneralHeaderConstraints/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId
		-->
	<assert test="cda:id">Error: USRealmHeader - 2.5.23.i.b.3.ii id
		Conformance: SHALL contain at least one [1..*] id (CONF:14846)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-USRealmHeader_1A_Authorization_consent_2_5_24_i-error_mdht" see="#p-USRealmHeader_1A_Authorization_consent_2_5_24_i-error_mdht" name="p-USRealmHeader_1A_Authorization_consent_2_5_24_i-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization
			UML root path: /GeneralHeaderConstraints/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::GeneralHeaderConstraints::Authorization::Consent))
			Constraint name: GeneralHeaderConstraintsAuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: USRealmHeader - 2.5.24.i consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:16793)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeader_1A_Consent_id_2_5_24_i_b-error_mdht" see="#p-USRealmHeader_1A_Consent_id_2_5_24_i_b-error_mdht" name="p-USRealmHeader_1A_Consent_id_2_5_24_i_b-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization/consent
			UML root path: /GeneralHeaderConstraints/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: USRealmHeader - 2.5.24.i.b id
		Conformance: MAY contain zero or more [0..*] id (CONF:16794)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeader_1A_Consent_statusCode_2_5_24_i_c-error_mdht" see="#p-USRealmHeader_1A_Consent_statusCode_2_5_24_i_c-error_mdht" name="p-USRealmHeader_1A_Consent_statusCode_2_5_24_i_c-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization/consent
			UML root path: /GeneralHeaderConstraints/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCodeP
		-->
	<assert test="cda:statusCode">Error: USRealmHeader - 2.5.24.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: USRealmHeader - 2.5.24.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeader_1A_Consent_code_2_5_24_i_a-error_mdht" see="#p-USRealmHeader_1A_Consent_code_2_5_24_i_a-error_mdht" name="p-USRealmHeader_1A_Consent_code_2_5_24_i_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/authorization/consent
			UML root path: /GeneralHeaderConstraints/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: USRealmHeader - 2.5.24.i.a code
		Conformance: MAY contain zero or one [0..1] code (CONF:16795)
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
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom</assert>
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
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer">Cannot find context /cda:ClinicalDocument/cda:dataEnterer</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian">Cannot find context /cda:ClinicalDocument/cda:custodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:informant">Cannot find context /cda:ClinicalDocument/cda:informant</assert>
	<assert test="/cda:ClinicalDocument/cda:informant">Cannot find context /cda:ClinicalDocument/cda:informant</assert>
	<assert test="/cda:ClinicalDocument/cda:informant">Cannot find context /cda:ClinicalDocument/cda:informant</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf/cda:order</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization">Cannot find context /cda:ClinicalDocument/cda:authorization</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-USRealmHeader_2_USRealmHeader_componentOf_2_5_13-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_dataEnterer_2_5_15-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_informant_2_5_20-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_recordTarget_2_5_12-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_author_2_5_14-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_custodian_2_5_16-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_authenticator_2_5_19-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_documentationOf_2_5_23-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_typeId_2_5_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_templateId_2_5_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_realmCode_2_5_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_confidentialityCode_2_5_8-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_code_2_5_5-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_languageCode_2_5_9-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_setId_2_5_10-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_title_2_5_6-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_effectiveTime_2_5_7-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_GeneralHeaderConstraintsSetIdVersionNumber_2_5_27-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_versionNumber_2_5_11-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_informationRecipient_2_5_17-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_inFulfillmentOf_2_5_22-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_supportParticipant_2_5_21-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_legalAuthenticator_2_5_18-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_id_2_5_4-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmHeader_authorization_2_5_24-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_RecordTarget_patientRole_2_5_12_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_PatientRole_id_2_5_12_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_PatientRole_telecom_2_5_12_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_PatientRole_providerOrganization_2_5_12_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_PatientRole_addr_2_5_12_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_PatientRole_patient_2_5_12_i_d-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_city_2_5_12_i_a_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_country_2_5_12_i_a_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_state_2_5_12_i_a_4-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_streetAddressLine_2_5_12_i_a_5-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_use_2_5_12_i_a_6-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_5_12_i_a_7-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmAddress_postalCode_2_5_12_i_a_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_12_i_c_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_guardian_2_5_12_i_d_9-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_ethnicGroupCode_2_5_12_i_d_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_sDTCRaceCode_2_5_12_i_d_8-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_languageCommunication_2_5_12_i_d_11-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_religiousAffiliationCode_2_5_12_i_d_7-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_name_2_5_12_i_d_5-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_GeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode_2_5_12_i_d_12-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_raceCode_2_5_12_i_d_6-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_birthplace_2_5_12_i_d_10-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_birthTime_2_5_12_i_d_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_maritalStatusCode_2_5_12_i_d_4-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Patient_administrativeGenderCode_2_5_12_i_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TS_value_2_5_12_i_d_2_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_prefix_2_5_12_i_d_5_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_GeneralHeaderConstraints_2_5-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_suffix_2_5_12_i_d_5_iv-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_family_2_5_12_i_d_5_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_given_2_5_12_i_d_5_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_USRealmPatientName_use_2_5_12_i_d_5_v-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_telecom_2_5_12_i_d_9_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_addr_2_5_12_i_d_9_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty_2_5_12_i_d_9_v-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_guardianPerson_2_5_12_i_d_9_iv-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Guardian_code_2_5_12_i_d_9_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Person_name_2_5_12_i_d_9_iv_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Birthplace_place_2_5_12_i_d_10_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Place_addr_2_5_12_i_d_10_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LanguageCommunication_preferenceInd_2_5_12_i_d_11_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LanguageCommunication_languageCode_2_5_12_i_d_11_iv-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LanguageCommunication_proficiencyLevelCode_2_5_12_i_d_11_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LanguageCommunication_modeCode_2_5_12_i_d_11_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ProviderOrganization_name_2_5_12_i_e_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ProviderOrganization_telecom_2_5_12_i_e_4-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ProviderOrganization_id_2_5_12_i_e_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_5_12_i_e_5-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ProviderOrganization_addr_2_5_12_i_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_12_i_e_4_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_2_ComponentOf_encompassingEncounter_2_5_13_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_2_EncompassingEncounter_id_2_5_13_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_2_EncompassingEncounter_effectiveTime_2_5_13_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Author_assignedAuthor_2_5_14_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Author_time_2_5_14_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedAuthor_addr_2_5_14_ii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedAuthor_id_2_5_14_ii_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedAuthor_code_2_5_14_ii_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedAuthor_telecom_2_5_14_ii_d-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_14_ii_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AuthoringDevice_softwareName_2_5_14_ii_e_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AuthoringDevice_manufacturerModelName_2_5_14_ii_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Person_name_2_5_14_ii_f_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_DataEnterer_assignedEntity_2_5_15_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_id_2_5_15_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_telecom_2_5_15_i_d-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_5_15_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_addr_2_5_15_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_15_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_ProviderOrganization_2_5_12_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_15_i_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Person_name_2_5_15_i_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Custodian_assignedCustodian_2_5_16_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedCustodian_representedCustodianOrganization_2_5_16_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_CustodianOrganization_ProviderOrganization_2_5_12_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_CustodianOrganization_addr_2_5_16_i_a_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_CustodianOrganization_id_2_5_16_i_a_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_CustodianOrganization_telecom_2_5_16_i_a_4-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_CustodianOrganization_name_2_5_16_i_a_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_16_i_a_4_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_InformationRecipient_intendedRecipient_2_5_17_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_IntendedRecipient_receivedOrganization_2_5_17_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_IntendedRecipient_informationRecipient_2_5_17_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Person_name_2_5_17_i_a_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Organization_name_2_5_17_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LegalAuthenticator_assignedEntity_2_5_18_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LegalAuthenticator_time_2_5_18_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_LegalAuthenticator_signatureCode_2_5_18_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_id_2_5_18_iii_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_addr_2_5_18_iii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_telecom_2_5_18_iii_d-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_18_iii_e-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_5_18_iii_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_18_iii_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Person_name_2_5_18_iii_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Authenticator_assignedEntity_2_5_19_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Authenticator_time_2_5_19_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Authenticator_signatureCode_2_5_19_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_id_2_5_19_iii_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_19_iii_e-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_addr_2_5_19_iii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_telecom_2_5_19_iii_d-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_5_19_iii_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_TEL_use_2_5_19_iii_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Person_name_2_5_19_iii_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Informant_assignedEntity_2_5_20_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Informant_relatedEntity_2_5_20_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Informant_GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity_2_5_20_iii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_assignedPerson_2_5_20_i_d-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_addr_2_5_20_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_5_20_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_id_2_5_20_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Person_name_2_5_20_i_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_RelatedEntity_person_2_5_20_ii_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_RelatedEntity_addr_2_5_20_ii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ParticipantSupport_time_2_5_21_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ParticipantSupport_GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization_2_5_21_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_InFulfillmentOf_order_2_5_22_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Order_id_2_5_22_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_DocumentationOf_serviceEvent_2_5_23_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ServiceEvent_effectiveTime_2_5_23_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ServiceEvent_GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow_2_5_23_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_ServiceEvent_performer_2_5_23_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Performer1_typeCode_2_5_23_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Performer1_functionCode_2_5_23_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Performer1_assignedEntity_2_5_23_i_b_3-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_code_2_5_23_i_b_3_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_AssignedEntity_id_2_5_23_i_b_3_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Authorization_consent_2_5_24_i-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Consent_id_2_5_24_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Consent_statusCode_2_5_24_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader_1A_Consent_code_2_5_24_i_a-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
