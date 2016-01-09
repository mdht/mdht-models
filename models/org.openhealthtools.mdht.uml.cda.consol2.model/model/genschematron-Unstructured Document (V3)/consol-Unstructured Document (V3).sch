<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_setId_2_22_10-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_setId_2_22_10-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_setId_2_22_10-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: Unstructured Document (V3) - 2.22.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_inFulfillmentOf_2_22_13-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_inFulfillmentOf_2_22_13-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_inFulfillmentOf_2_22_13-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: Unstructured Document (V3) - 2.22.13 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:1198-9952)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_versionNumber_2_22_11-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_versionNumber_2_22_11-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_versionNumber_2_22_11-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: Unstructured Document (V3) - 2.22.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informant_2_22_12-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informant_2_22_12-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informant_2_22_12-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: Unstructured Document (V3) - 2.22.12 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:1198-8001, CONF:1198-31355)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informationRecipient_2_22_9-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informationRecipient_2_22_9-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informationRecipient_2_22_9-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: GeneralHeaderConstraintsInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: Unstructured Document (V3) - 2.22.9 informationRecipient
		Conformance: MAY contain zero or more [0..*] informationRecipient (CONF:1198-5565)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_templateId_2_22_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_templateId_2_22_1-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_templateId_2_22_1-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.10' and id.extension = '2015-08-01')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.22.1.10' and @extension = '2015-08-01'">Error: Unstructured Document (V3) - 2.22.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-7710, CONF:1198-10054, CONF:1198-32522 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.22.1.10&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_component_2_22_5-error_mdht" see="#p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_component_2_22_5-error_mdht" name="p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_component_2_22_5-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))
			Constraint name: UnstructuredDocument2Component
		-->
	<assert test="count(cda:component)=1">Error: Unstructured Document (V3) - 2.22.5 component
		Conformance: SHALL contain exactly one [1..1] component (CONF:1198-31085)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_documentationOf_2_22_16-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_documentationOf_2_22_16-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_documentationOf_2_22_16-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->select(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOf
		-->
	<assert test="count(cda:documentationOf) &gt;= 0">Error: Unstructured Document (V3) - 2.22.16 documentationOf
		Conformance: MAY contain zero or more [0..*] documentationOf (CONF:1198-14835)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_typeId_2_22_3-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_typeId_2_22_3-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_typeId_2_22_3-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: Unstructured Document (V3) - 2.22.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_title_2_22_4-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_title_2_22_4-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_title_2_22_4-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: Unstructured Document (V3) - 2.22.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1198-5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_legalAuthenticator_2_22_10-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_legalAuthenticator_2_22_10-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_legalAuthenticator_2_22_10-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: GeneralHeaderConstraintsLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: Unstructured Document (V3) - 2.22.10 legalAuthenticator
		Conformance: SHOULD contain zero or one [0..1] legalAuthenticator (CONF:1198-5579)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authenticator_2_22_11-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authenticator_2_22_11-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authenticator_2_22_11-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: Unstructured Document (V3) - 2.22.11 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:1198-5607)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_effectiveTime_2_22_7-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_effectiveTime_2_22_7-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_effectiveTime_2_22_7-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Unstructured Document (V3) - 2.22.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_supportParticipant_2_22_15-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_supportParticipant_2_22_15-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_supportParticipant_2_22_15-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: Unstructured Document (V3) - 2.22.15 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:1198-10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_recordTarget_2_22_3-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_recordTarget_2_22_3-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_recordTarget_2_22_3-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: UnstructuredDocument2RecordTarget
		-->
	<assert test="cda:recordTarget">Error: Unstructured Document (V3) - 2.22.3 recordTarget
		Conformance: SHALL contain at least one [1..*] recordTarget (CONF:1198-31089)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_custodian_2_22_4-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_custodian_2_22_4-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_custodian_2_22_4-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: UnstructuredDocument2Custodian
		-->
	<assert test="count(cda:custodian)=1">Error: Unstructured Document (V3) - 2.22.4 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:1198-31096)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_author_2_22_7-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_author_2_22_7-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_author_2_22_7-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: GeneralHeaderConstraintsAuthor
		-->
	<assert test="cda:author">Error: Unstructured Document (V3) - 2.22.7 author
		Conformance: SHALL contain at least one [1..*] author (CONF:1198-5444)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_componentOf_2_22_14-error_mdht" see="#p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_componentOf_2_22_14-error_mdht" name="p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_componentOf_2_22_14-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: GeneralHeaderConstraintsComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: Unstructured Document (V3) - 2.22.14 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:1198-9955)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_id_2_22_4-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_id_2_22_4-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_id_2_22_4-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363, R2.1=CONF:1198-5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_languageCode_2_22_9-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_languageCode_2_22_9-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_languageCode_2_22_9-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: Unstructured Document (V3) - 2.22.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: Unstructured Document (V3) - 2.22.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_realmCode_2_22_3-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_realmCode_2_22_3-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_realmCode_2_22_3-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: Unstructured Document (V3) - 2.22.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: Unstructured Document (V3) - 2.22.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_code_2_22_5-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_code_2_22_5-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_code_2_22_5-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code">Error: Unstructured Document (V3) - 2.22.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:5253, R2.1=CONF:1198-5253)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authorization_2_22_17-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authorization_2_22_17-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authorization_2_22_17-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: Unstructured Document (V3) - 2.22.17 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:1198-16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_confidentialityCode_2_22_8-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_confidentialityCode_2_22_8-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_confidentialityCode_2_22_8-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: Unstructured Document (V3) - 2.22.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: Unstructured Document (V3) - 2.22.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- UnstructuredDocument2: 2.16.840.1.113883.10.20.22.1.10 -->

