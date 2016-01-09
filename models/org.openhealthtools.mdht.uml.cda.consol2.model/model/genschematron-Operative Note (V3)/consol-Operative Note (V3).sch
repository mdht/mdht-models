<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_effectiveTime_2_14_7-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_effectiveTime_2_14_7-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_effectiveTime_2_14_7-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Operative Note (V3) - 2.14.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_templateId_2_14_1-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_templateId_2_14_1-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_templateId_2_14_1-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.7' and id.extension = '2015-08-01')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.7' and @extension = '2015-08-01'">Error: Operative Note (V3) - 2.14.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8483, CONF:1198-10048, CONF:1198-32519 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.7&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_dataEnterer_2_14_6-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_dataEnterer_2_14_6-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_dataEnterer_2_14_6-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: Operative Note (V3) - 2.14.6 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:1198-5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_languageCode_2_14_9-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_languageCode_2_14_9-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_languageCode_2_14_9-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: Operative Note (V3) - 2.14.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: Operative Note (V3) - 2.14.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_confidentialityCode_2_14_8-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_confidentialityCode_2_14_8-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_confidentialityCode_2_14_8-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: Operative Note (V3) - 2.14.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: Operative Note (V3) - 2.14.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_recordTarget_2_14_5-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_recordTarget_2_14_5-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_recordTarget_2_14_5-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: GeneralHeaderConstraintsRecordTarget
		-->
	<assert test="cda:recordTarget">Error: Operative Note (V3) - 2.14.5 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:1198-5266)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_inFulfillmentOf_2_14_13-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_inFulfillmentOf_2_14_13-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_inFulfillmentOf_2_14_13-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: Operative Note (V3) - 2.14.13 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:1198-9952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_realmCode_2_14_3-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_realmCode_2_14_3-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_realmCode_2_14_3-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: Operative Note (V3) - 2.14.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: Operative Note (V3) - 2.14.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_setId_2_14_10-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_setId_2_14_10-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_setId_2_14_10-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: Operative Note (V3) - 2.14.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_documentationOf_2_14_4-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_documentationOf_2_14_4-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_documentationOf_2_14_4-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
			Constraint name: OperativeNote2DocumentationOf
		-->
	<assert test="cda:documentationOf">Error: Operative Note (V3) - 2.14.4 documentationOf
		Conformance: SHALL contain at least one [1..*] documentationOf (CONF:1198-8486)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_author_2_14_7-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_author_2_14_7-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_author_2_14_7-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: Operative Note (V3) - 2.14.7 author
		Conformance: SHALL contain at least one [1..*] author (CONF:1198-5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_informant_2_14_12-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_informant_2_14_12-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_informant_2_14_12-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: Operative Note (V3) - 2.14.12 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:1198-8001, CONF:1198-31355)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_authorization_2_14_5-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_authorization_2_14_5-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_authorization_2_14_5-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() <= 1
			Constraint name: OperativeNote2Authorization
		-->
	<assert test="count(cda:authorization) &lt;= 1">Error: Operative Note (V3) - 2.14.5 authorization
		Conformance: MAY contain zero or one [0..1] authorization (CONF:1198-32404)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteV3_componentOf_2_14_14-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteV3_componentOf_2_14_14-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteV3_componentOf_2_14_14-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: GeneralHeaderConstraintsComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: Operative Note (V3) - 2.14.14 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:1198-9955)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_supportParticipant_2_14_15-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_supportParticipant_2_14_15-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_supportParticipant_2_14_15-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: Operative Note (V3) - 2.14.15 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:1198-10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_typeId_2_14_3-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_typeId_2_14_3-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_typeId_2_14_3-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: Operative Note (V3) - 2.14.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_versionNumber_2_14_11-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_versionNumber_2_14_11-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_versionNumber_2_14_11-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: Operative Note (V3) - 2.14.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_custodian_2_14_8-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_custodian_2_14_8-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_custodian_2_14_8-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: GeneralHeaderConstraintsCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: Operative Note (V3) - 2.14.8 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:1198-5519)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_title_2_14_4-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_title_2_14_4-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_title_2_14_4-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 2.14.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1198-5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_informationRecipient_2_14_9-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_informationRecipient_2_14_9-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_informationRecipient_2_14_9-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: Operative Note (V3) - 2.14.9 informationRecipient
		Conformance: MAY contain zero or more [0..*] informationRecipient (CONF:1198-5565)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteV3_component_2_14_6-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteV3_component_2_14_6-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteV3_component_2_14_6-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component))
			Constraint name: OperativeNote2Component
		-->
	<assert test="count(cda:component)=1">Error: Operative Note (V3) - 2.14.6 component
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_code_2_14_3-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_code_2_14_3-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_code_2_14_3-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 2.14.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-17187), which SHALL be selected from ValueSet SurgicalOperationNoteDocumentTypeCode 2.16.840.1.113883.11.20.1.1 DYNAMIC (CONF:1198-17188)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11504-8' or value.code = '34137-0' or value.code = '28583-3' or value.code = '28624-5' or value.code = '28573-4' or value.code = '34877-1' or value.code = '34874-8' or value.code = '34870-6' or value.code = '34868-0' or value.code = '34818-5')
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.1' and (@code = '11504-8' or @code = '34137-0' or @code = '28583-3' or @code = '28624-5' or @code = '28573-4' or @code = '34877-1' or @code = '34874-8' or @code = '34870-6' or @code = '34868-0' or @code = '34818-5')]">Error: Operative Note (V3) - 2.14.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-17187), which SHALL be selected from ValueSet SurgicalOperationNoteDocumentTypeCode 2.16.840.1.113883.11.20.1.1 DYNAMIC (CONF:1198-17188)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_legalAuthenticator_2_14_10-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_legalAuthenticator_2_14_10-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_legalAuthenticator_2_14_10-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: Operative Note (V3) - 2.14.10 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:1198-5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_id_2_14_4-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_id_2_14_4-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_id_2_14_4-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363, R2.1=CONF:1198-5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNote2: 2.16.840.1.113883.10.20.22.1.7 -->

<pattern id="p-OperativeNoteV3_1A_OperativeNoteV3_authenticator_2_14_11-error_mdht" see="#p-OperativeNoteV3_1A_OperativeNoteV3_authenticator_2_14_11-error_mdht" name="p-OperativeNoteV3_1A_OperativeNoteV3_authenticator_2_14_11-error_mdht">
		<!--
			UML path: /OperativeNote2
			UML root path: /OperativeNote2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: Operative Note (V3) - 2.14.11 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:1198-5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-OperativeNoteV3_1A_DocumentationOf_serviceEvent_2_14_4_i-error_mdht" see="#p-OperativeNoteV3_1A_DocumentationOf_serviceEvent_2_14_4_i-error_mdht" name="p-OperativeNoteV3_1A_DocumentationOf_serviceEvent_2_14_4_i-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf
			UML root path: /OperativeNote2/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::OperativeNote2::DocumentationOf::ServiceEvent))
			Constraint name: OperativeNote2DocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: Operative Note (V3) - 2.14.4.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:1198-8493)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-OperativeNoteV3_1A_ServiceEvent_effectiveTime_2_14_4_i_a-error_mdht" see="#p-OperativeNoteV3_1A_ServiceEvent_effectiveTime_2_14_4_i_a-error_mdht" name="p-OperativeNoteV3_1A_ServiceEvent_effectiveTime_2_14_4_i_a-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent
			UML root path: /OperativeNote2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: OperativeNote2DocumentationOfServiceEventEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Operative Note (V3) - 2.14.4.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:1198-8494)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-OperativeNoteV3_1A_ServiceEvent_performer_2_14_4_i_c-error_mdht" see="#p-OperativeNoteV3_1A_ServiceEvent_performer_2_14_4_i_c-error_mdht" name="p-OperativeNoteV3_1A_ServiceEvent_performer_2_14_4_i_c-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent
			UML root path: /OperativeNote2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::OperativeNote2::DocumentationOf::ServiceEvent::Performer))
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformer
		-->
	<assert test="cda:performer">Error: Operative Note (V3) - 2.14.4.i.c performer
		Conformance: SHALL contain at least one [1..*] performer (CONF:1198-8489)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-OperativeNoteV3_1A_ServiceEvent_code_2_14_4_i_b-error_mdht" see="#p-OperativeNoteV3_1A_ServiceEvent_code_2_14_4_i_b-error_mdht" name="p-OperativeNoteV3_1A_ServiceEvent_code_2_14_4_i_b-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent
			UML root path: /OperativeNote2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: OperativeNote2DocumentationOfServiceEventCode
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 2.14.4.i.b code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-8487)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-OperativeNoteV3_1A_ServiceEvent_performerAssistants_2_14_4_i_d-error_mdht" see="#p-OperativeNoteV3_1A_ServiceEvent_performerAssistants_2_14_4_i_d-error_mdht" name="p-OperativeNoteV3_1A_ServiceEvent_performerAssistants_2_14_4_i_d-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent
			UML root path: /OperativeNote2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::OperativeNote2::DocumentationOf::ServiceEvent::PerformerAssistants))->size() >= 0
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssistants
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: Operative Note (V3) - 2.14.4.i.d performerAssistants
		Conformance: MAY contain zero or more [0..*] performer (CONF:1198-32736)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmDateAndTimeDT -->

<pattern id="p-OperativeNoteV3_1A_USRealmDateAndTimeDT_low_2_14_4_i_a_1-error_mdht" see="#p-OperativeNoteV3_1A_USRealmDateAndTimeDT_low_2_14_4_i_a_1-error_mdht" name="p-OperativeNoteV3_1A_USRealmDateAndTimeDT_low_2_14_4_i_a_1-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent/effectiveTime
			UML root path: /OperativeNote2/documentationOf/serviceEvent/effectiveTime
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.low.oclIsUndefined() ))
			Constraint name: OperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow
		-->
	<assert test="@nullFlavor or cda:low">Error: Operative Note (V3) - 2.14.4.i.a.1 low
		Conformance: SHALL contain exactly one [1..1] low (CONF:1198-8488)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer -->

<pattern id="p-OperativeNoteV3_1A_Performer_typeCode_2_14_4_i_c_1-error_mdht" see="#p-OperativeNoteV3_1A_Performer_typeCode_2_14_4_i_c_1-error_mdht" name="p-OperativeNoteV3_1A_Performer_typeCode_2_14_4_i_c_1-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent/performer
			UML root path: /OperativeNote2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.typeCode=vocab::x_ServiceEventPerformer::PPRF
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerTypeCode
		-->
	<assert test="@typeCode = 'PPRF'">Error: Operative Note (V3) - 2.14.4.i.c.1 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;PPRF&quot;  (CONF:1198-8495)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer -->

<pattern id="p-OperativeNoteV3_1A_Performer_assignedEntity_2_14_4_i_c_2-error_mdht" see="#p-OperativeNoteV3_1A_Performer_assignedEntity_2_14_4_i_c_2-error_mdht" name="p-OperativeNoteV3_1A_Performer_assignedEntity_2_14_4_i_c_2-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent/performer
			UML root path: /OperativeNote2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::OperativeNote2::DocumentationOf::ServiceEvent::Performer::AssignedEntity))
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Operative Note (V3) - 2.14.4.i.c.2 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-10917)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_c_2_i-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_c_2_i-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_c_2_i-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /OperativeNote2/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.12.443' and (value.code = 'CP' or value.code = 'PP' or value.code = 'RP')
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.12.443' and (@code = 'CP' or @code = 'PP' or @code = 'RP')]">Error: Operative Note (V3) - 2.14.4.i.c.2.i code
		Conformance: SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet Provider Role 2.16.840.1.113883.3.88.12.3221.4.2 DYNAMIC (CONF:1198-8490)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 2.14.4.i.c.2.i code
		Conformance: SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet Provider Role 2.16.840.1.113883.3.88.12.3221.4.2 DYNAMIC (CONF:1198-8490)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PerformerAssistants -->

<pattern id="p-OperativeNoteV3_1A_PerformerAssistants_assignedEntity_2_14_4_i_d_2-error_mdht" see="#p-OperativeNoteV3_1A_PerformerAssistants_assignedEntity_2_14_4_i_d_2-error_mdht" name="p-OperativeNoteV3_1A_PerformerAssistants_assignedEntity_2_14_4_i_d_2-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent/performerAssistants
			UML root path: /OperativeNote2/documentationOf/serviceEvent/performerAssistants
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::OperativeNote2::DocumentationOf::ServiceEvent::PerformerAssistants::AssignedEntity))
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Operative Note (V3) - 2.14.4.i.d.2 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-32737)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PerformerAssistants -->

<pattern id="p-OperativeNoteV3_1A_PerformerAssistants_typeCode_2_14_4_i_d_1-error_mdht" see="#p-OperativeNoteV3_1A_PerformerAssistants_typeCode_2_14_4_i_d_1-error_mdht" name="p-OperativeNoteV3_1A_PerformerAssistants_typeCode_2_14_4_i_d_1-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent/performerAssistants
			UML root path: /OperativeNote2/documentationOf/serviceEvent/performerAssistants
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.typeCode=vocab::x_ServiceEventPerformer::SPRF
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode
		-->
	<assert test="@typeCode = 'SPRF'">Error: Operative Note (V3) - 2.14.4.i.d.1 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;SPRF&quot;  (CONF:1198-32738)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_d_2_i-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_d_2_i-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_d_2_i-error_mdht">
		<!--
			UML path: /OperativeNote2/documentationOf/serviceEvent/performerAssistants/assignedEntity
			UML root path: /OperativeNote2/documentationOf/serviceEvent/performerAssistants/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.12.443' and (value.code = 'CP' or value.code = 'PP' or value.code = 'RP')
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.12.443' and (@code = 'CP' or @code = 'PP' or @code = 'RP')]">Error: Operative Note (V3) - 2.14.4.i.d.2.i code
		Conformance: SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet Provider Role 2.16.840.1.113883.3.88.12.3221.4.2 DYNAMIC (CONF:1198-32739)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: OperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 2.14.4.i.d.2.i code
		Conformance: SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet Provider Role 2.16.840.1.113883.3.88.12.3221.4.2 DYNAMIC (CONF:1198-32739)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-OperativeNoteV3_1A_Authorization_typeCode_2_14_5_i-error_mdht" see="#p-OperativeNoteV3_1A_Authorization_typeCode_2_14_5_i-error_mdht" name="p-OperativeNoteV3_1A_Authorization_typeCode_2_14_5_i-error_mdht">
		<!--
			UML path: /OperativeNote2/authorization
			UML root path: /OperativeNote2/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: isDefined('typeCode') and self.typeCode=vocab::ActRelationshipType::AUTH
			Constraint name: OperativeNote2AuthorizationTypeCode
		-->
	<assert test="attribute::node()[name() = 'typeCode'] and @typeCode = 'AUTH'">Error: Operative Note (V3) - 2.14.5.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode=&quot;AUTH&quot;  (CONF:1198-32408)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-OperativeNoteV3_1A_Authorization_consent_2_14_5_ii-error_mdht" see="#p-OperativeNoteV3_1A_Authorization_consent_2_14_5_ii-error_mdht" name="p-OperativeNoteV3_1A_Authorization_consent_2_14_5_ii-error_mdht">
		<!--
			UML path: /OperativeNote2/authorization
			UML root path: /OperativeNote2/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::OperativeNote2::Authorization::Consent))
			Constraint name: OperativeNote2AuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: Operative Note (V3) - 2.14.5.ii consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:1198-32405)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-OperativeNoteV3_1A_Consent_statusCode_2_14_5_ii_c-error_mdht" see="#p-OperativeNoteV3_1A_Consent_statusCode_2_14_5_ii_c-error_mdht" name="p-OperativeNoteV3_1A_Consent_statusCode_2_14_5_ii_c-error_mdht">
		<!--
			UML path: /OperativeNote2/authorization/consent
			UML root path: /OperativeNote2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: OperativeNote2AuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode">Error: Operative Note (V3) - 2.14.5.ii.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1198-32411)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-OperativeNoteV3_1A_Consent_moodCode_2_14_5_ii_b-error_mdht" see="#p-OperativeNoteV3_1A_Consent_moodCode_2_14_5_ii_b-error_mdht" name="p-OperativeNoteV3_1A_Consent_moodCode_2_14_5_ii_b-error_mdht">
		<!--
			UML path: /OperativeNote2/authorization/consent
			UML root path: /OperativeNote2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN
			Constraint name: OperativeNote2AuthorizationConsentMoodCode
		-->
	<assert test="attribute::node()[name() = 'moodCode'] and @moodCode = 'EVN'">Error: Operative Note (V3) - 2.14.5.ii.b moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1198-32410)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-OperativeNoteV3_1A_Consent_classCode_2_14_5_ii_a-error_mdht" see="#p-OperativeNoteV3_1A_Consent_classCode_2_14_5_ii_a-error_mdht" name="p-OperativeNoteV3_1A_Consent_classCode_2_14_5_ii_a-error_mdht">
		<!--
			UML path: /OperativeNote2/authorization/consent
			UML root path: /OperativeNote2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::ActClass::CONS
			Constraint name: OperativeNote2AuthorizationConsentClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'CONS'">Error: Operative Note (V3) - 2.14.5.ii.a classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;CONS&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1198-32409)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_structuredBody_2_14_6_i-error_mdht" see="#p-OperativeNoteV3_2_Component_structuredBody_2_14_6_i-error_mdht" name="p-OperativeNoteV3_2_Component_structuredBody_2_14_6_i-error_mdht">
		<!--
			UML path: /OperativeNote2/component
			UML root path: /OperativeNote2/component
		-->
	<rule context="/cda:ClinicalDocument/cda:component">
		<!--
			OCL: self.structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody))
			Constraint name: OperativeNote2ComponentStructuredBody
		-->
	<assert test="count(cda:structuredBody)=1">Error: Operative Note (V3) - 2.14.6.i structuredBody
		Conformance: SHALL contain exactly one [1..1] structuredBody
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_postoperativeDiagnosisSection_2_14_6_i_h-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_postoperativeDiagnosisSection_2_14_6_i_h-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_postoperativeDiagnosisSection_2_14_6_i_h-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.h postoperativeDiagnosisSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_surgicalDrainsSection_2_14_6_i_p-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_surgicalDrainsSection_2_14_6_i_p-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_surgicalDrainsSection_2_14_6_i_p-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodySurgicalDrainsSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.p surgicalDrainsSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_preoperativeDiagnosisSection2_2_14_6_i_c-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_preoperativeDiagnosisSection2_2_14_6_i_c-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_preoperativeDiagnosisSection2_2_14_6_i_c-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.c preoperativeDiagnosisSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_operativeNoteFluidSection_2_14_6_i_j-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_operativeNoteFluidSection_2_14_6_i_j-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_operativeNoteFluidSection_2_14_6_i_j-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyOperativeNoteFluidSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.j operativeNoteFluidSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_procedureEstimatedBloodLossSection_2_14_6_i_d-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_procedureEstimatedBloodLossSection_2_14_6_i_d-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_procedureEstimatedBloodLossSection_2_14_6_i_d-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.d procedureEstimatedBloodLossSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_operativeNoteSurgicalProcedureSection_2_14_6_i_k-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_operativeNoteSurgicalProcedureSection_2_14_6_i_k-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_operativeNoteSurgicalProcedureSection_2_14_6_i_k-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.k operativeNoteSurgicalProcedureSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_anesthesiaSection2_2_14_6_i_a-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_anesthesiaSection2_2_14_6_i_a-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_anesthesiaSection2_2_14_6_i_a-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyAnesthesiaSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.a anesthesiaSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_procedureIndicationsSection2_2_14_6_i_o-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_procedureIndicationsSection2_2_14_6_i_o-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_procedureIndicationsSection2_2_14_6_i_o-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyProcedureIndicationsSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.o procedureIndicationsSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_procedureFindingsSection2_2_14_6_i_e-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_procedureFindingsSection2_2_14_6_i_e-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_procedureFindingsSection2_2_14_6_i_e-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyProcedureFindingsSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.e procedureFindingsSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_complicationsSection2_2_14_6_i_b-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_complicationsSection2_2_14_6_i_b-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_complicationsSection2_2_14_6_i_b-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyComplicationsSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.b complicationsSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_planOfTreatmentSection2_2_14_6_i_l-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_planOfTreatmentSection2_2_14_6_i_l-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_planOfTreatmentSection2_2_14_6_i_l-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyPlanOfTreatmentSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.l planOfTreatmentSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_plannedProcedureSection2_2_14_6_i_m-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_plannedProcedureSection2_2_14_6_i_m-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_plannedProcedureSection2_2_14_6_i_m-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyPlannedProcedureSection2
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.m plannedProcedureSection2
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_procedureImplantsSection_2_14_6_i_i-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_procedureImplantsSection_2_14_6_i_i-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_procedureImplantsSection_2_14_6_i_i-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyProcedureImplantsSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.i procedureImplantsSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_procedureDescriptionSection_2_14_6_i_g-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_procedureDescriptionSection_2_14_6_i_g-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_procedureDescriptionSection_2_14_6_i_g-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyProcedureDescriptionSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.g procedureDescriptionSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_procedureSpecimensTakenSection_2_14_6_i_f-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_procedureSpecimensTakenSection_2_14_6_i_f-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_procedureSpecimensTakenSection_2_14_6_i_f-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.f procedureSpecimensTakenSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- StructuredBody -->

<pattern id="p-OperativeNoteV3_2_StructuredBody_procedureDispositionSection_2_14_6_i_n-error_mdht" see="#p-OperativeNoteV3_2_StructuredBody_procedureDispositionSection_2_14_6_i_n-error_mdht" name="p-OperativeNoteV3_2_StructuredBody_procedureDispositionSection_2_14_6_i_n-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody
			UML root path: /OperativeNote2/component/structuredBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody">
		<!--
			OCL: self.component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(consol::OperativeNote2::Component::StructuredBody::Component))
			Constraint name: OperativeNote2ComponentStructuredBodyProcedureDispositionSection
		-->
	<assert test="count(cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.n procedureDispositionSection
		Conformance: SHALL contain exactly one [1..1] component
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_anesthesiaSection2_2_14_6_i_a_1-error_mdht" see="#p-OperativeNoteV3_2_Component_anesthesiaSection2_2_14_6_i_a_1-error_mdht" name="p-OperativeNoteV3_2_Component_anesthesiaSection2_2_14_6_i_a_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/anesthesiaSection2
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentAnesthesiaSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25'])=1">Error: Operative Note (V3) - 2.14.6.i.a.1 anesthesiaSection2
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30486, CONF:1198-30487)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AnesthesiaSection2: 2.16.840.1.113883.10.20.22.2.25 -->

<pattern id="p-OperativeNoteV3_2_AnesthesiaSection2_templateId_3_12_1-error_mdht" see="#p-OperativeNoteV3_2_AnesthesiaSection2_templateId_3_12_1-error_mdht" name="p-OperativeNoteV3_2_AnesthesiaSection2_templateId_3_12_1-error_mdht">
		<!--
			UML path: /AnesthesiaSection2
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2/anesthesiaSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.25' and id.extension = '2014-06-09')
			Constraint name: AnesthesiaSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25' and @extension = '2014-06-09'">Error: Operative Note (V3) - 3.12.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-8066, CONF:1098-10380, CONF:1098-32531 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.25&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AnesthesiaSection2: 2.16.840.1.113883.10.20.22.2.25 -->

<pattern id="p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_4-error_mdht" see="#p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_4-error_mdht" name="p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_4-error_mdht">
		<!--
			UML path: /AnesthesiaSection2
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2/anesthesiaSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::AnesthesiaSection2::ProcedureActivityProcedure2Entry))
			Constraint name: AnesthesiaSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.12.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AnesthesiaSection2: 2.16.840.1.113883.10.20.22.2.25 -->

<pattern id="p-OperativeNoteV3_2_AnesthesiaSection2_text_3_12_4-error_mdht" see="#p-OperativeNoteV3_2_AnesthesiaSection2_text_3_12_4-error_mdht" name="p-OperativeNoteV3_2_AnesthesiaSection2_text_3_12_4-error_mdht">
		<!--
			UML path: /AnesthesiaSection2
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2/anesthesiaSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: AnesthesiaSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.12.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8069, R2.0=CONF:1098-8069)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AnesthesiaSection2: 2.16.840.1.113883.10.20.22.2.25 -->

<pattern id="p-OperativeNoteV3_2_AnesthesiaSection2_code_3_12_3-error_mdht" see="#p-OperativeNoteV3_2_AnesthesiaSection2_code_3_12_3-error_mdht" name="p-OperativeNoteV3_2_AnesthesiaSection2_code_3_12_3-error_mdht">
		<!--
			UML path: /AnesthesiaSection2
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2/anesthesiaSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: AnesthesiaSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.12.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-15351)/@code=&quot;59774-0&quot; Anesthesia (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-15352, CONF:1098-30830)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59774-0' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: AnesthesiaSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59774-0' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.12.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-15351)/@code=&quot;59774-0&quot; Anesthesia (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-15352, CONF:1098-30830)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AnesthesiaSection2: 2.16.840.1.113883.10.20.22.2.25 -->

<pattern id="p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_5-error_mdht" see="#p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_5-error_mdht" name="p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_5-error_mdht">
		<!--
			UML path: /AnesthesiaSection2
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2/anesthesiaSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::AnesthesiaSection2::MedicationActivity2Entry))
			Constraint name: AnesthesiaSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.12.5 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AnesthesiaSection2: 2.16.840.1.113883.10.20.22.2.25 -->

