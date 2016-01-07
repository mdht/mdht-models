<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE schema [
]>

<schema xmlns="http://www.ascc.net/xml/schematron" xmlns:cda="urn:hl7-org:v3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<title>Schematron schema for validating conformance to CONSOL documents</title>
<ns prefix="cda" uri="urn:hl7-org:v3"/>
<ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

<ns prefix="ext" uri="http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0"/>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authenticator_2_24_10-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authenticator_2_24_10-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authenticator_2_24_10-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authenticator->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthenticator
		-->
	<assert test="count(cda:authenticator) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.10 authenticator
		Conformance: MAY contain zero or more [0..*] authenticator (CONF:1198-28699)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_supportParticipant_2_24_15-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_supportParticipant_2_24_15-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_supportParticipant_2_24_15-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: GeneralHeaderConstraintsSupportParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.15 supportParticipant
		Conformance: MAY contain zero or more [0..*] participant (CONF:1198-10003)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_recordTarget_2_24_3-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_recordTarget_2_24_3-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_recordTarget_2_24_3-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTarget
		-->
	<assert test="count(cda:recordTarget)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3 recordTarget
		Conformance: SHALL contain exactly one [1..1] recordTarget (CONF:1198-28460)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_2_USRealmHeader-PatientGeneratedDocumentV2_componentOf_2_24_14-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_2_USRealmHeader-PatientGeneratedDocumentV2_componentOf_2_24_14-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_2_USRealmHeader-PatientGeneratedDocumentV2_componentOf_2_24_14-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.componentOf->select(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))->size() <= 1
			Constraint name: GeneralHeaderConstraintsComponentOf
		-->
	<assert test="count(cda:componentOf) &lt;= 1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.14 componentOf
		Conformance: MAY contain zero or one [0..1] componentOf (CONF:1198-9955)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_setId_2_24_10-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_setId_2_24_10-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_setId_2_24_10-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.setId.oclIsUndefined()) and self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsSetId
		-->
	<assert test="not(cda:setId and not(cda:setId/@nullFlavor)) or cda:setId">Error: US Realm Header - Patient Generated Document (V2) - 2.24.10 setId
		Conformance: MAY contain zero or one [0..1] setId (CONF:5261, R2.1=CONF:1198-5261)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_inFulfillmentOf_2_24_12-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_inFulfillmentOf_2_24_12-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_inFulfillmentOf_2_24_12-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.inFulfillmentOf->select(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentInFulfillmentOf
		-->
	<assert test="count(cda:inFulfillmentOf) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.12 inFulfillmentOf
		Conformance: MAY contain zero or more [0..*] inFulfillmentOf (CONF:1198-28707)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_documentationOf_2_24_13-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_documentationOf_2_24_13-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_documentationOf_2_24_13-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.documentationOf->select(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOf
		-->
	<assert test="count(cda:documentationOf) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13 documentationOf
		Conformance: MAY contain zero or more [0..*] documentationOf (CONF:1198-28710)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_code_2_24_5-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_code_2_24_5-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_code_2_24_5-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsCode
		-->
	<assert test="cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.5 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:5253, R2.1=CONF:1198-5253)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_legalAuthenticator_2_24_9-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_legalAuthenticator_2_24_9-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_legalAuthenticator_2_24_9-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.legalAuthenticator->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->size() <= 1
			Constraint name: USRealmHeaderPatientGeneratedDocumentLegalAuthenticator
		-->
	<assert test="count(cda:legalAuthenticator) &lt;= 1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9 legalAuthenticator
		Conformance: MAY contain zero or one [0..1] legalAuthenticator (CONF:1198-28694)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_typeId_2_24_3-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_typeId_2_24_3-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_typeId_2_24_3-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.typeId.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTypeId
		-->
	<assert test="cda:typeId">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3 typeId
		Conformance: SHALL contain exactly one [1..1] typeId (CONF:5361, R2.1=CONF:1198-5361)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_confidentialityCode_2_24_8-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_confidentialityCode_2_24_8-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_confidentialityCode_2_24_8-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsConfidentialityCodeP
		-->
	<assert test="cda:confidentialityCode">Error: US Realm Header - Patient Generated Document (V2) - 2.24.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V')
			Constraint name: GeneralHeaderConstraintsConfidentialityCode
		-->
	<assert test="cda:confidentialityCode and cda:confidentialityCode[@codeSystem = '2.16.840.1.113883.5.25' and (@code = 'N' or @code = 'R' or @code = 'V')]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.8 confidentialityCode
		Conformance: SHALL contain exactly one [1..1] confidentialityCode, which SHOULD be selected from ValueSet HL7 BasicConfidentialityKind 2.16.840.1.113883.1.11.16926 STATIC 2010-04-21 (CONF:5259, R2.1=CONF:1198-5259)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_languageCode_2_24_9-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_languageCode_2_24_9-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_languageCode_2_24_9-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
not value.code.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCode
		-->
	<assert test="cda:languageCode and cda:languageCode[@code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.languageCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsLanguageCodeP
		-->
	<assert test="cda:languageCode">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9 languageCode
		Conformance: SHALL contain exactly one [1..1] languageCode, which SHALL be selected from ValueSet Language 2.16.840.1.113883.1.11.11526 DYNAMIC (CONF:5372, R2.1=CONF:1198-5372)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_custodian_2_24_7-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_custodian_2_24_7-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_custodian_2_24_7-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
			Constraint name: USRealmHeaderPatientGeneratedDocumentCustodian
		-->
	<assert test="count(cda:custodian)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.7 custodian
		Conformance: SHALL contain exactly one [1..1] custodian (CONF:1198-28685)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_participant_2_24_11-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_participant_2_24_11-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_participant_2_24_11-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentParticipant
		-->
	<assert test="count(cda:participant) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.11 participant
		Conformance: MAY contain zero or more [0..*] participant (CONF:1198-28703)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_title_2_24_4-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_title_2_24_4-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_title_2_24_4-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.title.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsTitle
		-->
	<assert test="cda:title">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4 title
		Conformance: SHALL contain exactly one [1..1] title (CONF:1198-5254)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informationRecipient_2_24_8-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informationRecipient_2_24_8-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informationRecipient_2_24_8-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informationRecipient->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformationRecipient
		-->
	<assert test="count(cda:informationRecipient) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.8 informationRecipient
		Conformance: MAY contain zero or more [0..*] informationRecipient (CONF:1198-28690)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_dataEnterer_2_24_5-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_dataEnterer_2_24_5-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_dataEnterer_2_24_5-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.dataEnterer->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->size() <= 1
			Constraint name: USRealmHeaderPatientGeneratedDocumentDataEnterer
		-->
	<assert test="count(cda:dataEnterer) &lt;= 1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.5 dataEnterer
		Conformance: MAY contain zero or one [0..1] dataEnterer (CONF:1198-28678)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_id_2_24_4-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_id_2_24_4-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_id_2_24_4-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.id.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4 id
		Conformance: SHALL contain exactly one [1..1] id (CONF:5363, R2.1=CONF:1198-5363)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_author_2_24_4-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_author_2_24_4-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_author_2_24_4-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthor
		-->
	<assert test="cda:author">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4 author
		Conformance: SHALL contain at least one [1..*] author (CONF:1198-28477)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authorization_2_24_17-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authorization_2_24_17-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authorization_2_24_17-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.authorization->select(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))->size() >= 0
			Constraint name: GeneralHeaderConstraintsAuthorization
		-->
	<assert test="count(cda:authorization) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.17 authorization
		Conformance: MAY contain zero or more [0..*] authorization (CONF:1198-16792)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_templateId_2_24_1-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_templateId_2_24_1-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_templateId_2_24_1-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.29.1' and id.extension = '2015-08-01')
			Constraint name: GeneralHeaderConstraintsTemplateId
		-->
	<assert test="cda:templateId/@root = '2.16.840.1.113883.10.20.29.1' and @extension = '2015-08-01'">Error: US Realm Header - Patient Generated Document (V2) - 2.24.1 templateId
		Conformance: SHALL contain exactly one [1..1] templateId ( CONF:1198-28458, CONF:1198-28459, CONF:1198-32917 ) such that it SHALL contain exactly one [1..1] @root=&quot;2.16.840.1.113883.10.20.29.1&quot; SHALL contain exactly one [1..1] @extension=&quot;2015-08-01&quot;
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_effectiveTime_2_24_7-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_effectiveTime_2_24_7-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_effectiveTime_2_24_7-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: US Realm Header - Patient Generated Document (V2) - 2.24.7 effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:5256, R2.1=CONF:1198-5256)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_realmCode_2_24_3-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_realmCode_2_24_3-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_realmCode_2_24_3-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: true
			Constraint name: GeneralHeaderConstraintsRealmCodeP
		-->
	<assert test="true()">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