<pattern id="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_dataEnterer_2_22_6-error_mdht" see="#p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_dataEnterer_2_22_6-error_mdht" name="p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_dataEnterer_2_22_6-error_mdht">
		<!--
			UML path: /UnstructuredDocument2
			UML root path: /UnstructuredDocument2
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: GeneralHeaderConstraintsDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: Unstructured Document (V3) - 2.22.6 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:1198-5441)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-UnstructuredDocumentV3_1A_RecordTarget_patientRole_2_22_3_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_RecordTarget_patientRole_2_22_3_i-error_mdht" name="p-UnstructuredDocumentV3_1A_RecordTarget_patientRole_2_22_3_i-error_mdht">
		<!--
			UML path: /UnstructuredDocument2/recordTarget
			UML root path: /UnstructuredDocument2/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::UnstructuredDocument2::RecordTarget::PatientRole))
			Constraint name: UnstructuredDocument2RecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: Unstructured Document (V3) - 2.22.3.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:1198-31090)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-UnstructuredDocumentV3_1A_PatientRole_id_2_22_3_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_PatientRole_id_2_22_3_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_PatientRole_id_2_22_3_i_a-error_mdht">
		<!--
			UML path: /UnstructuredDocument2/recordTarget/patientRole
			UML root path: /UnstructuredDocument2/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: UnstructuredDocument2RecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.3.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-31091)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-UnstructuredDocumentV3_1A_Custodian_assignedCustodian_2_22_4_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_Custodian_assignedCustodian_2_22_4_i-error_mdht" name="p-UnstructuredDocumentV3_1A_Custodian_assignedCustodian_2_22_4_i-error_mdht">
		<!--
			UML path: /UnstructuredDocument2/custodian
			UML root path: /UnstructuredDocument2/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::UnstructuredDocument2::Custodian::AssignedCustodian))
			Constraint name: UnstructuredDocument2CustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: Unstructured Document (V3) - 2.22.4.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:1198-31097)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedCustodian_representedCustodianOrganization_2_22_4_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedCustodian_representedCustodianOrganization_2_22_4_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedCustodian_representedCustodianOrganization_2_22_4_i_a-error_mdht">
		<!--
			UML path: /UnstructuredDocument2/custodian/assignedCustodian
			UML root path: /UnstructuredDocument2/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization))
			Constraint name: UnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: Unstructured Document (V3) - 2.22.4.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:1198-31098)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Component -->

<pattern id="p-UnstructuredDocumentV3_2_Component_nonXMLBody_2_22_5_i-error_mdht" see="#p-UnstructuredDocumentV3_2_Component_nonXMLBody_2_22_5_i-error_mdht" name="p-UnstructuredDocumentV3_2_Component_nonXMLBody_2_22_5_i-error_mdht">
		<!--
			UML path: /UnstructuredDocument2/component
			UML root path: /UnstructuredDocument2/component
		-->
	<rule context="/cda:ClinicalDocument/cda:component">
		<!--
			OCL: self.nonXMLBody->one(nonXMLBody : cda::NonXMLBody | not nonXMLBody.oclIsUndefined() and nonXMLBody.oclIsKindOf(consol::UnstructuredDocument2::Component::NonXMLBody))
			Constraint name: UnstructuredDocument2ComponentNonXMLBody
		-->
	<assert test="count(cda:nonXMLBody)=1">Error: Unstructured Document (V3) - 2.22.5.i nonXMLBody
		Conformance: SHALL contain exactly one [1..1] nonXMLBody (CONF:1198-31086)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- NonXMLBody -->

<pattern id="p-UnstructuredDocumentV3_2_NonXMLBody_text_2_22_5_i_a-error_mdht" see="#p-UnstructuredDocumentV3_2_NonXMLBody_text_2_22_5_i_a-error_mdht" name="p-UnstructuredDocumentV3_2_NonXMLBody_text_2_22_5_i_a-error_mdht">
		<!--
			UML path: /UnstructuredDocument2/component/nonXMLBody
			UML root path: /UnstructuredDocument2/component/nonXMLBody
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:nonXMLBody">
		<!--
			OCL: not self.text.oclIsUndefined()
			Constraint name: UnstructuredDocument2ComponentNonXMLBodyText
		-->
	<assert test="cda:text">Error: Unstructured Document (V3) - 2.22.5.i.a text
		Conformance: SHALL contain exactly one [1..1] text (CONF:1198-31087)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ED -->