<pattern id="p-OperativeNoteV3_2_AnesthesiaSection2_title_3_12_3-error_mdht" see="#p-OperativeNoteV3_2_AnesthesiaSection2_title_3_12_3-error_mdht" name="p-OperativeNoteV3_2_AnesthesiaSection2_title_3_12_3-error_mdht">
		<!--
			UML path: /AnesthesiaSection2
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2/anesthesiaSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: AnesthesiaSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.12.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8068, R2.0=CONF:1098-8068)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2Entry -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2Entry_procedureActivityProcedure2_3_12_4_i-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2Entry_procedureActivityProcedure2_3_12_4_i-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2Entry_procedureActivityProcedure2_3_12_4_i-error_mdht">
		<!--
			UML path: /AnesthesiaSection2/entry
			UML root path: /OperativeNote2/component/structuredBody/anesthesiaSection2/anesthesiaSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']/cda:entry">
		<!--
			OCL: self.procedure->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2))->size() >= 0
			Constraint name: AnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure2
		-->
	<assert test="count(cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']) &gt;= 0">Error: Operative Note (V3) - 3.12.4.i procedureActivityProcedure2
		Conformance: MAY contain zero or more [0..*] procedure (CONF:1098-8092, CONF:1098-15447)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_moodCode_4_122_3-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_moodCode_4_122_3-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_moodCode_4_122_3-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentProcedureMood::EVN
			Constraint name: ProcedureActivityProcedureMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Operative Note (V3) - 4.122.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1098-7653)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_priorityCode_4_122_8-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_priorityCode_4_122_8-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_priorityCode_4_122_8-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: ((not self.priorityCode.oclIsUndefined()) and self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())
			Constraint name: ProcedureActivityProcedurePriorityCodeP
		-->
	<assert test="not(cda:priorityCode and not(cda:priorityCode/@nullFlavor)) or cda:priorityCode">Error: Operative Note (V3) - 4.122.8 priorityCode
		Conformance: MAY contain zero or one [0..1] priorityCode, which SHALL be selected from ValueSet Act Priority 2.16.840.1.113883.1.11.16866 DYNAMIC (CONF:7668, R2.0=CONF:1098-7668)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.priorityCode.oclIsUndefined()) and self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined() and self.priorityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.priorityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.7' and (value.code = 'A' or value.code = 'CR' or value.code = 'CS' or value.code = 'CSP' or value.code = 'CSR' or value.code = 'EL' or value.code = 'EM' or value.code = 'P' or value.code = 'PRN' or value.code = 'R' or value.code = 'RR' or value.code = 'S' or value.code = 'T' or value.code = 'UD' or value.code = 'UR'))
			Constraint name: ProcedureActivityProcedurePriorityCode
		-->
	<assert test="not(cda:priorityCode and not(cda:priorityCode/@nullFlavor)) or cda:priorityCode and cda:priorityCode[@codeSystem = '2.16.840.1.113883.5.7' and (@code = 'A' or @code = 'CR' or @code = 'CS' or @code = 'CSP' or @code = 'CSR' or @code = 'EL' or @code = 'EM' or @code = 'P' or @code = 'PRN' or @code = 'R' or @code = 'RR' or @code = 'S' or @code = 'T' or @code = 'UD' or @code = 'UR')]">Error: Operative Note (V3) - 4.122.8 priorityCode
		Conformance: MAY contain zero or one [0..1] priorityCode, which SHALL be selected from ValueSet Act Priority 2.16.840.1.113883.1.11.16866 DYNAMIC (CONF:7668, R2.0=CONF:1098-7668)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_12-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_12-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_12-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProcedureActivityProcedure2::ReactionObservation2EntryRelationship))
			Constraint name: ProcedureActivityProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.122.12 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_classCode_4_122_2-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_classCode_4_122_2-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_classCode_4_122_2-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.classCode=vocab::ActClass::PROC
			Constraint name: ProcedureActivityProcedureClassCode
		-->
	<assert test="@classCode = 'PROC'">Error: Operative Note (V3) - 4.122.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;PROC&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:7652, R2.0=CONF:1098-7652)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_specimen_4_122_6-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_specimen_4_122_6-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_specimen_4_122_6-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.specimen->select(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(cda::Specimen))->size() >= 0
			Constraint name: ProcedureActivityProcedureSpecimen
		-->
	<assert test="count(cda:specimen) &gt;= 0">Error: Operative Note (V3) - 4.122.6 specimen
		Conformance: MAY contain zero or more [0..*] specimen (CONF:1098-7697)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_9-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_9-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_9-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProcedureActivityProcedure2::Instruction2EntryRelationship))
			Constraint name: ProcedureActivityProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.122.9 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_id_4_122_4-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_id_4_122_4-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_id_4_122_4-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: ProcedureActivityProcedureId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.122.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:7655, R2.0=CONF:1098-7655)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_11-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_11-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_11-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProcedureActivityProcedure2::MedicationActivity2EntryRelationship))
			Constraint name: ProcedureActivityProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.122.11 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_authorParticipation_4_122_8-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_authorParticipation_4_122_8-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_authorParticipation_4_122_8-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))
			Constraint name: ProcedureActivityProcedure2AuthorParticipation
		-->
	<assert test="cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">Error: Operative Note (V3) - 4.122.8 authorParticipation
		Conformance: SHOULD contain  [1..*] author such that it  (CONF:1098-32479)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_serviceDeliveryLocation_4_122_12-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_serviceDeliveryLocation_4_122_12-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_serviceDeliveryLocation_4_122_12-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.participant->select(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))->size() >= 0
			Constraint name: ProcedureActivityProcedureServiceDeliveryLocation
		-->
	<assert test="count(cda:participant[cda:participantRole and cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']) &gt;= 0">Error: Operative Note (V3) - 4.122.12 serviceDeliveryLocation
		Conformance: MAY contain  [0..*] participant such that it  (CONF:7765, CONF:15912, R2.0=CONF:1098-7765, R2.0=CONF:1098-15912)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_targetSiteCode_4_122_4-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_targetSiteCode_4_122_4-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_targetSiteCode_4_122_4-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: ((not self.targetSiteCode->isEmpty()) and self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
			Constraint name: ProcedureActivityProcedureTargetSiteCodeP
		-->
	<assert test="not(cda:targetSiteCode and cda:targetSiteCode[not(@nullFlavor)]) or cda:targetSiteCode">Error: Operative Note (V3) - 4.122.4 targetSiteCode
		Conformance: SHOULD contain zero or more [0..*] targetSiteCode (CONF:1098-7683), which SHALL be selected from ValueSet Body Site 2.16.840.1.113883.3.88.12.3221.8.9 DYNAMIC (CONF:1098-16082)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.targetSiteCode->isEmpty()) and self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
			Constraint name: ProcedureActivityProcedureTargetSiteCode
		-->
	<assert test="not(cda:targetSiteCode and cda:targetSiteCode[not(@nullFlavor)]) or not(cda:targetSiteCode[not(. and @codeSystem = '2.16.840.1.113883.6.96' and @code)])">Error: Operative Note (V3) - 4.122.4 targetSiteCode
		Conformance: SHOULD contain zero or more [0..*] targetSiteCode (CONF:1098-7683), which SHALL be selected from ValueSet Body Site 2.16.840.1.113883.3.88.12.3221.8.9 DYNAMIC (CONF:1098-16082)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_10-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_10-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_10-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProcedureActivityProcedure2::Indication2EntryRelationship))
			Constraint name: ProcedureActivityProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.122.10 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_performer_4_122_7-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_performer_4_122_7-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_performer_4_122_7-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->size() >= 0
			Constraint name: ProcedureActivityProcedurePerformer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: Operative Note (V3) - 4.122.7 performer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:1098-7718)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_methodCode_4_122_9-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_methodCode_4_122_9-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_methodCode_4_122_9-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: ((not self.methodCode->isEmpty()) and self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() <= 1)
			Constraint name: ProcedureActivityProcedureMethodCode
		-->
	<assert test="not(cda:methodCode and cda:methodCode[not(@nullFlavor)]) or count(cda:methodCode) &lt;= 1">Error: Operative Note (V3) - 4.122.9 methodCode
		Conformance: MAY contain zero or one [0..1] methodCode (CONF:7670, R2.0=CONF:1098-7670)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_effectiveTime_4_122_7-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_effectiveTime_4_122_7-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_effectiveTime_4_122_7-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: ProcedureActivityProcedureEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Operative Note (V3) - 4.122.7 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:7662, R2.0=CONF:1098-7662)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_templateId_4_122_1-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_templateId_4_122_1-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_templateId_4_122_1-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.14' and id.extension = '2014-06-09')
			Constraint name: ProcedureActivityProcedureTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14' and @extension = '2014-06-09'">Error: Operative Note (V3) - 4.122.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-7654, CONF:1098-10521, CONF:1098-32506 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.14&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_statusCode_4_122_5-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_statusCode_4_122_5-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_statusCode_4_122_5-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: ProcedureActivityProcedureStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Operative Note (V3) - 4.122.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-7661), which SHALL be selected from ValueSet ProcedureAct statusCode 2.16.840.1.113883.11.20.9.22 STATIC 2014-04-23 (CONF:1098-32366)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled'
			Constraint name: ProcedureActivityProcedureStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed' or @code = 'active' or @code = 'aborted' or @code = 'cancelled']">Error: Operative Note (V3) - 4.122.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-7661), which SHALL be selected from ValueSet ProcedureAct statusCode 2.16.840.1.113883.11.20.9.22 STATIC 2014-04-23 (CONF:1098-32366)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_productInstance_4_122_14-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_productInstance_4_122_14-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_productInstance_4_122_14-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: self.participant->select(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))->size() >= 0
			Constraint name: ProcedureActivityProcedureProductInstance
		-->
	<assert test="count(cda:participant[cda:participantRole and cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']) &gt;= 0">Error: Operative Note (V3) - 4.122.14 productInstance
		Conformance: MAY contain  [0..*] participant such that it  (CONF:7751, CONF:15911, R2.0=CONF:1098-7751, R2.0=CONF:1098-15911)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityProcedure2: 2.16.840.1.113883.10.20.22.4.14 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_code_4_122_5-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityProcedure2_code_4_122_5-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityProcedure2_code_4_122_5-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureActivityProcedureCode
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.122.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:7656, R2.0=CONF:1098-7656)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityPerformer -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityPerformer_assignedEntity_4_122_7_i-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityPerformer_assignedEntity_4_122_7_i-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityPerformer_assignedEntity_4_122_7_i-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::ProcedureActivityProcedure2::ProcedureActivityPerformer::ProcedureActivityAssignedEntity))
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Operative Note (V3) - 4.122.7.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1098-7720)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityAssignedEntity -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_addr_4_122_7_i_b-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_addr_4_122_7_i_b-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_addr_4_122_7_i_b-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 4.122.7.i.b addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:1098-7731)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityAssignedEntity -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_id_4_122_7_i_a-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_id_4_122_7_i_a-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_id_4_122_7_i_a-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.122.7.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:7722, R2.0=CONF:1098-7722)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityAssignedEntity -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_representedOrganization_4_122_7_i_d-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_representedOrganization_4_122_7_i_d-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_representedOrganization_4_122_7_i_d-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">
		<!--
			OCL: self.representedOrganization->select(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(consol::ProcedureActivityProcedure::ProcedureActivityPerformer::ProcedureActivityAssignedEntity::ProcedureActivityRepresentedOrganization))->size() <= 1
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganization
		-->
	<assert test="count(cda:representedOrganization) &lt;= 1">Error: Operative Note (V3) - 4.122.7.i.d representedOrganization
		Conformance: SHOULD contain zero or one [0..1] representedOrganization (CONF:7733, R2.0=CONF:1098-7733)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityAssignedEntity -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_telecom_4_122_7_i_c-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_telecom_4_122_7_i_c-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_telecom_4_122_7_i_c-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 4.122.7.i.c telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:1098-7732)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityRepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_id_4_122_7_i_d_1-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_id_4_122_7_i_d_1-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_id_4_122_7_i_d_1-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity/representedOrganization
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Operative Note (V3) - 4.122.7.i.d.1 id
		Conformance: SHOULD contain zero or more [0..*] id (CONF:7734, R2.0=CONF:1098-7734)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityRepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_addr_4_122_7_i_d_4-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_addr_4_122_7_i_d_4-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_addr_4_122_7_i_d_4-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity/representedOrganization
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">
		<!--
			OCL: self.addr->size() = 1
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddr
		-->
	<assert test="count(cda:addr) = 1">Error: Operative Note (V3) - 4.122.7.i.d.4 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:7736, R2.0=CONF:1098-7736)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityRepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_name_4_122_7_i_d_2-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_name_4_122_7_i_d_2-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_name_4_122_7_i_d_2-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity/representedOrganization
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or cda:name">Error: Operative Note (V3) - 4.122.7.i.d.2 name
		Conformance: MAY contain zero or more [0..*] name (CONF:7735, R2.0=CONF:1098-7735)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureActivityRepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_telecom_4_122_7_i_d_3-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_telecom_4_122_7_i_d_3-error_mdht" name="p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_telecom_4_122_7_i_d_3-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/performer/assignedEntity/representedOrganization
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/performer/assignedEntity/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">
		<!--
			OCL: self.telecom->size() = 1
			Constraint name: ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecom
		-->
	<assert test="count(cda:telecom) = 1">Error: Operative Note (V3) - 4.122.7.i.d.3 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:7737, R2.0=CONF:1098-7737)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthorParticipation: 2.16.840.1.113883.10.20.22.4.119 -->

<pattern id="p-OperativeNoteV3_3A_AuthorParticipation_time_4_48_9_ii-error_mdht" see="#p-OperativeNoteV3_3A_AuthorParticipation_time_4_48_9_ii-error_mdht" name="p-OperativeNoteV3_3A_AuthorParticipation_time_4_48_9_ii-error_mdht">
		<!--
			UML path: /AuthorParticipation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: AuthorParticipationTime
		-->
	<assert test="cda:time">Error: Operative Note (V3) - 4.48.9.ii time
		Conformance: SHALL contain exactly one [1..1] time (CONF:1098-31471)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthorParticipation: 2.16.840.1.113883.10.20.22.4.119 -->

<pattern id="p-OperativeNoteV3_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht" see="#p-OperativeNoteV3_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht" name="p-OperativeNoteV3_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht">
		<!--
			UML path: /AuthorParticipation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))
			Constraint name: AuthorParticipationAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: Operative Note (V3) - 4.48.9.iii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1098-31472)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthorParticipation: 2.16.840.1.113883.10.20.22.4.119 -->

<pattern id="p-OperativeNoteV3_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht" see="#p-OperativeNoteV3_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht" name="p-OperativeNoteV3_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht">
		<!--
			UML path: /AuthorParticipation
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.119')
			Constraint name: AuthorParticipationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119'">Error: Operative Note (V3) - 4.48.9.i templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-32017, CONF:1098-32018 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.119&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht" see="#p-OperativeNoteV3_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht" name="p-OperativeNoteV3_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: code.codeSystem = '2.16.840.1.113883.6.101' or code.codeSystem = '2.16.840.1.113883.5.111'
			Constraint name: AuthorParticipationAssignedAuthorCodeTerminology
		-->
	<assert test="cda:code/@codeSystem = '2.16.840.1.113883.6.101' or cda:code/@codeSystem = '2.16.840.1.113883.5.111'">Error: Operative Note (V3) - 4.48.9.iii.e AuthorParticipationAssignedAuthorCodeTerminology
		Conformance: code/@code SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC. If the content is patient authored the code/@code SHOULD be selected from Personal And Legal Relationship Role Type (2.16.840.1.113883.11.20.12.1) (CONF:1098-31671, CONF:1098-32315)
		Analysis: code/@code SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC. If the content is patient authored the code/@code SHOULD be selected from Personal And Legal Relationship Role Type (2.16.840.1.113883.11.20.12.1)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht" see="#p-OperativeNoteV3_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht" name="p-OperativeNoteV3_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: AuthorParticipationAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Operative Note (V3) - 4.48.9.iii.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:1098-31671)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht" see="#p-OperativeNoteV3_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht" name="p-OperativeNoteV3_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: self.assignedPerson->select(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::AuthorParticipation::AssignedAuthor::AssignedPerson))->size() <= 1
			Constraint name: AuthorParticipationAssignedAuthorAssignedPerson
		-->
	<assert test="count(cda:assignedPerson) &lt;= 1">Error: Operative Note (V3) - 4.48.9.iii.c assignedPerson
		Conformance: MAY contain zero or one [0..1] assignedPerson (CONF:1098-31474)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht" see="#p-OperativeNoteV3_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht" name="p-OperativeNoteV3_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: self.representedOrganization->select(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(consol::AuthorParticipation::AssignedAuthor::RepresentedOrganization))->size() <= 1
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganization
		-->
	<assert test="count(cda:representedOrganization) &lt;= 1">Error: Operative Note (V3) - 4.48.9.iii.d representedOrganization
		Conformance: MAY contain zero or one [0..1] representedOrganization (CONF:1098-31476)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht" see="#p-OperativeNoteV3_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht" name="p-OperativeNoteV3_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: AuthorParticipationAssignedAuthorId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.48.9.iii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-31473)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedPerson -->

<pattern id="p-OperativeNoteV3_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht" see="#p-OperativeNoteV3_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht" name="p-OperativeNoteV3_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/assignedPerson
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorAssignedPersonName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or cda:name">Error: Operative Note (V3) - 4.48.9.iii.c.1 name
		Conformance: MAY contain zero or more [0..*] name (CONF:1098-31475)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht" see="#p-OperativeNoteV3_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht" name="p-OperativeNoteV3_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.name->isEmpty()) and self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationName
		-->
	<assert test="not(cda:name and cda:name[not(@nullFlavor)]) or cda:name">Error: Operative Note (V3) - 4.48.9.iii.d.3 name
		Conformance: MAY contain zero or more [0..*] name (CONF:1098-31479)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht" see="#p-OperativeNoteV3_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht" name="p-OperativeNoteV3_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::EntityClassOrganization::ORG
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'ORG'">Error: Operative Note (V3) - 4.48.9.iii.d.1 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ORG&quot;  (CONF:1098-31477)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht" see="#p-OperativeNoteV3_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht" name="p-OperativeNoteV3_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Operative Note (V3) - 4.48.9.iii.d.5 addr
		Conformance: MAY contain zero or more [0..*] addr (CONF:1098-31481)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht" see="#p-OperativeNoteV3_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht" name="p-OperativeNoteV3_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Operative Note (V3) - 4.48.9.iii.d.4 telecom
		Conformance: MAY contain zero or more [0..*] telecom (CONF:1098-31480)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedOrganization -->

<pattern id="p-OperativeNoteV3_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht" see="#p-OperativeNoteV3_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht" name="p-OperativeNoteV3_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht">
		<!--
			UML path: /AuthorParticipation/assignedAuthor/representedOrganization
			UML root path: /CarePlan/component/structuredBody/goalsSection/goalsSection/entry/goalObservation/authorParticipation/assignedAuthor/representedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.60']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.121']/cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']/cda:assignedAuthor/cda:representedOrganization">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: AuthorParticipationAssignedAuthorRepresentedOrganizationId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Operative Note (V3) - 4.48.9.iii.d.2 id
		Conformance: MAY contain zero or more [0..*] id (CONF:1098-31478)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Instruction2EntryRelationship -->

<pattern id="p-OperativeNoteV3_3A_Instruction2EntryRelationship_instruction2_4_122_9_i-error_mdht" see="#p-OperativeNoteV3_3A_Instruction2EntryRelationship_instruction2_4_122_9_i-error_mdht" name="p-OperativeNoteV3_3A_Instruction2EntryRelationship_instruction2_4_122_9_i-error_mdht">
		<!--
			UML path: /ProcedureActivityProcedure2/entryRelationship
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship">
		<!--
			OCL: self.act->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->size() <= 1
			Constraint name: ProcedureActivityProcedure2Instruction2EntryRelationshipInstruction2
		-->
	<assert test="count(cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']) &lt;= 1">Error: Operative Note (V3) - 4.122.9.i instruction2
		Conformance: MAY contain zero or one [0..1] act (CONF:1098-7775, CONF:1098-7776, CONF:1098-31395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Instruction2: 2.16.840.1.113883.10.20.22.4.20 -->

<pattern id="p-OperativeNoteV3_3A_Instruction2_templateId_4_63_1-error_mdht" see="#p-OperativeNoteV3_3A_Instruction2_templateId_4_63_1-error_mdht" name="p-OperativeNoteV3_3A_Instruction2_templateId_4_63_1-error_mdht">
		<!--
			UML path: /Instruction2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/entryRelationship/instruction2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.20' and id.extension = '2014-06-09')
			Constraint name: InstructionsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20' and @extension = '2014-06-09'">Error: Operative Note (V3) - 4.63.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-7393, CONF:1098-10503, CONF:1098-32598 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.20&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Instruction2: 2.16.840.1.113883.10.20.22.4.20 -->

<pattern id="p-OperativeNoteV3_3A_Instruction2_text_4_63_3-error_mdht" see="#p-OperativeNoteV3_3A_Instruction2_text_4_63_3-error_mdht" name="p-OperativeNoteV3_3A_Instruction2_text_4_63_3-error_mdht">
		<!--
			UML path: /Instruction2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/entryRelationship/instruction2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (true)
			Constraint name: InstructionsText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or true()">Error: Operative Note (V3) - 4.63.3 text
		Conformance: contain zero or one [0..1] text
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Instruction2: 2.16.840.1.113883.10.20.22.4.20 -->

<pattern id="p-OperativeNoteV3_3A_Instruction2_moodCode_4_63_3-error_mdht" see="#p-OperativeNoteV3_3A_Instruction2_moodCode_4_63_3-error_mdht" name="p-OperativeNoteV3_3A_Instruction2_moodCode_4_63_3-error_mdht">
		<!--
			UML path: /Instruction2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/entryRelationship/instruction2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::INT
			Constraint name: InstructionsMoodCode
		-->
	<assert test="@moodCode = 'INT'">Error: Operative Note (V3) - 4.63.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;INT&quot;  (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:7392, R2.0=CONF:1098-7392)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Instruction2: 2.16.840.1.113883.10.20.22.4.20 -->

<pattern id="p-OperativeNoteV3_3A_Instruction2_classCode_4_63_2-error_mdht" see="#p-OperativeNoteV3_3A_Instruction2_classCode_4_63_2-error_mdht" name="p-OperativeNoteV3_3A_Instruction2_classCode_4_63_2-error_mdht">
		<!--
			UML path: /Instruction2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/entryRelationship/instruction2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: InstructionsClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: Operative Note (V3) - 4.63.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:7391, R2.0=CONF:1098-7391)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Instruction2: 2.16.840.1.113883.10.20.22.4.20 -->

<pattern id="p-OperativeNoteV3_3A_Instruction2_statusCode_4_63_6-error_mdht" see="#p-OperativeNoteV3_3A_Instruction2_statusCode_4_63_6-error_mdht" name="p-OperativeNoteV3_3A_Instruction2_statusCode_4_63_6-error_mdht">
		<!--
			UML path: /Instruction2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/entryRelationship/instruction2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">
		<!--
			OCL: true
			Constraint name: InstructionsStatusCodeP
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.63.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:7396, R2.0=CONF:1098-7396, R2.0=CONF:1098-19106)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: InstructionsStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Operative Note (V3) - 4.63.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:7396, R2.0=CONF:1098-7396, R2.0=CONF:1098-19106)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Instruction2: 2.16.840.1.113883.10.20.22.4.20 -->

<pattern id="p-OperativeNoteV3_3A_Instruction2_code_4_63_4-error_mdht" see="#p-OperativeNoteV3_3A_Instruction2_code_4_63_4-error_mdht" name="p-OperativeNoteV3_3A_Instruction2_code_4_63_4-error_mdht">
		<!--
			UML path: /Instruction2
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/entryRelationship/instruction2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: InstructionsCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.63.4 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from ValueSet PatientEducation 2.16.840.1.113883.11.20.9.34 DYNAMIC (CONF:7394, R2.0=CONF:1098-7394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()
			Constraint name: InstructionsCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.96' and @code]">Error: Operative Note (V3) - 4.63.4 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from ValueSet PatientEducation 2.16.840.1.113883.11.20.9.34 DYNAMIC (CONF:7394, R2.0=CONF:1098-7394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceDeliveryLocation: 2.16.840.1.113883.10.20.22.4.32 -->

<pattern id="p-OperativeNoteV3_3A_ServiceDeliveryLocation_ServiceDeliveryLocationHasPlayingEntity_4_122_12_vi-error_mdht" see="#p-OperativeNoteV3_3A_ServiceDeliveryLocation_ServiceDeliveryLocationHasPlayingEntity_4_122_12_vi-error_mdht" name="p-OperativeNoteV3_3A_ServiceDeliveryLocation_ServiceDeliveryLocationHasPlayingEntity_4_122_12_vi-error_mdht">
		<!--
			UML path: /ServiceDeliveryLocation
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/serviceDeliveryLocation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">
		<!--
			OCL: self.playingEntity->size() = 1
			Constraint name: ServiceDeliveryLocationHasPlayingEntity
		-->
	<assert test="count(cda:playingEntity) = 1">Error: Operative Note (V3) - 4.122.12.vi ServiceDeliveryLocationHasPlayingEntity
		Conformance: MAY contain zero or one [0..1] playingEntity (CONF:7762)
		Analysis: MAY contain zero or one [0..1] playingEntity
		Validation message: n/a	</assert>
		<!--
			OCL: self.playingEntity->size()>0 implies self.playingEntity.classCode=vocab::EntityClassRoot::PLC
			Constraint name: ServiceDeliveryLocationHasPlayingEntityClassCode
		-->
	<assert test="not(count(cda:playingEntity) &gt; 0) or cda:playingEntity/@classCode = 'PLC'">Error: Operative Note (V3) - 4.122.12.vi ServiceDeliveryLocationHasPlayingEntity
		Conformance: MAY contain zero or one [0..1] playingEntity (CONF:7762)
		Analysis: playingEntity, if present, SHALL contain exactly one [1..1] @classCode=&quot;PLC&quot; (CodeSystem: EntityClass 2.16.840.1.113883.5.41)
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceDeliveryLocation: 2.16.840.1.113883.10.20.22.4.32 -->

<pattern id="p-OperativeNoteV3_3A_ServiceDeliveryLocation_addr_4_122_12_iv-error_mdht" see="#p-OperativeNoteV3_3A_ServiceDeliveryLocation_addr_4_122_12_iv-error_mdht" name="p-OperativeNoteV3_3A_ServiceDeliveryLocation_addr_4_122_12_iv-error_mdht">
		<!--
			UML path: /ServiceDeliveryLocation
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/serviceDeliveryLocation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: ServiceDeliveryLocationAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Operative Note (V3) - 4.122.12.iv addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:7760)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceDeliveryLocation: 2.16.840.1.113883.10.20.22.4.32 -->

<pattern id="p-OperativeNoteV3_3A_ServiceDeliveryLocation_telecom_4_122_12_v-error_mdht" see="#p-OperativeNoteV3_3A_ServiceDeliveryLocation_telecom_4_122_12_v-error_mdht" name="p-OperativeNoteV3_3A_ServiceDeliveryLocation_telecom_4_122_12_v-error_mdht">
		<!--
			UML path: /ServiceDeliveryLocation
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/serviceDeliveryLocation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: ServiceDeliveryLocationTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Operative Note (V3) - 4.122.12.v telecom
		Conformance: SHOULD contain zero or more [0..*] telecom (CONF:7761)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceDeliveryLocation: 2.16.840.1.113883.10.20.22.4.32 -->

<pattern id="p-OperativeNoteV3_3A_ServiceDeliveryLocation_templateId_4_122_12_i-error_mdht" see="#p-OperativeNoteV3_3A_ServiceDeliveryLocation_templateId_4_122_12_i-error_mdht" name="p-OperativeNoteV3_3A_ServiceDeliveryLocation_templateId_4_122_12_i-error_mdht">
		<!--
			UML path: /ServiceDeliveryLocation
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/serviceDeliveryLocation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.32')
			Constraint name: ServiceDeliveryLocationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32'">Error: Operative Note (V3) - 4.122.12.i templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:7635, CONF:10524 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.32&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceDeliveryLocation: 2.16.840.1.113883.10.20.22.4.32 -->

<pattern id="p-OperativeNoteV3_3A_ServiceDeliveryLocation_classCode_4_122_12_ii-error_mdht" see="#p-OperativeNoteV3_3A_ServiceDeliveryLocation_classCode_4_122_12_ii-error_mdht" name="p-OperativeNoteV3_3A_ServiceDeliveryLocation_classCode_4_122_12_ii-error_mdht">
		<!--
			UML path: /ServiceDeliveryLocation
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/serviceDeliveryLocation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::RoleClassRoot::SDLOC
			Constraint name: ServiceDeliveryLocationClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'SDLOC'">Error: Operative Note (V3) - 4.122.12.ii classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;SDLOC&quot;  (CONF:7758)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceDeliveryLocation: 2.16.840.1.113883.10.20.22.4.32 -->

<pattern id="p-OperativeNoteV3_3A_ServiceDeliveryLocation_code_4_122_12_iii-error_mdht" see="#p-OperativeNoteV3_3A_ServiceDeliveryLocation_code_4_122_12_iii-error_mdht" name="p-OperativeNoteV3_3A_ServiceDeliveryLocation_code_4_122_12_iii-error_mdht">
		<!--
			UML path: /ServiceDeliveryLocation
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/serviceDeliveryLocation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">
		<!--
			OCL: true
			Constraint name: ServiceDeliveryLocationCodeP
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.122.12.iii code
		Conformance: SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet HealthcareServiceLocation 2.16.840.1.113883.1.11.20275 DYNAMIC (CONF:16850)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.259' and not value.code.oclIsUndefined()
			Constraint name: ServiceDeliveryLocationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.259' and @code]">Error: Operative Note (V3) - 4.122.12.iii code
		Conformance: SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet HealthcareServiceLocation 2.16.840.1.113883.1.11.20275 DYNAMIC (CONF:16850)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProductInstance: 2.16.840.1.113883.10.20.22.4.37 -->

