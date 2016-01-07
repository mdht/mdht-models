<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_id_2_23_4-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_id_2_23_4-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_id_2_23_4-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363, R2.1=CONF:1198-5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_confidentialityCode_2_23_8-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_confidentialityCode_2_23_8-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_confidentialityCode_2_23_8-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: US Realm Header (V3) - 2.23.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: US Realm Header (V3) - 2.23.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_setId_2_23_10-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_setId_2_23_10-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_setId_2_23_10-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: US Realm Header (V3) - 2.23.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_effectiveTime_2_23_7-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_effectiveTime_2_23_7-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_effectiveTime_2_23_7-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: US Realm Header (V3) - 2.23.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_author_2_23_7-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_author_2_23_7-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_author_2_23_7-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: US Realm Header (V3) - 2.23.7 author
		Conformance: SHALL contain at least one [1..*] author (CONF:1198-5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_authenticator_2_23_11-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_authenticator_2_23_11-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_authenticator_2_23_11-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: US Realm Header (V3) - 2.23.11 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:1198-5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_documentationOf_2_23_16-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_documentationOf_2_23_16-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_documentationOf_2_23_16-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->select(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOf
		-->
	<assert test="count(cda:documentationOf) &gt;= 0">Error: US Realm Header (V3) - 2.23.16 documentationOf
		Conformance: MAY contain zero or more [0..*] documentationOf (CONF:1198-14835)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_recordTarget_2_23_5-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_recordTarget_2_23_5-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_recordTarget_2_23_5-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: US Realm Header (V3) - 2.23.5 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:1198-5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_legalAuthenticator_2_23_10-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_legalAuthenticator_2_23_10-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_legalAuthenticator_2_23_10-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: US Realm Header (V3) - 2.23.10 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:1198-5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_code_2_23_5-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_code_2_23_5-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_code_2_23_5-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code">Error: US Realm Header (V3) - 2.23.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:5253, R2.1=CONF:1198-5253)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_languageCode_2_23_9-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_languageCode_2_23_9-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_languageCode_2_23_9-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: US Realm Header (V3) - 2.23.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: US Realm Header (V3) - 2.23.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_templateId_2_23_1-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_templateId_2_23_1-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_templateId_2_23_1-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1' and id.extension = '2015-08-01')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.1' and @extension = '2015-08-01'">Error: US Realm Header (V3) - 2.23.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-5252, CONF:1198-10036, CONF:1198-32503 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.1&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_2_USRealmHeaderV3_componentOf_2_23_14-error_mdht" see="#p-USRealmHeaderV3_2_USRealmHeaderV3_componentOf_2_23_14-error_mdht" name="p-USRealmHeaderV3_2_USRealmHeaderV3_componentOf_2_23_14-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: GeneralHeaderConstraintsComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: US Realm Header (V3) - 2.23.14 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:1198-9955)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_typeId_2_23_3-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_typeId_2_23_3-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_typeId_2_23_3-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: US Realm Header (V3) - 2.23.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_custodian_2_23_8-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_custodian_2_23_8-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_custodian_2_23_8-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: US Realm Header (V3) - 2.23.8 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:1198-5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_informationRecipient_2_23_9-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_informationRecipient_2_23_9-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_informationRecipient_2_23_9-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: US Realm Header (V3) - 2.23.9 informationRecipient
		Conformance: MAY contain zero or more [0..*] informationRecipient (CONF:1198-5565)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_informant_2_23_12-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_informant_2_23_12-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_informant_2_23_12-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: US Realm Header (V3) - 2.23.12 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:1198-8001, CONF:1198-31355)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_inFulfillmentOf_2_23_13-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_inFulfillmentOf_2_23_13-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_inFulfillmentOf_2_23_13-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: US Realm Header (V3) - 2.23.13 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:1198-9952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_versionNumber_2_23_11-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_versionNumber_2_23_11-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_versionNumber_2_23_11-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: US Realm Header (V3) - 2.23.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_authorization_2_23_17-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_authorization_2_23_17-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_authorization_2_23_17-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: US Realm Header (V3) - 2.23.17 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:1198-16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_title_2_23_4-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_title_2_23_4-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_title_2_23_4-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: US Realm Header (V3) - 2.23.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1198-5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_dataEnterer_2_23_6-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_dataEnterer_2_23_6-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_dataEnterer_2_23_6-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: US Realm Header (V3) - 2.23.6 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:1198-5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_supportParticipant_2_23_15-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_supportParticipant_2_23_15-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_supportParticipant_2_23_15-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: US Realm Header (V3) - 2.23.15 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:1198-10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeader2: 2.16.840.1.113883.10.20.22.1.1 -->

<pattern id="p-USRealmHeaderV3_1A_USRealmHeaderV3_realmCode_2_23_3-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmHeaderV3_realmCode_2_23_3-error_mdht" name="p-USRealmHeaderV3_1A_USRealmHeaderV3_realmCode_2_23_3-error_mdht">
		<!--
			UML path: /USRealmHeader2
			UML root path: /USRealmHeader2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: US Realm Header (V3) - 2.23.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: US Realm Header (V3) - 2.23.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-USRealmHeaderV3_1A_RecordTarget_patientRole_2_23_5_i-error_mdht" see="#p-USRealmHeaderV3_1A_RecordTarget_patientRole_2_23_5_i-error_mdht" name="p-USRealmHeaderV3_1A_RecordTarget_patientRole_2_23_5_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget
			UML root path: /USRealmHeader2/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: US Realm Header (V3) - 2.23.5.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:1198-5267)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeaderV3_1A_PatientRole_patient_2_23_5_i_e-error_mdht" see="#p-USRealmHeaderV3_1A_PatientRole_patient_2_23_5_i_e-error_mdht" name="p-USRealmHeaderV3_1A_PatientRole_patient_2_23_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: US Realm Header (V3) - 2.23.5.i.e patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:1198-5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeaderV3_1A_PatientRole_id_2_23_5_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_PatientRole_id_2_23_5_i_a-error_mdht" name="p-USRealmHeaderV3_1A_PatientRole_id_2_23_5_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.5.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5268, R2.1=CONF:1198-5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeaderV3_1A_PatientRole_addr_2_23_5_i_b-error_mdht" see="#p-USRealmHeaderV3_1A_PatientRole_addr_2_23_5_i_b-error_mdht" name="p-USRealmHeaderV3_1A_PatientRole_addr_2_23_5_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.5.i.b addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5271, R2.1=CONF:1198-5271)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeaderV3_1A_PatientRole_providerOrganization_2_23_5_i_e-error_mdht" see="#p-USRealmHeaderV3_1A_PatientRole_providerOrganization_2_23_5_i_e-error_mdht" name="p-USRealmHeaderV3_1A_PatientRole_providerOrganization_2_23_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
		-->
	<assert test="count(cda:providerOrganization) &lt;= 1">Error: US Realm Header (V3) - 2.23.5.i.e providerOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeaderV3_1A_PatientRole_telecom_2_23_5_i_c-error_mdht" see="#p-USRealmHeaderV3_1A_PatientRole_telecom_2_23_5_i_c-error_mdht" name="p-USRealmHeaderV3_1A_PatientRole_telecom_2_23_5_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
		-->
	<assert test="cda:telecom">Error: US Realm Header (V3) - 2.23.5.i.c telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5280, R2.1=CONF:1198-5280)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_birthTime_2_23_5_i_e_8-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_birthTime_2_23_5_i_e_8-error_mdht" name="p-USRealmHeaderV3_1A_Patient_birthTime_2_23_5_i_e_8-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: US Realm Header (V3) - 2.23.5.i.e.8 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:1198-5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_sDTCRaceCode_2_23_5_i_e_7-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_sDTCRaceCode_2_23_5_i_e_7-error_mdht" name="p-USRealmHeaderV3_1A_Patient_sDTCRaceCode_2_23_5_i_e_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or ext:sDTCRaceCode">Error: US Realm Header (V3) - 2.23.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or not(ext:sDTCRaceCode[not(. and @codeSystem = '2.16.840.1.113883.6.238' and @code)])">Error: US Realm Header (V3) - 2.23.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_ethnicGroupCode_2_23_5_i_e_7-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_ethnicGroupCode_2_23_5_i_e_7-error_mdht" name="p-USRealmHeaderV3_1A_Patient_ethnicGroupCode_2_23_5_i_e_7-error_mdht">
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
	<assert test="cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: US Realm Header (V3) - 2.23.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.ethnicGroupCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="cda:ethnicGroupCode">Error: US Realm Header (V3) - 2.23.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_guardian_2_23_5_i_e_9-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_guardian_2_23_5_i_e_9-error_mdht" name="p-USRealmHeaderV3_1A_Patient_guardian_2_23_5_i_e_9-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: US Realm Header (V3) - 2.23.5.i.e.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:1198-5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_raceCode_2_23_5_i_e_6-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_raceCode_2_23_5_i_e_6-error_mdht" name="p-USRealmHeaderV3_1A_Patient_raceCode_2_23_5_i_e_6-error_mdht">
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
	<assert test="cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '1002-5' or @code = '2028-9' or @code = '2054-5' or @code = '2076-8' or @code = '2106-3')]">Error: US Realm Header (V3) - 2.23.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="cda:raceCode">Error: US Realm Header (V3) - 2.23.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_administrativeGenderCode_2_23_5_i_e_2-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_administrativeGenderCode_2_23_5_i_e_2-error_mdht" name="p-USRealmHeaderV3_1A_Patient_administrativeGenderCode_2_23_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
		-->
	<assert test="true()">Error: US Realm Header (V3) - 2.23.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
		-->
	<assert test="cda:administrativeGenderCode and cda:administrativeGenderCode[@codeSystem = '2.16.840.1.113883.5.1' and (@code = 'F' or @code = 'M' or @code = 'UN')]">Error: US Realm Header (V3) - 2.23.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_languageCommunication_2_23_5_i_e_10-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_languageCommunication_2_23_5_i_e_10-error_mdht" name="p-USRealmHeaderV3_1A_Patient_languageCommunication_2_23_5_i_e_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: US Realm Header (V3) - 2.23.5.i.e.10 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:1198-5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_birthplace_2_23_5_i_e_11-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_birthplace_2_23_5_i_e_11-error_mdht" name="p-USRealmHeaderV3_1A_Patient_birthplace_2_23_5_i_e_11-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: US Realm Header (V3) - 2.23.5.i.e.11 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:1198-5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_maritalStatusCode_2_23_5_i_e_4-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_maritalStatusCode_2_23_5_i_e_4-error_mdht" name="p-USRealmHeaderV3_1A_Patient_maritalStatusCode_2_23_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode">Error: US Realm Header (V3) - 2.23.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode and cda:maritalStatusCode[@codeSystem = '2.16.840.1.113883.5.2' and (@code = 'A' or @code = 'D' or @code = 'I' or @code = 'L' or @code = 'M' or @code = 'P' or @code = 'S' or @code = 'T' or @code = 'W')]">Error: US Realm Header (V3) - 2.23.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_religiousAffiliationCode_2_23_5_i_e_5-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_religiousAffiliationCode_2_23_5_i_e_5-error_mdht" name="p-USRealmHeaderV3_1A_Patient_religiousAffiliationCode_2_23_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode">Error: US Realm Header (V3) - 2.23.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode and cda:religiousAffiliationCode[@codeSystem = '2.16.840.1.113883.5.1076' and @code]">Error: US Realm Header (V3) - 2.23.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeaderV3_1A_Patient_name_2_23_5_i_e_1-error_mdht" see="#p-USRealmHeaderV3_1A_Patient_name_2_23_5_i_e_1-error_mdht" name="p-USRealmHeaderV3_1A_Patient_name_2_23_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.5.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411, R2.1=CONF:1198-5284)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeaderV3_1A_Guardian_addr_2_23_5_i_e_9_i-error_mdht" see="#p-USRealmHeaderV3_1A_Guardian_addr_2_23_5_i_e_9_i-error_mdht" name="p-USRealmHeaderV3_1A_Guardian_addr_2_23_5_i_e_9_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: US Realm Header (V3) - 2.23.5.i.e.9.i addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:5359, CONF:10413, R2.1=CONF:1198-5359)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeaderV3_1A_Guardian_code_2_23_5_i_e_9_ii-error_mdht" see="#p-USRealmHeaderV3_1A_Guardian_code_2_23_5_i_e_9_ii-error_mdht" name="p-USRealmHeaderV3_1A_Guardian_code_2_23_5_i_e_9_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header (V3) - 2.23.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: US Realm Header (V3) - 2.23.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeaderV3_1A_Guardian_telecom_2_23_5_i_e_9_iii-error_mdht" see="#p-USRealmHeaderV3_1A_Guardian_telecom_2_23_5_i_e_9_iii-error_mdht" name="p-USRealmHeaderV3_1A_Guardian_telecom_2_23_5_i_e_9_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: US Realm Header (V3) - 2.23.5.i.e.9.iii telecom
		Conformance: SHOULD contain zero or more [0..*] telecom (CONF:1198-5382)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeaderV3_1A_Guardian_guardianPerson_2_23_5_i_e_9_iv-error_mdht" see="#p-USRealmHeaderV3_1A_Guardian_guardianPerson_2_23_5_i_e_9_iv-error_mdht" name="p-USRealmHeaderV3_1A_Guardian_guardianPerson_2_23_5_i_e_9_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::Person))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson
		-->
	<assert test="count(cda:guardianPerson)=1">Error: US Realm Header (V3) - 2.23.5.i.e.9.iv guardianPerson
		Conformance: SHALL contain exactly one [1..1] guardianPerson (CONF:5385, R2.1=CONF:1198-5385)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.6.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993, R2.1=CONF:1198-7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeaderV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-USRealmHeaderV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: US Realm Header (V3) - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeaderV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-USRealmHeaderV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: US Realm Header (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeaderV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-USRealmHeaderV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: US Realm Header (V3) - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeaderV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-USRealmHeaderV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: US Realm Header (V3) - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeaderV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_23_5_i_b_7-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_23_5_i_b_7-error_mdht" name="p-USRealmHeaderV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_23_5_i_b_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		-->
	<assert test="@nullFlavor or count(cda:streetAddressLine) &gt;= 1 and count(cda:streetAddressLine) &lt;= 4">Error: US Realm Header (V3) - 2.23.5.i.b.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		Conformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: SHALL contain at least one and not more than 4 streetAddressLine
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeaderV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-USRealmHeaderV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: US Realm Header (V3) - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-USRealmHeaderV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-USRealmHeaderV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: US Realm Header (V3) - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeaderV3_1A_Person_name_2_23_5_i_e_9_iv_a-error_mdht" see="#p-USRealmHeaderV3_1A_Person_name_2_23_5_i_e_9_iv_a-error_mdht" name="p-USRealmHeaderV3_1A_Person_name_2_23_5_i_e_9_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.5.i.e.9.iv.a name
		Conformance: SHALL contain at least one [1..*] name (CONF:5386, R2.1=CONF:1198-5386)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeaderV3_1A_LanguageCommunication_preferenceInd_2_23_5_i_e_10_iv-error_mdht" see="#p-USRealmHeaderV3_1A_LanguageCommunication_preferenceInd_2_23_5_i_e_10_iv-error_mdht" name="p-USRealmHeaderV3_1A_LanguageCommunication_preferenceInd_2_23_5_i_e_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: US Realm Header (V3) - 2.23.5.i.e.10.iv preferenceInd
		Conformance: SHOULD contain zero or one [0..1] preferenceInd (CONF:1198-5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeaderV3_1A_LanguageCommunication_languageCode_2_23_5_i_e_10_iii-error_mdht" see="#p-USRealmHeaderV3_1A_LanguageCommunication_languageCode_2_23_5_i_e_10_iii-error_mdht" name="p-USRealmHeaderV3_1A_LanguageCommunication_languageCode_2_23_5_i_e_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: US Realm Header (V3) - 2.23.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: US Realm Header (V3) - 2.23.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeaderV3_1A_LanguageCommunication_modeCode_2_23_5_i_e_10_i-error_mdht" see="#p-USRealmHeaderV3_1A_LanguageCommunication_modeCode_2_23_5_i_e_10_i-error_mdht" name="p-USRealmHeaderV3_1A_LanguageCommunication_modeCode_2_23_5_i_e_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode">Error: US Realm Header (V3) - 2.23.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode and cda:modeCode[@codeSystem = '2.16.840.1.113883.5.60' and (@code = 'ESGN' or @code = 'ESP' or @code = 'EWR' or @code = 'RSGN' or @code = 'RSP' or @code = 'RWR')]">Error: US Realm Header (V3) - 2.23.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeaderV3_1A_LanguageCommunication_proficiencyLevelCode_2_23_5_i_e_10_ii-error_mdht" see="#p-USRealmHeaderV3_1A_LanguageCommunication_proficiencyLevelCode_2_23_5_i_e_10_ii-error_mdht" name="p-USRealmHeaderV3_1A_LanguageCommunication_proficiencyLevelCode_2_23_5_i_e_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode">Error: US Realm Header (V3) - 2.23.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined() and self.proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.proficiencyLevelCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode and cda:proficiencyLevelCode[@codeSystem = '2.16.840.1.113883.5.61' and (@code = 'E' or @code = 'F' or @code = 'G' or @code = 'P')]">Error: US Realm Header (V3) - 2.23.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-USRealmHeaderV3_1A_TS_value_2_23_5_i_e_8_i-error_mdht" see="#p-USRealmHeaderV3_1A_TS_value_2_23_5_i_e_8_i-error_mdht" name="p-USRealmHeaderV3_1A_TS_value_2_23_5_i_e_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (true ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or true()">Error: US Realm Header (V3) - 2.23.5.i.e.8.i value
		Conformance: contain exactly one [1..1] value
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-USRealmHeaderV3_1A_Birthplace_place_2_23_5_i_e_11_i-error_mdht" see="#p-USRealmHeaderV3_1A_Birthplace_place_2_23_5_i_e_11_i-error_mdht" name="p-USRealmHeaderV3_1A_Birthplace_place_2_23_5_i_e_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: US Realm Header (V3) - 2.23.5.i.e.11.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:1198-5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-USRealmHeaderV3_1A_Place_addr_2_23_5_i_e_11_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_Place_addr_2_23_5_i_e_11_i_a-error_mdht" name="p-USRealmHeaderV3_1A_Place_addr_2_23_5_i_e_11_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.5.i.e.11.i.a addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5397, R2.1=CONF:1198-5397)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeaderV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" name="p-USRealmHeaderV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: US Realm Header (V3) - 2.19.5.ii.b.1.ii family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, R2.1=CONF:81-7159)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeaderV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" name="p-USRealmHeaderV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: US Realm Header (V3) - 2.10 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT have mixed content except for white space
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeaderV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" name="p-USRealmHeaderV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: US Realm Header (V3) - 2.19.5.ii.b.1.v suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161, R2.1=CONF:81-7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeaderV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" name="p-USRealmHeaderV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: US Realm Header (V3) - 2.19.5.ii.b.1.iii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157, R2.1=CONF:81-7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeaderV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" name="p-USRealmHeaderV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: US Realm Header (V3) - 2.19.5.ii.b.1.iv prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155, R2.1=CONF:81-7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-USRealmHeaderV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" see="#p-USRealmHeaderV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" name="p-USRealmHeaderV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: US Realm Header (V3) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeaderV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_23_5_i_e_5-error_mdht" see="#p-USRealmHeaderV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_23_5_i_e_5-error_mdht" name="p-USRealmHeaderV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_23_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: US Realm Header (V3) - 2.23.5.i.e.5 GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		Conformance: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996, R2.1=CONF:1198-16820)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeaderV3_1A_ProviderOrganization_name_2_23_5_i_e_2-error_mdht" see="#p-USRealmHeaderV3_1A_ProviderOrganization_name_2_23_5_i_e_2-error_mdht" name="p-USRealmHeaderV3_1A_ProviderOrganization_name_2_23_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.5.i.e.2 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5419, R2.1=CONF:1198-5419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeaderV3_1A_ProviderOrganization_telecom_2_23_5_i_e_3-error_mdht" see="#p-USRealmHeaderV3_1A_ProviderOrganization_telecom_2_23_5_i_e_3-error_mdht" name="p-USRealmHeaderV3_1A_ProviderOrganization_telecom_2_23_5_i_e_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: US Realm Header (V3) - 2.23.5.i.e.3 telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5420, R2.1=CONF:1198-5420)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeaderV3_1A_ProviderOrganization_addr_2_23_5_i_e_4-error_mdht" see="#p-USRealmHeaderV3_1A_ProviderOrganization_addr_2_23_5_i_e_4-error_mdht" name="p-USRealmHeaderV3_1A_ProviderOrganization_addr_2_23_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.5.i.e.4 addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5422, R2.1=CONF:1198-5422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-USRealmHeaderV3_1A_ProviderOrganization_id_2_23_5_i_e_1-error_mdht" see="#p-USRealmHeaderV3_1A_ProviderOrganization_id_2_23_5_i_e_1-error_mdht" name="p-USRealmHeaderV3_1A_ProviderOrganization_id_2_23_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.5.i.e.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5417, R2.1=CONF:1198-5417)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_e_3_i-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_e_3_i-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_e_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.23.5.i.e.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7994, CONF:1198-7994)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_c_1-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_c_1-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_c_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.23.5.i.c.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:5375, R2.1=CONF:1198-5375)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-USRealmHeaderV3_1A_DataEnterer_assignedEntity_2_23_6_i-error_mdht" see="#p-USRealmHeaderV3_1A_DataEnterer_assignedEntity_2_23_6_i-error_mdht" name="p-USRealmHeaderV3_1A_DataEnterer_assignedEntity_2_23_6_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer
			UML root path: /USRealmHeader2/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeader2::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header (V3) - 2.23.6.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_6_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_6_i_a-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_6_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.6.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5443, R2.1=CONF:1198-5443)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_6_i_d-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_6_i_d-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header (V3) - 2.23.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: US Realm Header (V3) - 2.23.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_6_i_d-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_6_i_d-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: US Realm Header (V3) - 2.23.6.i.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5466, R2.1=CONF:1198-5466)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_6_i_c-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_6_i_c-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_6_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.6.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5460, R2.1=CONF:1198-5460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_6_i_e-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_6_i_e-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_6_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: US Realm Header (V3) - 2.23.6.i.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469, R2.1=CONF:1198-5469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_23_6_i_d_1-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_23_6_i_d_1-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_23_6_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.23.6.i.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7996, R2.1=CONF:1198-7996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeaderV3_1A_Person_name_2_23_6_i_e_1-error_mdht" see="#p-USRealmHeaderV3_1A_Person_name_2_23_6_i_e_1-error_mdht" name="p-USRealmHeaderV3_1A_Person_name_2_23_6_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.6.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5470)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-USRealmHeaderV3_1A_Author_time_2_23_7_i-error_mdht" see="#p-USRealmHeaderV3_1A_Author_time_2_23_7_i-error_mdht" name="p-USRealmHeaderV3_1A_Author_time_2_23_7_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorTime
		-->
	<assert test="cda:time">Error: US Realm Header (V3) - 2.23.7.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5445, R2.1=CONF:1198-5445)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-USRealmHeaderV3_1A_Author_assignedAuthor_2_23_7_ii-error_mdht" see="#p-USRealmHeaderV3_1A_Author_assignedAuthor_2_23_7_ii-error_mdht" name="p-USRealmHeaderV3_1A_Author_assignedAuthor_2_23_7_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::USRealmHeader2::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: US Realm Header (V3) - 2.23.7.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1198-5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeaderV3_1A_AssignedAuthor_addr_2_23_7_ii_c-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedAuthor_addr_2_23_7_ii_c-error_mdht" name="p-USRealmHeaderV3_1A_AssignedAuthor_addr_2_23_7_ii_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.7.ii.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5452, R2.1=CONF:1198-5452)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeaderV3_1A_AssignedAuthor_id_2_23_7_ii_a-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedAuthor_id_2_23_7_ii_a-error_mdht" name="p-USRealmHeaderV3_1A_AssignedAuthor_id_2_23_7_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.7.ii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5449, R2.1=CONF:1198-5449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeaderV3_1A_AssignedAuthor_code_2_23_7_ii_d-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedAuthor_code_2_23_7_ii_d-error_mdht" name="p-USRealmHeaderV3_1A_AssignedAuthor_code_2_23_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: US Realm Header (V3) - 2.23.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: US Realm Header (V3) - 2.23.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeaderV3_1A_AssignedAuthor_telecom_2_23_7_ii_d-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedAuthor_telecom_2_23_7_ii_d-error_mdht" name="p-USRealmHeaderV3_1A_AssignedAuthor_telecom_2_23_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTelecom
		-->
	<assert test="cda:telecom">Error: US Realm Header (V3) - 2.23.7.ii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5428, R2.1=CONF:1198-5428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-USRealmHeaderV3_1A_AuthoringDevice_softwareName_2_23_7_ii_e_2-error_mdht" see="#p-USRealmHeaderV3_1A_AuthoringDevice_softwareName_2_23_7_ii_e_2-error_mdht" name="p-USRealmHeaderV3_1A_AuthoringDevice_softwareName_2_23_7_ii_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.softwareName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
		-->
	<assert test="cda:softwareName">Error: US Realm Header (V3) - 2.23.7.ii.e.2 softwareName
		Conformance: SHALL contain exactly one [1..1] softwareName (CONF:16785, R2.1=CONF:1198-16785)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-USRealmHeaderV3_1A_AuthoringDevice_manufacturerModelName_2_23_7_ii_e_1-error_mdht" see="#p-USRealmHeaderV3_1A_AuthoringDevice_manufacturerModelName_2_23_7_ii_e_1-error_mdht" name="p-USRealmHeaderV3_1A_AuthoringDevice_manufacturerModelName_2_23_7_ii_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.manufacturerModelName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
		-->
	<assert test="cda:manufacturerModelName">Error: US Realm Header (V3) - 2.23.7.ii.e.1 manufacturerModelName
		Conformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784, R2.1=CONF:1198-16784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_23_7_ii_d_1-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_23_7_ii_d_1-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_23_7_ii_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/telecom
			UML root path: /USRealmHeader2/author/assignedAuthor/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.23.7.ii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7995, R2.1=CONF:1198-7995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeaderV3_1A_Person_name_2_23_7_ii_f_1-error_mdht" see="#p-USRealmHeaderV3_1A_Person_name_2_23_7_ii_f_1-error_mdht" name="p-USRealmHeaderV3_1A_Person_name_2_23_7_ii_f_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedPerson
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorPersonName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.7.ii.f.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:16789, R2.1=CONF:1198-16789)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-USRealmHeaderV3_1A_Custodian_assignedCustodian_2_23_8_i-error_mdht" see="#p-USRealmHeaderV3_1A_Custodian_assignedCustodian_2_23_8_i-error_mdht" name="p-USRealmHeaderV3_1A_Custodian_assignedCustodian_2_23_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian
			UML root path: /USRealmHeader2/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: US Realm Header (V3) - 2.23.8.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:5520, R2.1=CONF:1198-5520)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-USRealmHeaderV3_1A_AssignedCustodian_representedCustodianOrganization_2_23_8_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedCustodian_representedCustodianOrganization_2_23_8_i_a-error_mdht" name="p-USRealmHeaderV3_1A_AssignedCustodian_representedCustodianOrganization_2_23_8_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian
			UML root path: /USRealmHeader2/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: US Realm Header (V3) - 2.23.8.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:5521, R2.1=CONF:1198-5521)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeaderV3_1A_CustodianOrganization_id_2_23_8_i_a_1-error_mdht" see="#p-USRealmHeaderV3_1A_CustodianOrganization_id_2_23_8_i_a_1-error_mdht" name="p-USRealmHeaderV3_1A_CustodianOrganization_id_2_23_8_i_a_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.8.i.a.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5522, R2.1=CONF:1198-5522)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeaderV3_1A_CustodianOrganization_addr_2_23_8_i_a_4-error_mdht" see="#p-USRealmHeaderV3_1A_CustodianOrganization_addr_2_23_8_i_a_4-error_mdht" name="p-USRealmHeaderV3_1A_CustodianOrganization_addr_2_23_8_i_a_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.8.i.a.4 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5559, R2.1=CONF:1198-5559)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeaderV3_1A_CustodianOrganization_telecom_2_23_8_i_a_3-error_mdht" see="#p-USRealmHeaderV3_1A_CustodianOrganization_telecom_2_23_8_i_a_3-error_mdht" name="p-USRealmHeaderV3_1A_CustodianOrganization_telecom_2_23_8_i_a_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.telecom.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: US Realm Header (V3) - 2.23.8.i.a.3 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:5525, R2.1=CONF:1198-5525)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeaderV3_1A_CustodianOrganization_ProviderOrganization_2_23_5_i_e-error_mdht" see="#p-USRealmHeaderV3_1A_CustodianOrganization_ProviderOrganization_2_23_5_i_e-error_mdht" name="p-USRealmHeaderV3_1A_CustodianOrganization_ProviderOrganization_2_23_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: US Realm Header (V3) - 2.23.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-USRealmHeaderV3_1A_CustodianOrganization_name_2_23_8_i_a_2-error_mdht" see="#p-USRealmHeaderV3_1A_CustodianOrganization_name_2_23_8_i_a_2-error_mdht" name="p-USRealmHeaderV3_1A_CustodianOrganization_name_2_23_8_i_a_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.name.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.8.i.a.2 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5524, R2.1=CONF:1198-5524)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_23_8_i_a_3_i-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_23_8_i_a_3_i-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_23_8_i_a_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.23.8.i.a.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7998, R2.1=CONF:1198-7998)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-USRealmHeaderV3_1A_InformationRecipient_intendedRecipient_2_23_9_i-error_mdht" see="#p-USRealmHeaderV3_1A_InformationRecipient_intendedRecipient_2_23_9_i-error_mdht" name="p-USRealmHeaderV3_1A_InformationRecipient_intendedRecipient_2_23_9_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient
			UML root path: /USRealmHeader2/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::USRealmHeader2::InformationRecipient::IntendedRecipient))
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: US Realm Header (V3) - 2.23.9.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:1198-5566)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-USRealmHeaderV3_1A_IntendedRecipient_id_2_23_9_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_IntendedRecipient_id_2_23_9_i_a-error_mdht" name="p-USRealmHeaderV3_1A_IntendedRecipient_id_2_23_9_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: USRealmHeader2InformationRecipientIntendedRecipientId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: US Realm Header (V3) - 2.23.9.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:1198-32399)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-USRealmHeaderV3_1A_IntendedRecipient_informationRecipient_2_23_9_i_b-error_mdht" see="#p-USRealmHeaderV3_1A_IntendedRecipient_informationRecipient_2_23_9_i_b-error_mdht" name="p-USRealmHeaderV3_1A_IntendedRecipient_informationRecipient_2_23_9_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Person))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &lt;= 1">Error: US Realm Header (V3) - 2.23.9.i.b informationRecipient
		Conformance: MAY contain zero or one [0..1] informationRecipient (CONF:5568, R2.1=CONF:1198-5567)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-USRealmHeaderV3_1A_IntendedRecipient_recievedOrganization_2_23_9_i_c-error_mdht" see="#p-USRealmHeaderV3_1A_IntendedRecipient_recievedOrganization_2_23_9_i_c-error_mdht" name="p-USRealmHeaderV3_1A_IntendedRecipient_recievedOrganization_2_23_9_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.receivedOrganization->select(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Organization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization
		-->
	<assert test="count(cda:receivedOrganization) &lt;= 1">Error: US Realm Header (V3) - 2.23.9.i.c recievedOrganization
		Conformance: MAY contain zero or one [0..1] receivedOrganization (CONF:5577, R2.1=CONF:1198-5577)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeaderV3_1A_Person_name_2_23_9_i_b_1-error_mdht" see="#p-USRealmHeaderV3_1A_Person_name_2_23_9_i_b_1-error_mdht" name="p-USRealmHeaderV3_1A_Person_name_2_23_9_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient/informationRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.9.i.b.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5568)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Organization -->