<pattern id="p-UnstructuredDocumentV3_2_ED_mediaType_2_22_5_i_a_1-error_mdht" see="#p-UnstructuredDocumentV3_2_ED_mediaType_2_22_5_i_a_1-error_mdht" name="p-UnstructuredDocumentV3_2_ED_mediaType_2_22_5_i_a_1-error_mdht">
		<!--
			UML path: /UnstructuredDocument2/component/nonXMLBody/text
			UML root path: /UnstructuredDocument2/component/nonXMLBody/text
		-->
	<rule context="/cda:ClinicalDocument/cda:component/cda:nonXMLBody/cda:text">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.mediaType.oclIsUndefined()) implies (self.mediaType='text/plain') ))
			Constraint name: UnstructuredDocument2ComponentNonXMLBodyEDMediaType
		-->
	<assert test="@nullFlavor or not(@mediaType) or @mediaType = 'text/plain'">Error: Unstructured Document (V3) - 2.22.5.i.a.1 mediaType
		Conformance: MAY contain zero or one [0..1] @mediaType=&quot;text/plain&quot;  (CONF:1198-31088)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-UnstructuredDocumentV3_1A_DataEnterer_assignedEntity_2_22_6_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_DataEnterer_assignedEntity_2_22_6_i-error_mdht" name="p-UnstructuredDocumentV3_1A_DataEnterer_assignedEntity_2_22_6_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer
			UML root path: /USRealmHeader2/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeader2::DataEnterer::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Unstructured Document (V3) - 2.22.6.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-5442)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_6_i_d-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_6_i_d-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Unstructured Document (V3) - 2.22.6.i.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5466, R2.1=CONF:1198-5466)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_6_i_c-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_6_i_c-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_6_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Unstructured Document (V3) - 2.22.6.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5460, R2.1=CONF:1198-5460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_6_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_6_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_6_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.6.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5443, R2.1=CONF:1198-5443)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_6_i_e-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_6_i_e-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_6_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::DataEnterer::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Unstructured Document (V3) - 2.22.6.i.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5469, R2.1=CONF:1198-5469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_6_i_d-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_6_i_d-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_6_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Unstructured Document (V3) - 2.22.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Unstructured Document (V3) - 2.22.6.i.d code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32173)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocumentV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_18_5_i_b_7-error_mdht" see="#p-UnstructuredDocumentV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_18_5_i_b_7-error_mdht" name="p-UnstructuredDocumentV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_18_5_i_b_7-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL: self.isNullFlavorUndefined() implies ( self.streetAddressLine->size() >=1 and self.streetAddressLine->size() <=4)
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		-->
	<assert test="@nullFlavor or count(cda:streetAddressLine) &gt;= 1 and count(cda:streetAddressLine) &lt;= 4">Error: Unstructured Document (V3) - 2.18.5.i.b.7 GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet
		Conformance: SHALL contain at least one and not more than 4 streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: SHALL contain at least one and not more than 4 streetAddressLine
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocumentV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" see="#p-UnstructuredDocumentV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht" name="p-UnstructuredDocumentV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.country->isEmpty()) and self.country->exists(element | element.isNullFlavorUndefined())) implies (self.country->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCountry
		-->
	<assert test="@nullFlavor or not(cda:country and cda:country[not(@nullFlavor)]) or count(cda:country) &lt;= 1">Error: Unstructured Document (V3) - 4.4.6.iii.b.2 country
		Conformance: SHOULD contain zero or one [0..1] country (CONF:7295, R2.1=CONF:81-7295)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocumentV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" see="#p-UnstructuredDocumentV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht" name="p-UnstructuredDocumentV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.streetAddressLine->isEmpty() ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressStreetAddressLine
		-->
	<assert test="@nullFlavor or cda:streetAddressLine">Error: Unstructured Document (V3) - 4.4.6.iii.b.6 streetAddressLine
		Conformance: SHALL contain at least one [1..*] streetAddressLine (CONF:7291, R2.1=CONF:81-7291)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocumentV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht" name="p-UnstructuredDocumentV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht">
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
	<assert test="@nullFlavor or not(@use) or not(@use[not(. and . = 'BAD' or . = 'DIR' or . = 'H' or . = 'HP' or . = 'HV' or . = 'PHYS' or . = 'PST' or . = 'PUB' or . = 'TMP' or . = 'WP')])">Error: Unstructured Document (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressUseP
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Unstructured Document (V3) - 4.4.6.iii.b.1 use
		Conformance: SHOULD contain zero or one [0..1] @use, which SHALL be selected from ValueSet PostalAddressUse 2.16.840.1.113883.1.11.10637 STATIC (CONF:7290, R2.1=CONF:81-7290)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocumentV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" see="#p-UnstructuredDocumentV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht" name="p-UnstructuredDocumentV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.state->isEmpty()) and self.state->exists(element | element.isNullFlavorUndefined())) implies (self.state->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressState
		-->
	<assert test="@nullFlavor or not(cda:state and cda:state[not(@nullFlavor)]) or count(cda:state) &lt;= 1">Error: Unstructured Document (V3) - 4.4.6.iii.b.3 state
		Conformance: SHOULD contain zero or one [0..1] state (CONF:7293, R2.1=CONF:81-7293)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocumentV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" see="#p-UnstructuredDocumentV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht" name="p-UnstructuredDocumentV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (((not self.postalCode->isEmpty()) and self.postalCode->exists(element | element.isNullFlavorUndefined())) implies (self.postalCode->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressPostalCode
		-->
	<assert test="@nullFlavor or not(cda:postalCode and cda:postalCode[not(@nullFlavor)]) or count(cda:postalCode) &lt;= 1">Error: Unstructured Document (V3) - 4.4.6.iii.b.5 postalCode
		Conformance: SHOULD contain zero or one [0..1] postalCode (CONF:7294, R2.1=CONF:81-7294)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmAddress -->

<pattern id="p-UnstructuredDocumentV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" see="#p-UnstructuredDocumentV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht" name="p-UnstructuredDocumentV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht">
		<!--
			UML path: /USRealmHeader2/recordTarget/patientRole/addr
			UML root path: /USRealmHeader2/recordTarget/patientRole/addr
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (self.city->size() = 1 ))
			Constraint name: GeneralHeaderConstraintsUSRealmAddressCity
		-->
	<assert test="@nullFlavor or count(cda:city) = 1">Error: Unstructured Document (V3) - 4.4.6.iii.b.4 city
		Conformance: SHALL contain exactly one [1..1] city (CONF:7292, R2.1=CONF:81-7292)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-UnstructuredDocumentV3_1A_TEL_use_2_22_6_i_d_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_TEL_use_2_22_6_i_d_1-error_mdht" name="p-UnstructuredDocumentV3_1A_TEL_use_2_22_6_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Unstructured Document (V3) - 2.22.6.i.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7996, R2.1=CONF:1198-7996)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-UnstructuredDocumentV3_1A_Person_name_2_22_6_i_e_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Person_name_2_22_6_i_e_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Person_name_2_22_6_i_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/dataEnterer/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsDataEntererAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Unstructured Document (V3) - 2.22.6.i.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5470)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-UnstructuredDocumentV3_1A_Author_time_2_22_7_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_Author_time_2_22_7_i-error_mdht" name="p-UnstructuredDocumentV3_1A_Author_time_2_22_7_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorTime
		-->
	<assert test="cda:time">Error: Unstructured Document (V3) - 2.22.7.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5445, R2.1=CONF:1198-5445)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-UnstructuredDocumentV3_1A_Author_assignedAuthor_2_22_7_ii-error_mdht" see="#p-UnstructuredDocumentV3_1A_Author_assignedAuthor_2_22_7_ii-error_mdht" name="p-UnstructuredDocumentV3_1A_Author_assignedAuthor_2_22_7_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/author
			UML root path: /USRealmHeader2/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::USRealmHeader2::Author::AssignedAuthor))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: Unstructured Document (V3) - 2.22.7.ii assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1198-5448)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedAuthor_telecom_2_22_7_ii_d-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedAuthor_telecom_2_22_7_ii_d-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedAuthor_telecom_2_22_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTelecom
		-->
	<assert test="cda:telecom">Error: Unstructured Document (V3) - 2.22.7.ii.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5428, R2.1=CONF:1198-5428)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedAuthor_id_2_22_7_ii_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedAuthor_id_2_22_7_ii_a-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedAuthor_id_2_22_7_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.7.ii.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5449, R2.1=CONF:1198-5449)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedAuthor_addr_2_22_7_ii_c-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedAuthor_addr_2_22_7_ii_c-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedAuthor_addr_2_22_7_ii_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAddr
		-->
	<assert test="cda:addr">Error: Unstructured Document (V3) - 2.22.7.ii.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5452, R2.1=CONF:1198-5452)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedAuthor_code_2_22_7_ii_d-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedAuthor_code_2_22_7_ii_d-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedAuthor_code_2_22_7_ii_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor
			UML root path: /USRealmHeader2/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Unstructured Document (V3) - 2.22.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (true)
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or true()">Error: Unstructured Document (V3) - 2.22.7.ii.d code
		Conformance: contain zero or one [0..1] code
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-UnstructuredDocumentV3_1A_AuthoringDevice_softwareName_2_22_7_ii_e_2-error_mdht" see="#p-UnstructuredDocumentV3_1A_AuthoringDevice_softwareName_2_22_7_ii_e_2-error_mdht" name="p-UnstructuredDocumentV3_1A_AuthoringDevice_softwareName_2_22_7_ii_e_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.softwareName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName
		-->
	<assert test="cda:softwareName">Error: Unstructured Document (V3) - 2.22.7.ii.e.2 softwareName
		Conformance: SHALL contain exactly one [1..1] softwareName (CONF:16785, R2.1=CONF:1198-16785)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AuthoringDevice -->