<pattern id="p-OperativeNoteV3_3A_ProductInstance_scopingEntity_4_122_14_iv-error_mdht" see="#p-OperativeNoteV3_3A_ProductInstance_scopingEntity_4_122_14_iv-error_mdht" name="p-OperativeNoteV3_3A_ProductInstance_scopingEntity_4_122_14_iv-error_mdht">
		<!--
			UML path: /ProductInstance
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/productInstance
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">
		<!--
			OCL: self.scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity))
			Constraint name: ProductInstanceScopingEntity
		-->
	<assert test="count(cda:scopingEntity)=1">Error: Operative Note (V3) - 4.122.14.iv scopingEntity
		Conformance: SHALL contain exactly one [1..1] scopingEntity (CONF:7905)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProductInstance: 2.16.840.1.113883.10.20.22.4.37 -->

<pattern id="p-OperativeNoteV3_3A_ProductInstance_playingDevice_4_122_14_v-error_mdht" see="#p-OperativeNoteV3_3A_ProductInstance_playingDevice_4_122_14_v-error_mdht" name="p-OperativeNoteV3_3A_ProductInstance_playingDevice_4_122_14_v-error_mdht">
		<!--
			UML path: /ProductInstance
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/productInstance
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">
		<!--
			OCL: self.playingDevice->one(playingDevice : cda::Device | not playingDevice.oclIsUndefined() and playingDevice.oclIsKindOf(cda::Device))
			Constraint name: ProductInstancePlayingDevice
		-->
	<assert test="count(cda:playingDevice)=1">Error: Operative Note (V3) - 4.122.14.v playingDevice
		Conformance: SHALL contain exactly one [1..1] playingDevice (CONF:7903)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProductInstance: 2.16.840.1.113883.10.20.22.4.37 -->

<pattern id="p-OperativeNoteV3_3A_ProductInstance_classCode_4_122_14_ii-error_mdht" see="#p-OperativeNoteV3_3A_ProductInstance_classCode_4_122_14_ii-error_mdht" name="p-OperativeNoteV3_3A_ProductInstance_classCode_4_122_14_ii-error_mdht">
		<!--
			UML path: /ProductInstance
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/productInstance
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">
		<!--
			OCL: isDefined('classCode') and self.classCode=vocab::RoleClassRoot::MANU
			Constraint name: ProductInstanceClassCode
		-->
	<assert test="attribute::node()[name() = 'classCode'] and @classCode = 'MANU'">Error: Operative Note (V3) - 4.122.14.ii classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;MANU&quot;  (CONF:7900)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProductInstance: 2.16.840.1.113883.10.20.22.4.37 -->

<pattern id="p-OperativeNoteV3_3A_ProductInstance_id_4_122_14_iii-error_mdht" see="#p-OperativeNoteV3_3A_ProductInstance_id_4_122_14_iii-error_mdht" name="p-OperativeNoteV3_3A_ProductInstance_id_4_122_14_iii-error_mdht">
		<!--
			UML path: /ProductInstance
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/productInstance
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: ProductInstanceId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.122.14.iii id
		Conformance: SHALL contain at least one [1..*] id (CONF:7902)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProductInstance: 2.16.840.1.113883.10.20.22.4.37 -->

<pattern id="p-OperativeNoteV3_3A_ProductInstance_templateId_4_122_14_i-error_mdht" see="#p-OperativeNoteV3_3A_ProductInstance_templateId_4_122_14_i-error_mdht" name="p-OperativeNoteV3_3A_ProductInstance_templateId_4_122_14_i-error_mdht">
		<!--
			UML path: /ProductInstance
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/productInstance
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.37')
			Constraint name: ProductInstanceTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37'">Error: Operative Note (V3) - 4.122.14.i templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:7901, CONF:10522 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.37&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ScopingEntity -->

<pattern id="p-OperativeNoteV3_3A_ScopingEntity_id_4_122_14_iv_a-error_mdht" see="#p-OperativeNoteV3_3A_ScopingEntity_id_4_122_14_iv_a-error_mdht" name="p-OperativeNoteV3_3A_ScopingEntity_id_4_122_14_iv_a-error_mdht">
		<!--
			UML path: /ProductInstance/scopingEntity
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/productInstance/scopingEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']/cda:scopingEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: ProductInstanceScopingEntityId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.122.14.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:7908)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlayingDevice -->

<pattern id="p-OperativeNoteV3_3A_PlayingDevice_code_4_122_14_v_a-error_mdht" see="#p-OperativeNoteV3_3A_PlayingDevice_code_4_122_14_v_a-error_mdht" name="p-OperativeNoteV3_3A_PlayingDevice_code_4_122_14_v_a-error_mdht">
		<!--
			UML path: /ProductInstance/playingDevice
			UML root path: /ReferralNote/component/structuredBody/proceduresSectionEntriesOptional2/proceduresSectionEntriesOptional2/entry/procedureActivityProcedure2/productInstance/playingDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']/cda:playingDevice">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: ProductInstancePlayingDeviceCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Operative Note (V3) - 4.122.14.v.a code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:7904)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_complicationsSection2_2_14_6_i_b_1-error_mdht" see="#p-OperativeNoteV3_2_Component_complicationsSection2_2_14_6_i_b_1-error_mdht" name="p-OperativeNoteV3_2_Component_complicationsSection2_2_14_6_i_b_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/complicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/complicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentComplicationsSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37'])=1">Error: Operative Note (V3) - 2.14.6.i.b.1 complicationsSection2
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30488, CONF:1198-30489)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComplicationsSection2: 2.16.840.1.113883.10.20.22.2.37 -->

<pattern id="p-OperativeNoteV3_2_ComplicationsSectionV3_title_3_19_3-error_mdht" see="#p-OperativeNoteV3_2_ComplicationsSectionV3_title_3_19_3-error_mdht" name="p-OperativeNoteV3_2_ComplicationsSectionV3_title_3_19_3-error_mdht">
		<!--
			UML path: /ComplicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/complicationsSection2/complicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ComplicationsSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.19.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8176, R2.1=CONF:1198-8176)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComplicationsSection2: 2.16.840.1.113883.10.20.22.2.37 -->

<pattern id="p-OperativeNoteV3_2_ComplicationsSectionV3_code_3_19_3-error_mdht" see="#p-OperativeNoteV3_2_ComplicationsSectionV3_code_3_19_3-error_mdht" name="p-OperativeNoteV3_2_ComplicationsSectionV3_code_3_19_3-error_mdht">
		<!--
			UML path: /ComplicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/complicationsSection2/complicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ComplicationsSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.19.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15453)/@code=&quot;55109-3&quot; Complications (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15454, CONF:1198-30860)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '55109-3' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ComplicationsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '55109-3' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.19.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15453)/@code=&quot;55109-3&quot; Complications (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15454, CONF:1198-30860)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComplicationsSection2: 2.16.840.1.113883.10.20.22.2.37 -->

<pattern id="p-OperativeNoteV3_2_ComplicationsSectionV3_text_3_19_4-error_mdht" see="#p-OperativeNoteV3_2_ComplicationsSectionV3_text_3_19_4-error_mdht" name="p-OperativeNoteV3_2_ComplicationsSectionV3_text_3_19_4-error_mdht">
		<!--
			UML path: /ComplicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/complicationsSection2/complicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ComplicationsSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.19.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8177, R2.1=CONF:1198-8177)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComplicationsSection2: 2.16.840.1.113883.10.20.22.2.37 -->

<pattern id="p-OperativeNoteV3_3A_ComplicationsSectionV3_entry_3_19_4-error_mdht" see="#p-OperativeNoteV3_3A_ComplicationsSectionV3_entry_3_19_4-error_mdht" name="p-OperativeNoteV3_3A_ComplicationsSectionV3_entry_3_19_4-error_mdht">
		<!--
			UML path: /ComplicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/complicationsSection2/complicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::ComplicationsSection2::ProblemObservation2Entry))
			Constraint name: ComplicationsSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.19.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComplicationsSection2: 2.16.840.1.113883.10.20.22.2.37 -->

<pattern id="p-OperativeNoteV3_2_ComplicationsSectionV3_templateId_3_19_1-error_mdht" see="#p-OperativeNoteV3_2_ComplicationsSectionV3_templateId_3_19_1-error_mdht" name="p-OperativeNoteV3_2_ComplicationsSectionV3_templateId_3_19_1-error_mdht">
		<!--
			UML path: /ComplicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/complicationsSection2/complicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.37' and id.extension = '2015-08-01')
			Constraint name: ComplicationsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37' and @extension = '2015-08-01'">Error: Operative Note (V3) - 3.19.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8174, CONF:1198-10384, CONF:1198-32538 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.37&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2Entry -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_19_4_i-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_19_4_i-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_19_4_i-error_mdht">
		<!--
			UML path: /ComplicationsSection2/entry
			UML root path: /OperativeNote2/component/structuredBody/complicationsSection2/complicationsSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']/cda:entry">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2))->size() >= 0
			Constraint name: ComplicationsSection2ProblemObservation2EntryProblemObservation2
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']) &gt;= 0">Error: Operative Note (V3) - 3.19.4.i problemObservation2
		Conformance: MAY contain zero or more [0..*] observation (CONF:1198-8795, CONF:1198-15455)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_value_4_115_5-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_value_4_115_5-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_value_4_115_5-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: not self.value->isEmpty()
			Constraint name: ProblemObservationValueP
		-->
	<assert test="cda:value">Error: Operative Note (V3) - 4.115.5 value
		Conformance: SHALL contain exactly one [1..1] value with @xsi:type=&quot;CD&quot;, which SHOULD be selected from ValueSet Problem 2.16.840.1.113883.3.88.12.3221.7.4 DYNAMIC (CONF:1198-9058)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())
			Constraint name: ProblemObservationValue
		-->
	<assert test="count(cda:value) = 1 and not(cda:value[not(. and @xsi:type='CD' and @codeSystem = '2.16.840.1.113883.6.96' and @code)])">Error: Operative Note (V3) - 4.115.5 value
		Conformance: SHALL contain exactly one [1..1] value with @xsi:type=&quot;CD&quot;, which SHOULD be selected from ValueSet Problem 2.16.840.1.113883.3.88.12.3221.7.4 DYNAMIC (CONF:1198-9058)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_templateId_4_115_1-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_templateId_4_115_1-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_templateId_4_115_1-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.4' and id.extension = '2015-08-01')
			Constraint name: ProblemObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4' and @extension = '2015-08-01'">Error: Operative Note (V3) - 4.115.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-14926, CONF:1198-14927, CONF:1198-32508 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.4&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_moodCode_4_115_3-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_moodCode_4_115_3-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_moodCode_4_115_3-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: ProblemObservationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Operative Note (V3) - 4.115.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:9042, R2.1=CONF:1198-9042)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_effectiveTime_4_66_4-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_effectiveTime_4_66_4-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_effectiveTime_4_66_4-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: ProblemObservationEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Operative Note (V3) - 4.66.4 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:1198-9050)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_statusCode_4_66_8-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_statusCode_4_66_8-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_statusCode_4_66_8-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: ProblemObservationStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Operative Note (V3) - 4.66.8 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1198-9049)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1198-19112)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: ProblemObservationStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Operative Note (V3) - 4.66.8 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1198-9049)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1198-19112)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_12-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_12-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_12-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProblemObservation2::ProblemStatusEntryRelationship))
			Constraint name: ProblemObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.115.12 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_10-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_10-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_10-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProblemObservation2::PrognosisObservationEntryRelationship))
			Constraint name: ProblemObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.115.10 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_code_4_115_6-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_code_4_115_6-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_code_4_115_6-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProblemObservationCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.115.6 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from ValueSet Problem Type (SNOMED CT) 2.16.840.1.113883.3.88.12.3221.7.2 STATIC 2012-06-01 (CONF:1198-9045)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006' or value.code = '373930000')
			Constraint name: ProblemObservationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.96' and (@code = '404684003' or @code = '409586006' or @code = '282291009' or @code = '64572001' or @code = '248536006' or @code = '418799008' or @code = '55607006' or @code = '373930000')]">Error: Operative Note (V3) - 4.115.6 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from ValueSet Problem Type (SNOMED CT) 2.16.840.1.113883.3.88.12.3221.7.2 STATIC 2012-06-01 (CONF:1198-9045)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_id_4_66_5-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_id_4_66_5-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_id_4_66_5-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: ProblemObservationId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.66.5 id
		Conformance: SHALL contain at least one [1..*] id (CONF:9043, R2.1=CONF:1198-9043)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_11-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_11-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_11-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProblemObservation2::PriorityPreferenceEntryRelationship))
			Constraint name: ProblemObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.115.11 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_13-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_13-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_13-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::ProblemObservation2::HealthStatusObservationEntryRelationship))
			Constraint name: ProblemObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.115.13 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_classCode_4_115_2-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_classCode_4_115_2-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_classCode_4_115_2-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::OBS
			Constraint name: ProblemObservationClassCode
		-->
	<assert test="@classCode = 'OBS'">Error: Operative Note (V3) - 4.115.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;OBS&quot; Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:9041, R2.1=CONF:1198-9041)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_negationInd_4_66_3-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_negationInd_4_66_3-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_negationInd_4_66_3-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: (not self.negationInd.oclIsUndefined()) implies (not self.negationInd.oclIsUndefined())
			Constraint name: ProblemObservationNegationInd
		-->
	<assert test="not(@negationInd) or @negationInd">Error: Operative Note (V3) - 4.66.3 negationInd
		Conformance: MAY contain zero or one [0..1] @negationInd (CONF:1198-10139)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_authorParticipation_4_115_9-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_authorParticipation_4_115_9-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_authorParticipation_4_115_9-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: self.author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))->size() >= 0
			Constraint name: ProblemObservation2AuthorParticipation
		-->
	<assert test="count(cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']) &gt;= 0">Error: Operative Note (V3) - 4.115.9 authorParticipation
		Conformance: SHOULD contain  [0..*] author such that it  (CONF:1198-31147)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2: 2.16.840.1.113883.10.20.22.4.4 -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservationV3_text_4_66_7-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservationV3_text_4_66_7-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservationV3_text_4_66_7-error_mdht">
		<!--
			UML path: /ProblemObservation2
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">
		<!--
			OCL: ((not self.text.oclIsUndefined()) and self.text.isNullFlavorUndefined()) implies (true)
			Constraint name: ProblemObservationText
		-->
	<assert test="not(cda:text and not(cda:text/@nullFlavor)) or true()">Error: Operative Note (V3) - 4.66.7 text
		Conformance: contain zero or one [0..1] text
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CD -->

<pattern id="p-OperativeNoteV3_3A_CD_qualifier_4_115_5_i-error_mdht" see="#p-OperativeNoteV3_3A_CD_qualifier_4_115_5_i-error_mdht" name="p-OperativeNoteV3_3A_CD_qualifier_4_115_5_i-error_mdht">
		<!--
			UML path: /ProblemObservation2/value
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/value
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:value">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.qualifier->isEmpty()) and self.qualifier->exists(element | element.isNullFlavorUndefined())) implies (not self.qualifier->isEmpty()) ))
			Constraint name: ProblemObservation2CDQualifier
		-->
	<assert test="@nullFlavor or not(cda:qualifier and cda:qualifier[not(@nullFlavor)]) or cda:qualifier">Error: Operative Note (V3) - 4.115.5.i qualifier
		Conformance: MAY contain zero or more [0..*] qualifier (CONF:1198-31870)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CD -->

<pattern id="p-OperativeNoteV3_3A_CD_code_4_115_5_ii-error_mdht" see="#p-OperativeNoteV3_3A_CD_code_4_115_5_ii-error_mdht" name="p-OperativeNoteV3_3A_CD_code_4_115_5_ii-error_mdht">
		<!--
			UML path: /ProblemObservation2/value
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/value
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:value">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.code.oclIsUndefined()) implies (not self.code.oclIsUndefined()) ))
			Constraint name: ProblemObservation2CDCode
		-->
	<assert test="@nullFlavor or not(@code) or @code">Error: Operative Note (V3) - 4.115.5.ii code
		Conformance: MAY contain zero or one [0..1] code (CONF:1198-31871)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CDCode -->

<pattern id="p-OperativeNoteV3_3A_CDCode_translation_4_115_6_i-error_mdht" see="#p-OperativeNoteV3_3A_CDCode_translation_4_115_6_i-error_mdht" name="p-OperativeNoteV3_3A_CDCode_translation_4_115_6_i-error_mdht">
		<!--
			UML path: /ProblemObservation2/code
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/code
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:code">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.translation->isEmpty() and self.translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '75326-9' or value.code = '75325-1' or value.code = '75324-4' or value.code = '75323-6' or value.code = '29308-4' or value.code = '75322-8' or value.code = '75275-8' or value.code = '75321-0' or value.code = '75319-4' or value.code = '75318-6' or value.code = '75317-8' or value.code = '75316-0' or value.code = '75315-2' or value.code = '75314-5' or value.code = '75313-7' or value.code = '75312-9')) ))
			Constraint name: ProblemObservation2CDCodeTranslation
		-->
	<assert test="@nullFlavor or cda:translation and not(cda:translation[not(. and @codeSystem = '2.16.840.1.113883.6.1' and (@code = '75326-9' or @code = '75325-1' or @code = '75324-4' or @code = '75323-6' or @code = '29308-4' or @code = '75322-8' or @code = '75275-8' or @code = '75321-0' or @code = '75319-4' or @code = '75318-6' or @code = '75317-8' or @code = '75316-0' or @code = '75315-2' or @code = '75314-5' or @code = '75313-7' or @code = '75312-9'))])">Error: Operative Note (V3) - 4.115.6.i translation
		Conformance: SHALL contain at least one [1..*] translation, which SHOULD be selected from ValueSet Problem Type (LOINC) 2.16.840.1.113883.3.88.12.3221.7.2 STATIC 2014-09-02 (CONF:1198-32848)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.translation->isEmpty() ))
			Constraint name: ProblemObservation2CDCodeTranslationP
		-->
	<assert test="@nullFlavor or cda:translation">Error: Operative Note (V3) - 4.115.6.i translation
		Conformance: SHALL contain at least one [1..*] translation, which SHOULD be selected from ValueSet Problem Type (LOINC) 2.16.840.1.113883.3.88.12.3221.7.2 STATIC 2014-09-02 (CONF:1198-32848)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservationEntryRelationship -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservationEntryRelationship_prognosisObservation_4_115_10_i-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservationEntryRelationship_prognosisObservation_4_115_10_i-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservationEntryRelationship_prognosisObservation_4_115_10_i-error_mdht">
		<!--
			UML path: /ProblemObservation2/entryRelationship
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PrognosisObservation))->size() <= 1
			Constraint name: ProblemObservation2PrognosisObservationEntryRelationshipPrognosisObservation
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']) &lt;= 1">Error: Operative Note (V3) - 4.115.10.i prognosisObservation
		Conformance: MAY contain zero or one [0..1] observation (CONF:1198-29951, CONF:1198-31531, CONF:1198-29952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservation: 2.16.840.1.113883.10.20.22.4.113 -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservation_moodCode_4_124_3-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservation_moodCode_4_124_3-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservation_moodCode_4_124_3-error_mdht">
		<!--
			UML path: /PrognosisObservation
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship/prognosisObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: PrognosisObservationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Operative Note (V3) - 4.124.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1098-29036)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservation: 2.16.840.1.113883.10.20.22.4.113 -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservation_statusCode_4_124_5-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservation_statusCode_4_124_5-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservation_statusCode_4_124_5-error_mdht">
		<!--
			UML path: /PrognosisObservation
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship/prognosisObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: PrognosisObservationStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Operative Note (V3) - 4.124.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-31350)/@code=&quot;completed&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-31351)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: PrognosisObservationStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Operative Note (V3) - 4.124.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-31350)/@code=&quot;completed&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-31351)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservation: 2.16.840.1.113883.10.20.22.4.113 -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservation_templateId_4_124_1-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservation_templateId_4_124_1-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservation_templateId_4_124_1-error_mdht">
		<!--
			UML path: /PrognosisObservation
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship/prognosisObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.113')
			Constraint name: PrognosisObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113'">Error: Operative Note (V3) - 4.124.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-29037, CONF:1098-29038 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.113&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservation: 2.16.840.1.113883.10.20.22.4.113 -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservation_code_4_124_4-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservation_code_4_124_4-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservation_code_4_124_4-error_mdht">
		<!--
			UML path: /PrognosisObservation
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship/prognosisObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PrognosisObservationCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.124.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-29039)/@code=&quot;75328-5&quot; Prognosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-29468, CONF:1098-31349)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '75328-5' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: PrognosisObservationCode
		-->
	<assert test="cda:code and cda:code[@code = '75328-5' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 4.124.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-29039)/@code=&quot;75328-5&quot; Prognosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-29468, CONF:1098-31349)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservation: 2.16.840.1.113883.10.20.22.4.113 -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservation_value_4_124_7-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservation_value_4_124_7-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservation_value_4_124_7-error_mdht">
		<!--
			UML path: /PrognosisObservation
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship/prognosisObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">
		<!--
			OCL: self.value->size() = 1
			Constraint name: PrognosisObservationValue
		-->
	<assert test="count(cda:value) = 1">Error: Operative Note (V3) - 4.124.7 value
		Conformance: SHALL contain exactly one [1..1] value (CONF:1098-29469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservation: 2.16.840.1.113883.10.20.22.4.113 -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservation_effectiveTime_4_124_6-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservation_effectiveTime_4_124_6-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservation_effectiveTime_4_124_6-error_mdht">
		<!--
			UML path: /PrognosisObservation
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship/prognosisObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: PrognosisObservationEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Operative Note (V3) - 4.124.6 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:1098-31123)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PrognosisObservation: 2.16.840.1.113883.10.20.22.4.113 -->

<pattern id="p-OperativeNoteV3_3A_PrognosisObservation_classCode_4_124_2-error_mdht" see="#p-OperativeNoteV3_3A_PrognosisObservation_classCode_4_124_2-error_mdht" name="p-OperativeNoteV3_3A_PrognosisObservation_classCode_4_124_2-error_mdht">
		<!--
			UML path: /PrognosisObservation
			UML root path: /ReferralNote/component/structuredBody/problemSection2/problemSection2/entry/problemConcernAct2/entryRelationship/problemObservation2/entryRelationship/prognosisObservation
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::OBS
			Constraint name: PrognosisObservationClassCode
		-->
	<assert test="@classCode = 'OBS'">Error: Operative Note (V3) - 4.124.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;OBS&quot; Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1098-29035)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_preoperativeDiagnosisSection2_2_14_6_i_c_1-error_mdht" see="#p-OperativeNoteV3_2_Component_preoperativeDiagnosisSection2_2_14_6_i_c_1-error_mdht" name="p-OperativeNoteV3_2_Component_preoperativeDiagnosisSection2_2_14_6_i_c_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection2))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34'])=1">Error: Operative Note (V3) - 2.14.6.i.c.1 preoperativeDiagnosisSection2
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30490, CONF:1198-30491)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosisSection2: 2.16.840.1.113883.10.20.22.2.34 -->

<pattern id="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_text_3_87_4-error_mdht" see="#p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_text_3_87_4-error_mdht" name="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_text_3_87_4-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosisSection2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: PreoperativeDiagnosisSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.87.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8100, R2.1=CONF:1198-8100)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosisSection2: 2.16.840.1.113883.10.20.22.2.34 -->

<pattern id="p-OperativeNoteV3_3A_PreoperativeDiagnosisSectionV3_entry_3_87_4-error_mdht" see="#p-OperativeNoteV3_3A_PreoperativeDiagnosisSectionV3_entry_3_87_4-error_mdht" name="p-OperativeNoteV3_3A_PreoperativeDiagnosisSectionV3_entry_3_87_4-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosisSection2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PreoperativeDiagnosisSection2::PreoperativeDiagnosis2Entry))
			Constraint name: PreoperativeDiagnosisSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.87.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosisSection2: 2.16.840.1.113883.10.20.22.2.34 -->

<pattern id="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_code_3_87_3-error_mdht" see="#p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_code_3_87_3-error_mdht" name="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_code_3_87_3-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosisSection2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PreoperativeDiagnosisSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.87.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15405)/@code=&quot;10219-4&quot; Preoperative Diagnosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15406, CONF:1198-30863)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '10219-4' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: PreoperativeDiagnosisSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '10219-4' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.87.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15405)/@code=&quot;10219-4&quot; Preoperative Diagnosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15406, CONF:1198-30863)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosisSection2: 2.16.840.1.113883.10.20.22.2.34 -->

<pattern id="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_title_3_87_3-error_mdht" see="#p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_title_3_87_3-error_mdht" name="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_title_3_87_3-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosisSection2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: PreoperativeDiagnosisSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.87.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8099, R2.1=CONF:1198-8099)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosisSection2: 2.16.840.1.113883.10.20.22.2.34 -->

<pattern id="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_templateId_3_87_1-error_mdht" see="#p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_templateId_3_87_1-error_mdht" name="p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_templateId_3_87_1-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosisSection2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.34' and id.extension = '2015-08-01')
			Constraint name: PreoperativeDiagnosisSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34' and @extension = '2015-08-01'">Error: Operative Note (V3) - 3.87.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8097, CONF:1198-10439, CONF:1198-32551 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.34&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosis2Entry -->

<pattern id="p-OperativeNoteV3_3A_PreoperativeDiagnosis2Entry_preoperativeDiagnosis2_3_87_4_i-error_mdht" see="#p-OperativeNoteV3_3A_PreoperativeDiagnosis2Entry_preoperativeDiagnosis2_3_87_4_i-error_mdht" name="p-OperativeNoteV3_3A_PreoperativeDiagnosis2Entry_preoperativeDiagnosis2_3_87_4_i-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosisSection2/entry
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry">
		<!--
			OCL: self.act->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PreoperativeDiagnosis2))->size() <= 1
			Constraint name: PreoperativeDiagnosisSection2PreoperativeDiagnosis2EntryPreoperativeDiagnosis2
		-->
	<assert test="count(cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']) &lt;= 1">Error: Operative Note (V3) - 3.87.4.i preoperativeDiagnosis2
		Conformance: SHOULD contain zero or one [0..1] act (CONF:1198-10096, CONF:1198-15504)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosis2: 2.16.840.1.113883.10.20.22.4.65 -->

<pattern id="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_code_4_109_3-error_mdht" see="#p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_code_4_109_3-error_mdht" name="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_code_4_109_3-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosis2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2/entry/preoperativeDiagnosis2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PreoperativeDiagnosisCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.109.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-19155)/@code=&quot;10219-4&quot; Preoperative Diagnosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-19156, CONF:1198-32167)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '10219-4' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: PreoperativeDiagnosisCode
		-->
	<assert test="cda:code and cda:code[@code = '10219-4' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 4.109.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-19155)/@code=&quot;10219-4&quot; Preoperative Diagnosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-19156, CONF:1198-32167)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosis2: 2.16.840.1.113883.10.20.22.4.65 -->