<pattern id="p-USRealmHeaderV3_1A_Organization_name_2_23_9_i_c_1-error_mdht" see="#p-USRealmHeaderV3_1A_Organization_name_2_23_9_i_c_1-error_mdht" name="p-USRealmHeaderV3_1A_Organization_name_2_23_9_i_c_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient/recievedOrganization
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient/recievedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">
		<!--
			OCL: self.name->size() = 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName
		-->
	<assert test="count(cda:name) = 1">Error: US Realm Header (V3) - 2.23.9.i.c.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5578, R2.1=CONF:1198-5578)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeaderV3_1A_LegalAuthenticator_time_2_23_10_i-error_mdht" see="#p-USRealmHeaderV3_1A_LegalAuthenticator_time_2_23_10_i-error_mdht" name="p-USRealmHeaderV3_1A_LegalAuthenticator_time_2_23_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorTime
		-->
	<assert test="cda:time">Error: US Realm Header (V3) - 2.23.10.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5580, R2.1=CONF:1198-5580)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeaderV3_1A_LegalAuthenticator_assignedEntity_2_23_10_iv-error_mdht" see="#p-USRealmHeaderV3_1A_LegalAuthenticator_assignedEntity_2_23_10_iv-error_mdht" name="p-USRealmHeaderV3_1A_LegalAuthenticator_assignedEntity_2_23_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header (V3) - 2.23.10.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585, R2.1=CONF:1198-5585)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeaderV3_1A_LegalAuthenticator_sDTCSignatureText_2_23_10_iii-error_mdht" see="#p-USRealmHeaderV3_1A_LegalAuthenticator_sDTCSignatureText_2_23_10_iii-error_mdht" name="p-USRealmHeaderV3_1A_LegalAuthenticator_sDTCSignatureText_2_23_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2LegalAuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: US Realm Header (V3) - 2.23.10.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30810)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeaderV3_1A_LegalAuthenticator_signatureCode_2_23_10_ii-error_mdht" see="#p-USRealmHeaderV3_1A_LegalAuthenticator_signatureCode_2_23_10_ii-error_mdht" name="p-USRealmHeaderV3_1A_LegalAuthenticator_signatureCode_2_23_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: US Realm Header (V3) - 2.23.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: US Realm Header (V3) - 2.23.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_10_iv_c-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_10_iv_c-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_10_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.10.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5589, R2.1=CONF:1198-5589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_10_iv_a-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_10_iv_a-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_10_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.10.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5586, R2.1=CONF:1198-5586)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_ProviderOrganization_2_23_5_i_e-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_ProviderOrganization_2_23_5_i_e-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_ProviderOrganization_2_23_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: US Realm Header (V3) - 2.23.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id MAY contain zero or one [0..1] @root=&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_10_iv_b-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_10_iv_b-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_10_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header (V3) - 2.23.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: US Realm Header (V3) - 2.23.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_10_iv_e-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_10_iv_e-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_10_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: US Realm Header (V3) - 2.23.10.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597, R2.1=CONF:1198-5597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_10_iv_d-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_10_iv_d-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_10_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: US Realm Header (V3) - 2.23.10.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5595, R2.1=CONF:1198-5595)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_23_10_iv_d_1-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_23_10_iv_d_1-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_23_10_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.23.10.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7999, R2.1=CONF:1198-7999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeaderV3_1A_Person_name_2_23_10_iv_e_1-error_mdht" see="#p-USRealmHeaderV3_1A_Person_name_2_23_10_iv_e_1-error_mdht" name="p-USRealmHeaderV3_1A_Person_name_2_23_10_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.10.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5598, R2.1=CONF:1198-5598)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeaderV3_1A_Authenticator_sDTCSignatureText_2_23_11_iii-error_mdht" see="#p-USRealmHeaderV3_1A_Authenticator_sDTCSignatureText_2_23_11_iii-error_mdht" name="p-USRealmHeaderV3_1A_Authenticator_sDTCSignatureText_2_23_11_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2AuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: US Realm Header (V3) - 2.23.11.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30811)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeaderV3_1A_Authenticator_assignedEntity_2_23_11_iv-error_mdht" see="#p-USRealmHeaderV3_1A_Authenticator_assignedEntity_2_23_11_iv-error_mdht" name="p-USRealmHeaderV3_1A_Authenticator_assignedEntity_2_23_11_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header (V3) - 2.23.11.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5612, R2.1=CONF:1198-5612)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeaderV3_1A_Authenticator_signatureCode_2_23_11_ii-error_mdht" see="#p-USRealmHeaderV3_1A_Authenticator_signatureCode_2_23_11_ii-error_mdht" name="p-USRealmHeaderV3_1A_Authenticator_signatureCode_2_23_11_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: US Realm Header (V3) - 2.23.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: US Realm Header (V3) - 2.23.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeaderV3_1A_Authenticator_time_2_23_11_i-error_mdht" see="#p-USRealmHeaderV3_1A_Authenticator_time_2_23_11_i-error_mdht" name="p-USRealmHeaderV3_1A_Authenticator_time_2_23_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorTime
		-->
	<assert test="cda:time">Error: US Realm Header (V3) - 2.23.11.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5608, R2.1=CONF:1198-5608)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_11_iv_c-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_11_iv_c-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_11_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.11.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5616, R2.1=CONF:1198-5616)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_11_iv_b-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_11_iv_b-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_11_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header (V3) - 2.23.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: US Realm Header (V3) - 2.23.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_11_iv_a-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_11_iv_a-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_11_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.11.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5613, R2.1=CONF:1198-5613)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_11_iv_d-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_11_iv_d-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_11_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: US Realm Header (V3) - 2.23.11.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5622, R2.1=CONF:1198-5622)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_11_iv_e-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_11_iv_e-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_11_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: US Realm Header (V3) - 2.23.11.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5624, R2.1=CONF:1198-5624)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-USRealmHeaderV3_1A_TEL_use_2_23_11_iv_d_1-error_mdht" see="#p-USRealmHeaderV3_1A_TEL_use_2_23_11_iv_d_1-error_mdht" name="p-USRealmHeaderV3_1A_TEL_use_2_23_11_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/authenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: US Realm Header (V3) - 2.23.11.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:8000, R2.1=CONF:1198-8000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeaderV3_1A_Person_name_2_23_11_iv_e_1-error_mdht" see="#p-USRealmHeaderV3_1A_Person_name_2_23_11_iv_e_1-error_mdht" name="p-USRealmHeaderV3_1A_Person_name_2_23_11_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.11.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5625, R2.1=CONF:1198-5625)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_12_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_12_i_a-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_12_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.12.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9945, R2.1=CONF:1198-9945)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_12_i_d-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_12_i_d-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_12_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: US Realm Header (V3) - 2.23.12.i.d assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:8221, R2.1=CONF:1198-8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_12_i_b-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_12_i_b-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_12_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header (V3) - 2.23.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: US Realm Header (V3) - 2.23.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_12_i_c-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_12_i_c-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_12_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: US Realm Header (V3) - 2.23.12.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:1198-8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-USRealmHeaderV3_1A_Person_name_2_23_12_i_d_1-error_mdht" see="#p-USRealmHeaderV3_1A_Person_name_2_23_12_i_d_1-error_mdht" name="p-USRealmHeaderV3_1A_Person_name_2_23_12_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/informant/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: US Realm Header (V3) - 2.23.12.i.d.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:8222, CONF:10420, R2.1=CONF:1198-8222)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-USRealmHeaderV3_1A_RelatedEntity_addr_2_23_12_ii_a-error_mdht" see="#p-USRealmHeaderV3_1A_RelatedEntity_addr_2_23_12_ii_a-error_mdht" name="p-USRealmHeaderV3_1A_RelatedEntity_addr_2_23_12_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/relatedEntity
			UML root path: /USRealmHeader2/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: (not ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())))
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)])">Error: US Realm Header (V3) - 2.23.12.ii.a addr
		Conformance: contain  [0..0] addr
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InFulfillmentOf -->