<pattern id="p-UnstructuredDocumentV3_1A_AuthoringDevice_manufacturerModelName_2_22_7_ii_e_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_AuthoringDevice_manufacturerModelName_2_22_7_ii_e_1-error_mdht" name="p-UnstructuredDocumentV3_1A_AuthoringDevice_manufacturerModelName_2_22_7_ii_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedAuthoringDevice
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedAuthoringDevice">
		<!--
			OCL: not self.manufacturerModelName.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName
		-->
	<assert test="cda:manufacturerModelName">Error: Unstructured Document (V3) - 2.22.7.ii.e.1 manufacturerModelName
		Conformance: SHALL contain exactly one [1..1] manufacturerModelName (CONF:16784, R2.1=CONF:1198-16784)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-UnstructuredDocumentV3_1A_TEL_use_2_22_7_ii_d_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_TEL_use_2_22_7_ii_d_1-error_mdht" name="p-UnstructuredDocumentV3_1A_TEL_use_2_22_7_ii_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/telecom
			UML root path: /USRealmHeader2/author/assignedAuthor/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Unstructured Document (V3) - 2.22.7.ii.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7995, R2.1=CONF:1198-7995)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-UnstructuredDocumentV3_1A_Person_name_2_22_7_ii_f_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Person_name_2_22_7_ii_f_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Person_name_2_22_7_ii_f_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/author/assignedAuthor/assignedPerson
			UML root path: /USRealmHeader2/author/assignedAuthor/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthorAssignedAuthorPersonName
		-->
	<assert test="cda:name">Error: Unstructured Document (V3) - 2.22.7.ii.f.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:16789, R2.1=CONF:1198-16789)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-UnstructuredDocumentV3_1A_InformationRecipient_intendedRecipient_2_22_9_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_InformationRecipient_intendedRecipient_2_22_9_i-error_mdht" name="p-UnstructuredDocumentV3_1A_InformationRecipient_intendedRecipient_2_22_9_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient
			UML root path: /USRealmHeader2/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::USRealmHeader2::InformationRecipient::IntendedRecipient))
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: Unstructured Document (V3) - 2.22.9.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:1198-5566)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-UnstructuredDocumentV3_1A_IntendedRecipient_recievedOrganization_2_22_9_i_c-error_mdht" see="#p-UnstructuredDocumentV3_1A_IntendedRecipient_recievedOrganization_2_22_9_i_c-error_mdht" name="p-UnstructuredDocumentV3_1A_IntendedRecipient_recievedOrganization_2_22_9_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.receivedOrganization->select(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Organization))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization
		-->
	<assert test="count(cda:receivedOrganization) &lt;= 1">Error: Unstructured Document (V3) - 2.22.9.i.c recievedOrganization
		Conformance: MAY contain zero or one [0..1] receivedOrganization (CONF:5577, R2.1=CONF:1198-5577)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-UnstructuredDocumentV3_1A_IntendedRecipient_id_2_22_9_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_IntendedRecipient_id_2_22_9_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_IntendedRecipient_id_2_22_9_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: USRealmHeader2InformationRecipientIntendedRecipientId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Unstructured Document (V3) - 2.22.9.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:1198-32399)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-UnstructuredDocumentV3_1A_IntendedRecipient_informationRecipient_2_22_9_i_b-error_mdht" see="#p-UnstructuredDocumentV3_1A_IntendedRecipient_informationRecipient_2_22_9_i_b-error_mdht" name="p-UnstructuredDocumentV3_1A_IntendedRecipient_informationRecipient_2_22_9_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(consol::GeneralHeaderConstraints::InformationRecipient::IntendedRecipient::Person))->size() <= 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &lt;= 1">Error: Unstructured Document (V3) - 2.22.9.i.b informationRecipient
		Conformance: MAY contain zero or one [0..1] informationRecipient (CONF:5568, R2.1=CONF:1198-5567)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-UnstructuredDocumentV3_1A_Person_name_2_22_9_i_b_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Person_name_2_22_9_i_b_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Person_name_2_22_9_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient/informationRecipient
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:informationRecipient">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName
		-->
	<assert test="cda:name">Error: Unstructured Document (V3) - 2.22.9.i.b.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5470, R2.1=CONF:1198-5568)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Organization -->