<pattern id="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_moodCode_4_109_3-error_mdht" see="#p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_moodCode_4_109_3-error_mdht" name="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_moodCode_4_109_3-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosis2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2/entry/preoperativeDiagnosis2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">
		<!--
			OCL: self.moodCode=vocab::x_DocumentActMood::EVN
			Constraint name: PreoperativeDiagnosisMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Operative Note (V3) - 4.109.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:10091, R2.1=CONF:1198-10091)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosis2: 2.16.840.1.113883.10.20.22.4.65 -->

<pattern id="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_templateId_4_109_1-error_mdht" see="#p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_templateId_4_109_1-error_mdht" name="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_templateId_4_109_1-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosis2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2/entry/preoperativeDiagnosis2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.65' and id.extension = '2015-08-01')
			Constraint name: PreoperativeDiagnosisTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65' and @extension = '2015-08-01'">Error: Operative Note (V3) - 4.109.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-16770, CONF:1198-16771, CONF:1198-32540 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.65&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosis2: 2.16.840.1.113883.10.20.22.4.65 -->

<pattern id="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_entryRelationship_4_109_4-error_mdht" see="#p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_entryRelationship_4_109_4-error_mdht" name="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_entryRelationship_4_109_4-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosis2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2/entry/preoperativeDiagnosis2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PreoperativeDiagnosis2::ProblemObservation2EntryRelationship))
			Constraint name: PreoperativeDiagnosis2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship[cda:observation/cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4'])=1">Error: Operative Note (V3) - 4.109.4 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PreoperativeDiagnosis2: 2.16.840.1.113883.10.20.22.4.65 -->

<pattern id="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_classCode_4_109_2-error_mdht" see="#p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_classCode_4_109_2-error_mdht" name="p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_classCode_4_109_2-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosis2
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2/entry/preoperativeDiagnosis2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">
		<!--
			OCL: self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
			Constraint name: PreoperativeDiagnosisClassCode
		-->
	<assert test="@classCode = 'ACT'">Error: Operative Note (V3) - 4.109.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;ACT&quot; Act (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:10090, R2.1=CONF:1198-10090)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2EntryRelationship -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservation2EntryRelationship_problemObservation2_4_109_4_i-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservation2EntryRelationship_problemObservation2_4_109_4_i-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservation2EntryRelationship_problemObservation2_4_109_4_i-error_mdht">
		<!--
			UML path: /PreoperativeDiagnosis2/entryRelationship
			UML root path: /OperativeNote2/component/structuredBody/preoperativeDiagnosisSection2/preoperativeDiagnosisSection2/entry/preoperativeDiagnosis2/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']/cda:entryRelationship">
		<!--
			OCL: self.observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2))
			Constraint name: PreoperativeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2
		-->
	<assert test="cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Error: Operative Note (V3) - 4.109.4.i problemObservation2
		Conformance: SHALL contain at least one [1..*] observation (CONF:1198-10093, CONF:1198-10094, CONF:1198-15605)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_procedureEstimatedBloodLossSection_2_14_6_i_d_1-error_mdht" see="#p-OperativeNoteV3_2_Component_procedureEstimatedBloodLossSection_2_14_6_i_d_1-error_mdht" name="p-OperativeNoteV3_2_Component_procedureEstimatedBloodLossSection_2_14_6_i_d_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/procedureEstimatedBloodLossSection
			UML root path: /OperativeNote2/component/structuredBody/procedureEstimatedBloodLossSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9'])=1">Error: Operative Note (V3) - 2.14.6.i.d.1 procedureEstimatedBloodLossSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30492, CONF:1198-30493)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureEstimatedBloodLossSection: 2.16.840.1.113883.10.20.18.2.9 -->

<pattern id="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_title_3_94_4-error_mdht" see="#p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_title_3_94_4-error_mdht" name="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_title_3_94_4-error_mdht">
		<!--
			UML path: /ProcedureEstimatedBloodLossSection
			UML root path: /OperativeNote/component/structuredBody/procedureEstimatedBloodLossSection/procedureEstimatedBloodLossSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ProcedureEstimatedBloodLossSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.94.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8076)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureEstimatedBloodLossSection: 2.16.840.1.113883.10.20.18.2.9 -->

<pattern id="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_templateId_3_94_1-error_mdht" see="#p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_templateId_3_94_1-error_mdht" name="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_templateId_3_94_1-error_mdht">
		<!--
			UML path: /ProcedureEstimatedBloodLossSection
			UML root path: /OperativeNote/component/structuredBody/procedureEstimatedBloodLossSection/procedureEstimatedBloodLossSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.9')
			Constraint name: ProcedureEstimatedBloodLossSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9'">Error: Operative Note (V3) - 3.94.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8074, CONF:10467 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.18.2.9&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureEstimatedBloodLossSection: 2.16.840.1.113883.10.20.18.2.9 -->

<pattern id="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_text_3_94_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_text_3_94_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_text_3_94_3-error_mdht">
		<!--
			UML path: /ProcedureEstimatedBloodLossSection
			UML root path: /OperativeNote/component/structuredBody/procedureEstimatedBloodLossSection/procedureEstimatedBloodLossSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ProcedureEstimatedBloodLossSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.94.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8077)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureEstimatedBloodLossSection: 2.16.840.1.113883.10.20.18.2.9 -->

<pattern id="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_code_3_94_2-error_mdht" see="#p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_code_3_94_2-error_mdht" name="p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_code_3_94_2-error_mdht">
		<!--
			UML path: /ProcedureEstimatedBloodLossSection
			UML root path: /OperativeNote/component/structuredBody/procedureEstimatedBloodLossSection/procedureEstimatedBloodLossSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59770-8' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ProcedureEstimatedBloodLossSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59770-8' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.94.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15415)/@code=&quot;59770-8&quot; Procedure Estimated Blood Loss (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15416)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureEstimatedBloodLossSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.94.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15415)/@code=&quot;59770-8&quot; Procedure Estimated Blood Loss (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_procedureFindingsSection2_2_14_6_i_e_1-error_mdht" see="#p-OperativeNoteV3_2_Component_procedureFindingsSection2_2_14_6_i_e_1-error_mdht" name="p-OperativeNoteV3_2_Component_procedureFindingsSection2_2_14_6_i_e_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/procedureFindingsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureFindingsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28'])=1">Error: Operative Note (V3) - 2.14.6.i.e.1 procedureFindingsSection2
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30494, CONF:1198-30495)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureFindingsSection2: 2.16.840.1.113883.10.20.22.2.28 -->

<pattern id="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_templateId_3_96_1-error_mdht" see="#p-OperativeNoteV3_2_ProcedureFindingsSectionV3_templateId_3_96_1-error_mdht" name="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_templateId_3_96_1-error_mdht">
		<!--
			UML path: /ProcedureFindingsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureFindingsSection2/procedureFindingsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.28' and id.extension = '2015-08-01')
			Constraint name: ProcedureFindingsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28' and @extension = '2015-08-01'">Error: Operative Note (V3) - 3.96.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-8078, CONF:1198-10443, CONF:1198-32537 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.28&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureFindingsSection2: 2.16.840.1.113883.10.20.22.2.28 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureFindingsSectionV3_entry_3_96_4-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureFindingsSectionV3_entry_3_96_4-error_mdht" name="p-OperativeNoteV3_3A_ProcedureFindingsSectionV3_entry_3_96_4-error_mdht">
		<!--
			UML path: /ProcedureFindingsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureFindingsSection2/procedureFindingsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::ProcedureFindingsSection2::ProblemObservation2Entry))
			Constraint name: ProcedureFindingsSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.96.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureFindingsSection2: 2.16.840.1.113883.10.20.22.2.28 -->

<pattern id="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_title_3_96_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureFindingsSectionV3_title_3_96_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_title_3_96_3-error_mdht">
		<!--
			UML path: /ProcedureFindingsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureFindingsSection2/procedureFindingsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ProcedureFindingsSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.96.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8080, R2.1=CONF:1198-8080)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureFindingsSection2: 2.16.840.1.113883.10.20.22.2.28 -->

<pattern id="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_text_3_96_4-error_mdht" see="#p-OperativeNoteV3_2_ProcedureFindingsSectionV3_text_3_96_4-error_mdht" name="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_text_3_96_4-error_mdht">
		<!--
			UML path: /ProcedureFindingsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureFindingsSection2/procedureFindingsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ProcedureFindingsSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.96.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8081, R2.1=CONF:1198-8081)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureFindingsSection2: 2.16.840.1.113883.10.20.22.2.28 -->

<pattern id="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_code_3_96_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureFindingsSectionV3_code_3_96_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureFindingsSectionV3_code_3_96_3-error_mdht">
		<!--
			UML path: /ProcedureFindingsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureFindingsSection2/procedureFindingsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureFindingsSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.96.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15417)/@code=&quot;59776-5&quot; Procedure Findings (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15418, CONF:1198-30859)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59776-5' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ProcedureFindingsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59776-5' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.96.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-15417)/@code=&quot;59776-5&quot; Procedure Findings (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1198-15418, CONF:1198-30859)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProblemObservation2Entry -->

<pattern id="p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_96_4_i-error_mdht" see="#p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_96_4_i-error_mdht" name="p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_96_4_i-error_mdht">
		<!--
			UML path: /ProcedureFindingsSection2/entry
			UML root path: /OperativeNote2/component/structuredBody/procedureFindingsSection2/procedureFindingsSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']/cda:entry">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2))->size() >= 0
			Constraint name: ProcedureFindingsSection2ProblemObservation2EntryProblemObservation2
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']) &gt;= 0">Error: Operative Note (V3) - 3.96.4.i problemObservation2
		Conformance: MAY contain zero or more [0..*] observation (CONF:1198-8090, CONF:1198-15507)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_procedureSpecimensTakenSection_2_14_6_i_f_1-error_mdht" see="#p-OperativeNoteV3_2_Component_procedureSpecimensTakenSection_2_14_6_i_f_1-error_mdht" name="p-OperativeNoteV3_2_Component_procedureSpecimensTakenSection_2_14_6_i_f_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/procedureSpecimensTakenSection
			UML root path: /OperativeNote2/component/structuredBody/procedureSpecimensTakenSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31'])=1">Error: Operative Note (V3) - 2.14.6.i.f.1 procedureSpecimensTakenSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30496, CONF:1198-30497)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureSpecimensTakenSection: 2.16.840.1.113883.10.20.22.2.31 -->

<pattern id="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_title_3_100_4-error_mdht" see="#p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_title_3_100_4-error_mdht" name="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_title_3_100_4-error_mdht">
		<!--
			UML path: /ProcedureSpecimensTakenSection
			UML root path: /OperativeNote/component/structuredBody/procedureSpecimensTakenSection/procedureSpecimensTakenSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ProcedureSpecimensTakenSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.100.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8088)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureSpecimensTakenSection: 2.16.840.1.113883.10.20.22.2.31 -->

<pattern id="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_templateId_3_100_1-error_mdht" see="#p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_templateId_3_100_1-error_mdht" name="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_templateId_3_100_1-error_mdht">
		<!--
			UML path: /ProcedureSpecimensTakenSection
			UML root path: /OperativeNote/component/structuredBody/procedureSpecimensTakenSection/procedureSpecimensTakenSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.31')
			Constraint name: ProcedureSpecimensTakenSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31'">Error: Operative Note (V3) - 3.100.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8086, CONF:10446 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.31&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureSpecimensTakenSection: 2.16.840.1.113883.10.20.22.2.31 -->

<pattern id="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_code_3_100_2-error_mdht" see="#p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_code_3_100_2-error_mdht" name="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_code_3_100_2-error_mdht">
		<!--
			UML path: /ProcedureSpecimensTakenSection
			UML root path: /OperativeNote/component/structuredBody/procedureSpecimensTakenSection/procedureSpecimensTakenSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59773-2' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ProcedureSpecimensTakenSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59773-2' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.100.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15421)/@code=&quot;59773-2&quot; Procedure Specimens Taken (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15422)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureSpecimensTakenSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.100.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15421)/@code=&quot;59773-2&quot; Procedure Specimens Taken (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureSpecimensTakenSection: 2.16.840.1.113883.10.20.22.2.31 -->

<pattern id="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_text_3_100_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_text_3_100_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_text_3_100_3-error_mdht">
		<!--
			UML path: /ProcedureSpecimensTakenSection
			UML root path: /OperativeNote/component/structuredBody/procedureSpecimensTakenSection/procedureSpecimensTakenSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ProcedureSpecimensTakenSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.100.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8089)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_procedureDescriptionSection_2_14_6_i_g_1-error_mdht" see="#p-OperativeNoteV3_2_Component_procedureDescriptionSection_2_14_6_i_g_1-error_mdht" name="p-OperativeNoteV3_2_Component_procedureDescriptionSection_2_14_6_i_g_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/procedureDescriptionSection
			UML root path: /OperativeNote2/component/structuredBody/procedureDescriptionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27'])=1">Error: Operative Note (V3) - 2.14.6.i.g.1 procedureDescriptionSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30498, CONF:1198-30499)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDescriptionSection: 2.16.840.1.113883.10.20.22.2.27 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDescriptionSection_title_3_92_4-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDescriptionSection_title_3_92_4-error_mdht" name="p-OperativeNoteV3_2_ProcedureDescriptionSection_title_3_92_4-error_mdht">
		<!--
			UML path: /ProcedureDescriptionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDescriptionSection/procedureDescriptionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ProcedureDescriptionSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.92.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8064)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDescriptionSection: 2.16.840.1.113883.10.20.22.2.27 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDescriptionSection_code_3_92_2-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDescriptionSection_code_3_92_2-error_mdht" name="p-OperativeNoteV3_2_ProcedureDescriptionSection_code_3_92_2-error_mdht">
		<!--
			UML path: /ProcedureDescriptionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDescriptionSection/procedureDescriptionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '29554-3' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ProcedureDescriptionSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '29554-3' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.92.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15411)/@code=&quot;29554-3&quot; Procedure Description (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15412)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureDescriptionSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.92.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15411)/@code=&quot;29554-3&quot; Procedure Description (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15412)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDescriptionSection: 2.16.840.1.113883.10.20.22.2.27 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDescriptionSection_text_3_92_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDescriptionSection_text_3_92_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureDescriptionSection_text_3_92_3-error_mdht">
		<!--
			UML path: /ProcedureDescriptionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDescriptionSection/procedureDescriptionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ProcedureDescriptionSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.92.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8065)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDescriptionSection: 2.16.840.1.113883.10.20.22.2.27 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDescriptionSection_templateId_3_92_1-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDescriptionSection_templateId_3_92_1-error_mdht" name="p-OperativeNoteV3_2_ProcedureDescriptionSection_templateId_3_92_1-error_mdht">
		<!--
			UML path: /ProcedureDescriptionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDescriptionSection/procedureDescriptionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.27')
			Constraint name: ProcedureDescriptionSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27'">Error: Operative Note (V3) - 3.92.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8062, CONF:10442 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.27&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_postoperativeDiagnosisSection_2_14_6_i_h_1-error_mdht" see="#p-OperativeNoteV3_2_Component_postoperativeDiagnosisSection_2_14_6_i_h_1-error_mdht" name="p-OperativeNoteV3_2_Component_postoperativeDiagnosisSection_2_14_6_i_h_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/postoperativeDiagnosisSection
			UML root path: /OperativeNote2/component/structuredBody/postoperativeDiagnosisSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">
		<!--
			OCL: self.section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))
			Constraint name: OperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35'])=1">Error: Operative Note (V3) - 2.14.6.i.h.1 postoperativeDiagnosisSection
		Conformance: SHALL contain exactly one [1..1] section (CONF:1198-30500, CONF:1198-30501)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PostoperativeDiagnosisSection: 2.16.840.1.113883.10.20.22.2.35 -->

<pattern id="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_templateId_3_83_1-error_mdht" see="#p-OperativeNoteV3_2_PostoperativeDiagnosisSection_templateId_3_83_1-error_mdht" name="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_templateId_3_83_1-error_mdht">
		<!--
			UML path: /PostoperativeDiagnosisSection
			UML root path: /OperativeNote/component/structuredBody/postoperativeDiagnosisSection/postoperativeDiagnosisSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.35')
			Constraint name: PostoperativeDiagnosisSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35'">Error: Operative Note (V3) - 3.83.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8101, CONF:10437 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.35&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PostoperativeDiagnosisSection: 2.16.840.1.113883.10.20.22.2.35 -->

<pattern id="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_title_3_83_4-error_mdht" see="#p-OperativeNoteV3_2_PostoperativeDiagnosisSection_title_3_83_4-error_mdht" name="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_title_3_83_4-error_mdht">
		<!--
			UML path: /PostoperativeDiagnosisSection
			UML root path: /OperativeNote/component/structuredBody/postoperativeDiagnosisSection/postoperativeDiagnosisSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: PostoperativeDiagnosisSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.83.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8103)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PostoperativeDiagnosisSection: 2.16.840.1.113883.10.20.22.2.35 -->

<pattern id="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_code_3_83_2-error_mdht" see="#p-OperativeNoteV3_2_PostoperativeDiagnosisSection_code_3_83_2-error_mdht" name="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_code_3_83_2-error_mdht">
		<!--
			UML path: /PostoperativeDiagnosisSection
			UML root path: /OperativeNote/component/structuredBody/postoperativeDiagnosisSection/postoperativeDiagnosisSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '10218-6' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: PostoperativeDiagnosisSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '10218-6' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.83.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15401)/@code=&quot;10218-6&quot; Postoperative Diagnosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15402)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PostoperativeDiagnosisSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.83.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15401)/@code=&quot;10218-6&quot; Postoperative Diagnosis (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15402)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PostoperativeDiagnosisSection: 2.16.840.1.113883.10.20.22.2.35 -->

<pattern id="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_text_3_83_3-error_mdht" see="#p-OperativeNoteV3_2_PostoperativeDiagnosisSection_text_3_83_3-error_mdht" name="p-OperativeNoteV3_2_PostoperativeDiagnosisSection_text_3_83_3-error_mdht">
		<!--
			UML path: /PostoperativeDiagnosisSection
			UML root path: /OperativeNote/component/structuredBody/postoperativeDiagnosisSection/postoperativeDiagnosisSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: PostoperativeDiagnosisSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.83.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8104)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_procedureImplantsSection_2_14_6_i_i_1-error_mdht" see="#p-OperativeNoteV3_2_Component_procedureImplantsSection_2_14_6_i_i_1-error_mdht" name="p-OperativeNoteV3_2_Component_procedureImplantsSection_2_14_6_i_i_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/procedureImplantsSection
			UML root path: /OperativeNote2/component/structuredBody/procedureImplantsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.i.1 procedureImplantsSection
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30502, CONF:1198-30503)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureImplantsSection: 2.16.840.1.113883.10.20.22.2.40 -->

<pattern id="p-OperativeNoteV3_2_ProcedureImplantsSection_templateId_3_97_1-error_mdht" see="#p-OperativeNoteV3_2_ProcedureImplantsSection_templateId_3_97_1-error_mdht" name="p-OperativeNoteV3_2_ProcedureImplantsSection_templateId_3_97_1-error_mdht">
		<!--
			UML path: /ProcedureImplantsSection
			UML root path: /OperativeNote/component/structuredBody/procedureImplantsSection/procedureImplantsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.40')
			Constraint name: ProcedureImplantsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40'">Error: Operative Note (V3) - 3.97.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8178, CONF:10444 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.40&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureImplantsSection: 2.16.840.1.113883.10.20.22.2.40 -->

<pattern id="p-OperativeNoteV3_2_ProcedureImplantsSection_code_3_97_2-error_mdht" see="#p-OperativeNoteV3_2_ProcedureImplantsSection_code_3_97_2-error_mdht" name="p-OperativeNoteV3_2_ProcedureImplantsSection_code_3_97_2-error_mdht">
		<!--
			UML path: /ProcedureImplantsSection
			UML root path: /OperativeNote/component/structuredBody/procedureImplantsSection/procedureImplantsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59771-6' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ProcedureImplantsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59771-6' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.97.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15373)/@code=&quot;59771-6&quot; Procedure Implants (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15374)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureImplantsSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.97.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15373)/@code=&quot;59771-6&quot; Procedure Implants (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15374)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureImplantsSection: 2.16.840.1.113883.10.20.22.2.40 -->

<pattern id="p-OperativeNoteV3_2_ProcedureImplantsSection_title_3_97_4-error_mdht" see="#p-OperativeNoteV3_2_ProcedureImplantsSection_title_3_97_4-error_mdht" name="p-OperativeNoteV3_2_ProcedureImplantsSection_title_3_97_4-error_mdht">
		<!--
			UML path: /ProcedureImplantsSection
			UML root path: /OperativeNote/component/structuredBody/procedureImplantsSection/procedureImplantsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ProcedureImplantsSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.97.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8180)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureImplantsSection: 2.16.840.1.113883.10.20.22.2.40 -->

<pattern id="p-OperativeNoteV3_2_ProcedureImplantsSection_text_3_97_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureImplantsSection_text_3_97_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureImplantsSection_text_3_97_3-error_mdht">
		<!--
			UML path: /ProcedureImplantsSection
			UML root path: /OperativeNote/component/structuredBody/procedureImplantsSection/procedureImplantsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ProcedureImplantsSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.97.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8181)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_operativeNoteFluidSection_2_14_6_i_j_1-error_mdht" see="#p-OperativeNoteV3_2_Component_operativeNoteFluidSection_2_14_6_i_j_1-error_mdht" name="p-OperativeNoteV3_2_Component_operativeNoteFluidSection_2_14_6_i_j_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/operativeNoteFluidSection
			UML root path: /OperativeNote2/component/structuredBody/operativeNoteFluidSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteFluidSection))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.j.1 operativeNoteFluidSection
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30504, CONF:1198-30505)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteFluidSection: 2.16.840.1.113883.10.20.7.12 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteFluidSection_code_3_72_2-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteFluidSection_code_3_72_2-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteFluidSection_code_3_72_2-error_mdht">
		<!--
			UML path: /OperativeNoteFluidSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteFluidSection/operativeNoteFluidSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '10216-0' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: OperativeNoteFluidSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '10216-0' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.72.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15391)/@code=&quot;10216-0&quot; Operative Note Fluids (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15392)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: OperativeNoteFluidSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.72.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15391)/@code=&quot;10216-0&quot; Operative Note Fluids (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15392)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteFluidSection: 2.16.840.1.113883.10.20.7.12 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteFluidSection_templateId_3_72_1-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteFluidSection_templateId_3_72_1-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteFluidSection_templateId_3_72_1-error_mdht">
		<!--
			UML path: /OperativeNoteFluidSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteFluidSection/operativeNoteFluidSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.12')
			Constraint name: OperativeNoteFluidSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.7.12'">Error: Operative Note (V3) - 3.72.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8030, CONF:10463 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.7.12&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteFluidSection: 2.16.840.1.113883.10.20.7.12 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteFluidSection_title_3_72_4-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteFluidSection_title_3_72_4-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteFluidSection_title_3_72_4-error_mdht">
		<!--
			UML path: /OperativeNoteFluidSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteFluidSection/operativeNoteFluidSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: OperativeNoteFluidSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.72.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8032)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteFluidSection: 2.16.840.1.113883.10.20.7.12 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteFluidSection_text_3_72_3-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteFluidSection_text_3_72_3-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteFluidSection_text_3_72_3-error_mdht">
		<!--
			UML path: /OperativeNoteFluidSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteFluidSection/operativeNoteFluidSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: OperativeNoteFluidSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.72.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8033)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_operativeNoteSurgicalProcedureSection_2_14_6_i_k_1-error_mdht" see="#p-OperativeNoteV3_2_Component_operativeNoteSurgicalProcedureSection_2_14_6_i_k_1-error_mdht" name="p-OperativeNoteV3_2_Component_operativeNoteSurgicalProcedureSection_2_14_6_i_k_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/operativeNoteSurgicalProcedureSection
			UML root path: /OperativeNote2/component/structuredBody/operativeNoteSurgicalProcedureSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::OperativeNoteSurgicalProcedureSection))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.k.1 operativeNoteSurgicalProcedureSection
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30506, CONF:1198-30507)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteSurgicalProcedureSection: 2.16.840.1.113883.10.20.7.14 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_templateId_3_73_1-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_templateId_3_73_1-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_templateId_3_73_1-error_mdht">
		<!--
			UML path: /OperativeNoteSurgicalProcedureSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteSurgicalProcedureSection/operativeNoteSurgicalProcedureSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.14')
			Constraint name: OperativeNoteSurgicalProcedureSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.7.14'">Error: Operative Note (V3) - 3.73.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8034, CONF:10464 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.7.14&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteSurgicalProcedureSection: 2.16.840.1.113883.10.20.7.14 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_text_3_73_3-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_text_3_73_3-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_text_3_73_3-error_mdht">
		<!--
			UML path: /OperativeNoteSurgicalProcedureSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteSurgicalProcedureSection/operativeNoteSurgicalProcedureSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: OperativeNoteSurgicalProcedureSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.73.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8037)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteSurgicalProcedureSection: 2.16.840.1.113883.10.20.7.14 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_title_3_73_4-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_title_3_73_4-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_title_3_73_4-error_mdht">
		<!--
			UML path: /OperativeNoteSurgicalProcedureSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteSurgicalProcedureSection/operativeNoteSurgicalProcedureSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: OperativeNoteSurgicalProcedureSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.73.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8036)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- OperativeNoteSurgicalProcedureSection: 2.16.840.1.113883.10.20.7.14 -->

<pattern id="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_code_3_73_2-error_mdht" see="#p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_code_3_73_2-error_mdht" name="p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_code_3_73_2-error_mdht">
		<!--
			UML path: /OperativeNoteSurgicalProcedureSection
			UML root path: /OperativeNote/component/structuredBody/operativeNoteSurgicalProcedureSection/operativeNoteSurgicalProcedureSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '10223-6' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: OperativeNoteSurgicalProcedureSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '10223-6' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.73.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15393)/@code=&quot;10223-6&quot; Operative Note Surgical (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: OperativeNoteSurgicalProcedureSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.73.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15393)/@code=&quot;10223-6&quot; Operative Note Surgical (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_planOfTreatmentSection2_2_14_6_i_l_1-error_mdht" see="#p-OperativeNoteV3_2_Component_planOfTreatmentSection2_2_14_6_i_l_1-error_mdht" name="p-OperativeNoteV3_2_Component_planOfTreatmentSection2_2_14_6_i_l_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/planOfTreatmentSection2
			UML root path: /OperativeNote2/component/structuredBody/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.l.1 planOfTreatmentSection2
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30508, CONF:1198-30509)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_5-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_5-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_5-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::PlannedEncounter2Entry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.5 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_2_PlanOfTreatmentSection2_text_3_82_4-error_mdht" see="#p-OperativeNoteV3_2_PlanOfTreatmentSection2_text_3_82_4-error_mdht" name="p-OperativeNoteV3_2_PlanOfTreatmentSection2_text_3_82_4-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: PlanOfCareSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.82.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:7725, R2.0=CONF:1098-7725)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_6-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_6-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_6-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::PlannedAct2Entry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.6 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_9-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_9-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_9-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::PlannedSupply2Entry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.9 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_13-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_13-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_13-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::PlannedImmunizationActivityEntry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.13 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_2_PlanOfTreatmentSection2_templateId_3_82_1-error_mdht" see="#p-OperativeNoteV3_2_PlanOfTreatmentSection2_templateId_3_82_1-error_mdht" name="p-OperativeNoteV3_2_PlanOfTreatmentSection2_templateId_3_82_1-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10' and id.extension = '2014-06-09')
			Constraint name: PlanOfCareSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10' and @extension = '2014-06-09'">Error: Operative Note (V3) - 3.82.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-7723, CONF:1098-10435, CONF:1098-32501 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.10&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_4-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_4-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_4-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::PlannedObservation2Entry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_14-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_14-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_14-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::GoalObservationEntry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.14 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_11-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_11-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_11-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::HandoffCommunicationParticipantsEntry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.11 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_2_PlanOfTreatmentSection2_title_3_82_3-error_mdht" see="#p-OperativeNoteV3_2_PlanOfTreatmentSection2_title_3_82_3-error_mdht" name="p-OperativeNoteV3_2_PlanOfTreatmentSection2_title_3_82_3-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: PlanOfCareSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.82.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:16986, R2.0=CONF:1098-16986)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_7-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_7-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_7-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::PlannedProcedure2Entry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.7 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_2_PlanOfTreatmentSection2_code_3_82_3-error_mdht" see="#p-OperativeNoteV3_2_PlanOfTreatmentSection2_code_3_82_3-error_mdht" name="p-OperativeNoteV3_2_PlanOfTreatmentSection2_code_3_82_3-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PlanOfCareSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.82.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-14749)/@code=&quot;18776-5&quot; Plan of Treatment (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-14750, CONF:1098-30813)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: PlanOfCareSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '18776-5' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.82.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-14749)/@code=&quot;18776-5&quot; Plan of Treatment (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-14750, CONF:1098-30813)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_10-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_10-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_10-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::Instruction2Entry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.10 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_12-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_12-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_12-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::NutritionRecommendationEntry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.12 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlanOfTreatmentSection2: 2.16.840.1.113883.10.20.22.2.10 -->