value.code = 'US')
			Constraint name: GeneralHeaderConstraintsRealmCode
		-->
	<assert test="count(cda:realmCode) = 1 and not(cda:realmCode[not(. and @code = 'US')])">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3 realmCode
		Conformance: SHALL contain exactly one [1..1] realmCode/@code=&quot;US&quot;  (CONF:1198-16791)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informant_2_24_6-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informant_2_24_6-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informant_2_24_6-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformant
		-->
	<assert test="count(cda:informant) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.6 informant
		Conformance: MAY contain zero or more [0..*] informant (CONF:1198-28681)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- USRealmHeaderPatientGeneratedDocument: 2.16.840.1.113883.10.20.29.1 -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_versionNumber_2_24_11-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_versionNumber_2_24_11-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_versionNumber_2_24_11-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument
			UML root path: /USRealmHeaderPatientGeneratedDocument
		-->
	<rule context="/cda:ClinicalDocument">
		<!--
			OCL: ((not self.versionNumber.oclIsUndefined()) and self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsVersionNumber
		-->
	<assert test="not(cda:versionNumber and not(cda:versionNumber/@nullFlavor)) or cda:versionNumber">Error: US Realm Header - Patient Generated Document (V2) - 2.24.11 versionNumber
		Conformance: MAY contain zero or one [0..1] versionNumber (CONF:5264, R2.1=CONF:1198-5264)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RecordTarget -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_RecordTarget_patientRole_2_24_3_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_RecordTarget_patientRole_2_24_3_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_RecordTarget_patientRole_2_24_3_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget">
		<!--
			OCL: self.patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::RecordTarget::PatientRole))
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole
		-->
	<assert test="count(cda:patientRole)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i patientRole
		Conformance: SHALL contain exactly one [1..1] patientRole (CONF:1198-28461)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_providerOrganization_2_24_3_i_c-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_providerOrganization_2_24_3_i_c-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_providerOrganization_2_24_3_i_c-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.providerOrganization->select(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(cda::Organization))->size() <= 1
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization
		-->
	<assert test="count(cda:providerOrganization) &lt;= 1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.c providerOrganization
		Conformance: MAY contain zero or one [0..1] providerOrganization (CONF:1198-28476)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_patient_2_24_3_i_b-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_patient_2_24_3_i_b-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_patient_2_24_3_i_b-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: self.patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::RecordTarget::PatientRole::Patient))
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient
		-->
	<assert test="count(cda:patient)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b patient
		Conformance: SHALL contain exactly one [1..1] patient (CONF:1198-28465)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- PatientRole -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_id_2_24_3_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_id_2_24_3_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_id_2_24_3_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-28462)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_LanguageCommunication_2_24_3_i_b_2-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_LanguageCommunication_2_24_3_i_b_2-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_LanguageCommunication_2_24_3_i_b_2-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: languageCommunication->size() > 1 implies languageCommunication->one( langCom : cda::LanguageCommunication | langCom.preferenceInd.value)
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm
		-->
	<assert test="not(count(cda:languageCommunication) &gt; 1) or count(cda:languageCommunication[cda:preferenceInd/@value])=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b.2 LanguageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:1198-28474)
		Analysis: If more than one languageCommunication is present, only one languageCommunication element SHALL have a preferenceInd with a value of 1
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_languageCommunication_2_24_3_i_b_2-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_languageCommunication_2_24_3_i_b_2-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_languageCommunication_2_24_3_i_b_2-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.languageCommunication->select(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::RecordTarget::PatientRole::Patient::LanguageCommunication))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication
		-->
	<assert test="count(cda:languageCommunication) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b.2 languageCommunication
		Conformance: SHOULD contain zero or more [0..*] languageCommunication (CONF:1198-28474)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Patient -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_guardian_2_24_3_i_b_1-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_guardian_2_24_3_i_b_1-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_guardian_2_24_3_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">
		<!--
			OCL: self.guardian->select(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::RecordTarget::PatientRole::Patient::Guardian))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian
		-->
	<assert test="count(cda:guardian) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b.1 guardian
		Conformance: MAY contain zero or more [0..*] guardian (CONF:1198-28469)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_code_2_24_3_i_b_1_ii-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_code_2_24_3_i_b_1_ii-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_code_2_24_3_i_b_1_ii-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b.1.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28473)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b.1.ii code
		Conformance: SHOULD contain zero or one [0..1] code, which SHALL be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28473)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Guardian -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_id_2_24_3_i_b_1_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_id_2_24_3_i_b_1_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_id_2_24_3_i_b_1_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient/guardian
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient/guardian
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b.1.i id
		Conformance: SHOULD contain zero or more [0..*] id (CONF:1198-28470)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LanguageCommunication -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_LanguageCommunication_preferenceInd_2_24_3_i_b_2_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_LanguageCommunication_preferenceInd_2_24_3_i_b_2_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_LanguageCommunication_preferenceInd_2_24_3_i_b_2_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient/languageCommunication
			UML root path: /USRealmHeaderPatientGeneratedDocument/recordTarget/patientRole/patient/languageCommunication
		-->
	<rule context="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">
		<!--
			OCL: ((not self.preferenceInd.oclIsUndefined()) and self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd
		-->
	<assert test="not(cda:preferenceInd and not(cda:preferenceInd/@nullFlavor)) or cda:preferenceInd">Error: US Realm Header - Patient Generated Document (V2) - 2.24.3.i.b.2.i preferenceInd
		Conformance: MAY contain zero or one [0..1] preferenceInd (CONF:1198-28475)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Author -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Author_assignedAuthor_2_24_4_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Author_assignedAuthor_2_24_4_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Author_assignedAuthor_2_24_4_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/author
			UML root path: /USRealmHeaderPatientGeneratedDocument/author
		-->
	<rule context="/cda:ClinicalDocument/cda:author">
		<!--
			OCL: self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::Author::AssignedAuthor))
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor
		-->
	<assert test="count(cda:assignedAuthor)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4.i assignedAuthor
		Conformance: SHALL contain exactly one [1..1] assignedAuthor (CONF:1198-28478)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_id_2_24_4_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_id_2_24_4_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_id_2_24_4_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor
			UML root path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-28479)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedAuthor -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_code_2_24_4_i_b-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_code_2_24_4_i_b-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_code_2_24_4_i_b-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor
			UML root path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4.i.b code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:1198-28481)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CE -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_4_i_b_1-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_4_i_b_1-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_4_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor/code
			UML root path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor/code
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:code">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies (not self.code.oclIsUndefined() ))
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode
		-->
	<assert test="@nullFlavor or @code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4.i.b.1 code
		Conformance: SHALL contain exactly one [1..1] code (CONF:1198-28676)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CE -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology_2_24_4_i_b_2-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology_2_24_4_i_b_2-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology_2_24_4_i_b_2-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor/code
			UML root path: /USRealmHeaderPatientGeneratedDocument/author/assignedAuthor/code
		-->
	<rule context="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:code">
		<!--
			OCL: isNullFlavorUndefined() implies (codeSystem = '2.16.840.1.113883.5.111')
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology
		-->
	<assert test="@nullFlavor or @codeSystem = '2.16.840.1.113883.5.111'">Error: US Realm Header - Patient Generated Document (V2) - 2.24.4.i.b.2 USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology
		Conformance: The code/@code SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 (CONF:1198-28676)
		Analysis: The code/@code SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DataEnterer -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_DataEnterer_assignedEntity_2_24_5_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_DataEnterer_assignedEntity_2_24_5_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_DataEnterer_assignedEntity_2_24_5_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/dataEnterer
			UML root path: /USRealmHeaderPatientGeneratedDocument/dataEnterer
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::DataEnterer::AssignedEntity))
			Constraint name: USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.5.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-28679)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_5_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_5_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_5_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/dataEnterer/assignedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/dataEnterer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.5.i.a code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28680)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.5.i.a code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28680)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Informant -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_relatedEntity_2_24_6_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_relatedEntity_2_24_6_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_relatedEntity_2_24_6_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/informant
			UML root path: /USRealmHeaderPatientGeneratedDocument/informant
		-->
	<rule context="/cda:ClinicalDocument/cda:informant">
		<!--
			OCL: self.relatedEntity->select(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::Informant::RelatedEntity))->size() <= 1
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformantRelatedEntity
		-->
	<assert test="count(cda:relatedEntity) &lt;= 1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.6.i relatedEntity
		Conformance: MAY contain zero or one [0..1] relatedEntity
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Informant -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity_2_24_6_ii-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity_2_24_6_ii-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity_2_24_6_ii-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/informant
			UML root path: /USRealmHeaderPatientGeneratedDocument/informant
		-->
	<rule context="/cda:ClinicalDocument/cda:informant">
		<!--
			OCL: relatedEntity->one(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(cda::RelatedEntity)) xor assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity
		-->
	<assert test="count(cda:relatedEntity)=1 or count(cda:assignedEntity)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.6.ii USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity
		Conformance: if present, SHALL contain exactly one [1..1] relatedEntity OR exactly one assignedEntity (CONF:1198-28682)
		Analysis: if present, SHALL contain exactly one [1..1] relatedEntity OR exactly one assignedEntity
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RelatedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_RelatedEntity_code_2_24_6_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_RelatedEntity_code_2_24_6_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_RelatedEntity_code_2_24_6_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/informant/relatedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/informant/relatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.6.i.a code
		Conformance: MAY contain zero or one [0..1] code (CONF:1198-28683), which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28684)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.6.i.a code
		Conformance: MAY contain zero or one [0..1] code (CONF:1198-28683), which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28684)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Custodian -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Custodian_assignedCustodian_2_24_7_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Custodian_assignedCustodian_2_24_7_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Custodian_assignedCustodian_2_24_7_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/custodian
			UML root path: /USRealmHeaderPatientGeneratedDocument/custodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian">
		<!--
			OCL: self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::Custodian::AssignedCustodian))
			Constraint name: USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian
		-->
	<assert test="count(cda:assignedCustodian)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.7.i assignedCustodian
		Conformance: SHALL contain exactly one [1..1] assignedCustodian (CONF:1198-28686)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedCustodian -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedCustodian_representedCustodianOrganization_2_24_7_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedCustodian_representedCustodianOrganization_2_24_7_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedCustodian_representedCustodianOrganization_2_24_7_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/custodian/assignedCustodian
			UML root path: /USRealmHeaderPatientGeneratedDocument/custodian/assignedCustodian
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">
		<!--
			OCL: self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::Custodian::AssignedCustodian::RepresentedCustodianOrganization))
			Constraint name: USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization
		-->
	<assert test="count(cda:representedCustodianOrganization)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.7.i.a representedCustodianOrganization
		Conformance: SHALL contain exactly one [1..1] representedCustodianOrganization (CONF:1198-28687)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- RepresentedCustodianOrganization -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_RepresentedCustodianOrganization_id_2_24_7_i_a_1-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_RepresentedCustodianOrganization_id_2_24_7_i_a_1-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_RepresentedCustodianOrganization_id_2_24_7_i_a_1-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/custodian/assignedCustodian/representedCustodianOrganization
			UML root path: /USRealmHeaderPatientGeneratedDocument/custodian/assignedCustodian/representedCustodianOrganization
		-->
	<rule context="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.7.i.a.1 id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-28688)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InformationRecipient -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_InformationRecipient_intendedRecipient_2_24_8_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_InformationRecipient_intendedRecipient_2_24_8_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_InformationRecipient_intendedRecipient_2_24_8_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/informationRecipient
			UML root path: /USRealmHeaderPatientGeneratedDocument/informationRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient">
		<!--
			OCL: self.intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::InformationRecipient::IntendedRecipient))
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient
		-->
	<assert test="count(cda:intendedRecipient)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.8.i intendedRecipient
		Conformance: SHALL contain exactly one [1..1] intendedRecipient (CONF:1198-28691)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- IntendedRecipient -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_IntendedRecipient_id_2_24_8_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_IntendedRecipient_id_2_24_8_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_IntendedRecipient_id_2_24_8_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/informationRecipient/intendedRecipient
			UML root path: /USRealmHeaderPatientGeneratedDocument/informationRecipient/intendedRecipient
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.8.i.a id
		Conformance: SHOULD contain zero or more [0..*] id (CONF:1198-28692)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- II -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_II_root_2_24_8_i_a_1-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_II_root_2_24_8_i_a_1-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_II_root_2_24_8_i_a_1-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/informationRecipient/intendedRecipient/id
			UML root path: /USRealmHeaderPatientGeneratedDocument/informationRecipient/intendedRecipient/id
		-->
	<rule context="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:id">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.root.oclIsUndefined()) implies (not self.root.oclIsUndefined()) ))
			Constraint name: USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot
		-->
	<assert test="@nullFlavor or not(@root) or @root">Error: US Realm Header - Patient Generated Document (V2) - 2.24.8.i.a.1 root
		Conformance: SHOULD contain zero or one [0..1] root (CONF:1198-28693)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- LegalAuthenticator -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_LegalAuthenticator_assignedEntity_2_24_9_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_LegalAuthenticator_assignedEntity_2_24_9_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_LegalAuthenticator_assignedEntity_2_24_9_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator
			UML root path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::LegalAuthenticator::AssignedEntity))
			Constraint name: USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-28695)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_9_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_9_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_9_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-28696)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_9_i_b-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_9_i_b-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_9_i_b-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9.i.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:1198-28697)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CE -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_9_i_b_1-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_9_i_b_1-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_9_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity/code
			UML root path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity/code
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:code">
		<!--
			OCL:  ( self.isNullFlavorUndefined() implies ((not self.code.oclIsUndefined()) implies (not self.code.oclIsUndefined()) ))
			Constraint name: USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode
		-->
	<assert test="@nullFlavor or not(@code) or @code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9.i.b.1 code
		Conformance: MAY contain zero or one [0..1] code (CONF:1198-28698)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- CE -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology_2_24_9_i_b_2-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology_2_24_9_i_b_2-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology_2_24_9_i_b_2-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity/code
			UML root path: /USRealmHeaderPatientGeneratedDocument/legalAuthenticator/assignedEntity/code
		-->
	<rule context="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:code">
		<!--
			OCL: isNullFlavorUndefined() implies (codeSystem = '2.16.840.1.113883.5.111')
			Constraint name: USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology
		-->
	<assert test="@nullFlavor or @codeSystem = '2.16.840.1.113883.5.111'">Error: US Realm Header - Patient Generated Document (V2) - 2.24.9.i.b.2 USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology
		Conformance: The code/@code SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 (CONF:1198-28698)
		Analysis: The code/@code SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authenticator -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authenticator_assignedEntity_2_24_10_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authenticator_assignedEntity_2_24_10_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authenticator_assignedEntity_2_24_10_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/authenticator
			UML root path: /USRealmHeaderPatientGeneratedDocument/authenticator
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::Authenticator::AssignedEntity))
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.10.i assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-28700)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_10_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_10_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_10_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/authenticator/assignedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.10.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-28701)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_10_i_b-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_10_i_b-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_10_i_b-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/authenticator/assignedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/authenticator/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.10.i.b code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28702)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.10.i.b code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28702)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Participant -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_typeCode_2_24_11_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_typeCode_2_24_11_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_typeCode_2_24_11_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/participant
			UML root path: /USRealmHeaderPatientGeneratedDocument/participant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: isDefined('typeCode')
			Constraint name: USRealmHeaderPatientGeneratedDocumentParticipantTypeCode
		-->
	<assert test="attribute::node()[name() = 'typeCode']">Error: US Realm Header - Patient Generated Document (V2) - 2.24.11.i typeCode
		Conformance: SHALL contain exactly one [1..1] @typeCode (CONF:1198-28704)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Participant -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_associatedEntity_2_24_11_ii-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_associatedEntity_2_24_11_ii-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_associatedEntity_2_24_11_ii-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/participant
			UML root path: /USRealmHeaderPatientGeneratedDocument/participant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::Participant::AssociatedEntity))
			Constraint name: USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity
		-->
	<assert test="count(cda:associatedEntity)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.11.ii associatedEntity
		Conformance: SHALL contain exactly one [1..1] associatedEntity (CONF:1198-28705)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssociatedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssociatedEntity_code_2_24_11_ii_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssociatedEntity_code_2_24_11_ii_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssociatedEntity_code_2_24_11_ii_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/participant/associatedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/participant/associatedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.11.ii.a code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28706)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.11.ii.a code
		Conformance: SHOULD contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28706)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- InFulfillmentOf -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_InFulfillmentOf_order_2_24_12_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_InFulfillmentOf_order_2_24_12_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_InFulfillmentOf_order_2_24_12_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/inFulfillmentOf
			UML root path: /USRealmHeaderPatientGeneratedDocument/inFulfillmentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf">
		<!--
			OCL: self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::InFulfillmentOf::Order))
			Constraint name: USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder
		-->
	<assert test="count(cda:order)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.12.i order
		Conformance: SHALL contain exactly one [1..1] order (CONF:1198-28708)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Order -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Order_id_2_24_12_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Order_id_2_24_12_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Order_id_2_24_12_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/inFulfillmentOf/order
			UML root path: /USRealmHeaderPatientGeneratedDocument/inFulfillmentOf/order
		-->
	<rule context="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.12.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-28709)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- DocumentationOf -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_DocumentationOf_serviceEvent_2_24_13_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_DocumentationOf_serviceEvent_2_24_13_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_DocumentationOf_serviceEvent_2_24_13_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/documentationOf
			UML root path: /USRealmHeaderPatientGeneratedDocument/documentationOf
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf">
		<!--
			OCL: self.serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::DocumentationOf::ServiceEvent))
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent
		-->
	<assert test="count(cda:serviceEvent)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i serviceEvent
		Conformance: SHALL contain exactly one [1..1] serviceEvent (CONF:1198-28711)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_code_2_24_13_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_code_2_24_13_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_code_2_24_13_i_a-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent
			UML root path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.a code
		Conformance: SHOULD contain zero or one [0..1] code (CONF:1198-28712)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ServiceEvent -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_performer_2_24_13_i_b-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_performer_2_24_13_i_b-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_performer_2_24_13_i_b-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent
			UML root path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">
		<!--
			OCL: self.performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::DocumentationOf::ServiceEvent::Performer))->size() >= 0
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer
		-->
	<assert test="count(cda:performer) &gt;= 0">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.b performer
		Conformance: SHOULD contain zero or more [0..*] performer (CONF:1198-28713)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_assignedEntity_2_24_13_i_b_2-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_assignedEntity_2_24_13_i_b_2-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_assignedEntity_2_24_13_i_b_2-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(consol::USRealmHeaderPatientGeneratedDocument::DocumentationOf::ServiceEvent::Performer::AssignedEntity))
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity
		-->
	<assert test="count(cda:assignedEntity)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.b.2 assignedEntity
		Conformance: SHALL contain exactly one [1..1] assignedEntity (CONF:1198-28715)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Performer -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_functionCode_2_24_13_i_b_1-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_functionCode_2_24_13_i_b_1-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_functionCode_2_24_13_i_b_1-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer
			UML root path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.b.1 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode, which SHALL be selected from ValueSet ParticipationType 2.16.840.1.113883.1.11.10901 STATIC (CONF:1198-28714)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.functionCode.oclIsUndefined()) and self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.90' and not value.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode
		-->
	<assert test="not(cda:functionCode and not(cda:functionCode/@nullFlavor)) or cda:functionCode and cda:functionCode[@codeSystem = '2.16.840.1.113883.5.90' and @code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.b.1 functionCode
		Conformance: MAY contain zero or one [0..1] functionCode, which SHALL be selected from ValueSet ParticipationType 2.16.840.1.113883.1.11.10901 STATIC (CONF:1198-28714)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_13_i_b_2_ii-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_13_i_b_2_ii-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_13_i_b_2_ii-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.b.2.ii code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28718)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code and cda:code[@codeSystem = '2.16.840.1.113883.5.111' and @code]">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.b.2.ii code
		Conformance: MAY contain zero or one [0..1] code, which SHOULD be selected from ValueSet Personal And Legal Relationship Role Type 2.16.840.1.113883.11.20.12.1 DYNAMIC (CONF:1198-28718)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- AssignedEntity -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_13_i_b_2_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_13_i_b_2_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_13_i_b_2_i-error_mdht">
		<!--
			UML path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer/assignedEntity
			UML root path: /USRealmHeaderPatientGeneratedDocument/documentationOf/serviceEvent/performer/assignedEntity
		-->
	<rule context="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.13.i.b.2.i id
		Conformance: SHALL contain at least one [1..*] id (CONF:1198-28716)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ComponentOf -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_2_ComponentOf_encompassingEncounter_2_24_14_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_2_ComponentOf_encompassingEncounter_2_24_14_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_2_ComponentOf_encompassingEncounter_2_24_14_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf
			UML root path: /USRealmHeader2/componentOf
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf">
		<!--
			OCL: self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(consol::USRealmHeader2::ComponentOf::EncompassingEncounter))
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounter
		-->
	<assert test="count(cda:encompassingEncounter)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.14.i encompassingEncounter
		Conformance: SHALL contain exactly one [1..1] encompassingEncounter (CONF:1198-9956)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_id_2_24_14_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_id_2_24_14_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_id_2_24_14_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.id->isEmpty()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterId
		-->
	<assert test="cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.14.i.a id
		Conformance: SHALL contain at least one [1..*] id (CONF:9959, R2.1=CONF:1198-9959)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- EncompassingEncounter -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_effectiveTime_2_24_14_i_b-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_effectiveTime_2_24_14_i_b-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_effectiveTime_2_24_14_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/componentOf/encompassingEncounter
			UML root path: /USRealmHeader2/componentOf/encompassingEncounter
		-->
	<rule context="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">
		<!--
			OCL: not self.effectiveTime.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime
		-->
	<assert test="cda:effectiveTime">Error: US Realm Header - Patient Generated Document (V2) - 2.24.14.i.b effectiveTime
		Conformance: SHALL contain exactly one [1..1] effectiveTime (CONF:9958, R2.1=CONF:1198-9958)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: (not self.associatedEntity.associatedPerson.oclIsUndefined()) or (not self.associatedEntity.scopingOrganization.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization
		-->
	<assert test="cda:associatedEntity/cda:associatedPerson or cda:associatedEntity/cda:scopingOrganization">Error: US Realm Header - Patient Generated Document (V2) - 2.6.21 ParticipantSupport
		Conformance: MAY contain zero or more [0..*] participant (CONF:10003)
		Analysis: SHALL contain associatedEntity/associatedPerson AND/OR associatedEntity/scopingOrganization
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- ParticipantSupport -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_time_2_24_15_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_time_2_24_15_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_time_2_24_15_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/supportParticipant
			UML root path: /USRealmHeader2/supportParticipant
		-->
	<rule context="/cda:ClinicalDocument/cda:participant">
		<!--
			OCL: ((not self.time.oclIsUndefined()) and self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsParticipantSupportTime
		-->
	<assert test="not(cda:time and not(cda:time/@nullFlavor)) or cda:time">Error: US Realm Header - Patient Generated Document (V2) - 2.24.15.i time
		Conformance: MAY contain zero or one [0..1] time (CONF:10004, R2.1=CONF:1198-10004)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Authorization -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authorization_consent_2_24_17_i-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authorization_consent_2_24_17_i-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authorization_consent_2_24_17_i-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization
			UML root path: /USRealmHeader2/authorization
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization">
		<!--
			OCL: self.consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(consol::GeneralHeaderConstraints::Authorization::Consent))
			Constraint name: GeneralHeaderConstraintsAuthorizationConsent
		-->
	<assert test="count(cda:consent)=1">Error: US Realm Header - Patient Generated Document (V2) - 2.24.17.i consent
		Conformance: SHALL contain exactly one [1..1] consent (CONF:16793, R2.1=CONF:1198-16793)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_statusCode_2_24_17_i_c-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_statusCode_2_24_17_i_c-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_statusCode_2_24_17_i_c-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: not self.statusCode.oclIsUndefined()
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCodeP
		-->
	<assert test="cda:statusCode">Error: US Realm Header - Patient Generated Document (V2) - 2.24.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
		<!--
			OCL: not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
value.code = 'completed'
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentStatusCode
		-->
	<assert test="cda:statusCode and cda:statusCode[@code = 'completed']">Error: US Realm Header - Patient Generated Document (V2) - 2.24.17.i.c statusCode
		Conformance: SHALL contain exactly one [1..1] statusCode (CONF:16797, R2.1=CONF:1198-16797)/@code=&quot;completed&quot; Completed (CodeSystem: 2.16.840.1.113883.5.6 HL7ActClass) (CONF:16798, R2.1=CONF:1198-16798)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_code_2_24_17_i_b-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_code_2_24_17_i_b-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_code_2_24_17_i_b-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.code.oclIsUndefined()) and self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentCode
		-->
	<assert test="not(cda:code and not(cda:code/@nullFlavor)) or cda:code">Error: US Realm Header - Patient Generated Document (V2) - 2.24.17.i.b code
		Conformance: MAY contain zero or one [0..1] code (CONF:16795, R2.1=CONF:1198-16795)
		Analysis: n/a
		Validation message: n/a	</assert>
	</rule>