<pattern id="p-UnstructuredDocumentV3_1A_Organization_name_2_22_9_i_c_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Organization_name_2_22_9_i_c_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Organization_name_2_22_9_i_c_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informationRecipient/intendedRecipient/recievedOrganization
			UML root path: /USRealmHeader2/informationRecipient/intendedRecipient/recievedOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:receivedOrganization">
		<!--
			OCL: self.name->size() = 1
			Constraint name: GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName
		-->
	<assert test="count(cda:name) = 1">Error: Unstructured Document (V3) - 2.22.9.i.c.1 name
		Conformance: SHALL contain exactly one [1..1] name (CONF:5578, R2.1=CONF:1198-5578)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_LegalAuthenticator_time_2_22_10_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_LegalAuthenticator_time_2_22_10_i-error_mdht" name="p-UnstructuredDocumentV3_1A_LegalAuthenticator_time_2_22_10_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorTime
		-->
	<assert test="cda:time">Error: Unstructured Document (V3) - 2.22.10.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5580, R2.1=CONF:1198-5580)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_LegalAuthenticator_signatureCode_2_22_10_ii-error_mdht" see="#p-UnstructuredDocumentV3_1A_LegalAuthenticator_signatureCode_2_22_10_ii-error_mdht" name="p-UnstructuredDocumentV3_1A_LegalAuthenticator_signatureCode_2_22_10_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: Unstructured Document (V3) - 2.22.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: Unstructured Document (V3) - 2.22.10.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5583, R2.1=CONF:1198-5583)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5584, R2.1=CONF:1198-5584)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_LegalAuthenticator_sDTCSignatureText_2_22_10_iii-error_mdht" see="#p-UnstructuredDocumentV3_1A_LegalAuthenticator_sDTCSignatureText_2_22_10_iii-error_mdht" name="p-UnstructuredDocumentV3_1A_LegalAuthenticator_sDTCSignatureText_2_22_10_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2LegalAuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Unstructured Document (V3) - 2.22.10.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30810)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_LegalAuthenticator_assignedEntity_2_22_10_iv-error_mdht" see="#p-UnstructuredDocumentV3_1A_LegalAuthenticator_assignedEntity_2_22_10_iv-error_mdht" name="p-UnstructuredDocumentV3_1A_LegalAuthenticator_assignedEntity_2_22_10_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator
			UML root path: /USRealmHeader2/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Unstructured Document (V3) - 2.22.10.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5585, R2.1=CONF:1198-5585)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_10_iv_e-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_10_iv_e-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_10_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::LegalAuthenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Unstructured Document (V3) - 2.22.10.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5597, R2.1=CONF:1198-5597)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_10_iv_d-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_10_iv_d-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_10_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Unstructured Document (V3) - 2.22.10.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5595, R2.1=CONF:1198-5595)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_10_iv_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_10_iv_a-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_10_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.10.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5586, R2.1=CONF:1198-5586)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_ProviderOrganization_2_18_5_i_e-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_ProviderOrganization_2_18_5_i_e-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_ProviderOrganization_2_18_5_i_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: self.id->exists( root='2.16.840.1.113883.4.6' )
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier
		-->
	<assert test="cda:id/@root = '2.16.840.1.113883.4.6'">Error: Unstructured Document (V3) - 2.18.5.i.e ProviderOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:5416, R2.1=CONF:1198-5416)
		Analysis: The id MAY contain zero or one [0..1] @root=&quot;2.16.840.1.113883.4.6&quot; National Provider Identifier
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_10_iv_b-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_10_iv_b-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_10_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Unstructured Document (V3) - 2.22.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Unstructured Document (V3) - 2.22.10.iv.b code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:17000, R2.1=CONF:1198-17000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_10_iv_c-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_10_iv_c-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_10_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Unstructured Document (V3) - 2.22.10.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5589, R2.1=CONF:1198-5589)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-UnstructuredDocumentV3_1A_TEL_use_2_22_10_iv_d_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_TEL_use_2_22_10_iv_d_1-error_mdht" name="p-UnstructuredDocumentV3_1A_TEL_use_2_22_10_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Unstructured Document (V3) - 2.22.10.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:7999, R2.1=CONF:1198-7999)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-UnstructuredDocumentV3_1A_Person_name_2_22_10_iv_e_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Person_name_2_22_10_iv_e_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Person_name_2_22_10_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/legalAuthenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Unstructured Document (V3) - 2.22.10.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5598, R2.1=CONF:1198-5598)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_Authenticator_signatureCode_2_22_11_ii-error_mdht" see="#p-UnstructuredDocumentV3_1A_Authenticator_signatureCode_2_22_11_ii-error_mdht" name="p-UnstructuredDocumentV3_1A_Authenticator_signatureCode_2_22_11_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.signatureCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCodeP
		-->
	<assert test="cda:signatureCode">Error: Unstructured Document (V3) - 2.22.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.signatureCode.oclIsUndefined() and self.signatureCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.signatureCode.oclAsType(datatypes::CS) in 
value.code = 'S'
			Constraint name: GeneralHeaderConstraintsAuthenticatorSignatureCode
		-->
	<assert test="cda:signatureCode and cda:signatureCode[@code = 'S']">Error: Unstructured Document (V3) - 2.22.11.ii signatureCode
		Conformance: SHALL contain exactly one [1..1] signatureCode (CONF:5610, R2.1=CONF:1198-5610)/@code=&quot;S&quot;  (CodeSystem: 2.16.840.1.113883.5.89 Participationsignature) (CONF:5611, R2.1=CONF:1198-5611)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_Authenticator_sDTCSignatureText_2_22_11_iii-error_mdht" see="#p-UnstructuredDocumentV3_1A_Authenticator_sDTCSignatureText_2_22_11_iii-error_mdht" name="p-UnstructuredDocumentV3_1A_Authenticator_sDTCSignatureText_2_22_11_iii-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: ((not self.sDTCSignatureText.oclIsUndefined()) and self.sDTCSignatureText.isNullFlavorUndefined()) implies (not self.sDTCSignatureText.oclIsUndefined())
			Constraint name: USRealmHeader2AuthenticatorSDTCSignatureText
		-->
	<assert test="not(ext:sDTCSignatureText and not(ext:sDTCSignatureText/@nullFlavor)) or ext:sDTCSignatureText">Error: Unstructured Document (V3) - 2.22.11.iii sDTCSignatureText
		Conformance: MAY contain zero or one [0..1] sDTCSignatureText (CONF:1198-30811)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_Authenticator_assignedEntity_2_22_11_iv-error_mdht" see="#p-UnstructuredDocumentV3_1A_Authenticator_assignedEntity_2_22_11_iv-error_mdht" name="p-UnstructuredDocumentV3_1A_Authenticator_assignedEntity_2_22_11_iv-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Unstructured Document (V3) - 2.22.11.iv assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:5612, R2.1=CONF:1198-5612)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-UnstructuredDocumentV3_1A_Authenticator_time_2_22_11_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_Authenticator_time_2_22_11_i-error_mdht" name="p-UnstructuredDocumentV3_1A_Authenticator_time_2_22_11_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator
			UML root path: /USRealmHeader2/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: not self.time.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthenticatorTime
		-->
	<assert test="cda:time">Error: Unstructured Document (V3) - 2.22.11.i time
		Conformance: SHALL contain exactly one [1..1] time (CONF:5608, R2.1=CONF:1198-5608)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_11_iv_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_11_iv_a-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_11_iv_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.11.iv.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:5613, R2.1=CONF:1198-5613)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_11_iv_c-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_11_iv_c-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_11_iv_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Unstructured Document (V3) - 2.22.11.iv.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:5616, R2.1=CONF:1198-5616)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_11_iv_b-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_11_iv_b-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_11_iv_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Unstructured Document (V3) - 2.22.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Unstructured Document (V3) - 2.22.11.iv.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16825, R2.1=CONF:1198-16825), which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:16826, R2.1=CONF:1198-16826)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_11_iv_e-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_11_iv_e-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_11_iv_e-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Authenticator::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Unstructured Document (V3) - 2.22.11.iv.e assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:5624, R2.1=CONF:1198-5624)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_11_iv_d-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_11_iv_d-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_11_iv_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity
			UML root path: /USRealmHeader2/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.telecom->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom
		-->
	<assert test="cda:telecom">Error: Unstructured Document (V3) - 2.22.11.iv.d telecom
		Conformance: SHALL contain at least one [1..*] telecom (CONF:5622, R2.1=CONF:1198-5622)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- TEL -->