<pattern id="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_8-error_mdht" see="#p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_8-error_mdht" name="p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_8-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlanOfTreatmentSection2::PlannedMedicationActivity2Entry))
			Constraint name: PlanOfTreatmentSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.82.8 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2Entry -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2Entry_plannedObservation2_3_82_4_i-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2Entry_plannedObservation2_3_82_4_i-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2Entry_plannedObservation2_3_82_4_i-error_mdht">
		<!--
			UML path: /PlanOfTreatmentSection2/entry
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2))->size() >= 0
			Constraint name: PlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation2
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']) &gt;= 0">Error: Operative Note (V3) - 3.82.4.i plannedObservation2
		Conformance: MAY contain zero or more [0..*] observation (CONF:1098-7726, CONF:1098-14751)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_12-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_12-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_12-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedObservation2::PriorityPreferenceEntryRelationship))
			Constraint name: PlannedObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.94.12 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_15-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_15-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_15-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedObservation2::PlannedCoverageEntryRelationship))
			Constraint name: PlannedObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.94.15 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_value_4_94_7-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_value_4_94_7-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_value_4_94_7-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: ((not self.value->isEmpty()) and self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() <= 1)
			Constraint name: PlannedObservation2Value
		-->
	<assert test="not(cda:value and cda:value[not(@nullFlavor)]) or count(cda:value) &lt;= 1">Error: Operative Note (V3) - 4.94.7 value
		Conformance: MAY contain zero or one [0..1] value (CONF:1098-31031)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_methodCode_4_94_8-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_methodCode_4_94_8-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_methodCode_4_94_8-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: ((not self.methodCode->isEmpty()) and self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() <= 1)
			Constraint name: PlannedObservation2MethodCode
		-->
	<assert test="not(cda:methodCode and cda:methodCode[not(@nullFlavor)]) or count(cda:methodCode) &lt;= 1">Error: Operative Note (V3) - 4.94.8 methodCode
		Conformance: MAY contain zero or one [0..1] methodCode (CONF:1098-32043)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_authorParticipation_4_94_11-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_authorParticipation_4_94_11-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_authorParticipation_4_94_11-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: self.author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))->size() >= 0
			Constraint name: PlannedObservation2AuthorParticipation
		-->
	<assert test="count(cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']) &gt;= 0">Error: Operative Note (V3) - 4.94.11 authorParticipation
		Conformance: SHOULD contain  [0..*] author such that it  (CONF:1098-32033)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_effectiveTime_4_94_6-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_effectiveTime_4_94_6-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_effectiveTime_4_94_6-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: PlannedObservation2EffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Operative Note (V3) - 4.94.6 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:1098-30454)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_performer_4_94_10-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_performer_4_94_10-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_performer_4_94_10-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->size() >= 0
			Constraint name: PlannedObservation2Performer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: Operative Note (V3) - 4.94.10 performer
		Conformance: MAY contain  [0..*] performer such that it  (CONF:1098-30456)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_13-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_13-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_13-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedObservation2::Indication2EntryRelationship))
			Constraint name: PlannedObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.94.13 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_14-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_14-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_14-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedObservation2::Instruction2EntryRelationship))
			Constraint name: PlannedObservation2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.94.14 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_code_4_94_4-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_code_4_94_4-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_code_4_94_4-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PlannedObservation2CodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.94.4 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-31030)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: PlannedObservation2Code
		-->
	<assert test="cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 4.94.4 code
		Conformance: SHALL contain exactly one [1..1] code, which SHOULD be selected from (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-31030)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_statusCode_4_94_5-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_statusCode_4_94_5-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_statusCode_4_94_5-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'active'
			Constraint name: PlannedObservation2StatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'active']">Error: Operative Note (V3) - 4.94.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-30453)/@code=&quot;active&quot; Active (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-32032)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: PlannedObservation2StatusCodeP
		-->
	<assert test="cda:statusCode">Error: Operative Note (V3) - 4.94.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-30453)/@code=&quot;active&quot; Active (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-32032)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_moodCode_4_94_3-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_moodCode_4_94_3-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_moodCode_4_94_3-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: true
			Constraint name: PlanOfCareActivityObservationMoodCodeP
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.94.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode, which SHALL be selected from ValueSet Planned moodCode (Observation) 2.16.840.1.113883.11.20.9.25 STATIC 2011-09-30 (CONF:1098-8582)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_ActMoodDocumentObservation) and 
let value : vocab::x_ActMoodDocumentObservation = self.moodCode.oclAsType(vocab::x_ActMoodDocumentObservation) in 
value = vocab::x_ActMoodDocumentObservation::INT or value = vocab::x_ActMoodDocumentObservation::GOL or value = vocab::x_ActMoodDocumentObservation::PRMS or value = vocab::x_ActMoodDocumentObservation::PRP or value = vocab::x_ActMoodDocumentObservation::RQO
			Constraint name: PlanOfCareActivityObservationMoodCode
		-->
	<assert test="@moodCode and @moodCode[. = 'INT' or . = 'GOL' or . = 'PRMS' or . = 'PRP' or . = 'RQO']">Error: Operative Note (V3) - 4.94.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode, which SHALL be selected from ValueSet Planned moodCode (Observation) 2.16.840.1.113883.11.20.9.25 STATIC 2011-09-30 (CONF:1098-8582)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_targetSiteCode_4_94_9-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_targetSiteCode_4_94_9-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_targetSiteCode_4_94_9-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: ((not self.targetSiteCode->isEmpty()) and self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
			Constraint name: PlannedObservation2TargetSiteCodeP
		-->
	<assert test="not(cda:targetSiteCode and cda:targetSiteCode[not(@nullFlavor)]) or cda:targetSiteCode">Error: Operative Note (V3) - 4.94.9 targetSiteCode
		Conformance: SHOULD contain zero or more [0..*] targetSiteCode, which SHALL be selected from ValueSet Body Site 2.16.840.1.113883.3.88.12.3221.8.9 DYNAMIC (CONF:1098-32044)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.targetSiteCode->isEmpty()) and self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
			Constraint name: PlannedObservation2TargetSiteCode
		-->
	<assert test="not(cda:targetSiteCode and cda:targetSiteCode[not(@nullFlavor)]) or not(cda:targetSiteCode[not(. and @codeSystem = '2.16.840.1.113883.6.96' and @code)])">Error: Operative Note (V3) - 4.94.9 targetSiteCode
		Conformance: SHOULD contain zero or more [0..*] targetSiteCode, which SHALL be selected from ValueSet Body Site 2.16.840.1.113883.3.88.12.3221.8.9 DYNAMIC (CONF:1098-32044)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedObservation2: 2.16.840.1.113883.10.20.22.4.44 -->

<pattern id="p-OperativeNoteV3_3A_PlannedObservation2_templateId_4_94_1-error_mdht" see="#p-OperativeNoteV3_3A_PlannedObservation2_templateId_4_94_1-error_mdht" name="p-OperativeNoteV3_3A_PlannedObservation2_templateId_4_94_1-error_mdht">
		<!--
			UML path: /PlannedObservation2
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.44' and id.extension = '2014-06-09')
			Constraint name: PlanOfCareActivityObservationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44' and @extension = '2014-06-09'">Error: Operative Note (V3) - 4.94.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-30451, CONF:1098-30452, CONF:1098-32555 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.44&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreferenceEntryRelationship -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_94_12_i-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_94_12_i-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_94_12_i-error_mdht">
		<!--
			UML path: /PlannedObservation2/entryRelationship
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference))->size() >= 0
			Constraint name: PlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']) &gt;= 0">Error: Operative Note (V3) - 4.94.12.i PriorityPreference
		Conformance: MAY contain zero or more [0..*] observation (CONF:1098-31073, CONF:1098-31074, CONF:1098-31075)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_effectiveTime_4_111_6-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_effectiveTime_4_111_6-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_effectiveTime_4_111_6-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: PriorityPreferenceEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Operative Note (V3) - 4.111.6 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:1098-32327)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_templateId_4_111_1-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_templateId_4_111_1-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_templateId_4_111_1-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.143')
			Constraint name: PriorityPreferenceTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143'">Error: Operative Note (V3) - 4.111.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-30951, CONF:1098-30952 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.143&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_code_4_111_5-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_code_4_111_5-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_code_4_111_5-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PriorityPreferenceCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.111.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-30954)/@code=&quot;225773000&quot; Preference (CodeSystem: 2.16.840.1.113883.6.96 SNOMEDCT) (CONF:1098-30955, CONF:1098-30956)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
value.code = '225773000' and value.codeSystem = '2.16.840.1.113883.6.96'
			Constraint name: PriorityPreferenceCode
		-->
	<assert test="cda:code and cda:code[@code = '225773000' and @codeSystem = '2.16.840.1.113883.6.96']">Error: Operative Note (V3) - 4.111.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-30954)/@code=&quot;225773000&quot; Preference (CodeSystem: 2.16.840.1.113883.6.96 SNOMEDCT) (CONF:1098-30955, CONF:1098-30956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_authorParticipation_4_111_8-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_authorParticipation_4_111_8-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_authorParticipation_4_111_8-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: self.author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))->size() >= 0
			Constraint name: PriorityPreferenceAuthorParticipation
		-->
	<assert test="count(cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']) &gt;= 0">Error: Operative Note (V3) - 4.111.8 authorParticipation
		Conformance: SHOULD contain  [0..*] author such that it  (CONF:1098-30958)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_id_4_111_4-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_id_4_111_4-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_id_4_111_4-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: PriorityPreferenceId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.111.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-30953)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_classCode_4_111_2-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_classCode_4_111_2-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_classCode_4_111_2-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::OBS
			Constraint name: PriorityPreferenceClassCode
		-->
	<assert test="@classCode = 'OBS'">Error: Operative Note (V3) - 4.111.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;OBS&quot; Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:1098-30949)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_moodCode_4_111_3-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_moodCode_4_111_3-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_moodCode_4_111_3-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: PriorityPreferenceMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Operative Note (V3) - 4.111.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:1098-30950)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreference: 2.16.840.1.113883.10.20.22.4.143 -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreference_value_4_111_7-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreference_value_4_111_7-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreference_value_4_111_7-error_mdht">
		<!--
			UML path: /PriorityPreference
			UML root path: /ReferralNote/component/structuredBody/planOfTreatmentSection2/planOfTreatmentSection2/entry/plannedObservation2/entryRelationship/PriorityPreference
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">
		<!--
			OCL: self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '394849002' or value.code = '394848005' or value.code = '441808003'))
			Constraint name: PriorityPreferenceValue
		-->
	<assert test="count(cda:value) = 1 and not(cda:value[not(. and @xsi:type='CD' and @codeSystem = '2.16.840.1.113883.6.96' and (@code = '394849002' or @code = '394848005' or @code = '441808003'))])">Error: Operative Note (V3) - 4.111.7 value
		Conformance: SHALL contain exactly one [1..1] value with @xsi:type=&quot;CD&quot;, which SHALL be selected from ValueSet Priority Level 2.16.840.1.113883.11.20.9.60 STATIC 2014-06-11 (CONF:1098-30957)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD))
			Constraint name: PriorityPreferenceValueP
		-->
	<assert test="count(cda:value) = 1 and not(cda:value[not(@xsi:type='CD')])">Error: Operative Note (V3) - 4.111.7 value
		Conformance: SHALL contain exactly one [1..1] value with @xsi:type=&quot;CD&quot;, which SHALL be selected from ValueSet Priority Level 2.16.840.1.113883.11.20.9.60 STATIC 2014-06-11 (CONF:1098-30957)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_plannedProcedureSection2_2_14_6_i_m_1-error_mdht" see="#p-OperativeNoteV3_2_Component_plannedProcedureSection2_2_14_6_i_m_1-error_mdht" name="p-OperativeNoteV3_2_Component_plannedProcedureSection2_2_14_6_i_m_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/plannedProcedureSection2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.m.1 plannedProcedureSection2
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30510, CONF:1198-30511)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedureSection2: 2.16.840.1.113883.10.20.22.2.30 -->

<pattern id="p-OperativeNoteV3_2_PlannedProcedureSection2_title_3_80_3-error_mdht" see="#p-OperativeNoteV3_2_PlannedProcedureSection2_title_3_80_3-error_mdht" name="p-OperativeNoteV3_2_PlannedProcedureSection2_title_3_80_3-error_mdht">
		<!--
			UML path: /PlannedProcedureSection2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: PlannedProcedureSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.80.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8084, R2.0=CONF:1098-8084)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedureSection2: 2.16.840.1.113883.10.20.22.2.30 -->

<pattern id="p-OperativeNoteV3_2_PlannedProcedureSection2_templateId_3_80_1-error_mdht" see="#p-OperativeNoteV3_2_PlannedProcedureSection2_templateId_3_80_1-error_mdht" name="p-OperativeNoteV3_2_PlannedProcedureSection2_templateId_3_80_1-error_mdht">
		<!--
			UML path: /PlannedProcedureSection2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.30' and id.extension = '2014-06-09')
			Constraint name: PlannedProcedureSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30' and @extension = '2014-06-09'">Error: Operative Note (V3) - 3.80.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-8082, CONF:1098-10436, CONF:1098-32590 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.30&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedureSection2: 2.16.840.1.113883.10.20.22.2.30 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedureSection2_entry_3_80_4-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedureSection2_entry_3_80_4-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedureSection2_entry_3_80_4-error_mdht">
		<!--
			UML path: /PlannedProcedureSection2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::PlannedProcedureSection2::PlannedProcedure2Entry))
			Constraint name: PlannedProcedureSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.80.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedureSection2: 2.16.840.1.113883.10.20.22.2.30 -->

<pattern id="p-OperativeNoteV3_2_PlannedProcedureSection2_code_3_80_3-error_mdht" see="#p-OperativeNoteV3_2_PlannedProcedureSection2_code_3_80_3-error_mdht" name="p-OperativeNoteV3_2_PlannedProcedureSection2_code_3_80_3-error_mdht">
		<!--
			UML path: /PlannedProcedureSection2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PlannedProcedureSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.80.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-15399)/@code=&quot;59772-4&quot; Planned Procedure (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-15400, CONF:1098-32151)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59772-4' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: PlannedProcedureSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59772-4' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.80.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-15399)/@code=&quot;59772-4&quot; Planned Procedure (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-15400, CONF:1098-32151)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedureSection2: 2.16.840.1.113883.10.20.22.2.30 -->

<pattern id="p-OperativeNoteV3_2_PlannedProcedureSection2_text_3_80_4-error_mdht" see="#p-OperativeNoteV3_2_PlannedProcedureSection2_text_3_80_4-error_mdht" name="p-OperativeNoteV3_2_PlannedProcedureSection2_text_3_80_4-error_mdht">
		<!--
			UML path: /PlannedProcedureSection2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: PlannedProcedureSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.80.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8085, R2.0=CONF:1098-8085)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2Entry -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2Entry_plannedProcedure2_3_80_4_i-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2Entry_plannedProcedure2_3_80_4_i-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2Entry_plannedProcedure2_3_80_4_i-error_mdht">
		<!--
			UML path: /PlannedProcedureSection2/entry
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry">
		<!--
			OCL: self.procedure->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2))->size() >= 0
			Constraint name: PlannedProcedureSection2PlannedProcedure2EntryPlannedProcedure2
		-->
	<assert test="count(cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']) &gt;= 0">Error: Operative Note (V3) - 3.80.4.i plannedProcedure2
		Conformance: MAY contain zero or more [0..*] procedure (CONF:1098-8744, CONF:1098-15502)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_code_4_95_4-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_code_4_95_4-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_code_4_95_4-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: PlannedProcedure2Code
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.95.4 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-31976)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_13-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_13-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_13-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedProcedure2::Instruction2EntryRelationship))
			Constraint name: PlannedProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.95.13 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_14-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_14-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_14-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedProcedure2::PlannedCoverageEntryRelationship))
			Constraint name: PlannedProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.95.14 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_moodCode_4_95_3-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_moodCode_4_95_3-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_moodCode_4_95_3-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: true
			Constraint name: PlanOfCareActivityProcedureMoodCodeP
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.95.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode, which SHALL be selected from ValueSet Planned moodCode (Act/Encounter/Procedure) 2.16.840.1.113883.11.20.9.23 STATIC 2011-09-30 (CONF:1098-8569)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentProcedureMood) and 
let value : vocab::x_DocumentProcedureMood = self.moodCode.oclAsType(vocab::x_DocumentProcedureMood) in 
value = vocab::x_DocumentProcedureMood::INT or value = vocab::x_DocumentProcedureMood::ARQ or value = vocab::x_DocumentProcedureMood::PRMS or value = vocab::x_DocumentProcedureMood::PRP or value = vocab::x_DocumentProcedureMood::RQO
			Constraint name: PlanOfCareActivityProcedureMoodCode
		-->
	<assert test="@moodCode and @moodCode[. = 'INT' or . = 'ARQ' or . = 'PRMS' or . = 'PRP' or . = 'RQO']">Error: Operative Note (V3) - 4.95.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode, which SHALL be selected from ValueSet Planned moodCode (Act/Encounter/Procedure) 2.16.840.1.113883.11.20.9.23 STATIC 2011-09-30 (CONF:1098-8569)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_targetSiteCode_4_95_8-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_targetSiteCode_4_95_8-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_targetSiteCode_4_95_8-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: ((not self.targetSiteCode->isEmpty()) and self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
			Constraint name: PlannedProcedure2TargetSiteCodeP
		-->
	<assert test="not(cda:targetSiteCode and cda:targetSiteCode[not(@nullFlavor)]) or cda:targetSiteCode">Error: Operative Note (V3) - 4.95.8 targetSiteCode
		Conformance: MAY contain zero or more [0..*] targetSiteCode, which SHALL be selected from ValueSet Body Site 2.16.840.1.113883.3.88.12.3221.8.9 DYNAMIC (CONF:1098-31981)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.targetSiteCode->isEmpty()) and self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
			Constraint name: PlannedProcedure2TargetSiteCode
		-->
	<assert test="not(cda:targetSiteCode and cda:targetSiteCode[not(@nullFlavor)]) or not(cda:targetSiteCode[not(. and @codeSystem = '2.16.840.1.113883.6.96' and @code)])">Error: Operative Note (V3) - 4.95.8 targetSiteCode
		Conformance: MAY contain zero or more [0..*] targetSiteCode, which SHALL be selected from ValueSet Body Site 2.16.840.1.113883.3.88.12.3221.8.9 DYNAMIC (CONF:1098-31981)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_authorParticipation_4_95_10-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_authorParticipation_4_95_10-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_authorParticipation_4_95_10-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.author->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))->size() <= 1
			Constraint name: PlannedProcedure2AuthorParticipation
		-->
	<assert test="count(cda:author[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.119']) &lt;= 1">Error: Operative Note (V3) - 4.95.10 authorParticipation
		Conformance: SHOULD contain  [0..1] author such that it  (CONF:1098-31979)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_performer_4_95_9-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_performer_4_95_9-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_performer_4_95_9-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->size() >= 0
			Constraint name: PlannedProcedure2Performer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: Operative Note (V3) - 4.95.9 performer
		Conformance: MAY contain  [0..*] performer such that it  (CONF:1098-30449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_classCode_4_95_2-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_classCode_4_95_2-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_classCode_4_95_2-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.classCode=vocab::ActClass::PROC
			Constraint name: PlanOfCareActivityProcedureClassCode
		-->
	<assert test="@classCode = 'PROC'">Error: Operative Note (V3) - 4.95.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;PROC&quot;  (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:8568, R2.0=CONF:1098-8568)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_11-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_11-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_11-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedProcedure2::PriorityPreferenceEntryRelationship))
			Constraint name: PlannedProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.95.11 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_12-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_12-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_12-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(consol::PlannedProcedure2::Indication2EntryRelationship))
			Constraint name: PlannedProcedure2EntryRelationship
		-->
	<assert test="count(cda:entryRelationship)=1">Error: Operative Note (V3) - 4.95.12 entryRelationship
		Conformance: SHALL contain exactly one [1..1] entryRelationship
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_methodCode_4_95_7-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_methodCode_4_95_7-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_methodCode_4_95_7-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: ((not self.methodCode->isEmpty()) and self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
			Constraint name: PlannedProcedure2MethodCode
		-->
	<assert test="not(cda:methodCode and cda:methodCode[not(@nullFlavor)]) or cda:methodCode">Error: Operative Note (V3) - 4.95.7 methodCode
		Conformance: MAY contain zero or more [0..*] methodCode (CONF:1098-31980)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_templateId_4_95_1-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_templateId_4_95_1-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_templateId_4_95_1-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.41' and id.extension = '2014-06-09')
			Constraint name: PlanOfCareActivityProcedureTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41' and @extension = '2014-06-09'">Error: Operative Note (V3) - 4.95.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-30444, CONF:1098-30445, CONF:1098-32554 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.41&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_effectiveTime_4_95_6-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_effectiveTime_4_95_6-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_effectiveTime_4_95_6-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: PlannedProcedure2EffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Operative Note (V3) - 4.95.6 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:1098-30447)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_statusCode_4_95_5-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_statusCode_4_95_5-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_statusCode_4_95_5-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'active'
			Constraint name: PlannedProcedure2StatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'active']">Error: Operative Note (V3) - 4.95.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-30446)/@code=&quot;active&quot; Active (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-31978)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: PlannedProcedure2StatusCodeP
		-->
	<assert test="cda:statusCode">Error: Operative Note (V3) - 4.95.5 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:1098-30446)/@code=&quot;active&quot; Active (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:1098-31978)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PlannedProcedure2: 2.16.840.1.113883.10.20.22.4.41 -->

<pattern id="p-OperativeNoteV3_3A_PlannedProcedure2_id_4_95_4-error_mdht" see="#p-OperativeNoteV3_3A_PlannedProcedure2_id_4_95_4-error_mdht" name="p-OperativeNoteV3_3A_PlannedProcedure2_id_4_95_4-error_mdht">
		<!--
			UML path: /PlannedProcedure2
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: PlanOfCareActivityProcedureId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.95.4 id
		Conformance: SHALL contain at least one [1..*] id (CONF:8571, R2.0=CONF:1098-8571)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PriorityPreferenceEntryRelationship -->

<pattern id="p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_95_11_i-error_mdht" see="#p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_95_11_i-error_mdht" name="p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_95_11_i-error_mdht">
		<!--
			UML path: /PlannedProcedure2/entryRelationship
			UML root path: /OperativeNote2/component/structuredBody/plannedProcedureSection2/plannedProcedureSection2/entry/plannedProcedure2/entryRelationship
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']/cda:entryRelationship">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference))->size() >= 0
			Constraint name: PlannedProcedure2PriorityPreferenceEntryRelationshipPriorityPreference
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']) &gt;= 0">Error: Operative Note (V3) - 4.95.11.i PriorityPreference
		Conformance: MAY contain zero or more [0..*] observation (CONF:1098-31079, CONF:1098-31080, CONF:1098-31081)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_procedureDispositionSection_2_14_6_i_n_1-error_mdht" see="#p-OperativeNoteV3_2_Component_procedureDispositionSection_2_14_6_i_n_1-error_mdht" name="p-OperativeNoteV3_2_Component_procedureDispositionSection_2_14_6_i_n_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/procedureDispositionSection
			UML root path: /OperativeNote2/component/structuredBody/procedureDispositionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.n.1 procedureDispositionSection
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30512, CONF:1198-30513)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDispositionSection: 2.16.840.1.113883.10.20.18.2.12 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDispositionSection_title_3_93_4-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDispositionSection_title_3_93_4-error_mdht" name="p-OperativeNoteV3_2_ProcedureDispositionSection_title_3_93_4-error_mdht">
		<!--
			UML path: /ProcedureDispositionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDispositionSection/procedureDispositionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ProcedureDispositionSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.93.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8072)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDispositionSection: 2.16.840.1.113883.10.20.18.2.12 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDispositionSection_text_3_93_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDispositionSection_text_3_93_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureDispositionSection_text_3_93_3-error_mdht">
		<!--
			UML path: /ProcedureDispositionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDispositionSection/procedureDispositionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ProcedureDispositionSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.93.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8073)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDispositionSection: 2.16.840.1.113883.10.20.18.2.12 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDispositionSection_templateId_3_93_1-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDispositionSection_templateId_3_93_1-error_mdht" name="p-OperativeNoteV3_2_ProcedureDispositionSection_templateId_3_93_1-error_mdht">
		<!--
			UML path: /ProcedureDispositionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDispositionSection/procedureDispositionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.12')
			Constraint name: ProcedureDispositionSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12'">Error: Operative Note (V3) - 3.93.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8070, CONF:10466 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.18.2.12&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureDispositionSection: 2.16.840.1.113883.10.20.18.2.12 -->

<pattern id="p-OperativeNoteV3_2_ProcedureDispositionSection_code_3_93_2-error_mdht" see="#p-OperativeNoteV3_2_ProcedureDispositionSection_code_3_93_2-error_mdht" name="p-OperativeNoteV3_2_ProcedureDispositionSection_code_3_93_2-error_mdht">
		<!--
			UML path: /ProcedureDispositionSection
			UML root path: /OperativeNote/component/structuredBody/procedureDispositionSection/procedureDispositionSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59775-7' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ProcedureDispositionSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59775-7' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.93.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15413)/@code=&quot;59775-7&quot; Procedure Disposition (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15414)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureDispositionSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.93.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15413)/@code=&quot;59775-7&quot; Procedure Disposition (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_procedureIndicationsSection2_2_14_6_i_o_1-error_mdht" see="#p-OperativeNoteV3_2_Component_procedureIndicationsSection2_2_14_6_i_o_1-error_mdht" name="p-OperativeNoteV3_2_Component_procedureIndicationsSection2_2_14_6_i_o_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection2
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.o.1 procedureIndicationsSection2
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30514, CONF:1198-30515)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureIndicationsSection2: 2.16.840.1.113883.10.20.22.2.29 -->