</pattern>

<!-- Consent -->

<pattern id="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_id_2_24_17_i_a-error_mdht" see="#p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_id_2_24_17_i_a-error_mdht" name="p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_id_2_24_17_i_a-error_mdht">
		<!--
			UML path: /USRealmHeader2/authorization/consent
			UML root path: /USRealmHeader2/authorization/consent
		-->
	<rule context="/cda:ClinicalDocument/cda:authorization/cda:consent">
		<!--
			OCL: ((not self.id->isEmpty()) and self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
			Constraint name: GeneralHeaderConstraintsAuthorizationConsentId
		-->
	<assert test="not(cda:id and cda:id[not(@nullFlavor)]) or cda:id">Error: US Realm Header - Patient Generated Document (V2) - 2.24.17.i.a id
		Conformance: MAY contain zero or more [0..*] id (CONF:16794, R2.1=CONF:1198-16794)
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
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:guardian</assert>
	<assert test="/cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication">Cannot find context /cda:ClinicalDocument/cda:recordTarget/cda:patientRole/cda:patient/cda:languageCommunication</assert>
	<assert test="/cda:ClinicalDocument/cda:author">Cannot find context /cda:ClinicalDocument/cda:author</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:code">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:code</assert>
	<assert test="/cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:code">Cannot find context /cda:ClinicalDocument/cda:author/cda:assignedAuthor/cda:code</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer">Cannot find context /cda:ClinicalDocument/cda:dataEnterer</assert>
	<assert test="/cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:dataEnterer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:informant">Cannot find context /cda:ClinicalDocument/cda:informant</assert>
	<assert test="/cda:ClinicalDocument/cda:informant">Cannot find context /cda:ClinicalDocument/cda:informant</assert>
	<assert test="/cda:ClinicalDocument/cda:informant/cda:relatedEntity">Cannot find context /cda:ClinicalDocument/cda:informant/cda:relatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian">Cannot find context /cda:ClinicalDocument/cda:custodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian</assert>
	<assert test="/cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization">Cannot find context /cda:ClinicalDocument/cda:custodian/cda:assignedCustodian/cda:representedCustodianOrganization</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient</assert>
	<assert test="/cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:id">Cannot find context /cda:ClinicalDocument/cda:informationRecipient/cda:intendedRecipient/cda:id</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:code">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:code</assert>
	<assert test="/cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:code">Cannot find context /cda:ClinicalDocument/cda:legalAuthenticator/cda:assignedEntity/cda:code</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator">Cannot find context /cda:ClinicalDocument/cda:authenticator</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:authenticator/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:authenticator/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant/cda:associatedEntity">Cannot find context /cda:ClinicalDocument/cda:participant/cda:associatedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:inFulfillmentOf/cda:order">Cannot find context /cda:ClinicalDocument/cda:inFulfillmentOf/cda:order</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf">Cannot find context /cda:ClinicalDocument/cda:documentationOf</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity">Cannot find context /cda:ClinicalDocument/cda:documentationOf/cda:serviceEvent/cda:performer/cda:assignedEntity</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf">Cannot find context /cda:ClinicalDocument/cda:componentOf</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter">Cannot find context /cda:ClinicalDocument/cda:componentOf/cda:encompassingEncounter</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:participant">Cannot find context /cda:ClinicalDocument/cda:participant</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization">Cannot find context /cda:ClinicalDocument/cda:authorization</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	<assert test="/cda:ClinicalDocument/cda:authorization/cda:consent">Cannot find context /cda:ClinicalDocument/cda:authorization/cda:consent</assert>
	</rule>
</pattern>

<phase id = "errors">

	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authenticator_2_24_10-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_supportParticipant_2_24_15-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_recordTarget_2_24_3-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_2_USRealmHeader-PatientGeneratedDocumentV2_componentOf_2_24_14-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_setId_2_24_10-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_inFulfillmentOf_2_24_12-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_documentationOf_2_24_13-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_code_2_24_5-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_legalAuthenticator_2_24_9-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_typeId_2_24_3-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_confidentialityCode_2_24_8-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_languageCode_2_24_9-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_custodian_2_24_7-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_participant_2_24_11-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_title_2_24_4-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informationRecipient_2_24_8-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_dataEnterer_2_24_5-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_id_2_24_4-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_author_2_24_4-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_authorization_2_24_17-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_templateId_2_24_1-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_effectiveTime_2_24_7-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_realmCode_2_24_3-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_informant_2_24_6-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_USRealmHeader-PatientGeneratedDocumentV2_versionNumber_2_24_11-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_RecordTarget_patientRole_2_24_3_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_providerOrganization_2_24_3_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_patient_2_24_3_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_PatientRole_id_2_24_3_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_LanguageCommunication_2_24_3_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_languageCommunication_2_24_3_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Patient_guardian_2_24_3_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_code_2_24_3_i_b_1_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Guardian_id_2_24_3_i_b_1_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_LanguageCommunication_preferenceInd_2_24_3_i_b_2_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Author_assignedAuthor_2_24_4_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_id_2_24_4_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedAuthor_code_2_24_4_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_4_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology_2_24_4_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_DataEnterer_assignedEntity_2_24_5_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_5_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_relatedEntity_2_24_6_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Informant_USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity_2_24_6_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_RelatedEntity_code_2_24_6_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Custodian_assignedCustodian_2_24_7_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedCustodian_representedCustodianOrganization_2_24_7_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_RepresentedCustodianOrganization_id_2_24_7_i_a_1-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_InformationRecipient_intendedRecipient_2_24_8_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_IntendedRecipient_id_2_24_8_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_II_root_2_24_8_i_a_1-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_LegalAuthenticator_assignedEntity_2_24_9_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_9_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_9_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_code_2_24_9_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_CE_USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology_2_24_9_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authenticator_assignedEntity_2_24_10_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_10_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_10_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_typeCode_2_24_11_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Participant_associatedEntity_2_24_11_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssociatedEntity_code_2_24_11_ii_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_InFulfillmentOf_order_2_24_12_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Order_id_2_24_12_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_DocumentationOf_serviceEvent_2_24_13_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_code_2_24_13_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_ServiceEvent_performer_2_24_13_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_assignedEntity_2_24_13_i_b_2-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Performer_functionCode_2_24_13_i_b_1-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_code_2_24_13_i_b_2_ii-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_AssignedEntity_id_2_24_13_i_b_2_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_2_ComponentOf_encompassingEncounter_2_24_14_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_id_2_24_14_i_a-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_2_EncompassingEncounter_effectiveTime_2_24_14_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_ParticipantSupport_2_6_21-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_ParticipantSupport_time_2_24_15_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Authorization_consent_2_24_17_i-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_statusCode_2_24_17_i_c-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_code_2_24_17_i_b-error_mdht"/>
	<active pattern = "p-USRealmHeader-PatientGeneratedDocumentV2_1A_Consent_id_2_24_17_i_a-error_mdht"/>

</phase>


<phase id = "contexts">

	<active pattern = "allcontexts_mdht"/>

</phase>


</schema>