<pattern id="p-UnstructuredDocumentV3_1A_TEL_use_2_22_11_iv_d_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_TEL_use_2_22_11_iv_d_1-error_mdht" name="p-UnstructuredDocumentV3_1A_TEL_use_2_22_11_iv_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/telecom
			UML root path: /USRealmHeader2/authenticator/assignedEntity/telecom
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:telecom">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.use->isEmpty()) implies (self.use->size() <= 1) ))
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse
		-->
	<assert test="@nullFlavor or not(@use) or count(@use) &lt;= 1">Error: Unstructured Document (V3) - 2.22.11.iv.d.1 use
		Conformance: SHOULD contain zero or one [0..1] @use (CONF:8000, R2.1=CONF:1198-8000)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-UnstructuredDocumentV3_1A_Person_name_2_22_11_iv_e_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Person_name_2_22_11_iv_e_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Person_name_2_22_11_iv_e_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/authenticator/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Unstructured Document (V3) - 2.22.11.iv.e.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:5625, R2.1=CONF:1198-5625)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_12_i_b-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_12_i_b-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_12_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Unstructured Document (V3) - 2.22.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Unstructured Document (V3) - 2.22.12.i.b code
		Conformance: MAY contain zero or one [0..1] code, which SHALL be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-32174)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_12_i_c-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_12_i_c-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_12_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.addr->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAddr
		-->
	<assert test="cda:addr">Error: Unstructured Document (V3) - 2.22.12.i.c addr
		Conformance: SHALL contain at least one [1..*] addr (CONF:1198-8220)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_12_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_12_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_12_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.12.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9945, R2.1=CONF:1198-9945)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_12_i_d-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_12_i_d-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_12_i_d-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity
			UML root path: /USRealmHeader2/informant/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity">
		<!--
			OCL: self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(consol::GeneralHeaderConstraints::Informant::AssignedEntity::Person))
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityAssignedPerson
		-->
	<assert test="count(cda:assignedPerson)=1">Error: Unstructured Document (V3) - 2.22.12.i.d assignedPerson
		Conformance: SHALL contain exactly one [1..1] assignedPerson (CONF:8221, R2.1=CONF:1198-8221)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Person -->

<pattern id="p-UnstructuredDocumentV3_1A_Person_name_2_22_12_i_d_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Person_name_2_22_12_i_d_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Person_name_2_22_12_i_d_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/assignedEntity/assignedPerson
			UML root path: /USRealmHeader2/informant/assignedEntity/assignedPerson
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:assignedEntity/cda:assignedPerson">
		<!--
			OCL: not self.name->isEmpty()
			Constraint name: GeneralHeaderConstraintsInformantAssignedEntityPersonName
		-->
	<assert test="cda:name">Error: Unstructured Document (V3) - 2.22.12.i.d.1 name
		Conformance: SHALL contain at least one [1..*] name (CONF:8222, CONF:10420, R2.1=CONF:1198-8222)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_RelatedEntity_addr_2_22_12_ii_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_RelatedEntity_addr_2_22_12_ii_a-error_mdht" name="p-UnstructuredDocumentV3_1A_RelatedEntity_addr_2_22_12_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/informant/relatedEntity
			UML root path: /USRealmHeader2/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: (not ((not self.addr->isEmpty()) and self.addr->exists(element | element.isNullFlavorUndefined())))
			Constraint name: GeneralHeaderConstraintsInformantRelatedEntityAddr
		-->
	<assert test="not(cda:addr and cda:addr[not(@nullFlavor)])">Error: Unstructured Document (V3) - 2.22.12.ii.a addr
		Conformance: contain  [0..0] addr
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InFulfillmentOf -->

<pattern id="p-UnstructuredDocumentV3_1A_InFulfillmentOf_order_2_22_13_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_InFulfillmentOf_order_2_22_13_i-error_mdht" name="p-UnstructuredDocumentV3_1A_InFulfillmentOf_order_2_22_13_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf
			UML root path: /USRealmHeader2/inFulfillmentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf">
		<!--
			OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::GeneralHeaderConstraints::InFulfillmentOf::Order))
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrder
		-->
	<assert test="count(cda:order)=1">Error: Unstructured Document (V3) - 2.22.13.i order
		Conformance: SHALL contain exactly one [1..1] order (CONF:9953, R2.1=CONF:1198-9953)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Order -->