<pattern id="p-OperativeNoteV3_2_ProcedureIndicationsSection2_templateId_3_99_1-error_mdht" see="#p-OperativeNoteV3_2_ProcedureIndicationsSection2_templateId_3_99_1-error_mdht" name="p-OperativeNoteV3_2_ProcedureIndicationsSection2_templateId_3_99_1-error_mdht">
		<!--
			UML path: /ProcedureIndicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2/procedureIndicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.29' and id.extension = '2014-06-09')
			Constraint name: ProcedureIndicationsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29' and @extension = '2014-06-09'">Error: Operative Note (V3) - 3.99.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-8058, CONF:1098-10445, CONF:1098-32572 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.2.29&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureIndicationsSection2: 2.16.840.1.113883.10.20.22.2.29 -->

<pattern id="p-OperativeNoteV3_2_ProcedureIndicationsSection2_text_3_99_4-error_mdht" see="#p-OperativeNoteV3_2_ProcedureIndicationsSection2_text_3_99_4-error_mdht" name="p-OperativeNoteV3_2_ProcedureIndicationsSection2_text_3_99_4-error_mdht">
		<!--
			UML path: /ProcedureIndicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2/procedureIndicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: ProcedureIndicationsSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.99.4 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8061, R2.0=CONF:1098-8061)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureIndicationsSection2: 2.16.840.1.113883.10.20.22.2.29 -->

<pattern id="p-OperativeNoteV3_2_ProcedureIndicationsSection2_code_3_99_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureIndicationsSection2_code_3_99_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureIndicationsSection2_code_3_99_3-error_mdht">
		<!--
			UML path: /ProcedureIndicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2/procedureIndicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: ProcedureIndicationsSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.99.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-15419)/@code=&quot;59768-2&quot; Procedure Indications (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-15420, CONF:1098-30827)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '59768-2' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: ProcedureIndicationsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '59768-2' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.99.3 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1098-15419)/@code=&quot;59768-2&quot; Procedure Indications (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:1098-15420, CONF:1098-30827)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureIndicationsSection2: 2.16.840.1.113883.10.20.22.2.29 -->

<pattern id="p-OperativeNoteV3_3A_ProcedureIndicationsSection2_entry_3_99_4-error_mdht" see="#p-OperativeNoteV3_3A_ProcedureIndicationsSection2_entry_3_99_4-error_mdht" name="p-OperativeNoteV3_3A_ProcedureIndicationsSection2_entry_3_99_4-error_mdht">
		<!--
			UML path: /ProcedureIndicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2/procedureIndicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">
		<!--
			OCL: self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(consol::ProcedureIndicationsSection2::Indication2Entry))
			Constraint name: ProcedureIndicationsSection2Entry
		-->
	<assert test="@nullFlavor = 'NI' or count(cda:entry)=1">Error: Operative Note (V3) - 3.99.4 entry
		Conformance: SHALL contain exactly one [1..1] entry
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProcedureIndicationsSection2: 2.16.840.1.113883.10.20.22.2.29 -->

<pattern id="p-OperativeNoteV3_2_ProcedureIndicationsSection2_title_3_99_3-error_mdht" see="#p-OperativeNoteV3_2_ProcedureIndicationsSection2_title_3_99_3-error_mdht" name="p-OperativeNoteV3_2_ProcedureIndicationsSection2_title_3_99_3-error_mdht">
		<!--
			UML path: /ProcedureIndicationsSection2
			UML root path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2/procedureIndicationsSection2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: ProcedureIndicationsSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.99.3 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8060, R2.0=CONF:1098-8060)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2Entry -->

<pattern id="p-OperativeNoteV3_3A_Indication2Entry_indication2_3_99_4_i-error_mdht" see="#p-OperativeNoteV3_3A_Indication2Entry_indication2_3_99_4_i-error_mdht" name="p-OperativeNoteV3_3A_Indication2Entry_indication2_3_99_4_i-error_mdht">
		<!--
			UML path: /ProcedureIndicationsSection2/entry
			UML root path: /OperativeNote2/component/structuredBody/procedureIndicationsSection2/procedureIndicationsSection2/entry
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']/cda:entry">
		<!--
			OCL: self.observation->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2))->size() >= 0
			Constraint name: ProcedureIndicationsSection2Indication2EntryIndication2
		-->
	<assert test="count(cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']) &gt;= 0">Error: Operative Note (V3) - 3.99.4.i indication2
		Conformance: MAY contain zero or more [0..*] observation (CONF:1098-8743, CONF:1098-15508)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_statusCode_4_62_6-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_statusCode_4_62_6-error_mdht" name="p-OperativeNoteV3_3A_Indication2_statusCode_4_62_6-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: true
			Constraint name: IndicationStatusCodeP
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.62.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode/@code=&quot;completed&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:7487, R2.0=CONF:1098-7487, R2.0=CONF:1098-19105)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: IndicationStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Operative Note (V3) - 4.62.6 statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode/@code=&quot;completed&quot;  (CodeSystem: 2.16.840.1.113883.5.14 ActStatus) (CONF:7487, R2.0=CONF:1098-7487, R2.0=CONF:1098-19105)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_classCode_4_62_2-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_classCode_4_62_2-error_mdht" name="p-OperativeNoteV3_3A_Indication2_classCode_4_62_2-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: self.classCode=vocab::ActClassObservation::OBS
			Constraint name: IndicationClassCode
		-->
	<assert test="@classCode = 'OBS'">Error: Operative Note (V3) - 4.62.2 classCode
		Conformance: SHALL contain exactly one [1..1] @classCode=&quot;OBS&quot; Observation (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:7480, R2.0=CONF:1098-7480)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_value_4_62_5-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_value_4_62_5-error_mdht" name="p-OperativeNoteV3_3A_Indication2_value_4_62_5-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: ((not self.value->isEmpty()) and self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
			Constraint name: IndicationValueP
		-->
	<assert test="not(cda:value and cda:value[not(@nullFlavor)]) or cda:value">Error: Operative Note (V3) - 4.62.5 value
		Conformance: MAY contain zero or one [0..1] value with @xsi:type=&quot;CD&quot; (CONF:1098-7488), which SHOULD be selected from ValueSet Problem 2.16.840.1.113883.3.88.12.3221.7.4 DYNAMIC (CONF:1098-7489)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.value->isEmpty()) and self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
			Constraint name: IndicationValue
		-->
	<assert test="not(cda:value and cda:value[not(@nullFlavor)]) or not(cda:value[not(. and @xsi:type='CD' and @codeSystem = '2.16.840.1.113883.6.96' and @code)])">Error: Operative Note (V3) - 4.62.5 value
		Conformance: MAY contain zero or one [0..1] value with @xsi:type=&quot;CD&quot; (CONF:1098-7488), which SHOULD be selected from ValueSet Problem 2.16.840.1.113883.3.88.12.3221.7.4 DYNAMIC (CONF:1098-7489)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_id_4_62_3-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_id_4_62_3-error_mdht" name="p-OperativeNoteV3_3A_Indication2_id_4_62_3-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: IndicationId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 4.62.3 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1098-7483)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_code_4_62_4-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_code_4_62_4-error_mdht" name="p-OperativeNoteV3_3A_Indication2_code_4_62_4-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: IndicationCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 4.62.4 code
		Conformance: SHALL contain exactly one [1..1] code, which MAY be selected from ValueSet Problem Type (LOINC) 2.16.840.1.113883.3.88.12.3221.7.2 STATIC 2014-09-02 (CONF:1098-31229)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()
			Constraint name: IndicationCode
		-->
	<assert test="cda:code and cda:code[@codeSystem or @codeSystemName]">Error: Operative Note (V3) - 4.62.4 code
		Conformance: SHALL contain exactly one [1..1] code, which MAY be selected from ValueSet Problem Type (LOINC) 2.16.840.1.113883.3.88.12.3221.7.2 STATIC 2014-09-02 (CONF:1098-31229)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_Indication_4_61-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_Indication_4_61-error_mdht" name="p-OperativeNoteV3_3A_Indication2_Indication_4_61-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: true
			Constraint name: IndicationProblemIndication
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.61 Indication
		Conformance: MAY contain zero or more [0..*] observation (CONF:8722, CONF:8723, CONF:14899)
		Analysis: This constraint is being overridden as it has been removed in v2 and should never fire
		Validation message: n/a	</assert>
		<!--
			OCL: true
			Constraint name: IndicationCodeNullFlavor
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.61 Indication
		Conformance: MAY contain zero or more [0..*] observation (CONF:8722, CONF:8723, CONF:14899)
		Analysis: This constraint is being overridden as it has been removed in v2 and should never fire
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_moodCode_4_62_3-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_moodCode_4_62_3-error_mdht" name="p-OperativeNoteV3_3A_Indication2_moodCode_4_62_3-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
			Constraint name: IndicationMoodCode
		-->
	<assert test="@moodCode = 'EVN'">Error: Operative Note (V3) - 4.62.3 moodCode
		Conformance: SHALL contain exactly one [1..1] @moodCode=&quot;EVN&quot; Event (CodeSystem: 2.16.840.1.113883.5.1001 HL7ActMood) (CONF:7481, R2.0=CONF:1098-7481)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_effectiveTime_4_62_7-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_effectiveTime_4_62_7-error_mdht" name="p-OperativeNoteV3_3A_Indication2_effectiveTime_4_62_7-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: ((not self.effectiveTime.oclIsUndefined()) and self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
			Constraint name: IndicationEffectiveTime
		-->
	<assert test="not(cda:effectiveTime and not(cda:effectiveTime/@nullFlavor)) or cda:effectiveTime">Error: Operative Note (V3) - 4.62.7 effectiveTime
		Conformance: SHOULD contain zero or one [0..1] effectiveTime (CONF:7488, R2.0=CONF:1098-7488)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_IndicationCodeNullFlavor_4_61_9-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_IndicationCodeNullFlavor_4_61_9-error_mdht" name="p-OperativeNoteV3_3A_Indication2_IndicationCodeNullFlavor_4_61_9-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: true
			Constraint name: IndicationCodeNullFlavorValue
		-->
	<assert test="true()">Error: Operative Note (V3) - 4.61.9 IndicationCodeNullFlavor
		Conformance: The value element MAY contain @nullFlavor (CONF:15990)
		Analysis: This constraint is being overridden as it has been removed in v2 and should never fire
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Indication2: 2.16.840.1.113883.10.20.22.4.19 -->

<pattern id="p-OperativeNoteV3_3A_Indication2_templateId_4_62_1-error_mdht" see="#p-OperativeNoteV3_3A_Indication2_templateId_4_62_1-error_mdht" name="p-OperativeNoteV3_3A_Indication2_templateId_4_62_1-error_mdht">
		<!--
			UML path: /Indication2
			UML root path: /ReferralNote/component/structuredBody/immunizationsSection2/immunizationsSection2/entry/immunizationActivity2/entryRelationship/indication2
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.19' and id.extension = '2014-06-09')
			Constraint name: IndicationTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19' and @extension = '2014-06-09'">Error: Operative Note (V3) - 4.62.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1098-7482, CONF:1098-10502, CONF:1098-32570 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.4.19&quot; SHALL contain exactly one [1..1] @extension=&quot;2014-06-09&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-OperativeNoteV3_2_Component_surgicalDrainsSection_2_14_6_i_p_1-error_mdht" see="#p-OperativeNoteV3_2_Component_surgicalDrainsSection_2_14_6_i_p_1-error_mdht" name="p-OperativeNoteV3_2_Component_surgicalDrainsSection_2_14_6_i_p_1-error_mdht">
		<!--
			UML path: /OperativeNote2/component/structuredBody/surgicalDrainsSection
			UML root path: /OperativeNote2/component/structuredBody/surgicalDrainsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">
		<!--
			OCL: self.section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgicalDrainsSection))->size() <= 1
			Constraint name: OperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection
		-->
	<assert test="count(cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.p.1 surgicalDrainsSection
		Conformance: MAY contain zero or one [0..1] section (CONF:1198-30516, CONF:1198-30517)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SurgicalDrainsSection: 2.16.840.1.113883.10.20.7.13 -->

<pattern id="p-OperativeNoteV3_2_SurgicalDrainsSection_templateId_3_116_1-error_mdht" see="#p-OperativeNoteV3_2_SurgicalDrainsSection_templateId_3_116_1-error_mdht" name="p-OperativeNoteV3_2_SurgicalDrainsSection_templateId_3_116_1-error_mdht">
		<!--
			UML path: /SurgicalDrainsSection
			UML root path: /OperativeNote/component/structuredBody/surgicalDrainsSection/surgicalDrainsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.13')
			Constraint name: SurgicalDrainsSectionTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.7.13'">Error: Operative Note (V3) - 3.116.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:8038, CONF:10473 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.7.13&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SurgicalDrainsSection: 2.16.840.1.113883.10.20.7.13 -->

<pattern id="p-OperativeNoteV3_2_SurgicalDrainsSection_code_3_116_2-error_mdht" see="#p-OperativeNoteV3_2_SurgicalDrainsSection_code_3_116_2-error_mdht" name="p-OperativeNoteV3_2_SurgicalDrainsSection_code_3_116_2-error_mdht">
		<!--
			UML path: /SurgicalDrainsSection
			UML root path: /OperativeNote/component/structuredBody/surgicalDrainsSection/surgicalDrainsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">
		<!--
			OCL: not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.code = '11537-8' and value.codeSystem = '2.16.840.1.113883.6.1'
			Constraint name: SurgicalDrainsSectionCode
		-->
	<assert test="cda:code and cda:code[@code = '11537-8' and @codeSystem = '2.16.840.1.113883.6.1']">Error: Operative Note (V3) - 3.116.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15441)/@code=&quot;11537-8&quot; Surgical Drains (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15442)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: SurgicalDrainsSectionCodeP
		-->
	<assert test="cda:code">Error: Operative Note (V3) - 3.116.2 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:15441)/@code=&quot;11537-8&quot; Surgical Drains (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (CONF:15442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SurgicalDrainsSection: 2.16.840.1.113883.10.20.7.13 -->

<pattern id="p-OperativeNoteV3_2_SurgicalDrainsSection_text_3_116_3-error_mdht" see="#p-OperativeNoteV3_2_SurgicalDrainsSection_text_3_116_3-error_mdht" name="p-OperativeNoteV3_2_SurgicalDrainsSection_text_3_116_3-error_mdht">
		<!--
			UML path: /SurgicalDrainsSection
			UML root path: /OperativeNote/component/structuredBody/surgicalDrainsSection/surgicalDrainsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: SurgicalDrainsSectionText
		-->
	<assert test="cda:text">Error: Operative Note (V3) - 3.116.3 text
		Conformance: SHALL contain exactly one [1..1] text (CONF:8041)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- SurgicalDrainsSection: 2.16.840.1.113883.10.20.7.13 -->

<pattern id="p-OperativeNoteV3_2_SurgicalDrainsSection_title_3_116_4-error_mdht" see="#p-OperativeNoteV3_2_SurgicalDrainsSection_title_3_116_4-error_mdht" name="p-OperativeNoteV3_2_SurgicalDrainsSection_title_3_116_4-error_mdht">
		<!--
			UML path: /SurgicalDrainsSection
			UML root path: /OperativeNote/component/structuredBody/surgicalDrainsSection/surgicalDrainsSection
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: SurgicalDrainsSectionTitle
		-->
	<assert test="cda:title">Error: Operative Note (V3) - 3.116.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:8040)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-OperativeNoteV3_1A_RecordTarget_patientRole_2_14_5_i-error_mdht" see="#p-OperativeNoteV3_1A_RecordTarget_patientRole_2_14_5_i-error_mdht" name="p-OperativeNoteV3_1A_RecordTarget_patientRole_2_14_5_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget
			UML root path: /USRealmHeader2/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: Operative Note (V3) - 2.14.5.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:1198-5267)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-OperativeNoteV3_1A_PatientRole_patient_2_14_5_i_e-error_mdht" see="#p-OperativeNoteV3_1A_PatientRole_patient_2_14_5_i_e-error_mdht" name="p-OperativeNoteV3_1A_PatientRole_patient_2_14_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: Operative Note (V3) - 2.14.5.i.e patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:1198-5283)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-OperativeNoteV3_1A_PatientRole_telecom_2_14_5_i_c-error_mdht" see="#p-OperativeNoteV3_1A_PatientRole_telecom_2_14_5_i_c-error_mdht" name="p-OperativeNoteV3_1A_PatientRole_telecom_2_14_5_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 2.14.5.i.c telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5280, R2.1=CONF:1198-5280)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-OperativeNoteV3_1A_PatientRole_providerOrganization_2_14_5_i_e-error_mdht" see="#p-OperativeNoteV3_1A_PatientRole_providerOrganization_2_14_5_i_e-error_mdht" name="p-OperativeNoteV3_1A_PatientRole_providerOrganization_2_14_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::ProviderOrganization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization
		-->
	<assert test="count(cda:providerOrganization) &lt;= 1">Error: Operative Note (V3) - 2.14.5.i.e providerOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-OperativeNoteV3_1A_PatientRole_id_2_14_5_i_a-error_mdht" see="#p-OperativeNoteV3_1A_PatientRole_id_2_14_5_i_a-error_mdht" name="p-OperativeNoteV3_1A_PatientRole_id_2_14_5_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.5.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5268, R2.1=CONF:1198-5268)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-OperativeNoteV3_1A_PatientRole_addr_2_14_5_i_b-error_mdht" see="#p-OperativeNoteV3_1A_PatientRole_addr_2_14_5_i_b-error_mdht" name="p-OperativeNoteV3_1A_PatientRole_addr_2_14_5_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole
			UML root path: /USRealmHeader2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.5.i.b addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5271, R2.1=CONF:1198-5271)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_maritalStatusCode_2_14_5_i_e_4-error_mdht" see="#p-OperativeNoteV3_1A_Patient_maritalStatusCode_2_14_5_i_e_4-error_mdht" name="p-OperativeNoteV3_1A_Patient_maritalStatusCode_2_14_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode">Error: Operative Note (V3) - 2.14.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.maritalStatusCode.oclIsUndefined()) and self.maritalStatusCode.isNullFlavorUndefined()) implies (not self.maritalStatusCode.oclIsUndefined() and self.maritalStatusCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode
		-->
	<assert test="not(cda:maritalStatusCode and not(cda:maritalStatusCode/@nullFlavor)) or cda:maritalStatusCode and cda:maritalStatusCode[@codeSystem = '2.16.840.1.113883.5.2' and (@code = 'A' or @code = 'D' or @code = 'I' or @code = 'L' or @code = 'M' or @code = 'P' or @code = 'S' or @code = 'T' or @code = 'W')]">Error: Operative Note (V3) - 2.14.5.i.e.4 maritalStatusCode
		Conformance: SHOULD contain zero or one [0..1] maritalStatusCode, which SHALL be selected from ValueSet HL7 Marital Status 2.16.840.1.113883.1.11.12212 DYNAMIC (CONF:5303, R2.1=CONF:1198-5303)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_birthTime_2_14_5_i_e_8-error_mdht" see="#p-OperativeNoteV3_1A_Patient_birthTime_2_14_5_i_e_8-error_mdht" name="p-OperativeNoteV3_1A_Patient_birthTime_2_14_5_i_e_8-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.birthTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime
		-->
	<assert test="cda:birthTime">Error: Operative Note (V3) - 2.14.5.i.e.8 birthTime
		Conformance: SHALL contain exactly one [1..1] birthTime (CONF:1198-5298)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_name_2_14_5_i_e_1-error_mdht" see="#p-OperativeNoteV3_1A_Patient_name_2_14_5_i_e_1-error_mdht" name="p-OperativeNoteV3_1A_Patient_name_2_14_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.5.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5284, CONF:10411, R2.1=CONF:1198-5284)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_languageCommunication_2_14_5_i_e_10-error_mdht" see="#p-OperativeNoteV3_1A_Patient_languageCommunication_2_14_5_i_e_10-error_mdht" name="p-OperativeNoteV3_1A_Patient_languageCommunication_2_14_5_i_e_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: Operative Note (V3) - 2.14.5.i.e.10 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:1198-5406)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_raceCode_2_14_5_i_e_6-error_mdht" see="#p-OperativeNoteV3_1A_Patient_raceCode_2_14_5_i_e_6-error_mdht" name="p-OperativeNoteV3_1A_Patient_raceCode_2_14_5_i_e_6-error_mdht">
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
	<assert test="cda:raceCode and cda:raceCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '1002-5' or @code = '2028-9' or @code = '2054-5' or @code = '2076-8' or @code = '2106-3')]">Error: Operative Note (V3) - 2.14.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.raceCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP
		-->
	<assert test="cda:raceCode">Error: Operative Note (V3) - 2.14.5.i.e.6 raceCode
		Conformance: SHALL contain exactly one [1..1] raceCode, which SHALL be selected from ValueSet Race Category Excluding Nulls 2.16.840.1.113883.3.2074.1.1.3 DYNAMIC (CONF:1198-5322)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_guardian_2_14_5_i_e_9-error_mdht" see="#p-OperativeNoteV3_1A_Patient_guardian_2_14_5_i_e_9-error_mdht" name="p-OperativeNoteV3_1A_Patient_guardian_2_14_5_i_e_9-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: Operative Note (V3) - 2.14.5.i.e.9 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:1198-5325)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_ethnicGroupCode_2_14_5_i_e_7-error_mdht" see="#p-OperativeNoteV3_1A_Patient_ethnicGroupCode_2_14_5_i_e_7-error_mdht" name="p-OperativeNoteV3_1A_Patient_ethnicGroupCode_2_14_5_i_e_7-error_mdht">
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
	<assert test="cda:ethnicGroupCode and cda:ethnicGroupCode[@codeSystem = '2.16.840.1.113883.6.238' and (@code = '2135-2' or @code = '2186-5')]">Error: Operative Note (V3) - 2.14.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.ethnicGroupCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP
		-->
	<assert test="cda:ethnicGroupCode">Error: Operative Note (V3) - 2.14.5.i.e.7 ethnicGroupCode
		Conformance: SHALL contain exactly one [1..1] ethnicGroupCode, which SHALL be selected from ValueSet EthnicityGroup 2.16.840.1.114222.4.11.837 DYNAMIC (CONF:1198-5323)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_religiousAffiliationCode_2_14_5_i_e_5-error_mdht" see="#p-OperativeNoteV3_1A_Patient_religiousAffiliationCode_2_14_5_i_e_5-error_mdht" name="p-OperativeNoteV3_1A_Patient_religiousAffiliationCode_2_14_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode">Error: Operative Note (V3) - 2.14.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.religiousAffiliationCode.oclIsUndefined()) and self.religiousAffiliationCode.isNullFlavorUndefined()) implies (not self.religiousAffiliationCode.oclIsUndefined() and self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode
		-->
	<assert test="not(cda:religiousAffiliationCode and not(cda:religiousAffiliationCode/@nullFlavor)) or cda:religiousAffiliationCode and cda:religiousAffiliationCode[@codeSystem = '2.16.840.1.113883.5.1076' and @code]">Error: Operative Note (V3) - 2.14.5.i.e.5 religiousAffiliationCode
		Conformance: MAY contain zero or one [0..1] religiousAffiliationCode, which SHALL be selected from ValueSet HL7 Religious Affiliation 2.16.840.1.113883.1.11.19185 DYNAMIC (CONF:5317, R2.1=CONF:1198-5317)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_administrativeGenderCode_2_14_5_i_e_2-error_mdht" see="#p-OperativeNoteV3_1A_Patient_administrativeGenderCode_2_14_5_i_e_2-error_mdht" name="p-OperativeNoteV3_1A_Patient_administrativeGenderCode_2_14_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP
		-->
	<assert test="true()">Error: Operative Note (V3) - 2.14.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.administrativeGenderCode.oclIsUndefined() and self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode
		-->
	<assert test="cda:administrativeGenderCode and cda:administrativeGenderCode[@codeSystem = '2.16.840.1.113883.5.1' and (@code = 'F' or @code = 'M' or @code = 'UN')]">Error: Operative Note (V3) - 2.14.5.i.e.2 administrativeGenderCode
		Conformance: SHALL contain exactly one [1..1] administrativeGenderCode, which SHALL be selected from ValueSet Administrative Gender (HL7 V3) 2.16.840.1.113883.1.11.1 DYNAMIC (CONF:6394, R2.1=CONF:1198-6394)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_sDTCRaceCode_2_14_5_i_e_7-error_mdht" see="#p-OperativeNoteV3_1A_Patient_sDTCRaceCode_2_14_5_i_e_7-error_mdht" name="p-OperativeNoteV3_1A_Patient_sDTCRaceCode_2_14_5_i_e_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCRaceCode->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or ext:sDTCRaceCode">Error: Operative Note (V3) - 2.14.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.sDTCRaceCode->isEmpty()) and self.sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode
		-->
	<assert test="not(ext:sDTCRaceCode and ext:sDTCRaceCode[not(@nullFlavor)]) or not(ext:sDTCRaceCode[not(. and @codeSystem = '2.16.840.1.113883.6.238' and @code)])">Error: Operative Note (V3) - 2.14.5.i.e.7 sDTCRaceCode
		Conformance: MAY contain zero or more [0..*] sDTCRaceCode, which SHALL be selected from ValueSet Race 2.16.840.1.113883.1.11.14914 DYNAMIC (CONF:7263, R2.1=CONF:1198-7263)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-OperativeNoteV3_1A_Patient_birthplace_2_14_5_i_e_11-error_mdht" see="#p-OperativeNoteV3_1A_Patient_birthplace_2_14_5_i_e_11-error_mdht" name="p-OperativeNoteV3_1A_Patient_birthplace_2_14_5_i_e_11-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.birthplace->select(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace))->size() <= 1
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace
		-->
	<assert test="count(cda:birthplace) &lt;= 1">Error: Operative Note (V3) - 2.14.5.i.e.11 birthplace
		Conformance: MAY contain zero or one [0..1] birthplace (CONF:1198-5395)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-OperativeNoteV3_1A_Guardian_code_2_14_5_i_e_9_ii-error_mdht" see="#p-OperativeNoteV3_1A_Guardian_code_2_14_5_i_e_9_ii-error_mdht" name="p-OperativeNoteV3_1A_Guardian_code_2_14_5_i_e_9_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Operative Note (V3) - 2.14.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: Operative Note (V3) - 2.14.5.i.e.9.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-5326)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-OperativeNoteV3_1A_Guardian_addr_2_14_5_i_e_9_i-error_mdht" see="#p-OperativeNoteV3_1A_Guardian_addr_2_14_5_i_e_9_i-error_mdht" name="p-OperativeNoteV3_1A_Guardian_addr_2_14_5_i_e_9_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)]) or cda:addr">Error: Operative Note (V3) - 2.14.5.i.e.9.i addr
		Conformance: SHOULD contain zero or more [0..*] addr (CONF:5359, CONF:10413, R2.1=CONF:1198-5359)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-OperativeNoteV3_1A_Guardian_telecom_2_14_5_i_e_9_iii-error_mdht" see="#p-OperativeNoteV3_1A_Guardian_telecom_2_14_5_i_e_9_iii-error_mdht" name="p-OperativeNoteV3_1A_Guardian_telecom_2_14_5_i_e_9_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.telecom->isEmpty()) and self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom
		-->
	<assert test="not(cda:telecom and cda:telecom[not(@nullFlavor)]) or cda:telecom">Error: Operative Note (V3) - 2.14.5.i.e.9.iii telecom
		Conformance: SHOULD contain zero or more [0..*] telecom (CONF:1198-5382)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-OperativeNoteV3_1A_Guardian_guardianPerson_2_14_5_i_e_9_iv-error_mdht" see="#p-OperativeNoteV3_1A_Guardian_guardianPerson_2_14_5_i_e_9_iv-error_mdht" name="p-OperativeNoteV3_1A_Guardian_guardianPerson_2_14_5_i_e_9_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: self.guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(consol::GeneralHeaderConstraints::RecordTarget::PatientRole::Patient::Guardian::Person))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson
		-->
	<assert test="count(cda:guardianPerson)=1">Error: Operative Note (V3) - 2.14.5.i.e.9.iv guardianPerson
		Conformance: SHALL contain exactly one [1..1] guardianPerson (CONF:5385, R2.1=CONF:1198-5385)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht">
		<!--
			UML path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
			UML root path: /GeneralHeaderConstraints/recordTarget/patientRole/patient/guardian/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.6.12.i.d.9.iii.a use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7993, R2.1=CONF:1198-7993)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-OperativeNoteV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-OperativeNoteV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-OperativeNoteV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: Operative Note (V3) - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-OperativeNoteV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-OperativeNoteV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-OperativeNoteV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: Operative Note (V3) - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-OperativeNoteV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_14_5_i_b_7-error_mdht" see="#p-OperativeNoteV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_14_5_i_b_7-error_mdht" name="p-OperativeNoteV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_14_5_i_b_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		-->
	<assert test="@nullFlavor or count(cda:streetAddressLine) &gt;= 1 and count(cda:streetAddressLine) &lt;= 4">Error: Operative Note (V3) - 2.14.5.i.b.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		Conformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: SHALL contain at least one and not more than 4 streetAddressLine
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-OperativeNoteV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-OperativeNoteV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-OperativeNoteV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: Operative Note (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-OperativeNoteV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-OperativeNoteV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-OperativeNoteV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: Operative Note (V3) - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-OperativeNoteV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-OperativeNoteV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-OperativeNoteV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: Operative Note (V3) - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-OperativeNoteV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-OperativeNoteV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-OperativeNoteV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: Operative Note (V3) - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-OperativeNoteV3_1A_Person_name_2_14_5_i_e_9_iv_a-error_mdht" see="#p-OperativeNoteV3_1A_Person_name_2_14_5_i_e_9_iv_a-error_mdht" name="p-OperativeNoteV3_1A_Person_name_2_14_5_i_e_9_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/guardian/guardianPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian/cda:guardianPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.5.i.e.9.iv.a name
		Conformance: SHALL contain at least one [1..*] name (CONF:5386, R2.1=CONF:1198-5386)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-OperativeNoteV3_1A_LanguageCommunication_languageCode_2_14_5_i_e_10_iii-error_mdht" see="#p-OperativeNoteV3_1A_LanguageCommunication_languageCode_2_14_5_i_e_10_iii-error_mdht" name="p-OperativeNoteV3_1A_LanguageCommunication_languageCode_2_14_5_i_e_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: Operative Note (V3) - 2.14.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: Operative Note (V3) - 2.14.5.i.e.10.iii languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:1198-5407)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-OperativeNoteV3_1A_LanguageCommunication_preferenceInd_2_14_5_i_e_10_iv-error_mdht" see="#p-OperativeNoteV3_1A_LanguageCommunication_preferenceInd_2_14_5_i_e_10_iv-error_mdht" name="p-OperativeNoteV3_1A_LanguageCommunication_preferenceInd_2_14_5_i_e_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: Operative Note (V3) - 2.14.5.i.e.10.iv preferenceInd
		Conformance: SHOULD contain zero or one [0..1] preferenceInd (CONF:1198-5414)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-OperativeNoteV3_1A_LanguageCommunication_modeCode_2_14_5_i_e_10_i-error_mdht" see="#p-OperativeNoteV3_1A_LanguageCommunication_modeCode_2_14_5_i_e_10_i-error_mdht" name="p-OperativeNoteV3_1A_LanguageCommunication_modeCode_2_14_5_i_e_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode">Error: Operative Note (V3) - 2.14.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.modeCode.oclIsUndefined()) and self.modeCode.isNullFlavorUndefined()) implies (not self.modeCode.oclIsUndefined() and self.modeCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode
		-->
	<assert test="not(cda:modeCode and not(cda:modeCode/@nullFlavor)) or cda:modeCode and cda:modeCode[@codeSystem = '2.16.840.1.113883.5.60' and (@code = 'ESGN' or @code = 'ESP' or @code = 'EWR' or @code = 'RSGN' or @code = 'RSP' or @code = 'RWR')]">Error: Operative Note (V3) - 2.14.5.i.e.10.i modeCode
		Conformance: MAY contain zero or one [0..1] modeCode, which SHALL be selected from ValueSet HL7 LanguageAbilityMode 2.16.840.1.113883.1.11.12249 STATIC 1 (CONF:5409, R2.1=CONF:1198-5409)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-OperativeNoteV3_1A_LanguageCommunication_proficiencyLevelCode_2_14_5_i_e_10_ii-error_mdht" see="#p-OperativeNoteV3_1A_LanguageCommunication_proficiencyLevelCode_2_14_5_i_e_10_ii-error_mdht" name="p-OperativeNoteV3_1A_LanguageCommunication_proficiencyLevelCode_2_14_5_i_e_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode">Error: Operative Note (V3) - 2.14.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.proficiencyLevelCode.oclIsUndefined()) and self.proficiencyLevelCode.isNullFlavorUndefined()) implies (not self.proficiencyLevelCode.oclIsUndefined() and self.proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.proficiencyLevelCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode
		-->
	<assert test="not(cda:proficiencyLevelCode and not(cda:proficiencyLevelCode/@nullFlavor)) or cda:proficiencyLevelCode and cda:proficiencyLevelCode[@codeSystem = '2.16.840.1.113883.5.61' and (@code = 'E' or @code = 'F' or @code = 'G' or @code = 'P')]">Error: Operative Note (V3) - 2.14.5.i.e.10.ii proficiencyLevelCode
		Conformance: SHOULD contain zero or one [0..1] proficiencyLevelCode, which SHALL be selected from ValueSet LanguageAbilityProficiency 2.16.840.1.113883.1.11.12199 DYNAMIC (CONF:9965, R2.1=CONF:1198-9965)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TS -->

<pattern id="p-OperativeNoteV3_1A_TS_value_2_14_5_i_e_8_i-error_mdht" see="#p-OperativeNoteV3_1A_TS_value_2_14_5_i_e_8_i-error_mdht" name="p-OperativeNoteV3_1A_TS_value_2_14_5_i_e_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthTime
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthTime">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (true ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue
		-->
	<assert test="@nullFlavor or true()">Error: Operative Note (V3) - 2.14.5.i.e.8.i value
		Conformance: contain exactly one [1..1] value
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Birthplace -->

<pattern id="p-OperativeNoteV3_1A_Birthplace_place_2_14_5_i_e_11_i-error_mdht" see="#p-OperativeNoteV3_1A_Birthplace_place_2_14_5_i_e_11_i-error_mdht" name="p-OperativeNoteV3_1A_Birthplace_place_2_14_5_i_e_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace">
		<!--
			OCL: self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(consol::USRealmHeader2::RecordTarget::PatientRole::Patient::Birthplace::Place))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace
		-->
	<assert test="count(cda:place)=1">Error: Operative Note (V3) - 2.14.5.i.e.11.i place
		Conformance: SHALL contain exactly one [1..1] place (CONF:1198-5396)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Place -->