<pattern id="p-USRealmHeaderV3_1A_InFulfillmentOf_order_2_23_13_i-error_mdht" see="#p-USRealmHeaderV3_1A_InFulfillmentOf_order_2_23_13_i-error_mdht" name="p-USRealmHeaderV3_1A_InFulfillmentOf_order_2_23_13_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf
			UML root path: /USRealmHeader2/inFulfillmentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf">
		<!--
			OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::GeneralHeaderConstraints::InFulfillmentOf::Order))
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrder
		-->
	<assert test="count(cda:order)=1">Error: US Realm Header (V3) - 2.23.13.i order
		Conformance: SHALL contain exactly one [1..1] order (CONF:9953, R2.1=CONF:1198-9953)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Order -->

<pattern id="p-USRealmHeaderV3_1A_Order_id_2_23_13_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_Order_id_2_23_13_i_a-error_mdht" name="p-USRealmHeaderV3_1A_Order_id_2_23_13_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf/order
			UML root path: /USRealmHeader2/inFulfillmentOf/order
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrderId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.13.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9954, R2.1=CONF:1198-9954)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-USRealmHeaderV3_2_ComponentOf_encompassingEncounter_2_23_14_i-error_mdht" see="#p-USRealmHeaderV3_2_ComponentOf_encompassingEncounter_2_23_14_i-error_mdht" name="p-USRealmHeaderV3_2_ComponentOf_encompassingEncounter_2_23_14_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf
			UML root path: /USRealmHeader2/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::USRealmHeader2::ComponentOf::EncompassingEncounter))
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: US Realm Header (V3) - 2.23.14.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:1198-9956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-USRealmHeaderV3_2_EncompassingEncounter_id_2_23_14_i_a-error_mdht" see="#p-USRealmHeaderV3_2_EncompassingEncounter_id_2_23_14_i_a-error_mdht" name="p-USRealmHeaderV3_2_EncompassingEncounter_id_2_23_14_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.14.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9959, R2.1=CONF:1198-9959)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-USRealmHeaderV3_2_EncompassingEncounter_effectiveTime_2_23_14_i_b-error_mdht" see="#p-USRealmHeaderV3_2_EncompassingEncounter_effectiveTime_2_23_14_i_b-error_mdht" name="p-USRealmHeaderV3_2_EncompassingEncounter_effectiveTime_2_23_14_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: US Realm Header (V3) - 2.23.14.i.b effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:9958, R2.1=CONF:1198-9958)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-USRealmHeaderV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" see="#p-USRealmHeaderV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" name="p-USRealmHeaderV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: US Realm Header (V3) - 2.6.21 ParticipantSupport
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: SHALL contain associatedEntity/associatedPerson AND/OR associatedEntity/scopingOrganization
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-USRealmHeaderV3_1A_ParticipantSupport_time_2_23_15_i-error_mdht" see="#p-USRealmHeaderV3_1A_ParticipantSupport_time_2_23_15_i-error_mdht" name="p-USRealmHeaderV3_1A_ParticipantSupport_time_2_23_15_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: US Realm Header (V3) - 2.23.15.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004, R2.1=CONF:1198-10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-USRealmHeaderV3_1A_DocumentationOf_serviceEvent_2_23_16_i-error_mdht" see="#p-USRealmHeaderV3_1A_DocumentationOf_serviceEvent_2_23_16_i-error_mdht" name="p-USRealmHeaderV3_1A_DocumentationOf_serviceEvent_2_23_16_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf
			UML root path: /USRealmHeader2/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::USRealmHeader2::DocumentationOf::ServiceEvent))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: US Realm Header (V3) - 2.23.16.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:1198-14836)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeaderV3_1A_ServiceEvent_performer_2_23_16_i_b-error_mdht" see="#p-USRealmHeaderV3_1A_ServiceEvent_performer_2_23_16_i_b-error_mdht" name="p-USRealmHeaderV3_1A_ServiceEvent_performer_2_23_16_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent
			UML root path: /USRealmHeader2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::USRealmHeader2::DocumentationOf::ServiceEvent::Performer1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: US Realm Header (V3) - 2.23.16.i.b performer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:1198-14839)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeaderV3_1A_ServiceEvent_effectiveTime_2_23_16_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_ServiceEvent_effectiveTime_2_23_16_i_a-error_mdht" name="p-USRealmHeaderV3_1A_ServiceEvent_effectiveTime_2_23_16_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent
			UML root path: /USRealmHeader2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: US Realm Header (V3) - 2.23.16.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:14837, R2.1=CONF:1198-14837)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeaderV3_1A_Performer1_assignedEntity_2_23_16_i_b_3-error_mdht" see="#p-USRealmHeaderV3_1A_Performer1_assignedEntity_2_23_16_i_b_3-error_mdht" name="p-USRealmHeaderV3_1A_Performer1_assignedEntity_2_23_16_i_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeader2::DocumentationOf::ServiceEvent::Performer1::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header (V3) - 2.23.16.i.b.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-14841)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeaderV3_1A_Performer1_functionCode_2_23_16_i_b_2-error_mdht" see="#p-USRealmHeaderV3_1A_Performer1_functionCode_2_23_16_i_b_2-error_mdht" name="p-USRealmHeaderV3_1A_Performer1_functionCode_2_23_16_i_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode">Error: US Realm Header (V3) - 2.23.16.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:1198-16818), which SHOULD be selected from ValueSet ParticipationFunction 2.16.840.1.113883.1.11.10267 STATIC 2014-09-01 (CONF:1198-32889)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.88' and (value.code = 'ADMPHYS' or value.code = 'ANEST' or value.code = 'ANRS' or value.code = 'ATTPHYS' or value.code = 'DISPHYS' or value.code = 'FASST' or value.code = 'MDWF' or value.code = 'NASST' or value.code = 'PCP' or value.code = 'PRISURG' or value.code = 'RNDPHYS' or value.code = 'SASST' or value.code = 'SNRS' or value.code = 'TASST'))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode and cda:functionCode[@codeSystem = '2.16.840.1.113883.5.88' and (@code = 'ADMPHYS' or @code = 'ANEST' or @code = 'ANRS' or @code = 'ATTPHYS' or @code = 'DISPHYS' or @code = 'FASST' or @code = 'MDWF' or @code = 'NASST' or @code = 'PCP' or @code = 'PRISURG' or @code = 'RNDPHYS' or @code = 'SASST' or @code = 'SNRS' or @code = 'TASST')]">Error: US Realm Header (V3) - 2.23.16.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:1198-16818), which SHOULD be selected from ValueSet ParticipationFunction 2.16.840.1.113883.1.11.10267 STATIC 2014-09-01 (CONF:1198-32889)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-USRealmHeaderV3_1A_Performer1_typeCode_2_23_16_i_b_1-error_mdht" see="#p-USRealmHeaderV3_1A_Performer1_typeCode_2_23_16_i_b_1-error_mdht" name="p-USRealmHeaderV3_1A_Performer1_typeCode_2_23_16_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: isDefined('typeCode')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode
		-->
	<assert test="attribute::node()[name() = 'typeCode']">Error: US Realm Header (V3) - 2.23.16.i.b.1 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode (CONF:14840, R2.1=CONF:1198-14840)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_16_i_b_3_ii-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_16_i_b_3_ii-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_16_i_b_3_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header (V3) - 2.23.16.i.b.3.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-14842)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: US Realm Header (V3) - 2.23.16.i.b.3.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-14842)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_16_i_b_3_i-error_mdht" see="#p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_16_i_b_3_i-error_mdht" name="p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_16_i_b_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header (V3) - 2.23.16.i.b.3.i id
		Conformance: SHALL contain at least one [1..*] id (CONF:14846, R2.1=CONF:1198-14846)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-USRealmHeaderV3_1A_Authorization_consent_2_23_17_i-error_mdht" see="#p-USRealmHeaderV3_1A_Authorization_consent_2_23_17_i-error_mdht" name="p-USRealmHeaderV3_1A_Authorization_consent_2_23_17_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization
			UML root path: /USRealmHeader2/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::GeneralHeaderConstraints::Authorization::Consent))
			Constraint name: GeneralHeaderConstraintsAuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: US Realm Header (V3) - 2.23.17.i consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:16793, R2.1=CONF:1198-16793)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeaderV3_1A_Consent_id_2_23_17_i_a-error_mdht" see="#p-USRealmHeaderV3_1A_Consent_id_2_23_17_i_a-error_mdht" name="p-USRealmHeaderV3_1A_Consent_id_2_23_17_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: US Realm Header (V3) - 2.23.17.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:16794, R2.1=CONF:1198-16794)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeaderV3_1A_Consent_code_2_23_17_i_b-error_mdht" see="#p-USRealmHeaderV3_1A_Consent_code_2_23_17_i_b-error_mdht" name="p-USRealmHeaderV3_1A_Consent_code_2_23_17_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header (V3) - 2.23.17.i.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16795, R2.1=CONF:1198-16795)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeaderV3_1A_Consent_statusCode_2_23_17_i_c-error_mdht" see="#p-USRealmHeaderV3_1A_Consent_statusCode_2_23_17_i_c-error_mdht" name="p-USRealmHeaderV3_1A_Consent_statusCode_2_23_17_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCodeP
		-->
	<assert test="cda:statusCode">Error: US Realm Header (V3) - 2.23.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: US Realm Header (V3) - 2.23.17.i.c statusCode
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
	<assert test="/cda:ClinicalDocument/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization</assert>
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
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
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
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">Cannot find context /cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf/cda:order</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
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

	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_id_2_23_4-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_confidentialityCode_2_23_8-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_setId_2_23_10-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_effectiveTime_2_23_7-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_author_2_23_7-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_authenticator_2_23_11-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_documentationOf_2_23_16-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_recordTarget_2_23_5-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_legalAuthenticator_2_23_10-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_code_2_23_5-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_languageCode_2_23_9-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_templateId_2_23_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_2_USRealmHeaderV3_componentOf_2_23_14-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_typeId_2_23_3-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_custodian_2_23_8-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_informationRecipient_2_23_9-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_informant_2_23_12-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_inFulfillmentOf_2_23_13-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_versionNumber_2_23_11-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_authorization_2_23_17-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_title_2_23_4-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_dataEnterer_2_23_6-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_supportParticipant_2_23_15-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmHeaderV3_realmCode_2_23_3-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_RecordTarget_patientRole_2_23_5_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_PatientRole_patient_2_23_5_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_PatientRole_id_2_23_5_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_PatientRole_addr_2_23_5_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_PatientRole_providerOrganization_2_23_5_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_PatientRole_telecom_2_23_5_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_birthTime_2_23_5_i_e_8-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_sDTCRaceCode_2_23_5_i_e_7-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_ethnicGroupCode_2_23_5_i_e_7-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_guardian_2_23_5_i_e_9-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_raceCode_2_23_5_i_e_6-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_administrativeGenderCode_2_23_5_i_e_2-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_languageCommunication_2_23_5_i_e_10-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_birthplace_2_23_5_i_e_11-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_maritalStatusCode_2_23_5_i_e_4-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_religiousAffiliationCode_2_23_5_i_e_5-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Patient_name_2_23_5_i_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Guardian_addr_2_23_5_i_e_9_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Guardian_code_2_23_5_i_e_9_ii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Guardian_telecom_2_23_5_i_e_9_iii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Guardian_guardianPerson_2_23_5_i_e_9_iv-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_23_5_i_b_7-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Person_name_2_23_5_i_e_9_iv_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LanguageCommunication_preferenceInd_2_23_5_i_e_10_iv-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LanguageCommunication_languageCode_2_23_5_i_e_10_iii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LanguageCommunication_modeCode_2_23_5_i_e_10_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LanguageCommunication_proficiencyLevelCode_2_23_5_i_e_10_ii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TS_value_2_23_5_i_e_8_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Birthplace_place_2_23_5_i_e_11_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Place_addr_2_23_5_i_e_11_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_23_5_i_e_5-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ProviderOrganization_name_2_23_5_i_e_2-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ProviderOrganization_telecom_2_23_5_i_e_3-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ProviderOrganization_addr_2_23_5_i_e_4-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ProviderOrganization_id_2_23_5_i_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_e_3_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_23_5_i_c_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_DataEnterer_assignedEntity_2_23_6_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_6_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_6_i_d-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_6_i_d-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_6_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_6_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_23_6_i_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Person_name_2_23_6_i_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Author_time_2_23_7_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Author_assignedAuthor_2_23_7_ii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedAuthor_addr_2_23_7_ii_c-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedAuthor_id_2_23_7_ii_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedAuthor_code_2_23_7_ii_d-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedAuthor_telecom_2_23_7_ii_d-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AuthoringDevice_softwareName_2_23_7_ii_e_2-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AuthoringDevice_manufacturerModelName_2_23_7_ii_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_23_7_ii_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Person_name_2_23_7_ii_f_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Custodian_assignedCustodian_2_23_8_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedCustodian_representedCustodianOrganization_2_23_8_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_CustodianOrganization_id_2_23_8_i_a_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_CustodianOrganization_addr_2_23_8_i_a_4-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_CustodianOrganization_telecom_2_23_8_i_a_3-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_CustodianOrganization_ProviderOrganization_2_23_5_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_CustodianOrganization_name_2_23_8_i_a_2-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_23_8_i_a_3_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_InformationRecipient_intendedRecipient_2_23_9_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_IntendedRecipient_id_2_23_9_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_IntendedRecipient_informationRecipient_2_23_9_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_IntendedRecipient_recievedOrganization_2_23_9_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Person_name_2_23_9_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Organization_name_2_23_9_i_c_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LegalAuthenticator_time_2_23_10_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LegalAuthenticator_assignedEntity_2_23_10_iv-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LegalAuthenticator_sDTCSignatureText_2_23_10_iii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_LegalAuthenticator_signatureCode_2_23_10_ii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_10_iv_c-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_10_iv_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_ProviderOrganization_2_23_5_i_e-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_10_iv_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_10_iv_e-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_10_iv_d-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_23_10_iv_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Person_name_2_23_10_iv_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Authenticator_sDTCSignatureText_2_23_11_iii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Authenticator_assignedEntity_2_23_11_iv-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Authenticator_signatureCode_2_23_11_ii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Authenticator_time_2_23_11_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_11_iv_c-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_11_iv_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_11_iv_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_telecom_2_23_11_iv_d-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_11_iv_e-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_TEL_use_2_23_11_iv_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Person_name_2_23_11_iv_e_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_12_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_assignedPerson_2_23_12_i_d-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_12_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_addr_2_23_12_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Person_name_2_23_12_i_d_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_RelatedEntity_addr_2_23_12_ii_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_InFulfillmentOf_order_2_23_13_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Order_id_2_23_13_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_2_ComponentOf_encompassingEncounter_2_23_14_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_2_EncompassingEncounter_id_2_23_14_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_2_EncompassingEncounter_effectiveTime_2_23_14_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ParticipantSupport_time_2_23_15_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_DocumentationOf_serviceEvent_2_23_16_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ServiceEvent_performer_2_23_16_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_ServiceEvent_effectiveTime_2_23_16_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Performer1_assignedEntity_2_23_16_i_b_3-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Performer1_functionCode_2_23_16_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Performer1_typeCode_2_23_16_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_code_2_23_16_i_b_3_ii-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_AssignedEntity_id_2_23_16_i_b_3_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Authorization_consent_2_23_17_i-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Consent_id_2_23_17_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Consent_code_2_23_17_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeaderV3_1A_Consent_statusCode_2_23_17_i_c-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