<pattern id="p-UnstructuredDocumentV3_1A_Order_id_2_22_13_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_Order_id_2_22_13_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_Order_id_2_22_13_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/inFulfillmentOf/order
			UML root path: /USRealmHeader2/inFulfillmentOf/order
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsInFulfillmentOfOrderId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.13.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9954, R2.1=CONF:1198-9954)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-UnstructuredDocumentV3_2_ComponentOf_encompassingEncounter_2_22_14_i-error_mdht" see="#p-UnstructuredDocumentV3_2_ComponentOf_encompassingEncounter_2_22_14_i-error_mdht" name="p-UnstructuredDocumentV3_2_ComponentOf_encompassingEncounter_2_22_14_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf
			UML root path: /USRealmHeader2/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::USRealmHeader2::ComponentOf::EncompassingEncounter))
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: Unstructured Document (V3) - 2.22.14.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:1198-9956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-UnstructuredDocumentV3_2_EncompassingEncounter_id_2_22_14_i_a-error_mdht" see="#p-UnstructuredDocumentV3_2_EncompassingEncounter_id_2_22_14_i_a-error_mdht" name="p-UnstructuredDocumentV3_2_EncompassingEncounter_id_2_22_14_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.14.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9959, R2.1=CONF:1198-9959)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-UnstructuredDocumentV3_2_EncompassingEncounter_effectiveTime_2_22_14_i_b-error_mdht" see="#p-UnstructuredDocumentV3_2_EncompassingEncounter_effectiveTime_2_22_14_i_b-error_mdht" name="p-UnstructuredDocumentV3_2_EncompassingEncounter_effectiveTime_2_22_14_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Unstructured Document (V3) - 2.22.14.i.b effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:9958, R2.1=CONF:1198-9958)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-UnstructuredDocumentV3_1A_ParticipantSupport_time_2_22_15_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_ParticipantSupport_time_2_22_15_i-error_mdht" name="p-UnstructuredDocumentV3_1A_ParticipantSupport_time_2_22_15_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: Unstructured Document (V3) - 2.22.15.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004, R2.1=CONF:1198-10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-UnstructuredDocumentV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" see="#p-UnstructuredDocumentV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" name="p-UnstructuredDocumentV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: Unstructured Document (V3) - 2.6.21 ParticipantSupport
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: SHALL contain associatedEntity/associatedPerson AND/OR associatedEntity/scopingOrganization
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-UnstructuredDocumentV3_1A_DocumentationOf_serviceEvent_2_22_16_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_DocumentationOf_serviceEvent_2_22_16_i-error_mdht" name="p-UnstructuredDocumentV3_1A_DocumentationOf_serviceEvent_2_22_16_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf
			UML root path: /USRealmHeader2/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::USRealmHeader2::DocumentationOf::ServiceEvent))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: Unstructured Document (V3) - 2.22.16.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:1198-14836)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-UnstructuredDocumentV3_1A_ServiceEvent_effectiveTime_2_22_16_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_ServiceEvent_effectiveTime_2_22_16_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_ServiceEvent_effectiveTime_2_22_16_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent
			UML root path: /USRealmHeader2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: Unstructured Document (V3) - 2.22.16.i.a effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:14837, R2.1=CONF:1198-14837)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-UnstructuredDocumentV3_1A_ServiceEvent_performer_2_22_16_i_b-error_mdht" see="#p-UnstructuredDocumentV3_1A_ServiceEvent_performer_2_22_16_i_b-error_mdht" name="p-UnstructuredDocumentV3_1A_ServiceEvent_performer_2_22_16_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent
			UML root path: /USRealmHeader2/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::USRealmHeader2::DocumentationOf::ServiceEvent::Performer1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: Unstructured Document (V3) - 2.22.16.i.b performer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:1198-14839)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-UnstructuredDocumentV3_1A_Performer1_typeCode_2_22_16_i_b_1-error_mdht" see="#p-UnstructuredDocumentV3_1A_Performer1_typeCode_2_22_16_i_b_1-error_mdht" name="p-UnstructuredDocumentV3_1A_Performer1_typeCode_2_22_16_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: isDefined('typeCode')
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode
		-->
	<assert test="attribute::node()[name() = 'typeCode']">Error: Unstructured Document (V3) - 2.22.16.i.b.1 typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode (CONF:14840, R2.1=CONF:1198-14840)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-UnstructuredDocumentV3_1A_Performer1_functionCode_2_22_16_i_b_2-error_mdht" see="#p-UnstructuredDocumentV3_1A_Performer1_functionCode_2_22_16_i_b_2-error_mdht" name="p-UnstructuredDocumentV3_1A_Performer1_functionCode_2_22_16_i_b_2-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode">Error: Unstructured Document (V3) - 2.22.16.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:1198-16818), which SHOULD be selected from ValueSet ParticipationFunction 2.16.840.1.113883.1.11.10267 STATIC 2014-09-01 (CONF:1198-32889)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.88' and (value.code = 'ADMPHYS' or value.code = 'ANEST' or value.code = 'ANRS' or value.code = 'ATTPHYS' or value.code = 'DISPHYS' or value.code = 'FASST' or value.code = 'MDWF' or value.code = 'NASST' or value.code = 'PCP' or value.code = 'PRISURG' or value.code = 'RNDPHYS' or value.code = 'SASST' or value.code = 'SNRS' or value.code = 'TASST'))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode and cda:functionCode[@codeSystem = '2.16.840.1.113883.5.88' and (@code = 'ADMPHYS' or @code = 'ANEST' or @code = 'ANRS' or @code = 'ATTPHYS' or @code = 'DISPHYS' or @code = 'FASST' or @code = 'MDWF' or @code = 'NASST' or @code = 'PCP' or @code = 'PRISURG' or @code = 'RNDPHYS' or @code = 'SASST' or @code = 'SNRS' or @code = 'TASST')]">Error: Unstructured Document (V3) - 2.22.16.i.b.2 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode (CONF:1198-16818), which SHOULD be selected from ValueSet ParticipationFunction 2.16.840.1.113883.1.11.10267 STATIC 2014-09-01 (CONF:1198-32889)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer1 -->