<pattern id="p-OperativeNoteV3_1A_Place_addr_2_14_5_i_e_11_i_a-error_mdht" see="#p-OperativeNoteV3_1A_Place_addr_2_14_5_i_e_11_i_a-error_mdht" name="p-OperativeNoteV3_1A_Place_addr_2_14_5_i_e_11_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/birthplace/place
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:birthplace/cda:place">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.5.i.e.11.i.a addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5397, R2.1=CONF:1198-5397)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-OperativeNoteV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" see="#p-OperativeNoteV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht" name="p-OperativeNoteV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.given->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameGiven
		-->
	<assert test="@nullFlavor or cda:given">Error: Operative Note (V3) - 2.19.5.ii.b.1.iii given
		Conformance: SHALL contain at least one [1..*] given (CONF:7157, R2.1=CONF:81-7157)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-OperativeNoteV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" see="#p-OperativeNoteV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht" name="p-OperativeNoteV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL: getText(true)=''
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent
		-->
	<assert test="string(@id=true()// text()) = ''">Error: Operative Note (V3) - 2.10 USRealmHeader
		Conformance: 
		Analysis: US Realm Patient Name SHALL NOT have mixed content except for white space
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-OperativeNoteV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" see="#p-OperativeNoteV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht" name="p-OperativeNoteV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.family->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameFamily
		-->
	<assert test="@nullFlavor or count(cda:family) = 1">Error: Operative Note (V3) - 2.19.5.ii.b.1.ii family
		Conformance: SHALL contain exactly one [1..1] family (CONF:7159, R2.1=CONF:81-7159)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-OperativeNoteV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" see="#p-OperativeNoteV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht" name="p-OperativeNoteV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.prefix->isEmpty()) and self.prefix->exists(element | element.isNullFlavorUndefined())) implies (not self.prefix->isEmpty()) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNamePrefix
		-->
	<assert test="@nullFlavor or not(cda:prefix and cda:prefix[not(@nullFlavor)]) or cda:prefix">Error: Operative Note (V3) - 2.19.5.ii.b.1.iv prefix
		Conformance: MAY contain zero or more [0..*] prefix (CONF:7155, R2.1=CONF:81-7155)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-OperativeNoteV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" see="#p-OperativeNoteV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht" name="p-OperativeNoteV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/patient/name
			UML root path: /USRealmHeader2/recordTarget/patientRole/patient/name
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:name">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.suffix->isEmpty()) and self.suffix->exists(element | element.isNullFlavorUndefined())) implies (self.suffix->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameSuffix
		-->
	<assert test="@nullFlavor or not(cda:suffix and cda:suffix[not(@nullFlavor)]) or count(cda:suffix) &lt;= 1">Error: Operative Note (V3) - 2.19.5.ii.b.1.v suffix
		Conformance: MAY contain zero or one [0..1] suffix (CONF:7161, R2.1=CONF:81-7161)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmPatientName -->

<pattern id="p-OperativeNoteV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" see="#p-OperativeNoteV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht" name="p-OperativeNoteV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'A' or . = 'ABC' or . = 'ASGN' or . = 'C' or . = 'I' or . = 'IDE' or . = 'L' or . = 'P' or . = 'PHON' or . = 'R' or . = 'SNDX' or . = 'SRCH' or . = 'SYL')])">Error: Operative Note (V3) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmPatientNameUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.19.5.ii.b.1.i use
		Conformance: MAY contain zero or one [0..1] @use, which SHALL be selected from ValueSet EntityNameUse 2.16.840.1.113883.1.11.15913 STATIC (CONF:7154, R2.1=CONF:81-7154)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-OperativeNoteV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_14_5_i_e_5-error_mdht" see="#p-OperativeNoteV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_14_5_i_e_5-error_mdht" name="p-OperativeNoteV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_14_5_i_e_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Operative Note (V3) - 2.14.5.i.e.5 GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier
		Conformance: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier (CONF:9996, R2.1=CONF:1198-16820)
		Analysis: The id SHOULD include zero or one [0..1] id where id/@root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-OperativeNoteV3_1A_ProviderOrganization_addr_2_14_5_i_e_4-error_mdht" see="#p-OperativeNoteV3_1A_ProviderOrganization_addr_2_14_5_i_e_4-error_mdht" name="p-OperativeNoteV3_1A_ProviderOrganization_addr_2_14_5_i_e_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.5.i.e.4 addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5422, R2.1=CONF:1198-5422)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-OperativeNoteV3_1A_ProviderOrganization_telecom_2_14_5_i_e_3-error_mdht" see="#p-OperativeNoteV3_1A_ProviderOrganization_telecom_2_14_5_i_e_3-error_mdht" name="p-OperativeNoteV3_1A_ProviderOrganization_telecom_2_14_5_i_e_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 2.14.5.i.e.3 telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5420, R2.1=CONF:1198-5420)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-OperativeNoteV3_1A_ProviderOrganization_name_2_14_5_i_e_2-error_mdht" see="#p-OperativeNoteV3_1A_ProviderOrganization_name_2_14_5_i_e_2-error_mdht" name="p-OperativeNoteV3_1A_ProviderOrganization_name_2_14_5_i_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.5.i.e.2 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5419, R2.1=CONF:1198-5419)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ProviderOrganization -->

<pattern id="p-OperativeNoteV3_1A_ProviderOrganization_id_2_14_5_i_e_1-error_mdht" see="#p-OperativeNoteV3_1A_ProviderOrganization_id_2_14_5_i_e_1-error_mdht" name="p-OperativeNoteV3_1A_ProviderOrganization_id_2_14_5_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.5.i.e.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5417, R2.1=CONF:1198-5417)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_14_5_i_e_3_i-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_14_5_i_e_3_i-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_14_5_i_e_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/providerOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:providerOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.14.5.i.e.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7994, CONF:1198-7994)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_14_5_i_c_1-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_14_5_i_c_1-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_14_5_i_c_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/telecom
			UML root path: /USRealmHeader2/recordTarget/patientRole/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsRecordTargetPatientRoleTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.14.5.i.c.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:5375, R2.1=CONF:1198-5375)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-OperativeNoteV3_1A_DataEnterer_assignedEntity_2_14_6_i-error_mdht" see="#p-OperativeNoteV3_1A_DataEnterer_assignedEntity_2_14_6_i-error_mdht" name="p-OperativeNoteV3_1A_DataEnterer_assignedEntity_2_14_6_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer
			UML root path: /USRealmHeader2/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeader2::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Operative Note (V3) - 2.14.6.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_6_i_e-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_6_i_e-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_6_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Operative Note (V3) - 2.14.6.i.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469, R2.1=CONF:1198-5469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_6_i_a-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_id_2_14_6_i_a-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_6_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.6.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5443, R2.1=CONF:1198-5443)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_6_i_c-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_6_i_c-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_6_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.6.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5460, R2.1=CONF:1198-5460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_6_i_d-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_code_2_14_6_i_d-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Operative Note (V3) - 2.14.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Operative Note (V3) - 2.14.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_6_i_d-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_6_i_d-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 2.14.6.i.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5466, R2.1=CONF:1198-5466)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_14_6_i_d_1-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_14_6_i_d_1-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_14_6_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.14.6.i.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7996, R2.1=CONF:1198-7996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-OperativeNoteV3_1A_Person_name_2_14_6_i_e_1-error_mdht" see="#p-OperativeNoteV3_1A_Person_name_2_14_6_i_e_1-error_mdht" name="p-OperativeNoteV3_1A_Person_name_2_14_6_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.6.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5470)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-OperativeNoteV3_1A_Author_assignedAuthor_2_14_7_ii-error_mdht" see="#p-OperativeNoteV3_1A_Author_assignedAuthor_2_14_7_ii-error_mdht" name="p-OperativeNoteV3_1A_Author_assignedAuthor_2_14_7_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::USRealmHeader2::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: Operative Note (V3) - 2.14.7.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1198-5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-OperativeNoteV3_1A_Author_time_2_14_7_i-error_mdht" see="#p-OperativeNoteV3_1A_Author_time_2_14_7_i-error_mdht" name="p-OperativeNoteV3_1A_Author_time_2_14_7_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorTime
		-->
	<assert test="cda:time">Error: Operative Note (V3) - 2.14.7.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5445, R2.1=CONF:1198-5445)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_1A_AssignedAuthor_code_2_14_7_ii_d-error_mdht" see="#p-OperativeNoteV3_1A_AssignedAuthor_code_2_14_7_ii_d-error_mdht" name="p-OperativeNoteV3_1A_AssignedAuthor_code_2_14_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Operative Note (V3) - 2.14.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Operative Note (V3) - 2.14.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_1A_AssignedAuthor_addr_2_14_7_ii_c-error_mdht" see="#p-OperativeNoteV3_1A_AssignedAuthor_addr_2_14_7_ii_c-error_mdht" name="p-OperativeNoteV3_1A_AssignedAuthor_addr_2_14_7_ii_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.7.ii.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5452, R2.1=CONF:1198-5452)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_1A_AssignedAuthor_id_2_14_7_ii_a-error_mdht" see="#p-OperativeNoteV3_1A_AssignedAuthor_id_2_14_7_ii_a-error_mdht" name="p-OperativeNoteV3_1A_AssignedAuthor_id_2_14_7_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.7.ii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5449, R2.1=CONF:1198-5449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-OperativeNoteV3_1A_AssignedAuthor_telecom_2_14_7_ii_d-error_mdht" see="#p-OperativeNoteV3_1A_AssignedAuthor_telecom_2_14_7_ii_d-error_mdht" name="p-OperativeNoteV3_1A_AssignedAuthor_telecom_2_14_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 2.14.7.ii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5428, R2.1=CONF:1198-5428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-OperativeNoteV3_1A_AuthoringDevice_softwareName_2_14_7_ii_e_2-error_mdht" see="#p-OperativeNoteV3_1A_AuthoringDevice_softwareName_2_14_7_ii_e_2-error_mdht" name="p-OperativeNoteV3_1A_AuthoringDevice_softwareName_2_14_7_ii_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.softwareName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
		-->
	<assert test="cda:softwareName">Error: Operative Note (V3) - 2.14.7.ii.e.2 softwareName
		Conformance: SHALL contain exactly one [1..1] softwareName (CONF:16785, R2.1=CONF:1198-16785)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-OperativeNoteV3_1A_AuthoringDevice_manufacturerModelName_2_14_7_ii_e_1-error_mdht" see="#p-OperativeNoteV3_1A_AuthoringDevice_manufacturerModelName_2_14_7_ii_e_1-error_mdht" name="p-OperativeNoteV3_1A_AuthoringDevice_manufacturerModelName_2_14_7_ii_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.manufacturerModelName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
		-->
	<assert test="cda:manufacturerModelName">Error: Operative Note (V3) - 2.14.7.ii.e.1 manufacturerModelName
		Conformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784, R2.1=CONF:1198-16784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_14_7_ii_d_1-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_14_7_ii_d_1-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_14_7_ii_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/telecom
			UML root path: /USRealmHeader2/author/assignedAuthor/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.14.7.ii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7995, R2.1=CONF:1198-7995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-OperativeNoteV3_1A_Person_name_2_14_7_ii_f_1-error_mdht" see="#p-OperativeNoteV3_1A_Person_name_2_14_7_ii_f_1-error_mdht" name="p-OperativeNoteV3_1A_Person_name_2_14_7_ii_f_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedPerson
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorPersonName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.7.ii.f.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:16789, R2.1=CONF:1198-16789)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-OperativeNoteV3_1A_Custodian_assignedCustodian_2_14_8_i-error_mdht" see="#p-OperativeNoteV3_1A_Custodian_assignedCustodian_2_14_8_i-error_mdht" name="p-OperativeNoteV3_1A_Custodian_assignedCustodian_2_14_8_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian
			UML root path: /USRealmHeader2/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: Operative Note (V3) - 2.14.8.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:5520, R2.1=CONF:1198-5520)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-OperativeNoteV3_1A_AssignedCustodian_representedCustodianOrganization_2_14_8_i_a-error_mdht" see="#p-OperativeNoteV3_1A_AssignedCustodian_representedCustodianOrganization_2_14_8_i_a-error_mdht" name="p-OperativeNoteV3_1A_AssignedCustodian_representedCustodianOrganization_2_14_8_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian
			UML root path: /USRealmHeader2/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::Custodian::AssignedCustodian::CustodianOrganization))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: Operative Note (V3) - 2.14.8.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:5521, R2.1=CONF:1198-5521)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-OperativeNoteV3_1A_CustodianOrganization_addr_2_14_8_i_a_4-error_mdht" see="#p-OperativeNoteV3_1A_CustodianOrganization_addr_2_14_8_i_a_4-error_mdht" name="p-OperativeNoteV3_1A_CustodianOrganization_addr_2_14_8_i_a_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.addr.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.8.i.a.4 addr
		Conformance: SHALL contain exactly one [1..1] addr (CONF:5559, R2.1=CONF:1198-5559)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-OperativeNoteV3_1A_CustodianOrganization_ProviderOrganization_2_14_5_i_e-error_mdht" see="#p-OperativeNoteV3_1A_CustodianOrganization_ProviderOrganization_2_14_5_i_e-error_mdht" name="p-OperativeNoteV3_1A_CustodianOrganization_ProviderOrganization_2_14_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Operative Note (V3) - 2.14.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id SHOULD include zero or one [0..1] @root =&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-OperativeNoteV3_1A_CustodianOrganization_id_2_14_8_i_a_1-error_mdht" see="#p-OperativeNoteV3_1A_CustodianOrganization_id_2_14_8_i_a_1-error_mdht" name="p-OperativeNoteV3_1A_CustodianOrganization_id_2_14_8_i_a_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.8.i.a.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:5522, R2.1=CONF:1198-5522)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-OperativeNoteV3_1A_CustodianOrganization_telecom_2_14_8_i_a_3-error_mdht" see="#p-OperativeNoteV3_1A_CustodianOrganization_telecom_2_14_8_i_a_3-error_mdht" name="p-OperativeNoteV3_1A_CustodianOrganization_telecom_2_14_8_i_a_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.telecom.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 2.14.8.i.a.3 telecom
		Conformance: SHALL contain exactly one [1..1] telecom (CONF:5525, R2.1=CONF:1198-5525)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CustodianOrganization -->

<pattern id="p-OperativeNoteV3_1A_CustodianOrganization_name_2_14_8_i_a_2-error_mdht" see="#p-OperativeNoteV3_1A_CustodianOrganization_name_2_14_8_i_a_2-error_mdht" name="p-OperativeNoteV3_1A_CustodianOrganization_name_2_14_8_i_a_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.name.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.8.i.a.2 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5524, R2.1=CONF:1198-5524)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_14_8_i_a_3_i-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_14_8_i_a_3_i-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_14_8_i_a_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
			UML root path: /USRealmHeader2/custodian/assignedCustodian/representedCustodianOrganization/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.14.8.i.a.3.i use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7998, R2.1=CONF:1198-7998)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-OperativeNoteV3_1A_InformationRecipient_intendedRecipient_2_14_9_i-error_mdht" see="#p-OperativeNoteV3_1A_InformationRecipient_intendedRecipient_2_14_9_i-error_mdht" name="p-OperativeNoteV3_1A_InformationRecipient_intendedRecipient_2_14_9_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient
			UML root path: /USRealmHeader2/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::USRealmHeader2::InformationRecipient::IntendedRecipient))
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: Operative Note (V3) - 2.14.9.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:1198-5566)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-OperativeNoteV3_1A_IntendedRecipient_id_2_14_9_i_a-error_mdht" see="#p-OperativeNoteV3_1A_IntendedRecipient_id_2_14_9_i_a-error_mdht" name="p-OperativeNoteV3_1A_IntendedRecipient_id_2_14_9_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: USRealmHeader2InformationRecipientIntendedRecipientId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Operative Note (V3) - 2.14.9.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:1198-32399)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-OperativeNoteV3_1A_IntendedRecipient_recievedOrganization_2_14_9_i_c-error_mdht" see="#p-OperativeNoteV3_1A_IntendedRecipient_recievedOrganization_2_14_9_i_c-error_mdht" name="p-OperativeNoteV3_1A_IntendedRecipient_recievedOrganization_2_14_9_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.receivedOrganization->select(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Organization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization
		-->
	<assert test="count(cda:receivedOrganization) &lt;= 1">Error: Operative Note (V3) - 2.14.9.i.c recievedOrganization
		Conformance: MAY contain zero or one [0..1] receivedOrganization (CONF:5577, R2.1=CONF:1198-5577)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-OperativeNoteV3_1A_IntendedRecipient_informationRecipient_2_14_9_i_b-error_mdht" see="#p-OperativeNoteV3_1A_IntendedRecipient_informationRecipient_2_14_9_i_b-error_mdht" name="p-OperativeNoteV3_1A_IntendedRecipient_informationRecipient_2_14_9_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Person))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &lt;= 1">Error: Operative Note (V3) - 2.14.9.i.b informationRecipient
		Conformance: MAY contain zero or one [0..1] informationRecipient (CONF:5568, R2.1=CONF:1198-5567)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-OperativeNoteV3_1A_Person_name_2_14_9_i_b_1-error_mdht" see="#p-OperativeNoteV3_1A_Person_name_2_14_9_i_b_1-error_mdht" name="p-OperativeNoteV3_1A_Person_name_2_14_9_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient/informationRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.9.i.b.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5568)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Organization -->