<pattern id="p-UnstructuredDocumentV3_1A_Performer1_assignedEntity_2_22_16_i_b_3-error_mdht" see="#p-UnstructuredDocumentV3_1A_Performer1_assignedEntity_2_22_16_i_b_3-error_mdht" name="p-UnstructuredDocumentV3_1A_Performer1_assignedEntity_2_22_16_i_b_3-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeader2::DocumentationOf::ServiceEvent::Performer1::AssignedEntity))
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: Unstructured Document (V3) - 2.22.16.i.b.3 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-14841)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_16_i_b_3_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_16_i_b_3_i-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_16_i_b_3_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId
		-->
	<assert test="cda:id">Error: Unstructured Document (V3) - 2.22.16.i.b.3.i id
		Conformance: SHALL contain at least one [1..*] id (CONF:14846, R2.1=CONF:1198-14846)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_16_i_b_3_ii-error_mdht" see="#p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_16_i_b_3_ii-error_mdht" name="p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_16_i_b_3_ii-error_mdht">
		<!--
			UML path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /USRealmHeader2/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Unstructured Document (V3) - 2.22.16.i.b.3.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-14842)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.6.101' and @code]">Error: Unstructured Document (V3) - 2.22.16.i.b.3.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Healthcare Provider Taxonomy (HIPAA) 2.16.840.1.114222.4.11.1066 DYNAMIC (CONF:1198-14842)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-UnstructuredDocumentV3_1A_Authorization_consent_2_22_17_i-error_mdht" see="#p-UnstructuredDocumentV3_1A_Authorization_consent_2_22_17_i-error_mdht" name="p-UnstructuredDocumentV3_1A_Authorization_consent_2_22_17_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization
			UML root path: /USRealmHeader2/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::GeneralHeaderConstraints::Authorization::Consent))
			Constraint name: GeneralHeaderConstraintsAuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: Unstructured Document (V3) - 2.22.17.i consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:16793, R2.1=CONF:1198-16793)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-UnstructuredDocumentV3_1A_Consent_statusCode_2_22_17_i_c-error_mdht" see="#p-UnstructuredDocumentV3_1A_Consent_statusCode_2_22_17_i_c-error_mdht" name="p-UnstructuredDocumentV3_1A_Consent_statusCode_2_22_17_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCodeP
		-->
	<assert test="cda:statusCode">Error: Unstructured Document (V3) - 2.22.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: Unstructured Document (V3) - 2.22.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-UnstructuredDocumentV3_1A_Consent_id_2_22_17_i_a-error_mdht" see="#p-UnstructuredDocumentV3_1A_Consent_id_2_22_17_i_a-error_mdht" name="p-UnstructuredDocumentV3_1A_Consent_id_2_22_17_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: Unstructured Document (V3) - 2.22.17.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:16794, R2.1=CONF:1198-16794)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-UnstructuredDocumentV3_1A_Consent_code_2_22_17_i_b-error_mdht" see="#p-UnstructuredDocumentV3_1A_Consent_code_2_22_17_i_b-error_mdht" name="p-UnstructuredDocumentV3_1A_Consent_code_2_22_17_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: Unstructured Document (V3) - 2.22.17.i.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16795, R2.1=CONF:1198-16795)
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
	<assert test="/cda:ClinicalDocument/cda:custodian">Cannot find context /cda:ClinicalDocument/cda:custodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian</assert>
	<assert test="/cda:ClinicalDocument/cda:component">Cannot find context /cda:ClinicalDocument/cda:component</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:nonXMLBody">Cannot find context /cda:ClinicalDocument/cda:component/cda:nonXMLBody</assert>
	<assert test="/cda:ClinicalDocument/cda:component/cda:nonXMLBody/cda:text">Cannot find context /cda:ClinicalDocument/cda:component/cda:nonXMLBody/cda:text</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer">Cannot find context /cda:ClinicalDocument/cda:dataEnterer</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:addr</assert>
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

	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_setId_2_22_10-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_inFulfillmentOf_2_22_13-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_versionNumber_2_22_11-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informant_2_22_12-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_informationRecipient_2_22_9-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_templateId_2_22_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_component_2_22_5-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_documentationOf_2_22_16-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_typeId_2_22_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_title_2_22_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_legalAuthenticator_2_22_10-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authenticator_2_22_11-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_effectiveTime_2_22_7-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_supportParticipant_2_22_15-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_recordTarget_2_22_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_custodian_2_22_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_author_2_22_7-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_UnstructuredDocumentV3_componentOf_2_22_14-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_id_2_22_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_languageCode_2_22_9-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_realmCode_2_22_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_code_2_22_5-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_authorization_2_22_17-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_confidentialityCode_2_22_8-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_UnstructuredDocumentV3_dataEnterer_2_22_6-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_RecordTarget_patientRole_2_22_3_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_PatientRole_id_2_22_3_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Custodian_assignedCustodian_2_22_4_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedCustodian_representedCustodianOrganization_2_22_4_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_Component_nonXMLBody_2_22_5_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_NonXMLBody_text_2_22_5_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_ED_mediaType_2_22_5_i_a_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_DataEnterer_assignedEntity_2_22_6_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_6_i_d-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_6_i_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_6_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_6_i_e-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_6_i_d-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_USRealmAddress_GeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet_2_18_5_i_b_7-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_USRealmAddress_country_4_4_6_iii_b_2-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_USRealmAddress_streetAddressLine_4_4_6_iii_b_6-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_USRealmAddress_use_4_4_6_iii_b_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_USRealmAddress_state_4_4_6_iii_b_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_USRealmAddress_postalCode_4_4_6_iii_b_5-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_USRealmAddress_city_4_4_6_iii_b_4-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_TEL_use_2_22_6_i_d_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Person_name_2_22_6_i_e_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Author_time_2_22_7_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Author_assignedAuthor_2_22_7_ii-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedAuthor_telecom_2_22_7_ii_d-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedAuthor_id_2_22_7_ii_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedAuthor_addr_2_22_7_ii_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedAuthor_code_2_22_7_ii_d-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AuthoringDevice_softwareName_2_22_7_ii_e_2-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AuthoringDevice_manufacturerModelName_2_22_7_ii_e_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_TEL_use_2_22_7_ii_d_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Person_name_2_22_7_ii_f_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_InformationRecipient_intendedRecipient_2_22_9_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_IntendedRecipient_recievedOrganization_2_22_9_i_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_IntendedRecipient_id_2_22_9_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_IntendedRecipient_informationRecipient_2_22_9_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Person_name_2_22_9_i_b_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Organization_name_2_22_9_i_c_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_LegalAuthenticator_time_2_22_10_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_LegalAuthenticator_signatureCode_2_22_10_ii-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_LegalAuthenticator_sDTCSignatureText_2_22_10_iii-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_LegalAuthenticator_assignedEntity_2_22_10_iv-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_10_iv_e-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_10_iv_d-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_10_iv_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_ProviderOrganization_2_18_5_i_e-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_10_iv_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_10_iv_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_TEL_use_2_22_10_iv_d_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Person_name_2_22_10_iv_e_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Authenticator_signatureCode_2_22_11_ii-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Authenticator_sDTCSignatureText_2_22_11_iii-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Authenticator_assignedEntity_2_22_11_iv-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Authenticator_time_2_22_11_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_11_iv_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_11_iv_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_11_iv_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_11_iv_e-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_telecom_2_22_11_iv_d-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_TEL_use_2_22_11_iv_d_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Person_name_2_22_11_iv_e_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_12_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_addr_2_22_12_i_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_12_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_assignedPerson_2_22_12_i_d-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Person_name_2_22_12_i_d_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_RelatedEntity_addr_2_22_12_ii_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_InFulfillmentOf_order_2_22_13_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Order_id_2_22_13_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_ComponentOf_encompassingEncounter_2_22_14_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_EncompassingEncounter_id_2_22_14_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_2_EncompassingEncounter_effectiveTime_2_22_14_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_ParticipantSupport_time_2_22_15_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_DocumentationOf_serviceEvent_2_22_16_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_ServiceEvent_effectiveTime_2_22_16_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_ServiceEvent_performer_2_22_16_i_b-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Performer1_typeCode_2_22_16_i_b_1-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Performer1_functionCode_2_22_16_i_b_2-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Performer1_assignedEntity_2_22_16_i_b_3-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_id_2_22_16_i_b_3_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_AssignedEntity_code_2_22_16_i_b_3_ii-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Authorization_consent_2_22_17_i-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Consent_statusCode_2_22_17_i_c-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Consent_id_2_22_17_i_a-error_mdht"/>
	<active pattern = "p-UnstructuredDocumentV3_1A_Consent_code_2_22_17_i_b-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