<pattern id="p-OperativeNoteV3_1A_Organization_name_2_14_9_i_c_1-error_mdht" see="#p-OperativeNoteV3_1A_Organization_name_2_14_9_i_c_1-error_mdht" name="p-OperativeNoteV3_1A_Organization_name_2_14_9_i_c_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient/recievedOrganization
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient/recievedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">
		<!--
			OCL: self.name->size() = 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName
		-->
	<assert test="count(cda:name) = 1">Error: Operative Note (V3) - 2.14.9.i.c.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5578, R2.1=CONF:1198-5578)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-OperativeNoteV3_1A_LegalAuthenticator_time_2_14_10_i-error_mdht" see="#p-OperativeNoteV3_1A_LegalAuthenticator_time_2_14_10_i-error_mdht" name="p-OperativeNoteV3_1A_LegalAuthenticator_time_2_14_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorTime
		-->
	<assert test="cda:time">Error: Operative Note (V3) - 2.14.10.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5580, R2.1=CONF:1198-5580)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-OperativeNoteV3_1A_LegalAuthenticator_sDTCSignatureText_2_14_10_iii-error_mdht" see="#p-OperativeNoteV3_1A_LegalAuthenticator_sDTCSignatureText_2_14_10_iii-error_mdht" name="p-OperativeNoteV3_1A_LegalAuthenticator_sDTCSignatureText_2_14_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2LegalAuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Operative Note (V3) - 2.14.10.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30810)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-OperativeNoteV3_1A_LegalAuthenticator_signatureCode_2_14_10_ii-error_mdht" see="#p-OperativeNoteV3_1A_LegalAuthenticator_signatureCode_2_14_10_ii-error_mdht" name="p-OperativeNoteV3_1A_LegalAuthenticator_signatureCode_2_14_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: Operative Note (V3) - 2.14.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: Operative Note (V3) - 2.14.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-OperativeNoteV3_1A_LegalAuthenticator_assignedEntity_2_14_10_iv-error_mdht" see="#p-OperativeNoteV3_1A_LegalAuthenticator_assignedEntity_2_14_10_iv-error_mdht" name="p-OperativeNoteV3_1A_LegalAuthenticator_assignedEntity_2_14_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Operative Note (V3) - 2.14.10.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585, R2.1=CONF:1198-5585)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_10_iv_c-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_10_iv_c-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_10_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.10.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5589, R2.1=CONF:1198-5589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_10_iv_d-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_10_iv_d-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_10_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 2.14.10.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5595, R2.1=CONF:1198-5595)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_10_iv_b-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_code_2_14_10_iv_b-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_10_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Operative Note (V3) - 2.14.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Operative Note (V3) - 2.14.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_10_iv_e-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_10_iv_e-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_10_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Operative Note (V3) - 2.14.10.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597, R2.1=CONF:1198-5597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_10_iv_a-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_id_2_14_10_iv_a-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_10_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.10.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5586, R2.1=CONF:1198-5586)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_ProviderOrganization_2_14_5_i_e-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_ProviderOrganization_2_14_5_i_e-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_ProviderOrganization_2_14_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Operative Note (V3) - 2.14.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id MAY contain zero or one [0..1] @root=&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_14_10_iv_d_1-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_14_10_iv_d_1-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_14_10_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.14.10.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7999, R2.1=CONF:1198-7999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-OperativeNoteV3_1A_Person_name_2_14_10_iv_e_1-error_mdht" see="#p-OperativeNoteV3_1A_Person_name_2_14_10_iv_e_1-error_mdht" name="p-OperativeNoteV3_1A_Person_name_2_14_10_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.10.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5598, R2.1=CONF:1198-5598)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-OperativeNoteV3_1A_Authenticator_signatureCode_2_14_11_ii-error_mdht" see="#p-OperativeNoteV3_1A_Authenticator_signatureCode_2_14_11_ii-error_mdht" name="p-OperativeNoteV3_1A_Authenticator_signatureCode_2_14_11_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: Operative Note (V3) - 2.14.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: Operative Note (V3) - 2.14.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-OperativeNoteV3_1A_Authenticator_time_2_14_11_i-error_mdht" see="#p-OperativeNoteV3_1A_Authenticator_time_2_14_11_i-error_mdht" name="p-OperativeNoteV3_1A_Authenticator_time_2_14_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorTime
		-->
	<assert test="cda:time">Error: Operative Note (V3) - 2.14.11.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5608, R2.1=CONF:1198-5608)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-OperativeNoteV3_1A_Authenticator_sDTCSignatureText_2_14_11_iii-error_mdht" see="#p-OperativeNoteV3_1A_Authenticator_sDTCSignatureText_2_14_11_iii-error_mdht" name="p-OperativeNoteV3_1A_Authenticator_sDTCSignatureText_2_14_11_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2AuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Operative Note (V3) - 2.14.11.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30811)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-OperativeNoteV3_1A_Authenticator_assignedEntity_2_14_11_iv-error_mdht" see="#p-OperativeNoteV3_1A_Authenticator_assignedEntity_2_14_11_iv-error_mdht" name="p-OperativeNoteV3_1A_Authenticator_assignedEntity_2_14_11_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Operative Note (V3) - 2.14.11.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5612, R2.1=CONF:1198-5612)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_11_iv_c-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_11_iv_c-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_11_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.11.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5616, R2.1=CONF:1198-5616)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_11_iv_b-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_code_2_14_11_iv_b-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_11_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Operative Note (V3) - 2.14.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Operative Note (V3) - 2.14.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_11_iv_a-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_id_2_14_11_iv_a-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_11_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.11.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5613, R2.1=CONF:1198-5613)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_11_iv_d-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_11_iv_d-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_11_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Operative Note (V3) - 2.14.11.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5622, R2.1=CONF:1198-5622)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_11_iv_e-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_11_iv_e-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_11_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Operative Note (V3) - 2.14.11.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5624, R2.1=CONF:1198-5624)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-OperativeNoteV3_1A_TEL_use_2_14_11_iv_d_1-error_mdht" see="#p-OperativeNoteV3_1A_TEL_use_2_14_11_iv_d_1-error_mdht" name="p-OperativeNoteV3_1A_TEL_use_2_14_11_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/authenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Operative Note (V3) - 2.14.11.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:8000, R2.1=CONF:1198-8000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-OperativeNoteV3_1A_Person_name_2_14_11_iv_e_1-error_mdht" see="#p-OperativeNoteV3_1A_Person_name_2_14_11_iv_e_1-error_mdht" name="p-OperativeNoteV3_1A_Person_name_2_14_11_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.11.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5625, R2.1=CONF:1198-5625)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_12_i_b-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_code_2_14_12_i_b-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_code_2_14_12_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Operative Note (V3) - 2.14.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Operative Note (V3) - 2.14.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_12_i_c-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_12_i_c-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_12_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Operative Note (V3) - 2.14.12.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:1198-8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_12_i_a-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_id_2_14_12_i_a-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_id_2_14_12_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.12.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9945, R2.1=CONF:1198-9945)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_12_i_d-error_mdht" see="#p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_12_i_d-error_mdht" name="p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_12_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Operative Note (V3) - 2.14.12.i.d assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:8221, R2.1=CONF:1198-8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-OperativeNoteV3_1A_Person_name_2_14_12_i_d_1-error_mdht" see="#p-OperativeNoteV3_1A_Person_name_2_14_12_i_d_1-error_mdht" name="p-OperativeNoteV3_1A_Person_name_2_14_12_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/informant/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Operative Note (V3) - 2.14.12.i.d.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:8222, CONF:10420, R2.1=CONF:1198-8222)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-OperativeNoteV3_1A_RelatedEntity_addr_2_14_12_ii_a-error_mdht" see="#p-OperativeNoteV3_1A_RelatedEntity_addr_2_14_12_ii_a-error_mdht" name="p-OperativeNoteV3_1A_RelatedEntity_addr_2_14_12_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/relatedEntity
			UML root path: /USRealmHeader2/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: (not ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())))
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)])">Error: Operative Note (V3) - 2.14.12.ii.a addr
		Conformance: contain  [0..0] addr
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InFulfillmentOf -->

<pattern id="p-OperativeNoteV3_1A_InFulfillmentOf_order_2_14_13_i-error_mdht" see="#p-OperativeNoteV3_1A_InFulfillmentOf_order_2_14_13_i-error_mdht" name="p-OperativeNoteV3_1A_InFulfillmentOf_order_2_14_13_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf
			UML root path: /USRealmHeader2/inFulfillmentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf">
		<!--
			OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::GeneralHeaderConstraints::InFulfillmentOf::Order))
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrder
		-->
	<assert test="count(cda:order)=1">Error: Operative Note (V3) - 2.14.13.i order
		Conformance: SHALL contain exactly one [1..1] order (CONF:9953, R2.1=CONF:1198-9953)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Order -->

<pattern id="p-OperativeNoteV3_1A_Order_id_2_14_13_i_a-error_mdht" see="#p-OperativeNoteV3_1A_Order_id_2_14_13_i_a-error_mdht" name="p-OperativeNoteV3_1A_Order_id_2_14_13_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf/order
			UML root path: /USRealmHeader2/inFulfillmentOf/order
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrderId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.13.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9954, R2.1=CONF:1198-9954)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-OperativeNoteV3_2_ComponentOf_encompassingEncounter_2_14_14_i-error_mdht" see="#p-OperativeNoteV3_2_ComponentOf_encompassingEncounter_2_14_14_i-error_mdht" name="p-OperativeNoteV3_2_ComponentOf_encompassingEncounter_2_14_14_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf
			UML root path: /USRealmHeader2/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::USRealmHeader2::ComponentOf::EncompassingEncounter))
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: Operative Note (V3) - 2.14.14.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:1198-9956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-OperativeNoteV3_2_EncompassingEncounter_effectiveTime_2_14_14_i_b-error_mdht" see="#p-OperativeNoteV3_2_EncompassingEncounter_effectiveTime_2_14_14_i_b-error_mdht" name="p-OperativeNoteV3_2_EncompassingEncounter_effectiveTime_2_14_14_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Operative Note (V3) - 2.14.14.i.b effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:9958, R2.1=CONF:1198-9958)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-OperativeNoteV3_2_EncompassingEncounter_id_2_14_14_i_a-error_mdht" see="#p-OperativeNoteV3_2_EncompassingEncounter_id_2_14_14_i_a-error_mdht" name="p-OperativeNoteV3_2_EncompassingEncounter_id_2_14_14_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterId
		-->
	<assert test="cda:id">Error: Operative Note (V3) - 2.14.14.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9959, R2.1=CONF:1198-9959)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-OperativeNoteV3_1A_ParticipantSupport_time_2_14_15_i-error_mdht" see="#p-OperativeNoteV3_1A_ParticipantSupport_time_2_14_15_i-error_mdht" name="p-OperativeNoteV3_1A_ParticipantSupport_time_2_14_15_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: Operative Note (V3) - 2.14.15.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004, R2.1=CONF:1198-10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-OperativeNoteV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" see="#p-OperativeNoteV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" name="p-OperativeNoteV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: Operative Note (V3) - 2.6.21 ParticipantSupport
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: SHALL contain associatedEntity/associatedPerson AND/OR associatedEntity/scopingOrganization
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
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:effectiveTime</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization">Cannot find context /cda:ClinicalDocument/cda:authorization</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization">Cannot find context /cda:ClinicalDocument/cda:authorization</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:component">Cannot find context /cda:ClinicalDocument/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.25']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.25"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity/cda:representedOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:performer/cda:assignedEntity/cda:representedOrganization">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:performer/cda:assignedEntity/cda:representedOrganization</assert>
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
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.20"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.20"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.20"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.20"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.20"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:entryRelationship/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.20']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:entryRelationship/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.20"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:serviceDeliveryLocation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.32"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:serviceDeliveryLocation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.32"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:serviceDeliveryLocation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.32"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:serviceDeliveryLocation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.32"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:serviceDeliveryLocation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.32"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:serviceDeliveryLocation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.32']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:serviceDeliveryLocation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.32"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:productInstance[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:productInstance[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:productInstance[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:productInstance[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:productInstance[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']/cda:scopingEntity">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:productInstance[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.37"]/cda:scopingEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.7']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.14']/cda:productInstance[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.37']/cda:playingDevice">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.7"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.14"]/cda:productInstance[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.37"]/cda:playingDevice</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.37"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.37']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.37"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:value">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:value</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:value">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:value</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:code">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:code</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.113"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.113"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.113"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.113"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.113"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.113"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.5.1']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.3']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.4']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.113']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.5.1"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.3"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.4"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.113"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.65"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.65"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.65"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.65"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.65"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.34']/cda:entry/cda:act[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.65']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.34"]/cda:entry/cda:act[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.65"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.9"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.9"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.9"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.9"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.9']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.9"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.28"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.28"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.28"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.28"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.28"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.28"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.28']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.28"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.31"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.31"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.31"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.31"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.31']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.31"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.27"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.27"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.27"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.27"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.27']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.27"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component[cda:section/cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.35"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.35"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.35"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.35"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.35']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.35"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.40"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.40"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.40"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.40']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.40"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.14']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.14"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.10']/cda:entry/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.44']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.143']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.10"]/cda:entry/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.44"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.143"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.30']/cda:entry/cda:procedure[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.41']/cda:entryRelationship">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.30"]/cda:entry/cda:procedure[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.41"]/cda:entryRelationship</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.18.2.12']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.18.2.12"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.29"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.29"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.29"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.29"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.29"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.29']/cda:entry">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.29"]/cda:entry</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.22.2.2.1']/cda:entry/cda:substanceAdministration[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.52']/cda:entryRelationship/cda:observation[cda:templateId/@root = '2.16.840.1.113883.10.20.22.4.19']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.22.2.2.1"]/cda:entry/cda:substanceAdministration[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.52"]/cda:entryRelationship/cda:observation[cda:templateId/@root = "2.16.840.1.113883.10.20.22.4.19"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.13"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.13"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.13"]</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = '2.16.840.1.113883.10.20.7.13']">Cannot find context /cda:ClinicalDocument/cda:component/cda:structuredBody/cda:component/cda:section[cda:templateId/@root = "2.16.840.1.113883.10.20.7.13"]</assert>
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
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_effectiveTime_2_14_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_templateId_2_14_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_dataEnterer_2_14_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_languageCode_2_14_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_confidentialityCode_2_14_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_recordTarget_2_14_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_inFulfillmentOf_2_14_13-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_realmCode_2_14_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_setId_2_14_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_documentationOf_2_14_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_author_2_14_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_informant_2_14_12-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_authorization_2_14_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteV3_componentOf_2_14_14-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_supportParticipant_2_14_15-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_typeId_2_14_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_versionNumber_2_14_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_custodian_2_14_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_title_2_14_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_informationRecipient_2_14_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteV3_component_2_14_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_code_2_14_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_legalAuthenticator_2_14_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_id_2_14_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_OperativeNoteV3_authenticator_2_14_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_DocumentationOf_serviceEvent_2_14_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ServiceEvent_effectiveTime_2_14_4_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ServiceEvent_performer_2_14_4_i_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ServiceEvent_code_2_14_4_i_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ServiceEvent_performerAssistants_2_14_4_i_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmDateAndTimeDT_low_2_14_4_i_a_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Performer_typeCode_2_14_4_i_c_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Performer_assignedEntity_2_14_4_i_c_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_c_2_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_PerformerAssistants_assignedEntity_2_14_4_i_d_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_PerformerAssistants_typeCode_2_14_4_i_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_code_2_14_4_i_d_2_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Authorization_typeCode_2_14_5_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Authorization_consent_2_14_5_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Consent_statusCode_2_14_5_ii_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Consent_moodCode_2_14_5_ii_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Consent_classCode_2_14_5_ii_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_structuredBody_2_14_6_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_postoperativeDiagnosisSection_2_14_6_i_h-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_surgicalDrainsSection_2_14_6_i_p-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_preoperativeDiagnosisSection2_2_14_6_i_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_operativeNoteFluidSection_2_14_6_i_j-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_procedureEstimatedBloodLossSection_2_14_6_i_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_operativeNoteSurgicalProcedureSection_2_14_6_i_k-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_anesthesiaSection2_2_14_6_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_procedureIndicationsSection2_2_14_6_i_o-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_procedureFindingsSection2_2_14_6_i_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_complicationsSection2_2_14_6_i_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_planOfTreatmentSection2_2_14_6_i_l-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_plannedProcedureSection2_2_14_6_i_m-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_procedureImplantsSection_2_14_6_i_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_procedureDescriptionSection_2_14_6_i_g-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_procedureSpecimensTakenSection_2_14_6_i_f-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_StructuredBody_procedureDispositionSection_2_14_6_i_n-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_anesthesiaSection2_2_14_6_i_a_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_AnesthesiaSection2_templateId_3_12_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_AnesthesiaSection2_text_3_12_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_AnesthesiaSection2_code_3_12_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AnesthesiaSection2_entry_3_12_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_AnesthesiaSection2_title_3_12_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2Entry_procedureActivityProcedure2_3_12_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_moodCode_4_122_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_priorityCode_4_122_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_12-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_classCode_4_122_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_specimen_4_122_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_id_4_122_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_authorParticipation_4_122_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_serviceDeliveryLocation_4_122_12-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_targetSiteCode_4_122_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_entryRelationship_4_122_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_performer_4_122_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_methodCode_4_122_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_effectiveTime_4_122_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_templateId_4_122_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_statusCode_4_122_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_productInstance_4_122_14-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityProcedure2_code_4_122_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityPerformer_assignedEntity_4_122_7_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_addr_4_122_7_i_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_id_4_122_7_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_representedOrganization_4_122_7_i_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityAssignedEntity_telecom_4_122_7_i_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_id_4_122_7_i_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_addr_4_122_7_i_d_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_name_4_122_7_i_d_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureActivityRepresentedOrganization_telecom_4_122_7_i_d_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AuthorParticipation_time_4_48_9_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AuthorParticipation_assignedAuthor_4_48_9_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AuthorParticipation_templateId_4_48_9_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AssignedAuthor_AuthorParticipationAssignedAuthorCodeTerminology_4_48_9_iii_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AssignedAuthor_code_4_48_9_iii_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AssignedAuthor_assignedPerson_4_48_9_iii_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AssignedAuthor_representedOrganization_4_48_9_iii_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AssignedAuthor_id_4_48_9_iii_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_AssignedPerson_name_4_48_9_iii_c_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_RepresentedOrganization_name_4_48_9_iii_d_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_RepresentedOrganization_classCode_4_48_9_iii_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_RepresentedOrganization_addr_4_48_9_iii_d_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_RepresentedOrganization_telecom_4_48_9_iii_d_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_RepresentedOrganization_id_4_48_9_iii_d_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Instruction2EntryRelationship_instruction2_4_122_9_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Instruction2_templateId_4_63_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Instruction2_text_4_63_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Instruction2_moodCode_4_63_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Instruction2_classCode_4_63_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Instruction2_statusCode_4_63_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Instruction2_code_4_63_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ServiceDeliveryLocation_ServiceDeliveryLocationHasPlayingEntity_4_122_12_vi-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ServiceDeliveryLocation_addr_4_122_12_iv-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ServiceDeliveryLocation_telecom_4_122_12_v-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ServiceDeliveryLocation_templateId_4_122_12_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ServiceDeliveryLocation_classCode_4_122_12_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ServiceDeliveryLocation_code_4_122_12_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProductInstance_scopingEntity_4_122_14_iv-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProductInstance_playingDevice_4_122_14_v-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProductInstance_classCode_4_122_14_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProductInstance_id_4_122_14_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProductInstance_templateId_4_122_14_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ScopingEntity_id_4_122_14_iv_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlayingDevice_code_4_122_14_v_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_complicationsSection2_2_14_6_i_b_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ComplicationsSectionV3_title_3_19_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ComplicationsSectionV3_code_3_19_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ComplicationsSectionV3_text_3_19_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ComplicationsSectionV3_entry_3_19_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ComplicationsSectionV3_templateId_3_19_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_19_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_value_4_115_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_templateId_4_115_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_moodCode_4_115_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_effectiveTime_4_66_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_statusCode_4_66_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_12-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_code_4_115_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_id_4_66_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_entryRelationship_4_115_13-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_classCode_4_115_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_negationInd_4_66_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_authorParticipation_4_115_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservationV3_text_4_66_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_CD_qualifier_4_115_5_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_CD_code_4_115_5_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_CDCode_translation_4_115_6_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservationEntryRelationship_prognosisObservation_4_115_10_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservation_moodCode_4_124_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservation_statusCode_4_124_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservation_templateId_4_124_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservation_code_4_124_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservation_value_4_124_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservation_effectiveTime_4_124_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PrognosisObservation_classCode_4_124_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_preoperativeDiagnosisSection2_2_14_6_i_c_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_text_3_87_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PreoperativeDiagnosisSectionV3_entry_3_87_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_code_3_87_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_title_3_87_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PreoperativeDiagnosisSectionV3_templateId_3_87_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PreoperativeDiagnosis2Entry_preoperativeDiagnosis2_3_87_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_code_4_109_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_moodCode_4_109_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_templateId_4_109_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_entryRelationship_4_109_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PreoperativeDiagnosisV3_classCode_4_109_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservation2EntryRelationship_problemObservation2_4_109_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_procedureEstimatedBloodLossSection_2_14_6_i_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_title_3_94_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_templateId_3_94_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_text_3_94_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureEstimatedBloodLossSection_code_3_94_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_procedureFindingsSection2_2_14_6_i_e_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureFindingsSectionV3_templateId_3_96_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureFindingsSectionV3_entry_3_96_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureFindingsSectionV3_title_3_96_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureFindingsSectionV3_text_3_96_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureFindingsSectionV3_code_3_96_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProblemObservation2Entry_problemObservation2_3_96_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_procedureSpecimensTakenSection_2_14_6_i_f_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_title_3_100_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_templateId_3_100_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_code_3_100_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureSpecimensTakenSection_text_3_100_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_procedureDescriptionSection_2_14_6_i_g_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDescriptionSection_title_3_92_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDescriptionSection_code_3_92_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDescriptionSection_text_3_92_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDescriptionSection_templateId_3_92_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_postoperativeDiagnosisSection_2_14_6_i_h_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PostoperativeDiagnosisSection_templateId_3_83_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PostoperativeDiagnosisSection_title_3_83_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PostoperativeDiagnosisSection_code_3_83_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PostoperativeDiagnosisSection_text_3_83_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_procedureImplantsSection_2_14_6_i_i_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureImplantsSection_templateId_3_97_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureImplantsSection_code_3_97_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureImplantsSection_title_3_97_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureImplantsSection_text_3_97_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_operativeNoteFluidSection_2_14_6_i_j_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteFluidSection_code_3_72_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteFluidSection_templateId_3_72_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteFluidSection_title_3_72_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteFluidSection_text_3_72_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_operativeNoteSurgicalProcedureSection_2_14_6_i_k_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_templateId_3_73_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_text_3_73_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_title_3_73_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_OperativeNoteSurgicalProcedureSection_code_3_73_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_planOfTreatmentSection2_2_14_6_i_l_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlanOfTreatmentSection2_text_3_82_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_13-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlanOfTreatmentSection2_templateId_3_82_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_14-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlanOfTreatmentSection2_title_3_82_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlanOfTreatmentSection2_code_3_82_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_12-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlanOfTreatmentSection2_entry_3_82_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2Entry_plannedObservation2_3_82_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_12-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_15-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_value_4_94_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_methodCode_4_94_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_authorParticipation_4_94_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_effectiveTime_4_94_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_performer_4_94_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_13-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_entryRelationship_4_94_14-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_code_4_94_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_statusCode_4_94_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_moodCode_4_94_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_targetSiteCode_4_94_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedObservation2_templateId_4_94_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_94_12_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_effectiveTime_4_111_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_templateId_4_111_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_code_4_111_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_authorParticipation_4_111_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_id_4_111_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_classCode_4_111_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_moodCode_4_111_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreference_value_4_111_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_plannedProcedureSection2_2_14_6_i_m_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlannedProcedureSection2_title_3_80_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlannedProcedureSection2_templateId_3_80_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedureSection2_entry_3_80_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlannedProcedureSection2_code_3_80_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_PlannedProcedureSection2_text_3_80_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2Entry_plannedProcedure2_3_80_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_code_4_95_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_13-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_14-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_moodCode_4_95_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_targetSiteCode_4_95_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_authorParticipation_4_95_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_performer_4_95_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_classCode_4_95_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_entryRelationship_4_95_12-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_methodCode_4_95_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_templateId_4_95_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_effectiveTime_4_95_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_statusCode_4_95_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PlannedProcedure2_id_4_95_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_PriorityPreferenceEntryRelationship_PriorityPreference_4_95_11_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_procedureDispositionSection_2_14_6_i_n_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDispositionSection_title_3_93_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDispositionSection_text_3_93_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDispositionSection_templateId_3_93_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureDispositionSection_code_3_93_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_procedureIndicationsSection2_2_14_6_i_o_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureIndicationsSection2_templateId_3_99_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureIndicationsSection2_text_3_99_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureIndicationsSection2_code_3_99_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_ProcedureIndicationsSection2_entry_3_99_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ProcedureIndicationsSection2_title_3_99_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2Entry_indication2_3_99_4_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_statusCode_4_62_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_classCode_4_62_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_value_4_62_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_id_4_62_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_code_4_62_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_Indication_4_61-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_moodCode_4_62_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_effectiveTime_4_62_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_IndicationCodeNullFlavor_4_61_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_3A_Indication2_templateId_4_62_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_Component_surgicalDrainsSection_2_14_6_i_p_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_SurgicalDrainsSection_templateId_3_116_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_SurgicalDrainsSection_code_3_116_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_SurgicalDrainsSection_text_3_116_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_SurgicalDrainsSection_title_3_116_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_RecordTarget_patientRole_2_14_5_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_PatientRole_patient_2_14_5_i_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_PatientRole_telecom_2_14_5_i_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_PatientRole_providerOrganization_2_14_5_i_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_PatientRole_id_2_14_5_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_PatientRole_addr_2_14_5_i_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_maritalStatusCode_2_14_5_i_e_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_birthTime_2_14_5_i_e_8-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_name_2_14_5_i_e_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_languageCommunication_2_14_5_i_e_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_raceCode_2_14_5_i_e_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_guardian_2_14_5_i_e_9-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_ethnicGroupCode_2_14_5_i_e_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_religiousAffiliationCode_2_14_5_i_e_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_administrativeGenderCode_2_14_5_i_e_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_sDTCRaceCode_2_14_5_i_e_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Patient_birthplace_2_14_5_i_e_11-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Guardian_code_2_14_5_i_e_9_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Guardian_addr_2_14_5_i_e_9_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Guardian_telecom_2_14_5_i_e_9_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Guardian_guardianPerson_2_14_5_i_e_9_iv-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_6_12_i_d_9_iii_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_14_5_i_b_7-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Person_name_2_14_5_i_e_9_iv_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LanguageCommunication_languageCode_2_14_5_i_e_10_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LanguageCommunication_preferenceInd_2_14_5_i_e_10_iv-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LanguageCommunication_modeCode_2_14_5_i_e_10_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LanguageCommunication_proficiencyLevelCode_2_14_5_i_e_10_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TS_value_2_14_5_i_e_8_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Birthplace_place_2_14_5_i_e_11_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Place_addr_2_14_5_i_e_11_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmPatientName_given_2_19_5_ii_b_1_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmPatientName_GeneralHeaderConstraints_2_10-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmPatientName_family_2_19_5_ii_b_1_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmPatientName_prefix_2_19_5_ii_b_1_iv-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmPatientName_suffix_2_19_5_ii_b_1_v-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_USRealmPatientName_use_2_19_5_ii_b_1_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ProviderOrganization_GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier_2_14_5_i_e_5-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ProviderOrganization_addr_2_14_5_i_e_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ProviderOrganization_telecom_2_14_5_i_e_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ProviderOrganization_name_2_14_5_i_e_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ProviderOrganization_id_2_14_5_i_e_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_14_5_i_e_3_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_14_5_i_c_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_DataEnterer_assignedEntity_2_14_6_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_6_i_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_id_2_14_6_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_6_i_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_code_2_14_6_i_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_6_i_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_14_6_i_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Person_name_2_14_6_i_e_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Author_assignedAuthor_2_14_7_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Author_time_2_14_7_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedAuthor_code_2_14_7_ii_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedAuthor_addr_2_14_7_ii_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedAuthor_id_2_14_7_ii_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedAuthor_telecom_2_14_7_ii_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AuthoringDevice_softwareName_2_14_7_ii_e_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AuthoringDevice_manufacturerModelName_2_14_7_ii_e_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_14_7_ii_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Person_name_2_14_7_ii_f_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Custodian_assignedCustodian_2_14_8_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedCustodian_representedCustodianOrganization_2_14_8_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_CustodianOrganization_addr_2_14_8_i_a_4-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_CustodianOrganization_ProviderOrganization_2_14_5_i_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_CustodianOrganization_id_2_14_8_i_a_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_CustodianOrganization_telecom_2_14_8_i_a_3-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_CustodianOrganization_name_2_14_8_i_a_2-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_14_8_i_a_3_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_InformationRecipient_intendedRecipient_2_14_9_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_IntendedRecipient_id_2_14_9_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_IntendedRecipient_recievedOrganization_2_14_9_i_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_IntendedRecipient_informationRecipient_2_14_9_i_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Person_name_2_14_9_i_b_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Organization_name_2_14_9_i_c_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LegalAuthenticator_time_2_14_10_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LegalAuthenticator_sDTCSignatureText_2_14_10_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LegalAuthenticator_signatureCode_2_14_10_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_LegalAuthenticator_assignedEntity_2_14_10_iv-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_10_iv_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_10_iv_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_code_2_14_10_iv_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_10_iv_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_id_2_14_10_iv_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_ProviderOrganization_2_14_5_i_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_14_10_iv_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Person_name_2_14_10_iv_e_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Authenticator_signatureCode_2_14_11_ii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Authenticator_time_2_14_11_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Authenticator_sDTCSignatureText_2_14_11_iii-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Authenticator_assignedEntity_2_14_11_iv-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_11_iv_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_code_2_14_11_iv_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_id_2_14_11_iv_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_telecom_2_14_11_iv_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_11_iv_e-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_TEL_use_2_14_11_iv_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Person_name_2_14_11_iv_e_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_code_2_14_12_i_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_addr_2_14_12_i_c-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_id_2_14_12_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_AssignedEntity_assignedPerson_2_14_12_i_d-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Person_name_2_14_12_i_d_1-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_RelatedEntity_addr_2_14_12_ii_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_InFulfillmentOf_order_2_14_13_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_Order_id_2_14_13_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_ComponentOf_encompassingEncounter_2_14_14_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_EncompassingEncounter_effectiveTime_2_14_14_i_b-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_2_EncompassingEncounter_id_2_14_14_i_a-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ParticipantSupport_time_2_14_15_i-error_mdht"/>
	<active pattern = "p-OperativeNoteV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
